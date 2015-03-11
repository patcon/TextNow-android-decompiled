package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.Plus.a;
import com.google.android.gms.plus.model.moments.MomentBuffer;

abstract class kl$a extends Plus.a<Moments.LoadMomentsResult>
{
  public Moments.LoadMomentsResult an(final Status paramStatus)
  {
    return new Moments.LoadMomentsResult()
    {
      public MomentBuffer getMomentBuffer()
      {
        return null;
      }

      public String getNextPageToken()
      {
        return null;
      }

      public Status getStatus()
      {
        return paramStatus;
      }

      public String getUpdated()
      {
        return null;
      }

      public void release()
      {
      }
    };
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kl.a
 * JD-Core Version:    0.6.2
 */