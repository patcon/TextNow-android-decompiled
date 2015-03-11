package com.mopub.nativeads;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public class MoPubAdAdapter extends BaseAdapter
{
  private MoPubNativeAdLoadedListener mAdLoadedListener;
  private final Adapter mOriginalAdapter;
  private final MoPubStreamAdPlacer mStreamAdPlacer;
  private final WeakHashMap<View, Integer> mViewPositionMap;
  private final VisibilityTracker mVisibilityTracker;

  public MoPubAdAdapter(Context paramContext, Adapter paramAdapter)
  {
    this(paramContext, paramAdapter, MoPubNativeAdPositioning.serverPositioning());
  }

  public MoPubAdAdapter(Context paramContext, Adapter paramAdapter, MoPubNativeAdPositioning.MoPubClientPositioning paramMoPubClientPositioning)
  {
    this(new MoPubStreamAdPlacer(paramContext, paramMoPubClientPositioning), paramAdapter, new VisibilityTracker(paramContext));
  }

  public MoPubAdAdapter(Context paramContext, Adapter paramAdapter, MoPubNativeAdPositioning.MoPubServerPositioning paramMoPubServerPositioning)
  {
    this(new MoPubStreamAdPlacer(paramContext, paramMoPubServerPositioning), paramAdapter, new VisibilityTracker(paramContext));
  }

  @VisibleForTesting
  MoPubAdAdapter(MoPubStreamAdPlacer paramMoPubStreamAdPlacer, Adapter paramAdapter, VisibilityTracker paramVisibilityTracker)
  {
    this.mOriginalAdapter = paramAdapter;
    this.mStreamAdPlacer = paramMoPubStreamAdPlacer;
    this.mViewPositionMap = new WeakHashMap();
    this.mVisibilityTracker = paramVisibilityTracker;
    this.mVisibilityTracker.setVisibilityTrackerListener(new VisibilityTracker.VisibilityTrackerListener()
    {
      public void onVisibilityChanged(List<View> paramAnonymousList1, List<View> paramAnonymousList2)
      {
        MoPubAdAdapter.this.handleVisibilityChange(paramAnonymousList1);
      }
    });
    this.mOriginalAdapter.registerDataSetObserver(new DataSetObserver()
    {
      public void onChanged()
      {
        MoPubAdAdapter.this.mStreamAdPlacer.setItemCount(MoPubAdAdapter.this.mOriginalAdapter.getCount());
        MoPubAdAdapter.this.notifyDataSetChanged();
      }

      public void onInvalidated()
      {
        MoPubAdAdapter.this.notifyDataSetInvalidated();
      }
    });
    this.mStreamAdPlacer.setAdLoadedListener(new MoPubNativeAdLoadedListener()
    {
      public void onAdLoaded(int paramAnonymousInt)
      {
        MoPubAdAdapter.this.handleAdLoaded(paramAnonymousInt);
      }

      public void onAdRemoved(int paramAnonymousInt)
      {
        MoPubAdAdapter.this.handleAdRemoved(paramAnonymousInt);
      }
    });
    this.mStreamAdPlacer.setItemCount(this.mOriginalAdapter.getCount());
  }

  private void handleVisibilityChange(List<View> paramList)
  {
    Iterator localIterator = paramList.iterator();
    int i = 2147483647;
    int j = 0;
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      Integer localInteger = (Integer)this.mViewPositionMap.get(localView);
      if (localInteger != null)
      {
        i = Math.min(localInteger.intValue(), i);
        j = Math.max(localInteger.intValue(), j);
      }
    }
    this.mStreamAdPlacer.placeAdsInRange(i, j + 1);
  }

  public boolean areAllItemsEnabled()
  {
    return ((this.mOriginalAdapter instanceof ListAdapter)) && (((ListAdapter)this.mOriginalAdapter).areAllItemsEnabled());
  }

  public void clearAds()
  {
    this.mStreamAdPlacer.clearAds();
  }

  public void destroy()
  {
    this.mStreamAdPlacer.destroy();
    this.mVisibilityTracker.destroy();
  }

  public int getAdjustedPosition(int paramInt)
  {
    return this.mStreamAdPlacer.getAdjustedPosition(paramInt);
  }

  public int getCount()
  {
    return this.mStreamAdPlacer.getAdjustedCount(this.mOriginalAdapter.getCount());
  }

  public Object getItem(int paramInt)
  {
    Object localObject = this.mStreamAdPlacer.getAdData(paramInt);
    if (localObject != null)
      return localObject;
    return this.mOriginalAdapter.getItem(this.mStreamAdPlacer.getOriginalPosition(paramInt));
  }

  public long getItemId(int paramInt)
  {
    Object localObject = this.mStreamAdPlacer.getAdData(paramInt);
    if (localObject != null)
      return 1 + (0xFFFFFFFF ^ System.identityHashCode(localObject));
    return this.mOriginalAdapter.getItemId(this.mStreamAdPlacer.getOriginalPosition(paramInt));
  }

  public int getItemViewType(int paramInt)
  {
    int i = this.mStreamAdPlacer.getAdViewType(paramInt);
    if (i != 0)
      return -1 + (i + this.mOriginalAdapter.getViewTypeCount());
    return this.mOriginalAdapter.getItemViewType(this.mStreamAdPlacer.getOriginalPosition(paramInt));
  }

  public int getOriginalPosition(int paramInt)
  {
    return this.mStreamAdPlacer.getOriginalPosition(paramInt);
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = this.mStreamAdPlacer.getAdView(paramInt, paramView, paramViewGroup);
    if (localView != null);
    while (true)
    {
      this.mViewPositionMap.put(localView, Integer.valueOf(paramInt));
      this.mVisibilityTracker.addView(localView, 0);
      return localView;
      localView = this.mOriginalAdapter.getView(this.mStreamAdPlacer.getOriginalPosition(paramInt), paramView, paramViewGroup);
    }
  }

  public int getViewTypeCount()
  {
    return this.mOriginalAdapter.getViewTypeCount() + this.mStreamAdPlacer.getAdViewTypeCount();
  }

  @VisibleForTesting
  void handleAdLoaded(int paramInt)
  {
    if (this.mAdLoadedListener != null)
      this.mAdLoadedListener.onAdLoaded(paramInt);
    notifyDataSetChanged();
  }

  @VisibleForTesting
  void handleAdRemoved(int paramInt)
  {
    if (this.mAdLoadedListener != null)
      this.mAdLoadedListener.onAdRemoved(paramInt);
    notifyDataSetChanged();
  }

  public boolean hasStableIds()
  {
    return this.mOriginalAdapter.hasStableIds();
  }

  public void insertItem(int paramInt)
  {
    this.mStreamAdPlacer.insertItem(paramInt);
  }

  public boolean isAd(int paramInt)
  {
    return this.mStreamAdPlacer.isAd(paramInt);
  }

  public boolean isEmpty()
  {
    boolean bool1 = this.mOriginalAdapter.isEmpty();
    boolean bool2 = false;
    if (bool1)
    {
      int i = this.mStreamAdPlacer.getAdjustedCount(0);
      bool2 = false;
      if (i == 0)
        bool2 = true;
    }
    return bool2;
  }

  public boolean isEnabled(int paramInt)
  {
    return (isAd(paramInt)) || (((this.mOriginalAdapter instanceof ListAdapter)) && (((ListAdapter)this.mOriginalAdapter).isEnabled(this.mStreamAdPlacer.getOriginalPosition(paramInt))));
  }

  public void loadAds(String paramString)
  {
    this.mStreamAdPlacer.loadAds(paramString);
  }

  public void loadAds(String paramString, RequestParameters paramRequestParameters)
  {
    this.mStreamAdPlacer.loadAds(paramString, paramRequestParameters);
  }

  public void refreshAds(ListView paramListView, String paramString)
  {
    refreshAds(paramListView, paramString, null);
  }

  public void refreshAds(ListView paramListView, String paramString, RequestParameters paramRequestParameters)
  {
    if (paramListView.getAdapter() != this)
    {
      MoPubLog.w("You called refreshAds on a ListView whose adapter is not an ad placer");
      return;
    }
    View localView = paramListView.getChildAt(0);
    if (localView == null);
    int j;
    int k;
    for (int i = 0; ; i = localView.getTop())
    {
      j = paramListView.getFirstVisiblePosition();
      for (k = Math.max(j - 1, 0); (this.mStreamAdPlacer.isAd(k)) && (k > 0); k--);
    }
    for (int m = paramListView.getLastVisiblePosition(); (this.mStreamAdPlacer.isAd(m)) && (m < -1 + getCount()); m++);
    int n = this.mStreamAdPlacer.getOriginalPosition(k);
    int i1 = this.mStreamAdPlacer.getOriginalCount(m + 1);
    int i2 = this.mStreamAdPlacer.getOriginalCount(getCount());
    this.mStreamAdPlacer.removeAdsInRange(i1, i2);
    int i3 = this.mStreamAdPlacer.removeAdsInRange(0, n);
    if (i3 > 0)
      paramListView.setSelectionFromTop(j - i3, i);
    loadAds(paramString, paramRequestParameters);
  }

  public final void registerAdRenderer(MoPubAdRenderer paramMoPubAdRenderer)
  {
    if (paramMoPubAdRenderer == null)
    {
      MoPubLog.w("Tried to set a null ad renderer on the placer.");
      return;
    }
    this.mStreamAdPlacer.registerAdRenderer(paramMoPubAdRenderer);
  }

  public void removeItem(int paramInt)
  {
    this.mStreamAdPlacer.removeItem(paramInt);
  }

  public final void setAdLoadedListener(MoPubNativeAdLoadedListener paramMoPubNativeAdLoadedListener)
  {
    this.mAdLoadedListener = paramMoPubNativeAdLoadedListener;
  }

  public void setOnClickListener(ListView paramListView, final AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    paramListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        if (!MoPubAdAdapter.this.mStreamAdPlacer.isAd(paramAnonymousInt))
          paramOnItemClickListener.onItemClick(paramAnonymousAdapterView, paramAnonymousView, MoPubAdAdapter.this.mStreamAdPlacer.getOriginalPosition(paramAnonymousInt), paramAnonymousLong);
      }
    });
  }

  public void setOnItemLongClickListener(ListView paramListView, final AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    paramListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        return (MoPubAdAdapter.this.isAd(paramAnonymousInt)) || (paramOnItemLongClickListener.onItemLongClick(paramAnonymousAdapterView, paramAnonymousView, MoPubAdAdapter.this.mStreamAdPlacer.getOriginalPosition(paramAnonymousInt), paramAnonymousLong));
      }
    });
  }

  public void setOnItemSelectedListener(ListView paramListView, final AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    paramListView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
      public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        if (!MoPubAdAdapter.this.isAd(paramAnonymousInt))
          paramOnItemSelectedListener.onItemSelected(paramAnonymousAdapterView, paramAnonymousView, MoPubAdAdapter.this.mStreamAdPlacer.getOriginalPosition(paramAnonymousInt), paramAnonymousLong);
      }

      public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
        paramOnItemSelectedListener.onNothingSelected(paramAnonymousAdapterView);
      }
    });
  }

  public void setSelection(ListView paramListView, int paramInt)
  {
    paramListView.setSelection(this.mStreamAdPlacer.getAdjustedPosition(paramInt));
  }

  public void smoothScrollToPosition(ListView paramListView, int paramInt)
  {
    paramListView.smoothScrollToPosition(this.mStreamAdPlacer.getAdjustedPosition(paramInt));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubAdAdapter
 * JD-Core Version:    0.6.2
 */