package textnow.v;

import android.widget.ImageView;

final class v
{
  private final Object a;
  private Object b;
  private w c;
  private final q d;

  private v(Object paramObject1, Object paramObject2, w paramw, q paramq)
  {
    this.a = paramObject1;
    this.b = null;
    this.c = paramw;
    this.d = paramq;
  }

  private v(Object paramObject, w paramw, q paramq)
  {
    this(paramObject, null, paramw, paramq);
  }

  public final w a()
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
    if (!(paramObject instanceof v));
    v localv;
    do
    {
      return false;
      localv = (v)paramObject;
    }
    while (((this.a == null) || (!this.a.equals(localv.a))) && ((this.a != null) || (localv.a != null)));
    return true;
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.v
 * JD-Core Version:    0.6.2
 */