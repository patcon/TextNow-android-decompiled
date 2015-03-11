package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.moments.Moment;

public final class kl
  implements Moments
{
  public final PendingResult<Moments.LoadMomentsResult> load(GoogleApiClient paramGoogleApiClient)
  {
    // Byte code:
    //   0: aload_1
    //   1: new 14	com/google/android/gms/internal/kl$1
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 17	com/google/android/gms/internal/kl$1:<init>	(Lcom/google/android/gms/internal/kl;)V
    //   9: invokeinterface 23 2 0
    //   14: areturn
  }

  public final PendingResult<Moments.LoadMomentsResult> load(GoogleApiClient paramGoogleApiClient, final int paramInt, final String paramString1, final Uri paramUri, final String paramString2, final String paramString3)
  {
    return paramGoogleApiClient.a(new kl.a(paramInt)
    {
      protected void a(e paramAnonymouse)
      {
        paramAnonymouse.a(this, paramInt, paramString1, paramUri, paramString2, paramString3);
      }
    });
  }

  public final PendingResult<Status> remove(GoogleApiClient paramGoogleApiClient, final String paramString)
  {
    return paramGoogleApiClient.b(new kl.b(paramString)
    {
      protected void a(e paramAnonymouse)
      {
        paramAnonymouse.removeMoment(paramString);
        b(Status.En);
      }
    });
  }

  public final PendingResult<Status> write(GoogleApiClient paramGoogleApiClient, final Moment paramMoment)
  {
    return paramGoogleApiClient.b(new kl.c(paramMoment)
    {
      protected void a(e paramAnonymouse)
      {
        paramAnonymouse.a(this, paramMoment);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kl
 * JD-Core Version:    0.6.2
 */