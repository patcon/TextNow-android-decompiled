package com.flurry.sdk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;

final class g$a extends WebChromeClient
{
  private g$a(g paramg)
  {
  }

  public final void onHideCustomView()
  {
    eo.a(3, g.a(this.a), "onHideCustomView()");
    if (!(this.a.getContext() instanceof Activity))
      eo.a(3, g.a(this.a), "no activity present");
    Activity localActivity;
    do
    {
      return;
      localActivity = (Activity)this.a.getContext();
    }
    while (g.u(this.a) == null);
    if (g.y(this.a) != null)
      g.y(this.a).show();
    ((ViewGroup)localActivity.getWindow().getDecorView()).removeView(g.w(this.a));
    g.w(this.a).removeView(g.u(this.a));
    if ((g.x(this.a) != null) && (g.x(this.a).isShowing()))
    {
      g.x(this.a).hide();
      g.x(this.a).setOnDismissListener(null);
      g.x(this.a).dismiss();
    }
    g.a(this.a, null);
    cb.a(localActivity, g.z(this.a));
    g.A(this.a).onCustomViewHidden();
    g.a(this.a, null);
    g.a(this.a, null);
    g.a(this.a, null);
    this.a.getPlatformModule().b(localActivity, this.a.getAdUnit().b().toString());
  }

  public final void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    eo.a(3, g.a(this.a), "onShowCustomView(14)");
    if (!(this.a.getContext() instanceof Activity))
    {
      eo.a(3, g.a(this.a), "no activity present");
      return;
    }
    final Activity localActivity = (Activity)this.a.getContext();
    if ((g.u(this.a) != null) && (g.v(this.a) != null))
    {
      g.v(this.a).onHideCustomView();
      return;
    }
    g.a(this.a, paramView);
    g.a(this.a, localActivity.getRequestedOrientation());
    g.a(this.a, paramCustomViewCallback);
    g.a(this.a, new FrameLayout(localActivity));
    g.w(this.a).setBackgroundColor(-16777216);
    g.w(this.a).addView(g.u(this.a), new FrameLayout.LayoutParams(-1, -1, 17));
    ((ViewGroup)localActivity.getWindow().getDecorView()).addView(g.w(this.a), -1, -1);
    if (g.x(this.a) == null)
    {
      g.a(this.a, new Dialog(localActivity, 16973841)
      {
        public boolean dispatchTouchEvent(MotionEvent paramAnonymousMotionEvent)
        {
          return localActivity.dispatchTouchEvent(paramAnonymousMotionEvent);
        }

        public boolean dispatchTrackballEvent(MotionEvent paramAnonymousMotionEvent)
        {
          return localActivity.dispatchTrackballEvent(paramAnonymousMotionEvent);
        }
      });
      g.x(this.a).getWindow().setType(1000);
      g.x(this.a).setOnShowListener(new DialogInterface.OnShowListener()
      {
        public void onShow(DialogInterface paramAnonymousDialogInterface)
        {
          if (g.y(g.a.this.a) != null)
            g.y(g.a.this.a).hide();
        }
      });
      g.x(this.a).setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          eo.a(3, g.a(g.a.this.a), "customViewFullScreenDialog.onDismiss()");
          if ((g.u(g.a.this.a) != null) && (g.v(g.a.this.a) != null))
            g.v(g.a.this.a).onHideCustomView();
        }
      });
      g.x(this.a).setCancelable(true);
      g.x(this.a).show();
    }
    cb.a(localActivity, paramInt, true);
    this.a.getPlatformModule().a(localActivity, this.a.getAdUnit().b().toString());
  }

  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    eo.a(3, g.a(this.a), "onShowCustomView(7)");
    if (!(this.a.getContext() instanceof Activity))
    {
      eo.a(3, g.a(this.a), "no activity present");
      return;
    }
    onShowCustomView(paramView, ((Activity)this.a.getContext()).getRequestedOrientation(), paramCustomViewCallback);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.g.a
 * JD-Core Version:    0.6.2
 */