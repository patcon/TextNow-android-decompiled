package cz.acrobits.ali;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

public class AndroidUtil
{
  private static final String TAG = "AndroidUtil";
  public static final Handler handler = new Handler(Looper.getMainLooper());
  private static Context sContext = null;

  public static native void checkAllNativeClassesImplemented();

  public static <T> T coalesce(T paramT1, T paramT2)
  {
    if (paramT1 != null)
      return paramT1;
    return paramT2;
  }

  public static <T> T coalesce(T paramT1, T paramT2, T paramT3)
  {
    if (paramT1 != null)
      return paramT1;
    if (paramT2 != null)
      return paramT2;
    return paramT3;
  }

  public static <T> T coalesce(T paramT1, T paramT2, T paramT3, T paramT4)
  {
    if (paramT1 != null)
      return paramT1;
    if (paramT2 != null)
      return paramT2;
    if (paramT3 != null)
      return paramT3;
    return paramT4;
  }

  public static <T> T coalesce(T paramT1, T paramT2, T paramT3, T paramT4, T paramT5)
  {
    if (paramT1 != null)
      return paramT1;
    if (paramT2 != null)
      return paramT2;
    if (paramT3 != null)
      return paramT3;
    if (paramT4 != null)
      return paramT4;
    return paramT5;
  }

  public static <T> T coalesce(T[] paramArrayOfT)
  {
    int i = paramArrayOfT.length;
    for (int j = 0; j < i; j++)
    {
      T ? = paramArrayOfT[j];
      if (? != null)
        return ?;
    }
    return null;
  }

