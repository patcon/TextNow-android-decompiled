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
import com.enflick.android.TextNow.activities.ab;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.PurchaseBarnesTask;
import com.enflick.android.TextNow.tasks.PurchaseCallForwardingTask;
import com.enflick.android.TextNow.tasks.c;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.q.b;
import textnow.u.j;
import textnow.u.r;

public final class d extends ao
  implements View.OnClickListener
{
  private r a;
  private Button b;
  private Button g;

  public static d a()
  {
    return new d();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    paramc.j();
    paramc.h();
    paramc.i();
    if ((!paramBoolean) && ((localClass == PurchaseCallForwardingTask.class) || (localClass == PurchaseBarnesTask.class)))
    {
      this.e.r();
      if (paramc.h())
      {
        new StringBuilder().append("Could not purchase call forwarding: ").append(paramc.i()).toString();
        this.e.c(2131493343);
        return true;
      }
      this.e.c(2131493344);
      this.e.a(ab.a());
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
    return "/Purchase_Call_Forwarding";
  }

  protected final String l()
  {
    return this.e.getString(2131493324);
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
    this.e.setTitle(2131493324);
  }

  public final void onClick(View paramView)
  {
    String str1;
    switch (paramView.getId())
    {
    default:
      this.e.c(2131493025);
      return;
    case 2131165624:
      a.a("purchase_enhancements", "item", "1month_call_forwarding");
      str1 = "callforwarding1month";
    case 2131165625:
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
        a.a("purchase_enhancements", "item", "1year_call_forwarding");
        str1 = "callforwarding1year";
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
    View localView = paramLayoutInflater.inflate(2130903169, null);
    this.b = ((Button)localView.findViewById(2131165624));
    Button localButton1 = this.b;
    MainActivity localMainActivity1 = this.e;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = localj.b("callforwarding1month", "$2.99");
    localButton1.setText(localMainActivity1.getString(2131493322, arrayOfObject1));
    this.b.setOnClickListener(this);
    this.g = ((Button)localView.findViewById(2131165625));
    Button localButton2 = this.g;
    MainActivity localMainActivity2 = this.e;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = localj.b("callforwarding1year", "$29.99");
    localButton2.setText(localMainActivity2.getString(2131493323, arrayOfObject2));
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
      localTextView2 = (TextView)localView.findViewById(2131165623);
      String str = this.a.L();
      if ((this.a.L() == null) || (b.a(this.a.t(), this.a.L())))
        break;
      localTextView2.setText(String.format(this.e.getResources().getString(2131493278), new Object[] { str }));
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
    localTextView2.setText(2131493273);
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.n.d
 * JD-Core Version:    0.6.2
 */