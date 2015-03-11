package com.mopub.mobileads;

import android.app.Activity;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import org.apache.http.Header;

@Deprecated
class AdLoadTask$LegacyCustomEventAdLoadTask extends AdLoadTask
{
  private Header mHeader;

  public AdLoadTask$LegacyCustomEventAdLoadTask(AdViewController paramAdViewController, Header paramHeader)
  {
    super(paramAdViewController);
    this.mHeader = paramHeader;
  }

  void cleanup()
  {
    this.mHeader = null;
  }

  void execute()
  {
    AdViewController localAdViewController = (AdViewController)this.mWeakAdViewController.get();
    if ((localAdViewController == null) || (localAdViewController.isDestroyed()))
      return;
    localAdViewController.setNotLoading();
    MoPubView localMoPubView = localAdViewController.getMoPubView();
    if (this.mHeader == null)
    {
      MoPubLog.i("Couldn't call custom method because the server did not specify one.");
      localMoPubView.loadFailUrl(MoPubErrorCode.ADAPTER_NOT_FOUND);
      return;
    }
    String str = this.mHeader.getValue();
    MoPubLog.i("Trying to call method named " + str);
    Activity localActivity = localMoPubView.getActivity();
    try
    {
      localActivity.getClass().getMethod(str, new Class[] { MoPubView.class }).invoke(localActivity, new Object[] { localMoPubView });
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      MoPubLog.d("Couldn't perform custom method named " + str + "(MoPubView view) because your activity class has no such method");
      localMoPubView.loadFailUrl(MoPubErrorCode.ADAPTER_NOT_FOUND);
      return;
    }
    catch (Exception localException)
    {
      MoPubLog.d("Couldn't perform custom method named " + str);
      localMoPubView.loadFailUrl(MoPubErrorCode.ADAPTER_NOT_FOUND);
    }
  }

  @Deprecated
  Header getHeader()
  {
    return this.mHeader;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdLoadTask.LegacyCustomEventAdLoadTask
 * JD-Core Version:    0.6.2
 */