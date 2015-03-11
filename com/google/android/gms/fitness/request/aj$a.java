package com.google.android.gms.fitness.request;

import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

public class aj$a
{
  private DataType Sp;
  private DataSource Sq;

  public a d(DataSource paramDataSource)
  {
    this.Sq = paramDataSource;
    return this;
  }

  public a d(DataType paramDataType)
  {
    this.Sp = paramDataType;
    return this;
  }

  public aj jG()
  {
    if ((this.Sp != null) && (this.Sq != null))
      throw new IllegalArgumentException("Cannot specify both dataType and dataSource");
    return new aj(this, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.aj.a
 * JD-Core Version:    0.6.2
 */