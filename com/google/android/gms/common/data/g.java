package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class g<T> extends DataBuffer<T>
{
  private boolean EU = false;
  private ArrayList<Integer> EV;

  protected g(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }

  private void fa()
  {
    while (true)
    {
      int k;
      try
      {
        if (!this.EU)
        {
          int i = this.DG.getCount();
          this.EV = new ArrayList();
          if (i > 0)
          {
            this.EV.add(Integer.valueOf(0));
            String str = eZ();
            int j = this.DG.ae(0);
            localObject2 = this.DG.c(str, 0, j);
            k = 1;
            if (k < i)
            {
              int m = this.DG.ae(k);
              localObject3 = this.DG.c(str, k, m);
              if (((String)localObject3).equals(localObject2))
                break label148;
              this.EV.add(Integer.valueOf(k));
              break label152;
            }
          }
          this.EU = true;
        }
        else
        {
          return;
        }
      }
      finally
      {
      }
      label148: Object localObject3 = localObject2;
      label152: k++;
      Object localObject2 = localObject3;
    }
  }

  int ah(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.EV.size()))
      throw new IllegalArgumentException("Position " + paramInt + " is out of bounds for this buffer");
    return ((Integer)this.EV.get(paramInt)).intValue();
  }

  protected int ai(int paramInt)
  {
    int i;
    if ((paramInt < 0) || (paramInt == this.EV.size()))
      i = 0;
    label137: 
    while (true)
    {
      return i;
      if (paramInt == -1 + this.EV.size());
      for (i = this.DG.getCount() - ((Integer)this.EV.get(paramInt)).intValue(); ; i = ((Integer)this.EV.get(paramInt + 1)).intValue() - ((Integer)this.EV.get(paramInt)).intValue())
      {
        if (i != 1)
          break label137;
        int j = ah(paramInt);
        int k = this.DG.ae(j);
        String str = fb();
        if ((str == null) || (this.DG.c(str, j, k) != null))
          break;
        return 0;
      }
    }
  }

  protected abstract T c(int paramInt1, int paramInt2);

  protected abstract String eZ();

  protected String fb()
  {
    return null;
  }

  public final T get(int paramInt)
  {
    fa();
    return c(ah(paramInt), ai(paramInt));
  }

  public int getCount()
  {
    fa();
    return this.EV.size();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.g
 * JD-Core Version:    0.6.2
 */