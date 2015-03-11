package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import textnow.g.f;
import textnow.g.h;
import textnow.g.i;

final class j extends BaseAdapter
{
  private d b;
  private int c = 4;
  private boolean d;
  private boolean e;
  private boolean f;

  private j(ActivityChooserView paramActivityChooserView)
  {
  }

  public final int a()
  {
    int i = 0;
    int j = this.c;
    this.c = 2147483647;
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = getCount();
    View localView = null;
    int i1 = 0;
    while (i < n)
    {
      localView = getView(i, localView, null);
      localView.measure(k, m);
      i1 = Math.max(i1, localView.getMeasuredWidth());
      i++;
    }
    this.c = j;
    return i1;
  }

  public final void a(int paramInt)
  {
    if (this.c != paramInt)
    {
      this.c = paramInt;
      notifyDataSetChanged();
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (this.f != paramBoolean)
    {
      this.f = paramBoolean;
      notifyDataSetChanged();
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((this.d != paramBoolean1) || (this.e != paramBoolean2))
    {
      this.d = paramBoolean1;
      this.e = paramBoolean2;
      notifyDataSetChanged();
    }
  }

  public final ResolveInfo b()
  {
    return this.b.b();
  }

  public final int c()
  {
    return this.b.a();
  }

  public final int d()
  {
    return this.b.c();
  }

  public final d e()
  {
    return this.b;
  }

  public final boolean f()
  {
    return this.d;
  }

  public final int getCount()
  {
    int i = this.b.a();
    if ((!this.d) && (this.b.b() != null))
      i--;
    int j = Math.min(i, this.c);
    if (this.f)
      j++;
    return j;
  }

  public final Object getItem(int paramInt)
  {
    switch (getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      return null;
    case 0:
    }
    if ((!this.d) && (this.b.b() != null))
      paramInt++;
    return this.b.a(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    if ((this.f) && (paramInt == -1 + getCount()))
      return 1;
    return 0;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    switch (getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      if ((paramView == null) || (paramView.getId() != 1))
      {
        paramView = LayoutInflater.from(this.a.getContext()).inflate(h.j, paramViewGroup, false);
        paramView.setId(1);
        ((TextView)paramView.findViewById(f.F)).setText(this.a.getContext().getString(i.c));
      }
      break;
    case 0:
    }
    do
    {
      return paramView;
      if ((paramView == null) || (paramView.getId() != f.r))
        paramView = LayoutInflater.from(this.a.getContext()).inflate(h.j, paramViewGroup, false);
      PackageManager localPackageManager = this.a.getContext().getPackageManager();
      ImageView localImageView = (ImageView)paramView.findViewById(f.p);
      ResolveInfo localResolveInfo = (ResolveInfo)getItem(paramInt);
      localImageView.setImageDrawable(localResolveInfo.loadIcon(localPackageManager));
      ((TextView)paramView.findViewById(f.F)).setText(localResolveInfo.loadLabel(localPackageManager));
    }
    while ((!this.d) || (paramInt != 0));
    return paramView;
  }

  public final int getViewTypeCount()
  {
    return 3;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.j
 * JD-Core Version:    0.6.2
 */