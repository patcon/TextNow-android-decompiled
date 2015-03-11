package textnow.q;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.util.Log;
import java.io.InputStream;
import textnow.u.d;
import textnow.u.f;

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
    //   0: iload_2
    //   1: iconst_2
    //   2: if_icmpne +121 -> 123
    //   5: getstatic 51	android/provider/ContactsContract$PhoneLookup:CONTENT_FILTER_URI	Landroid/net/Uri;
    //   8: aload_1
    //   9: invokestatic 57	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   12: astore_3
    //   13: ldc 59
    //   15: astore 4
    //   17: aload_3
    //   18: ifnull +230 -> 248
    //   21: aload_0
    //   22: aload_3
    //   23: iconst_1
    //   24: anewarray 10	java/lang/String
    //   27: dup
    //   28: iconst_0
    //   29: aload 4
    //   31: aastore
    //   32: aconst_null
    //   33: aconst_null
    //   34: aconst_null
    //   35: invokevirtual 18	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   38: astore 11
    //   40: aload 11
    //   42: astore 6
    //   44: aload 6
    //   46: ifnull +219 -> 265
    //   49: aload 6
    //   51: invokeinterface 63 1 0
    //   56: ifle +209 -> 265
    //   59: aload 6
    //   61: invokeinterface 66 1 0
    //   66: pop
    //   67: aload 6
    //   69: aload 6
    //   71: aload 4
    //   73: invokeinterface 70 2 0
    //   78: invokeinterface 28 2 0
    //   83: lstore 15
    //   85: lload 15
    //   87: lstore 12
    //   89: aload 6
    //   91: ifnull +167 -> 258
    //   94: aload 6
    //   96: invokeinterface 32 1 0
    //   101: lload 12
    //   103: lstore 9
    //   105: lload 9
    //   107: ldc2_w 71
    //   110: lcmp
    //   111: ifeq +137 -> 248
    //   114: getstatic 39	android/provider/ContactsContract$Contacts:CONTENT_URI	Landroid/net/Uri;
    //   117: lload 9
    //   119: invokestatic 45	android/content/ContentUris:withAppendedId	(Landroid/net/Uri;J)Landroid/net/Uri;
    //   122: areturn
    //   123: iload_2
    //   124: iconst_3
    //   125: if_icmpne +21 -> 146
    //   128: getstatic 77	android/provider/ContactsContract$CommonDataKinds$Email:CONTENT_LOOKUP_URI	Landroid/net/Uri;
    //   131: aload_1
    //   132: invokestatic 81	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   135: invokestatic 57	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   138: astore_3
    //   139: ldc 83
    //   141: astore 4
    //   143: goto -126 -> 17
    //   146: iload_2
    //   147: iconst_1
    //   148: if_icmpne +125 -> 273
    //   151: getstatic 77	android/provider/ContactsContract$CommonDataKinds$Email:CONTENT_LOOKUP_URI	Landroid/net/Uri;
    //   154: new 85	java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial 88	java/lang/StringBuilder:<init>	()V
    //   161: aload_1
    //   162: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: ldc 94
    //   167: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokestatic 81	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   176: invokestatic 57	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   179: astore_3
    //   180: ldc 83
    //   182: astore 4
    //   184: goto -167 -> 17
    //   187: astore 7
    //   189: aconst_null
    //   190: astore 6
    //   192: aload 7
    //   194: invokestatic 104	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   197: pop
    //   198: aload 6
    //   200: ifnull +50 -> 250
    //   203: aload 6
    //   205: invokeinterface 32 1 0
    //   210: ldc2_w 71
    //   213: lstore 9
    //   215: goto -110 -> 105
    //   218: astore 5
    //   220: aconst_null
    //   221: astore 6
    //   223: aload 6
    //   225: ifnull +10 -> 235
    //   228: aload 6
    //   230: invokeinterface 32 1 0
    //   235: aload 5
    //   237: athrow
    //   238: astore 5
    //   240: goto -17 -> 223
    //   243: astore 7
    //   245: goto -53 -> 192
    //   248: aconst_null
    //   249: areturn
    //   250: ldc2_w 71
    //   253: lstore 9
    //   255: goto -150 -> 105
    //   258: lload 12
    //   260: lstore 9
    //   262: goto -157 -> 105
    //   265: ldc2_w 71
    //   268: lstore 12
    //   270: goto -181 -> 89
    //   273: aconst_null
    //   274: astore_3
    //   275: aconst_null
    //   276: astore 4
    //   278: goto -261 -> 17
    //
    // Exception table:
    //   from	to	target	type
    //   21	40	187	java/lang/Exception
    //   21	40	218	finally
    //   49	85	238	finally
    //   192	198	238	finally
    //   49	85	243	java/lang/Exception
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
    //   7: invokestatic 112	textnow/q/k:a	(Ljava/lang/String;)Z
    //   10: ifeq +6 -> 16
    //   13: ldc 114
    //   15: areturn
    //   16: getstatic 51	android/provider/ContactsContract$PhoneLookup:CONTENT_FILTER_URI	Landroid/net/Uri;
    //   19: aload_1
    //   20: invokestatic 81	android/net/Uri:encode	(Ljava/lang/String;)Ljava/lang/String;
    //   23: invokestatic 57	android/net/Uri:withAppendedPath	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   26: astore_2
    //   27: iconst_1
    //   28: anewarray 10	java/lang/String
    //   31: dup
    //   32: iconst_0
    //   33: ldc 116
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
    //   66: invokeinterface 120 2 0
    //   71: astore 9
    //   73: aload 9
    //   75: astore 7
    //   77: aload 6
    //   79: invokeinterface 32 1 0
    //   84: aload 7
    //   86: ifnonnull +9 -> 95
    //   89: aload_1
    //   90: invokestatic 125	textnow/q/b:f	(Ljava/lang/String;)Ljava/lang/String;
    //   93: astore 7
    //   95: aload 7
    //   97: areturn
    //   98: astore 5
    //   100: aload_1
    //   101: invokestatic 125	textnow/q/b:f	(Ljava/lang/String;)Ljava/lang/String;
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

  public static d a(ContentResolver paramContentResolver, f paramf, d paramd)
  {
    if ((paramf == null) || (paramf.d() == 5));
    Uri localUri1;
    String str2;
    do
    {
      String str1;
      while (true)
      {
        return null;
        str1 = paramf.h();
        if (a(paramContentResolver, paramd.a(), paramd.b()) == null)
        {
          if ((!f.c(paramd.d())) || (!f.c(str1)))
          {
            Uri localUri4 = Uri.parse(paramf.b());
            ContentValues localContentValues3 = new ContentValues();
            localContentValues3.put("contact_uri", "NON_CONTACT");
            if (b.a(paramd.a()));
            for (String str5 = b.f(paramd.a()); ; str5 = paramd.a())
            {
              if (str5 != null)
                localContentValues3.put("contact_name", str5);
              paramContentResolver.update(localUri4, localContentValues3, null, null);
              return new d(paramd.a(), paramd.b(), str5, "NON_CONTACT");
            }
          }
        }
        else
        {
          if (!f.c(str1))
            break;
          String str3 = paramd.d();
          if (!f.c(str3));
          for (Uri localUri2 = Uri.parse(str3); localUri2 != null; localUri2 = a(paramContentResolver, paramd.a(), paramd.b()))
          {
            Uri localUri3 = Uri.parse(paramf.b());
            ContentValues localContentValues2 = new ContentValues();
            localContentValues2.put("contact_uri", localUri2.toString());
            String str4 = b(paramContentResolver, localUri2);
            if (str4 != null)
              localContentValues2.put("contact_name", str4);
            paramContentResolver.update(localUri3, localContentValues2, null, null);
            return new d(paramd.a(), paramd.b(), str4, localUri2.toString());
          }
        }
      }
      localUri1 = Uri.parse(str1);
      str2 = b(paramContentResolver, localUri1);
    }
    while ((str2 == null) || (str2.equals(paramf.e())));
    ContentValues localContentValues1 = new ContentValues();
    localContentValues1.put("contact_name", str2);
    paramContentResolver.update(Uri.parse(paramf.b()), localContentValues1, null, null);
    return new d(paramd.a(), paramd.b(), str2, localUri1.toString());
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
    label89: 
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
          break label89;
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

  public static Bitmap c(ContentResolver paramContentResolver, Uri paramUri)
  {
    try
    {
      InputStream localInputStream = ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri);
      Object localObject = null;
      if (localInputStream != null)
      {
        Bitmap localBitmap = BitmapFactory.decodeStream(localInputStream);
        localObject = localBitmap;
      }
      return localObject;
    }
    catch (Exception localException)
    {
      Log.getStackTraceString(localException);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.k
 * JD-Core Version:    0.6.2
 */