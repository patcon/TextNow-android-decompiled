package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gh;
import java.io.IOException;

public final class Cast$CastApi$a
  implements Cast.CastApi
{
  public final ApplicationMetadata getApplicationMetadata(GoogleApiClient paramGoogleApiClient)
  {
    return ((gh)paramGoogleApiClient.a(Cast.yH)).getApplicationMetadata();
  }

  public final String getApplicationStatus(GoogleApiClient paramGoogleApiClient)
  {
    return ((gh)paramGoogleApiClient.a(Cast.yH)).getApplicationStatus();
  }

  public final double getVolume(GoogleApiClient paramGoogleApiClient)
  {
    return ((gh)paramGoogleApiClient.a(Cast.yH)).eh();
  }

  public final boolean isMute(GoogleApiClient paramGoogleApiClient)
  {
    return ((gh)paramGoogleApiClient.a(Cast.yH)).isMute();
  }

  public final PendingResult<Cast.ApplicationConnectionResult> joinApplication(GoogleApiClient paramGoogleApiClient)
  {
    // Byte code:
    //   0: aload_1
    //   1: new 49	com/google/android/gms/cast/Cast$CastApi$a$6
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 52	com/google/android/gms/cast/Cast$CastApi$a$6:<init>	(Lcom/google/android/gms/cast/Cast$CastApi$a;)V
    //   9: invokeinterface 56 2 0
    //   14: areturn
  }

  public final PendingResult<Cast.ApplicationConnectionResult> joinApplication(GoogleApiClient paramGoogleApiClient, final String paramString)
  {
    return paramGoogleApiClient.b(new Cast.c(paramString)
    {
      protected void a(gh paramAnonymousgh)
      {
        try
        {
          paramAnonymousgh.b(paramString, null, this);
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          N(2001);
        }
      }
    });
  }

  public final PendingResult<Cast.ApplicationConnectionResult> joinApplication(GoogleApiClient paramGoogleApiClient, final String paramString1, final String paramString2)
  {
    return paramGoogleApiClient.b(new Cast.c(paramString1)
    {
      protected void a(gh paramAnonymousgh)
      {
        try
        {
          paramAnonymousgh.b(paramString1, paramString2, this);
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          N(2001);
        }
      }
    });
  }

  public final PendingResult<Cast.ApplicationConnectionResult> launchApplication(GoogleApiClient paramGoogleApiClient, final String paramString)
  {
    return paramGoogleApiClient.b(new Cast.c(paramString)
    {
      protected void a(gh paramAnonymousgh)
      {
        try
        {
          paramAnonymousgh.a(paramString, false, this);
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          N(2001);
        }
      }
    });
  }

  public final PendingResult<Cast.ApplicationConnectionResult> launchApplication(GoogleApiClient paramGoogleApiClient, final String paramString, final LaunchOptions paramLaunchOptions)
  {
    return paramGoogleApiClient.b(new Cast.c(paramString)
    {
      protected void a(gh paramAnonymousgh)
      {
        try
        {
          paramAnonymousgh.a(paramString, paramLaunchOptions, this);
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          N(2001);
        }
      }
    });
  }

  @Deprecated
  public final PendingResult<Cast.ApplicationConnectionResult> launchApplication(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    return launchApplication(paramGoogleApiClient, paramString, new LaunchOptions.Builder().setRelaunchIfRunning(paramBoolean).build());
  }

  public final PendingResult<Status> leaveApplication(GoogleApiClient paramGoogleApiClient)
  {
    // Byte code:
    //   0: aload_1
    //   1: new 96	com/google/android/gms/cast/Cast$CastApi$a$7
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 97	com/google/android/gms/cast/Cast$CastApi$a$7:<init>	(Lcom/google/android/gms/cast/Cast$CastApi$a;)V
    //   9: invokeinterface 56 2 0
    //   14: areturn
  }

  public final void removeMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    try
    {
      ((gh)paramGoogleApiClient.a(Cast.yH)).aj(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new IOException("service error");
  }

  public final void requestStatus(GoogleApiClient paramGoogleApiClient)
  {
    try
    {
      ((gh)paramGoogleApiClient.a(Cast.yH)).eg();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new IOException("service error");
  }

  public final PendingResult<Status> sendMessage(GoogleApiClient paramGoogleApiClient, final String paramString1, final String paramString2)
  {
    return paramGoogleApiClient.b(new Cast.b(paramString1)
    {
      protected void a(gh paramAnonymousgh)
      {
        try
        {
          paramAnonymousgh.a(paramString1, paramString2, this);
          return;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          N(2001);
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          N(2001);
        }
      }
    });
  }

  public final void setMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString, Cast.MessageReceivedCallback paramMessageReceivedCallback)
  {
    try
    {
      ((gh)paramGoogleApiClient.a(Cast.yH)).a(paramString, paramMessageReceivedCallback);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new IOException("service error");
  }

  public final void setMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    try
    {
      ((gh)paramGoogleApiClient.a(Cast.yH)).y(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new IOException("service error");
  }

  public final void setVolume(GoogleApiClient paramGoogleApiClient, double paramDouble)
  {
    try
    {
      ((gh)paramGoogleApiClient.a(Cast.yH)).a(paramDouble);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new IOException("service error");
  }

  public final PendingResult<Status> stopApplication(GoogleApiClient paramGoogleApiClient)
  {
    // Byte code:
    //   0: aload_1
    //   1: new 139	com/google/android/gms/cast/Cast$CastApi$a$8
    //   4: dup
    //   5: aload_0
    //   6: invokespecial 140	com/google/android/gms/cast/Cast$CastApi$a$8:<init>	(Lcom/google/android/gms/cast/Cast$CastApi$a;)V
    //   9: invokeinterface 56 2 0
    //   14: areturn
  }

  public final PendingResult<Status> stopApplication(GoogleApiClient paramGoogleApiClient, final String paramString)
  {
    return paramGoogleApiClient.b(new Cast.b(paramString)
    {
      protected void a(gh paramAnonymousgh)
      {
        if (TextUtils.isEmpty(paramString))
        {
          c(2001, "IllegalArgument: sessionId cannot be null or empty");
          return;
        }
        try
        {
          paramAnonymousgh.a(paramString, this);
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          N(2001);
        }
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast.CastApi.a
 * JD-Core Version:    0.6.2
 */