package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public class AppsFlyerProperties
{
  public static final String AF_KEY = "AppsFlyerKey";
  public static final String APP_ID = "appid";
  public static final String APP_USER_ID = "AppUserId";
  public static final String CHANNEL = "channel";
  public static final String COLLECT_ANDROID_ID = "collectAndroidId";
  public static final String COLLECT_IMEI = "collectIMEI";
  public static final String COLLECT_MAC = "collectMAC";
  public static final String CURRENCY_CODE = "currencyCode";
  public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
  public static final String EXTENSION = "sdkExtension";
  public static final String IS_MONITOR = "shouldMonitor";
  public static final String IS_UPDATE = "IS_UPDATE";
  public static final String USER_EMAIL = "userEmail";
  public static final String USER_EMAILS = "userEmails";
  public static final String USE_HTTP_FALLBACK = "useHttpFallback";
  private static AppsFlyerProperties instance = new AppsFlyerProperties();
  private boolean isDisableLog;
  private boolean isLaunchCalled;
  private boolean isOnReceiveCalled;
  private Map<String, Object> properties = new HashMap();
  private String referrer;

  public static AppsFlyerProperties getInstance()
  {
    return instance;
  }

  public void disableLogOutput(boolean paramBoolean)
  {
    this.isDisableLog = paramBoolean;
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    String str = getString(paramString);
    if (str == null)
      return paramBoolean;
    return Boolean.valueOf(str).booleanValue();
  }

  public String getReferrer(Context paramContext)
  {
    if (this.referrer != null)
      return this.referrer;
    return paramContext.getSharedPreferences("appsflyer-data", 0).getString("referrer", null);
  }

  public String getString(String paramString)
  {
    return (String)this.properties.get(paramString);
  }

  public String[] getStringArray(String paramString)
  {
    return (String[])this.properties.get(paramString);
  }

  public boolean isDisableLog()
  {
    return this.isDisableLog;
  }

  protected boolean isLaunchCollectedReferrerd()
  {
    return this.isLaunchCalled;
  }

  protected boolean isOnReceiveCalled()
  {
    return this.isOnReceiveCalled;
  }

  public void set(String paramString1, String paramString2)
  {
    this.properties.put(paramString1, paramString2);
  }

  public void set(String paramString, boolean paramBoolean)
  {
    this.properties.put(paramString, Boolean.toString(paramBoolean));
  }

  public void set(String paramString, String[] paramArrayOfString)
  {
    this.properties.put(paramString, paramArrayOfString);
  }

  protected void setLaunchCollectedReferrer()
  {
    this.isLaunchCalled = true;
  }

  protected void setOnReceiveCalled()
  {
    this.isOnReceiveCalled = true;
  }

  protected void setReferrer(String paramString)
  {
    this.referrer = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.AppsFlyerProperties
 * JD-Core Version:    0.6.2
 */