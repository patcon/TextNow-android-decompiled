package com.flurry.sdk;

import android.content.Context;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class dg
{
  static final Integer a = Integer.valueOf(50);
  private static final String d = dg.class.getSimpleName();
  String b;
  LinkedHashMap<String, List<String>> c;

  public dg(String paramString)
  {
    a(paramString);
  }

  private boolean a(File paramFile)
  {
    boolean bool1 = false;
    if (paramFile != null);
    try
    {
      boolean bool2 = paramFile.exists();
      bool1 = false;
      if (bool2)
      {
        eo.a(4, d, "Trying to delete persistence file : " + paramFile.getAbsolutePath());
        bool1 = paramFile.delete();
        if (!bool1)
          break label72;
        eo.a(4, d, "Deleted persistence file");
      }
      while (true)
      {
        return bool1;
        label72: eo.a(6, d, "Cannot delete persistence file");
      }
    }
    finally
    {
    }
  }

  // ERROR //
  private boolean a(String paramString, List<String> paramList)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: invokestatic 79	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   7: invokestatic 82	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   10: if_acmpne +13 -> 23
    //   13: bipush 6
    //   15: getstatic 22	com/flurry/sdk/dg:d	Ljava/lang/String;
    //   18: ldc 84
    //   20: invokestatic 63	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   23: invokestatic 89	com/flurry/sdk/do:a	()Lcom/flurry/sdk/do;
    //   26: invokevirtual 92	com/flurry/sdk/do:b	()Landroid/content/Context;
    //   29: new 45	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   36: ldc 94
    //   38: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_1
    //   42: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokevirtual 100	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   51: astore 5
    //   53: aload 5
    //   55: invokestatic 104	com/flurry/sdk/fd:a	(Ljava/io/File;)Z
    //   58: istore 10
    //   60: iload 10
    //   62: ifne +11 -> 73
    //   65: aconst_null
    //   66: invokestatic 109	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   69: aload_0
    //   70: monitorexit
    //   71: iload_3
    //   72: ireturn
    //   73: new 111	java/io/DataOutputStream
    //   76: dup
    //   77: new 113	java/io/FileOutputStream
    //   80: dup
    //   81: aload 5
    //   83: invokespecial 116	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   86: invokespecial 119	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   89: astore 7
    //   91: aload 7
    //   93: aload_2
    //   94: invokeinterface 125 1 0
    //   99: invokevirtual 129	java/io/DataOutputStream:writeShort	(I)V
    //   102: iconst_0
    //   103: istore 11
    //   105: iload 11
    //   107: aload_2
    //   108: invokeinterface 125 1 0
    //   113: if_icmpge +81 -> 194
    //   116: aload_2
    //   117: iload 11
    //   119: invokeinterface 133 2 0
    //   124: checkcast 135	java/lang/String
    //   127: invokevirtual 139	java/lang/String:getBytes	()[B
    //   130: astore 12
    //   132: aload 12
    //   134: arraylength
    //   135: istore 13
    //   137: iconst_4
    //   138: getstatic 22	com/flurry/sdk/dg:d	Ljava/lang/String;
    //   141: new 45	java/lang/StringBuilder
    //   144: dup
    //   145: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   148: ldc 141
    //   150: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: iload 11
    //   155: invokevirtual 144	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   158: ldc 146
    //   160: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: iload 13
    //   165: invokevirtual 144	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   168: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 63	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   174: aload 7
    //   176: iload 13
    //   178: invokevirtual 129	java/io/DataOutputStream:writeShort	(I)V
    //   181: aload 7
    //   183: aload 12
    //   185: invokevirtual 150	java/io/DataOutputStream:write	([B)V
    //   188: iinc 11 1
    //   191: goto -86 -> 105
    //   194: aload 7
    //   196: iconst_0
    //   197: invokevirtual 129	java/io/DataOutputStream:writeShort	(I)V
    //   200: iconst_1
    //   201: istore 9
    //   203: aload 7
    //   205: invokestatic 109	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   208: iload 9
    //   210: istore_3
    //   211: goto -142 -> 69
    //   214: astore 8
    //   216: aconst_null
    //   217: astore 7
    //   219: bipush 6
    //   221: getstatic 22	com/flurry/sdk/dg:d	Ljava/lang/String;
    //   224: ldc 152
    //   226: aload 8
    //   228: invokestatic 155	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   231: aload 7
    //   233: invokestatic 109	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   236: iconst_0
    //   237: istore 9
    //   239: goto -31 -> 208
    //   242: aload 7
    //   244: invokestatic 109	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   247: aload 6
    //   249: athrow
    //   250: astore 4
    //   252: aload_0
    //   253: monitorexit
    //   254: aload 4
    //   256: athrow
    //   257: astore 6
    //   259: goto -17 -> 242
    //   262: astore 8
    //   264: goto -45 -> 219
    //   267: astore 6
    //   269: aconst_null
    //   270: astore 7
    //   272: goto -30 -> 242
    //
    // Exception table:
    //   from	to	target	type
    //   53	60	214	java/lang/Throwable
    //   73	91	214	java/lang/Throwable
    //   4	23	250	finally
    //   23	53	250	finally
    //   65	69	250	finally
    //   203	208	250	finally
    //   231	236	250	finally
    //   242	250	250	finally
    //   91	102	257	finally
    //   105	188	257	finally
    //   194	200	257	finally
    //   219	231	257	finally
    //   91	102	262	java/lang/Throwable
    //   105	188	262	java/lang/Throwable
    //   194	200	262	java/lang/Throwable
    //   53	60	267	finally
    //   73	91	267	finally
  }

  private void c()
  {
    try
    {
      LinkedList localLinkedList = new LinkedList(this.c.keySet());
      b();
      if (!localLinkedList.isEmpty())
        a(this.b, localLinkedList);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  private List<String> e(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: invokestatic 79	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   7: invokestatic 82	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   10: if_acmpne +13 -> 23
    //   13: bipush 6
    //   15: getstatic 22	com/flurry/sdk/dg:d	Ljava/lang/String;
    //   18: ldc 181
    //   20: invokestatic 63	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   23: invokestatic 89	com/flurry/sdk/do:a	()Lcom/flurry/sdk/do;
    //   26: invokevirtual 92	com/flurry/sdk/do:b	()Landroid/content/Context;
    //   29: new 45	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   36: ldc 94
    //   38: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_1
    //   42: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokevirtual 100	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   51: astore 4
    //   53: aload 4
    //   55: invokevirtual 43	java/io/File:exists	()Z
    //   58: istore 5
    //   60: iload 5
    //   62: ifeq +210 -> 272
    //   65: new 183	java/io/DataInputStream
    //   68: dup
    //   69: new 185	java/io/FileInputStream
    //   72: dup
    //   73: aload 4
    //   75: invokespecial 186	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   78: invokespecial 189	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   81: astore 7
    //   83: aload 7
    //   85: invokevirtual 192	java/io/DataInputStream:readUnsignedShort	()I
    //   88: istore 11
    //   90: iload 11
    //   92: ifne +12 -> 104
    //   95: aload 7
    //   97: invokestatic 109	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   100: aload_0
    //   101: monitorexit
    //   102: aload_2
    //   103: areturn
    //   104: new 194	java/util/ArrayList
    //   107: dup
    //   108: iload 11
    //   110: invokespecial 196	java/util/ArrayList:<init>	(I)V
    //   113: astore 6
    //   115: iconst_0
    //   116: istore 12
    //   118: iload 12
    //   120: iload 11
    //   122: if_icmpge +83 -> 205
    //   125: aload 7
    //   127: invokevirtual 192	java/io/DataInputStream:readUnsignedShort	()I
    //   130: istore 14
    //   132: iconst_4
    //   133: getstatic 22	com/flurry/sdk/dg:d	Ljava/lang/String;
    //   136: new 45	java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   143: ldc 198
    //   145: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: iload 12
    //   150: invokevirtual 144	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   153: ldc 146
    //   155: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: iload 14
    //   160: invokevirtual 144	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   163: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: invokestatic 63	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   169: iload 14
    //   171: newarray byte
    //   173: astore 15
    //   175: aload 7
    //   177: aload 15
    //   179: invokevirtual 201	java/io/DataInputStream:readFully	([B)V
    //   182: aload 6
    //   184: new 135	java/lang/String
    //   187: dup
    //   188: aload 15
    //   190: invokespecial 203	java/lang/String:<init>	([B)V
    //   193: invokeinterface 207 2 0
    //   198: pop
    //   199: iinc 12 1
    //   202: goto -84 -> 118
    //   205: aload 7
    //   207: invokevirtual 192	java/io/DataInputStream:readUnsignedShort	()I
    //   210: pop
    //   211: aload 7
    //   213: invokestatic 109	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   216: aload 6
    //   218: astore_2
    //   219: goto -119 -> 100
    //   222: astore 17
    //   224: aconst_null
    //   225: astore 7
    //   227: aconst_null
    //   228: astore 6
    //   230: aload 17
    //   232: astore 9
    //   234: bipush 6
    //   236: getstatic 22	com/flurry/sdk/dg:d	Ljava/lang/String;
    //   239: ldc 209
    //   241: aload 9
    //   243: invokestatic 155	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   246: aload 7
    //   248: invokestatic 109	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   251: goto -35 -> 216
    //   254: astore_3
    //   255: aload_0
    //   256: monitorexit
    //   257: aload_3
    //   258: athrow
    //   259: astore 10
    //   261: aconst_null
    //   262: astore 7
    //   264: aload 7
    //   266: invokestatic 109	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   269: aload 10
    //   271: athrow
    //   272: iconst_5
    //   273: getstatic 22	com/flurry/sdk/dg:d	Ljava/lang/String;
    //   276: ldc 211
    //   278: invokestatic 63	com/flurry/sdk/eo:a	(ILjava/lang/String;Ljava/lang/String;)V
    //   281: aconst_null
    //   282: astore 6
    //   284: goto -68 -> 216
    //   287: astore 10
    //   289: goto -25 -> 264
    //   292: astore 8
    //   294: aload 8
    //   296: astore 9
    //   298: aconst_null
    //   299: astore 6
    //   301: goto -67 -> 234
    //   304: astore 9
    //   306: goto -72 -> 234
    //
    // Exception table:
    //   from	to	target	type
    //   65	83	222	java/lang/Throwable
    //   4	23	254	finally
    //   23	60	254	finally
    //   95	100	254	finally
    //   211	216	254	finally
    //   246	251	254	finally
    //   264	272	254	finally
    //   272	281	254	finally
    //   65	83	259	finally
    //   83	90	287	finally
    //   104	115	287	finally
    //   125	199	287	finally
    //   205	211	287	finally
    //   234	246	287	finally
    //   83	90	292	java/lang/Throwable
    //   104	115	292	java/lang/Throwable
    //   125	199	304	java/lang/Throwable
    //   205	211	304	java/lang/Throwable
  }

  public List<String> a()
  {
    return new ArrayList(this.c.keySet());
  }

  public void a(df paramdf, String paramString)
  {
    while (true)
    {
      List localList;
      try
      {
        eo.a(4, d, "addBlockInfo");
        String str = paramdf.a();
        localList = (List)this.c.get(paramString);
        if (localList == null)
        {
          eo.a(4, d, "New Data Key");
          localObject2 = new LinkedList();
          i = 1;
          ((List)localObject2).add(str);
          if (((List)localObject2).size() > a.intValue())
          {
            b((String)((List)localObject2).get(0));
            ((List)localObject2).remove(0);
          }
          this.c.put(paramString, localObject2);
          a(paramString, (List)localObject2);
          if (i != 0)
            c();
          return;
        }
      }
      finally
      {
      }
      Object localObject2 = localList;
      int i = 0;
    }
  }

  void a(String paramString)
  {
    this.c = new LinkedHashMap();
    this.b = (paramString + "Main");
    List localList1 = e(this.b);
    if (localList1 == null);
    while (true)
    {
      return;
      Iterator localIterator = localList1.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        List localList2 = e(str);
        if (localList2 != null)
          this.c.put(str, localList2);
      }
    }
  }

  public boolean a(String paramString1, String paramString2)
  {
    List localList = (List)this.c.get(paramString2);
    boolean bool = false;
    if (localList != null)
    {
      b(paramString1);
      bool = localList.remove(paramString1);
    }
    if ((localList != null) && (!localList.isEmpty()))
    {
      this.c.put(paramString2, localList);
      a(paramString2, localList);
      return bool;
    }
    d(paramString2);
    return bool;
  }

  void b()
  {
    a(do.a().b().getFileStreamPath(".FlurrySenderIndex.info." + this.b));
  }

  boolean b(String paramString)
  {
    return new df(paramString).c();
  }

  public List<String> c(String paramString)
  {
    return (List)this.c.get(paramString);
  }

  public boolean d(String paramString)
  {
    try
    {
      if (Looper.myLooper() == Looper.getMainLooper())
        eo.a(6, d, "discardOutdatedBlocksForDataKey(ID) running on the MAIN thread!");
      File localFile = do.a().b().getFileStreamPath(".FlurrySenderIndex.info." + paramString);
      List localList = c(paramString);
      if (localList != null)
      {
        eo.a(4, d, "discardOutdatedBlocksForDataKey: notSentBlocks = " + localList.size());
        for (int i = 0; i < localList.size(); i++)
        {
          String str = (String)localList.get(i);
          b(str);
          eo.a(4, d, "discardOutdatedBlocksForDataKey: removed block = " + str);
        }
      }
      this.c.remove(paramString);
      boolean bool = a(localFile);
      c();
      return bool;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dg
 * JD-Core Version:    0.6.2
 */