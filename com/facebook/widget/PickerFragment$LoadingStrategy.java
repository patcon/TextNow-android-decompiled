package com.facebook.widget;

import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.app.z;
import android.support.v4.content.j;
import com.facebook.FacebookException;
import com.facebook.Request;

abstract class PickerFragment$LoadingStrategy
{
  protected static final int CACHED_RESULT_REFRESH_DELAY = 2000;
  protected GraphObjectAdapter<T> adapter;
  protected GraphObjectPagingLoader<T> loader;

  PickerFragment$LoadingStrategy(PickerFragment paramPickerFragment)
  {
  }

  public void attach(GraphObjectAdapter<T> paramGraphObjectAdapter)
  {
    this.loader = ((GraphObjectPagingLoader)this.this$0.getLoaderManager().a(0, null, new aa()
    {
      public j<SimpleGraphObjectCursor<T>> onCreateLoader(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        return PickerFragment.LoadingStrategy.this.onCreateLoader();
      }

      public void onLoadFinished(j<SimpleGraphObjectCursor<T>> paramAnonymousj, SimpleGraphObjectCursor<T> paramAnonymousSimpleGraphObjectCursor)
      {
        if (paramAnonymousj != PickerFragment.LoadingStrategy.this.loader)
          throw new FacebookException("Received callback for unknown loader.");
        PickerFragment.LoadingStrategy.this.onLoadFinished((GraphObjectPagingLoader)paramAnonymousj, paramAnonymousSimpleGraphObjectCursor);
      }

      public void onLoaderReset(j<SimpleGraphObjectCursor<T>> paramAnonymousj)
      {
        if (paramAnonymousj != PickerFragment.LoadingStrategy.this.loader)
          throw new FacebookException("Received callback for unknown loader.");
        PickerFragment.LoadingStrategy.this.onLoadReset((GraphObjectPagingLoader)paramAnonymousj);
      }
    }));
    this.loader.setOnErrorListener(new GraphObjectPagingLoader.OnErrorListener()
    {
      public void onError(FacebookException paramAnonymousFacebookException, GraphObjectPagingLoader<?> paramAnonymousGraphObjectPagingLoader)
      {
        PickerFragment.LoadingStrategy.this.this$0.hideActivityCircle();
        if (PickerFragment.access$500(PickerFragment.LoadingStrategy.this.this$0) != null)
          PickerFragment.access$500(PickerFragment.LoadingStrategy.this.this$0).onError(PickerFragment.LoadingStrategy.this.this$0, paramAnonymousFacebookException);
      }
    });
    this.adapter = paramGraphObjectAdapter;
    this.adapter.changeCursor(this.loader.getCursor());
    this.adapter.setOnErrorListener(new GraphObjectAdapter.OnErrorListener()
    {
      public void onError(GraphObjectAdapter<?> paramAnonymousGraphObjectAdapter, FacebookException paramAnonymousFacebookException)
      {
        if (PickerFragment.access$500(PickerFragment.LoadingStrategy.this.this$0) != null)
          PickerFragment.access$500(PickerFragment.LoadingStrategy.this.this$0).onError(PickerFragment.LoadingStrategy.this.this$0, paramAnonymousFacebookException);
      }
    });
  }

  protected boolean canSkipRoundTripIfCached()
  {
    return true;
  }

  public void clearResults()
  {
    if (this.loader != null)
      this.loader.clearResults();
  }

  public void detach()
  {
    this.adapter.setDataNeededListener(null);
    this.adapter.setOnErrorListener(null);
    this.loader.setOnErrorListener(null);
    this.loader = null;
    this.adapter = null;
  }

  public boolean isDataPresentOrLoading()
  {
    return (!this.adapter.isEmpty()) || (this.loader.isLoading());
  }

  protected GraphObjectPagingLoader<T> onCreateLoader()
  {
    return new GraphObjectPagingLoader(this.this$0.getActivity(), PickerFragment.access$600(this.this$0));
  }

  protected void onLoadFinished(GraphObjectPagingLoader<T> paramGraphObjectPagingLoader, SimpleGraphObjectCursor<T> paramSimpleGraphObjectCursor)
  {
    this.this$0.updateAdapter(paramSimpleGraphObjectCursor);
  }

  protected void onLoadReset(GraphObjectPagingLoader<T> paramGraphObjectPagingLoader)
  {
    this.adapter.changeCursor(null);
  }

  protected void onStartLoading(GraphObjectPagingLoader<T> paramGraphObjectPagingLoader, Request paramRequest)
  {
    this.this$0.displayActivityCircle();
  }

  public void startLoading(Request paramRequest)
  {
    if (this.loader != null)
    {
      this.loader.startLoading(paramRequest, canSkipRoundTripIfCached());
      onStartLoading(this.loader, paramRequest);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.PickerFragment.LoadingStrategy
 * JD-Core Version:    0.6.2
 */