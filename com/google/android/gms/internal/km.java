package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.people.Person;
import java.util.Collection;

public final class km
  implements People
{
  public final Person getCurrentPerson(GoogleApiClient paramGoogleApiClient)
  {
    return Plus.a(paramGoogleApiClient, Plus.yH).getCurrentPerson();
  }

  public final PendingResult<People.LoadPeopleResult> load(GoogleApiClient paramGoogleApiClient, final Collection<String> paramCollection)
  {
    return paramGoogleApiClient.a(new km.a(paramCollection)
    {
      protected void a(e paramAnonymouse)
      {
        paramAnonymouse.a(this, paramCollection);
      }
    });
  }

  public final PendingResult<People.LoadPeopleResult> load(GoogleApiClient paramGoogleApiClient, final String[] paramArrayOfString)
  {
    return paramGoogleApiClient.a(new km.a(paramArrayOfString)
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
    //   1: new 49	com/google/android/gms/internal/km$3
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 52	com/google/android/gms/internal/km$3:<init>	(Lcom/google/android/gms/internal/km;)V
    //   9: invokeinterface 39 2 0
    //   14: areturn
  }

  public final PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient paramGoogleApiClient, final int paramInt, final String paramString)
  {
    return paramGoogleApiClient.a(new km.a(paramInt)
    {
      protected void a(e paramAnonymouse)
      {
        a(paramAnonymouse.a(this, paramInt, paramString));
      }
    });
  }

  public final PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient paramGoogleApiClient, final String paramString)
  {
    return paramGoogleApiClient.a(new km.a(paramString)
    {
      protected void a(e paramAnonymouse)
      {
        a(paramAnonymouse.r(this, paramString));
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.km
 * JD-Core Version:    0.6.2
 */