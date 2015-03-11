package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class i
  implements aa
{
  private ab a;
  private int b;
  protected Context c;
  protected Context d;
  protected n e;
  protected LayoutInflater f;
  protected LayoutInflater g;
  protected ac h;
  private int i;
  private int j;

  public i(Context paramContext, int paramInt1, int paramInt2)
  {
    this.c = paramContext;
    this.f = LayoutInflater.from(paramContext);
    this.b = paramInt1;
    this.i = paramInt2;
  }

  public ac a(ViewGroup paramViewGroup)
  {
    if (this.h == null)
    {
      this.h = ((ac)this.f.inflate(this.b, paramViewGroup, false));
      this.h.a(this.e);
      d(true);
    }
    return this.h;
  }

  public View a(r paramr, View paramView, ViewGroup paramViewGroup)
  {
    if ((paramView instanceof ad));
    for (ad localad = (ad)paramView; ; localad = (ad)this.f.inflate(this.i, paramViewGroup, false))
    {
      a(paramr, localad);
      return (View)localad;
    }
  }

  public void a(Context paramContext, n paramn)
  {
    this.d = paramContext;
    this.g = LayoutInflater.from(this.d);
    this.e = paramn;
  }

  public final void a(ab paramab)
  {
    this.a = paramab;
  }

  public void a(n paramn, boolean paramBoolean)
  {
    if (this.a != null)
      this.a.a(paramn, paramBoolean);
  }

  public abstract void a(r paramr, ad paramad);

  public boolean a(ag paramag)
  {
    if (this.a != null)
      return this.a.b(paramag);
    return false;
  }

  public boolean a(r paramr)
  {
    return true;
  }

  protected boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    paramViewGroup.removeViewAt(paramInt);
    return true;
  }

  public final void b(int paramInt)
  {
    this.j = paramInt;
  }

  public final boolean b(r paramr)
  {
    return false;
  }

  public final boolean c(r paramr)
  {
    return false;
  }

  public void d(boolean paramBoolean)
  {
    ViewGroup localViewGroup1 = (ViewGroup)this.h;
    if (localViewGroup1 == null);
    label212: label221: 
    while (true)
    {
      return;
      int k;
      int i1;
      if (this.e != null)
      {
        this.e.k();
        ArrayList localArrayList = this.e.j();
        int m = localArrayList.size();
        int n = 0;
        k = 0;
        if (n < m)
        {
          r localr1 = (r)localArrayList.get(n);
          if (!a(localr1))
            break label212;
          View localView1 = localViewGroup1.getChildAt(k);
          if ((localView1 instanceof ad));
          for (r localr2 = ((ad)localView1).a(); ; localr2 = null)
          {
            View localView2 = a(localr1, localView1, localViewGroup1);
            if (localr1 != localr2)
              localView2.setPressed(false);
            if (localView2 != localView1)
            {
              ViewGroup localViewGroup2 = (ViewGroup)localView2.getParent();
              if (localViewGroup2 != null)
                localViewGroup2.removeView(localView2);
              ((ViewGroup)this.h).addView(localView2, k);
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
          break label221;
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

  public boolean h()
  {
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.i
 * JD-Core Version:    0.6.2
 */