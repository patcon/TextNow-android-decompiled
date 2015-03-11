package textnow.n;

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
import com.enflick.android.TextNow.tasks.PurchaseBarnesTask;
import com.enflick.android.TextNow.tasks.PurchaseCreditsTask;
import com.enflick.android.TextNow.tasks.c;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.q.ad;
import textnow.u.j;
import textnow.u.r;

public final class e extends ao
  implements View.OnClickListener
{
  private Button a;
  private Button b;
  private Button g;

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    paramc.j();
    paramc.h();
    paramc.i();
    if ((!paramBoolean) && ((localClass == PurchaseCreditsTask.class) || (localClass == PurchaseBarnesTask.class)))
    {
      if (paramc.h())
      {
        this.e.r();
        new StringBuilder().append("crediting user credits failed: ").append(paramc.i()).toString();
        this.e.c(2131493343);
        return true;
      }
      this.e.c(2131493344);
      new GetUserInfoTask(this.c.b()).b(this.e);
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
    return "/Purchase_Credits";
  }

  public final String l()
  {
    if (ad.b(this.e))
      return null;
    return this.e.getString(2131493314);
  }

  public final int m()
  {
    return 2131165539;
  }

  public final boolean n()
  {
    return true;
  }

  public final void onClick(View paramView)
  {
    String str1 = "";
    switch (paramView.getId())
    {
    default:
    case 2131165628:
    case 2131165629:
    case 2131165630:
    }
    while (true)
    {
      new StringBuilder().append("buying: ").append(str1).toString();
      String str2 = new r(this.e).b();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("username", str2);
        this.e.b(str1, localJSONObject.toString());
        return;
        a.a("purchase_enhancements", "item", "100credits");
        str1 = "100credits";
        continue;
        a.a("purchase_enhancements", "item", "200credits");
        str1 = "200credits";
        continue;
        a.a("purchase_enhancements", "item", "500credits");
        str1 = "500credits";
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
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    j localj = new j(this.e);
    View localView = paramLayoutInflater.inflate(2130903170, null);
    this.a = ((Button)localView.findViewById(2131165628));
    Button localButton1 = this.a;
    MainActivity localMainActivity1 = this.e;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = localj.b("100credits", "$1.99");
    localButton1.setText(localMainActivity1.getString(2131493319, arrayOfObject1));
    this.a.setOnClickListener(this);
    this.b = ((Button)localView.findViewById(2131165629));
    Button localButton2 = this.b;
    MainActivity localMainActivity2 = this.e;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = localj.b("200credits", "$2.99");
    localButton2.setText(localMainActivity2.getString(2131493320, arrayOfObject2));
    this.b.setOnClickListener(this);
    this.g = ((Button)localView.findViewById(2131165630));
    Button localButton3 = this.g;
    MainActivity localMainActivity3 = this.e;
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = localj.b("500credits", "$6.99");
    localButton3.setText(localMainActivity3.getString(2131493321, arrayOfObject3));
    this.g.setOnClickListener(this);
    TextView localTextView = (TextView)localView.findViewById(2131165622);
    if (!this.e.l())
    {
      if (this.e.m())
      {
        MainActivity localMainActivity6 = this.e;
        Object[] arrayOfObject6 = new Object[1];
        arrayOfObject6[0] = this.e.getString(2131493334);
        localTextView.setText(localMainActivity6.getString(2131493332, arrayOfObject6));
        return localView;
      }
      if (MainActivity.n())
      {
        MainActivity localMainActivity5 = this.e;
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = this.e.getString(2131493335);
        localTextView.setText(localMainActivity5.getString(2131493332, arrayOfObject5));
        return localView;
      }
    }
    MainActivity localMainActivity4 = this.e;
    Object[] arrayOfObject4 = new Object[1];
    arrayOfObject4[0] = this.e.getString(2131493333);
    localTextView.setText(localMainActivity4.getString(2131493332, arrayOfObject4));
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.n.e
 * JD-Core Version:    0.6.2
 */