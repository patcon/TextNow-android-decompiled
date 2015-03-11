package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public final class nt
  implements People
{
  public final Person getCurrentPerson(GoogleApiClient paramGoogleApiClient)
  {
    return Plus.a(paramGoogleApiClient, Plus.CU).getCurrentPerson();
  }

  public final PendingResult<People.LoadPeopleResult> load(GoogleApiClient paramGoogleApiClient, final Collection<String> paramCollection)
  {
    return paramGoogleApiClient.a(new nt.a(paramCollection)
    {
      protected void a(e paramAnonymouse)
      {
        paramAnonymouse.a(this, paramCollection);
      }
    });
  }

  public final PendingResult<People.LoadPeopleResult> load(GoogleApiClient paramGoogleApiClient, final String[] paramArrayOfString)
  {
    return paramGoogleApiClient.a(new nt.a(paramArrayOfString)
    {
      protected void a(e paramAnonymouse)
      {
        paramAnonymouse.d(this, paramArrayOfString);
      }
    });
  }

  public final PendingResult<People.LoadPeopleResult> loadConnected(GoogleApiClient paramGoogleApiClient)
  {
    // Byte code:
    //   0: aload_1
    //   1: new 49	com/google/android/gms/internal/nt$3
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 52	com/google/android/gms/internal/nt$3:<init>	(Lcom/google/android/gms/internal/nt;)V
    //   9: invokeinterface 39 2 0
    //   14: areturn
  }

  public final PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient paramGoogleApiClient, final int paramInt, final String paramString)
  {
    return paramGoogleApiClient.a(new nt.a(paramInt)
    {
      protected void a(e paramAnonymouse)
      {
        a(paramAnonymouse.a(this, paramInt, paramString));
      }
    });
  }

  public final PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient paramGoogleApiClient, final String paramString)
  {
    return paramGoogleApiClient.a(new nt.a(paramString)
    {
      protected void a(e paramAnonymouse)
      {
        a(paramAnonymouse.r(this, paramString));
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nt
 * JD-Core Version:    0.6.2
 */