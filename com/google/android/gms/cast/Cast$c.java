package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;

abstract class Cast$c extends Cast.a<Cast.ApplicationConnectionResult>
{
  public Cast.ApplicationConnectionResult j(final Status paramStatus)
  {
    return new Cast.ApplicationConnectionResult()
    {
      public ApplicationMetadata getApplicationMetadata()
      {
        return null;
      }

      public String getApplicationStatus()
      {
        return null;
      }

      public String getSessionId()
      {
        return null;
      }

      public Status getStatus()
      {
        return paramStatus;
      }

      public boolean getWasLaunched()
      {
        return false;
      }
    };
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast.c
 * JD-Core Version:    0.6.2
 */