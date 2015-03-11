package com.mopub.mobileads;

import android.content.Context;
import android.location.Location;
import com.mopub.common.AdUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.LocationService;
import com.mopub.common.MoPub;
import com.mopub.common.util.DateAndTime;
import com.mopub.mobileads.util.Mraids;

public class WebViewAdUrlGenerator extends AdUrlGenerator
{
  public WebViewAdUrlGenerator(Context paramContext)
  {
    super(paramContext);
  }

  private boolean detectIsMraidSupported()
  {
    try
    {
      Class.forName("com.mopub.mobileads.MraidView");
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    return false;
  }

  public String generateUrlString(String paramString)
  {
    initUrlString(paramString, "/m/ad");
    ClientMetadata localClientMetadata = ClientMetadata.getInstance(this.mContext);
    setApiVersion("6");
    setAdUnitId(this.mAdUnitId);
    setSdkVersion(localClientMetadata.getSdkVersion());
    String[] arrayOfString = new String[3];
    arrayOfString[0] = localClientMetadata.getDeviceManufacturer();
    arrayOfString[1] = localClientMetadata.getDeviceModel();
    arrayOfString[2] = localClientMetadata.getDeviceProduct();
    setDeviceInfo(arrayOfString);
    setUdid(localClientMetadata.getUdid());
    setDoNotTrack(localClientMetadata.getDoNoTrack());
    setKeywords(this.mKeywords);
    Location localLocation = this.mLocation;
    if (localLocation == null)
      localLocation = LocationService.getLastKnownLocation(this.mContext, MoPub.getLocationPrecision(), MoPub.getLocationAwareness());
    setLocation(localLocation);
    setTimezone(DateAndTime.getTimeZoneOffsetString());
    setOrientation(localClientMetadata.getOrientationString());
    setDensity(localClientMetadata.getDensity());
    setMraidFlag(detectIsMraidSupported());
    String str = localClientMetadata.getNetworkOperator();
    setMccCode(str);
    setMncCode(str);
    setIsoCountryCode(localClientMetadata.getIsoCountryCode());
    setCarrierName(localClientMetadata.getNetworkOperatorName());
    setNetworkType(localClientMetadata.getActiveNetworkType());
    setAppVersion(localClientMetadata.getAppVersion());
    setExternalStoragePermission(Mraids.isStorePictureSupported(this.mContext));
    setTwitterAppInstalledFlag();
    return getFinalUrlString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.WebViewAdUrlGenerator
 * JD-Core Version:    0.6.2
 */