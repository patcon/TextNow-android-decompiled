package com.admarvel.android.offlinesdk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class AdMarvelLinkedAD
  implements Serializable
{
  private static final long serialVersionUID = 132198219871927192L;
  int adId;
  HashMap<String, ArrayList<String[]>> adTargetingOption;
  int adWeight;
  int campaignPriority;
  float deliveryPriority;
  HashMap<String, String> deliveryPriorityBySite;
  int deliveryWeight;
  long endDate;
  long startDate;

  public int getAdId()
  {
    return this.adId;
  }

  public HashMap<String, ArrayList<String[]>> getAdTargetingOption()
  {
    return this.adTargetingOption;
  }

  public int getAdWeight()
  {
    return this.adWeight;
  }

  public int getCampaignPriority()
  {
    return this.campaignPriority;
  }

  public float getDeliveryPriority()
  {
    return this.deliveryPriority;
  }

  public HashMap<String, String> getDeliveryPriorityBySite()
  {
    return this.deliveryPriorityBySite;
  }

  public int getDeliveryWeight()
  {
    return this.deliveryWeight;
  }

  public long getEndDate()
  {
    return this.endDate;
  }

  public long getStartDate()
  {
    return this.startDate;
  }

  public void setAdId(int paramInt)
  {
    this.adId = paramInt;
  }

  public void setAdTargetingOption(HashMap<String, ArrayList<String[]>> paramHashMap)
  {
    this.adTargetingOption = paramHashMap;
  }

  public void setAdWeight(int paramInt)
  {
    this.adWeight = paramInt;
  }

  public void setCampaignPriority(int paramInt)
  {
    this.campaignPriority = paramInt;
  }

  public void setDeliveryPriority(float paramFloat)
  {
    this.deliveryPriority = paramFloat;
  }

  public void setDeliveryPriorityBySite(HashMap<String, String> paramHashMap)
  {
    this.deliveryPriorityBySite = paramHashMap;
  }

  public void setDeliveryWeight(int paramInt)
  {
    this.deliveryWeight = paramInt;
  }

  public void setEndDate(long paramLong)
  {
    this.endDate = paramLong;
  }

  public void setStartDate(long paramLong)
  {
    this.startDate = paramLong;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.offlinesdk.model.AdMarvelLinkedAD
 * JD-Core Version:    0.6.2
 */