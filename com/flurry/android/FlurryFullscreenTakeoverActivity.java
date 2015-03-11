package com.flurry.android;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdFrame;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.flurry.sdk.am;
import com.flurry.sdk.cb;
import com.flurry.sdk.ch;
import com.flurry.sdk.e;
import com.flurry.sdk.eo;
import com.flurry.sdk.f;
import com.flurry.sdk.g;
import com.flurry.sdk.n;
import com.flurry.sdk.n.e;
import com.flurry.sdk.z;
import java.util.Collections;
import java.util.List;

public final class FlurryFullscreenTakeoverActivity extends Activity
{
  public static final String EXTRA_KEY_ADSPACENAME = "adSpaceName";
  public static final String EXTRA_KEY_FRAMEINDEX = "frameIndex";
  public static final String EXTRA_KEY_IS_MRAID_AD = "is_mraid_ad";
  public static final String EXTRA_KEY_SHOULD_CLOSE_AD = "should_close_ad";
  public static final String EXTRA_KEY_TARGETINTENT = "targetIntent";
  public static final String EXTRA_KEY_URL = "url";
  private static final String a = FlurryFullscreenTakeoverActivity.class.getSimpleName();
  public static boolean fBasicWebViewClosingHandlerFired;
  private String b;
  private g c;
  private AdUnit d;
  private ViewGroup e;
  private n f;
  private f g;
  private boolean h;
  private boolean i;
  private Intent j;
  private String k;
  private long l;
  private boolean m = false;
  private boolean n;
  private z o = null;
  private n.e p = n.e.a;

  private void a()
  {
    long l1;
    if (this.d != null)
      l1 = this.d.m().longValue();
    for (boolean bool = this.d.q().booleanValue(); ; bool = false)
    {
      if (this.m)
      {
        this.o = new z(this, 0L, true, false, false);
        return;
      }
      this.o = new z(this, l1, bool, true, false);
      return;
      l1 = 0L;
    }
  }

  private void a(int paramInt)
  {
    FlurryAdModule localFlurryAdModule = FlurryAdModule.getInstance();
    AdUnit localAdUnit = localFlurryAdModule.Q();
    e locale = localFlurryAdModule.P();
    if ((localAdUnit == null) && (this.m))
    {
      localAdUnit = localFlurryAdModule.S();
      locale = localFlurryAdModule.R();
    }
    this.d = localAdUnit;
    this.c = new g(this, localFlurryAdModule, locale, localAdUnit, paramInt);
  }

  private void a(String paramString, int paramInt)
  {
    if ((TextUtils.isEmpty(paramString)) || (this.g == null) || (this.e == null));
    do
    {
      return;
      if (this.o == null)
        a();
      FlurryAdModule localFlurryAdModule = FlurryAdModule.getInstance();
      a(paramInt);
      AdUnit localAdUnit = this.d;
      int i1 = 0;
      if (localAdUnit != null)
      {
        this.o.setAdUnityView(this.c);
        am localam = localFlurryAdModule.c(((AdFrame)this.d.d().get(this.c.getAdFrameIndex())).g().toString());
        this.o.setVideoState(localam);
        i1 = localam.a();
      }
      setVideoOrientation();
      this.g.setMediaController(this.o);
      this.g.a();
      this.g.a(Uri.parse(paramString), i1);
      this.e.addView(this.g, new FrameLayout.LayoutParams(-1, -1, 17));
    }
    while (this.f == null);
    this.f.setVisibility(8);
  }

  private void a(boolean paramBoolean)
  {
    a();
    if (paramBoolean)
    {
      this.g = new f(this, this.c, this, this.o);
      return;
    }
    this.g = new f(this, null, this, this.o);
  }

