package textnow.ax;

public class h
  implements Runnable
{
  static final String f = h.class.getName();
  String a = null;
  String b = null;
  String c = null;
  String d = null;
  int e = 10000;
  private m g;

  public h(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, m paramm)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramInt;
    this.g = paramm;
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 49	java/net/Socket
    //   5: dup
    //   6: aload_0
    //   7: getfield 32	textnow/ax/h:a	Ljava/lang/String;
    //   10: sipush 8080
    //   13: invokespecial 52	java/net/Socket:<init>	(Ljava/lang/String;I)V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: getfield 40	textnow/ax/h:e	I
    //   22: invokevirtual 56	java/net/Socket:setSoTimeout	(I)V
    //   25: new 58	java/io/BufferedWriter
    //   28: dup
    //   29: new 60	java/io/PrintWriter
    //   32: dup
    //   33: aload_2
    //   34: invokevirtual 64	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   37: invokespecial 67	java/io/PrintWriter:<init>	(Ljava/io/OutputStream;)V
    //   40: invokespecial 70	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   43: astore 9
    //   45: new 72	java/io/BufferedReader
    //   48: dup
    //   49: new 74	java/io/InputStreamReader
    //   52: dup
    //   53: aload_2
    //   54: invokevirtual 78	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   57: invokespecial 81	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   60: invokespecial 84	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   63: astore 10
    //   65: aload 9
    //   67: new 86	java/lang/StringBuilder
    //   70: dup
    //   71: ldc 88
    //   73: invokespecial 91	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   76: aload_0
    //   77: getfield 36	textnow/ax/h:c	Ljava/lang/String;
    //   80: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: ldc 97
    //   85: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_0
    //   89: getfield 34	textnow/ax/h:b	Ljava/lang/String;
    //   92: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: ldc 99
    //   97: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: getfield 38	textnow/ax/h:d	Ljava/lang/String;
    //   104: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: ldc 101
    //   109: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokevirtual 107	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   118: aload 9
    //   120: invokevirtual 110	java/io/BufferedWriter:flush	()V
    //   123: aload 10
    //   125: invokevirtual 114	java/io/BufferedReader:read	()I
    //   128: iconst_m1
    //   129: if_icmpeq +41 -> 170
    //   132: iconst_1
    //   133: newarray char
    //   135: dup
    //   136: iconst_0
    //   137: iconst_0
    //   138: castore
    //   139: astore 11
    //   141: iconst_0
    //   142: istore 12
    //   144: iload 12
    //   146: bipush 15
    //   148: if_icmpge +16 -> 164
    //   151: aload 9
    //   153: aload 11
    //   155: invokevirtual 117	java/io/BufferedWriter:write	([C)V
    //   158: iinc 12 1
    //   161: goto -17 -> 144
    //   164: aload 10
    //   166: invokevirtual 114	java/io/BufferedReader:read	()I
    //   169: pop
    //   170: aload_2
    //   171: ifnull +7 -> 178
    //   174: aload_2
    //   175: invokevirtual 120	java/net/Socket:close	()V
    //   178: return
    //   179: astore 15
    //   181: aconst_null
    //   182: astore_2
    //   183: aload_0
    //   184: getfield 42	textnow/ax/h:g	Ltextnow/ax/m;
    //   187: ifnull +10 -> 197
    //   190: aload_0
    //   191: getfield 42	textnow/ax/h:g	Ltextnow/ax/m;
    //   194: invokevirtual 124	textnow/ax/m:d	()V
    //   197: aload_2
    //   198: ifnull -20 -> 178
    //   201: aload_2
    //   202: invokevirtual 120	java/net/Socket:close	()V
    //   205: return
    //   206: astore 4
    //   208: return
    //   209: astore 7
    //   211: aload_1
    //   212: ifnull +7 -> 219
    //   215: aload_1
    //   216: invokevirtual 120	java/net/Socket:close	()V
    //   219: aload 7
    //   221: athrow
    //   222: astore 14
    //   224: aconst_null
    //   225: astore_2
    //   226: aload_2
    //   227: ifnull -49 -> 178
    //   230: aload_2
    //   231: invokevirtual 120	java/net/Socket:close	()V
    //   234: return
    //   235: astore 8
    //   237: goto -18 -> 219
    //   240: astore 6
    //   242: aload_2
    //   243: astore_1
    //   244: aload 6
    //   246: astore 7
    //   248: goto -37 -> 211
    //   251: astore 5
    //   253: goto -70 -> 183
    //   256: astore_3
    //   257: goto -31 -> 226
    //
    // Exception table:
    //   from	to	target	type
    //   2	17	179	java/io/IOException
    //   174	178	206	java/io/IOException
    //   201	205	206	java/io/IOException
    //   230	234	206	java/io/IOException
    //   2	17	209	finally
    //   2	17	222	java/net/UnknownHostException
    //   215	219	235	java/io/IOException
    //   17	141	240	finally
    //   151	158	240	finally
    //   164	170	240	finally
    //   183	197	240	finally
    //   17	141	251	java/io/IOException
    //   151	158	251	java/io/IOException
    //   164	170	251	java/io/IOException
    //   17	141	256	java/net/UnknownHostException
    //   151	158	256	java/net/UnknownHostException
    //   164	170	256	java/net/UnknownHostException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ax.h
 * JD-Core Version:    0.6.2
 */