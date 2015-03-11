package textnow.bd;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.VideoView;
import com.tremorvideo.sdk.android.videoad.r;

final class t extends WebChromeClient
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener
{
  private q b;
  private VideoView c;
  private WebChromeClient.CustomViewCallback d;
  private int e = 0;

  public t(q paramq1, q paramq2)
  {
    this.b = paramq2;
  }

  public final void a()
  {
    if (this.c != null)
    {
      this.c.stopPlayback();
      if (this.d != null)
        this.d.onCustomViewHidden();
      this.c = null;
      this.d = null;
    }
  }

  public final boolean b()
  {
    if (this.c != null)
    {
      this.c.stopPlayback();
      this.d.onCustomViewHidden();
      onHideCustomView();
      this.b.a();
      this.b.d();
      this.c = null;
      this.d = null;
      this.b.m();
      return true;
    }
    return false;
  }

  public final void c()
  {
    if (this.c != null)
    {
      this.e = this.c.getCurrentPosition();
      this.c.pause();
    }
  }

  public final void d()
  {
    if (this.c != null)
    {
      this.c.forceLayout();
      this.c.requestLayout();
      if (!this.c.isPlaying())
      {
        this.c.start();
        if ((this.c.isPlaying()) && (this.e > 0))
          this.c.seekTo(this.e);
      }
      this.e = 0;
    }
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    this.c.stopPlayback();
    this.d.onCustomViewHidden();
    onHideCustomView();
    this.b.a();
    this.b.d();
    this.c = null;
    this.d = null;
    this.b.m();
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    this.c.stopPlayback();
    this.d.onCustomViewHidden();
    onHideCustomView();
    this.b.a();
    this.b.d();
    this.c = null;
    this.d = null;
    return true;
  }

  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return false;
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    super.onShowCustomView(paramView, paramCustomViewCallback);
    FrameLayout localFrameLayout;
    if ((paramView instanceof FrameLayout))
    {
      localFrameLayout = (FrameLayout)paramView;
      if (!(localFrameLayout.getFocusedChild() instanceof VideoView));
    }
    try
    {
      VideoView localVideoView = (VideoView)localFrameLayout.getFocusedChild();
      this.c = localVideoView;
      this.d = paramCustomViewCallback;
      localFrameLayout.removeView(localVideoView);
      Activity localActivity = (Activity)this.a.getContext();
      RelativeLayout localRelativeLayout = new RelativeLayout(this.a.getContext());
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(14);
      localLayoutParams.addRule(15);
      localVideoView.setLayoutParams(localLayoutParams);
      localRelativeLayout.addView(localVideoView);
      localActivity.setContentView(localRelativeLayout);
      localVideoView.setOnCompletionListener(this);
      localVideoView.setOnErrorListener(this);
      localVideoView.start();
      this.b.c();
      return;
    }
    catch (Exception localException)
    {
      r.a(localException);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bd.t
 * JD-Core Version:    0.6.2
 */