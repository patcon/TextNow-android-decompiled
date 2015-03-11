package com.facebook.widget;

import com.facebook.model.GraphPlace;

class PlacePickerFragment$AsNeededLoadingStrategy extends PickerFragment.LoadingStrategy
{
  private PlacePickerFragment$AsNeededLoadingStrategy(PlacePickerFragment paramPlacePickerFragment)
  {
    super(paramPlacePickerFragment);
  }

  public void attach(GraphObjectAdapter<GraphPlace> paramGraphObjectAdapter)
  {
    super.attach(paramGraphObjectAdapter);
    this.adapter.setDataNeededListener(new GraphObjectAdapter.DataNeededListener()
    {
      public void onDataNeeded()
      {
        if (!PlacePickerFragment.AsNeededLoadingStrategy.this.loader.isLoading())
          PlacePickerFragment.AsNeededLoadingStrategy.this.loader.followNextLink();
      }
    });
  }

  protected void onLoadFinished(GraphObjectPagingLoader<GraphPlace> paramGraphObjectPagingLoader, SimpleGraphObjectCursor<GraphPlace> paramSimpleGraphObjectCursor)
  {
    super.onLoadFinished(paramGraphObjectPagingLoader, paramSimpleGraphObjectCursor);
    if ((paramSimpleGraphObjectCursor == null) || (paramGraphObjectPagingLoader.isLoading()));
    do
    {
      return;
      this.this$0.hideActivityCircle();
    }
    while (!paramSimpleGraphObjectCursor.isFromCache());
    if (paramSimpleGraphObjectCursor.areMoreObjectsAvailable());
    for (long l = 2000L; ; l = 0L)
    {
      paramGraphObjectPagingLoader.refreshOriginalRequest(l);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.PlacePickerFragment.AsNeededLoadingStrategy
 * JD-Core Version:    0.6.2
 */