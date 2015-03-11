package com.mopub.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Utils;

public class ClientMetadata
{
  private static final String DEVICE_ORIENTATION_LANDSCAPE = "l";
  private static final String DEVICE_ORIENTATION_PORTRAIT = "p";
  private static final String DEVICE_ORIENTATION_SQUARE = "s";
  private static final String DEVICE_ORIENTATION_UNKNOWN = "u";
  private static final String IFA_PREFIX = "ifa:";
  private static final String SHA_PREFIX = "sha:";
  private static final int TYPE_ETHERNET = 9;
  private static final int UNKNOWN_NETWORK = -1;
  private static volatile ClientMetadata sInstance;
  private final String mAppVersion;
  private final ConnectivityManager mConnectivityManager;
  private final Context mContext;
  private final String mDeviceManufacturer;
  private final String mDeviceModel;
  private final String mDeviceProduct;
  private String mIsoCountryCode;
  private String mNetworkOperator;
  private String mNetworkOperatorName;
  private final String mSdkVersion;
  private String mUdid;

  private ClientMetadata(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mConnectivityManager = ((ConnectivityManager)this.mContext.getSystemService("connectivity"));
    this.mDeviceManufacturer = Build.MANUFACTURER;
    this.mDeviceModel = Build.MODEL;
    this.mDeviceProduct = Build.PRODUCT;
    this.mSdkVersion = "3.0.0";
    this.mAppVersion = getAppVersionFromContext(this.mContext);
    TelephonyManager localTelephonyManager = (TelephonyManager)this.mContext.getSystemService("phone");
    this.mNetworkOperator = localTelephonyManager.getNetworkOperator();
    if ((localTelephonyManager.getPhoneType() == 2) && (localTelephonyManager.getSimState() == 5))
      this.mNetworkOperator = localTelephonyManager.getSimOperator();
    this.mIsoCountryCode = localTelephonyManager.getNetworkCountryIso();
    try
    {
      this.mNetworkOperatorName = localTelephonyManager.getNetworkOperatorName();
      this.mUdid = getUdidFromContext(this.mContext);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
        this.mNetworkOperatorName = null;
    }
  }

  @VisibleForTesting
  public static void clearForTesting()
  {
    try
    {
      sInstance = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static String getAppVersionFromContext(Context paramContext)
  {
    try
    {
      String str1 = paramContext.getPackageName();
      String str2 = paramContext.getPackageManager().getPackageInfo(str1, 0).versionName;
      return str2;
    }
    catch (Exception localException)
    {
      MoPubLog.d("Failed to retrieve PackageInfo#versionName.");
    }
    return null;
  }

  public static ClientMetadata getInstance()
  {
    ClientMetadata localClientMetadata = sInstance;
    if (localClientMetadata == null);
    try
    {
      localClientMetadata = sInstance;
      return localClientMetadata;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static ClientMetadata getInstance(Context paramContext)
  {
    ClientMetadata localClientMetadata = sInstance;
    if (localClientMetadata == null);
    try
    {
      localClientMetadata = sInstance;
      if (localClientMetadata == null)
      {
        localClientMetadata = new ClientMetadata(paramContext);
        sInstance = localClientMetadata;
      }
      return localClientMetadata;
    }
    finally
    {
    }
  }

  private static String getUdidFromContext(Context paramContext)
  {
    String str1 = GpsHelper.getAdvertisingId(paramContext);
    if (str1 != null)
      return "ifa:" + str1;
    String str2 = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
    if (str2 == null);
    for (String str3 = ""; ; str3 = Utils.sha1(str2))
      return "sha:" + str3;
  }

  public ClientMetadata.MoPubNetworkType getActiveNetworkType()
  {
    int i = -1;
    if (this.mContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
    {
      NetworkInfo localNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
      if (localNetworkInfo != null)
        i = localNetworkInfo.getType();
    }
    return ClientMetadata.MoPubNetworkType.access$000(i);
  }

  public String getAppVersion()
  {
    return this.mAppVersion;
  }

  public float getDensity()
  {
    return this.mContext.getResources().getDisplayMetrics().density;
  }

  public String getDeviceManufacturer()
  {
    return this.mDeviceManufacturer;
  }

  public String getDeviceModel()
  {
    return this.mDeviceModel;
  }

  public String getDeviceProduct()
  {
    return this.mDeviceProduct;
  }

  public boolean getDoNoTrack()
  {
    return GpsHelper.isLimitAdTrackingEnabled(this.mContext);
  }

  public String getIsoCountryCode()
  {
    return this.mIsoCountryCode;
  }

  public String getNetworkOperator()
  {
    return this.mNetworkOperator;
  }

  public String getNetworkOperatorName()
  {
    return this.mNetworkOperatorName;
  }

  public String getOrientationString()
  {
    int i = this.mContext.getResources().getConfiguration().orientation;
    String str = "u";
    if (i == 1)
      str = "p";
    do
    {
      return str;
      if (i == 2)
        return "l";
    }
    while (i != 3);
    return "s";
  }

  public String getSdkVersion()
  {
    return this.mSdkVersion;
  }

  public String getUdid()
  {
    return this.mUdid;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.ClientMetadata
 * JD-Core Version:    0.6.2
 */