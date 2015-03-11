package textnow.bd;

import java.io.InputStream;

final class ap extends u
{
  public ap(ao paramao, p paramp)
  {
    super(paramp, new bu(paramp.a()));
  }

  // ERROR //
  private String a(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: ifnull +33 -> 36
    //   6: aload_0
    //   7: getfield 10	textnow/bd/ap:b	Ltextnow/bd/ao;
    //   10: invokestatic 37	textnow/bd/ao:c	(Ltextnow/bd/ao;)Ltextnow/bd/bj;
    //   13: aload_0
    //   14: getfield 40	textnow/bd/ap:a	Ltextnow/bd/p;
    //   17: invokevirtual 18	textnow/bd/p:a	()Ljava/lang/String;
    //   20: aload_1
    //   21: invokeinterface 45 3 0
    //   26: aconst_null
    //   27: astore_2
    //   28: aload_1
    //   29: ifnull +7 -> 36
    //   32: aload_1
    //   33: invokevirtual 51	java/io/InputStream:close	()V
    //   36: aload_2
    //   37: areturn
    //   38: astore 12
    //   40: new 53	java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   47: ldc 57
    //   49: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: aload_0
    //   53: getfield 40	textnow/bd/ap:a	Ltextnow/bd/p;
    //   56: invokevirtual 18	textnow/bd/p:a	()Ljava/lang/String;
    //   59: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: ldc 63
    //   64: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload 12
    //   69: invokevirtual 69	java/lang/Object:getClass	()Ljava/lang/Class;
    //   72: invokevirtual 74	java/lang/Class:getName	()Ljava/lang/String;
    //   75: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: ldc 76
    //   80: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: aload 12
    //   85: invokevirtual 79	java/io/IOException:getMessage	()Ljava/lang/String;
    //   88: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: astore 13
    //   96: aload 13
    //   98: astore_2
    //   99: aload_1
    //   100: ifnull -64 -> 36
    //   103: aload_1
    //   104: invokevirtual 51	java/io/InputStream:close	()V
    //   107: aload_2
    //   108: areturn
    //   109: astore 14
    //   111: aload_2
    //   112: areturn
    //   113: astore 9
    //   115: new 53	java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   122: ldc 84
    //   124: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: aload 9
    //   129: invokevirtual 85	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   132: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   138: astore 10
    //   140: aload 10
    //   142: astore_2
    //   143: aload_1
    //   144: ifnull -108 -> 36
    //   147: aload_1
    //   148: invokevirtual 51	java/io/InputStream:close	()V
    //   151: aload_2
    //   152: areturn
    //   153: astore 11
    //   155: aload_2
    //   156: areturn
    //   157: astore 5
    //   159: new 53	java/lang/StringBuilder
    //   162: dup
    //   163: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   166: ldc 87
    //   168: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: aload_0
    //   172: getfield 40	textnow/bd/ap:a	Ltextnow/bd/p;
    //   175: invokevirtual 18	textnow/bd/p:a	()Ljava/lang/String;
    //   178: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: pop
    //   185: aload 5
    //   187: invokevirtual 90	java/lang/IllegalStateException:printStackTrace	()V
    //   190: new 53	java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   197: ldc 92
    //   199: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: aload 5
    //   204: invokevirtual 93	java/lang/IllegalStateException:getMessage	()Ljava/lang/String;
    //   207: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: invokevirtual 82	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: astore 7
    //   215: aload 7
    //   217: astore_2
    //   218: aload_1
    //   219: ifnull -183 -> 36
    //   222: aload_1
    //   223: invokevirtual 51	java/io/InputStream:close	()V
    //   226: aload_2
    //   227: areturn
    //   228: astore 8
    //   230: aload_2
    //   231: areturn
    //   232: astore_3
    //   233: aload_1
    //   234: ifnull +7 -> 241
    //   237: aload_1
    //   238: invokevirtual 51	java/io/InputStream:close	()V
    //   241: aload_3
    //   242: athrow
    //   243: astore 15
    //   245: aconst_null
    //   246: areturn
    //   247: astore 4
    //   249: goto -8 -> 241
    //
    // Exception table:
    //   from	to	target	type
    //   6	26	38	java/io/IOException
    //   103	107	109	java/io/IOException
    //   6	26	113	java/lang/IllegalArgumentException
    //   147	151	153	java/io/IOException
    //   6	26	157	java/lang/IllegalStateException
    //   222	226	228	java/io/IOException
    //   6	26	232	finally
    //   40	96	232	finally
    //   115	140	232	finally
    //   159	215	232	finally
    //   32	36	243	java/io/IOException
    //   237	241	247	java/io/IOException
  }

  public final void d()
  {
    try
    {
      ao.b(this.b).a(this.a.a(), new bi()
      {
        public final void a(InputStream paramAnonymousInputStream)
        {
          String str = ap.a(ap.this, paramAnonymousInputStream);
          if (str != null)
          {
            ao.a(ap.this.b).b(ap.this.a.a(), str);
            return;
          }
          ao.a(ap.this.b).b(ap.this.a.a());
        }

        public final void a(String paramAnonymousString)
        {
          ao.a(ap.this.b).b(ap.this.a.a(), paramAnonymousString);
        }
      });
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      new StringBuilder().append("IMAGE LOAD FAILED - An error occurred while performing the network request for the image. Stack trace below. URL: ").append(this.a.a()).toString();
      localIllegalStateException.printStackTrace();
      String str = "Failed to download image. A stack trace has been output to the logs. Message: " + localIllegalStateException.getMessage();
      ao.a(this.b).b(this.a.a(), str);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.ap
 * JD-Core Version:    0.6.2
 */