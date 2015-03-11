package com.google.android.gms.cast;

import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ij;

public abstract class Cast$a<R extends Result> extends BaseImplementation.a<R, ij>
{
  public Cast$a()
  {
    super(Cast.CU);
  }

  public void V(int paramInt)
  {
    b(c(new Status(paramInt)));
  }

  public void e(int paramInt, String paramString)
  {
    b(c(new Status(paramInt, paramString, null)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast.a
 * JD-Core Version:    0.6.2
 */