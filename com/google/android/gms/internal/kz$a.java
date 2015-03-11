package com.google.android.gms.internal;

import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.fitness.result.DataReadResult;

class kz$a extends km.a
{
  private final BaseImplementation.b<DataReadResult> De;
  private int TL = 0;
  private DataReadResult TM = null;

  private kz$a(BaseImplementation.b<DataReadResult> paramb)
  {
    this.De = paramb;
  }

  public void a(DataReadResult paramDataReadResult)
  {
    try
    {
      if (this.TM == null)
        this.TM = paramDataReadResult;
      while (true)
      {
        this.TL = (1 + this.TL);
        if (this.TL == this.TM.jH())
          this.De.b(this.TM);
        return;
        this.TM.b(paramDataReadResult);
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kz.a
 * JD-Core Version:    0.6.2
 */