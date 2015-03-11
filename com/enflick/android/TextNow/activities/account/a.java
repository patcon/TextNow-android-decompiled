package com.enflick.android.TextNow.activities.account;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import android.preference.enflick.preferences.SelectablePreference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.ac;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.tasks.GetBillingInfoTask;
import com.enflick.android.TextNow.tasks.GetSubscriptionTask;
import com.enflick.android.TextNow.tasks.UpdateBillingInfoTask;
import com.stripe.android.Stripe;
import com.stripe.android.TokenCallback;
import com.stripe.android.model.Token;
import com.stripe.exception.AuthenticationException;
import textnow.v.b;
import textnow.v.z;
import textnow.z.s;
import textnow.z.u;

public class a extends ac
  implements Preference.OnPreferenceClickListener
{
  private SelectablePreference f;
  private SelectablePreference g;
  private SelectablePreference h;
  private SelectablePreference i;
  private PreferenceCategory j;
  private PreferenceCategory k;
  private PreferenceScreen l;
  private s m;
  private Dialog n;

  public static Dialog a(final ao paramao)
  {
    final CreditCardDialogView localCreditCardDialogView = (CreditCardDialogView)LayoutInflater.from(paramao).inflate(2130903129, null);
    AlertDialog localAlertDialog = new AlertDialog.Builder(paramao).setTitle(2131296834).setCancelable(true).setView(localCreditCardDialogView).setNegativeButton(2131296425, null).setPositiveButton(2131296440, null).create();
    localAlertDialog.setOnShowListener(new DialogInterface.OnShowListener()
    {
      public final void onShow(DialogInterface paramAnonymousDialogInterface)
      {
        a.this.getButton(-1).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymous2View)
          {
            d locald = a.1.this.b.a();
            int i = locald.b();
            if (i > 0)
            {
              a.1.this.c.b(i);
              return;
            }
            if (locald.validateCard())
            {
              a.1.this.c.a(2131296428, true);
              try
              {
                new Stripe(textnow.v.a.d).createToken(locald, new TokenCallback()
                {
                  public final void onError(Exception paramAnonymous3Exception)
                  {
                    a.1.this.c.v();
                    a.1.this.c.b(2131296867);
                  }

                  public final void onSuccess(Token paramAnonymous3Token)
                  {
                    new UpdateBillingInfoTask(new u(a.1.this.c).b(), paramAnonymous3Token.getId()).b(a.1.this.c);
                  }
                });
                return;
              }
              catch (AuthenticationException localAuthenticationException)
              {
                a.1.this.c.v();
                a.1.this.c.b(2131296867);
                return;
              }
            }
            a.1.this.c.b(2131296848);
          }
        });
      }
    });
    return localAlertDialog;
  }

  public static a a()
  {
    return new a();
  }

  private void d()
  {
    String str = this.m.f();
    Plan localPlan;
    if (("EXPIRED".equalsIgnoreCase(str)) || ("INACTIVE".equalsIgnoreCase(str)))
    {
      this.l.removePreference(this.k);
      this.j.removePreference(this.g);
      localPlan = this.m.c();
      if (localPlan == null)
        break label413;
      this.f.setEnabled(true);
      if ((!"INACTIVE".equalsIgnoreCase(str)) && (!"EXPIRED".equalsIgnoreCase(str)) && (!"DELINQUENT".equalsIgnoreCase(str)))
        break label323;
      this.f.setSummary(localPlan.name + " (" + str.toUpperCase() + ")");
    }
    while (true)
    {
      SelectablePreference localSelectablePreference1 = this.g;
      MainActivity localMainActivity1 = this.d;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = (b.b(this.m.e()) + "/" + b.b(localPlan.data));
      localSelectablePreference1.setSummary(localMainActivity1.getString(2131296839, arrayOfObject1));
      return;
      if (this.l.findPreference("billing_cat") == null)
        this.l.addPreference(this.k);
      if (this.j.findPreference("account_data") == null)
        this.j.addPreference(this.g);
      if (this.m.o().length() <= 0)
        break;
      this.i.setSummary(this.m.o() + "-" + this.m.p());
      break;
      label323: SelectablePreference localSelectablePreference2 = this.f;
      MainActivity localMainActivity2 = this.d;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = (localPlan.name + " (" + str.toUpperCase() + ")");
      arrayOfObject2[1] = b.a(this.m.g(), "MMM d, yyyy");
      localSelectablePreference2.setSummary(localMainActivity2.getString(2131296840, arrayOfObject2));
    }
    label413: this.f.setEnabled(false);
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == UpdateBillingInfoTask.class)
    {
      localUpdateBillingInfoTask = (UpdateBillingInfoTask)paramc;
      this.d.v();
      if (localUpdateBillingInfoTask.h())
        if ("NOT_FOUND".equals(localUpdateBillingInfoTask.j()))
          this.d.b(2131296847);
    }
    while ((paramc.getClass() != GetBillingInfoTask.class) && (paramc.getClass() != GetSubscriptionTask.class))
    {
      UpdateBillingInfoTask localUpdateBillingInfoTask;
      return false;
      this.d.b(2131296432);
      return false;
      if ((this.n != null) && (this.n.isShowing()))
        this.n.dismiss();
      d();
      this.d.b(2131296849);
      return false;
    }
    d();
    return false;
  }

  protected final String l()
  {
    return "/Wireless_Account";
  }

  public final String m()
  {
    if ((z.d(this.d)) && (this.b != 0))
      return null;
    return this.d.getString(2131296824);
  }

  public final int n()
  {
    return 2131558831;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.m = new s(this.d);
    b(2131034113);
    this.l = ((PreferenceScreen)a("account_pref"));
    this.j = ((PreferenceCategory)a("account_cat"));
    this.f = ((SelectablePreference)a("account_plan"));
    this.g = ((SelectablePreference)a("account_data"));
    this.h = ((SelectablePreference)a("account_billing_address"));
    this.i = ((SelectablePreference)a("account_credit_card"));
    this.k = ((PreferenceCategory)a("billing_cat"));
    this.f.setOnPreferenceClickListener(this);
    this.g.setOnPreferenceClickListener(this);
    this.h.setOnPreferenceClickListener(this);
    this.i.setOnPreferenceClickListener(this);
    new GetBillingInfoTask(this.c.b()).b(this.d);
    new GetSubscriptionTask(this.c.b()).b(this.d);
  }

  public void onDestroyView()
  {
    super.onDestroyView();
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    if (paramPreference == this.f)
      this.d.a(l.a());
    while (true)
    {
      return true;
      if (paramPreference == this.g)
      {
        this.d.a(k.a());
      }
      else if (paramPreference == this.h)
      {
        this.d.a(c.a());
      }
      else if ((paramPreference == this.i) && ((this.d == null) || (!this.d.isFinishing())))
      {
        this.n = a(this.d);
        this.n.show();
      }
    }
  }

  public void onResume()
  {
    super.onResume();
    d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.a
 * JD-Core Version:    0.6.2
 */