package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
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

final class af
{
  public static boolean a = true;
  public static boolean b = false;
  private final WeakReference<Context> c;

  af(Context paramContext)
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
      int n;
      try
      {
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString1)).append("?v=").append("1.2.9").append("&p=");
        String str1;
        HttpURLConnection localHttpURLConnection;
        if (paramContext.getPackageName() == null)
        {
          str1 = "";
          URL localURL = new URL(str1);
          if (!paramBoolean)
            break label719;
          u localu = new u();
          a locala1 = new a();
          String str2 = locala1.a(paramString2);
          paramString2 = localu.a(locala1.a()) + str2;
          locala2 = locala1;
          long l1 = System.currentTimeMillis();
          af localaf = new af(paramContext);
          localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
          localHttpURLConnection.setRequestMethod("POST");
          localHttpURLConnection.setDoOutput(true);
          localHttpURLConnection.setDoInput(true);
          localHttpURLConnection.setUseCaches(false);
          localHttpURLConnection.setRequestProperty("User-Agent", localaf.a());
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
            new StringBuilder("Error Code: ").append(i).toString();
            new StringBuilder("Content Length: ").append(j).toString();
            long l2 = System.currentTimeMillis();
            new StringBuilder("Time Taken: ").append(l2 - l1).append(" ms").toString();
            if (i != 200)
              continue;
            localInputStream = (InputStream)localHttpURLConnection.getContent();
            localArrayList = new ArrayList();
            k = 8192;
            m = 0;
            if (k != -1)
              continue;
            localInputStream.close();
            if (m <= 0)
              continue;
            arrayOfByte2 = new byte[m];
            n = 0;
            i1 = 0;
            if (n < localArrayList.size())
              continue;
            str3 = new String(arrayOfByte2);
            if ((!paramBoolean) || (locala2 == null))
              continue;
            String str4 = a.a(locala2.a(), str3);
            new StringBuilder("Return Value: ").append(new String(str4)).toString();
            return str4;
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
        byte[] arrayOfByte2;
        String str3;
        localException = localException;
        return "";
        byte[] arrayOfByte3 = new byte[8192];
        int k = localInputStream.read(arrayOfByte3, 0, 8192);
        if (k <= 0)
          continue;
        ag localag2 = new ag();
        localag2.a = arrayOfByte3;
        localag2.b = k;
        int i4 = m + k;
        localArrayList.add(localag2);
        int m = i4;
        continue;
        ag localag1 = (ag)localArrayList.get(n);
        int i2 = 0;
        if ((i2 >= localag1.b) || (i1 >= m))
          break label725;
        int i3 = i1 + 1;
        arrayOfByte2[i1] = localag1.a[i2];
        i2++;
        int i1 = i3;
        continue;
        new StringBuilder("Return Value: ").append(new String(str3)).toString();
        return str3;
      }
      finally
      {
      }
      label719: a locala2 = null;
      continue;
      label725: n++;
    }
  }

  public static Map<Integer, Integer> a(Map<Integer, Integer> paramMap, boolean paramBoolean)
  {
    LinkedList localLinkedList = new LinkedList(paramMap.entrySet());
    Collections.sort(localLinkedList, new Comparator()
    {
    });
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    Iterator localIterator = localLinkedList.iterator();
    while (true)
    {
      if (!localIterator.hasNext())
        return localLinkedHashMap;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localLinkedHashMap.put((Integer)localEntry.getKey(), (Integer)localEntry.getValue());
    }
  }

  public static void a(String paramString)
  {
  }

  static void a(String paramString1, String paramString2)
  {
    l locall = new l(new File(paramString1));
    FileOutputStream localFileOutputStream = locall.a();
    localFileOutputStream.write(paramString2.getBytes());
    localFileOutputStream.flush();
    locall.a(localFileOutputStream);
  }

  public static boolean a(Context paramContext, String paramString)
  {
    return paramContext.checkCallingOrSelfPermission(paramString) == 0;
  }

  private static String b()
  {
    String str1 = Build.VERSION.RELEASE;
    String str2;
    String str3;
    String str8;
    if (str1.length() > 0)
    {
      str2 = "" + str1;
      str3 = str2 + "; ";
      Locale localLocale = Locale.getDefault();
      String str4 = localLocale.getLanguage();
      if (str4 == null)
        break label295;
      str5 = str3 + str4.toLowerCase();
      str8 = localLocale.getCountry();
      if (str8 == null);
    }
    label295: for (String str5 = new StringBuilder(String.valueOf(str5)).append("-").toString() + str8.toLowerCase(); ; str5 = str3 + "en")
    {
      String str6 = Build.MODEL;
      if (str6.length() > 0)
        str5 = new StringBuilder(String.valueOf(str5)).append("; ").toString() + str6;
      String str7 = Build.ID;
      if (str7.length() > 0)
        str5 = new StringBuilder(String.valueOf(str5)).append(" Build/").toString() + str7;
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
      return new String(new l(localFile).b());
    return "";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.af
 * JD-Core Version:    0.6.2
 */