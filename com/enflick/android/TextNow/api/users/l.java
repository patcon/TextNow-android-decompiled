package com.enflick.android.TextNow.api.users;

import com.enflick.android.TextNow.api.common.c;
import org.json.JSONObject;
import textnow.y.a;
import textnow.y.e;

public final class l extends c
{

  @e
  public String a;

  @a(a="title")
  public String b;

  @a(a="members")
  public JSONObject[] c;

  // ERROR //
  public l(String paramString1, String paramString2, java.util.Map<String, java.lang.Integer> paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 20	com/enflick/android/TextNow/api/common/c:<init>	()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield 22	com/enflick/android/TextNow/api/users/l:a	Ljava/lang/String;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield 24	com/enflick/android/TextNow/api/users/l:b	Ljava/lang/String;
    //   14: aload_0
    //   15: aload_3
    //   16: invokeinterface 30 1 0
    //   21: anewarray 32	org/json/JSONObject
    //   24: putfield 34	com/enflick/android/TextNow/api/users/l:c	[Lorg/json/JSONObject;
    //   27: aload_3
    //   28: invokeinterface 38 1 0
    //   33: invokeinterface 44 1 0
    //   38: astore 4
    //   40: iconst_0
    //   41: istore 5
    //   43: aload 4
    //   45: invokeinterface 50 1 0
    //   50: ifeq +94 -> 144
    //   53: aload 4
    //   55: invokeinterface 54 1 0
    //   60: checkcast 56	java/util/Map$Entry
    //   63: astore 6
    //   65: aload_0
    //   66: getfield 34	com/enflick/android/TextNow/api/users/l:c	[Lorg/json/JSONObject;
    //   69: iload 5
    //   71: new 32	org/json/JSONObject
    //   74: dup
    //   75: invokespecial 57	org/json/JSONObject:<init>	()V
    //   78: aastore
    //   79: aload_0
    //   80: getfield 34	com/enflick/android/TextNow/api/users/l:c	[Lorg/json/JSONObject;
    //   83: iload 5
    //   85: aaload
    //   86: ldc 59
    //   88: aload 6
    //   90: invokeinterface 62 1 0
    //   95: invokevirtual 66	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   98: pop
    //   99: aload_0
    //   100: getfield 34	com/enflick/android/TextNow/api/users/l:c	[Lorg/json/JSONObject;
    //   103: iload 5
    //   105: aaload
    //   106: ldc 68
    //   108: aload 6
    //   110: invokeinterface 71 1 0
    //   115: checkcast 73	java/lang/Integer
    //   118: invokevirtual 76	java/lang/Integer:intValue	()I
    //   121: invokevirtual 79	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   124: pop
    //   125: iinc 5 1
    //   128: goto -85 -> 43
    //   131: astore 8
    //   133: iinc 5 1
    //   136: goto -93 -> 43
    //   139: astore 7
    //   141: aload 7
    //   143: athrow
    //   144: return
    //
    // Exception table:
    //   from	to	target	type
    //   79	125	131	org/json/JSONException
    //   79	125	139	finally
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.l
 * JD-Core Version:    0.6.2
 */