package textnow.q;

import android.widget.ImageView;

final class x
{
  private final Object a;
  private Object b;
  private y c;
  private final s d;

  private x(Object paramObject1, Object paramObject2, y paramy, s params)
  {
    this.a = paramObject1;
    this.b = null;
    this.c = paramy;
    this.d = params;
  }

  private x(Object paramObject, y paramy, s params)
  {
    this(paramObject, null, paramy, params);
  }

  public final y a()
  {
    return this.c;
  }

  public final void a(ImageView paramImageView)
  {
    this.d.a(paramImageView);
  }

  public final Object b()
  {
    return this.a;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof x));
    x localx;
    do
    {
      return false;
      localx = (x)paramObject;
    }
    while (((this.a == null) || (!this.a.equals(localx.a))) && ((this.a != null) || (localx.a != null)));
    return true;
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.x
 * JD-Core Version:    0.6.2
 */