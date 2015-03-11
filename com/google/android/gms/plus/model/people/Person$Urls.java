package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public abstract interface Person$Urls extends Freezable<Urls>
{
  public abstract String getLabel();

  public abstract int getType();

  public abstract String getValue();

  public abstract boolean hasLabel();

  public abstract boolean hasType();

  public abstract boolean hasValue();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.model.people.Person.Urls
 * JD-Core Version:    0.6.2
 */