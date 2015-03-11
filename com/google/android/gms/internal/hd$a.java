package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

final class hd$a
{
  private final HashSet<hb<?>.f> GA;
  private boolean GB;
  private IBinder GC;
  private ComponentName GD;
  private final String Gy;
  private final hd.a.a Gz;
  private int mState;

  public hd$a(hd paramhd, String paramString)
  {
    this.Gy = paramString;
    this.Gz = new hd.a.a(this);
    this.GA = new HashSet();
    this.mState = 0;
  }

  public final void B(boolean paramBoolean)
  {
    this.GB = paramBoolean;
  }

  public final void a(hb<?>.f paramhb)
  {
    this.GA.add(paramhb);
  }

  public final void b(hb<?>.f paramhb)
  {
    this.GA.remove(paramhb);
  }

  public final boolean c(hb<?>.f paramhb)
  {
    return this.GA.contains(paramhb);
  }

  public final hd.a.a fx()
  {
    return this.Gz;
  }

  public final String fy()
  {
    return this.Gy;
  }

  public final boolean fz()
  {
    return this.GA.isEmpty();
  }

  public final IBinder getBinder()
  {
    return this.GC;
  }

  public final ComponentName getComponentName()
  {
    return this.GD;
  }

  public final int getState()
  {
    return this.mState;
  }

  public final boolean isBound()
  {
    return this.GB;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hd.a
 * JD-Core Version:    0.6.2
 */