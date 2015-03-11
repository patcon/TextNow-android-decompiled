package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

final class g$a
{
  private final String LV;
  private final g.a.a LW;
  private final HashSet<e<?>.f> LX;
  private boolean LY;
  private IBinder LZ;
  private ComponentName Ma;
  private int mState;

  public g$a(g paramg, String paramString)
  {
    this.LV = paramString;
    this.LW = new g.a.a(this);
    this.LX = new HashSet();
    this.mState = 0;
  }

  public final void J(boolean paramBoolean)
  {
    this.LY = paramBoolean;
  }

  public final void a(e<?>.f parame)
  {
    this.LX.add(parame);
  }

  public final void b(e<?>.f parame)
  {
    this.LX.remove(parame);
  }

  public final boolean c(e<?>.f parame)
  {
    return this.LX.contains(parame);
  }

  public final g.a.a gW()
  {
    return this.LW;
  }

  public final String gX()
  {
    return this.LV;
  }

  public final boolean gY()
  {
    return this.LX.isEmpty();
  }

  public final IBinder getBinder()
  {
    return this.LZ;
  }

  public final ComponentName getComponentName()
  {
    return this.Ma;
  }

  public final int getState()
  {
    return this.mState;
  }

  public final boolean isBound()
  {
    return this.LY;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.g.a
 * JD-Core Version:    0.6.2
 */