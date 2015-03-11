package com.enflick.android.TextNow.activities.account;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.preferences.SelectablePreference;
import com.enflick.android.TextNow.activities.w;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.tasks.GetBillingInfoTask;
import com.enflick.android.TextNow.tasks.GetSubscriptionTask;
import com.enflick.android.TextNow.tasks.UpdateBillingInfoTask;
import com.stripe.android.Stripe;
import com.stripe.android.TokenCallback;
import com.stripe.android.model.Token;
import com.stripe.exception.AuthenticationException;
import textnow.q.ad;
import textnow.q.b;
import textnow.u.q;
import textnow.u.r;

public class a extends w
  implements Preference.OnPreferenceClickListener
{
  private SelectablePreference g;
  private SelectablePreference h;
  private SelectablePreference i;
  private SelectablePreference j;
  private q k;
  private AlertDialog l;

  public static a a()
  {
    return new a();
  }

  private void d()
  {
    if (this.k.m().length() > 0)
      this.j.setSummary(this.k.m() + "-" + this.k.p());
    Plan localPlan = this.k.b();
    if (localPlan != null)
    {
      SelectablePreference localSelectablePreference1 = this.g;
      MainActivity localMainActivity1 = this.e;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = (localPlan.name + " (" + this.k.d().toUpperCase() + ")");
      arrayOfObject1[1] = b.a(this.k.e(), "MMM d, yyyy");
      localSelectablePreference1.setSummary(localMainActivity1.getString(2131493453, arrayOfObject1));
      if (this.k.d().equalsIgnoreCase("INACTIVE"))
        this.g.setEnabled(false);
      while (true)
      {
        SelectablePreference localSelectablePreference2 = this.h;
        MainActivity localMainActivity2 = this.e;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = (b.a(this.k.c()) + "/" + b.a(localPlan.data));
        localSelectablePreference2.setSummary(localMainActivity2.getString(2131493451, arrayOfObject2));
        return;
        this.g.setEnabled(true);
      }
    }
    this.g.setEnabled(false);
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == UpdateBillingInfoTask.class)
    {
      UpdateBillingInfoTask localUpdateBillingInfoTask = (UpdateBillingInfoTask)paramc;
      this.e.r();
      if (localUpdateBillingInfoTask.h())
        if ("NOT_FOUND".equals(localUpdateBillingInfoTask.j()))
          this.e.c(2131493473);
      while (true)
      {
        return true;
        this.e.c(2131493025);
        continue;
        if ((this.l != null) && (this.l.isShowing()))
          this.l.dismiss();
        d();
        this.e.c(2131493475);
      }
    }
    if (paramc.getClass() == GetBillingInfoTask.class)
      d();
    return false;
  }

  protected final String k()
  {
    return "/Wireless_Account";
  }

  public final String l()
  {
    if ((ad.b(this.e)) && (this.b != 0))
      return null;
    return this.e.getString(2131493432);
  }

  public final int m()
  {
    return 2131165540;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.k = new q(this.e);
    b(2131034113);
    this.g = ((SelectablePreference)a("account_plan"));
    this.h = ((SelectablePreference)a("account_data"));
    this.i = ((SelectablePreference)a("account_billing_address"));
    this.j = ((SelectablePreference)a("account_credit_card"));
    this.g.setOnPreferenceClickListener(this);
    this.h.setOnPreferenceClickListener(this);
    this.i.setOnPreferenceClickListener(this);
    this.j.setOnPreferenceClickListener(this);
    new GetBillingInfoTask(this.c.b()).b(this.e);
    new GetSubscriptionTask(this.c.b()).b(this.e);
  }

  public void onDestroyView()
  {
    super.onDestroyView();
  }

  public boolean onPreferenceClick(Preference paramPreference)
  {
    if (paramPreference == this.g)
      this.e.a(k.a());
    do
    {
      return true;
      if (paramPreference == this.h)
      {
        this.e.a(j.a());
        return true;
      }
      if (paramPreference == this.i)
      {
        this.e.a(c.a());
        return true;
      }
    }
    while (paramPreference != this.j);
    MainActivity localMainActivity = this.e;
    final CreditCardDialogView localCreditCardDialogView = (CreditCardDialogView)LayoutInflater.from(localMainActivity).inflate(2130903115, null);
    this.l = new AlertDialog.Builder(localMainActivity).setTitle(2131493443).setCancelable(true).setView(localCreditCardDialogView).setNegativeButton(2131493019, null).setPositiveButton(2131493033, null).create();
    this.l.setOnShowListener(new DialogInterface.OnShowListener()
    {
      public final void onShow(DialogInterface paramAnonymousDialogInterface)
      {
        a.a(a.this).getButton(-1).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymous2View)
          {
            d locald = a.1.this.a.a();
            int i = locald.b();
            if (i > 0)
            {
              a.b(a.this).c(i);
              return;
            }
            if (locald.validateCard())
            {
              a.c(a.this).a(2131493021, true);
              try
              {
                new Stripe(textnow.q.a.d).createToken(locald, new TokenCallback()
                {
                  public final void onError(Exception paramAnonymous3Exception)
                  {
                    a.f(a.this).r();
                    a.g(a.this).c(2131493493);
                  }

                  public final void onSuccess(Token paramAnonymous3Token)
                  {
                    new UpdateBillingInfoTask(new r(a.e(a.this)).b(), paramAnonymous3Token.getId()).b(a.d(a.this));
                  }
                });
                return;
              }
              catch (AuthenticationException localAuthenticationException)
              {
                a.h(a.this).r();
                a.i(a.this).c(2131493493);
                return;
              }
            }
            a.j(a.this).c(2131493474);
          }
        });
      }
    });
    this.l.show();
    return true;
  }

  public void onResume()
  {
    super.onResume();
    d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.a
 * JD-Core Version:    0.6.2
 */