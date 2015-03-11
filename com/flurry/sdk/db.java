package com.flurry.sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class db
{
  private int a;
  private String b;
  private Map<String, String> c;
  private long d;
  private boolean e;
  private boolean f;
  private long g;

  public db(int paramInt, String paramString, Map<String, String> paramMap, long paramLong, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramMap;
    this.d = paramLong;
    this.e = paramBoolean;
    if (this.e)
    {
      this.f = false;
      return;
    }
    this.f = true;
  }

  public final void a(long paramLong)
  {
    this.f = true;
    this.g = (paramLong - this.d);
    eo.a(3, "FlurryAgent", "Ended event '" + this.b + "' (" + this.d + ") after " + this.g + "ms");
  }

  public final void a(Map<String, String> paramMap)
  {
    if ((this.c == null) || (this.c.size() == 0))
      this.c = paramMap;
    while (true)
    {
      return;
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (this.c.containsKey(localEntry.getKey()))
        {
          this.c.remove(localEntry.getKey());
          this.c.put(localEntry.getKey(), localEntry.getValue());
        }
        else
        {
          this.c.put(localEntry.getKey(), localEntry.getValue());
        }
      }
    }
  }

  public final boolean a()
  {
    return this.e;
  }

  public final boolean a(String paramString)
  {
    return (this.e) && (this.g == 0L) && (this.b.equals(paramString));
  }

  public final void b(Map<String, String> paramMap)
  {
    this.c = paramMap;
  }

  public final boolean b()
  {
    return this.f;
  }

  public final Map<String, String> c()
  {
    return this.c;
  }

  public final int d()
  {
    return e().length;
  }

  // ERROR //
  public final byte[] e()
  {
    // Byte code:
    //   0: new 127	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 128	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: new 130	java/io/DataOutputStream
    //   11: dup
    //   12: aload_1
    //   13: invokespecial 133	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: getfield 24	com/flurry/sdk/db:a	I
    //   22: invokevirtual 137	java/io/DataOutputStream:writeShort	(I)V
    //   25: aload_2
    //   26: aload_0
    //   27: getfield 26	com/flurry/sdk/db:b	Ljava/lang/String;
    //   30: invokevirtual 141	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   33: aload_0
    //   34: getfield 28	com/flurry/sdk/db:c	Ljava/util/Map;
    //   37: ifnonnull +41 -> 78
    //   40: aload_2
    //   41: iconst_0
    //   42: invokevirtual 137	java/io/DataOutputStream:writeShort	(I)V
    //   45: aload_2
    //   46: aload_0
    //   47: getfield 30	com/flurry/sdk/db:d	J
    //   50: invokevirtual 144	java/io/DataOutputStream:writeLong	(J)V
    //   53: aload_2
    //   54: aload_0
    //   55: getfield 37	com/flurry/sdk/db:g	J
    //   58: invokevirtual 144	java/io/DataOutputStream:writeLong	(J)V
    //   61: aload_2
    //   62: invokevirtual 147	java/io/DataOutputStream:flush	()V
    //   65: aload_1
    //   66: invokevirtual 150	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   69: astore 9
    //   71: aload_2
    //   72: invokestatic 155	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   75: aload 9
    //   77: areturn
    //   78: aload_2
    //   79: aload_0
    //   80: getfield 28	com/flurry/sdk/db:c	Ljava/util/Map;
    //   83: invokeinterface 73 1 0
    //   88: invokevirtual 137	java/io/DataOutputStream:writeShort	(I)V
    //   91: aload_0
    //   92: getfield 28	com/flurry/sdk/db:c	Ljava/util/Map;
    //   95: invokeinterface 77 1 0
    //   100: invokeinterface 83 1 0
    //   105: astore 7
    //   107: aload 7
    //   109: invokeinterface 89 1 0
    //   114: ifeq -69 -> 45
    //   117: aload 7
    //   119: invokeinterface 93 1 0
    //   124: checkcast 95	java/util/Map$Entry
    //   127: astore 8
    //   129: aload_2
    //   130: aload 8
    //   132: invokeinterface 98 1 0
    //   137: checkcast 116	java/lang/String
    //   140: invokestatic 158	com/flurry/sdk/fe:a	(Ljava/lang/String;)Ljava/lang/String;
    //   143: invokevirtual 141	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   146: aload_2
    //   147: aload 8
    //   149: invokeinterface 109 1 0
    //   154: checkcast 116	java/lang/String
    //   157: invokestatic 158	com/flurry/sdk/fe:a	(Ljava/lang/String;)Ljava/lang/String;
    //   160: invokevirtual 141	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   163: goto -56 -> 107
    //   166: astore 4
    //   168: aload_2
    //   169: astore 5
    //   171: iconst_0
    //   172: newarray byte
    //   174: astore 6
    //   176: aload 5
    //   178: invokestatic 155	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   181: aload 6
    //   183: areturn
    //   184: astore 11
    //   186: aconst_null
    //   187: astore_2
    //   188: aload 11
    //   190: astore_3
    //   191: aload_2
    //   192: invokestatic 155	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   195: aload_3
    //   196: athrow
    //   197: astore_3
    //   198: goto -7 -> 191
    //   201: astore_3
    //   202: aload 5
    //   204: astore_2
    //   205: goto -14 -> 191
    //   208: astore 10
    //   210: aconst_null
    //   211: astore 5
    //   213: goto -42 -> 171
    //
    // Exception table:
    //   from	to	target	type
    //   17	45	166	java/io/IOException
    //   45	71	166	java/io/IOException
    //   78	107	166	java/io/IOException
    //   107	163	166	java/io/IOException
    //   0	17	184	finally
    //   17	45	197	finally
    //   45	71	197	finally
    //   78	107	197	finally
    //   107	163	197	finally
    //   171	176	201	finally
    //   0	17	208	java/io/IOException
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.db
 * JD-Core Version:    0.6.2
 */