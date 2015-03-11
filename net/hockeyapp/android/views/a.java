package net.hockeyapp.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public final class a extends LinearLayout
{
  private TextView a;
  private TextView b;
  private TextView c;
  private boolean d = true;

  public a(Context paramContext)
  {
    this(paramContext, true);
  }

  private a(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    setOrientation(1);
    setGravity(3);
    setBackgroundColor(-3355444);
    this.a = new TextView(paramContext);
    this.a.setId(12289);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
    int i = (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics());
    localLayoutParams1.setMargins(i, i, i, 0);
    this.a.setLayoutParams(localLayoutParams1);
    this.a.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
    this.a.setSingleLine(true);
    this.a.setTextColor(-7829368);
    this.a.setTextSize(2, 15.0F);
    this.a.setTypeface(null, 0);
    addView(this.a);
    this.b = new TextView(paramContext);
    this.b.setId(12290);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    int j = (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics());
    localLayoutParams2.setMargins(j, 0, j, 0);
    this.b.setLayoutParams(localLayoutParams2);
    this.b.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
    this.b.setSingleLine(true);
    this.b.setTextColor(-7829368);
    this.b.setTextSize(2, 15.0F);
    this.b.setTypeface(null, 2);
    addView(this.b);
    this.c = new TextView(paramContext);
    this.c.setId(12291);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-2, -2);
    int k = (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics());
    localLayoutParams3.setMargins(k, 0, k, k);
    this.c.setLayoutParams(localLayoutParams3);
    this.c.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
    this.c.setSingleLine(false);
    this.c.setTextColor(-16777216);
    this.c.setTextSize(2, 18.0F);
    this.c.setTypeface(null, 0);
    addView(this.c);
  }

  private void b(int paramInt)
  {
    if (this.a != null)
      this.a.setTextColor(paramInt);
  }

  private void c(int paramInt)
  {
    if (this.b != null)
      this.b.setTextColor(paramInt);
  }

  public final void a(int paramInt)
  {
    if (paramInt == 0)
    {
      setBackgroundColor(-3355444);
      b(-1);
      c(-1);
    }
    while (true)
    {
      if (this.c != null)
        this.c.setTextColor(-16777216);
      return;
      if (paramInt == 1)
      {
        setBackgroundColor(-1);
        b(-3355444);
        c(-3355444);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     net.hockeyapp.android.views.a
 * JD-Core Version:    0.6.2
 */