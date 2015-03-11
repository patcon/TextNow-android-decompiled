package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.internal.gh;

public abstract class Cast$a<R extends Result> extends a.b<R, gh>
{
  public Cast$a()
  {
    super(Cast.yH);
  }

  public void N(int paramInt)
  {
    b(c(new Status(paramInt)));
  }

  public void c(int paramInt, String paramString)
  {
    b(c(new Status(paramInt, paramString, null)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.Cast.a
 * JD-Core Version:    0.6.2
 */