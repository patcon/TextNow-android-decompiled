package textnow.s;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.PurchaseAdRemovalTask;
import com.enflick.android.TextNow.tasks.PurchaseBarnesTask;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.z.l;
import textnow.z.u;

public final class c extends av
  implements View.OnClickListener
{
  private u a;
  private Button b;
  private Button f;

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    paramc.j();
    paramc.h();
    paramc.i();
    if ((!paramBoolean) && ((localClass == PurchaseAdRemovalTask.class) || (localClass == PurchaseBarnesTask.class)))
    {
      this.d.v();
      if (paramc.h())
      {
        new StringBuilder().append("Could not purchase ad removal: ").append(paramc.i()).toString();
        this.d.b(2131296746);
        return true;
      }
      this.d.b(2131296747);
      this.d.D();
      return true;
    }
    if ((!paramBoolean) && (localClass == GetUserInfoTask.class))
    {
      this.d.v();
      return true;
    }
    return false;
  }

  public final String l()
  {
    return "/Purchase_Ad_Removal";
  }

  protected final String m()
  {
    return this.d.getString(2131296731);
  }

  public final int n()
  {
    return 2131558823;
  }

  protected final boolean o()
  {
    return true;
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.d.setTitle(2131296731);
  }

  public final void onClick(View paramView)
  {
    String str1;
    switch (paramView.getId())
    {
    default:
      this.d.b(2131296432);
      return;
    case 2131558921:
      com.enflick.android.TextNow.ads.b.a("purchase_enhancements", "item", "1month_ad_expiry");
      str1 = "adremoval1month";
    case 2131558922:
    }
    while (true)
    {
      new StringBuilder().append("buying: ").append(str1).toString();
      String str2 = this.a.b();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("username", str2);
        this.d.b(str1, localJSONObject.toString());
        return;
        com.enflick.android.TextNow.ads.b.a("purchase_enhancements", "item", "1year_ad_expiry");
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
    this.a = new u(this.d);
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    l locall = new l(this.d);
    View localView = paramLayoutInflater.inflate(2130903186, null);
    this.b = ((Button)localView.findViewById(2131558921));
    Button localButton1 = this.b;
    MainActivity localMainActivity1 = this.d;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = locall.b("adremoval1month", "$0.99");
    localButton1.setText(localMainActivity1.getString(2131296729, arrayOfObject1));
    this.b.setOnClickListener(this);
    this.f = ((Button)localView.findViewById(2131558922));
    Button localButton2 = this.f;
    MainActivity localMainActivity2 = this.d;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = locall.b("adremoval1year", "$5.99");
    localButton2.setText(localMainActivity2.getString(2131296730, arrayOfObject2));
    this.f.setOnClickListener(this);
    TextView localTextView1 = (TextView)localView.findViewById(2131558924);
    if (!this.d.n())
      if (this.d.o())
      {
        MainActivity localMainActivity5 = this.d;
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = this.d.getString(2131296737);
        localTextView1.setText(localMainActivity5.getString(2131296735, arrayOfObject5));
      }
    TextView localTextView2;
    while (true)
    {
      localTextView2 = (TextView)localView.findViewById(2131558920);
      String str = this.a.W();
      if ((this.a.W() == null) || (textnow.v.b.a(this.a.r(), this.a.W())))
        break;
      localTextView2.setText(String.format(this.d.getResources().getString(2131296689), new Object[] { str }));
      return localView;
      if (MainActivity.p())
      {
        MainActivity localMainActivity4 = this.d;
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = this.d.getString(2131296738);
        localTextView1.setText(localMainActivity4.getString(2131296735, arrayOfObject4));
      }
      else
      {
        MainActivity localMainActivity3 = this.d;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = this.d.getString(2131296736);
        localTextView1.setText(localMainActivity3.getString(2131296735, arrayOfObject3));
      }
    }
    localTextView2.setText(2131296733);
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.s.c
 * JD-Core Version:    0.6.2
 */