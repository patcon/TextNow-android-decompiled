package com.mopub.nativeads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.IntentUtils;
import java.lang.ref.SoftReference;
import java.util.Iterator;

class NativeResponse$ClickDestinationUrlResolutionListener
  implements UrlResolutionTask.UrlResolutionListener
{
  private final Context mContext;
  private final SoftReference<SpinningProgressView> mSpinningProgressView;
  private final Iterator<String> mUrlIterator;

  public NativeResponse$ClickDestinationUrlResolutionListener(Context paramContext, Iterator<String> paramIterator, SpinningProgressView paramSpinningProgressView)
  {
    this.mContext = paramContext.getApplicationContext();
    this.mUrlIterator = paramIterator;
    this.mSpinningProgressView = new SoftReference(paramSpinningProgressView);
  }

  private void removeSpinningProgressView()
  {
    SpinningProgressView localSpinningProgressView = (SpinningProgressView)this.mSpinningProgressView.get();
    if (localSpinningProgressView != null)
      localSpinningProgressView.removeFromRoot();
  }

  public void onFailure()
  {
    MoPubLog.d("Failed to resolve URL for click.");
    removeSpinningProgressView();
  }

  public void onSuccess(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramString));
    localIntent.addFlags(268435456);
    if ((IntentUtils.isDeepLink(paramString)) && (IntentUtils.deviceCanHandleIntent(this.mContext, localIntent)))
      this.mContext.startActivity(localIntent);
    while (true)
    {
      removeSpinningProgressView();
      return;
      if (this.mUrlIterator.hasNext())
      {
        UrlResolutionTask.getResolvedUrl((String)this.mUrlIterator.next(), this);
        return;
      }
      MoPubBrowser.open(this.mContext, paramString);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.NativeResponse.ClickDestinationUrlResolutionListener
 * JD-Core Version:    0.6.2
 */