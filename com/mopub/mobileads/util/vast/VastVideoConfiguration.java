package com.mopub.mobileads.util.vast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VastVideoConfiguration
  implements Serializable
{
  private static final long serialVersionUID;
  private String mClickThroughUrl;
  private ArrayList<String> mClickTrackers = new ArrayList();
  private ArrayList<String> mCompleteTrackers = new ArrayList();
  private String mDiskMediaFileUrl;
  private ArrayList<String> mFirstQuartileTrackers = new ArrayList();
  private ArrayList<String> mImpressionTrackers = new ArrayList();
  private ArrayList<String> mMidpointTrackers = new ArrayList();
  private String mNetworkMediaFileUrl;
  private ArrayList<String> mStartTrackers = new ArrayList();
  private ArrayList<String> mThirdQuartileTrackers = new ArrayList();
  private VastCompanionAd mVastCompanionAd;

  public void addClickTrackers(List<String> paramList)
  {
    this.mClickTrackers.addAll(paramList);
  }

  public void addCompleteTrackers(List<String> paramList)
  {
    this.mCompleteTrackers.addAll(paramList);
  }

  public void addFirstQuartileTrackers(List<String> paramList)
  {
    this.mFirstQuartileTrackers.addAll(paramList);
  }

  public void addImpressionTrackers(List<String> paramList)
  {
    this.mImpressionTrackers.addAll(paramList);
  }

  public void addMidpointTrackers(List<String> paramList)
  {
    this.mMidpointTrackers.addAll(paramList);
  }

  public void addStartTrackers(List<String> paramList)
  {
    this.mStartTrackers.addAll(paramList);
  }

  public void addThirdQuartileTrackers(List<String> paramList)
  {
    this.mThirdQuartileTrackers.addAll(paramList);
  }

  public String getClickThroughUrl()
  {
    return this.mClickThroughUrl;
  }

  public List<String> getClickTrackers()
  {
    return this.mClickTrackers;
  }

  public List<String> getCompleteTrackers()
  {
    return this.mCompleteTrackers;
  }

  public String getDiskMediaFileUrl()
  {
    return this.mDiskMediaFileUrl;
  }

  public List<String> getFirstQuartileTrackers()
  {
    return this.mFirstQuartileTrackers;
  }

  public List<String> getImpressionTrackers()
  {
    return this.mImpressionTrackers;
  }

  public List<String> getMidpointTrackers()
  {
    return this.mMidpointTrackers;
  }

  public String getNetworkMediaFileUrl()
  {
    return this.mNetworkMediaFileUrl;
  }

  public List<String> getStartTrackers()
  {
    return this.mStartTrackers;
  }

  public List<String> getThirdQuartileTrackers()
  {
    return this.mThirdQuartileTrackers;
  }

  public VastCompanionAd getVastCompanionAd()
  {
    return this.mVastCompanionAd;
  }

  public void setClickThroughUrl(String paramString)
  {
    this.mClickThroughUrl = paramString;
  }

  public void setDiskMediaFileUrl(String paramString)
  {
    this.mDiskMediaFileUrl = paramString;
  }

  public void setNetworkMediaFileUrl(String paramString)
  {
    this.mNetworkMediaFileUrl = paramString;
  }

  public void setVastCompanionAd(VastCompanionAd paramVastCompanionAd)
  {
    this.mVastCompanionAd = paramVastCompanionAd;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.vast.VastVideoConfiguration
 * JD-Core Version:    0.6.2
 */