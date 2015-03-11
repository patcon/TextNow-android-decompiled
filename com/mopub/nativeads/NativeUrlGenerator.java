package com.mopub.nativeads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.mopub.common.AdUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.LocationService;
import com.mopub.common.MoPub;
import com.mopub.common.util.DateAndTime;
import com.mopub.common.util.Strings;

class NativeUrlGenerator extends AdUrlGenerator
{
  private String mDesiredAssets;
  private String mSequenceNumber;

  NativeUrlGenerator(Context paramContext)
  {
    super(paramContext);
  }

  private void setDesiredAssets()
  {
    if ((this.mDesiredAssets != null) && (!Strings.isEmpty(this.mDesiredAssets)))
      addParam("assets", this.mDesiredAssets);
  }

  private void setSequenceNumber()
  {
    if (!TextUtils.isEmpty(this.mSequenceNumber))
      addParam("MAGIC_NO", this.mSequenceNumber);
  }

  public String generateUrlString(String paramString)
  {
    initUrlString(paramString, "/m/ad");
    setAdUnitId(this.mAdUnitId);
    setKeywords(this.mKeywords);
    Location localLocation = this.mLocation;
    if (localLocation == null)
      localLocation = LocationService.getLastKnownLocation(this.mContext, MoPub.getLocationPrecision(), MoPub.getLocationAwareness());
    setLocation(localLocation);
    ClientMetadata localClientMetadata = ClientMetadata.getInstance(this.mContext);
    setSdkVersion(localClientMetadata.getSdkVersion());
    String[] arrayOfString = new String[3];
    arrayOfString[0] = localClientMetadata.getDeviceManufacturer();
    arrayOfString[1] = localClientMetadata.getDeviceModel();
    arrayOfString[2] = localClientMetadata.getDeviceProduct();
    setDeviceInfo(arrayOfString);
    setUdid(localClientMetadata.getUdid());
    setDoNotTrack(localClientMetadata.getDoNoTrack());
    setTimezone(DateAndTime.getTimeZoneOffsetString());
    setOrientation(localClientMetadata.getOrientationString());
    setDensity(localClientMetadata.getDensity());
    String str = localClientMetadata.getNetworkOperator();
    setMccCode(str);
    setMncCode(str);
    setIsoCountryCode(localClientMetadata.getIsoCountryCode());
    setCarrierName(localClientMetadata.getNetworkOperatorName());
    setNetworkType(localClientMetadata.getActiveNetworkType());
    setAppVersion(localClientMetadata.getAppVersion());
    setTwitterAppInstalledFlag();
    setDesiredAssets();
    setSequenceNumber();
    return getFinalUrlString();
  }

  protected void setSdkVersion(String paramString)
  {
    addParam("nsv", paramString);
  }

  public NativeUrlGenerator withAdUnitId(String paramString)
  {
    this.mAdUnitId = paramString;
    return this;
  }

  NativeUrlGenerator withRequest(RequestParameters paramRequestParameters)
  {
    if (paramRequestParameters != null)
    {
      this.mKeywords = paramRequestParameters.getKeywords();
      this.mLocation = paramRequestParameters.getLocation();
      this.mDesiredAssets = paramRequestParameters.getDesiredAssets();
    }
    return this;
  }

  NativeUrlGenerator withSequenceNumber(int paramInt)
  {
    this.mSequenceNumber = String.valueOf(paramInt);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.NativeUrlGenerator
 * JD-Core Version:    0.6.2
 */