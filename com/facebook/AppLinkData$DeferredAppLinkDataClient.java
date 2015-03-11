package com.facebook;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

final class AppLinkData$DeferredAppLinkDataClient extends PlatformServiceClient
{
  AppLinkData$DeferredAppLinkDataClient(Context paramContext, String paramString)
  {
    super(paramContext, 65540, 65541, 20130618, paramString);
  }

  protected final void populateRequestBundle(Bundle paramBundle)
  {
    paramBundle.putString("com.facebook.platform.extra.INSTALLDATA_PACKAGE", getContext().getPackageName());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.AppLinkData.DeferredAppLinkDataClient
 * JD-Core Version:    0.6.2
 */