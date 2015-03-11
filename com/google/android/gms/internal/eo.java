package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.net.Uri.Builder;
import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class eo
{
  private static final Object qp = new Object();
  private static boolean sl = true;
  private static String sm;
  private static boolean sn = false;

  public static String a(Readable paramReadable)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    CharBuffer localCharBuffer = CharBuffer.allocate(2048);
    while (true)
    {
      int i = paramReadable.read(localCharBuffer);
      if (i == -1)
        break;
      localCharBuffer.flip();
      localStringBuilder.append(localCharBuffer, 0, i);
    }
    return localStringBuilder.toString();
  }

  private static JSONArray a(Collection<?> paramCollection)
  {
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      a(localJSONArray, localIterator.next());
    return localJSONArray;
  }

  static JSONArray a(Object[] paramArrayOfObject)
  {
    JSONArray localJSONArray = new JSONArray();
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++)
      a(localJSONArray, paramArrayOfObject[j]);
    return localJSONArray;
  }

  public static void a(Context paramContext, String paramString, WebSettings paramWebSettings)
  {
    paramWebSettings.setUserAgentString(c(paramContext, paramString));
  }

  public static void a(Context paramContext, String paramString, List<String> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      new es(paramContext, paramString, (String)localIterator.next()).start();
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean, HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(paramBoolean);
    paramHttpURLConnection.setReadTimeout(60000);
    paramHttpURLConnection.setRequestProperty("User-Agent", c(paramContext, paramString));
    paramHttpURLConnection.setUseCaches(false);
  }

  public static void a(WebView paramWebView)
  {
    if (Build.VERSION.SDK_INT >= 11)
      eq.a(paramWebView);
  }

  private static void a(JSONArray paramJSONArray, Object paramObject)
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONArray.put(b((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONArray.put(o((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      paramJSONArray.put(a((Collection)paramObject));
      return;
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONArray.put(a((Object[])paramObject));
      return;
    }
    paramJSONArray.put(paramObject);
  }

  private static void a(JSONObject paramJSONObject, String paramString, Object paramObject)
  {
    if ((paramObject instanceof Bundle))
    {
      paramJSONObject.put(paramString, b((Bundle)paramObject));
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramJSONObject.put(paramString, o((Map)paramObject));
      return;
    }
    if ((paramObject instanceof Collection))
    {
      if (paramString != null);
      while (true)
      {
        paramJSONObject.put(paramString, a((Collection)paramObject));
        return;
        paramString = "null";
      }
    }
    if ((paramObject instanceof Object[]))
    {
      paramJSONObject.put(paramString, a(Arrays.asList((Object[])paramObject)));
      return;
    }
    paramJSONObject.put(paramString, paramObject);
  }

  public static boolean a(PackageManager paramPackageManager, String paramString1, String paramString2)
  {
    return paramPackageManager.checkPermission(paramString2, paramString1) == 0;
  }

  public static boolean a(ClassLoader paramClassLoader, Class<?> paramClass, String paramString)
  {
    try
    {
      boolean bool = paramClass.isAssignableFrom(Class.forName(paramString, false, paramClassLoader));
      return bool;
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  private static JSONObject b(Bundle paramBundle)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      a(localJSONObject, str, paramBundle.get(str));
    }
    return localJSONObject;
  }

  public static void b(WebView paramWebView)
  {
    if (Build.VERSION.SDK_INT >= 11)
      eq.b(paramWebView);
  }

  public static boolean bQ()
  {
    return sl;
  }

  public static int bR()
  {
    if (Build.VERSION.SDK_INT >= 9)
      return 6;
    return 0;
  }

  public static int bS()
  {
    if (Build.VERSION.SDK_INT >= 9)
      return 7;
    return 1;
  }

  public static String bT()
  {
    UUID localUUID = UUID.randomUUID();
    byte[] arrayOfByte1 = BigInteger.valueOf(localUUID.getLeastSignificantBits()).toByteArray();
    byte[] arrayOfByte2 = BigInteger.valueOf(localUUID.getMostSignificantBits()).toByteArray();
    Object localObject = new BigInteger(1, arrayOfByte1).toString();
    int i = 0;
    while (true)
    {
      if (i < 2);
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(arrayOfByte1);
        localMessageDigest.update(arrayOfByte2);
        byte[] arrayOfByte3 = new byte[8];
        System.arraycopy(localMessageDigest.digest(), 0, arrayOfByte3, 0, 8);
        String str = new BigInteger(1, arrayOfByte3).toString();
        localObject = str;
        label105: i++;
        continue;
        return localObject;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        break label105;
      }
    }
  }

  private static String c(Context paramContext, String paramString)
  {
    while (true)
    {
      synchronized (qp)
      {
        if (sm != null)
        {
          String str4 = sm;
          return str4;
        }
        if (Build.VERSION.SDK_INT >= 17)
        {
          sm = er.getDefaultUserAgent(paramContext);
          String str1 = sm + " (Mobile; " + paramString + ")";
          sm = str1;
          return str1;
        }
      }
      if (!et.bW())
      {
        et.sv.post(new Runnable()
        {
          public final void run()
          {
            synchronized (eo.bU())
            {
              eo.w(eo.q(eo.this));
              eo.bU().notifyAll();
              return;
            }
          }
        });
        while (true)
        {
          String str2 = sm;
          if (str2 != null)
            break;
          try
          {
            qp.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            String str3 = sm;
            return str3;
          }
        }
      }
      sm = o(paramContext);
    }
  }

  public static Map<String, String> c(Uri paramUri)
  {
    if (paramUri == null)
      return null;
    HashMap localHashMap = new HashMap();
    UrlQuerySanitizer localUrlQuerySanitizer = new UrlQuerySanitizer();
    localUrlQuerySanitizer.setAllowUnregisteredParamaters(true);
    localUrlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
    localUrlQuerySanitizer.parseUrl(paramUri.toString());
    Iterator localIterator = localUrlQuerySanitizer.getParameterList().iterator();
    while (localIterator.hasNext())
    {
      UrlQuerySanitizer.ParameterValuePair localParameterValuePair = (UrlQuerySanitizer.ParameterValuePair)localIterator.next();
      localHashMap.put(localParameterValuePair.mParameter, localParameterValuePair.mValue);
    }
    return localHashMap;
  }

  public static boolean m(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(localIntent, 65536);
    if ((localResolveInfo == null) || (localResolveInfo.activityInfo == null))
    {
      eu.D("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
      return false;
    }
    if ((0x10 & localResolveInfo.activityInfo.configChanges) == 0)
      eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboard" }));
    for (boolean bool = false; ; bool = true)
    {
      if ((0x20 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "keyboardHidden" }));
        bool = false;
      }
      if ((0x80 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "orientation" }));
        bool = false;
      }
      if ((0x100 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenLayout" }));
        bool = false;
      }
      if ((0x200 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "uiMode" }));
        bool = false;
      }
      if ((0x400 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "screenSize" }));
        bool = false;
      }
      if ((0x800 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        eu.D(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] { "smallestScreenSize" }));
        return false;
      }
      return bool;
    }
  }

  public static void n(Context paramContext)
  {
    if (sn)
      return;
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.USER_PRESENT");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.getApplicationContext().registerReceiver(new eo.a(null), localIntentFilter);
    sn = true;
  }

  private static String o(Context paramContext)
  {
    return new WebView(paramContext).getSettings().getUserAgentString();
  }

  public static JSONObject o(Map<String, ?> paramMap)
  {
    JSONObject localJSONObject;
    try
    {
      localJSONObject = new JSONObject();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(localJSONObject, str, paramMap.get(str));
      }
    }
    catch (ClassCastException localClassCastException)
    {
      throw new JSONException("Could not convert map to JSON: " + localClassCastException.getMessage());
    }
    return localJSONObject;
  }

  public static int p(Context paramContext)
  {
    int j;
    int i;
    if ((paramContext instanceof Activity))
    {
      Window localWindow = ((Activity)paramContext).getWindow();
      Rect localRect = new Rect();
      localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect);
      j = localRect.top;
      i = localWindow.findViewById(16908290).getTop() - j;
    }
    while (true)
    {
      return i + j;
      i = 0;
      j = 0;
    }
  }

  public static String v(String paramString)
  {
    return Uri.parse(paramString).buildUpon().query(null).build().toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eo
 * JD-Core Version:    0.6.2
 */