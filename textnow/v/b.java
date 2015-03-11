package textnow.v;

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
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
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
import android.text.format.DateUtils;
import android.util.Log;
import android.util.Patterns;
import com.enflick.android.TextNow.tasks.GetIsPaidUserTask;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import textnow.z.u;

public final class b
{
  public static String a = null;
  private static PhoneNumberFormattingTextWatcher b = new PhoneNumberFormattingTextWatcher();
  private static SimpleDateFormat c = new SimpleDateFormat("MMM d yyyy, h:mma");
  private static SimpleDateFormat d = new SimpleDateFormat("MMM d yyyy");
  private static SimpleDateFormat e = new SimpleDateFormat("MMM d, h:mma");
  private static SimpleDateFormat f = new SimpleDateFormat("MMM d");
  private static SimpleDateFormat g = new SimpleDateFormat("EEE h:mma");
  private static SimpleDateFormat h = new SimpleDateFormat("EEE");
  private static SimpleDateFormat i = new SimpleDateFormat("h:mma");
  private static SimpleDateFormat j = new SimpleDateFormat("cccc, MMMM d yyyy");
  private static Calendar k = new GregorianCalendar();
  private static Calendar l = new GregorianCalendar();
  private static final String[] m = { "403", "587", "780", "825", "236", "250", "604", "672", "778", "204", "431", "506", "709", "902", "226", "249", "289", "343", "365", "416", "519", "613", "647", "705", "807", "905", "902", "418", "438", "450", "514", "579", "581", "819", "873", "306", "639", "867" };

  static
  {
    c.j.addAll(c.a);
    c.j.addAll(c.d);
    c.j.addAll(c.e);
    c.j.addAll(c.h);
    c.j.addAll(c.i);
    c.j.addAll(c.c);
    c.k.addAll(c.b);
    c.k.addAll(c.a);
    c.l.addAll(c.e);
    c.m.addAll(c.d);
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

  public static PowerManager.WakeLock a(Context paramContext, String paramString)
  {
    while (true)
    {
      boolean bool;
      try
      {
        PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
        int n = ((Integer)PowerManager.class.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").get(null)).intValue();
        int i1 = Build.VERSION.SDK_INT;
        if (i1 >= 17)
        {
          Class localClass = localPowerManager.getClass();
          Class[] arrayOfClass = new Class[1];
          arrayOfClass[0] = Integer.TYPE;
          Method localMethod = localClass.getDeclaredMethod("isWakeLockLevelSupported", arrayOfClass);
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(n);
          bool = ((Boolean)localMethod.invoke(localPowerManager, arrayOfObject)).booleanValue();
          break label194;
          if (i2 != 0)
          {
            PowerManager.WakeLock localWakeLock = localPowerManager.newWakeLock(n, paramString);
            localWakeLock.setReferenceCounted(false);
            return localWakeLock;
          }
        }
        else
        {
          i2 = 0;
          if (i1 < 14)
            continue;
          int i3 = ((Integer)localPowerManager.getClass().getDeclaredMethod("getSupportedWakeLockFlags", new Class[0]).invoke(localPowerManager, new Object[0])).intValue();
          if ((i3 & n) != 0)
            bool = true;
          else
            bool = false;
        }
      }
      catch (Exception localException)
      {
      }
      return null;
      label194: int i2 = bool;
    }
  }

  public static String a(int paramInt)
  {
    if (paramInt < 0)
      paramInt = 0;
    if (paramInt < 60)
      return paramInt + "s";
    if (paramInt < 3600)
    {
      int i4 = paramInt % 60;
      int i5 = paramInt / 60;
      String str2 = "" + i4;
      if (str2.length() == 1)
        str2 = "0" + str2;
      return i5 + ":" + str2;
    }
    int n = paramInt % 60;
    int i1 = paramInt / 60;
    int i2 = i1 % 60;
    int i3 = i1 / 60;
    String str1 = "" + n;
    if (str1.length() == 1)
      str1 = "0" + str1;
    return i3 + ":" + i2 + ":" + str1;
  }

  public static String a(long paramLong)
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm z").format(new Date(paramLong));
  }

  public static String a(long paramLong1, long paramLong2)
  {
    return a(new Date(paramLong1 - paramLong2), false);
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

  public static String a(Date paramDate, boolean paramBoolean)
  {
    Date localDate = new Date();
    k.setTime(paramDate);
    l.setTime(localDate);
    long l1 = (System.currentTimeMillis() - paramDate.getTime()) / 86400000L;
    SimpleDateFormat localSimpleDateFormat;
    if (l1 > 280L)
      if (paramBoolean)
        localSimpleDateFormat = d;
    while (true)
    {
      return localSimpleDateFormat.format(paramDate);
      localSimpleDateFormat = c;
      continue;
      if (l1 > 28L)
      {
        if (paramBoolean)
          localSimpleDateFormat = f;
        else
          localSimpleDateFormat = e;
      }
      else if (l1 > 6L)
      {
        if (paramBoolean)
          localSimpleDateFormat = f;
        else
          localSimpleDateFormat = e;
      }
      else if (k.get(5) != l.get(5))
      {
        if (paramBoolean)
          localSimpleDateFormat = h;
        else
          localSimpleDateFormat = g;
      }
      else
        localSimpleDateFormat = i;
    }
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
    String str = paramString4 + "\n\n" + e(paramContext);
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
    String str = e(paramContext);
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
    int n = 0;
    int i1 = 0;
    while (n < arrayOfChar.length)
    {
      if (Character.isUpperCase(arrayOfChar[n]))
      {
        arrayOfChar[n] = Character.toLowerCase(arrayOfChar[n]);
        i1 = 1;
      }
      n++;
    }
    if (i1 != 0)
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
      if (Build.MODEL.equalsIgnoreCase(str))
        return true;
    }
    return false;
  }

  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte1.length];
    for (int n = 0; n < paramArrayOfByte1.length; n++)
      arrayOfByte[n] = ((byte)(paramArrayOfByte1[n] ^ paramArrayOfByte2[(n % paramArrayOfByte2.length)]));
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

