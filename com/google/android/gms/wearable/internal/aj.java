package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.google.android.gms.wearable.NodeApi.NodeListener;

public final class aj
  implements NodeApi
{
  public final PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, final NodeApi.NodeListener paramNodeListener)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.a(this, paramNodeListener);
      }

      public Status d(Status paramAnonymousStatus)
      {
        return new Status(13);
      }
    });
  }

  public final PendingResult<NodeApi.GetConnectedNodesResult> getConnectedNodes(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.q(this);
      }

      protected NodeApi.GetConnectedNodesResult aL(Status paramAnonymousStatus)
      {
        return new aj.a(paramAnonymousStatus, null);
      }
    });
  }

  public final PendingResult<NodeApi.GetLocalNodeResult> getLocalNode(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.p(this);
      }

      protected NodeApi.GetLocalNodeResult aK(Status paramAnonymousStatus)
      {
        return new aj.b(paramAnonymousStatus, null);
      }
    });
  }

  public final PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, final NodeApi.NodeListener paramNodeListener)
  {
    return paramGoogleApiClient.a(new d()
    {
      protected void a(aw paramAnonymousaw)
      {
        paramAnonymousaw.b(this, paramNodeListener);
      }

      public Status d(Status paramAnonymousStatus)
      {
        return new Status(13);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.aj
 * JD-Core Version:    0.6.2
 */