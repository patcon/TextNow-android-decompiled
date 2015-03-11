package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import java.util.List;

public class e$a
{
  private DataSet Ts;

  public a b(DataSet paramDataSet)
  {
    this.Ts = paramDataSet;
    return this;
  }

  public e jj()
  {
    boolean bool1 = true;
    boolean bool2;
    boolean bool3;
    if (this.Ts != null)
    {
      bool2 = bool1;
      o.a(bool2, "Must set the data set");
      if (this.Ts.getDataPoints().isEmpty())
        break label74;
      bool3 = bool1;
      label34: o.a(bool3, "Cannot use an empty data set");
      if (this.Ts.getDataSource().iM() == null)
        break label79;
    }
    while (true)
    {
      o.a(bool1, "Must set the app package name for the data source");
      return new e(this, null);
      bool2 = false;
      break;
      label74: bool3 = false;
      break label34;
      label79: bool1 = false;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.e.a
 * JD-Core Version:    0.6.2
 */