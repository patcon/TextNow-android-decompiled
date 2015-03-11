package com.mopub.mobileads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.util.IntentUtils;
import com.mopub.mobileads.util.Utils;

class MoPubBrowserController extends MraidAbstractController
{
  private static final String LOGTAG = "MoPubBrowserController";
  private Context mContext;

  MoPubBrowserController(MraidView paramMraidView)
  {
    super(paramMraidView);
    this.mContext = paramMraidView.getContext();
  }

  private boolean isWebSiteUrl(String paramString)
  {
    return (paramString.startsWith("http://")) || (paramString.startsWith("https://"));
  }

  private boolean launchApplicationUrl(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    localIntent.addFlags(268435456);
    return Utils.executeIntent(getMraidView().getContext(), localIntent, "Unable to open intent.");
  }

  protected void open(String paramString)
  {
    new StringBuilder().append("Opening url: ").append(paramString).toString();
    MraidView localMraidView = getMraidView();
    if (localMraidView.getMraidListener() != null)
      localMraidView.getMraidListener().onOpen(localMraidView);
    if ((!isWebSiteUrl(paramString)) && (IntentUtils.canHandleApplicationUrl(this.mContext, paramString)))
    {
      launchApplicationUrl(paramString);
      return;
    }
    Intent localIntent = new Intent(this.mContext, MoPubBrowser.class);
    localIntent.putExtra("URL", paramString);
    localIntent.addFlags(268435456);
    this.mContext.startActivity(localIntent);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MoPubBrowserController
 * JD-Core Version:    0.6.2
 */