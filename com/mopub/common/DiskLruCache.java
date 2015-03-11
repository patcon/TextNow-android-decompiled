package com.mopub.common;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DiskLruCache
  implements Closeable
{
  static final long ANY_SEQUENCE_NUMBER = -1L;
  private static final String CLEAN = "CLEAN";
  private static final String DIRTY = "DIRTY";
  static final String JOURNAL_FILE = "journal";
  static final String JOURNAL_FILE_BACKUP = "journal.bkp";
  static final String JOURNAL_FILE_TEMP = "journal.tmp";
  static final Pattern LEGAL_KEY_PATTERN = Pattern.compile("[a-z0-9_-]{1,64}");
  static final String MAGIC = "libcore.io.DiskLruCache";
  private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream()
  {
    public final void write(int paramAnonymousInt)
    {
    }
  };
  private static final String READ = "READ";
  private static final String REMOVE = "REMOVE";
  static final String VERSION_1 = "1";
  private final int appVersion;
  private final Callable<Void> cleanupCallable = new Callable()
  {
    public Void call()
    {
      synchronized (DiskLruCache.this)
      {
        if (DiskLruCache.this.journalWriter == null)
          return null;
        DiskLruCache.this.trimToSize();
        if (DiskLruCache.this.journalRebuildRequired())
        {
          DiskLruCache.this.rebuildJournal();
          DiskLruCache.access$402(DiskLruCache.this, 0);
        }
        return null;
      }
    }
  };
  private final File directory;
  final ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final File journalFile;
  private final File journalFileBackup;
  private final File journalFileTmp;
  private Writer journalWriter;
  private final LinkedHashMap<String, DiskLruCache.Entry> lruEntries = new LinkedHashMap(0, 0.75F, true);
  private long maxSize;
  private long nextSequenceNumber = 0L;
  private int redundantOpCount;
  private long size = 0L;
  private final int valueCount;

  private DiskLruCache(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    this.directory = paramFile;
    this.appVersion = paramInt1;
    this.journalFile = new File(paramFile, "journal");
    this.journalFileTmp = new File(paramFile, "journal.tmp");
    this.journalFileBackup = new File(paramFile, "journal.bkp");
    this.valueCount = paramInt2;
    this.maxSize = paramLong;
  }

  private void checkNotClosed()
  {
    if (this.journalWriter == null)
      throw new IllegalStateException("cache is closed");
  }

  private void completeEdit(DiskLruCache.Editor paramEditor, boolean paramBoolean)
  {
    DiskLruCache.Entry localEntry;
    try
    {
      localEntry = DiskLruCache.Editor.access$1400(paramEditor);
      if (DiskLruCache.Entry.access$700(localEntry) != paramEditor)
        throw new IllegalStateException();
    }
    finally
    {
    }
    int i = 0;
    if (paramBoolean)
    {
      boolean bool = DiskLruCache.Entry.access$600(localEntry);
      i = 0;
      if (!bool)
        for (int j = 0; ; j++)
        {
          int k = this.valueCount;
          i = 0;
          if (j >= k)
            break;
          if (DiskLruCache.Editor.access$1500(paramEditor)[j] == 0)
          {
            paramEditor.abort();
            throw new IllegalStateException("Newly created entry didn't create value for index " + j);
          }
          if (!localEntry.getDirtyFile(j).exists())
          {
            paramEditor.abort();
            return;
          }
        }
    }
    while (true)
    {
      if (i < this.valueCount)
      {
        File localFile1 = localEntry.getDirtyFile(i);
        if (paramBoolean)
        {
          if (localFile1.exists())
          {
            File localFile2 = localEntry.getCleanFile(i);
            localFile1.renameTo(localFile2);
            long l2 = DiskLruCache.Entry.access$1000(localEntry)[i];
            long l3 = localFile2.length();
            DiskLruCache.Entry.access$1000(localEntry)[i] = l3;
            this.size = (l3 + (this.size - l2));
          }
        }
        else
          deleteIfExists(localFile1);
      }
      else
      {
        this.redundantOpCount = (1 + this.redundantOpCount);
        DiskLruCache.Entry.access$702(localEntry, null);
        if ((paramBoolean | DiskLruCache.Entry.access$600(localEntry)))
        {
          DiskLruCache.Entry.access$602(localEntry, true);
          this.journalWriter.write("CLEAN " + DiskLruCache.Entry.access$1100(localEntry) + localEntry.getLengths() + '\n');
          if (paramBoolean)
          {
            long l1 = this.nextSequenceNumber;
            this.nextSequenceNumber = (1L + l1);
            DiskLruCache.Entry.access$1202(localEntry, l1);
          }
        }
        while (true)
        {
          this.journalWriter.flush();
          if ((this.size <= this.maxSize) && (!journalRebuildRequired()))
            break;
          this.executorService.submit(this.cleanupCallable);
          break;
          this.lruEntries.remove(DiskLruCache.Entry.access$1100(localEntry));
          this.journalWriter.write("REMOVE " + DiskLruCache.Entry.access$1100(localEntry) + '\n');
        }
      }
      i++;
    }
  }

  private static void deleteIfExists(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete()))
      throw new IOException();
  }

  private DiskLruCache.Editor edit(String paramString, long paramLong)
  {
    while (true)
    {
      DiskLruCache.Entry localEntry1;
      DiskLruCache.Editor localEditor2;
      DiskLruCache.Entry localEntry2;
      try
      {
        checkNotClosed();
        validateKey(paramString);
        localEntry1 = (DiskLruCache.Entry)this.lruEntries.get(paramString);
        if (paramLong != -1L)
          if (localEntry1 != null)
          {
            long l = DiskLruCache.Entry.access$1200(localEntry1);
            if (l == paramLong);
          }
          else
          {
            localEditor2 = null;
            return localEditor2;
          }
        if (localEntry1 == null)
        {
          DiskLruCache.Entry localEntry3 = new DiskLruCache.Entry(this, paramString, null);
          this.lruEntries.put(paramString, localEntry3);
          localEntry2 = localEntry3;
          localEditor2 = new DiskLruCache.Editor(this, localEntry2, null);
          DiskLruCache.Entry.access$702(localEntry2, localEditor2);
          this.journalWriter.write("DIRTY " + paramString + '\n');
          this.journalWriter.flush();
          continue;
        }
      }
      finally
      {
      }
      DiskLruCache.Editor localEditor1 = DiskLruCache.Entry.access$700(localEntry1);
      if (localEditor1 != null)
        localEditor2 = null;
      else
        localEntry2 = localEntry1;
    }
  }

  private static String inputStreamToString(InputStream paramInputStream)
  {
    return DiskLruCacheUtil.readFully(new InputStreamReader(paramInputStream, DiskLruCacheUtil.UTF_8));
  }

  private boolean journalRebuildRequired()
  {
    return (this.redundantOpCount >= 2000) && (this.redundantOpCount >= this.lruEntries.size());
  }

  public static DiskLruCache open(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    if (paramLong <= 0L)
      throw new IllegalArgumentException("maxSize <= 0");
    if (paramInt2 <= 0)
      throw new IllegalArgumentException("valueCount <= 0");
    File localFile1 = new File(paramFile, "journal.bkp");
    File localFile2;
    if (localFile1.exists())
    {
      localFile2 = new File(paramFile, "journal");
      if (!localFile2.exists())
        break label150;
      localFile1.delete();
    }
    while (true)
    {
      DiskLruCache localDiskLruCache1 = new DiskLruCache(paramFile, paramInt1, paramInt2, paramLong);
      if (localDiskLruCache1.journalFile.exists())
        try
        {
          localDiskLruCache1.readJournal();
          localDiskLruCache1.processJournal();
          localDiskLruCache1.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(localDiskLruCache1.journalFile, true), DiskLruCacheUtil.US_ASCII));
          return localDiskLruCache1;
          label150: renameTo(localFile1, localFile2, false);
        }
        catch (IOException localIOException)
        {
          System.out.println("DiskLruCache " + paramFile + " is corrupt: " + localIOException.getMessage() + ", removing");
          localDiskLruCache1.delete();
        }
    }
    paramFile.mkdirs();
    DiskLruCache localDiskLruCache2 = new DiskLruCache(paramFile, paramInt1, paramInt2, paramLong);
    localDiskLruCache2.rebuildJournal();
    return localDiskLruCache2;
  }

  private void processJournal()
  {
    deleteIfExists(this.journalFileTmp);
    Iterator localIterator = this.lruEntries.values().iterator();
    while (localIterator.hasNext())
    {
      DiskLruCache.Entry localEntry = (DiskLruCache.Entry)localIterator.next();
      if (DiskLruCache.Entry.access$700(localEntry) == null)
      {
        for (int j = 0; j < this.valueCount; j++)
          this.size += DiskLruCache.Entry.access$1000(localEntry)[j];
      }
      else
      {
        DiskLruCache.Entry.access$702(localEntry, null);
        for (int i = 0; i < this.valueCount; i++)
        {
          deleteIfExists(localEntry.getCleanFile(i));
          deleteIfExists(localEntry.getDirtyFile(i));
        }
        localIterator.remove();
      }
    }
  }

  // ERROR //
  private void readJournal()
  {
    // Byte code:
    //   0: new 437	com/mopub/common/DiskLruCacheStrictLineReader
    //   3: dup
    //   4: new 439	java/io/FileInputStream
    //   7: dup
    //   8: aload_0
    //   9: getfield 129	com/mopub/common/DiskLruCache:journalFile	Ljava/io/File;
    //   12: invokespecial 441	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: getstatic 375	com/mopub/common/DiskLruCacheUtil:US_ASCII	Ljava/nio/charset/Charset;
    //   18: invokespecial 442	com/mopub/common/DiskLruCacheStrictLineReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   21: astore_1
    //   22: aload_1
    //   23: invokevirtual 445	com/mopub/common/DiskLruCacheStrictLineReader:readLine	()Ljava/lang/String;
    //   26: astore_3
    //   27: aload_1
    //   28: invokevirtual 445	com/mopub/common/DiskLruCacheStrictLineReader:readLine	()Ljava/lang/String;
    //   31: astore 4
    //   33: aload_1
    //   34: invokevirtual 445	com/mopub/common/DiskLruCacheStrictLineReader:readLine	()Ljava/lang/String;
    //   37: astore 5
    //   39: aload_1
    //   40: invokevirtual 445	com/mopub/common/DiskLruCacheStrictLineReader:readLine	()Ljava/lang/String;
    //   43: astore 6
    //   45: aload_1
    //   46: invokevirtual 445	com/mopub/common/DiskLruCacheStrictLineReader:readLine	()Ljava/lang/String;
    //   49: astore 7
    //   51: ldc 29
    //   53: aload_3
    //   54: invokevirtual 451	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   57: ifeq +54 -> 111
    //   60: ldc 38
    //   62: aload 4
    //   64: invokevirtual 451	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   67: ifeq +44 -> 111
    //   70: aload_0
    //   71: getfield 122	com/mopub/common/DiskLruCache:appVersion	I
    //   74: invokestatic 456	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   77: aload 5
    //   79: invokevirtual 451	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   82: ifeq +29 -> 111
    //   85: aload_0
    //   86: getfield 135	com/mopub/common/DiskLruCache:valueCount	I
    //   89: invokestatic 456	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   92: aload 6
    //   94: invokevirtual 451	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   97: ifeq +14 -> 111
    //   100: ldc_w 458
    //   103: aload 7
    //   105: invokevirtual 451	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   108: ifne +77 -> 185
    //   111: new 303	java/io/IOException
    //   114: dup
    //   115: new 216	java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial 217	java/lang/StringBuilder:<init>	()V
    //   122: ldc_w 460
    //   125: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: aload_3
    //   129: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: ldc_w 462
    //   135: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: aload 4
    //   140: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: ldc_w 462
    //   146: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: aload 6
    //   151: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: ldc_w 462
    //   157: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: aload 7
    //   162: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: ldc_w 464
    //   168: invokevirtual 223	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokevirtual 230	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: invokespecial 465	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   177: athrow
    //   178: astore_2
    //   179: aload_1
    //   180: invokestatic 469	com/mopub/common/DiskLruCacheUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   183: aload_2
    //   184: athrow
    //   185: iconst_0
    //   186: istore 8
    //   188: aload_0
    //   189: aload_1
    //   190: invokevirtual 445	com/mopub/common/DiskLruCacheStrictLineReader:readLine	()Ljava/lang/String;
    //   193: invokespecial 472	com/mopub/common/DiskLruCache:readJournalLine	(Ljava/lang/String;)V
    //   196: iinc 8 1
    //   199: goto -11 -> 188
    //   202: astore 9
    //   204: aload_0
    //   205: iload 8
    //   207: aload_0
    //   208: getfield 91	com/mopub/common/DiskLruCache:lruEntries	Ljava/util/LinkedHashMap;
    //   211: invokevirtual 346	java/util/LinkedHashMap:size	()I
    //   214: isub
    //   215: putfield 182	com/mopub/common/DiskLruCache:redundantOpCount	I
    //   218: aload_1
    //   219: invokestatic 469	com/mopub/common/DiskLruCacheUtil:closeQuietly	(Ljava/io/Closeable;)V
    //   222: return
    //
    // Exception table:
    //   from	to	target	type
    //   22	111	178	finally
    //   111	178	178	finally
    //   188	196	178	finally
    //   204	218	178	finally
    //   188	196	202	java/io/EOFException
  }

  private void readJournalLine(String paramString)
  {
    int i = paramString.indexOf(' ');
    if (i == -1)
      throw new IOException("unexpected journal line: " + paramString);
    int j = i + 1;
    int k = paramString.indexOf(' ', j);
    String str2;
    if (k == -1)
    {
      str2 = paramString.substring(j);
      if ((i != "REMOVE".length()) || (!paramString.startsWith("REMOVE")))
        break label304;
      this.lruEntries.remove(str2);
    }
    label304: for (String str1 = paramString.substring(j, k); ; str1 = str2)
    {
      DiskLruCache.Entry localEntry = (DiskLruCache.Entry)this.lruEntries.get(str1);
      if (localEntry == null)
      {
        localEntry = new DiskLruCache.Entry(this, str1, null);
        this.lruEntries.put(str1, localEntry);
      }
      if ((k != -1) && (i == "CLEAN".length()) && (paramString.startsWith("CLEAN")))
      {
        String[] arrayOfString = paramString.substring(k + 1).split(" ");
        DiskLruCache.Entry.access$602(localEntry, true);
        DiskLruCache.Entry.access$702(localEntry, null);
        DiskLruCache.Entry.access$800(localEntry, arrayOfString);
        return;
      }
      if ((k == -1) && (i == "DIRTY".length()) && (paramString.startsWith("DIRTY")))
      {
        DiskLruCache.Entry.access$702(localEntry, new DiskLruCache.Editor(this, localEntry, null));
        return;
      }
      if ((k == -1) && (i == "READ".length()) && (paramString.startsWith("READ")))
        break;
      throw new IOException("unexpected journal line: " + paramString);
    }
  }

  private void rebuildJournal()
  {
    BufferedWriter localBufferedWriter;
    while (true)
    {
      DiskLruCache.Entry localEntry;
      try
      {
        if (this.journalWriter != null)
          this.journalWriter.close();
        localBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFileTmp), DiskLruCacheUtil.US_ASCII));
        try
        {
          localBufferedWriter.write("libcore.io.DiskLruCache");
          localBufferedWriter.write("\n");
          localBufferedWriter.write("1");
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.appVersion));
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.valueCount));
          localBufferedWriter.write("\n");
          localBufferedWriter.write("\n");
          Iterator localIterator = this.lruEntries.values().iterator();
          if (!localIterator.hasNext())
            break;
          localEntry = (DiskLruCache.Entry)localIterator.next();
          if (DiskLruCache.Entry.access$700(localEntry) != null)
          {
            localBufferedWriter.write("DIRTY " + DiskLruCache.Entry.access$1100(localEntry) + '\n');
            continue;
          }
        }
        finally
        {
          localBufferedWriter.close();
        }
      }
      finally
      {
      }
      localBufferedWriter.write("CLEAN " + DiskLruCache.Entry.access$1100(localEntry) + localEntry.getLengths() + '\n');
    }
    localBufferedWriter.close();
    if (this.journalFile.exists())
      renameTo(this.journalFile, this.journalFileBackup, true);
    renameTo(this.journalFileTmp, this.journalFile, false);
    this.journalFileBackup.delete();
    this.journalWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.journalFile, true), DiskLruCacheUtil.US_ASCII));
  }

  private static void renameTo(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean)
      deleteIfExists(paramFile2);
    if (!paramFile1.renameTo(paramFile2))
      throw new IOException();
  }

  private void trimToSize()
  {
    while (this.size > this.maxSize)
      remove((String)((Map.Entry)this.lruEntries.entrySet().iterator().next()).getKey());
  }

  private void validateKey(String paramString)
  {
    if (!LEGAL_KEY_PATTERN.matcher(paramString).matches())
      throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + paramString + "\"");
  }

  public final void close()
  {
    while (true)
    {
      try
      {
        Writer localWriter = this.journalWriter;
        if (localWriter == null)
          return;
        Iterator localIterator = new ArrayList(this.lruEntries.values()).iterator();
        if (localIterator.hasNext())
        {
          DiskLruCache.Entry localEntry = (DiskLruCache.Entry)localIterator.next();
          if (DiskLruCache.Entry.access$700(localEntry) == null)
            continue;
          DiskLruCache.Entry.access$700(localEntry).abort();
          continue;
        }
      }
      finally
      {
      }
      trimToSize();
      this.journalWriter.close();
      this.journalWriter = null;
    }
  }

  public final void delete()
  {
    close();
    DiskLruCacheUtil.deleteContents(this.directory);
  }

  public final DiskLruCache.Editor edit(String paramString)
  {
    return edit(paramString, -1L);
  }

  public final void flush()
  {
    try
    {
      checkNotClosed();
      trimToSize();
      this.journalWriter.flush();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final DiskLruCache.Snapshot get(String paramString)
  {
    try
    {
      checkNotClosed();
      validateKey(paramString);
      DiskLruCache.Entry localEntry = (DiskLruCache.Entry)this.lruEntries.get(paramString);
      DiskLruCache.Snapshot localSnapshot = null;
      if (localEntry == null);
      while (true)
      {
        return localSnapshot;
        boolean bool = DiskLruCache.Entry.access$600(localEntry);
        localSnapshot = null;
        if (bool)
        {
          InputStream[] arrayOfInputStream = new InputStream[this.valueCount];
          int i = 0;
          while (true)
          {
            int j;
            int k;
            try
            {
              if (i >= this.valueCount)
                break label144;
              arrayOfInputStream[i] = new FileInputStream(localEntry.getCleanFile(i));
              i++;
              continue;
            }
            catch (FileNotFoundException localFileNotFoundException)
            {
              j = 0;
              k = this.valueCount;
              localSnapshot = null;
            }
            if (j >= k)
              break;
            InputStream localInputStream = arrayOfInputStream[j];
            localSnapshot = null;
            if (localInputStream == null)
              break;
            DiskLruCacheUtil.closeQuietly(arrayOfInputStream[j]);
            j++;
          }
          label144: this.redundantOpCount = (1 + this.redundantOpCount);
          this.journalWriter.append("READ " + paramString + '\n');
          if (journalRebuildRequired())
            this.executorService.submit(this.cleanupCallable);
          localSnapshot = new DiskLruCache.Snapshot(this, paramString, DiskLruCache.Entry.access$1200(localEntry), arrayOfInputStream, DiskLruCache.Entry.access$1000(localEntry), null);
        }
      }
    }
    finally
    {
    }
  }

  public final File getDirectory()
  {
    return this.directory;
  }

  public final long getMaxSize()
  {
    try
    {
      long l = this.maxSize;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean isClosed()
  {
    try
    {
      Writer localWriter = this.journalWriter;
      if (localWriter == null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final boolean remove(String paramString)
  {
    while (true)
    {
      try
      {
        checkNotClosed();
        validateKey(paramString);
        DiskLruCache.Entry localEntry = (DiskLruCache.Entry)this.lruEntries.get(paramString);
        int i;
        if (localEntry != null)
        {
          DiskLruCache.Editor localEditor = DiskLruCache.Entry.access$700(localEntry);
          i = 0;
          if (localEditor == null);
        }
        else
        {
          bool = false;
          return bool;
          this.size -= DiskLruCache.Entry.access$1000(localEntry)[i];
          DiskLruCache.Entry.access$1000(localEntry)[i] = 0L;
          i++;
        }
        if (i < this.valueCount)
        {
          File localFile = localEntry.getCleanFile(i);
          if ((!localFile.exists()) || (localFile.delete()))
            continue;
          throw new IOException("failed to delete " + localFile);
        }
      }
      finally
      {
      }
      this.redundantOpCount = (1 + this.redundantOpCount);
      this.journalWriter.append("REMOVE " + paramString + '\n');
      this.lruEntries.remove(paramString);
      if (journalRebuildRequired())
        this.executorService.submit(this.cleanupCallable);
      boolean bool = true;
    }
  }

  public final void setMaxSize(long paramLong)
  {
    try
    {
      this.maxSize = paramLong;
      this.executorService.submit(this.cleanupCallable);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long size()
  {
    try
    {
      long l = this.size;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.DiskLruCache
 * JD-Core Version:    0.6.2
 */