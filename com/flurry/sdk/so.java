package com.flurry.sdk;

import java.util.ArrayList;
import java.util.List;

public class so extends sn
{
  protected final hj[] e;
  protected int f;

  protected so(hj[] paramArrayOfhj)
  {
    super(paramArrayOfhj[0]);
    this.e = paramArrayOfhj;
    this.f = 1;
  }

  public static so a(hj paramhj1, hj paramhj2)
  {
    if ((!(paramhj1 instanceof so)) && (!(paramhj2 instanceof so)))
      return new so(new hj[] { paramhj1, paramhj2 });
    ArrayList localArrayList = new ArrayList();
    if ((paramhj1 instanceof so))
    {
      ((so)paramhj1).a(localArrayList);
      if (!(paramhj2 instanceof so))
        break label103;
      ((so)paramhj2).a(localArrayList);
    }
    while (true)
    {
      return new so((hj[])localArrayList.toArray(new hj[localArrayList.size()]));
      localArrayList.add(paramhj1);
      break;
      label103: localArrayList.add(paramhj2);
    }
  }

  protected boolean A()
  {
    if (this.f >= this.e.length)
      return false;
    hj[] arrayOfhj = this.e;
    int i = this.f;
    this.f = (i + 1);
    this.d = arrayOfhj[i];
    return true;
  }

  protected void a(List<hj> paramList)
  {
    int i = -1 + this.f;
    int j = this.e.length;
    int k = i;
    if (k < j)
    {
      hj localhj = this.e[k];
      if ((localhj instanceof so))
        ((so)localhj).a(paramList);
      while (true)
      {
        k++;
        break;
        paramList.add(localhj);
      }
    }
  }

  public hm b()
  {
    hm localhm1 = this.d.b();
    if (localhm1 != null)
      return localhm1;
    while (A())
    {
      hm localhm2 = this.d.b();
      if (localhm2 != null)
        return localhm2;
    }
    return null;
  }

  public void close()
  {
    do
      this.d.close();
    while (A());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.so
 * JD-Core Version:    0.6.2
 */