package com.flurry.sdk;

import java.util.ArrayList;

public class lg
{
  protected final ArrayList<kt> a = new ArrayList();

  public Object a(hj paramhj, iz paramiz, Object paramObject, sq paramsq)
  {
    int i = this.a.size();
    for (int j = 0; j < i; j++)
    {
      kt localkt = (kt)this.a.get(j);
      hj localhj = paramsq.h();
      localhj.b();
      localkt.a(localhj, paramiz, paramObject);
    }
    return paramObject;
  }

  public void a(kt paramkt)
  {
    this.a.add(paramkt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lg
 * JD-Core Version:    0.6.2
 */