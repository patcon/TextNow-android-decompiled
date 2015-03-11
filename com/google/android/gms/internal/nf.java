package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;

public class nf
  implements ng.a
{
  private final ng akD;
  private boolean akE;

  public nf(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, null);
  }

  public nf(Context paramContext, int paramInt, String paramString)
  {
    this(paramContext, paramInt, paramString, null, true);
  }

  public nf(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.akD = new ng(paramContext, paramInt, paramString1, paramString2, this, paramBoolean);
    this.akE = true;
  }

  private void mT()
  {
    if (!this.akE)
      throw new IllegalStateException("Cannot reuse one-time logger after sending.");
  }

  public void a(String paramString, byte[] paramArrayOfByte, String[] paramArrayOfString)
  {
    mT();
    this.akD.b(paramString, paramArrayOfByte, paramArrayOfString);
  }

  public void b(PendingIntent paramPendingIntent)
  {
    new StringBuilder().append("logger connection failed: ").append(paramPendingIntent).toString();
  }

  public void mU()
  {
    this.akD.stop();
  }

  public void mV()
  {
  }

  public void send()
  {
    mT();
    this.akD.start();
    this.akE = false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nf
 * JD-Core Version:    0.6.2
 */