package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.cast.ApplicationMetadata;

public abstract interface io extends IInterface
{
  public abstract void a(ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean);

  public abstract void a(String paramString, double paramDouble, boolean paramBoolean);

  public abstract void a(String paramString, long paramLong);

  public abstract void a(String paramString, long paramLong, int paramInt);

  public abstract void ac(int paramInt);

  public abstract void ad(int paramInt);

  public abstract void ae(int paramInt);

  public abstract void af(int paramInt);

  public abstract void b(ig paramig);

  public abstract void b(il paramil);

  public abstract void b(String paramString, byte[] paramArrayOfByte);

  public abstract void k(String paramString1, String paramString2);

  public abstract void onApplicationDisconnected(int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.io
 * JD-Core Version:    0.6.2
 */