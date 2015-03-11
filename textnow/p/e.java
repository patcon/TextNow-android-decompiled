package textnow.p;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import textnow.v.b;
import textnow.z.u;

public final class e extends android.support.v4.widget.f
{
  private Context j;
  private u k;

  public e(Context paramContext, Cursor paramCursor)
  {
    super(paramContext, null, 0);
    this.j = paramContext;
    this.k = new u(paramContext);
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903079, paramViewGroup, false);
    localView.setTag(new f(this, localView));
    return localView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    f localf = (f)paramView.getTag();
    textnow.z.e locale = new textnow.z.e(paramCursor);
    localf.c.setText(b.d(locale.g(), this.k.r()));
    switch (locale.e())
    {
    default:
    case 100:
    case 1:
    case 101:
    case 102:
    case 103:
    }
    while ((locale.e() == 101) || (locale.e() == 1))
    {
      localf.d.setText(b.e(locale.g(), this.k.r()));
      localf.e.setText("");
      return;
      localf.a.setImageResource(2130837851);
      localf.a.setColorFilter(this.j.getResources().getColor(2131230878), PorterDuff.Mode.MULTIPLY);
      localf.b.setText(2131296764);
      continue;
      localf.a.setImageResource(2130837849);
      localf.a.setColorFilter(this.j.getResources().getColor(2131230884), PorterDuff.Mode.MULTIPLY);
      localf.b.setText(2131296765);
      continue;
      localf.a.setImageResource(2130837850);
      localf.a.setColorFilter(this.j.getResources().getColor(2131230890), PorterDuff.Mode.MULTIPLY);
      localf.b.setText(2131296763);
    }
    try
    {
      int m = Integer.parseInt(locale.f());
      i = m;
      localf.d.setText(b.e(locale.g(), this.k.r()) + ", ");
      localf.e.setText(b.a(i));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
        int i = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.e
 * JD-Core Version:    0.6.2
 */