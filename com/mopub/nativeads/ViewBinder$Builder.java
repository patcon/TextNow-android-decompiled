package com.mopub.nativeads;

import java.util.HashMap;
import java.util.Map;

public final class ViewBinder$Builder
{
  private int callToActionId;
  private Map<String, Integer> extras;
  private int iconImageId;
  private final int layoutId;
  private int mainImageId;
  private int textId;
  private int titleId;

  public ViewBinder$Builder(int paramInt)
  {
    this.layoutId = paramInt;
    this.extras = new HashMap();
  }

  public final Builder addExtra(String paramString, int paramInt)
  {
    this.extras.put(paramString, Integer.valueOf(paramInt));
    return this;
  }

  public final Builder addExtras(Map<String, Integer> paramMap)
  {
    this.extras = new HashMap(paramMap);
    return this;
  }

  public final ViewBinder build()
  {
    return new ViewBinder(this, null);
  }

  public final Builder callToActionId(int paramInt)
  {
    this.callToActionId = paramInt;
    return this;
  }

  public final Builder iconImageId(int paramInt)
  {
    this.iconImageId = paramInt;
    return this;
  }

  public final Builder mainImageId(int paramInt)
  {
    this.mainImageId = paramInt;
    return this;
  }

  public final Builder textId(int paramInt)
  {
    this.textId = paramInt;
    return this;
  }

  public final Builder titleId(int paramInt)
  {
    this.titleId = paramInt;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ViewBinder.Builder
 * JD-Core Version:    0.6.2
 */