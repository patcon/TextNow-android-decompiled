package android.support.v7.internal.widget;

import android.support.v7.app.a;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.View.OnClickListener;

final class ae
  implements View.OnClickListener
{
  private ae(ac paramac)
  {
  }

  public final void onClick(View paramView)
  {
    ((af)paramView).a().d();
    int i = ac.a(this.a).getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = ac.a(this.a).getChildAt(j);
      if (localView == paramView);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        j++;
        break;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ae
 * JD-Core Version:    0.6.2
 */