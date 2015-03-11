package com.mopub.nativeads;

import android.content.Context;
import com.mopub.common.BaseUrlGenerator;
import com.mopub.common.ClientMetadata;

class PositioningUrlGenerator extends BaseUrlGenerator
{
  private static final String POSITIONING_API_VERSION = "1";
  private String mAdUnitId;
  private final Context mContext;

  public PositioningUrlGenerator(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private void setAdUnitId(String paramString)
  {
    addParam("id", paramString);
  }

  private void setSdkVersion(String paramString)
  {
    addParam("nsv", paramString);
  }

  public String generateUrlString(String paramString)
  {
    initUrlString(paramString, "/m/pos");
    addParam("id", this.mAdUnitId);
    setApiVersion("1");
    ClientMetadata localClientMetadata = ClientMetadata.getInstance(this.mContext);
    addParam("nsv", localClientMetadata.getSdkVersion());
    String[] arrayOfString = new String[3];
    arrayOfString[0] = localClientMetadata.getDeviceManufacturer();
    arrayOfString[1] = localClientMetadata.getDeviceModel();
    arrayOfString[2] = localClientMetadata.getDeviceProduct();
    setDeviceInfo(arrayOfString);
    setUdid(localClientMetadata.getUdid());
    setAppVersion(localClientMetadata.getAppVersion());
    return getFinalUrlString();
  }

  public PositioningUrlGenerator withAdUnitId(String paramString)
  {
    this.mAdUnitId = paramString;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.PositioningUrlGenerator
 * JD-Core Version:    0.6.2
 */