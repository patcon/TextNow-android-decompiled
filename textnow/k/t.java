package textnow.k;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import textnow.u.k;

public final class t
{
  public k a;
  public TextView b;
  public TextView c;
  public TextView d;
  public TextView e;
  public ImageView f;
  public ImageView g;
  public ImageView h;
  public View i;
  public View j;
  public View k;
  public View l;
  public TextView m;
  public Button n;
  public View o;
  public int p;
  public int q;
  public int r;
  public TextView s;
  public TextView t;

  public t(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.p = paramInt1;
    this.q = paramInt2;
    this.r = paramInt3;
    if ((paramInt1 == 1) || (paramInt1 == 0))
    {
      this.b = ((TextView)paramView.findViewById(2131165551));
      this.c = ((TextView)paramView.findViewById(2131165554));
      this.h = ((ImageView)paramView.findViewById(2131165559));
    }
    while (true)
    {
      this.o = paramView.findViewById(2131165547);
      this.d = ((TextView)paramView.findViewById(2131165552));
      this.e = ((TextView)paramView.findViewById(2131165555));
      this.g = ((ImageView)paramView.findViewById(2131165556));
      this.i = paramView.findViewById(2131165549);
      this.j = paramView.findViewById(2131165553);
      this.s = ((TextView)paramView.findViewById(2131165548));
      this.t = ((TextView)paramView.findViewById(2131165550));
      return;
      if (paramInt1 == 2)
      {
        this.f = ((ImageView)paramView.findViewById(2131165557));
      }
      else if (paramInt1 == 103)
      {
        this.k = paramView.findViewById(2131165563);
        this.m = ((TextView)paramView.findViewById(2131165564));
        this.n = ((Button)paramView.findViewById(2131165565));
        this.l = paramView.findViewById(2131165561);
      }
      else if (paramInt1 == 8)
      {
        this.b = ((TextView)paramView.findViewById(2131165551));
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.t
 * JD-Core Version:    0.6.2
 */