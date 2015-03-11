package com.google.android.gms.appstate;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ga;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
import java.util.List;

public final class AppStateManager
{
  public static final Api<Api.ApiOptions.NoOptions> API = new Api(localb, localc, arrayOfScope);
  public static final Scope SCOPE_APP_STATE;
  static final Api.c<ga> yH = new Api.c();
  private static final Api.b<ga, Api.ApiOptions.NoOptions> yI = new Api.b()
  {
    public final ga b(Context paramAnonymousContext, Looper paramAnonymousLooper, gy paramAnonymousgy, Api.ApiOptions.NoOptions paramAnonymousNoOptions, GoogleApiClient.ConnectionCallbacks paramAnonymousConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramAnonymousOnConnectionFailedListener)
    {
      return new ga(paramAnonymousContext, paramAnonymousLooper, paramAnonymousConnectionCallbacks, paramAnonymousOnConnectionFailedListener, paramAnonymousgy.fj(), (String[])paramAnonymousgy.fl().toArray(new String[0]));
    }

    public final int getPriority()
    {
      return 2147483647;
    }
  };

  static
  {
    SCOPE_APP_STATE = new Scope("https://www.googleapis.com/auth/appstate");
    Api.b localb = yI;
    Api.c localc = yH;
    Scope[] arrayOfScope = new Scope[1];
    arrayOfScope[0] = SCOPE_APP_STATE;
  }

  public static ga a(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool1 = true;
    boolean bool2;
    ga localga;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      hm.b(bool2, "GoogleApiClient parameter is required.");
      hm.a(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      localga = (ga)paramGoogleApiClient.a(yH);
      if (localga == null)
        break label55;
    }
    while (true)
    {
      hm.a(bool1, "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
      return localga;
      bool2 = false;
      break;
      label55: bool1 = false;
    }
  }

  public static PendingResult<AppStateManager.StateDeletedResult> delete(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.b(new AppStateManager.b(paramInt)
    {
      protected final void a(ga paramAnonymousga)
      {
        paramAnonymousga.a(this, this.yK);
      }

      public final AppStateManager.StateDeletedResult g(final Status paramAnonymousStatus)
      {
        return new AppStateManager.StateDeletedResult()
        {
          public int getStateKey()
          {
            return AppStateManager.5.this.yK;
          }

          public Status getStatus()
          {
            return paramAnonymousStatus;
          }
        };
      }
    });
  }

  private static AppStateManager.StateResult e(Status paramStatus)
  {
    return new AppStateManager.StateResult()
    {
      public final AppStateManager.StateConflictResult getConflictResult()
      {
        return null;
      }

      public final AppStateManager.StateLoadedResult getLoadedResult()
      {
        return null;
      }

      public final Status getStatus()
      {
        return AppStateManager.this;
      }

      public final void release()
      {
      }
    };
  }

  public static int getMaxNumKeys(GoogleApiClient paramGoogleApiClient)
  {
    return a(paramGoogleApiClient).dV();
  }

  public static int getMaxStateSize(GoogleApiClient paramGoogleApiClient)
  {
    return a(paramGoogleApiClient).dU();
  }

  public static PendingResult<AppStateManager.StateListResult> list(GoogleApiClient paramGoogleApiClient)
  {
    // Byte code:
    //   0: aload_0
    //   1: new 109	com/google/android/gms/appstate/AppStateManager$7
    //   4: dup
    //   5: invokespecial 110	com/google/android/gms/appstate/AppStateManager$7:<init>	()V
    //   8: invokeinterface 112 2 0
    //   13: areturn
  }

  public static PendingResult<AppStateManager.StateResult> load(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.a(new AppStateManager.e(paramInt)
    {
      protected final void a(ga paramAnonymousga)
      {
        paramAnonymousga.b(this, this.yK);
      }
    });
  }

  public static PendingResult<AppStateManager.StateResult> resolve(GoogleApiClient paramGoogleApiClient, int paramInt, final String paramString, final byte[] paramArrayOfByte)
  {
    return paramGoogleApiClient.b(new AppStateManager.e(paramInt)
    {
      protected final void a(ga paramAnonymousga)
      {
        paramAnonymousga.a(this, this.yK, paramString, paramArrayOfByte);
      }
    });
  }

  public static PendingResult<Status> signOut(GoogleApiClient paramGoogleApiClient)
  {
    // Byte code:
    //   0: aload_0
    //   1: new 126	com/google/android/gms/appstate/AppStateManager$9
    //   4: dup
    //   5: invokespecial 127	com/google/android/gms/appstate/AppStateManager$9:<init>	()V
    //   8: invokeinterface 83 2 0
    //   13: areturn
  }

  public static void update(GoogleApiClient paramGoogleApiClient, int paramInt, final byte[] paramArrayOfByte)
  {
    paramGoogleApiClient.b(new AppStateManager.e(paramInt)
    {
      protected final void a(ga paramAnonymousga)
      {
        paramAnonymousga.a(null, this.yK, paramArrayOfByte);
      }
    });
  }

  public static PendingResult<AppStateManager.StateResult> updateImmediate(GoogleApiClient paramGoogleApiClient, int paramInt, final byte[] paramArrayOfByte)
  {
    return paramGoogleApiClient.b(new AppStateManager.e(paramInt)
    {
      protected final void a(ga paramAnonymousga)
      {
        paramAnonymousga.a(this, this.yK, paramArrayOfByte);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppStateManager
 * JD-Core Version:    0.6.2
 */