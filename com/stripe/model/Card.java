package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class Card extends APIResource
{
  String addressCity;
  String addressCountry;
  String addressLine1;
  String addressLine1Check;
  String addressLine2;
  String addressState;
  String addressZip;
  String addressZipCheck;
  String country;
  String customer;
  String cvcCheck;
  Integer expMonth;
  Integer expYear;
  String fingerprint;
  String id;
  String last4;
  String name;
  String type;

  public DeletedCard delete()
  {
    return delete(null);
  }

  public DeletedCard delete(String paramString)
  {
    return (DeletedCard)request(APIResource.RequestMethod.DELETE, getInstanceURL(), null, DeletedCard.class, paramString);
  }

  public String getAddressCity()
  {
    return this.addressCity;
  }

  public String getAddressCountry()
  {
    return this.addressCountry;
  }

  public String getAddressLine1()
  {
    return this.addressLine1;
  }

  public String getAddressLine1Check()
  {
    return this.addressLine1Check;
  }

  public String getAddressLine2()
  {
    return this.addressLine2;
  }

  public String getAddressState()
  {
    return this.addressState;
  }

  public String getAddressZip()
  {
    return this.addressZip;
  }

  public String getAddressZipCheck()
  {
    return this.addressZipCheck;
  }

  public String getCountry()
  {
    return this.country;
  }

  public String getCustomer()
  {
    return this.customer;
  }

  public String getCvcCheck()
  {
    return this.cvcCheck;
  }

  public Integer getExpMonth()
  {
    return this.expMonth;
  }

  public Integer getExpYear()
  {
    return this.expYear;
  }

  public String getFingerprint()
  {
    return this.fingerprint;
  }

  public String getId()
  {
    return this.id;
  }

  public String getInstanceURL()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = classURL(Customer.class);
    arrayOfObject[1] = getCustomer();
    arrayOfObject[2] = getId();
    return String.format("%s/%s/cards/%s", arrayOfObject);
  }

  public String getLast4()
  {
    return this.last4;
  }

  public String getName()
  {
    return this.name;
  }

  public String getType()
  {
    return this.type;
  }

  public void setAddressCity(String paramString)
  {
    this.addressCity = paramString;
  }

  public void setAddressCountry(String paramString)
  {
    this.addressCountry = paramString;
  }

  public void setAddressLine1(String paramString)
  {
    this.addressLine1 = paramString;
  }

  public void setAddressLine1Check(String paramString)
  {
    this.addressLine1Check = paramString;
  }

  public void setAddressLine2(String paramString)
  {
    this.addressLine2 = paramString;
  }

  public void setAddressState(String paramString)
  {
    this.addressState = paramString;
  }

  public void setAddressZip(String paramString)
  {
    this.addressZip = paramString;
  }

  public void setAddressZipCheck(String paramString)
  {
    this.addressZipCheck = paramString;
  }

  public void setCountry(String paramString)
  {
    this.country = paramString;
  }

  public void setCustomer(String paramString)
  {
    this.customer = paramString;
  }

  public void setCvcCheck(String paramString)
  {
    this.cvcCheck = paramString;
  }

  public void setExpMonth(Integer paramInteger)
  {
    this.expMonth = paramInteger;
  }

  public void setExpYear(Integer paramInteger)
  {
    this.expYear = paramInteger;
  }

  public void setFingerprint(String paramString)
  {
    this.fingerprint = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLast4(String paramString)
  {
    this.last4 = paramString;
  }

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }

  public Card update(Map<String, Object> paramMap)
  {
    return update(paramMap, null);
  }

  public Card update(Map<String, Object> paramMap, String paramString)
  {
    return (Card)request(APIResource.RequestMethod.POST, getInstanceURL(), paramMap, Card.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.Card
 * JD-Core Version:    0.6.2
 */