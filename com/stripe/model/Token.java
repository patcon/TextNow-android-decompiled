package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class Token extends APIResource
{
  Integer amount;
  Card card;
  Long created;
  String currency;
  String id;
  Boolean livemode;
  Boolean used;

  public static Token create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public static Token create(Map<String, Object> paramMap, String paramString)
  {
    return (Token)request(APIResource.RequestMethod.POST, classURL(Token.class), paramMap, Token.class, paramString);
  }

  public static Token retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static Token retrieve(String paramString1, String paramString2)
  {
    return (Token)request(APIResource.RequestMethod.GET, instanceURL(Token.class, paramString1), null, Token.class, paramString2);
  }

  public Integer getAmount()
  {
    return this.amount;
  }

  public Card getCard()
  {
    return this.card;
  }

  public Long getCreated()
  {
    return this.created;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public String getId()
  {
    return this.id;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Boolean getUsed()
  {
    return this.used;
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setCard(Card paramCard)
  {
    this.card = paramCard;
  }

  public void setCreated(Long paramLong)
  {
    this.created = paramLong;
  }

  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setUsed(Boolean paramBoolean)
  {
    this.used = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.Token
 * JD-Core Version:    0.6.2
 */