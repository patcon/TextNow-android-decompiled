package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;

public final class hn extends g<hj>
{
  private static final hn GL = new hn();

  private hn()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }

  public static View b(Context paramContext, int paramInt1, int paramInt2)
  {
    return GL.c(paramContext, paramInt1, paramInt2);
  }

  private View c(Context paramContext, int paramInt1, int paramInt2)
  {
    try
    {
      d locald = e.h(paramContext);
      View localView = (View)e.e(((hj)G(paramContext)).a(locald, paramInt1, paramInt2));
      return localView;
    }
    catch (Exception localException)
    {
      throw new g.a("Could not get button with size " + paramInt1 + " and color " + paramInt2, localException);
    }
  }

  public final hj N(IBinder paramIBinder)
  {
    return hj.a.M(paramIBinder);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hn
 * JD-Core Version:    0.6.2
 */