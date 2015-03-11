package com.google.android.gms.common.api;

import android.os.Looper;

public abstract interface Api$a
{
  public abstract void connect();

  public abstract void disconnect();

  public abstract Looper getLooper();

  public abstract boolean isConnected();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Api.a
 * JD-Core Version:    0.6.2
 */