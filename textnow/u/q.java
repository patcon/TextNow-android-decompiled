package textnow.u;

import android.content.Context;
import android.text.TextUtils;
import com.enflick.android.TextNow.api.common.b;
import com.enflick.android.TextNow.api.responsemodel.Billing;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.api.responsemodel.Subscription;
import org.json.JSONException;
import org.json.JSONObject;

public final class q extends p
{
  public q(Context paramContext)
  {
    super(paramContext, "TNSubscription");
  }

  private static String b(int paramInt)
  {
    return "plan_" + paramInt;
  }

  public final int a()
  {
    return b("sub_id", -1);
  }

  public final Plan a(int paramInt)
  {
    String str = d(b(paramInt), "");
    if (str.length() > 0)
      try
      {
        Plan localPlan = (Plan)b.a(new JSONObject(str), Plan.class);
        return localPlan;
      }
      catch (JSONException localJSONException)
      {
      }
    return null;
  }

  public final void a(Billing paramBilling)
  {
    c("billing_name", paramBilling.name);
    c("billing_address_line1", paramBilling.addressLine1);
    c("billing_address_line2", paramBilling.addressLine2);
    c("billing_state", paramBilling.addressState);
    c("billing_city", paramBilling.addressCity);
    c("billing_zip", paramBilling.addressZip);
    c("billing_country", paramBilling.addressCountry);
    c("billing_cc_last4", paramBilling.last4);
    c("billing_cc_type", paramBilling.type);
    n();
  }

  public final void a(Plan paramPlan)
  {
    String str = b.a(paramPlan);
    if (!TextUtils.isEmpty(str))
      c(b(paramPlan.id), str);
  }

  public final void a(Subscription paramSubscription)
  {
    a("sub_id", paramSubscription.id);
    if (paramSubscription.plan != null)
    {
      String str = b.a(paramSubscription.plan);
      if (!TextUtils.isEmpty(str))
        c("current_plan", str);
    }
    c("created_at", paramSubscription.createdAt);
    a("data_usage", paramSubscription.dataUsage);
    c("last_updated", paramSubscription.lastUpdated);
    c("period_start", paramSubscription.periodStart);
    c("period_end", paramSubscription.periodEnd);
    c("status", paramSubscription.status);
    a("warned", paramSubscription.warned);
    n();
  }

  public final Plan b()
  {
    String str = d("current_plan", "");
    if (str.length() > 0)
      try
      {
        Plan localPlan = (Plan)b.a(new JSONObject(str), Plan.class);
        return localPlan;
      }
      catch (JSONException localJSONException)
      {
      }
    return null;
  }

  public final int c()
  {
    return b("data_usage", 0);
  }

  public final String d()
  {
    return d("status", "");
  }

  public final String e()
  {
    return d("period_end", "");
  }

  public final String f()
  {
    return d("billing_name", "");
  }

  public final String g()
  {
    return d("billing_address_line1", "");
  }

  public final String h()
  {
    return d("billing_address_line2", "");
  }

  public final String i()
  {
    return d("billing_city", "");
  }

  public final String j()
  {
    return d("billing_state", "");
  }

  public final String k()
  {
    return d("billing_zip", "");
  }

  public final String l()
  {
    return d("billing_country", "");
  }

  public final String m()
  {
    return d("billing_cc_type", "");
  }

  public final String p()
  {
    return d("billing_cc_last4", "");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.q
 * JD-Core Version:    0.6.2
 */