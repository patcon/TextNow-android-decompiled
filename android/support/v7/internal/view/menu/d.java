package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.av;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class d
  implements v
{
  protected Context a;
  protected Context b;
  protected i c;
  protected LayoutInflater d;
  protected LayoutInflater e;
  protected x f;
  private w g;
  private int h;
  private int i;
  private int j;

  public d(Context paramContext, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    this.d = LayoutInflater.from(paramContext);
    this.h = paramInt1;
    this.i = paramInt2;
  }

  public final w a()
  {
    return this.g;
  }

  public x a(ViewGroup paramViewGroup)
  {
    if (this.f == null)
    {
      this.f = ((x)this.d.inflate(this.h, paramViewGroup, false));
      this.f.a(this.c);
      b(true);
    }
    return this.f;
  }

  public View a(m paramm, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof y));
    for (y localy = (y)paramView; ; localy = (y)this.d.inflate(this.i, paramViewGroup, false))
    {
      a(paramm, localy);
      return (View)localy;
    }
  }

  public final void a(int paramInt)
  {
    this.j = paramInt;
  }

  public void a(Context paramContext, i parami)
  {
    this.b = paramContext;
    this.e = LayoutInflater.from(this.b);
    this.c = parami;
  }

  public void a(i parami, boolean paramBoolean)
  {
    if (this.g != null)
      this.g.a(parami, paramBoolean);
  }

  public abstract void a(m paramm, y paramy);

  public final void a(w paramw)
  {
    this.g = paramw;
  }

  public boolean a(ab paramab)
  {
    if (this.g != null)
      return this.g.a(paramab);
    return false;
  }

  public boolean a(m paramm)
  {
    return true;
  }

  protected boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }

  public void b(boolean paramBoolean)
  {
    ViewGroup localViewGroup1 = (ViewGroup)this.f;
    if (localViewGroup1 == null);
    label217: label226: 
    while (true)
    {
      return;
      int k;
      int i1;
      if (this.c != null)
      {
        this.c.k();
        ArrayList localArrayList = this.c.j();
        int m = localArrayList.size();
        int n = 0;
        k = 0;
        if (n < m)
        {
          m localm1 = (m)localArrayList.get(n);
          if (!a(localm1))
            break label217;
          View localView1 = localViewGroup1.getChildAt(k);
          if ((localView1 instanceof y));
          for (m localm2 = ((y)localView1).a(); ; localm2 = null)
          {
            View localView2 = a(localm1, localView1, localViewGroup1);
            if (localm1 != localm2)
            {
              localView2.setPressed(false);
              av.v(localView2);
            }
            if (localView2 != localView1)
            {
              ViewGroup localViewGroup2 = (ViewGroup)localView2.getParent();
              if (localViewGroup2 != null)
                localViewGroup2.removeView(localView2);
              ((ViewGroup)this.f).addView(localView2, k);
            }
            i1 = k + 1;
            n++;
            k = i1;
            break;
          }
        }
      }
      while (true)
      {
        if (k >= localViewGroup1.getChildCount())
          break label226;
        if (!a(localViewGroup1, k))
        {
          k++;
          continue;
          i1 = k;
          break;
          k = 0;
        }
      }
    }
  }

  public boolean b()
  {
    return false;
  }

  public final boolean b(m paramm)
  {
    return false;
  }

  public final boolean c(m paramm)
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.d
 * JD-Core Version:    0.6.2
 */