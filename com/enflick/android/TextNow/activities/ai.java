package com.enflick.android.TextNow.activities;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.enflick.android.TextNow.tasks.GetSettingsTask;
import textnow.z.p;

final class ai
  implements View.OnClickListener
{
  private int b = 0;
  private long c = -2147483648L;
  private long d = 500L;
  private int e = 8;

  private ai(ah paramah)
  {
  }

  public final void onClick(View paramView)
  {
    long l;
    if (!new p(this.a.d).z())
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
        ah.a(this.a);
        TextView localTextView = (TextView)this.a.a.findViewById(2131558904);
        if (localTextView != null)
          localTextView.setText(localTextView.getText() + "a");
        new GetSettingsTask().b(this.a.d);
        this.a.d.a("CDMA profile enabled");
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ai
 * JD-Core Version:    0.6.2
 */