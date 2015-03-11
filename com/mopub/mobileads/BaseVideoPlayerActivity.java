package com.mopub.mobileads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.util.vast.VastVideoConfiguration;

class BaseVideoPlayerActivity extends Activity
{
  static final String VIDEO_CLASS_EXTRAS_KEY = "video_view_class_name";
  static final String VIDEO_URL = "video_url";

  static Intent createIntentMraid(Context paramContext, String paramString, AdConfiguration paramAdConfiguration)
  {
    Intent localIntent = new Intent(paramContext, MraidVideoPlayerActivity.class);
    localIntent.setFlags(268435456);
    localIntent.putExtra("video_view_class_name", "mraid");
    localIntent.putExtra("video_url", paramString);
    localIntent.putExtra("Ad-Configuration", paramAdConfiguration);
    return localIntent;
  }

  static Intent createIntentVast(Context paramContext, VastVideoConfiguration paramVastVideoConfiguration, AdConfiguration paramAdConfiguration)
  {
    Intent localIntent = new Intent(paramContext, MraidVideoPlayerActivity.class);
    localIntent.setFlags(268435456);
    localIntent.putExtra("video_view_class_name", "vast");
    localIntent.putExtra("vast_video_configuration", paramVastVideoConfiguration);
    localIntent.putExtra("Ad-Configuration", paramAdConfiguration);
    return localIntent;
  }

  static void startMraid(Context paramContext, String paramString, AdConfiguration paramAdConfiguration)
  {
    Intent localIntent = createIntentMraid(paramContext, paramString, paramAdConfiguration);
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      MoPubLog.d("Activity MraidVideoPlayerActivity not found. Did you declare it in your AndroidManifest.xml?");
    }
  }

  static void startVast(Context paramContext, VastVideoConfiguration paramVastVideoConfiguration, AdConfiguration paramAdConfiguration)
  {
    Intent localIntent = createIntentVast(paramContext, paramVastVideoConfiguration, paramAdConfiguration);
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      MoPubLog.d("Activity MraidVideoPlayerActivity not found. Did you declare it in your AndroidManifest.xml?");
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.BaseVideoPlayerActivity
 * JD-Core Version:    0.6.2
 */