package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class Plan extends APIResource
  implements MetadataStore<Plan>
{
  Integer amount;
  String currency;
  String id;
  String interval;
  Integer intervalCount;
  Boolean livemode;
  Map<String, String> metadata;
  String name;
  String statementDescription;
  Integer trialPeriodDays;

  public static PlanCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static PlanCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (PlanCollection)request(APIResource.RequestMethod.GET, classURL(Plan.class), paramMap, PlanCollection.class, paramString);
  }

  public static Plan create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public static Plan create(Map<String, Object> paramMap, String paramString)
  {
    return (Plan)request(APIResource.RequestMethod.POST, classURL(Plan.class), paramMap, Plan.class, paramString);
  }

  public static Plan retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static Plan retrieve(String paramString1, String paramString2)
  {
    return (Plan)request(APIResource.RequestMethod.GET, instanceURL(Plan.class, paramString1), null, Plan.class, paramString2);
  }

  public DeletedPlan delete()
  {
    return delete(null);
  }

  public DeletedPlan delete(String paramString)
  {
    return (DeletedPlan)request(APIResource.RequestMethod.DELETE, instanceURL(Plan.class, this.id), null, DeletedPlan.class, paramString);
  }

  public Integer getAmount()
  {
    return this.amount;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public String getId()
  {
    return this.id;
  }

  public String getInterval()
  {
    return this.interval;
  }

  public Integer getIntervalCount()
  {
    return this.intervalCount;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Map<String, String> getMetadata()
  {
    return this.metadata;
  }

  public String getName()
  {
    return this.name;
  }

  public String getStatementDescription()
  {
    return this.statementDescription;
  }

  public Integer getTrialPeriodDays()
  {
    return this.trialPeriodDays;
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setInterval(String paramString)
  {
    this.interval = paramString;
  }

  public void setIntervalCount(Integer paramInteger)
  {
    this.intervalCount = paramInteger;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setMetadata(Map<String, String> paramMap)
  {
    this.metadata = paramMap;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void setStatementDescription(String paramString)
  {
    this.statementDescription = paramString;
  }

  public void setTrialPeriodDays(Integer paramInteger)
  {
    this.trialPeriodDays = paramInteger;
  }

  public Plan update(Map<String, Object> paramMap)
  {
    return update(paramMap, null);
  }

  public Plan update(Map<String, Object> paramMap, String paramString)
  {
    return (Plan)request(APIResource.RequestMethod.POST, instanceURL(Plan.class, this.id), paramMap, Plan.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.Plan
 * JD-Core Version:    0.6.2
 */