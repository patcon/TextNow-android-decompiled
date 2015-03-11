package com.mopub.mobileads;

import com.mopub.common.BaseUrlGenerator;
import com.mopub.common.ClientMetadata;
import com.mopub.common.GpsHelper;

class MoPubConversionTracker$ConversionUrlGenerator extends BaseUrlGenerator
{
  private MoPubConversionTracker$ConversionUrlGenerator(MoPubConversionTracker paramMoPubConversionTracker)
  {
  }

  private void setPackageId(String paramString)
  {
    addParam("id", paramString);
  }

  public String generateUrlString(String paramString)
  {
    initUrlString(paramString, "/m/open");
    setApiVersion("6");
    addParam("id", MoPubConversionTracker.access$000(this.this$0));
    ClientMetadata localClientMetadata = ClientMetadata.getInstance(MoPubConversionTracker.access$100(this.this$0));
    setUdid(localClientMetadata.getUdid());
    setDoNotTrack(GpsHelper.isLimitAdTrackingEnabled(MoPubConversionTracker.access$100(this.this$0)));
    setAppVersion(localClientMetadata.getAppVersion());
    return getFinalUrlString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MoPubConversionTracker.ConversionUrlGenerator
 * JD-Core Version:    0.6.2
 */