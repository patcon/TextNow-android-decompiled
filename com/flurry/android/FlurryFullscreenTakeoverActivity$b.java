package com.flurry.android;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.flurry.sdk.n;
import com.flurry.sdk.n.d;
import com.flurry.sdk.n.d.a;

final class FlurryFullscreenTakeoverActivity$b
  implements n.d
{
  private View b;
  private int c;
  private n.d.a d;
  private FrameLayout e;

  private FlurryFullscreenTakeoverActivity$b(FlurryFullscreenTakeoverActivity paramFlurryFullscreenTakeoverActivity)
  {
  }

  public final void a(n paramn)
  {
    if (this.b == null)
      return;
    ((ViewGroup)this.a.getWindow().getDecorView()).removeView(this.e);
    this.e.removeView(this.b);
    if (this.d != null)
      this.d.a();
    this.a.setRequestedOrientation(this.c);
    this.d = null;
    this.e = null;
    this.b = null;
  }

  public final void a(n paramn, View paramView, int paramInt, n.d.a parama)
  {
    if (this.b != null)
      a(paramn);
    this.b = paramView;
    this.c = this.a.getRequestedOrientation();
    this.d = parama;
    this.e = new FrameLayout(this.a);
    this.e.setBackgroundColor(-16777216);
    this.e.addView(this.b, new FrameLayout.LayoutParams(-1, -1, 17));
    ((ViewGroup)this.a.getWindow().getDecorView()).addView(this.e, -1, -1);
    this.a.setRequestedOrientation(paramInt);
  }

  public final void a(n paramn, View paramView, n.d.a parama)
  {
    a(paramn, paramView, this.a.getRequestedOrientation(), parama);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.FlurryFullscreenTakeoverActivity.b
 * JD-Core Version:    0.6.2
 */