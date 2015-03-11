package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.List;
import java.util.Map;

public class Transfer extends APIResource
  implements MetadataStore<Transfer>
{
  BankAccount account;
  Integer amount;
  String balanceTransaction;
  String currency;
  Long date;
  String description;
  String id;
  Boolean livemode;
  Map<String, String> metadata;
  List<String> otherTransfers;
  String recipient;
  String statementDescriptor;
  String status;
  Summary summary;

  public static TransferCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static TransferCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (TransferCollection)request(APIResource.RequestMethod.GET, classURL(Transfer.class), paramMap, TransferCollection.class, paramString);
  }

  public static Transfer create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public static Transfer create(Map<String, Object> paramMap, String paramString)
  {
    return (Transfer)request(APIResource.RequestMethod.POST, classURL(Transfer.class), paramMap, Transfer.class, paramString);
  }

  public static Transfer retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static Transfer retrieve(String paramString1, String paramString2)
  {
    return (Transfer)request(APIResource.RequestMethod.GET, instanceURL(Transfer.class, paramString1), null, Transfer.class, paramString2);
  }

  public BankAccount getAccount()
  {
    return this.account;
  }

  public Integer getAmount()
  {
    return this.amount;
  }

  public String getBalanceTransaction()
  {
    return this.balanceTransaction;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public Long getDate()
  {
    return this.date;
  }

  public String getDescription()
  {
    return this.description;
  }

  public String getId()
  {
    return this.id;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Map<String, String> getMetadata()
  {
    return this.metadata;
  }

  public List<String> getOtherTransfers()
  {
    return this.otherTransfers;
  }

  public String getRecipient()
  {
    return this.recipient;
  }

  public String getStatementDescriptor()
  {
    return this.statementDescriptor;
  }

  public String getStatus()
  {
    return this.status;
  }

  public Summary getSummary()
  {
    return this.summary;
  }

  public void setAccount(BankAccount paramBankAccount)
  {
    this.account = paramBankAccount;
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setBalanceTransaction(String paramString)
  {
    this.balanceTransaction = paramString;
  }

  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }

  public void setDate(Long paramLong)
  {
    this.date = paramLong;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setMetadata(Map<String, String> paramMap)
  {
    this.metadata = paramMap;
  }

  public void setOtherTransfers(List<String> paramList)
  {
    this.otherTransfers = paramList;
  }

  public void setRecipient(String paramString)
  {
    this.recipient = paramString;
  }

  public void setStatementDescriptor(String paramString)
  {
    this.statementDescriptor = paramString;
  }

  public void setStatus(String paramString)
  {
    this.status = paramString;
  }

  public void setSummary(Summary paramSummary)
  {
    this.summary = paramSummary;
  }

  public TransferTransactionCollection transactions(Map<String, Object> paramMap)
  {
    return transactions(paramMap, null);
  }

  public TransferTransactionCollection transactions(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.GET;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Transfer.class, getId());
    return (TransferTransactionCollection)request(localRequestMethod, String.format("%s/transactions", arrayOfObject), paramMap, TransferTransactionCollection.class, paramString);
  }

  public Transfer update(Map<String, Object> paramMap)
  {
    return update(paramMap, null);
  }

  public Transfer update(Map<String, Object> paramMap, String paramString)
  {
    return (Transfer)request(APIResource.RequestMethod.POST, instanceURL(Transfer.class, this.id), paramMap, Transfer.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.Transfer
 * JD-Core Version:    0.6.2
 */