package com.handmark.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import textnow.af.b;

public enum d
{
  static
  {
    d[] arrayOfd = new d[2];
    arrayOfd[0] = a;
    arrayOfd[1] = b;
  }

  static d a()
  {
    return a;
  }

  static d a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return a;
    case 1:
    }
    return b;
  }

  final textnow.af.d a(Context paramContext, e parame, k paramk, TypedArray paramTypedArray)
  {
    switch (PullToRefreshBase.3.d[ordinal()])
    {
    default:
      return new textnow.af.e(paramContext, parame, paramk, paramTypedArray);
    case 2:
    }
    return new b(paramContext, parame, paramk, paramTypedArray);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.d
 * JD-Core Version:    0.6.2
 */