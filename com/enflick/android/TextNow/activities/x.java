package com.enflick.android.TextNow.activities;

import android.os.AsyncTask;

final class x extends AsyncTask<w, Void, w>
{
  private x(MessageViewFragment paramMessageViewFragment)
  {
  }

  // ERROR //
  private w a(w[] paramArrayOfw)
  {
    // Byte code:
    //   0: aload_1
    //   1: iconst_0
    //   2: aaload
    //   3: astore_2
    //   4: aload_0
    //   5: getfield 11	com/enflick/android/TextNow/activities/x:a	Lcom/enflick/android/TextNow/activities/MessageViewFragment;
    //   8: invokestatic 26	com/enflick/android/TextNow/activities/MessageViewFragment:e	(Lcom/enflick/android/TextNow/activities/MessageViewFragment;)Lcom/enflick/android/TextNow/activities/an;
    //   11: ifnonnull +5 -> 16
    //   14: aload_2
    //   15: areturn
    //   16: aload_0
    //   17: getfield 11	com/enflick/android/TextNow/activities/x:a	Lcom/enflick/android/TextNow/activities/MessageViewFragment;
    //   20: invokestatic 26	com/enflick/android/TextNow/activities/MessageViewFragment:e	(Lcom/enflick/android/TextNow/activities/MessageViewFragment;)Lcom/enflick/android/TextNow/activities/an;
    //   23: aload_2
    //   24: getfield 32	com/enflick/android/TextNow/activities/w:b	Ljava/lang/String;
    //   27: invokestatic 37	textnow/z/c:a	(Landroid/content/Context;Ljava/lang/String;)Ltextnow/z/c;
    //   30: astore_3
    //   31: aload_3
    //   32: instanceof 39
    //   35: ifne +5 -> 40
    //   38: aload_2
    //   39: areturn
    //   40: aload_3
    //   41: checkcast 39	textnow/z/b
    //   44: aload_0
    //   45: getfield 11	com/enflick/android/TextNow/activities/x:a	Lcom/enflick/android/TextNow/activities/MessageViewFragment;
    //   48: invokestatic 26	com/enflick/android/TextNow/activities/MessageViewFragment:e	(Lcom/enflick/android/TextNow/activities/MessageViewFragment;)Lcom/enflick/android/TextNow/activities/an;
    //   51: invokevirtual 42	textnow/z/b:a	(Landroid/content/Context;)Ljava/io/File;
    //   54: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   57: astore 5
    //   59: aload 5
    //   61: invokestatic 53	textnow/v/f:a	(Ljava/lang/String;)I
    //   64: istore 6
    //   66: iload 6
    //   68: bipush 6
    //   70: if_icmpeq +163 -> 233
    //   73: iload 6
    //   75: iconst_3
    //   76: if_icmpeq +157 -> 233
    //   79: iload 6
    //   81: bipush 8
    //   83: if_icmpeq +150 -> 233
    //   86: iconst_1
    //   87: istore 7
    //   89: goto +137 -> 226
    //   92: aload_0
    //   93: getfield 11	com/enflick/android/TextNow/activities/x:a	Lcom/enflick/android/TextNow/activities/MessageViewFragment;
    //   96: invokestatic 26	com/enflick/android/TextNow/activities/MessageViewFragment:e	(Lcom/enflick/android/TextNow/activities/MessageViewFragment;)Lcom/enflick/android/TextNow/activities/an;
    //   99: getstatic 58	textnow/v/h:e	Ltextnow/v/h;
    //   102: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   105: invokestatic 69	textnow/v/g:a	(Landroid/content/Context;Ltextnow/v/h;J)Ljava/io/File;
    //   108: astore 8
    //   110: aload 8
    //   112: ifnull +107 -> 219
    //   115: aload 8
    //   117: invokevirtual 73	java/io/File:exists	()Z
    //   120: ifeq +99 -> 219
    //   123: aload 5
    //   125: sipush 1024
    //   128: invokestatic 76	textnow/v/f:a	(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    //   131: astore 9
    //   133: aload 9
    //   135: ifnull +84 -> 219
    //   138: aload 5
    //   140: aload 9
    //   142: invokestatic 79	textnow/v/f:a	(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   145: astore 10
    //   147: aload 10
    //   149: aload 9
    //   151: if_acmpeq +68 -> 219
    //   154: new 81	java/io/FileOutputStream
    //   157: dup
    //   158: aload 8
    //   160: invokespecial 84	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   163: astore 11
    //   165: aload 10
    //   167: getstatic 90	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   170: bipush 75
    //   172: aload 11
    //   174: invokevirtual 96	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   177: pop
    //   178: aload 11
    //   180: invokevirtual 99	java/io/FileOutputStream:flush	()V
    //   183: aload 11
    //   185: invokevirtual 102	java/io/FileOutputStream:close	()V
    //   188: aload_2
    //   189: aload 8
    //   191: invokevirtual 48	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   194: putfield 32	com/enflick/android/TextNow/activities/w:b	Ljava/lang/String;
    //   197: aload 11
    //   199: invokevirtual 102	java/io/FileOutputStream:close	()V
    //   202: aload_2
    //   203: areturn
    //   204: aload 11
    //   206: ifnull +8 -> 214
    //   209: aload 11
    //   211: invokevirtual 102	java/io/FileOutputStream:close	()V
    //   214: aload 12
    //   216: athrow
    //   217: astore 4
    //   219: aload_2
    //   220: areturn
    //   221: astore 12
    //   223: goto -19 -> 204
    //   226: iload 7
    //   228: ifeq -136 -> 92
    //   231: aload_2
    //   232: areturn
    //   233: iconst_0
    //   234: istore 7
    //   236: goto -10 -> 226
    //   239: astore 12
    //   241: aconst_null
    //   242: astore 11
    //   244: goto -40 -> 204
    //
    // Exception table:
    //   from	to	target	type
    //   40	66	217	java/lang/Throwable
    //   92	110	217	java/lang/Throwable
    //   115	133	217	java/lang/Throwable
    //   138	147	217	java/lang/Throwable
    //   197	202	217	java/lang/Throwable
    //   209	214	217	java/lang/Throwable
    //   214	217	217	java/lang/Throwable
    //   165	197	221	finally
    //   154	165	239	finally
  }

  protected final void onPreExecute()
  {
    if (MessageViewFragment.e(this.a) != null)
      MessageViewFragment.e(this.a).a(2131296993, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.x
 * JD-Core Version:    0.6.2
 */