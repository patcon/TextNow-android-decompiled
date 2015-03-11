package textnow.p;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.enflick.android.TextNow.views.AvatarView;
import textnow.z.m;

public final class aa
{
  public m a;
  public View b;
  public AvatarView c;
  public TextView d;
  public TextView e;
  public ImageView f;
  public ImageView g;
  public ImageView h;
  public View i;
  public View j;
  public View k;
  public TextView l;
  public Button m;
  public View n;
  public View o;
  public int p;
  public int q;
  public int r;
  public boolean s;
  public TextView t;
  public TextView u;

  public aa(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.p = paramInt1;
    this.q = paramInt2;
    this.r = paramInt3;
    this.b = paramView;
    if ((paramInt1 == 1) || (paramInt1 == 0))
    {
      this.d = ((TextView)paramView.findViewById(2131558847));
      this.h = ((ImageView)paramView.findViewById(2131558852));
    }
    while (true)
    {
      if ((paramInt1 == 1) || (paramInt1 == 2))
      {
        if (paramInt3 == 1)
          this.c = ((AvatarView)paramView.findViewById(2131558557));
        this.o = paramView.findViewById(2131558849);
      }
      this.e = ((TextView)paramView.findViewById(2131558848));
      this.g = ((ImageView)paramView.findViewById(2131558854));
      this.i = paramView.findViewById(2131558845);
      this.u = ((TextView)paramView.findViewById(2131558846));
      this.n = paramView.findViewById(2131558844);
      this.t = ((TextView)paramView.findViewById(2131558860));
      return;
      if (paramInt1 == 2)
      {
        this.f = ((ImageView)paramView.findViewById(2131558850));
      }
      else if (paramInt1 == 103)
      {
        this.j = paramView.findViewById(2131558857);
        this.l = ((TextView)paramView.findViewById(2131558858));
        this.m = ((Button)paramView.findViewById(2131558859));
        this.k = paramView.findViewById(2131558855);
      }
      else if (paramInt1 == 8)
      {
        this.d = ((TextView)paramView.findViewById(2131558847));
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.aa
 * JD-Core Version:    0.6.2
 */