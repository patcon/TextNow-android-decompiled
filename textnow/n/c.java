package textnow.n;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.PurchaseAdRemovalTask;
import com.enflick.android.TextNow.tasks.PurchaseBarnesTask;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.q.b;
import textnow.u.j;
import textnow.u.r;

public final class c extends ao
  implements View.OnClickListener
{
  private r a;
  private Button b;
  private Button g;

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    paramc.j();
    paramc.h();
    paramc.i();
    if ((!paramBoolean) && ((localClass == PurchaseAdRemovalTask.class) || (localClass == PurchaseBarnesTask.class)))
    {
      this.e.r();
      if (paramc.h())
      {
        new StringBuilder().append("Could not purchase ad removal: ").append(paramc.i()).toString();
        this.e.c(2131493343);
        return true;
      }
      this.e.c(2131493344);
      this.e.y();
      return true;
    }
    if ((!paramBoolean) && (localClass == GetUserInfoTask.class))
    {
      this.e.r();
      return true;
    }
    return false;
  }

  public final String k()
  {
    return "/Purchase_Ad_Removal";
  }

  protected final String l()
  {
    return this.e.getString(2131493328);
  }

  public final int m()
  {
    return 2131165539;
  }

  protected final boolean n()
  {
    return true;
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.e.setTitle(2131493328);
  }

  public final void onClick(View paramView)
  {
    String str1;
    switch (paramView.getId())
    {
    default:
      this.e.c(2131493025);
      return;
    case 2131165619:
      a.a("purchase_enhancements", "item", "1month_ad_expiry");
      str1 = "adremoval1month";
    case 2131165620:
    }
    while (true)
    {
      new StringBuilder().append("buying: ").append(str1).toString();
      String str2 = this.a.b();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("username", str2);
        this.e.b(str1, localJSONObject.toString());
        return;
        a.a("purchase_enhancements", "item", "1year_ad_expiry");
        str1 = "adremoval1year";
      }
      catch (JSONException localJSONException)
      {
        while (true)
          localJSONException.printStackTrace();
      }
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = new r(this.e);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    j localj = new j(this.e);
    View localView = paramLayoutInflater.inflate(2130903168, null);
    this.b = ((Button)localView.findViewById(2131165619));
    Button localButton1 = this.b;
    MainActivity localMainActivity1 = this.e;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = localj.b("adremoval1month", "$0.99");
    localButton1.setText(localMainActivity1.getString(2131493326, arrayOfObject1));
    this.b.setOnClickListener(this);
    this.g = ((Button)localView.findViewById(2131165620));
    Button localButton2 = this.g;
    MainActivity localMainActivity2 = this.e;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = localj.b("adremoval1year", "$5.99");
    localButton2.setText(localMainActivity2.getString(2131493327, arrayOfObject2));
    this.g.setOnClickListener(this);
    TextView localTextView1 = (TextView)localView.findViewById(2131165622);
    if (!this.e.l())
      if (this.e.m())
      {
        MainActivity localMainActivity5 = this.e;
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = this.e.getString(2131493334);
        localTextView1.setText(localMainActivity5.getString(2131493332, arrayOfObject5));
      }
    TextView localTextView2;
    while (true)
    {
      localTextView2 = (TextView)localView.findViewById(2131165618);
      String str = this.a.U();
      if ((this.a.U() == null) || (b.a(this.a.t(), this.a.U())))
        break;
      localTextView2.setText(String.format(this.e.getResources().getString(2131493280), new Object[] { str }));
      return localView;
      if (MainActivity.n())
      {
        MainActivity localMainActivity4 = this.e;
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = this.e.getString(2131493335);
        localTextView1.setText(localMainActivity4.getString(2131493332, arrayOfObject4));
      }
      else
      {
        MainActivity localMainActivity3 = this.e;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = this.e.getString(2131493333);
        localTextView1.setText(localMainActivity3.getString(2131493332, arrayOfObject3));
      }
    }
    localTextView2.setText(2131493330);
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.n.c
 * JD-Core Version:    0.6.2
 */