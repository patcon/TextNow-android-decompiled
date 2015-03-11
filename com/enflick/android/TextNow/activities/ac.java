package com.enflick.android.TextNow.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.enflick.android.TextNow.tasks.GetSettingsTask;
import textnow.u.n;

final class ac
  implements View.OnClickListener
{
  private int b = 0;
  private long c = -2147483648L;
  private long d = 500L;
  private int e = 8;

  private ac(ab paramab)
  {
  }

  public final void onClick(View paramView)
  {
    long l;
    if (!new n(this.a.e).l())
    {
      l = System.currentTimeMillis();
      if (l - this.c <= this.d)
        break label49;
      this.b = 1;
    }
    while (true)
    {
      this.c = l;
      return;
      label49: int i = 1 + this.b;
      this.b = i;
      if (i == this.e)
      {
        paramView.setOnClickListener(null);
        this.b = 0;
        ab.a(this.a);
        new GetSettingsTask().b(this.a.e);
        this.a.e.a("CDMA profile enabled");
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ac
 * JD-Core Version:    0.6.2
 */