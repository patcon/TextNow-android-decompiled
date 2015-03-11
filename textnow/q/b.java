package textnow.q;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.provider.Telephony.Sms;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import textnow.u.r;

public final class b
{
  private static PhoneNumberFormattingTextWatcher a = new PhoneNumberFormattingTextWatcher();
  private static SimpleDateFormat b = new SimpleDateFormat("MMM d, yyyy");
  private static SimpleDateFormat c = new SimpleDateFormat("MMM d");
  private static SimpleDateFormat d = new SimpleDateFormat("hh:mm a");
  private static final String[] e = { "403", "587", "780", "825", "236", "250", "604", "672", "778", "204", "431", "506", "709", "902", "226", "249", "289", "343", "365", "416", "519", "613", "647", "705", "807", "905", "902", "418", "438", "450", "514", "579", "581", "819", "873", "306", "639", "867" };

  static
  {
    c.i.addAll(c.a);
    c.i.addAll(c.c);
    c.i.addAll(c.d);
    c.i.addAll(c.g);
    c.i.addAll(c.h);
    c.j.addAll(c.b);
    c.j.addAll(c.a);
    c.k.addAll(c.d);
    c.l.addAll(c.c);
  }

  public static Uri a(Context paramContext, String paramString, boolean paramBoolean)
  {
    File localFile = new File(paramContext.getExternalCacheDir(), "exported_conversation.txt");
    if (localFile.exists())
      localFile.delete();
    Html.fromHtml(paramString).toString();
    try
    {
      localFile.createNewFile();
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      localFileOutputStream.write(paramString.getBytes());
      localFileOutputStream.close();
      return Uri.fromFile(localFile);
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return null;
  }

  public static String a(int paramInt)
  {
    if (paramInt == 0)
      return "0MB";
    float f = paramInt / 1024.0F;
    if (f < 1.0F)
      return paramInt + "MB";
    int i = (int)Math.floor(f);
    if (f - i > 0.0F)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Float.valueOf(f);
      return String.format("%.1fGB", arrayOfObject);
    }
    return i + "GB";
  }

