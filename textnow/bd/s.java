package textnow.bd;

import android.graphics.Bitmap.Config;

final class s
{
  final String a;
  final int b;
  final Bitmap.Config c;
  private final int d;

  s(String paramString, int paramInt, Bitmap.Config paramConfig)
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
    s locals;
    do
    {
      do
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        locals = (s)paramObject;
        if (this.c != locals.c)
          return false;
        if (this.b != locals.b)
          return false;
        if (this.a != null)
          break;
      }
      while (locals.a == null);
      return false;
    }
    while (this.a.equals(locals.a));
    return false;
  }

  public final int hashCode()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.s
 * JD-Core Version:    0.6.2
 */