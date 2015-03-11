package android.support.v4.app;

final class bp
  implements by
{
  final String a;
  final int b;
  final String c;
  final boolean d;

  public bp(String paramString)
  {
    this.a = paramString;
    this.b = 0;
    this.c = null;
    this.d = true;
  }

  public bp(String paramString1, int paramInt, String paramString2)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramString2;
    this.d = false;
  }

  public final void a(w paramw)
  {
    if (this.d)
    {
      paramw.a(this.a);
      return;
    }
    paramw.a(this.a, this.b, this.c);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("CancelTask[");
    localStringBuilder.append("packageName:").append(this.a);
    localStringBuilder.append(", id:").append(this.b);
    localStringBuilder.append(", tag:").append(this.c);
    localStringBuilder.append(", all:").append(this.d);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bp
 * JD-Core Version:    0.6.2
 */