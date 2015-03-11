package textnow.o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.ActivateDataActivity;
import com.enflick.android.TextNow.activities.account.CreditCardDialogView;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.tasks.ActivateDeviceTask;
import com.enflick.android.TextNow.tasks.ValidateCCTask;
import com.enflick.android.TextNow.tasks.c;
import com.stripe.android.TokenCallback;
import com.stripe.android.model.Token;
import textnow.z.s;
import textnow.z.u;

public final class b extends av
{
  private String a;
  private String b;
  private int f;
  private Button g;
  private CreditCardDialogView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private ActivateDataActivity l;
  private s m;

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == ValidateCCTask.class)
    {
      boolean bool = paramc.h();
      String str3 = paramc.j();
      if (!bool)
      {
        com.enflick.android.TextNow.ads.b.a("Activation", "Proceeded with valid payment", this.b);
        new ActivateDeviceTask(textnow.v.b.i(this.l), this.a).b(this.l);
        return true;
      }
      this.l.v();
      if ("BILLING_ADDRESS_MISMATCH".equals(str3))
      {
        this.l.c(2131296974);
        return true;
      }
      if ("INCORRECT_CVC".equals(str3))
      {
        this.l.c(2131296969);
        return true;
      }
      this.l.c(2131296968);
      return true;
    }
    if (paramc.getClass() == ActivateDeviceTask.class)
    {
      ActivateDeviceTask localActivateDeviceTask = (ActivateDeviceTask)paramc;
      this.l.v();
      if ((!localActivateDeviceTask.h()) && (localActivateDeviceTask.a() != null))
      {
        this.c.m(true);
        this.c.B();
        ActivateDataActivity localActivateDataActivity = this.l;
        String str2 = localActivateDeviceTask.a();
        a locala = new a();
        Bundle localBundle = new Bundle();
        localBundle.putString("extra_msl", str2);
        locala.setArguments(localBundle);
        localActivateDataActivity.a(locala, true);
        return true;
      }
      String str1 = localActivateDeviceTask.j();
      if ("CVC_MISMATCH".equals(str1))
      {
        this.l.c(2131296969);
        return true;
      }
      if ("INCORRECT_ZIP".equals(str1))
      {
        this.l.c(2131296970);
        return true;
      }
      if ("PLAN_NOT_FOUND".equals(str1))
      {
        this.l.c(2131296972);
        return true;
      }
      if ("PLAN_NOT_ACTIVE".equals(str1))
      {
        this.l.c(2131296973);
        return true;
      }
      if ("USER_HAS_SUBSCRIPTION".equals(str1))
      {
        this.l.c(2131296971);
        return true;
      }
      this.l.c(2131296968);
      return true;
    }
    return false;
  }

  public final String l()
  {
    return "/Data_Checkout";
  }

  public final String m()
  {
    return getString(2131296956);
  }

  public final boolean o()
  {
    return true;
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    String str = getString(2131296956);
    if (str != null)
      this.l.setTitle(str);
    this.l.d(true);
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.l = ((ActivateDataActivity)getActivity());
    this.m = new s(this.l);
    Bundle localBundle = getArguments();
    if ((localBundle != null) && (localBundle.containsKey("plan_id")))
    {
      this.a = getArguments().getString("plan_id");
      this.f = getArguments().getInt("plan_price");
      this.b = getArguments().getString("plan_name");
    }
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903088, null);
    this.i = ((TextView)localView.findViewById(2131558591));
    this.j = ((TextView)localView.findViewById(2131558592));
    this.k = ((TextView)localView.findViewById(2131558593));
    TextView localTextView = this.i;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.b;
    localTextView.setText(getString(2131296978, arrayOfObject));
    this.j.setText("$" + this.f / 100.0D);
    this.k.setText("$" + this.f / 100.0D);
    this.h = ((CreditCardDialogView)localView.findViewById(2131558594));
    this.g = ((Button)localView.findViewById(2131558595));
    this.g.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        b.a(b.this);
      }
    });
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.o.b
 * JD-Core Version:    0.6.2
 */