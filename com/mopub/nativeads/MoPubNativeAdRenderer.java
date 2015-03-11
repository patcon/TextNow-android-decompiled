package com.mopub.nativeads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import java.util.WeakHashMap;

public class MoPubNativeAdRenderer
  implements MoPubAdRenderer<NativeResponse>
{
  private final ViewBinder mViewBinder;
  private final WeakHashMap<View, NativeViewHolder> mViewHolderMap;

  public MoPubNativeAdRenderer(ViewBinder paramViewBinder)
  {
    this.mViewBinder = paramViewBinder;
    this.mViewHolderMap = new WeakHashMap();
  }

  private void attachClickListeners(View paramView, NativeViewHolder paramNativeViewHolder, NativeResponse paramNativeResponse)
  {
    MoPubNativeAdRenderer.NativeViewClickListener localNativeViewClickListener = new MoPubNativeAdRenderer.NativeViewClickListener(paramNativeResponse);
    paramView.setOnClickListener(localNativeViewClickListener);
    setCtaClickListener(paramNativeViewHolder, localNativeViewClickListener);
  }

  private void populateConvertViewSubViews(View paramView, NativeViewHolder paramNativeViewHolder, NativeResponse paramNativeResponse, ViewBinder paramViewBinder)
  {
    paramNativeViewHolder.update(paramNativeResponse);
    paramNativeViewHolder.updateExtras(paramView, paramNativeResponse, paramViewBinder);
  }

  private void removeClickListeners(View paramView, NativeViewHolder paramNativeViewHolder)
  {
    paramView.setOnClickListener(null);
    setCtaClickListener(paramNativeViewHolder, null);
  }

  private void setCtaClickListener(NativeViewHolder paramNativeViewHolder, MoPubNativeAdRenderer.NativeViewClickListener paramNativeViewClickListener)
  {
    if ((paramNativeViewHolder.callToActionView != null) && ((paramNativeViewHolder.callToActionView instanceof Button)))
      paramNativeViewHolder.callToActionView.setOnClickListener(paramNativeViewClickListener);
  }

  public View createAdView(Context paramContext, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(this.mViewBinder.layoutId, paramViewGroup, false);
  }

  @VisibleForTesting
  NativeViewHolder getOrCreateNativeViewHolder(View paramView, ViewBinder paramViewBinder)
  {
    NativeViewHolder localNativeViewHolder = (NativeViewHolder)this.mViewHolderMap.get(paramView);
    if (localNativeViewHolder == null)
    {
      localNativeViewHolder = NativeViewHolder.fromViewBinder(paramView, paramViewBinder);
      this.mViewHolderMap.put(paramView, localNativeViewHolder);
    }
    return localNativeViewHolder;
  }

  public void renderAdView(View paramView, NativeResponse paramNativeResponse)
  {
    NativeViewHolder localNativeViewHolder = getOrCreateNativeViewHolder(paramView, this.mViewBinder);
    if (localNativeViewHolder == null)
    {
      MoPubLog.d("Could not create NativeViewHolder.");
      return;
    }
    removeClickListeners(paramView, localNativeViewHolder);
    populateConvertViewSubViews(paramView, localNativeViewHolder, paramNativeResponse, this.mViewBinder);
    attachClickListeners(paramView, localNativeViewHolder, paramNativeResponse);
    paramView.setVisibility(0);
    paramNativeResponse.prepareImpression(paramView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubNativeAdRenderer
 * JD-Core Version:    0.6.2
 */