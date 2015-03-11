package textnow.s;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import java.util.concurrent.Callable;
import textnow.z.u;

public class h extends av
  implements View.OnClickListener
{
  private TextView a;
  private TextView b;
  private Button f;
  private Button g;
  private View h;
  private ImageView i;
  private ImageView j;
  private ImageView k;
  private ImageView l;
  private TextView m;
  private TextView n;
  private boolean o;

  public static h a(boolean paramBoolean)
  {
    h localh = new h();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("extra_is_child", paramBoolean);
    localh.setArguments(localBundle);
    return localh;
  }

  public final void a()
  {
    this.d.a(new e());
    this.j.setVisibility(0);
    this.i.setVisibility(8);
    this.k.setVisibility(8);
    this.l.setVisibility(8);
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final void b()
  {
    this.d.a(a.a());
    this.j.setVisibility(8);
    this.i.setVisibility(0);
    this.k.setVisibility(8);
    this.l.setVisibility(8);
  }

  public final String l()
  {
    return "/Store_Menu";
  }

  public final String m()
  {
    return this.d.getString(2131296709);
  }

  public final int n()
  {
    return 2131558823;
  }

  public final boolean o()
  {
    return this.o;
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131558985:
      this.d.a(d.a());
      this.j.setVisibility(8);
      this.i.setVisibility(8);
      this.k.setVisibility(0);
      this.l.setVisibility(8);
      return;
    case 2131558989:
    }
    this.d.a(new c());
    this.j.setVisibility(8);
    this.i.setVisibility(8);
    this.k.setVisibility(8);
    this.l.setVisibility(0);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    boolean bool1 = false;
    if (localBundle != null)
    {
      boolean bool2 = getArguments().getBoolean("extra_is_child", false);
      bool1 = false;
      if (bool2)
        bool1 = true;
    }
    this.o = bool1;
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903211, null);
    this.f = ((Button)localView.findViewById(2131558681));
    this.f.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        com.enflick.android.TextNow.ads.b.b("tap_to_view_offer_wall");
        if (!com.enflick.android.TextNow.activities.phone.h.d())
        {
          h.a(h.this, new Callable()
          {
          });
          return;
        }
        h.this.b();
      }
    });
    this.g = ((Button)localView.findViewById(2131558982));
    this.g.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        com.enflick.android.TextNow.ads.b.b("tap_to_view_purchases");
        if (!com.enflick.android.TextNow.activities.phone.h.d())
        {
          h.a(h.this, new Callable()
          {
          });
          return;
        }
        h.this.a();
      }
    });
    this.h = localView.findViewById(2131558984);
    this.m = ((TextView)localView.findViewById(2131558987));
    String str2;
    if (textnow.v.b.a(this.c.r(), this.c.N()))
    {
      str2 = getResources().getString(2131296684);
      this.m.setText(str2);
      ((ViewGroup)localView.findViewById(2131558985)).setOnClickListener(this);
      this.n = ((TextView)localView.findViewById(2131558991));
      if (!textnow.v.b.a(this.c.r(), this.c.W()))
        break label341;
    }
    label341: String str3;
    Object[] arrayOfObject2;
    for (String str4 = getResources().getString(2131296690); ; str4 = String.format(str3, arrayOfObject2))
    {
      this.n.setText(str4);
      ((ViewGroup)localView.findViewById(2131558989)).setOnClickListener(this);
      this.a = ((TextView)localView.findViewById(2131558979));
      this.b = ((TextView)localView.findViewById(2131558980));
      this.i = ((ImageView)localView.findViewById(2131558981));
      this.j = ((ImageView)localView.findViewById(2131558983));
      this.k = ((ImageView)localView.findViewById(2131558988));
      this.l = ((ImageView)localView.findViewById(2131558992));
      return localView;
      String str1 = getResources().getString(2131296687);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.c.N();
      str2 = String.format(str1, arrayOfObject1);
      break;
      str3 = getResources().getString(2131296689);
      arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.c.W();
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onResume()
  {
    super.onResume();
    u localu = new u(getActivity());
    int i1 = localu.E();
    int i2 = localu.E();
    Resources localResources1 = getResources();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i1);
    String str1 = localResources1.getQuantityString(2131689475, i1, arrayOfObject1);
    String str2 = getString(2131296715);
    int i3 = 1 + str2.length();
    int i4 = i3 + str1.length();
    SpannableString localSpannableString = new SpannableString(str2 + " " + str1);
    localSpannableString.setSpan(new TextAppearanceSpan(this.d, 2131362053), i3, i4, 18);
    this.a.setText(localSpannableString);
    TextView localTextView = this.b;
    Resources localResources2 = getResources();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(i2);
    localTextView.setText(localResources2.getQuantityString(2131689476, i2, arrayOfObject2));
    if ((this.d.n()) || (this.d.o()) || (MainActivity.p()))
    {
      this.g.setVisibility(0);
      this.h.setVisibility(0);
      return;
    }
    this.g.setVisibility(8);
    this.h.setVisibility(8);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.s.h
 * JD-Core Version:    0.6.2
 */