  public static String b(int paramInt)
  {
    if (paramInt == 0)
      return "0MB";
    float f1 = paramInt / 1024.0F;
    if (f1 < 1.0F)
      return paramInt + "MB";
    int n = (int)Math.floor(f1);
    if (f1 - n > 0.0F)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Float.valueOf(f1);
      return String.format("%.1fGB", arrayOfObject);
    }
    return n + "GB";
  }

  public static String b(long paramLong1, long paramLong2)
  {
    return a(new Date(paramLong1 - paramLong2), true);
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
    return b(c.j);
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
    int n = arrayOfNetworkInfo.length;
    for (int i1 = 0; i1 < n; i1++)
    {
      NetworkInfo localNetworkInfo = arrayOfNetworkInfo[i1];
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

  public static String c(long paramLong1, long paramLong2)
  {
    return DateUtils.getRelativeTimeSpanString(paramLong1 - paramLong2).toString();
  }

  public static boolean c()
  {
    return b(c.k);
  }

  public static boolean c(Context paramContext)
  {
    String str1 = b(new u(paramContext).c());
    if ((str1 == null) || (str1.length() != 10));
    while (true)
    {
      return false;
      String str2 = str1.substring(0, 3);
      String[] arrayOfString = m;
      int n = arrayOfString.length;
      for (int i1 = 0; i1 < n; i1++)
        if (arrayOfString[i1].equals(str2))
          return true;
    }
  }

  public static final boolean c(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.matches("^[2-9][0-9][0-9]$"));
  }

  public static String d(long paramLong1, long paramLong2)
  {
    Date localDate = new Date(paramLong1 - paramLong2);
    return j.format(localDate);
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
    return b(c.l);
  }

  @TargetApi(17)
  public static boolean d(Context paramContext)
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

  public static String e(long paramLong1, long paramLong2)
  {
    Date localDate = new Date(paramLong1 - paramLong2);
    return i.format(localDate);
  }

  public static String e(Context paramContext)
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

  public static String e(String paramString)
  {
    return a(paramString, false);
  }

  public static boolean e()
  {
    return b(c.m);
  }

  public static String f(String paramString)
  {
    String str = a(paramString, false);
    if ((str.length() == 10) || (str.length() == 11))
    {
      StringBuilder localStringBuilder = new StringBuilder(str);
      int n = str.length();
      localStringBuilder.insert(n - 4, '-');
      localStringBuilder.insert(n - 7, ") ");
      localStringBuilder.insert(n - 10, '(');
      if (n > 10)
        localStringBuilder.insert(n - 10, ' ');
      return localStringBuilder.toString();
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramString);
    b.afterTextChanged(localSpannableStringBuilder);
    return localSpannableStringBuilder.toString();
  }

  public static boolean f()
  {
    return Build.VERSION.SDK_INT >= 8;
  }

  public static boolean f(Context paramContext)
  {
    return ((ConnectivityManager)paramContext.getSystemService("connectivity")).getNetworkInfo(1).isConnected();
  }

  public static String g(String paramString)
  {
    return a(paramString, false).replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3");
  }

  public static e g(Context paramContext)
  {
    if ((!paramContext.getPackageManager().hasSystemFeature("android.hardware.telephony")) || (Build.MODEL.startsWith("BNTV2")) || (Build.MODEL.startsWith("BNRV")))
      return e.a;
    if (((TelephonyManager)paramContext.getSystemService("phone")).getSimState() != 5)
      return e.b;
    return e.c;
  }

  public static boolean h(Context paramContext)
  {
    int n;
    if (paramContext.checkCallingOrSelfPermission("android.permission.CALL_PRIVILEGED") == 0)
    {
      n = 1;
      if (n != 0)
        break label23;
    }
    label23: int i1;
    do
    {
      return false;
      n = 0;
      break;
      i1 = new u(paramContext).af();
      if (i1 == -1)
        break label47;
    }
    while (i1 != 1);
    return true;
    label47: String str = i(paramContext);
    if (!TextUtils.isEmpty(str))
      new GetIsPaidUserTask(str).b(paramContext);
    return true;
  }

  public static String i(Context paramContext)
  {
    if ((a.a) && (a != null))
      return a;
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    if (localTelephonyManager == null)
      return null;
    return localTelephonyManager.getDeviceId();
  }

  public static boolean j(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 19)
      return paramContext.getPackageName().equals(Telephony.Sms.getDefaultSmsPackage(paramContext));
    return false;
  }

  public static boolean k(Context paramContext)
  {
    return ((KeyguardManager)paramContext.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
  }

  public static boolean l(Context paramContext)
  {
    AudioManager localAudioManager = (AudioManager)paramContext.getSystemService("audio");
    if (localAudioManager == null)
      return true;
    if (Build.VERSION.SDK_INT >= 16);
    while (true)
    {
      int n;
      try
      {
        int i1 = Settings.System.getInt(paramContext.getContentResolver(), "vibrate_when_ringing");
        if (i1 == 1)
        {
          n = 1;
          if ((localAudioManager.getRingerMode() == 1) || (n != 0))
            break;
          return false;
        }
        n = 0;
        continue;
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
        localSettingNotFoundException.printStackTrace();
        n = 1;
        continue;
      }
      if (((localAudioManager.getVibrateSetting(0) == 2) && (localAudioManager.getRingerMode() == 0)) || (localAudioManager.getVibrateSetting(0) == 1))
        n = 1;
      else
        n = 0;
    }
  }

  public static boolean m(Context paramContext)
  {
    if (a.a)
      return true;
    boolean bool1 = o(paramContext);
    boolean bool2 = false;
    if (bool1)
      bool2 = n(paramContext);
    new StringBuilder().append("CDMA service availability ").append(bool2).toString();
    return bool2;
  }

  public static boolean n(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (localConnectivityManager != null)
      for (NetworkInfo localNetworkInfo : localConnectivityManager.getAllNetworkInfo())
        if (localNetworkInfo.getType() == 0)
        {
          localNetworkInfo.toString();
          return (localNetworkInfo.isAvailable()) && (!localNetworkInfo.isRoaming());
        }
    return false;
  }

  public static boolean o(Context paramContext)
  {
    if (a.a)
      return true;
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    return (localTelephonyManager != null) && (localTelephonyManager.getPhoneType() == 2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.b
 * JD-Core Version:    0.6.2
 */