  public static String a(long paramLong)
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm z").format(new Date(paramLong));
  }

  public static String a(long paramLong1, long paramLong2)
  {
    return a(new Date(paramLong1 - paramLong2));
  }

  public static String a(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return str;
    }
    catch (Exception localException)
    {
      Log.getStackTraceString(localException);
    }
    return "NA";
  }

  public static String a(Iterable<? extends Object> paramIterable, String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (localObject != null)
      {
        localStringBuffer.append(localObject);
        localStringBuffer.append(paramString);
      }
    }
    String str = localStringBuffer.toString();
    if (localStringBuffer.length() > paramString.length())
      str = localStringBuffer.substring(0, localStringBuffer.length() - paramString.length());
    return str;
  }

  public static String a(String paramString1, String paramString2)
  {
    Date localDate = d(paramString1);
    return new SimpleDateFormat(paramString2).format(localDate);
  }

  public static String a(String paramString, boolean paramBoolean)
  {
    if (paramString == null)
      return "";
    if ((paramBoolean) && (paramString.startsWith("+")))
      return "+" + paramString.replaceAll("[^\\d]", "");
    return paramString.replaceAll("[^\\d]", "");
  }

  public static String a(Date paramDate)
  {
    Date localDate = new Date();
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    GregorianCalendar localGregorianCalendar2 = new GregorianCalendar();
    localGregorianCalendar1.setTime(paramDate);
    localGregorianCalendar2.setTime(localDate);
    if (localGregorianCalendar1.get(1) != localGregorianCalendar2.get(1))
      return b.format(paramDate);
    if (localGregorianCalendar1.get(5) != localGregorianCalendar2.get(5))
      return c.format(paramDate);
    return d.format(paramDate);
  }

  public static String a(Object[] paramArrayOfObject, String paramString)
  {
    return a(Arrays.asList(paramArrayOfObject), paramString);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Uri paramUri, String paramString3)
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("text/html");
    localIntent.putExtra("android.intent.extra.EMAIL", new String[] { paramString3 });
    localIntent.putExtra("android.intent.extra.SUBJECT", paramString1);
    if (paramUri != null)
      localIntent.putExtra("android.intent.extra.STREAM", paramUri);
    localIntent.addFlags(268435456);
    localIntent.putExtra("android.intent.extra.TEXT", Html.fromHtml(paramString2));
    paramContext.startActivity(localIntent);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    String str = paramString4 + "\n\n" + f(paramContext);
    Uri localUri = b(paramContext, paramString3, paramBoolean);
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("text/html");
    localIntent.putExtra("android.intent.extra.EMAIL", new String[] { paramString1 });
    localIntent.putExtra("android.intent.extra.SUBJECT", paramString2);
    localIntent.putExtra("android.intent.extra.TEXT", str);
    localIntent.addFlags(268435456);
    if (localUri != null)
      localIntent.putExtra("android.intent.extra.STREAM", localUri);
    paramContext.startActivity(localIntent);
  }

  public static void a(Context paramContext, d paramd)
  {
    String str = f(paramContext);
    Uri localUri = b(paramContext, str, true);
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("text/html");
    localIntent.putExtra("android.intent.extra.EMAIL", new String[] { "textnow.android.feedback@enflick.com" });
    localIntent.putExtra("android.intent.extra.SUBJECT", "TextNow " + a(paramContext) + " " + paramd.toString());
    localIntent.addFlags(268435456);
    localIntent.putExtra("android.intent.extra.TEXT", str);
    if (localUri != null)
      localIntent.putExtra("android.intent.extra.STREAM", localUri);
    paramContext.startActivity(localIntent);
  }

  public static boolean a()
  {
    return Build.MANUFACTURER.equalsIgnoreCase("amazon");
  }

  public static boolean a(char paramChar)
  {
    if ((('A' <= paramChar) && (paramChar <= 'Z')) || (('a' <= paramChar) && (paramChar <= 'z')));
    while (('0' <= paramChar) && (paramChar <= '9'))
      return true;
    return false;
  }

  public static boolean a(long paramLong, String paramString)
  {
    return new SimpleDateFormat("yyyy-MM-dd").format(new Date(paramLong + new Date().getTime())).compareTo(paramString) >= 0;
  }

  public static boolean a(Editable paramEditable)
  {
    char[] arrayOfChar = paramEditable.toString().toCharArray();
    int i = 0;
    int j = 0;
    while (i < arrayOfChar.length)
    {
      if (Character.isUpperCase(arrayOfChar[i]))
      {
        arrayOfChar[i] = Character.toLowerCase(arrayOfChar[i]);
        j = 1;
      }
      i++;
    }
    if (j != 0)
      paramEditable.replace(0, paramEditable.length(), new String(arrayOfChar).trim());
    return true;
  }

  public static final boolean a(CharSequence paramCharSequence)
  {
    try
    {
      boolean bool = Patterns.EMAIL_ADDRESS.matcher(paramCharSequence).matches();
      return bool;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public static boolean a(String paramString)
  {
    if (paramString == null)
      return false;
    return paramString.replaceAll("[^\\d]", "").matches("^(?:\\+?1[-. ]?)?\\(?([0-9]{3})\\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$");
  }

  public static boolean a(List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (Build.MODEL.equals(str))
        return true;
    }
    return false;
  }

  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte1.length];
    for (int i = 0; i < paramArrayOfByte1.length; i++)
      arrayOfByte[i] = ((byte)(paramArrayOfByte1[i] ^ paramArrayOfByte2[(i % paramArrayOfByte2.length)]));
    return arrayOfByte;
  }

  private static Uri b(Context paramContext, String paramString, boolean paramBoolean)
  {
    try
    {
      File localFile = new File(paramContext.getExternalCacheDir(), "TextNowLog.txt");
      if (localFile.exists())
        localFile.delete();
      localFile.createNewFile();
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      localFileOutputStream.write(paramString.getBytes());
      if (paramBoolean)
      {
        InputStream localInputStream = Runtime.getRuntime().exec("logcat -d").getInputStream();
        n.a(localInputStream, localFileOutputStream);
        localInputStream.close();
      }
      localFileOutputStream.close();
      Uri localUri = Uri.fromFile(localFile);
      return localUri;
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }

  public static String b(String paramString)
  {
    String str;
    if (!a(paramString))
      str = null;
    do
    {
      return str;
      str = a(paramString, false);
    }
    while (str.length() != 11);
    return str.substring(1);
  }

  public static boolean b()
  {
    return b(c.i);
  }

  public static boolean b(char paramChar)
  {
    return (('A' <= paramChar) && (paramChar <= 'Z')) || (('a' <= paramChar) && (paramChar <= 'z'));
  }

  public static boolean b(Context paramContext)
  {
    NetworkInfo[] arrayOfNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getAllNetworkInfo();
    if (arrayOfNetworkInfo == null)
      return false;
    int i = arrayOfNetworkInfo.length;
    for (int j = 0; j < i; j++)
    {
      NetworkInfo localNetworkInfo = arrayOfNetworkInfo[j];
      if ((localNetworkInfo != null) && ((localNetworkInfo.getState() == NetworkInfo.State.CONNECTED) || (localNetworkInfo.getState() == NetworkInfo.State.CONNECTING)))
        return true;
    }
    return false;
  }

  public static boolean b(List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (Build.MODEL.toUpperCase().startsWith(str.toUpperCase()))
        return true;
    }
    return false;
  }

  public static boolean c()
  {
    return b(c.j);
  }

  public static boolean c(Context paramContext)
  {
    String str1 = b(new r(paramContext).c());
    if ((str1 == null) || (str1.length() != 10));
    while (true)
    {
      return false;
      String str2 = str1.substring(0, 3);
      String[] arrayOfString = e;
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
        if (arrayOfString[j].equals(str2))
          return true;
    }
  }

  public static final boolean c(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.matches("^[2-9][0-9][0-9]$"));
  }

  public static Date d(String paramString)
  {
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        String str = paramString.replace("Z", "+0000");
        Date localDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(str);
        return localDate;
      }
    }
    catch (Exception localException)
    {
      Log.getStackTraceString(localException);
    }
    return new Date();
  }

  public static boolean d()
  {
    return b(c.k);
  }

  public static boolean d(Context paramContext)
  {
    NetworkInfo[] arrayOfNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getAllNetworkInfo();
    int j;
    if (arrayOfNetworkInfo != null)
    {
      int i = arrayOfNetworkInfo.length;
      j = 0;
      if (j < i)
      {
        NetworkInfo localNetworkInfo = arrayOfNetworkInfo[j];
        if ((localNetworkInfo == null) || (!localNetworkInfo.isRoaming()));
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      new StringBuilder().append("roaming ").append(bool).toString();
      return bool;
      j++;
      break;
    }
  }

  public static String e(String paramString)
  {
    return a(paramString, false);
  }

  public static boolean e()
  {
    return b(c.l);
  }

  @TargetApi(17)
  public static boolean e(Context paramContext)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT < 17)
      if (Settings.System.getInt(paramContext.getContentResolver(), "airplane_mode_on", 0) == 0);
    while (true)
    {
      new StringBuilder().append("airplane mode ").append(bool).toString();
      return bool;
      bool = false;
      continue;
      if (Settings.Global.getInt(paramContext.getContentResolver(), "airplane_mode_on", 0) == 0)
        bool = false;
    }
  }

  public static String f(Context paramContext)
  {
    String str = "";
    try
    {
      str = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      label20: return "App Version: " + str + "\nDevice Info: " + Build.MANUFACTURER + " " + Build.MODEL + " Android version " + Build.VERSION.RELEASE + "\n";
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label20;
    }
  }

  public static String f(String paramString)
  {
    String str = a(paramString, false);
    if ((str.length() == 10) || (str.length() == 11))
    {
      StringBuilder localStringBuilder = new StringBuilder(str);
      int i = str.length();
      localStringBuilder.insert(i - 4, '-');
      localStringBuilder.insert(i - 7, ") ");
      localStringBuilder.insert(i - 10, '(');
      if (i > 10)
        localStringBuilder.insert(i - 10, ' ');
      return localStringBuilder.toString();
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramString);
    a.afterTextChanged(localSpannableStringBuilder);
    return localSpannableStringBuilder.toString();
  }

  public static String g(String paramString)
  {
    return a(paramString, false).replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3");
  }

  public static boolean g(Context paramContext)
  {
    return ((ConnectivityManager)paramContext.getSystemService("connectivity")).getNetworkInfo(1).isConnected();
  }

  public static e h(Context paramContext)
  {
    if ((!paramContext.getPackageManager().hasSystemFeature("android.hardware.telephony")) || (Build.MODEL.startsWith("BNTV2")) || (Build.MODEL.startsWith("BNRV")))
      return e.a;
    if (((TelephonyManager)paramContext.getSystemService("phone")).getSimState() != 5)
      return e.b;
    return e.c;
  }

  public static boolean i(Context paramContext)
  {
    return paramContext.checkCallingOrSelfPermission("android.permission.CALL_PRIVILEGED") == 0;
  }

  public static String j(Context paramContext)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    if (localTelephonyManager == null)
      return null;
    return localTelephonyManager.getDeviceId();
  }

  public static boolean k(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 19)
      return paramContext.getPackageName().equals(Telephony.Sms.getDefaultSmsPackage(paramContext));
    return false;
  }

  public static boolean l(Context paramContext)
  {
    return ((KeyguardManager)paramContext.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
  }

  public static boolean m(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    if (localAudioManager == null)
      return true;
    if (Build.VERSION.SDK_INT >= 16);
    while (true)
    {
      int i;
      try
      {
        int j = Settings.System.getInt(paramContext.getContentResolver(), "vibrate_when_ringing");
        if (j == 1)
        {
          i = 1;
          if ((localAudioManager.getRingerMode() == 1) || (i != 0))
            break;
          return false;
        }
        i = 0;
        continue;
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
        localSettingNotFoundException.printStackTrace();
        i = 1;
        continue;
      }
      if (((localAudioManager.getVibrateSetting(0) == 2) && (localAudioManager.getRingerMode() == 0)) || (localAudioManager.getVibrateSetting(0) == 1))
        i = 1;
      else
        i = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.b
 * JD-Core Version:    0.6.2
 */