package com.enflick.android.TextNow.api.responsemodel;

import textnow.t.c;

public class Subscription
{

  @c(a="created_at")
  public String createdAt;

  @c(a="data_usage")
  public int dataUsage;

  @c(a="id")
  public int id;

  @c(a="last_updated")
  public String lastUpdated;

  @c(a="period_end")
  public String periodEnd;

  @c(a="period_start")
  public String periodStart;

  @c(a="plan")
  public Plan plan;

  @c(a="status")
  public String status;

  @c(a="warned")
  public boolean warned;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.Subscription
 * JD-Core Version:    0.6.2
 */