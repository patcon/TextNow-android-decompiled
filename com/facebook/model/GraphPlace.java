package com.facebook.model;

public abstract interface GraphPlace extends GraphObject
{
  public abstract String getCategory();

  public abstract String getId();

  public abstract GraphLocation getLocation();

  public abstract String getName();

  public abstract void setCategory(String paramString);

  public abstract void setId(String paramString);

  public abstract void setLocation(GraphLocation paramGraphLocation);

  public abstract void setName(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.model.GraphPlace
 * JD-Core Version:    0.6.2
 */