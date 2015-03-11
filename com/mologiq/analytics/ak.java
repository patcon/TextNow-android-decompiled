package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;

final class ak
{
  static boolean a = true;
  static boolean b = false;
  private final WeakReference<Context> c;

  ak(Context paramContext)
  {
    this.c = new WeakReference(paramContext);
  }

  static File a(Context paramContext)
  {
    return paramContext.getCacheDir();
  }

  @SuppressLint({"NewApi"})
  private String a()
  {
    Context localContext = (Context)this.c.get();
    if (localContext == null)
      return b();
    try
    {
      Constructor localConstructor = WebSettings.class.getDeclaredConstructor(new Class[] { Context.class, WebView.class });
      localConstructor.setAccessible(true);
      try
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localContext.getApplicationContext();
        arrayOfObject[1] = null;
        String str = ((WebSettings)localConstructor.newInstance(arrayOfObject)).getUserAgentString();
        return str;
      }
      finally
      {
        localConstructor.setAccessible(false);
      }
    }
    catch (Exception localException)
    {
      if (Thread.currentThread().getName().equalsIgnoreCase("main"))
        return new WebView(localContext).getSettings().getUserAgentString();
    }
    return b();
  }

  static String a(String paramString1, String paramString2, Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    while (true)
    {
      int i1;
      String str4;
      try
      {
        StringBuilder localStringBuilder = new StringBuilder().append(paramString1).append("?v=").append("1.3.6").append("&p=");
        String str1;
        HttpURLConnection localHttpURLConnection;
        if (paramContext.getPackageName() == null)
        {
          str1 = "";
          URL localURL = new URL(str1);
          if (!paramBoolean)
            break label745;
          x localx = new x();
          c localc1 = new c();
          String str2 = localc1.a(paramString2);
          String str3 = localx.a(localc1.a());
          paramString2 = str3 + "" + str2;
          localc2 = localc1;
          long l1 = System.currentTimeMillis();
          ak localak = new ak(paramContext);
          localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
          localHttpURLConnection.setRequestMethod("POST");
          localHttpURLConnection.setDoOutput(true);
          localHttpURLConnection.setDoInput(true);
          localHttpURLConnection.setUseCaches(false);
          localHttpURLConnection.setRequestProperty("User-Agent", localak.a());
          localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
          localHttpURLConnection.setConnectTimeout(500);
          localHttpURLConnection.setReadTimeout(1000);
          if ((paramString2 != null) && (paramString2.length() > 0))
          {
            ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramString2.length());
            GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
            localGZIPOutputStream.write(paramString2.getBytes());
            localGZIPOutputStream.close();
            byte[] arrayOfByte1 = localByteArrayOutputStream.toByteArray();
            localByteArrayOutputStream.close();
            localHttpURLConnection.setRequestProperty("Content-Length", Integer.toString(arrayOfByte1.length));
            localHttpURLConnection.getOutputStream().write(arrayOfByte1);
            localHttpURLConnection.getOutputStream().flush();
            int i = localHttpURLConnection.getResponseCode();
            int j = localHttpURLConnection.getContentLength();
            new StringBuilder().append("Error Code: ").append(i).toString();
            new StringBuilder().append("Content Length: ").append(j).toString();
            long l2 = System.currentTimeMillis();
            new StringBuilder().append("Time Taken: ").append(l2 - l1).append(" ms").toString();
            if (i != 200)
              continue;
            localInputStream = (InputStream)localHttpURLConnection.getContent();
            localArrayList = new ArrayList();
            int k = 8192;
            m = 0;
            if (k == -1)
              continue;
            byte[] arrayOfByte2 = new byte[8192];
            k = localInputStream.read(arrayOfByte2, 0, 8192);
            if (k <= 0)
              continue;
            al localal1 = new al();
            localal1.a = arrayOfByte2;
            localal1.b = k;
            int n = m + k;
            localArrayList.add(localal1);
            m = n;
            continue;
          }
        }
        else
        {
          str1 = paramContext.getPackageName();
          continue;
        }
        localHttpURLConnection.setRequestProperty("Content-Length", Integer.toString(0));
        continue;
      }
      catch (Exception localException)
      {
        InputStream localInputStream;
        ArrayList localArrayList;
        int m;
        localException = localException;
        localException.printStackTrace();
        return "";
        localInputStream.close();
        if (m <= 0)
          continue;
        byte[] arrayOfByte3 = new byte[m];
        i1 = 0;
        int i2 = 0;
        if (i1 < localArrayList.size())
        {
          al localal2 = (al)localArrayList.get(i1);
          int i3 = 0;
          if ((i3 >= localal2.b) || (i2 >= m))
            break label751;
          int i4 = i2 + 1;
          arrayOfByte3[i2] = localal2.a[i3];
          i3++;
          i2 = i4;
          continue;
        }
        str4 = new String(arrayOfByte3);
        if ((paramBoolean) && (localc2 != null))
        {
          String str5 = c.a(localc2.a(), str4);
          new StringBuilder().append("Return Value: ").append(new String(str5)).toString();
          return str5;
        }
      }
      finally
      {
      }
      new StringBuilder().append("Return Value: ").append(new String(str4)).toString();
      return str4;
      label745: c localc2 = null;
      continue;
      label751: i1++;
    }
  }

  static String a(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }

  static Map<Integer, Integer> a(Map<Integer, Integer> paramMap, boolean paramBoolean)
  {
    LinkedList localLinkedList = new LinkedList(paramMap.entrySet());
    Collections.sort(localLinkedList, new Comparator()
    {
    });
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localLinkedHashMap.put(localEntry.getKey(), localEntry.getValue());
    }
    return localLinkedHashMap;
  }

  static void a(String paramString)
  {
  }

  static void a(String paramString1, String paramString2)
  {
    n localn = new n(new File(paramString1));
    FileOutputStream localFileOutputStream = localn.a();
    localFileOutputStream.write(paramString2.getBytes());
    localFileOutputStream.flush();
    localn.a(localFileOutputStream);
  }

  static boolean a(Context paramContext, String paramString)
  {
    return paramContext.checkCallingOrSelfPermission(paramString) == 0;
  }

  private static String b()
  {
    String str1 = Build.VERSION.RELEASE;
    String str2;
    String str3;
    String str10;
    String str11;
    if (str1.length() > 0)
    {
      str2 = "" + str1;
      str3 = str2 + "; ";
      Locale localLocale = Locale.getDefault();
      String str4 = localLocale.getLanguage();
      if (str4 == null)
        break label307;
      str5 = str3 + str4.toLowerCase();
      str10 = localLocale.getCountry();
      if (str10 != null)
        str11 = str5 + "-";
    }
    label307: for (String str5 = str11 + str10.toLowerCase(); ; str5 = str3 + "en")
    {
      String str6 = Build.MODEL;
      if (str6.length() > 0)
      {
        String str9 = str5 + "; ";
        str5 = str9 + str6;
      }
      String str7 = Build.ID;
      if (str7.length() > 0)
      {
        String str8 = str5 + " Build/";
        str5 = str8 + str7;
      }
      return String.format("Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/525.10+ (KHTML, like Gecko) Version/3.0.4 Mobile Safari/523.12.2", new Object[] { str5 });
      str2 = "" + "1.0";
      break;
    }
  }

  static String b(Context paramContext)
  {
    if (a(paramContext, "android.permission.ACCESS_NETWORK_STATE"))
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      NetworkInfo localNetworkInfo1 = localConnectivityManager.getNetworkInfo(1);
      NetworkInfo localNetworkInfo2 = localConnectivityManager.getNetworkInfo(0);
      if (localNetworkInfo1.isAvailable())
        return "wifi";
      if (localNetworkInfo2.isAvailable())
        return "mobile";
      return "none";
    }
    return "unknown";
  }

  static String b(String paramString)
  {
    File localFile = new File(paramString);
    if (localFile.exists())
      return new String(new n(localFile).b());
    return "";
  }

  static boolean b(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramString));
    return paramContext.getPackageManager().queryIntentActivities(localIntent, 65536).size() > 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.ak
 * JD-Core Version:    0.6.2
 */