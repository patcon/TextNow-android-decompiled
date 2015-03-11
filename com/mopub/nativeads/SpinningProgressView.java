package com.mopub.nativeads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Views;

class SpinningProgressView extends ViewGroup
{
  private final ProgressBar mProgressBar;
  private int mProgressIndicatorRadius;

  SpinningProgressView(Context paramContext)
  {
    super(paramContext);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    localLayoutParams.gravity = 17;
    setLayoutParams(localLayoutParams);
    setVisibility(8);
    setBackgroundColor(-16777216);
    getBackground().setAlpha(180);
    this.mProgressBar = new ProgressBar(paramContext);
    this.mProgressIndicatorRadius = Dips.asIntPixels(25.0F, getContext());
    this.mProgressBar.setIndeterminate(true);
    addView(this.mProgressBar);
  }

  boolean addToRoot(View paramView)
  {
    if (paramView == null)
      return false;
    View localView = paramView.getRootView();
    if ((localView != null) && ((localView instanceof ViewGroup)))
    {
      ViewGroup localViewGroup = (ViewGroup)localView;
      setVisibility(0);
      setMeasuredDimension(localView.getWidth(), localView.getHeight());
      localViewGroup.addView(this);
      forceLayout();
      return true;
    }
    return false;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramBoolean)
    {
      int i = (paramInt1 + paramInt3) / 2;
      int j = (paramInt2 + paramInt4) / 2;
      this.mProgressBar.layout(i - this.mProgressIndicatorRadius, j - this.mProgressIndicatorRadius, i + this.mProgressIndicatorRadius, j + this.mProgressIndicatorRadius);
    }
  }

  boolean removeFromRoot()
  {
    Views.removeFromParent(this);
    setVisibility(8);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.SpinningProgressView
 * JD-Core Version:    0.6.2
 */