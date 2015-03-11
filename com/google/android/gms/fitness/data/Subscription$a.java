package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.o;

public class Subscription$a
{
  private DataType Sp;
  private DataSource Sq;
  private long Tt = -1L;
  private int Tu = 2;

  public a b(DataSource paramDataSource)
  {
    this.Sq = paramDataSource;
    return this;
  }

  public a b(DataType paramDataType)
  {
    this.Sp = paramDataType;
    return this;
  }

  public Subscription iZ()
  {
    if ((this.Sq != null) || (this.Sp != null));
    for (boolean bool1 = true; ; bool1 = false)
    {
      o.a(bool1, "Must call setDataSource() or setDataType()");
      boolean bool2;
      if ((this.Sp != null) && (this.Sq != null))
      {
        boolean bool3 = this.Sp.equals(this.Sq.getDataType());
        bool2 = false;
        if (!bool3);
      }
      else
      {
        bool2 = true;
      }
      o.a(bool2, "Specified data type is incompatible with specified data source");
      return new Subscription(this, null);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.Subscription.a
 * JD-Core Version:    0.6.2
 */