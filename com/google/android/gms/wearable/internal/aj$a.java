package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import java.util.List;

public class aj$a
  implements NodeApi.GetConnectedNodesResult
{
  private final Status CM;
  private final List<Node> avL;

  public aj$a(Status paramStatus, List<Node> paramList)
  {
    this.CM = paramStatus;
    this.avL = paramList;
  }

  public List<Node> getNodes()
  {
    return this.avL;
  }

  public Status getStatus()
  {
    return this.CM;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.aj.a
 * JD-Core Version:    0.6.2
 */