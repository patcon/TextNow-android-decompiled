package com.google.android.gms.wearable;

public abstract interface MessageEvent
{
  public abstract byte[] getData();

  public abstract String getPath();

  public abstract int getRequestId();

  public abstract String getSourceNodeId();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.MessageEvent
 * JD-Core Version:    0.6.2
 */