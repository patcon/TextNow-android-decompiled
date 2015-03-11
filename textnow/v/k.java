package textnow.v;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.util.Log;
import java.io.InputStream;
import textnow.z.f;
import textnow.z.h;

public final class k
{
  // ERROR //
  public static long a(ContentResolver paramContentResolver, Uri paramUri)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: lconst_0
    //   5: lreturn
    //   6: aload_0
    //   7: aload_1
    //   8: iconst_1
    //   9: anewarray 10	java/lang/String
    //   12: dup
    //   13: iconst_0
    //   14: ldc 12
    //   16: aastore
    //   17: aconst_null
    //   18: aconst_null
    //   19: aconst_null
    //   20: invokevirtual 18	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   23: astore 5
    //   25: aload 5
    //   27: ifnull +53 -> 80
    //   30: aload 5
    //   32: invokeinterface 24 1 0
    //   37: ifeq +53 -> 90
    //   40: aload 5
    //   42: iconst_0
    //   43: invokeinterface 28 2 0
    //   48: lstore 8
    //   50: lload 8
    //   52: lstore_3
    //   53: aload 5
    //   55: invokeinterface 32 1 0
    //   60: lload_3
    //   61: lreturn
    //   62: astore 6
    //   64: aload 5
    //   66: invokeinterface 32 1 0
    //   71: aload 6
    //   73: athrow
    //   74: astore_2
    //   75: lconst_0
    //   76: lstore_3
    //   77: goto -17 -> 60
    //   80: lconst_0
    //   81: lstore_3
    //   82: goto -22 -> 60
    //   85: astore 7
    //   87: goto -27 -> 60
    //   90: lconst_0
    //   91: lstore_3
    //   92: goto -39 -> 53
    //
    // Exception table:
    //   from	to	target	type
    //   30	50	62	finally
    //   6	25	74	java/lang/Exception
    //   64	74	74	java/lang/Exception
    //   53	60	85	java/lang/Exception
  }

  public static Bitmap a(ContentResolver paramContentResolver, Uri paramUri, boolean paramBoolean)
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 14);
      InputStream localInputStream;
      for (Object localObject = ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri, paramBoolean); localObject != null; localObject = localInputStream)
      {
        return BitmapFactory.decodeStream((InputStream)localObject);
        localInputStream = ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri);
      }
    }
    catch (Exception localException)
    {
      Log.getStackTraceString(localException);
    }
    return null;
  }

  public static Uri a(long paramLong)
  {
    if (paramLong < 0L)
      return null;
    return ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, paramLong);
  }

  // ERROR //
  public static Uri a(ContentResolver paramContentResolver, String paramString, int paramInt)
  {
    // Byte code:
    //   0: new 74	java/util/HashSet
    //   3: dup
    //   4: invokespecial 77	java/util/HashSet:<init>	()V
    //   7: astore_3
    //   8: iload_2
    //   9: iconst_2
    //   10: if_icmpne +264 -> 274
    //   13: aload_3
    //   14: getstatic 82	android/provider/ContactsContract$PhoneLookup:CONTENT_FILTER_URI	Landroid/net/Uri;
    //   17: aload_1
    //   18: invokestatic 88	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   21: invokestatic 92	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   24: invokevirtual 96	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   27: pop
    //   28: aload_1
    //   29: invokestatic 101	textnow/v/b:b	(Ljava/lang/String;)Ljava/lang/String;
    //   32: astore 24
    //   34: aload 24
    //   36: ifnull +87 -> 123
    //   39: aload_3
    //   40: getstatic 82	android/provider/ContactsContract$PhoneLookup:CONTENT_FILTER_URI	Landroid/net/Uri;
    //   43: aload 24
    //   45: invokestatic 88	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   48: invokestatic 92	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   51: invokevirtual 96	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   54: pop
    //   55: aload_3
    //   56: getstatic 82	android/provider/ContactsContract$PhoneLookup:CONTENT_FILTER_URI	Landroid/net/Uri;
    //   59: new 103	java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   66: ldc 106
    //   68: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload 24
    //   73: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: invokestatic 88	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   82: invokestatic 92	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   85: invokevirtual 96	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   88: pop
    //   89: aload_3
    //   90: getstatic 82	android/provider/ContactsContract$PhoneLookup:CONTENT_FILTER_URI	Landroid/net/Uri;
    //   93: new 103	java/lang/StringBuilder
    //   96: dup
    //   97: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   100: ldc 116
    //   102: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: aload 24
    //   107: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: invokestatic 88	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   116: invokestatic 92	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   119: invokevirtual 96	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   122: pop
    //   123: ldc 118
    //   125: astore 4
    //   127: aload_3
    //   128: invokevirtual 122	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   131: astore 5
    //   133: aload 5
    //   135: invokeinterface 127 1 0
    //   140: istore 6
    //   142: aconst_null
    //   143: astore 7
    //   145: iload 6
    //   147: ifeq +124 -> 271
    //   150: aload 5
    //   152: invokeinterface 131 1 0
    //   157: checkcast 84	android/net/Uri
    //   160: astore 8
    //   162: aload 8
    //   164: ifnull -31 -> 133
    //   167: aload_0
    //   168: aload 8
    //   170: iconst_1
    //   171: anewarray 10	java/lang/String
    //   174: dup
    //   175: iconst_0
    //   176: aload 4
    //   178: aastore
    //   179: aconst_null
    //   180: aconst_null
    //   181: aconst_null
    //   182: invokevirtual 18	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   185: astore 15
    //   187: aload 15
    //   189: astore 10
    //   191: aload 10
    //   193: ifnull +229 -> 422
    //   196: aload 10
    //   198: invokeinterface 135 1 0
    //   203: ifle +219 -> 422
    //   206: aload 10
    //   208: invokeinterface 138 1 0
    //   213: pop
    //   214: aload 10
    //   216: aload 10
    //   218: aload 4
    //   220: invokeinterface 142 2 0
    //   225: invokeinterface 28 2 0
    //   230: lstore 19
    //   232: lload 19
    //   234: lstore 16
    //   236: aload 10
    //   238: ifnull +177 -> 415
    //   241: aload 10
    //   243: invokeinterface 32 1 0
    //   248: lload 16
    //   250: lstore 13
    //   252: lload 13
    //   254: ldc2_w 143
    //   257: lcmp
    //   258: ifeq -125 -> 133
    //   261: getstatic 65	android/provider/ContactsContract$Contacts:CONTENT_URI	Landroid/net/Uri;
    //   264: lload 13
    //   266: invokestatic 71	android/content/ContentUris:withAppendedId	(Landroid/net/Uri;J)Landroid/net/Uri;
    //   269: astore 7
    //   271: aload 7
    //   273: areturn
    //   274: iload_2
    //   275: iconst_3
    //   276: if_icmpne +25 -> 301
    //   279: aload_3
    //   280: getstatic 149	android/provider/ContactsContract$CommonDataKinds$Email:CONTENT_LOOKUP_URI	Landroid/net/Uri;
    //   283: aload_1
    //   284: invokestatic 88	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   287: invokestatic 92	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   290: invokevirtual 96	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   293: pop
    //   294: ldc 151
    //   296: astore 4
    //   298: goto -171 -> 127
    //   301: iload_2
    //   302: iconst_1
    //   303: if_icmpne +127 -> 430
    //   306: aload_3
    //   307: getstatic 149	android/provider/ContactsContract$CommonDataKinds$Email:CONTENT_LOOKUP_URI	Landroid/net/Uri;
    //   310: new 103	java/lang/StringBuilder
    //   313: dup
    //   314: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   317: aload_1
    //   318: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: ldc 153
    //   323: invokevirtual 110	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   329: invokestatic 88	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   332: invokestatic 92	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   335: invokevirtual 96	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   338: pop
    //   339: ldc 151
    //   341: astore 4
    //   343: goto -216 -> 127
    //   346: astore 11
    //   348: aconst_null
    //   349: astore 10
    //   351: aload 11
    //   353: invokestatic 60	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   356: pop
    //   357: aload 10
    //   359: ifnull +48 -> 407
    //   362: aload 10
    //   364: invokeinterface 32 1 0
    //   369: ldc2_w 143
    //   372: lstore 13
    //   374: goto -122 -> 252
    //   377: astore 9
    //   379: aconst_null
    //   380: astore 10
    //   382: aload 10
    //   384: ifnull +10 -> 394
    //   387: aload 10
    //   389: invokeinterface 32 1 0
    //   394: aload 9
    //   396: athrow
    //   397: astore 9
    //   399: goto -17 -> 382
    //   402: astore 11
    //   404: goto -53 -> 351
    //   407: ldc2_w 143
    //   410: lstore 13
    //   412: goto -160 -> 252
    //   415: lload 16
    //   417: lstore 13
    //   419: goto -167 -> 252
    //   422: ldc2_w 143
    //   425: lstore 16
    //   427: goto -191 -> 236
    //   430: aconst_null
    //   431: astore 4
    //   433: goto -306 -> 127
    //
    // Exception table:
    //   from	to	target	type
    //   167	187	346	java/lang/Exception
    //   167	187	377	finally
    //   196	232	397	finally
    //   351	357	397	finally
    //   196	232	402	java/lang/Exception
  }

  // ERROR //
  public static String a(ContentResolver paramContentResolver, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_1
    //   7: invokestatic 161	textnow/v/k:a	(Ljava/lang/String;)Z
    //   10: ifeq +6 -> 16
    //   13: ldc 163
    //   15: areturn
    //   16: getstatic 82	android/provider/ContactsContract$PhoneLookup:CONTENT_FILTER_URI	Landroid/net/Uri;
    //   19: aload_1
    //   20: invokestatic 88	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   23: invokestatic 92	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   26: astore_2
    //   27: iconst_1
    //   28: anewarray 10	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: ldc 165
    //   35: aastore
    //   36: astore_3
    //   37: aload_0
    //   38: aload_2
    //   39: aload_3
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: invokevirtual 18	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore 6
    //   48: aload 6
    //   50: ifnull +77 -> 127
    //   53: aload 6
    //   55: invokeinterface 24 1 0
    //   60: ifeq +61 -> 121
    //   63: aload 6
    //   65: iconst_0
    //   66: invokeinterface 169 2 0
    //   71: astore 9
    //   73: aload 9
    //   75: astore 7
    //   77: aload 6
    //   79: invokeinterface 32 1 0
    //   84: aload 7
    //   86: ifnonnull +9 -> 95
    //   89: aload_1
    //   90: invokestatic 172	textnow/v/b:f	(Ljava/lang/String;)Ljava/lang/String;
    //   93: astore 7
    //   95: aload 7
    //   97: areturn
    //   98: astore 5
    //   100: aload_1
    //   101: invokestatic 172	textnow/v/b:f	(Ljava/lang/String;)Ljava/lang/String;
    //   104: areturn
    //   105: astore 4
    //   107: aload_1
    //   108: areturn
    //   109: astore 8
    //   111: aload 6
    //   113: invokeinterface 32 1 0
    //   118: aload 8
    //   120: athrow
    //   121: aconst_null
    //   122: astore 7
    //   124: goto -47 -> 77
    //   127: aconst_null
    //   128: astore 7
    //   130: goto -46 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   37	48	98	android/database/sqlite/SQLiteException
    //   37	48	105	java/lang/RuntimeException
    //   53	73	109	finally
  }

  public static f a(ContentResolver paramContentResolver, h paramh, f paramf)
  {
    if ((paramh == null) || (paramh.d() == 5));
    Uri localUri1;
    String str2;
    do
    {
      String str1;
      while (true)
      {
        return null;
        str1 = paramh.h();
        if (a(paramContentResolver, paramf.a(), paramf.b()) == null)
        {
          if ((!h.c(paramf.d())) || (!h.c(str1)))
          {
            Uri localUri4 = Uri.parse(paramh.b());
            ContentValues localContentValues3 = new ContentValues();
            localContentValues3.put("contact_uri", "NON_CONTACT");
            if (b.a(paramf.a()));
            for (String str5 = b.f(paramf.a()); ; str5 = paramf.a())
            {
              if (str5 != null)
                localContentValues3.put("contact_name", str5);
              paramContentResolver.update(localUri4, localContentValues3, null, null);
              return new f(paramf.a(), paramf.b(), str5, "NON_CONTACT");
            }
          }
        }
        else
        {
          if (!h.c(str1))
            break;
          String str3 = paramf.d();
          if (!h.c(str3));
          for (Uri localUri2 = Uri.parse(str3); localUri2 != null; localUri2 = a(paramContentResolver, paramf.a(), paramf.b()))
          {
            Uri localUri3 = Uri.parse(paramh.b());
            ContentValues localContentValues2 = new ContentValues();
            localContentValues2.put("contact_uri", localUri2.toString());
            String str4 = b(paramContentResolver, localUri2);
            if (str4 != null)
              localContentValues2.put("contact_name", str4);
            paramContentResolver.update(localUri3, localContentValues2, null, null);
            return new f(paramf.a(), paramf.b(), str4, localUri2.toString());
          }
        }
      }
      localUri1 = Uri.parse(str1);
      str2 = b(paramContentResolver, localUri1);
    }
    while ((str2 == null) || (str2.equals(paramh.e())));
    ContentValues localContentValues1 = new ContentValues();
    localContentValues1.put("contact_name", str2);
    paramContentResolver.update(Uri.parse(paramh.b()), localContentValues1, null, null);
    return new f(paramf.a(), paramf.b(), str2, localUri1.toString());
  }

  public static void a(Activity paramActivity, String paramString, boolean paramBoolean)
  {
    Intent localIntent = new Intent("android.intent.action.INSERT_OR_EDIT");
    localIntent.setType("vnd.android.cursor.item/contact");
    localIntent.putExtra("finishActivityOnSaveCompleted", true);
    if (paramBoolean)
    {
      localIntent.putExtra("phone", paramString);
      localIntent.putExtra("phone_type", "TextNow");
    }
    while (true)
    {
      paramActivity.startActivityForResult(Intent.createChooser(localIntent, ""), 17);
      return;
      localIntent.putExtra("email", paramString);
      localIntent.putExtra("email_type", "TextNow");
    }
  }

  public static void a(ContentResolver paramContentResolver, Uri paramUri, String paramString, int paramInt)
  {
    Uri localUri = a(paramContentResolver, paramString, paramInt);
    ContentValues localContentValues = new ContentValues();
    if (localUri == null);
    for (String str1 = "NON_CONTACT"; ; str1 = localUri.toString())
    {
      localContentValues.put("contact_uri", str1);
      if (localUri != null)
      {
        String str2 = b(paramContentResolver, localUri);
        if (str2 != null)
          localContentValues.put("contact_name", str2);
      }
      paramContentResolver.update(paramUri, localContentValues, null, null);
      return;
    }
  }

  public static boolean a(String paramString)
  {
    return ("12999999999".equals(paramString)) || ("2999999999".equals(paramString));
  }

  @TargetApi(11)
  public static String b(ContentResolver paramContentResolver, Uri paramUri)
  {
    if (paramUri == null);
    Cursor localCursor;
    do
    {
      return null;
      localCursor = paramContentResolver.query(paramUri, new String[] { "display_name" }, null, null, null);
    }
    while (localCursor == null);
    try
    {
      boolean bool = localCursor.moveToFirst();
      Object localObject2 = null;
      if (bool)
      {
        String str = localCursor.getString(0);
        localObject2 = str;
      }
      return localObject2;
    }
    finally
    {
      localCursor.close();
    }
  }

  public static String b(ContentResolver paramContentResolver, String paramString)
  {
    if ((paramString == null) || (TextUtils.isEmpty(paramString.trim())))
      paramString = "";
    label91: 
    while (true)
    {
      return paramString;
      if (a(paramString))
        return "Unknown Number";
      Uri localUri;
      if (b.a(paramString))
        localUri = a(paramContentResolver, paramString, 2);
      while (true)
      {
        if (localUri == null)
          break label91;
        String str = b(paramContentResolver, localUri);
        if (TextUtils.isEmpty(str))
          break;
        return str;
        if (paramString.contains("@"))
          localUri = a(paramContentResolver, paramString, 3);
        else
          localUri = a(paramContentResolver, paramString, 1);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.k
 * JD-Core Version:    0.6.2
 */