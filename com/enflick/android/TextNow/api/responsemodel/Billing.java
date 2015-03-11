package com.enflick.android.TextNow.api.responsemodel;

import textnow.t.c;

public class Billing
{

  @c(a="address_city")
  public String addressCity;

  @c(a="address_country")
  public String addressCountry;

  @c(a="address_line1")
  public String addressLine1;

  @c(a="address_line2")
  public String addressLine2;

  @c(a="address_state")
  public String addressState;

  @c(a="address_zip")
  public String addressZip;

  @c(a="exp_month")
  public int expMonth;

  @c(a="exp_year")
  public int expYear;

  @c(a="last4")
  public String last4;

  @c(a="name")
  public String name;

  @c(a="type")
  public String type;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.Billing
 * JD-Core Version:    0.6.2
 */