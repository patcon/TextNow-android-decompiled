package com.mopub.mobileads.util.vast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VastCompanionAd
  implements Serializable
{
  private static final long serialVersionUID;
  private final String mClickThroughUrl;
  private final ArrayList<String> mClickTrackers;
  private final Integer mHeight;
  private final String mImageUrl;
  private final Integer mWidth;

  public VastCompanionAd(Integer paramInteger1, Integer paramInteger2, String paramString1, String paramString2, ArrayList<String> paramArrayList)
  {
    this.mWidth = paramInteger1;
    this.mHeight = paramInteger2;
    this.mImageUrl = paramString1;
    this.mClickThroughUrl = paramString2;
    this.mClickTrackers = paramArrayList;
  }

  public String getClickThroughUrl()
  {
    return this.mClickThroughUrl;
  }

  public List<String> getClickTrackers()
  {
    return this.mClickTrackers;
  }

  public Integer getHeight()
  {
    return this.mHeight;
  }

  public String getImageUrl()
  {
    return this.mImageUrl;
  }

  public Integer getWidth()
  {
    return this.mWidth;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.vast.VastCompanionAd
 * JD-Core Version:    0.6.2
 */