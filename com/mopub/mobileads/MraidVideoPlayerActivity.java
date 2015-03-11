package com.mopub.mobileads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.IntentUtils;

public class MraidVideoPlayerActivity extends BaseVideoPlayerActivity
  implements BaseVideoViewController.BaseVideoViewControllerListener
{
  private BaseVideoViewController mBaseVideoController;
  private long mBroadcastIdentifier;

  private BaseVideoViewController createVideoViewController()
  {
    String str = getIntent().getStringExtra("video_view_class_name");
    if ("vast".equals(str))
      return new VastVideoViewController(this, getIntent().getExtras(), this.mBroadcastIdentifier, this);
    if ("mraid".equals(str))
      return new MraidVideoViewController(this, getIntent().getExtras(), this.mBroadcastIdentifier, this);
    throw new IllegalStateException("Unsupported video type: " + str);
  }

  private AdConfiguration getAdConfiguration()
  {
    try
    {
      AdConfiguration localAdConfiguration = (AdConfiguration)getIntent().getSerializableExtra("Ad-Configuration");
      return localAdConfiguration;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return null;
  }

  @Deprecated
  BaseVideoViewController getBaseVideoViewController()
  {
    return this.mBaseVideoController;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.mBaseVideoController.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onBackPressed()
  {
    if (this.mBaseVideoController.backButtonEnabled())
      super.onBackPressed();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().addFlags(1024);
    AdConfiguration localAdConfiguration = getAdConfiguration();
    if (localAdConfiguration != null)
      this.mBroadcastIdentifier = localAdConfiguration.getBroadcastIdentifier();
    try
    {
      while (true)
      {
        this.mBaseVideoController = createVideoViewController();
        this.mBaseVideoController.onCreate();
        return;
        MoPubLog.d("Unable to obtain broadcast identifier. Video interactions cannot be tracked.");
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      EventForwardingBroadcastReceiver.broadcastAction(this, this.mBroadcastIdentifier, "com.mopub.action.interstitial.fail");
      finish();
    }
  }

  protected void onDestroy()
  {
    this.mBaseVideoController.onDestroy();
    super.onDestroy();
  }

  public void onFinish()
  {
    finish();
  }

  protected void onPause()
  {
    this.mBaseVideoController.onPause();
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    this.mBaseVideoController.onResume();
  }

  public void onSetContentView(View paramView)
  {
    setContentView(paramView);
  }

  public void onSetRequestedOrientation(int paramInt)
  {
    setRequestedOrientation(paramInt);
  }

  public void onStartActivityForResult(Class<? extends Activity> paramClass, int paramInt, Bundle paramBundle)
  {
    if (paramClass == null)
      return;
    Intent localIntent = IntentUtils.getStartActivityIntent(this, paramClass, paramBundle);
    try
    {
      startActivityForResult(localIntent, paramInt);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      MoPubLog.d("Activity " + paramClass.getName() + " not found. Did you declare it in your AndroidManifest.xml?");
    }
  }

  @Deprecated
  void setBaseVideoViewController(BaseVideoViewController paramBaseVideoViewController)
  {
    this.mBaseVideoController = paramBaseVideoViewController;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidVideoPlayerActivity
 * JD-Core Version:    0.6.2
 */