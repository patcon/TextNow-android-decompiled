package textnow.bk;

import android.graphics.Bitmap.Config;

final class t
{
  final String a;
  final int b;
  final Bitmap.Config c;
  private final int d;

  t(String paramString, int paramInt, Bitmap.Config paramConfig)
  {
    this.a = paramString;
    this.b = paramInt;
    this.c = paramConfig;
    int i;
    int j;
    int k;
    if (this.c == null)
    {
      i = 0;
      j = 31 * (31 * (i + 31) + this.b);
      String str = this.a;
      k = 0;
      if (str != null)
        break label83;
    }
    while (true)
    {
      this.d = (j + k);
      return;
      i = this.c.hashCode();
      break;
      label83: k = this.a.hashCode();
    }
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    t localt;
    do
    {
      do
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localt = (t)paramObject;
        if (this.c != localt.c)
          return false;
        if (this.b != localt.b)
          return false;
        if (this.a != null)
          break;
      }
      while (localt.a == null);
      return false;
    }
    while (this.a.equals(localt.a));
    return false;
  }

  public final int hashCode()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.t
 * JD-Core Version:    0.6.2
 */