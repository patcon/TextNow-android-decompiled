package com.stripe.model;

public class DeletedCustomer extends StripeObject
{
  Boolean deleted;
  String id;

  public Boolean getDeleted()
  {
    return this.deleted;
  }

  public String getId()
  {
    return this.id;
  }

  public void setDeleted(Boolean paramBoolean)
  {
    this.deleted = paramBoolean;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.DeletedCustomer
 * JD-Core Version:    0.6.2
 */