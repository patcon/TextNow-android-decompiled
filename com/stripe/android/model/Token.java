package com.stripe.android.model;

import com.stripe.model.StripeObject;
import java.util.Date;

public class Token extends StripeObject
{
  Card card;
  Date created;
  String id;
  boolean livemode;
  boolean used;

  public Token(String paramString, boolean paramBoolean, Date paramDate, Boolean paramBoolean1, Card paramCard)
  {
    this.id = paramString;
    this.livemode = paramBoolean;
    this.card = paramCard;
    this.created = paramDate;
    this.used = paramBoolean1.booleanValue();
  }

  public Card getCard()
  {
    return this.card;
  }

  public Date getCreated()
  {
    return this.created;
  }

  public String getId()
  {
    return this.id;
  }

  public boolean getLivemode()
  {
    return this.livemode;
  }

  public boolean getUsed()
  {
    return this.used;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.android.model.Token
 * JD-Core Version:    0.6.2
 */