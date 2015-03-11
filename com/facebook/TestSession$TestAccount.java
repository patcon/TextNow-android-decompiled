package com.facebook;

import com.facebook.model.GraphObject;

abstract interface TestSession$TestAccount extends GraphObject
{
  public abstract String getAccessToken();

  public abstract String getId();

  public abstract String getName();

  public abstract void setName(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.TestSession.TestAccount
 * JD-Core Version:    0.6.2
 */