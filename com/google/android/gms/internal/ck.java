package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;

public final class ck extends FrameLayout
  implements View.OnClickListener
{
  private final ImageButton oR;
  private final Activity og;

  public ck(Activity paramActivity, int paramInt)
  {
    super(paramActivity);
    this.og = paramActivity;
    setOnClickListener(this);
    this.oR = new ImageButton(paramActivity);
    this.oR.setImageResource(17301527);
    this.oR.setBackgroundColor(0);
    this.oR.setOnClickListener(this);
    this.oR.setPadding(0, 0, 0, 0);
    int i = et.a(paramActivity, paramInt);
    addView(this.oR, new FrameLayout.LayoutParams(i, i, 17));
  }

  public final void j(boolean paramBoolean)
  {
    ImageButton localImageButton = this.oR;
    if (paramBoolean);
    for (int i = 4; ; i = 0)
    {
      localImageButton.setVisibility(i);
      return;
    }
  }

  public final void onClick(View paramView)
  {
    this.og.finish();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ck
 * JD-Core Version:    0.6.2
 */