  public static boolean contains(byte[] paramArrayOfByte, byte paramByte)
  {
    int i = paramArrayOfByte.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfByte[j] == paramByte)
          bool = true;
      }
      else
        return bool;
    }
  }

  public static boolean contains(char[] paramArrayOfChar, char paramChar)
  {
    int i = paramArrayOfChar.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfChar[j] == paramChar)
          bool = true;
      }
      else
        return bool;
    }
  }

  public static boolean contains(double[] paramArrayOfDouble, double paramDouble)
  {
    int i = paramArrayOfDouble.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfDouble[j] == paramDouble)
          bool = true;
      }
      else
        return bool;
    }
  }

  public static boolean contains(float[] paramArrayOfFloat, float paramFloat)
  {
    int i = paramArrayOfFloat.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfFloat[j] == paramFloat)
          bool = true;
      }
      else
        return bool;
    }
  }

  public static boolean contains(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfInt[j] == paramInt)
          bool = true;
      }
      else
        return bool;
    }
  }

  public static boolean contains(long[] paramArrayOfLong, long paramLong)
  {
    int i = paramArrayOfLong.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfLong[j] == paramLong)
          bool = true;
      }
      else
        return bool;
    }
  }

  public static <T> boolean contains(T[] paramArrayOfT, T paramT)
  {
    int i = paramArrayOfT.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfT[j].equals(paramT))
          bool = true;
      }
      else
        return bool;
    }
  }

  public static boolean contains(short[] paramArrayOfShort, short paramShort)
  {
    int i = paramArrayOfShort.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfShort[j] == paramShort)
          bool = true;
      }
      else
        return bool;
    }
  }

  public static String formatResourceString(int paramInt, Object[] paramArrayOfObject)
  {
    String str = getResourceString(paramInt);
    if (str == null)
      return null;
    return String.format(str, paramArrayOfObject);
  }

  public static native String getAndroidId();

  public static native int getApplicationBuild();

  public static Context getApplicationContext()
  {
    return sContext.getApplicationContext();
  }

  public static native String getApplicationId();

  public static native String getApplicationName();

  public static native String getApplicationVersion();

  public static String[] getBacktrace()
  {
    StackTraceElement[] arrayOfStackTraceElement = new Throwable().getStackTrace();
    String[] arrayOfString = new String[-1 + arrayOfStackTraceElement.length];
    int i = 0;
    if (i < arrayOfString.length)
    {
      StackTraceElement localStackTraceElement = arrayOfStackTraceElement[(i + 1)];
      StringBuilder localStringBuilder = new StringBuilder().append(localStackTraceElement.getClassName().replace("$", ".")).append(".").append(localStackTraceElement.getMethodName());
      if (localStackTraceElement.isNativeMethod());
      for (String str = " [native]"; ; str = " [" + localStackTraceElement.getClassName().split("\\$")[0].replace('.', '/') + ".java:" + localStackTraceElement.getLineNumber() + "]")
      {
        arrayOfString[i] = str;
        i++;
        break;
      }
    }
    return arrayOfString;
  }

  public static Context getContext()
  {
    return sContext;
  }

  private static DisplayMetrics getCurrentDisplayMetrics()
  {
    WindowManager localWindowManager = getWindowManager();
    if (localWindowManager == null)
      return null;
    Display localDisplay = localWindowManager.getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }

  public static String getDefaultLocaleCountry()
  {
    return Locale.getDefault().getCountry();
  }

  public static String getDefaultLocaleFull()
  {
    return Locale.getDefault().toString();
  }

  public static String getDefaultLocaleLanguage()
  {
    return Locale.getDefault().getLanguage();
  }

  public static int getDeviceScreenHeight()
  {
    DisplayMetrics localDisplayMetrics = getCurrentDisplayMetrics();
    return Math.max(localDisplayMetrics.heightPixels, localDisplayMetrics.widthPixels);
  }

  public static int getDeviceScreenWidth()
  {
    DisplayMetrics localDisplayMetrics = getCurrentDisplayMetrics();
    return Math.min(localDisplayMetrics.heightPixels, localDisplayMetrics.widthPixels);
  }

  public static native String getIMEI();

  public static String getLocation()
  {
    return getLocation(2);
  }

  public static String getLocation(int paramInt)
  {
    try
    {
      StackTraceElement localStackTraceElement = new Throwable().getStackTrace()[paramInt];
      if (localStackTraceElement.isNativeMethod())
        return " [<native>]";
      String str = " [" + localStackTraceElement.getClassName().split("\\$")[0].replace('.', '/') + ".java:" + localStackTraceElement.getLineNumber() + "]";
      return str;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
    }
    return " [<unknown>]";
  }

  public static native String getModel();

  public static String getProp(String paramString)
  {
    try
    {
      String str = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class }).invoke(null, new Object[] { paramString });
      return str;
    }
    catch (Throwable localThrowable)
    {
    }
    return null;
  }

  public static Bitmap getResourceBitmap(int paramInt)
  {
    return BitmapFactory.decodeResource(sContext.getResources(), paramInt);
  }

  public static Drawable getResourceDrawable(int paramInt)
  {
    try
    {
      Drawable localDrawable = sContext.getResources().getDrawable(paramInt);
      return localDrawable;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
    }
    return null;
  }

  public static Integer getResourceInteger(int paramInt)
  {
    try
    {
      Integer localInteger = Integer.valueOf(sContext.getResources().getInteger(paramInt));
      return localInteger;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
    }
    return null;
  }

  public static String getResourceString(int paramInt)
  {
    try
    {
      String str = sContext.getResources().getText(paramInt).toString();
      return str;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
    }
    return null;
  }

  public static String getResourceString(int paramInt1, int paramInt2)
  {
    try
    {
      Resources localResources = sContext.getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt2);
      String str = localResources.getQuantityString(paramInt1, paramInt2, arrayOfObject);
      return str;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
    }
    return null;
  }

  public static Resources getResources()
  {
    return sContext.getResources();
  }

  public static native String getSerial();

  private static WindowManager getWindowManager()
  {
    if (sContext == null)
      return null;
    return (WindowManager)sContext.getSystemService("window");
  }

  public static boolean isApplicationInForeground()
  {
    List localList = ((ActivityManager)sContext.getSystemService("activity")).getRunningTasks(1);
    if (localList.isEmpty())
      return false;
    return ((ActivityManager.RunningTaskInfo)localList.get(0)).topActivity.getPackageName().equals(sContext.getPackageName());
  }

  public static boolean isMainThread()
  {
    return Looper.getMainLooper() == Looper.myLooper();
  }

  public static Class<?> loadClass(String paramString)
  {
    try
    {
      Class localClass = Class.forName(paramString, false, AndroidUtil.class.getClassLoader());
      return localClass;
    }
    catch (Exception localException)
    {
      log("AndroidUtil", "Failed to load class " + paramString + ": " + localException);
    }
    return null;
  }

  public static void log(String paramString1, String paramString2)
  {
    new StringBuilder().append(paramString1).append(": ").append(paramString2).append(getLocation(2)).toString();
  }

  public static void runAsMainThread(Runnable paramRunnable)
  {
    if (isMainThread())
    {
      paramRunnable.run();
      return;
    }
    synchronized (new AndroidUtil.MainThreadRunner(paramRunnable))
    {
      handler.post(???);
    }
    try
    {
      ???.wait();
      label36: if (???.mException != null)
      {
        throw ???.mException;
        localObject = finally;
        throw localObject;
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label36;
    }
  }

  public static void setContext(Context paramContext)
  {
    sContext = paramContext;
  }

  public static void toast(int paramInt, boolean paramBoolean)
  {
    toast(getResourceString(paramInt), paramBoolean);
  }

  public static void toast(String paramString, boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str;
    Context localContext;
    if (paramBoolean)
    {
      str = "Long";
      log("AndroidUtil", str + " toast: " + paramString);
      localContext = getApplicationContext();
      if (!paramBoolean)
        break label70;
    }
    label70: for (int i = 1; ; i = 0)
    {
      Toast.makeText(localContext, paramString, i).show();
      return;
      str = "Short";
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.ali.AndroidUtil
 * JD-Core Version:    0.6.2
 */