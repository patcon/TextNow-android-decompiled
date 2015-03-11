package com.enflick.android.TextNow.tasks;

import textnow.u.d;
import textnow.u.n;

public class SpeedTestTask extends c
{
  private d d;
  private String e;
  private b f;
  private int g;
  private int h;
  private String i;

  public SpeedTestTask(n paramn, d paramd, String paramString)
  {
    int j;
    if (textnow.q.a.a)
    {
      j = com.enflick.android.TextNow.activities.phone.a.a;
      this.g = j;
      if (!textnow.q.a.a)
        break label69;
    }
    label69: for (int k = com.enflick.android.TextNow.activities.phone.a.c; ; k = paramn.f(com.enflick.android.TextNow.activities.phone.a.c))
    {
      this.h = k;
      this.i = paramn.a();
      this.d = paramd;
      this.e = paramString;
      return;
      j = paramn.b(com.enflick.android.TextNow.activities.phone.a.a);
      break;
    }
  }

  public final b a()
  {
    return this.f;
  }

  public final d b()
  {
    return this.d;
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: new 64	com/enflick/android/TextNow/api/common/TNSpeedTestCommand
    //   3: dup
    //   4: aload_0
    //   5: getfield 67	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   8: aload_0
    //   9: getfield 43	com/enflick/android/TextNow/tasks/SpeedTestTask:i	Ljava/lang/String;
    //   12: aload_0
    //   13: getfield 31	com/enflick/android/TextNow/tasks/SpeedTestTask:g	I
    //   16: aload_0
    //   17: getfield 31	com/enflick/android/TextNow/tasks/SpeedTestTask:g	I
    //   20: invokespecial 70	com/enflick/android/TextNow/api/common/TNSpeedTestCommand:<init>	(Landroid/content/Context;Ljava/lang/String;II)V
    //   23: astore_1
    //   24: invokestatic 76	java/lang/System:currentTimeMillis	()J
    //   27: lstore_2
    //   28: aload_1
    //   29: invokevirtual 79	com/enflick/android/TextNow/api/common/TNSpeedTestCommand:a	()Ltextnow/s/i;
    //   32: astore 4
    //   34: aload 4
    //   36: invokevirtual 84	textnow/s/i:e	()Z
    //   39: ifeq +31 -> 70
    //   42: aload_0
    //   43: getfield 47	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   46: ifnull +23 -> 69
    //   49: new 86	com/enflick/android/TextNow/tasks/AcceptCallTask
    //   52: dup
    //   53: aload_0
    //   54: getfield 47	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   57: iconst_1
    //   58: invokespecial 89	com/enflick/android/TextNow/tasks/AcceptCallTask:<init>	(Ljava/lang/String;Z)V
    //   61: aload_0
    //   62: getfield 67	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   65: invokevirtual 92	com/enflick/android/TextNow/tasks/AcceptCallTask:b	(Landroid/content/Context;)I
    //   68: pop
    //   69: return
    //   70: aload_0
    //   71: new 94	com/enflick/android/TextNow/tasks/b
    //   74: dup
    //   75: invokespecial 95	com/enflick/android/TextNow/tasks/b:<init>	()V
    //   78: putfield 56	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   81: invokestatic 76	java/lang/System:currentTimeMillis	()J
    //   84: lload_2
    //   85: lsub
    //   86: lstore 5
    //   88: aload_0
    //   89: getfield 56	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   92: lload 5
    //   94: invokevirtual 98	com/enflick/android/TextNow/tasks/b:a	(J)V
    //   97: invokestatic 76	java/lang/System:currentTimeMillis	()J
    //   100: lstore 7
    //   102: aload 4
    //   104: invokevirtual 101	textnow/s/i:b	()Ljava/lang/Object;
    //   107: checkcast 103	java/io/InputStream
    //   110: astore 9
    //   112: sipush 4096
    //   115: newarray byte
    //   117: astore 10
    //   119: iconst_0
    //   120: istore 11
    //   122: invokestatic 76	java/lang/System:currentTimeMillis	()J
    //   125: lload 7
    //   127: lsub
    //   128: aload_0
    //   129: getfield 36	com/enflick/android/TextNow/tasks/SpeedTestTask:h	I
    //   132: i2l
    //   133: lcmp
    //   134: ifge +30 -> 164
    //   137: aload 9
    //   139: aload 10
    //   141: invokevirtual 107	java/io/InputStream:read	([B)I
    //   144: istore 25
    //   146: iload 25
    //   148: iconst_m1
    //   149: if_icmpeq +15 -> 164
    //   152: iload 11
    //   154: iload 25
    //   156: iadd
    //   157: istore 11
    //   159: goto -37 -> 122
    //   162: astore 12
    //   164: invokestatic 76	java/lang/System:currentTimeMillis	()J
    //   167: lload 7
    //   169: lsub
    //   170: lstore 13
    //   172: aload_0
    //   173: getfield 56	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   176: iload 11
    //   178: invokevirtual 110	com/enflick/android/TextNow/tasks/b:a	(I)V
    //   181: aload_0
    //   182: getfield 56	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   185: lload 13
    //   187: invokevirtual 112	com/enflick/android/TextNow/tasks/b:b	(J)V
    //   190: new 114	java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   197: ldc 117
    //   199: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: lload 5
    //   204: invokevirtual 124	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   207: ldc 126
    //   209: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: aload_0
    //   213: getfield 56	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   216: invokevirtual 129	com/enflick/android/TextNow/tasks/b:c	()F
    //   219: invokevirtual 132	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   222: ldc 134
    //   224: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: iload 11
    //   229: sipush 1000
    //   232: idiv
    //   233: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   236: ldc 139
    //   238: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: pop
    //   245: new 114	java/lang/StringBuilder
    //   248: dup
    //   249: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   252: ldc 144
    //   254: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: invokestatic 149	com/enflick/android/TextNow/activities/phone/d:a	()Lcom/enflick/android/TextNow/activities/phone/d;
    //   260: invokevirtual 153	com/enflick/android/TextNow/activities/phone/d:k	()Lcom/enflick/android/TextNow/activities/phone/a;
    //   263: invokevirtual 156	com/enflick/android/TextNow/activities/phone/a:a	()I
    //   266: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   269: ldc 158
    //   271: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: invokestatic 149	com/enflick/android/TextNow/activities/phone/d:a	()Lcom/enflick/android/TextNow/activities/phone/d;
    //   277: invokevirtual 153	com/enflick/android/TextNow/activities/phone/d:k	()Lcom/enflick/android/TextNow/activities/phone/a;
    //   280: invokevirtual 160	com/enflick/android/TextNow/activities/phone/a:b	()I
    //   283: invokevirtual 137	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   286: ldc 162
    //   288: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   294: pop
    //   295: new 114	java/lang/StringBuilder
    //   298: dup
    //   299: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   302: ldc 164
    //   304: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokestatic 149	com/enflick/android/TextNow/activities/phone/d:a	()Lcom/enflick/android/TextNow/activities/phone/d;
    //   310: invokevirtual 153	com/enflick/android/TextNow/activities/phone/d:k	()Lcom/enflick/android/TextNow/activities/phone/a;
    //   313: aload_0
    //   314: getfield 56	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   317: invokevirtual 167	com/enflick/android/TextNow/activities/phone/a:a	(Lcom/enflick/android/TextNow/tasks/b;)Z
    //   320: invokevirtual 170	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   323: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   326: pop
    //   327: aload_0
    //   328: getfield 47	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   331: ifnull -262 -> 69
    //   334: invokestatic 149	com/enflick/android/TextNow/activities/phone/d:a	()Lcom/enflick/android/TextNow/activities/phone/d;
    //   337: aload_0
    //   338: getfield 56	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   341: invokevirtual 171	com/enflick/android/TextNow/activities/phone/d:a	(Lcom/enflick/android/TextNow/tasks/b;)Z
    //   344: istore 21
    //   346: new 86	com/enflick/android/TextNow/tasks/AcceptCallTask
    //   349: dup
    //   350: aload_0
    //   351: getfield 47	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   354: iload 21
    //   356: invokespecial 89	com/enflick/android/TextNow/tasks/AcceptCallTask:<init>	(Ljava/lang/String;Z)V
    //   359: aload_0
    //   360: getfield 67	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   363: invokevirtual 92	com/enflick/android/TextNow/tasks/AcceptCallTask:b	(Landroid/content/Context;)I
    //   366: pop
    //   367: return
    //   368: astore 16
    //   370: aload 16
    //   372: invokevirtual 174	com/enflick/android/TextNow/activities/phone/j:printStackTrace	()V
    //   375: goto -48 -> 327
    //   378: astore 19
    //   380: new 86	com/enflick/android/TextNow/tasks/AcceptCallTask
    //   383: dup
    //   384: aload_0
    //   385: getfield 47	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   388: iconst_0
    //   389: invokespecial 89	com/enflick/android/TextNow/tasks/AcceptCallTask:<init>	(Ljava/lang/String;Z)V
    //   392: aload_0
    //   393: getfield 67	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   396: invokevirtual 92	com/enflick/android/TextNow/tasks/AcceptCallTask:b	(Landroid/content/Context;)I
    //   399: pop
    //   400: return
    //   401: astore 17
    //   403: new 86	com/enflick/android/TextNow/tasks/AcceptCallTask
    //   406: dup
    //   407: aload_0
    //   408: getfield 47	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   411: iconst_0
    //   412: invokespecial 89	com/enflick/android/TextNow/tasks/AcceptCallTask:<init>	(Ljava/lang/String;Z)V
    //   415: aload_0
    //   416: getfield 67	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   419: invokevirtual 92	com/enflick/android/TextNow/tasks/AcceptCallTask:b	(Landroid/content/Context;)I
    //   422: pop
    //   423: aload 17
    //   425: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   122	146	162	java/io/IOException
    //   245	327	368	com/enflick/android/TextNow/activities/phone/j
    //   334	346	378	com/enflick/android/TextNow/activities/phone/j
    //   334	346	401	finally
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SpeedTestTask
 * JD-Core Version:    0.6.2
 */