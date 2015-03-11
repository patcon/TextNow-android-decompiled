package textnow.q;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import textnow.u.r;
import textnow.u.t;

public final class g
{
  private static final String[] a = { "duration" };

  private static final Uri a(Context paramContext, File paramFile)
  {
    String str = paramFile.getName();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("title", str);
    localContentValues.put("description", "TextNow Photo");
    localContentValues.put("_data", paramFile.getAbsolutePath());
    try
    {
      Uri localUri = paramContext.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, localContentValues);
      return localUri;
    }
    catch (Throwable localThrowable)
    {
    }
    return null;
  }

  public static Uri a(Context paramContext, File paramFile, long paramLong)
  {
    boolean bool = paramFile.exists();
    Uri localUri = null;
    if (bool)
      localUri = b(paramContext, paramFile, paramLong);
    return localUri;
  }

  public static Uri a(Context paramContext, File paramFile, h paramh)
  {
    if (paramFile.exists());
    switch (1.a[paramh.ordinal()])
    {
    case 2:
    case 3:
    default:
      return null;
    case 1:
      return a(paramContext, paramFile);
    case 4:
    }
    return b(paramContext, paramFile, 30000L);
  }

  public static File a(Context paramContext, h paramh, long paramLong)
  {
    if (!Environment.getExternalStorageState().equals("mounted"))
      return null;
    Date localDate = new Date(paramLong);
    String.valueOf(paramLong);
    String str1;
    Object localObject;
    switch (1.a[paramh.ordinal()])
    {
    default:
      throw new RuntimeException("Illegal file type trying to be fetched");
    case 1:
      str1 = "/TextNow/TextNow Images";
      localObject = new SimpleDateFormat(paramContext.getString(2131493396)).format(localDate) + ".jpg";
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      File localFile = new File(Environment.getExternalStorageDirectory(), str1);
      if (!localFile.exists())
        localFile.mkdirs();
      try
      {
        String str2 = a(localFile, (String)localObject);
        localObject = str2;
        label161: return new File(localFile, (String)localObject);
        str1 = "/TextNow/TextNow Audio";
        localObject = new SimpleDateFormat(paramContext.getString(2131493397)).format(localDate) + ".3gp";
        continue;
        str1 = "/TextNow/TextNow Video";
        localObject = new SimpleDateFormat(paramContext.getString(2131493395)).format(localDate) + ".3gp";
        continue;
        str1 = "/TextNow/TextNow VM";
        localObject = new SimpleDateFormat(paramContext.getString(2131493398)).format(localDate) + ".wav";
      }
      catch (IOException localIOException)
      {
        break label161;
      }
    }
  }

  public static String a(Context paramContext, String paramString)
  {
    if (paramString.startsWith("content://"));
    while (true)
    {
      try
      {
        Cursor localCursor = paramContext.getContentResolver().query(Uri.parse(paramString), new String[] { "_data" }, null, null, null);
        if (localCursor == null)
          return null;
        try
        {
          if (!localCursor.moveToFirst())
            break label124;
          String str2 = localCursor.getString(0);
          str1 = str2;
          try
          {
            return str1;
          }
          catch (Exception localException2)
          {
          }
          new StringBuilder().append("Error querying ").append(paramString).toString();
          return str1;
        }
        finally
        {
          localCursor.close();
        }
      }
      catch (Exception localException1)
      {
        str1 = "";
        continue;
      }
      return Uri.parse(paramString).getPath();
      label124: String str1 = "";
    }
  }

  private static String a(File paramFile, String paramString)
  {
    try
    {
      File localFile = new File(paramFile, paramString);
      int i = paramString.lastIndexOf('.');
      String str1 = paramString.substring(0, i);
      String str2 = paramString.substring(i + 1);
      int k;
      for (int j = 1; localFile.exists(); j = k)
      {
        StringBuilder localStringBuilder = new StringBuilder().append(str1).append("_(");
        k = j + 1;
        paramString = j + ")." + str2;
        localFile = new File(paramFile, paramString);
      }
      localFile.createNewFile();
      return paramString;
    }
    finally
    {
    }
  }

  // ERROR //
  public static i a(Context paramContext, h paramh, java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: aload_1
    //   8: invokestatic 229	java/lang/System:currentTimeMillis	()J
    //   11: invokestatic 231	textnow/q/g:a	(Landroid/content/Context;Ltextnow/q/h;J)Ljava/io/File;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnull -12 -> 4
    //   19: new 119	java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   26: ldc 233
    //   28: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_3
    //   32: invokevirtual 43	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   35: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: pop
    //   42: new 235	java/io/FileOutputStream
    //   45: dup
    //   46: aload_3
    //   47: invokespecial 238	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   50: astore 5
    //   52: aload_2
    //   53: aload 5
    //   55: invokestatic 243	textnow/q/n:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   58: aload_2
    //   59: invokestatic 246	textnow/q/n:a	(Ljava/io/InputStream;)V
    //   62: aload 5
    //   64: invokestatic 249	textnow/q/n:a	(Ljava/io/OutputStream;)V
    //   67: new 251	textnow/q/i
    //   70: dup
    //   71: aload_3
    //   72: aload_0
    //   73: aload_3
    //   74: aload_1
    //   75: invokestatic 253	textnow/q/g:a	(Landroid/content/Context;Ljava/io/File;Ltextnow/q/h;)Landroid/net/Uri;
    //   78: invokespecial 256	textnow/q/i:<init>	(Ljava/io/File;Landroid/net/Uri;)V
    //   81: areturn
    //   82: astore 7
    //   84: aconst_null
    //   85: astore 5
    //   87: aload_3
    //   88: invokevirtual 66	java/io/File:exists	()Z
    //   91: ifeq +8 -> 99
    //   94: aload_3
    //   95: invokevirtual 259	java/io/File:delete	()Z
    //   98: pop
    //   99: aload_2
    //   100: invokestatic 246	textnow/q/n:a	(Ljava/io/InputStream;)V
    //   103: aload 5
    //   105: invokestatic 249	textnow/q/n:a	(Ljava/io/OutputStream;)V
    //   108: aconst_null
    //   109: areturn
    //   110: astore 4
    //   112: aconst_null
    //   113: astore 5
    //   115: aload 4
    //   117: astore 6
    //   119: aload_2
    //   120: invokestatic 246	textnow/q/n:a	(Ljava/io/InputStream;)V
    //   123: aload 5
    //   125: invokestatic 249	textnow/q/n:a	(Ljava/io/OutputStream;)V
    //   128: aload 6
    //   130: athrow
    //   131: astore 6
    //   133: goto -14 -> 119
    //   136: astore 10
    //   138: goto -51 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   19	52	82	java/lang/Exception
    //   19	52	110	finally
    //   52	58	131	finally
    //   87	99	131	finally
    //   52	58	136	java/lang/Exception
  }

  public static t a(Context paramContext)
  {
    String str = new r(paramContext).O();
    new StringBuilder().append("Retrieved voicemail: ").append(str).toString();
    Uri localUri = Uri.parse(str);
    Cursor localCursor = paramContext.getContentResolver().query(localUri, a, null, null, null);
    if (localCursor == null)
      throw new FileNotFoundException();
    while (true)
    {
      try
      {
        if (localCursor.moveToFirst())
        {
          i = localCursor.getInt(0) / 1000;
          new StringBuilder().append("Voicemail duration: ").append(i).toString();
          return new t(new File(a(paramContext, str)), i);
        }
      }
      finally
      {
        localCursor.close();
      }
      int i = 30;
    }
  }

  public static boolean a(String paramString)
  {
    String str = paramString.toLowerCase(Locale.ENGLISH);
    return (str.endsWith(".jpeg")) || (str.endsWith(".jpg")) || (str.endsWith(".png")) || (str.endsWith(".gif")) || (str.endsWith(".bmp"));
  }

  private static final Uri b(Context paramContext, File paramFile, long paramLong)
  {
    long l1 = System.currentTimeMillis();
    long l2 = paramFile.lastModified();
    Date localDate = new Date(l1);
    String str1 = new SimpleDateFormat(paramContext.getString(2131493004)).format(localDate);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("is_music", "0");
    localContentValues.put("title", str1);
    localContentValues.put("_data", paramFile.getAbsolutePath());
    localContentValues.put("date_added", Integer.valueOf((int)(l1 / 1000L)));
    localContentValues.put("date_modified", Integer.valueOf((int)(l2 / 1000L)));
    localContentValues.put("duration", Long.valueOf(paramLong));
    String str2;
    if (Build.VERSION.SDK_INT >= 10)
      str2 = "audio/3gpp";
    while (true)
    {
      localContentValues.put("mime_type", str2);
      localContentValues.put("album", "TextNow");
      localContentValues.put("artist", "TextNow");
      try
      {
        Uri localUri = paramContext.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, localContentValues);
        return localUri;
        str2 = "audio/amr";
      }
      catch (Throwable localThrowable)
      {
      }
    }
    return null;
  }

  public static boolean b(Context paramContext)
  {
    r localr = new r(paramContext);
    return paramContext.getContentResolver().query(Uri.parse(localr.O()), a, null, null, null) != null;
  }

  public static boolean b(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    String str;
    do
    {
      return false;
      str = a(paramContext, paramString);
    }
    while (TextUtils.isEmpty(str));
    try
    {
      boolean bool = new File(str).exists();
      return bool;
    }
    catch (Exception localException)
    {
      Log.getStackTraceString(localException);
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.g
 * JD-Core Version:    0.6.2
 */