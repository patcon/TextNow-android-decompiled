package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public abstract class ma<M extends ma<M>> extends me
{
  protected List<mg> amX;

  public final <T> T a(mb<M, T> parammb)
  {
    return parammb.i(this.amX);
  }

  public void a(lz paramlz)
  {
    if (this.amX == null);
    for (int i = 0; ; i = this.amX.size())
      for (int j = 0; j < i; j++)
      {
        mg localmg = (mg)this.amX.get(j);
        paramlz.eI(localmg.tag);
        paramlz.t(localmg.anc);
      }
  }

  protected final boolean a(ly paramly, int paramInt)
  {
    int i = paramly.getPosition();
    if (!paramly.ev(paramInt))
      return false;
    if (this.amX == null)
      this.amX = new ArrayList();
    byte[] arrayOfByte = paramly.o(i, paramly.getPosition() - i);
    this.amX.add(new mg(paramInt, arrayOfByte));
    return true;
  }

  protected int c()
  {
    if (this.amX == null);
    int k;
    for (int i = 0; ; i = this.amX.size())
    {
      int j = 0;
      k = 0;
      while (j < i)
      {
        mg localmg = (mg)this.amX.get(j);
        k = k + lz.eJ(localmg.tag) + localmg.anc.length;
        j++;
      }
    }
    return k;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ma
 * JD-Core Version:    0.6.2
 */