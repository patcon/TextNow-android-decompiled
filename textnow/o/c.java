package textnow.o;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.ActivateDataActivity;
import com.enflick.android.TextNow.activities.account.PlanSelectionView;
import com.enflick.android.TextNow.activities.account.SubscriptionPlanView;
import com.enflick.android.TextNow.activities.account.j;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.tasks.CheckESNTask;
import com.enflick.android.TextNow.tasks.GetPlansTask;
import textnow.v.b;
import textnow.z.s;

public final class c extends av
  implements j
{
  private static boolean a = false;
  private ActivateDataActivity b;
  private s f;
  private ProgressBar g;
  private View h;
  private Button i;
  private Button j;
  private PlanSelectionView k;
  private TextView l;
  private TextView m;
  private boolean n;
  private boolean o;

  public static c a(boolean paramBoolean)
  {
    c localc = new c();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("extra_show_text", paramBoolean);
    localc.setArguments(localBundle);
    return localc;
  }

  private void a()
  {
    switch (3.a[this.f.q().ordinal()])
    {
    default:
      this.l.setText(Html.fromHtml(getString(2131296953)));
      this.l.setVisibility(0);
      this.l.setMovementMethod(LinkMovementMethod.getInstance());
      this.i.setVisibility(8);
      this.m.setVisibility(8);
      this.j.setVisibility(8);
      this.k.a(false);
      return;
    case 1:
      this.l.setText(2131296951);
      TextView localTextView = this.l;
      if (this.n);
      for (int i1 = 0; ; i1 = 8)
      {
        localTextView.setVisibility(i1);
        this.j.setVisibility(8);
        this.i.setVisibility(0);
        this.m.setVisibility(0);
        this.k.a(true);
        return;
      }
    case 2:
      this.l.setText(2131296952);
      this.l.setVisibility(0);
      this.j.setVisibility(0);
      Button localButton = this.j;
      if (!a);
      for (boolean bool = true; ; bool = false)
      {
        localButton.setEnabled(bool);
        this.i.setVisibility(8);
        this.m.setVisibility(8);
        this.k.a(false);
        return;
      }
    case 3:
    }
    this.l.setText(2131296954);
    this.l.setVisibility(0);
    this.i.setVisibility(8);
    this.m.setVisibility(8);
    this.j.setVisibility(8);
    this.k.a(false);
  }

  public final void a(SubscriptionPlanView paramSubscriptionPlanView)
  {
    Plan localPlan = this.f.d();
    Button localButton = this.i;
    if ((localPlan == null) || (paramSubscriptionPlanView.b().id != localPlan.id));
    for (boolean bool = true; ; bool = false)
    {
      localButton.setEnabled(bool);
      return;
    }
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == CheckESNTask.class)
    {
      this.b.v();
      this.g.setVisibility(8);
      this.h.setVisibility(0);
      this.k.c();
      this.k.b();
      a = true;
      a();
      return true;
    }
    if (paramc.getClass() == GetPlansTask.class)
    {
      boolean bool = paramc.h();
      this.g.setVisibility(8);
      if ((bool) && (this.f.a(5) == null))
      {
        this.b.b(2131296868);
        return true;
      }
      this.h.setVisibility(0);
      this.k.c();
      this.k.b();
      a();
      return true;
    }
    return false;
  }

  public final String l()
  {
    return "/Plan_Overview";
  }

  public final String m()
  {
    return getString(2131296945);
  }

  public final boolean o()
  {
    return true;
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    String str = getString(2131296945);
    if (str != null)
      this.b.setTitle(str);
    this.b.d(true);
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = ((ActivateDataActivity)getActivity());
    this.f = new s(this.b);
    this.n = getArguments().getBoolean("extra_show_text", false);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903178, null);
    this.g = ((ProgressBar)localView.findViewById(2131558582));
    this.h = localView.findViewById(2131558583);
    this.k = ((PlanSelectionView)localView.findViewById(2131558584));
    this.k.a(this);
    this.l = ((TextView)localView.findViewById(2131558894));
    TextView localTextView = this.l;
    int i1;
    if (this.n)
    {
      i1 = 0;
      localTextView.setVisibility(i1);
      this.m = ((TextView)localView.findViewById(2131558892));
      this.i = ((Button)localView.findViewById(2131558595));
      this.i.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (!c.a(c.this))
          {
            c.c(c.this).a(new d(c.this.getString(2131296949), c.this.getString(2131296950), c.this.getString(2131296427), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                c.b(c.this);
              }
            }
            , c.this.getString(2131296425), null), "byosd_warning");
            c.a(c.this, true);
            return;
          }
          c.b(c.this);
        }
      });
      this.i.setEnabled(false);
      this.j = ((Button)localView.findViewById(2131558893));
      this.j.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          c.c(c.this).a(2131296428, true);
          new CheckESNTask(b.i(c.c(c.this))).b(c.c(c.this));
        }
      });
      if (this.f.a(5) == null)
        break label245;
      this.k.c();
      this.g.setVisibility(8);
      this.h.setVisibility(0);
      a();
    }
    while (true)
    {
      new GetPlansTask().b(this.b);
      return localView;
      i1 = 8;
      break;
      label245: this.g.setVisibility(0);
      this.h.setVisibility(8);
    }
  }

  public final void onResume()
  {
    super.onResume();
    this.k.b();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.o.c
 * JD-Core Version:    0.6.2
 */