package com.google.android.gms.plus;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.plus.model.people.PersonBuffer;

public abstract interface People$LoadPeopleResult extends Releasable, Result
{
  public abstract String getNextPageToken();

  public abstract PersonBuffer getPersonBuffer();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.People.LoadPeopleResult
 * JD-Core Version:    0.6.2
 */