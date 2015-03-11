package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.cast.LaunchOptions;

public abstract interface gl extends IInterface
{
  public abstract void a(double paramDouble1, double paramDouble2, boolean paramBoolean);

  public abstract void a(String paramString, LaunchOptions paramLaunchOptions);

  public abstract void a(String paramString1, String paramString2, long paramLong);

  public abstract void a(String paramString, byte[] paramArrayOfByte, long paramLong);

  public abstract void a(boolean paramBoolean1, double paramDouble, boolean paramBoolean2);

  public abstract void am(String paramString);

  public abstract void an(String paramString);

  public abstract void ao(String paramString);

  public abstract void disconnect();

  public abstract void e(String paramString, boolean paramBoolean);

  public abstract void eg();

  public abstract void ep();

  public abstract void h(String paramString1, String paramString2);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gl
 * JD-Core Version:    0.6.2
 */