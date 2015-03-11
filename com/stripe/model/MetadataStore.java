package com.stripe.model;

import java.util.Map;

public abstract interface MetadataStore<T>
{
  public abstract Map<String, String> getMetadata();

  public abstract void setMetadata(Map<String, String> paramMap);

  public abstract MetadataStore<T> update(Map<String, Object> paramMap);

  public abstract MetadataStore<T> update(Map<String, Object> paramMap, String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.MetadataStore
 * JD-Core Version:    0.6.2
 */