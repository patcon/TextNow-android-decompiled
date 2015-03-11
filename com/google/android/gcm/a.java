package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.sql.Timestamp;

public final class a
{
  private static GCMBroadcastReceiver a;
  private static String b;

  static String a(Context paramContext, String paramString)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.google.android.gcm", 0);
    String str = localSharedPreferences.getString("regId", "");
    int i = i(paramContext);
    new StringBuilder().append("Saving regId on app version ").append(i).toString();
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putString("regId", paramString);
    localEditor.putInt("appVersion", i);
    localEditor.commit();
    return str;
  }

  static String a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      throw new IllegalArgumentException("No senderIds");
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfString[0]);
    for (int i = 1; i < paramArrayOfString.length; i++)
      localStringBuilder.append(',').append(paramArrayOfString[i]);
    return localStringBuilder.toString();
  }

  public static void a(Context paramContext)
  {
    g(paramContext);
    b(paramContext);
  }

  static void a(Context paramContext, int paramInt)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("com.google.android.gcm", 0).edit();
    localEditor.putInt("backoff_ms", paramInt);
    localEditor.commit();
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("com.google.android.gcm", 0).edit();
    localEditor.putBoolean("onServer", paramBoolean);
    long l = paramContext.getSharedPreferences("com.google.android.gcm", 0).getLong("onServerLifeSpan", 604800000L) + System.currentTimeMillis();
    new StringBuilder().append("Setting registeredOnServer status as ").append(paramBoolean).append(" until ").append(new Timestamp(l)).toString();
    localEditor.putLong("onServerExpirationTime", l);
    localEditor.commit();
  }

  public static void a(Context paramContext, String[] paramArrayOfString)
  {
    g(paramContext);
    b(paramContext, paramArrayOfString);
  }

  static void a(String paramString)
  {
    new StringBuilder().append("Setting the name of retry receiver class to ").append(paramString).toString();
    b = paramString;
  }

  static void b(Context paramContext)
  {
    new StringBuilder().append("Unregistering app ").append(paramContext.getPackageName()).toString();
    Intent localIntent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
    localIntent.setPackage("com.google.android.gsf");
    localIntent.putExtra("app", PendingIntent.getBroadcast(paramContext, 0, new Intent(), 0));
    paramContext.startService(localIntent);
  }

  static void b(Context paramContext, String[] paramArrayOfString)
  {
    String str = a(paramArrayOfString);
    new StringBuilder().append("Registering app ").append(paramContext.getPackageName()).append(" of senders ").append(str).toString();
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.setPackage("com.google.android.gsf");
    localIntent.putExtra("app", PendingIntent.getBroadcast(paramContext, 0, new Intent(), 0));
    localIntent.putExtra("sender", str);
    paramContext.startService(localIntent);
  }

  static void c(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        if (b != null)
          break label88;
        a = new GCMBroadcastReceiver();
      }
      while (true)
      {
        String str1 = paramContext.getPackageName();
        IntentFilter localIntentFilter = new IntentFilter("com.google.android.gcm.intent.RETRY");
        localIntentFilter.addCategory(str1);
        String str2 = str1 + ".permission.C2D_MESSAGE";
        paramContext.registerReceiver(a, localIntentFilter, str2, null);
        return;
        try
        {
          label88: a = (GCMBroadcastReceiver)Class.forName(b).newInstance();
        }
        catch (Exception localException)
        {
          new StringBuilder().append("Could not create instance of ").append(b).append(". Using ").append(GCMBroadcastReceiver.class.getName()).append(" directly.").toString();
          a = new GCMBroadcastReceiver();
        }
      }
    }
    finally
    {
    }
  }

  public static String d(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.google.android.gcm", 0);
    String str = localSharedPreferences.getString("regId", "");
    int i = localSharedPreferences.getInt("appVersion", -2147483648);
    int j = i(paramContext);
    if ((i != -2147483648) && (i != j))
    {
      new StringBuilder().append("App version changed from ").append(i).append(" to ").append(j).append("; resetting registration id").toString();
      a(paramContext, "");
      str = "";
    }
    return str;
  }

  static String e(Context paramContext)
  {
    return a(paramContext, "");
  }

  public static boolean f(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("com.google.android.gcm", 0);
    boolean bool = localSharedPreferences.getBoolean("onServer", false);
    new StringBuilder().append("Is registered on server: ").append(bool).toString();
    if (bool)
    {
      long l = localSharedPreferences.getLong("onServerExpirationTime", -1L);
      if (System.currentTimeMillis() > l)
      {
        new StringBuilder().append("flag expired on: ").append(new Timestamp(l)).toString();
        return false;
      }
    }
    return bool;
  }

  static void g(Context paramContext)
  {
    new StringBuilder().append("resetting backoff for ").append(paramContext.getPackageName()).toString();
    a(paramContext, 3000);
  }

  static int h(Context paramContext)
  {
    return paramContext.getSharedPreferences("com.google.android.gcm", 0).getInt("backoff_ms", 3000);
  }

  private static int i(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      throw new RuntimeException("Coult not get package name: " + localNameNotFoundException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gcm.a
 * JD-Core Version:    0.6.2
 */