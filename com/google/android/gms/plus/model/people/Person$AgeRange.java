package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public abstract interface Person$AgeRange extends Freezable<AgeRange>
{
  public abstract int getMax();

  public abstract int getMin();

  public abstract boolean hasMax();

  public abstract boolean hasMin();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.model.people.Person.AgeRange
 * JD-Core Version:    0.6.2
 */