package com.facebook.internal;

import java.io.File;

final class FileLruCache$ModifiedFile
  implements Comparable<ModifiedFile>
{
  private static final int HASH_MULTIPLIER = 37;
  private static final int HASH_SEED = 29;
  private final File file;
  private final long modified;

  FileLruCache$ModifiedFile(File paramFile)
  {
    this.file = paramFile;
    this.modified = paramFile.lastModified();
  }

  public final int compareTo(ModifiedFile paramModifiedFile)
  {
    if (getModified() < paramModifiedFile.getModified())
      return -1;
    if (getModified() > paramModifiedFile.getModified())
      return 1;
    return getFile().compareTo(paramModifiedFile.getFile());
  }

  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ModifiedFile)) && (compareTo((ModifiedFile)paramObject) == 0);
  }

  final File getFile()
  {
    return this.file;
  }

  final long getModified()
  {
    return this.modified;
  }

  public final int hashCode()
  {
    return 37 * (1073 + this.file.hashCode()) + (int)(this.modified % 2147483647L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FileLruCache.ModifiedFile
 * JD-Core Version:    0.6.2
 */