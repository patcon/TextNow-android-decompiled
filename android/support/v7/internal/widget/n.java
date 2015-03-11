package android.support.v7.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.v4.view.j;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

final class n
  implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private n(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onClick(View paramView)
  {
    if (paramView == ActivityChooserView.e(this.a))
    {
      this.a.a();
      ResolveInfo localResolveInfo = ActivityChooserView.a(this.a).b();
      int i = ActivityChooserView.a(this.a).e().a(localResolveInfo);
      Intent localIntent = ActivityChooserView.a(this.a).e().b(i);
      if (localIntent != null)
      {
        localIntent.addFlags(524288);
        this.a.getContext().startActivity(localIntent);
      }
      return;
    }
    if (paramView == ActivityChooserView.f(this.a))
    {
      ActivityChooserView.a(this.a, false);
      ActivityChooserView.a(this.a, ActivityChooserView.g(this.a));
      return;
    }
    throw new IllegalArgumentException();
  }

  public final void onDismiss()
  {
    if (ActivityChooserView.h(this.a) != null)
      ActivityChooserView.h(this.a).onDismiss();
    if (this.a.a != null)
      this.a.a.a(false);
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (((m)paramAdapterView.getAdapter()).getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      ActivityChooserView.a(this.a, 2147483647);
    case 0:
    }
    do
    {
      return;
      this.a.a();
      if (!ActivityChooserView.d(this.a))
        break;
    }
    while (paramInt <= 0);
    ActivityChooserView.a(this.a).e().c(paramInt);
    return;
    if (ActivityChooserView.a(this.a).f());
    while (true)
    {
      Intent localIntent = ActivityChooserView.a(this.a).e().b(paramInt);
      if (localIntent == null)
        break;
      localIntent.addFlags(524288);
      this.a.getContext().startActivity(localIntent);
      return;
      paramInt++;
    }
  }

  public final boolean onLongClick(View paramView)
  {
    if (paramView == ActivityChooserView.e(this.a))
    {
      if (ActivityChooserView.a(this.a).getCount() > 0)
      {
        ActivityChooserView.a(this.a, true);
        ActivityChooserView.a(this.a, ActivityChooserView.g(this.a));
      }
      return true;
    }
    throw new IllegalArgumentException();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.n
 * JD-Core Version:    0.6.2
 */