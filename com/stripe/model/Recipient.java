package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class Recipient extends APIResource
  implements MetadataStore<Recipient>
{
  BankAccount activeAccount;
  Long created;
  Boolean deleted;
  String description;
  String email;
  String id;
  Boolean livemode;
  Map<String, String> metadata;
  String name;
  String type;
  Boolean verified;

  public static RecipientCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static RecipientCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (RecipientCollection)request(APIResource.RequestMethod.GET, classURL(Recipient.class), paramMap, RecipientCollection.class, paramString);
  }

  public static Recipient create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public static Recipient create(Map<String, Object> paramMap, String paramString)
  {
    return (Recipient)request(APIResource.RequestMethod.POST, classURL(Recipient.class), paramMap, Recipient.class, paramString);
  }

  public static Recipient retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static Recipient retrieve(String paramString1, String paramString2)
  {
    return (Recipient)request(APIResource.RequestMethod.GET, instanceURL(Recipient.class, paramString1), null, Recipient.class, paramString2);
  }

  public DeletedRecipient delete()
  {
    return delete(null);
  }

  public DeletedRecipient delete(String paramString)
  {
    return (DeletedRecipient)request(APIResource.RequestMethod.DELETE, instanceURL(Recipient.class, this.id), null, DeletedRecipient.class, paramString);
  }

  public BankAccount getActiveAccount()
  {
    return this.activeAccount;
  }

  public Long getCreated()
  {
    return this.created;
  }

  public Boolean getDeleted()
  {
    return this.deleted;
  }

  public String getDescription()
  {
    return this.description;
  }

  public String getEmail()
  {
    return this.email;
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

  public String getName()
  {
    return this.name;
  }

  public String getType()
  {
    return this.type;
  }

  public Boolean getVerified()
  {
    return this.verified;
  }

  public void setActiveAccount(BankAccount paramBankAccount)
  {
    this.activeAccount = paramBankAccount;
  }

  public void setCreated(Long paramLong)
  {
    this.created = paramLong;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public void setEmail(String paramString)
  {
    this.email = paramString;
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

  public void setName(String paramString)
  {
    this.name = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }

  public void setVerified(Boolean paramBoolean)
  {
    this.verified = paramBoolean;
  }

  public Recipient update(Map<String, Object> paramMap)
  {
    return update(paramMap, null);
  }

  public Recipient update(Map<String, Object> paramMap, String paramString)
  {
    return (Recipient)request(APIResource.RequestMethod.POST, instanceURL(Recipient.class, this.id), paramMap, Recipient.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.Recipient
 * JD-Core Version:    0.6.2
 */