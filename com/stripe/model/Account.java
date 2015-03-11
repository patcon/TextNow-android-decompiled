package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.List;

public class Account extends APIResource
{
  Boolean chargeEnabled;
  String country;
  List<String> currenciesSupported;
  String defaultCurrency;
  Boolean detailsSubmitted;
  String displayName;
  String email;
  String id;
  String statementDescriptor;
  String timezone;
  Boolean transferEnabled;

  public static Account retrieve()
  {
    return retrieve(null);
  }

  public static Account retrieve(String paramString)
  {
    return (Account)request(APIResource.RequestMethod.GET, singleClassURL(Account.class), null, Account.class, paramString);
  }

  public Boolean getChargeEnabled()
  {
    return this.chargeEnabled;
  }

  public String getCountry()
  {
    return this.country;
  }

  public List<String> getCurrenciesSupported()
  {
    return this.currenciesSupported;
  }

  public String getDefaultCurrency()
  {
    return this.defaultCurrency;
  }

  public Boolean getDetailsSubmitted()
  {
    return this.detailsSubmitted;
  }

  public String getDisplayName()
  {
    return this.displayName;
  }

  public String getEmail()
  {
    return this.email;
  }

  public String getId()
  {
    return this.id;
  }

  public String getStatementDescriptor()
  {
    return this.statementDescriptor;
  }

  public String getTimezone()
  {
    return this.timezone;
  }

  public Boolean getTransferEnabled()
  {
    return this.transferEnabled;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.Account
 * JD-Core Version:    0.6.2
 */