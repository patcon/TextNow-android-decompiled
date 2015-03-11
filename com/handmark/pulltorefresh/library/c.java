package com.handmark.pulltorefresh.library;

public final class c
{
  public static void a(PullToRefreshBase<?> paramPullToRefreshBase, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int i;
    int j;
    int k;
    e locale;
    switch (1.a[paramPullToRefreshBase.p().ordinal()])
    {
    default:
      i = paramPullToRefreshBase.getScrollY();
      j = paramInt3;
      k = paramInt4;
      if ((paramPullToRefreshBase.m()) && (!paramPullToRefreshBase.n()))
      {
        locale = paramPullToRefreshBase.h();
        if ((!locale.b()) || (paramBoolean) || (j == 0))
          break label293;
        m = k + j;
        new StringBuilder().append("OverScroll. DeltaX: ").append(paramInt1).append(", ScrollX: ").append(paramInt2).append(", DeltaY: ").append(paramInt3).append(", ScrollY: ").append(paramInt4).append(", NewY: ").append(m).append(", ScrollRange: ").append(0).append(", CurrentScroll: ").append(i).toString();
        if (m >= 0)
          break label220;
        if (locale.c())
        {
          if (i == 0)
            paramPullToRefreshBase.a(m.f, new boolean[0]);
          paramPullToRefreshBase.a((int)(1.0F * (m + i)));
        }
      }
      break;
    case 1:
    }
    label220: 
    while ((!paramBoolean) || (m.f != paramPullToRefreshBase.k()))
    {
      int m;
      do
      {
        do
        {
          return;
          i = paramPullToRefreshBase.getScrollX();
          j = paramInt1;
          k = paramInt2;
          break;
          if (m <= 0)
            break label264;
        }
        while (!locale.d());
        if (i == 0)
          paramPullToRefreshBase.a(m.f, new boolean[0]);
        paramPullToRefreshBase.a((int)(1.0F * (m + i - 0)));
        return;
      }
      while ((Math.abs(m) > 0) && (Math.abs(m - 0) > 0));
      paramPullToRefreshBase.a(m.a, new boolean[0]);
      return;
    }
    label264: label293: paramPullToRefreshBase.a(m.a, new boolean[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.c
 * JD-Core Version:    0.6.2
 */