  private boolean a(String paramString)
  {
    boolean bool1 = TextUtils.isEmpty(paramString);
    boolean bool2 = false;
    if (!bool1)
    {
      String str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(paramString));
      bool2 = false;
      if (str != null)
      {
        boolean bool3 = str.startsWith("video/");
        bool2 = false;
        if (bool3)
          bool2 = true;
      }
    }
    return bool2;
  }

  private boolean a(String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)));
    String str;
    do
    {
      return false;
      str = Uri.parse(paramString2).getQueryParameter("link");
    }
    while ((TextUtils.isEmpty(str)) || (!str.equalsIgnoreCase(paramString1)));
    return true;
  }

  private boolean b()
  {
    return (!cb.a(this)) && (this.c != null) && (this.c.getVideoView() != null) && ((this.c.getCurrentBinding() == 3) || (this.c.getCurrentBinding() == 2));
  }

  public final void finish()
  {
    try
    {
      if (this.n)
        return;
      this.n = true;
      super.finish();
      return;
    }
    finally
    {
    }
  }

  public final AdUnit getAdUnit()
  {
    return this.d;
  }

  public final g getAdUnityView()
  {
    return this.c;
  }

  public final n.e getResult()
  {
    return this.p;
  }

  public final boolean isMraidVideoActivity()
  {
    return this.m;
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    setVideoOrientation();
  }

  public final void onCreate(Bundle paramBundle)
  {
    int i1 = -1;
    eo.a(3, a, "onCreate");
    setTheme(16973831);
    super.onCreate(paramBundle);
    ch.a(getWindow());
    setVolumeControlStream(3);
    this.b = FlurryAdModule.getInstance().j();
    Intent localIntent = getIntent();
    this.j = ((Intent)localIntent.getParcelableExtra("targetIntent"));
    this.k = localIntent.getStringExtra("adSpaceName");
    getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
    fBasicWebViewClosingHandlerFired = false;
    if (paramBundle == null)
    {
      if (i1 < 0)
        i1 = localIntent.getIntExtra("frameIndex", 0);
      this.m = localIntent.getBooleanExtra("is_mraid_ad", false);
      if (this.j == null)
        break label202;
    }
    while (true)
    {
      try
      {
        startActivity(this.j);
        this.l = SystemClock.elapsedRealtime();
        FlurryAdModule.getInstance().a(this, paramBundle);
        return;
        i1 = paramBundle.getInt("frameIndex", i1);
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        eo.a(a, "Cannot launch Activity", localActivityNotFoundException);
        this.j = null;
        finish();
        continue;
      }
      label202: String str = localIntent.getStringExtra("url");
      if (str == null)
      {
        this.e = new RelativeLayout(this);
        FlurryAdModule localFlurryAdModule = FlurryAdModule.getInstance();
        this.d = localFlurryAdModule.Q();
        if (this.d != null)
        {
          this.c = new g(this, localFlurryAdModule, localFlurryAdModule.P(), this.d, i1);
          this.c.setFullScreenTakeover(this);
          this.c.initLayout();
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
          localLayoutParams.addRule(13);
          this.e.addView(this.c, localLayoutParams);
          setContentView(this.e);
        }
        else
        {
          eo.a(3, a, "appSpotModule.getTakeoverAdUnit() IS null ");
        }
      }
      else
      {
        this.e = new FrameLayout(this);
        setContentView(this.e);
        if (a(str))
        {
          a(i1);
          if (this.d != null)
          {
            a(true);
            a(str, i1);
          }
        }
        else
        {
          this.f = new n(this, str, localIntent.getBooleanExtra("should_close_ad", false));
          this.f.setBasicWebViewUrlLoadingHandler(new FlurryFullscreenTakeoverActivity.c(this, i1));
          this.f.setBasicWebViewClosingHandler(new FlurryFullscreenTakeoverActivity.a(this, null));
          this.f.setBasicWebViewFullScreenTransitionHandler(new FlurryFullscreenTakeoverActivity.b(this, null));
          this.e.addView(this.f);
          this.f.a(this);
        }
      }
    }
  }

  protected final void onDestroy()
  {
    eo.a(3, a, "onDestroy");
    terminateVideoPlayback();
    if (this.f != null)
      this.f.d();
    if (this.c != null)
      this.c.onDestroy();
    FlurryAdModule.getInstance().b(this);
    super.onDestroy();
  }

  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.c != null)
      {
        this.c.a("adWillClose", Collections.emptyMap(), this.c.getAdUnit(), this.c.getAdLog(), this.c.getAdFrameIndex(), 0);
        return true;
      }
      if (this.g != null)
      {
        if (this.f != null)
          if (this.h)
          {
            if (this.f.a())
            {
              this.f.c();
              terminateVideoPlayback();
              return true;
            }
          }
          else
          {
            terminateVideoPlayback();
            return true;
          }
      }
      else if (this.f != null)
      {
        if (this.f.a())
          this.f.c();
        while (true)
        {
          return true;
          if (this.f.b())
          {
            this.p = n.e.c;
            finish();
          }
          else
          {
            this.p = n.e.b;
            finish();
          }
        }
      }
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  protected final void onPause()
  {
    eo.a(3, a, "onPause");
    this.i = false;
    if ((this.g != null) && (this.g.isPlaying()))
    {
      this.g.pause();
      eo.a(3, a, "in onPause in FFTA, should call suspend in AdUnityVideoView");
      this.g.d();
    }
    if (this.c != null)
      this.c.c();
    super.onPause();
  }

  protected final void onRestart()
  {
    eo.a(3, a, "onRestart");
    super.onRestart();
  }

  protected final void onResume()
  {
    eo.a(3, a, "onResume");
    super.onResume();
    this.i = true;
    if (this.c != null)
      this.c.b();
  }

  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.c != null)
      paramBundle.putInt("frameIndex", this.c.getAdFrameIndex());
  }

  public final void onStart()
  {
    eo.a(3, a, "onStart");
    super.onStart();
    if (this.b != null)
    {
      FlurryAgent.onStartSession(this, this.b);
      return;
    }
    finish();
  }

  public final void onStop()
  {
    eo.a(3, a, "onStop");
    if (this.b != null)
      FlurryAgent.onEndSession(this);
    super.onStop();
  }

  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    eo.a(3, a, "onWindowFocusChanged hasFocus = " + paramBoolean);
    if ((this.i) && (paramBoolean) && (this.j != null) && (SystemClock.elapsedRealtime() - this.l > 250L))
    {
      eo.a(3, a, "terminate this launcher activity because launched activity was terminated or wasn't launched");
      finish();
    }
    super.onWindowFocusChanged(paramBoolean);
  }

  public final void setVideoMoreInfoInProgress(am paramam)
  {
    if ((this.c != null) && (paramam != null))
      this.c.setVideoState(paramam);
  }

  public final void setVideoOrientation()
  {
    if (cb.a(this))
    {
      eo.b(a, "setVideoOrientation SCREEN_ORIENTATION_SENSOR");
      setRequestedOrientation(4);
    }
    while (!b())
      return;
    eo.b(a, "setVideoOrientation SCREEN_ORIENTATION_SENSOR_LANDSCAPE");
    setRequestedOrientation(6);
  }

  public final void terminateVideoPlayback()
  {
    if (this.f != null)
      this.f.setVisibility(0);
    if (this.g != null)
    {
      this.g.c();
      if (this.e != null)
        this.e.removeView(this.g);
      this.g = null;
    }
    this.h = false;
  }

  public final void terminateVideoPlaybackDueToError()
  {
    eo.a(3, a, "onError");
    eo.b(a, "Error occurs during video playback");
    if (this.f != null)
    {
      if (this.h)
      {
        if (this.f.a())
        {
          this.f.c();
          terminateVideoPlayback();
          return;
        }
        finish();
        return;
      }
      terminateVideoPlayback();
      return;
    }
    finish();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.android.FlurryFullscreenTakeoverActivity
 * JD-Core Version:    0.6.2
 */