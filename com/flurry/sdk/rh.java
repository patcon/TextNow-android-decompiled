package com.flurry.sdk;

public class rh
{
  protected rc<qj, im> a;

  public im a(sh paramsh, jn<?> paramjn)
  {
    return a(paramsh.p(), paramjn);
  }

  public im a(Class<?> paramClass, jn<?> paramjn)
  {
    while (true)
    {
      String str1;
      try
      {
        qj localqj = new qj(paramClass);
        im localim;
        if (this.a == null)
        {
          this.a = new rc(20, 200);
          mw localmw = (mw)paramjn.c(paramClass);
          str1 = paramjn.a().b(localmw.c());
          if (str1 == null)
          {
            str2 = paramClass.getSimpleName();
            localim = new im(str2);
            this.a.put(localqj, localim);
            return localim;
          }
        }
        else
        {
          localim = (im)this.a.get(localqj);
          if (localim == null)
            continue;
          continue;
        }
      }
      finally
      {
      }
      String str2 = str1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rh
 * JD-Core Version:    0.6.2
 */