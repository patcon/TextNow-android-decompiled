package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.au;

public final class SearchAdView extends ViewGroup
{
  private final au kx;

  public SearchAdView(Context paramContext)
  {
    super(paramContext);
    this.kx = new au(this);
  }

  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.kx = new au(this, paramAttributeSet, false);
  }

  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.kx = new au(this, paramAttributeSet, false);
  }

  public final void destroy()
  {
    this.kx.destroy();
  }

  public final AdListener getAdListener()
  {
    return this.kx.getAdListener();
  }

  public final AdSize getAdSize()
  {
    return this.kx.getAdSize();
  }

  public final String getAdUnitId()
  {
    return this.kx.getAdUnitId();
  }

  public final void loadAd(SearchAdRequest paramSearchAdRequest)
  {
    this.kx.a(paramSearchAdRequest.T());
  }

  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      int k = (paramInt3 - paramInt1 - i) / 2;
      int m = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(k, m, i + k, j + m);
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    View localView = getChildAt(0);
    AdSize localAdSize = getAdSize();
    int j;
    int i;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      measureChild(localView, paramInt1, paramInt2);
      j = localView.getMeasuredWidth();
      i = localView.getMeasuredHeight();
    }
    while (true)
    {
      int k = Math.max(j, getSuggestedMinimumWidth());
      int m = Math.max(i, getSuggestedMinimumHeight());
      setMeasuredDimension(View.resolveSize(k, paramInt1), View.resolveSize(m, paramInt2));
      return;
      if (localAdSize != null)
      {
        Context localContext = getContext();
        j = localAdSize.getWidthInPixels(localContext);
        i = localAdSize.getHeightInPixels(localContext);
      }
      else
      {
        i = 0;
        j = 0;
      }
    }
  }

  public final void pause()
  {
    this.kx.pause();
  }

  public final void resume()
  {
    this.kx.resume();
  }

  public final void setAdListener(AdListener paramAdListener)
  {
    this.kx.setAdListener(paramAdListener);
  }

  public final void setAdSize(AdSize paramAdSize)
  {
    this.kx.setAdSizes(new AdSize[] { paramAdSize });
  }

  public final void setAdUnitId(String paramString)
  {
    this.kx.setAdUnitId(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.search.SearchAdView
 * JD-Core Version:    0.6.2
 */