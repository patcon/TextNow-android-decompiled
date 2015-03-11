package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public abstract interface Person$Cover extends Freezable<Cover>
{
  public abstract Person.Cover.CoverInfo getCoverInfo();

  public abstract Person.Cover.CoverPhoto getCoverPhoto();

  public abstract int getLayout();

  public abstract boolean hasCoverInfo();

  public abstract boolean hasCoverPhoto();

  public abstract boolean hasLayout();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.model.people.Person.Cover
 * JD-Core Version:    0.6.2
 */