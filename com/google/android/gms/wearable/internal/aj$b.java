package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;

public class aj$b
  implements NodeApi.GetLocalNodeResult
{
  private final Status CM;
  private final Node avM;

  public aj$b(Status paramStatus, Node paramNode)
  {
    this.CM = paramStatus;
    this.avM = paramNode;
  }

  public Node getNode()
  {
    return this.avM;
  }

  public Status getStatus()
  {
    return this.CM;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.aj.b
 * JD-Core Version:    0.6.2
 */