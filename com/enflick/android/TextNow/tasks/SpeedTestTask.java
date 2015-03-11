package com.enflick.android.TextNow.tasks;

import textnow.z.f;
import textnow.z.p;

public class SpeedTestTask extends c
{
  private f d;
  private String e;
  private b f;
  private int g;
  private int h;
  private String i;

  public SpeedTestTask(p paramp, f paramf, String paramString)
  {
    int j;
    if (textnow.v.a.a)
    {
      j = com.enflick.android.TextNow.activities.phone.a.a;
      this.g = j;
      if (!textnow.v.a.a)
        break label66;
    }
    label66: for (int k = com.enflick.android.TextNow.activities.phone.a.c; ; k = paramp.k(com.enflick.android.TextNow.activities.phone.a.c))
    {
      this.h = k;
      this.i = paramp.q();
      this.d = paramf;
      this.e = paramString;
      return;
      j = paramp.h();
      break;
    }
  }

  public final b a()
  {
    return this.f;
  }

  public final f b()
  {
    return this.d;
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: new 67	com/enflick/android/TextNow/api/common/TNSpeedTestCommand
    //   3: dup
    //   4: aload_0
    //   5: getfield 70	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   8: aload_0
    //   9: getfield 44	com/enflick/android/TextNow/tasks/SpeedTestTask:i	Ljava/lang/String;
    //   12: aload_0
    //   13: getfield 31	com/enflick/android/TextNow/tasks/SpeedTestTask:g	I
    //   16: aload_0
    //   17: getfield 31	com/enflick/android/TextNow/tasks/SpeedTestTask:g	I
    //   20: invokespecial 73	com/enflick/android/TextNow/api/common/TNSpeedTestCommand:<init>	(Landroid/content/Context;Ljava/lang/String;II)V
    //   23: astore_1
    //   24: invokestatic 79	java/lang/System:currentTimeMillis	()J
    //   27: lstore_2
    //   28: aload_1
    //   29: invokevirtual 82	com/enflick/android/TextNow/api/common/TNSpeedTestCommand:a	()Ltextnow/x/i;
    //   32: astore 4
    //   34: aload 4
    //   36: invokevirtual 87	textnow/x/i:e	()Z
    //   39: ifeq +31 -> 70
    //   42: aload_0
    //   43: getfield 48	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   46: ifnull +23 -> 69
    //   49: new 89	com/enflick/android/TextNow/tasks/AcceptCallTask
    //   52: dup
    //   53: aload_0
    //   54: getfield 48	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   57: iconst_1
    //   58: invokespecial 92	com/enflick/android/TextNow/tasks/AcceptCallTask:<init>	(Ljava/lang/String;Z)V
    //   61: aload_0
    //   62: getfield 70	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   65: invokevirtual 95	com/enflick/android/TextNow/tasks/AcceptCallTask:b	(Landroid/content/Context;)I
    //   68: pop
    //   69: return
    //   70: aload_0
    //   71: new 97	com/enflick/android/TextNow/tasks/b
    //   74: dup
    //   75: invokespecial 98	com/enflick/android/TextNow/tasks/b:<init>	()V
    //   78: putfield 58	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   81: invokestatic 79	java/lang/System:currentTimeMillis	()J
    //   84: lload_2
    //   85: lsub
    //   86: lstore 5
    //   88: aload_0
    //   89: getfield 58	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   92: lload 5
    //   94: invokevirtual 101	com/enflick/android/TextNow/tasks/b:a	(J)V
    //   97: invokestatic 79	java/lang/System:currentTimeMillis	()J
    //   100: lstore 7
    //   102: aload 4
    //   104: invokevirtual 104	textnow/x/i:b	()Ljava/lang/Object;
    //   107: checkcast 106	java/io/InputStream
    //   110: astore 9
    //   112: sipush 4096
    //   115: newarray byte
    //   117: astore 10
    //   119: iconst_0
    //   120: istore 11
    //   122: invokestatic 79	java/lang/System:currentTimeMillis	()J
    //   125: lload 7
    //   127: lsub
    //   128: aload_0
    //   129: getfield 36	com/enflick/android/TextNow/tasks/SpeedTestTask:h	I
    //   132: i2l
    //   133: lcmp
    //   134: ifge +30 -> 164
    //   137: aload 9
    //   139: aload 10
    //   141: invokevirtual 110	java/io/InputStream:read	([B)I
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
    //   164: invokestatic 79	java/lang/System:currentTimeMillis	()J
    //   167: lload 7
    //   169: lsub
    //   170: lstore 13
    //   172: aload_0
    //   173: getfield 58	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   176: iload 11
    //   178: invokevirtual 113	com/enflick/android/TextNow/tasks/b:a	(I)V
    //   181: aload_0
    //   182: getfield 58	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   185: lload 13
    //   187: invokevirtual 115	com/enflick/android/TextNow/tasks/b:b	(J)V
    //   190: new 117	java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   197: ldc 120
    //   199: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: lload 5
    //   204: invokevirtual 127	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   207: ldc 129
    //   209: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: aload_0
    //   213: getfield 58	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   216: invokevirtual 132	com/enflick/android/TextNow/tasks/b:c	()F
    //   219: invokevirtual 135	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   222: ldc 137
    //   224: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: iload 11
    //   229: sipush 1000
    //   232: idiv
    //   233: invokevirtual 140	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   236: ldc 142
    //   238: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: pop
    //   245: new 117	java/lang/StringBuilder
    //   248: dup
    //   249: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   252: ldc 147
    //   254: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: invokestatic 152	com/enflick/android/TextNow/activities/phone/h:a	()Lcom/enflick/android/TextNow/activities/phone/h;
    //   260: invokevirtual 155	com/enflick/android/TextNow/activities/phone/h:k	()Lcom/enflick/android/TextNow/activities/phone/a;
    //   263: invokevirtual 157	com/enflick/android/TextNow/activities/phone/a:a	()I
    //   266: invokevirtual 140	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   269: ldc 159
    //   271: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: invokestatic 152	com/enflick/android/TextNow/activities/phone/h:a	()Lcom/enflick/android/TextNow/activities/phone/h;
    //   277: invokevirtual 155	com/enflick/android/TextNow/activities/phone/h:k	()Lcom/enflick/android/TextNow/activities/phone/a;
    //   280: invokevirtual 161	com/enflick/android/TextNow/activities/phone/a:b	()I
    //   283: invokevirtual 140	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   286: ldc 163
    //   288: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   294: pop
    //   295: new 117	java/lang/StringBuilder
    //   298: dup
    //   299: invokespecial 118	java/lang/StringBuilder:<init>	()V
    //   302: ldc 165
    //   304: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokestatic 152	com/enflick/android/TextNow/activities/phone/h:a	()Lcom/enflick/android/TextNow/activities/phone/h;
    //   310: invokevirtual 155	com/enflick/android/TextNow/activities/phone/h:k	()Lcom/enflick/android/TextNow/activities/phone/a;
    //   313: aload_0
    //   314: getfield 58	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   317: invokevirtual 168	com/enflick/android/TextNow/activities/phone/a:a	(Lcom/enflick/android/TextNow/tasks/b;)Z
    //   320: invokevirtual 171	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   323: invokevirtual 145	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   326: pop
    //   327: aload_0
    //   328: getfield 48	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   331: ifnull -262 -> 69
    //   334: invokestatic 152	com/enflick/android/TextNow/activities/phone/h:a	()Lcom/enflick/android/TextNow/activities/phone/h;
    //   337: aload_0
    //   338: getfield 58	com/enflick/android/TextNow/tasks/SpeedTestTask:f	Lcom/enflick/android/TextNow/tasks/b;
    //   341: invokevirtual 172	com/enflick/android/TextNow/activities/phone/h:a	(Lcom/enflick/android/TextNow/tasks/b;)Z
    //   344: istore 21
    //   346: new 89	com/enflick/android/TextNow/tasks/AcceptCallTask
    //   349: dup
    //   350: aload_0
    //   351: getfield 48	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   354: iload 21
    //   356: invokespecial 92	com/enflick/android/TextNow/tasks/AcceptCallTask:<init>	(Ljava/lang/String;Z)V
    //   359: aload_0
    //   360: getfield 70	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   363: invokevirtual 95	com/enflick/android/TextNow/tasks/AcceptCallTask:b	(Landroid/content/Context;)I
    //   366: pop
    //   367: return
    //   368: astore 16
    //   370: aload 16
    //   372: invokevirtual 175	com/enflick/android/TextNow/activities/phone/n:printStackTrace	()V
    //   375: goto -48 -> 327
    //   378: astore 19
    //   380: new 89	com/enflick/android/TextNow/tasks/AcceptCallTask
    //   383: dup
    //   384: aload_0
    //   385: getfield 48	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   388: iconst_0
    //   389: invokespecial 92	com/enflick/android/TextNow/tasks/AcceptCallTask:<init>	(Ljava/lang/String;Z)V
    //   392: aload_0
    //   393: getfield 70	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   396: invokevirtual 95	com/enflick/android/TextNow/tasks/AcceptCallTask:b	(Landroid/content/Context;)I
    //   399: pop
    //   400: return
    //   401: astore 17
    //   403: new 89	com/enflick/android/TextNow/tasks/AcceptCallTask
    //   406: dup
    //   407: aload_0
    //   408: getfield 48	com/enflick/android/TextNow/tasks/SpeedTestTask:e	Ljava/lang/String;
    //   411: iconst_0
    //   412: invokespecial 92	com/enflick/android/TextNow/tasks/AcceptCallTask:<init>	(Ljava/lang/String;Z)V
    //   415: aload_0
    //   416: getfield 70	com/enflick/android/TextNow/tasks/SpeedTestTask:a	Landroid/content/Context;
    //   419: invokevirtual 95	com/enflick/android/TextNow/tasks/AcceptCallTask:b	(Landroid/content/Context;)I
    //   422: pop
    //   423: aload 17
    //   425: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   122	146	162	java/io/IOException
    //   245	327	368	com/enflick/android/TextNow/activities/phone/n
    //   334	346	378	com/enflick/android/TextNow/activities/phone/n
    //   334	346	401	finally
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SpeedTestTask
 * JD-Core Version:    0.6.2
 */