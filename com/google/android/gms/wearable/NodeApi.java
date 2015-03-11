package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public abstract interface NodeApi
{
  public abstract PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener);

  public abstract PendingResult<NodeApi.GetConnectedNodesResult> getConnectedNodes(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<NodeApi.GetLocalNodeResult> getLocalNode(GoogleApiClient paramGoogleApiClient);

  public abstract PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.NodeApi
 * JD-Core Version:    0.6.2
 */