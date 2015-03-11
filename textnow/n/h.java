package textnow.n;

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
import com.enflick.android.TextNow.activities.ao;
import java.util.concurrent.Callable;
import textnow.q.b;
import textnow.u.r;

public class h extends ao
  implements View.OnClickListener
{
  private TextView a;
  private TextView b;
  private Button g;
  private Button h;
  private View i;
  private ImageView j;
  private ImageView k;
  private ImageView l;
  private ImageView m;
  private TextView n;
  private TextView o;

  public final void a()
  {
    this.e.a(new e());
    this.k.setVisibility(0);
    this.j.setVisibility(8);
    this.l.setVisibility(8);
    this.m.setVisibility(8);
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final void b()
  {
    this.e.a(a.a());
    this.k.setVisibility(8);
    this.j.setVisibility(0);
    this.l.setVisibility(8);
    this.m.setVisibility(8);
  }

  public final String k()
  {
    return "/Store_Menu";
  }

  public final String l()
  {
    return this.e.getString(2131493300);
  }

  public final int m()
  {
    return 2131165539;
  }

  public final boolean n()
  {
    return false;
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165683:
      this.e.a(d.a());
      this.k.setVisibility(8);
      this.j.setVisibility(8);
      this.l.setVisibility(0);
      this.m.setVisibility(8);
      return;
    case 2131165687:
    }
    this.e.a(new c());
    this.k.setVisibility(8);
    this.j.setVisibility(8);
    this.l.setVisibility(8);
    this.m.setVisibility(0);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903193, null);
    this.g = ((Button)localView.findViewById(2131165410));
    this.g.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        com.enflick.android.TextNow.ads.a.b("tap_to_view_offer_wall");
        if (!com.enflick.android.TextNow.activities.phone.d.d())
        {
          h.a(h.this, new Callable()
          {
          });
          return;
        }
        h.this.b();
      }
    });
    this.h = ((Button)localView.findViewById(2131165680));
    this.h.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        com.enflick.android.TextNow.ads.a.b("tap_to_view_purchases");
        if (!com.enflick.android.TextNow.activities.phone.d.d())
        {
          h.a(h.this, new Callable()
          {
          });
          return;
        }
        h.this.a();
      }
    });
    this.i = localView.findViewById(2131165682);
    this.n = ((TextView)localView.findViewById(2131165685));
    String str2;
    if (b.a(this.c.t(), this.c.L()))
    {
      str2 = getResources().getString(2131493275);
      this.n.setText(str2);
      ((ViewGroup)localView.findViewById(2131165683)).setOnClickListener(this);
      this.o = ((TextView)localView.findViewById(2131165689));
      if (!b.a(this.c.t(), this.c.U()))
        break label341;
    }
    label341: String str3;
    Object[] arrayOfObject2;
    for (String str4 = getResources().getString(2131493281); ; str4 = String.format(str3, arrayOfObject2))
    {
      this.o.setText(str4);
      ((ViewGroup)localView.findViewById(2131165687)).setOnClickListener(this);
      this.a = ((TextView)localView.findViewById(2131165677));
      this.b = ((TextView)localView.findViewById(2131165678));
      this.j = ((ImageView)localView.findViewById(2131165679));
      this.k = ((ImageView)localView.findViewById(2131165681));
      this.l = ((ImageView)localView.findViewById(2131165686));
      this.m = ((ImageView)localView.findViewById(2131165690));
      return localView;
      String str1 = getResources().getString(2131493278);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.c.L();
      str2 = String.format(str1, arrayOfObject1);
      break;
      str3 = getResources().getString(2131493280);
      arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.c.U();
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onResume()
  {
    super.onResume();
    r localr = new r(getActivity());
    int i1 = localr.C();
    int i2 = localr.C();
    Resources localResources1 = getResources();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i1);
    String str1 = localResources1.getQuantityString(2131689475, i1, arrayOfObject1);
    String str2 = getString(2131493312);
    int i3 = 1 + str2.length();
    int i4 = i3 + str1.length();
    SpannableString localSpannableString = new SpannableString(str2 + " " + str1);
    localSpannableString.setSpan(new TextAppearanceSpan(this.e, 2131558556), i3, i4, 18);
    this.a.setText(localSpannableString);
    TextView localTextView = this.b;
    Resources localResources2 = getResources();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(i2);
    localTextView.setText(localResources2.getQuantityString(2131689476, i2, arrayOfObject2));
    if ((this.e.l()) || (this.e.m()) || (MainActivity.n()))
    {
      this.h.setVisibility(0);
      this.i.setVisibility(0);
      return;
    }
    this.h.setVisibility(8);
    this.i.setVisibility(8);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.n.h
 * JD-Core Version:    0.6.2
 */