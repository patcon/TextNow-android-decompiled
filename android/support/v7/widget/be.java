package android.support.v7.widget;

import android.support.v4.view.av;
import android.view.View;

public abstract class be
{
  public final View a;
  int b;
  int c;
  long d;
  int e;
  int f;
  be g;
  be h;
  private int i;
  private int j;
  private aw k;

  final void a()
  {
    this.c = -1;
    this.f = -1;
  }

  final void a(int paramInt)
  {
    this.i = (paramInt | this.i);
  }

  final void a(int paramInt1, int paramInt2)
  {
    this.i = (this.i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }

  final void a(int paramInt, boolean paramBoolean)
  {
    if (this.c == -1)
      this.c = this.b;
    if (this.f == -1)
      this.f = this.b;
    if (paramBoolean)
      this.f = (paramInt + this.f);
    this.b = (paramInt + this.b);
    if (this.a.getLayoutParams() != null)
      ((RecyclerView.LayoutParams)this.a.getLayoutParams()).c = true;
  }

  final void a(aw paramaw)
  {
    this.k = paramaw;
  }

  public final void a(boolean paramBoolean)
  {
    int m;
    if (paramBoolean)
    {
      m = -1 + this.j;
      this.j = m;
      if (this.j >= 0)
        break label59;
      this.j = 0;
      new StringBuilder().append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this).toString();
    }
    label59: 
    do
    {
      return;
      m = 1 + this.j;
      break;
      if ((!paramBoolean) && (this.j == 1))
      {
        this.i = (0x10 | this.i);
        return;
      }
    }
    while ((!paramBoolean) || (this.j != 0));
    this.i = (0xFFFFFFEF & this.i);
  }

  final boolean b()
  {
    return (0x80 & this.i) != 0;
  }

  public final int c()
  {
    if (this.f == -1)
      return this.b;
    return this.f;
  }

  final boolean d()
  {
    return this.k != null;
  }

  final void e()
  {
    this.k.b(this);
  }

  final boolean f()
  {
    return (0x20 & this.i) != 0;
  }

  final void g()
  {
    this.i = (0xFFFFFFDF & this.i);
  }

  final boolean h()
  {
    return (0x4 & this.i) != 0;
  }

  final boolean i()
  {
    return (0x2 & this.i) != 0;
  }

  final boolean j()
  {
    return (0x40 & this.i) != 0;
  }

  final boolean k()
  {
    return (0x1 & this.i) != 0;
  }

  final boolean l()
  {
    return (0x8 & this.i) != 0;
  }

  final void m()
  {
    this.i = 0;
    this.b = -1;
    this.c = -1;
    this.d = -1L;
    this.f = -1;
    this.j = 0;
    this.g = null;
    this.h = null;
  }

  public final boolean n()
  {
    return ((0x10 & this.i) == 0) && (!av.c(this.a));
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.b + " id=" + this.d + ", oldPos=" + this.c + ", pLpos:" + this.f);
    if (d())
      localStringBuilder.append(" scrap");
    if (h())
      localStringBuilder.append(" invalid");
    if (!k())
      localStringBuilder.append(" unbound");
    if (i())
      localStringBuilder.append(" update");
    if (l())
      localStringBuilder.append(" removed");
    if (b())
      localStringBuilder.append(" ignored");
    if (j())
      localStringBuilder.append(" changed");
    if (!n())
      localStringBuilder.append(" not recyclable(" + this.j + ")");
    if (this.a.getParent() == null)
      localStringBuilder.append(" no parent");
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.be
 * JD-Core Version:    0.6.2
 */