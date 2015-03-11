package com.admarvel.android.util;

public class OptionalUtils
{
  // ERROR //
  public static java.lang.String getId(android.content.Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 24	java/lang/Class
    //   4: dup
    //   5: iconst_0
    //   6: ldc 26
    //   8: aastore
    //   9: astore_1
    //   10: ldc 28
    //   12: invokestatic 32	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   15: astore 14
    //   17: aload 14
    //   19: astore_3
    //   20: aload_3
    //   21: invokevirtual 36	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   24: astore 18
    //   26: aload 18
    //   28: astore 4
    //   30: iconst_1
    //   31: istore 5
    //   33: iload 5
    //   35: ifeq +90 -> 125
    //   38: aload_3
    //   39: ldc 37
    //   41: aload_1
    //   42: invokevirtual 41	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   45: aload 4
    //   47: iconst_1
    //   48: anewarray 4	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_0
    //   54: aastore
    //   55: invokevirtual 47	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   58: checkcast 49	java/lang/String
    //   61: astore 10
    //   63: aload 10
    //   65: areturn
    //   66: astore 12
    //   68: aconst_null
    //   69: astore 13
    //   71: aload 12
    //   73: invokevirtual 52	java/lang/IllegalAccessException:printStackTrace	()V
    //   76: aload 13
    //   78: astore_3
    //   79: iconst_1
    //   80: istore 5
    //   82: aconst_null
    //   83: astore 4
    //   85: goto -52 -> 33
    //   88: astore 9
    //   90: aload 9
    //   92: invokevirtual 53	java/lang/NoSuchMethodException:printStackTrace	()V
    //   95: ldc 55
    //   97: areturn
    //   98: astore 8
    //   100: aload 8
    //   102: invokevirtual 56	java/lang/IllegalArgumentException:printStackTrace	()V
    //   105: ldc 55
    //   107: areturn
    //   108: astore 7
    //   110: aload 7
    //   112: invokevirtual 52	java/lang/IllegalAccessException:printStackTrace	()V
    //   115: ldc 55
    //   117: areturn
    //   118: astore 6
    //   120: aload 6
    //   122: invokevirtual 57	java/lang/reflect/InvocationTargetException:printStackTrace	()V
    //   125: ldc 55
    //   127: areturn
    //   128: astore 17
    //   130: aload_3
    //   131: astore 13
    //   133: aload 17
    //   135: astore 12
    //   137: goto -66 -> 71
    //   140: astore 11
    //   142: aconst_null
    //   143: astore_3
    //   144: aconst_null
    //   145: astore 4
    //   147: iconst_0
    //   148: istore 5
    //   150: goto -117 -> 33
    //   153: astore 16
    //   155: aconst_null
    //   156: astore 4
    //   158: iconst_0
    //   159: istore 5
    //   161: goto -128 -> 33
    //   164: astore_2
    //   165: aconst_null
    //   166: astore_3
    //   167: aconst_null
    //   168: astore 4
    //   170: iconst_0
    //   171: istore 5
    //   173: goto -140 -> 33
    //   176: astore 15
    //   178: aconst_null
    //   179: astore 4
    //   181: iconst_0
    //   182: istore 5
    //   184: goto -151 -> 33
    //
    // Exception table:
    //   from	to	target	type
    //   10	17	66	java/lang/IllegalAccessException
    //   38	63	88	java/lang/NoSuchMethodException
    //   38	63	98	java/lang/IllegalArgumentException
    //   38	63	108	java/lang/IllegalAccessException
    //   38	63	118	java/lang/reflect/InvocationTargetException
    //   20	26	128	java/lang/IllegalAccessException
    //   10	17	140	java/lang/InstantiationException
    //   20	26	153	java/lang/InstantiationException
    //   10	17	164	java/lang/ClassNotFoundException
    //   20	26	176	java/lang/ClassNotFoundException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.OptionalUtils
 * JD-Core Version:    0.6.2
 */