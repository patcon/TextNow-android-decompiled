package textnow.z;

import android.content.Context;
import android.text.TextUtils;
import com.enflick.android.TextNow.api.common.b;
import com.enflick.android.TextNow.api.responsemodel.Billing;
import com.enflick.android.TextNow.api.responsemodel.Plan;
import com.enflick.android.TextNow.api.responsemodel.Subscription;
import com.enflick.android.TextNow.api.responsemodel.Subscription.CurrentSub;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.v.a;

public final class s extends r
{
  public static int b = -1;

  public s(Context paramContext)
  {
    super(paramContext, "TNSubscription");
  }

  private static String b(int paramInt)
  {
    return "plan_" + paramInt;
  }

  private void b(Plan paramPlan)
  {
    if (paramPlan != null)
    {
      String str = b.a(paramPlan);
      if (!TextUtils.isEmpty(str))
      {
        c("current_plan", str);
        return;
      }
    }
    c("current_plan", "");
  }

  private void c(Plan paramPlan)
  {
    if (paramPlan != null)
    {
      String str = b.a(paramPlan);
      if (!TextUtils.isEmpty(str))
      {
        c("next_plan", str);
        return;
      }
    }
    c("next_plan", "");
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

  public final void a()
  {
    a("sub_id", -1);
    b(null);
    c("status", "");
    c(null);
    B();
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
    B();
  }

  public final void a(Plan paramPlan)
  {
    String str = b.a(paramPlan);
    if (!TextUtils.isEmpty(str))
      c(b(paramPlan.id), str);
  }

  public final void a(Subscription paramSubscription)
  {
    Subscription.CurrentSub localCurrentSub = paramSubscription.current;
    if (localCurrentSub == null)
    {
      a("sub_id", -1);
      b(null);
      c("status", "");
    }
    while (true)
    {
      c(paramSubscription.next);
      B();
      return;
      a("sub_id", localCurrentSub.id);
      b(localCurrentSub.plan);
      c("created_at", localCurrentSub.createdAt);
      a("data_usage", localCurrentSub.dataUsage);
      c("last_updated", localCurrentSub.lastUpdated);
      c("period_start", localCurrentSub.periodStart);
      c("period_end", localCurrentSub.periodEnd);
      c("status", localCurrentSub.status);
      a("warned", localCurrentSub.warned);
    }
  }

  public final void a(t paramt)
  {
    a("esn_status", paramt.ordinal());
  }

  public final int b()
  {
    return b("sub_id", -1);
  }

  public final void b(t paramt)
  {
    long l1 = -1L;
    if (a.a)
    {
      a("next_esn_check_date", 60000L + System.currentTimeMillis());
      return;
    }
    long l2;
    switch (1.a[paramt.ordinal()])
    {
    default:
      l2 = 1209600000L;
      if (l2 >= 0L)
        break;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      a("next_esn_check_date", l1);
      return;
      l2 = ()(86400000.0D * (5.0D * new Random().nextDouble()));
      break;
      l2 = 172800000L;
      break;
      l2 = l1;
      break;
      l1 = l2 + System.currentTimeMillis();
    }
  }

  public final Plan c()
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

  public final Plan d()
  {
    String str = d("next_plan", "");
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

  public final int e()
  {
    if ((a.a) && (b >= 0))
      return b;
    return b("data_usage", 0);
  }

  public final String f()
  {
    return d("status", "");
  }

  public final String g()
  {
    return d("period_end", "");
  }

  public final String h()
  {
    return d("billing_name", "");
  }

  public final String i()
  {
    return d("billing_address_line1", "");
  }

  public final String j()
  {
    return d("billing_address_line2", "");
  }

  public final String k()
  {
    return d("billing_city", "");
  }

  public final String l()
  {
    return d("billing_state", "");
  }

  public final String m()
  {
    return d("billing_zip", "");
  }

  public final String n()
  {
    return d("billing_country", "");
  }

  public final String o()
  {
    return d("billing_cc_type", "");
  }

  public final String p()
  {
    return d("billing_cc_last4", "");
  }

  public final t q()
  {
    int i = b("esn_status", 0);
    return t.values()[i];
  }

  public final long r()
  {
    return b("next_esn_check_date", -1L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.s
 * JD-Core Version:    0.6.2
 */