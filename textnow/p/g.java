package textnow.p;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.phone.c;
import com.enflick.android.TextNow.activities.phone.f;
import com.enflick.android.TextNow.views.AvatarView;
import com.enflick.android.TextNow.views.TintedImageView;
import textnow.v.b;
import textnow.v.o;
import textnow.z.e;

public final class g extends u
  implements AdapterView.OnItemClickListener, com.enflick.android.TextNow.activities.phone.g
{
  private Context c;
  private textnow.z.u d;
  private f e;
  private long f = 0L;
  private h g = null;

  public g(Context paramContext)
  {
    super(paramContext);
    this.c = paramContext;
    this.d = new textnow.z.u(paramContext);
    this.e = new f(this);
  }

  private static void a(h paramh, int paramInt, boolean paramBoolean)
  {
    LinearLayout localLinearLayout;
    if (Build.VERSION.SDK_INT >= 11)
    {
      localLinearLayout = paramh.b;
      if (!paramBoolean)
        break label41;
    }
    label41: for (LayoutTransition localLayoutTransition = new LayoutTransition(); ; localLayoutTransition = null)
    {
      localLinearLayout.setLayoutTransition(localLayoutTransition);
      paramh.g.setVisibility(paramInt);
      return;
    }
  }

  private void b(View paramView, Cursor paramCursor, int paramInt)
  {
    final h localh = (h)paramView.getTag();
    e locale;
    int i;
    int[] arrayOfInt;
    while (true)
    {
      try
      {
        locale = new e(paramCursor);
        localh.a = locale;
        localh.c.a(locale.i());
        o localo = o.a(this.c);
        AvatarView localAvatarView = localh.c;
        if (locale.h() == null)
        {
          localUri = null;
          localo.a(localAvatarView, localUri);
          localh.d.setText(locale.i());
          localh.e.setText(b.c(locale.g(), this.d.r()));
          localh.f.removeAllViews();
          i = paramCursor.getPosition();
          arrayOfInt = new int[paramInt];
          int j = 0;
          if (j >= paramInt)
            break;
          arrayOfInt[j] = paramCursor.getInt(4);
          paramCursor.moveToNext();
          j++;
          continue;
        }
      }
      catch (Exception localException)
      {
        localh.c.a("");
        localh.d.setText(this.c.getString(2131296996));
        localh.e.setText("");
        localh.f.removeAllViews();
        a(localh, 8, false);
        return;
      }
      Uri localUri = Uri.parse(locale.h());
    }
    paramCursor.moveToPosition(i);
    int k = 0;
    if (k < Math.min(5, arrayOfInt.length))
    {
      TintedImageView localTintedImageView = new TintedImageView(this.c);
      switch (arrayOfInt[k])
      {
      default:
      case 100:
      case 1:
      case 101:
      case 102:
      case 103:
      }
      while (true)
      {
        localh.f.addView(localTintedImageView);
        k++;
        break;
        localTintedImageView.setImageResource(2130837851);
        localTintedImageView.a(this.c.getResources().getColor(2131230878));
        continue;
        localTintedImageView.setImageResource(2130837849);
        localTintedImageView.a(this.c.getResources().getColor(2131230884));
        continue;
        localTintedImageView.setImageResource(2130837850);
        localTintedImageView.a(this.c.getResources().getColor(2131230890));
      }
    }
    if (locale.a() == this.f);
    for (int m = 0; ; m = 8)
    {
      a(localh, m, false);
      if (locale.a() == this.f)
        this.g = localh;
      localh.h.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if ((g.a(g.this) instanceof MainActivity))
            ((MainActivity)g.a(g.this)).a(g.a(g.this, localh.a), false, true);
        }
      });
      localh.i.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          ((MainActivity)g.a(g.this)).a(c.a(g.a(g.this, localh.a)));
        }
      });
      return;
    }
  }

  protected final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    return c(paramContext, paramViewGroup);
  }

  public final void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super.a(paramInt1, paramInt2, paramBoolean);
  }

  protected final void a(Cursor paramCursor)
  {
    this.e.a(paramCursor);
  }

  protected final void a(View paramView, Cursor paramCursor)
  {
    b(paramView, paramCursor, 1);
  }

  protected final void a(View paramView, Cursor paramCursor, int paramInt)
  {
    b(paramView, paramCursor, paramInt);
  }

  protected final View b(Context paramContext, ViewGroup paramViewGroup)
  {
    return c(paramContext, paramViewGroup);
  }

  protected final void b(View paramView, Cursor paramCursor)
  {
    b(paramView, paramCursor, 1);
  }

  protected final View c(Context paramContext, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903080, paramViewGroup, false);
    localView.setTag(new h(this, localView));
    return localView;
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    h localh = (h)paramView.getTag();
    e locale;
    if ((localh != null) && (localh.a != null))
    {
      locale = localh.a;
      if (locale.a() == this.f)
      {
        a(localh, 8, true);
        this.f = 0L;
        this.g = null;
      }
    }
    else
    {
      return;
    }
    if (this.g != null)
      a(this.g, 8, true);
    a(localh, 0, true);
    this.f = locale.a();
    this.g = localh;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.g
 * JD-Core Version:    0.6.2
 */