package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus.a;
import com.google.android.gms.plus.model.people.PersonBuffer;

abstract class nt$a extends Plus.a<People.LoadPeopleResult>
{
  public People.LoadPeopleResult aD(final Status paramStatus)
  {
    return new People.LoadPeopleResult()
    {
      public String getNextPageToken()
      {
        return null;
      }

      public PersonBuffer getPersonBuffer()
      {
        return null;
      }

      public Status getStatus()
      {
        return paramStatus;
      }

      public void release()
      {
      }
    };
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nt.a
 * JD-Core Version:    0.6.2
 */