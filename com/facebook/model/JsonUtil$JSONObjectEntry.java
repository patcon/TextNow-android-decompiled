package com.facebook.model;

import android.annotation.SuppressLint;
import java.util.Map.Entry;

final class JsonUtil$JSONObjectEntry
  implements Map.Entry<String, Object>
{
  private final String key;
  private final Object value;

  JsonUtil$JSONObjectEntry(String paramString, Object paramObject)
  {
    this.key = paramString;
    this.value = paramObject;
  }

  @SuppressLint({"FieldGetter"})
  public final String getKey()
  {
    return this.key;
  }

  public final Object getValue()
  {
    return this.value;
  }

  public final Object setValue(Object paramObject)
  {
    throw new UnsupportedOperationException("JSONObjectEntry is immutable");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.model.JsonUtil.JSONObjectEntry
 * JD-Core Version:    0.6.2
 */