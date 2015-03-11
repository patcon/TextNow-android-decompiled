package textnow.s;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.ads.b;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.PurchaseBarnesTask;
import com.enflick.android.TextNow.tasks.PurchaseCreditsTask;
import com.enflick.android.TextNow.tasks.c;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.v.z;
import textnow.z.l;
import textnow.z.u;

public final class e extends av
  implements View.OnClickListener
{
  private Button a;
  private Button b;
  private Button f;

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
        this.d.v();
        new StringBuilder().append("crediting user credits failed: ").append(paramc.i()).toString();
        this.d.b(2131296746);
        return true;
      }
      this.d.b(2131296747);
      new GetUserInfoTask(this.c.b()).b(this.d);
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
    return "/Purchase_Credits";
  }

  public final String m()
  {
    if (z.d(this.d))
      return null;
    return this.d.getString(2131296717);
  }

  public final int n()
  {
    return 2131558823;
  }

  public final boolean o()
  {
    return true;
  }

  public final void onClick(View paramView)
  {
    String str1 = "";
    switch (paramView.getId())
    {
    default:
    case 2131558930:
    case 2131558931:
    case 2131558932:
    }
    while (true)
    {
      new StringBuilder().append("buying: ").append(str1).toString();
      String str2 = new u(this.d).b();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("username", str2);
        this.d.b(str1, localJSONObject.toString());
        return;
        b.a("purchase_enhancements", "item", "100credits");
        str1 = "100credits";
        continue;
        b.a("purchase_enhancements", "item", "200credits");
        str1 = "200credits";
        continue;
        b.a("purchase_enhancements", "item", "500credits");
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
    l locall = new l(this.d);
    View localView = paramLayoutInflater.inflate(2130903188, null);
    this.a = ((Button)localView.findViewById(2131558930));
    Button localButton1 = this.a;
    MainActivity localMainActivity1 = this.d;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = locall.b("100credits", "$1.99");
    localButton1.setText(localMainActivity1.getString(2131296722, arrayOfObject1));
    this.a.setOnClickListener(this);
    this.b = ((Button)localView.findViewById(2131558931));
    Button localButton2 = this.b;
    MainActivity localMainActivity2 = this.d;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = locall.b("200credits", "$2.99");
    localButton2.setText(localMainActivity2.getString(2131296723, arrayOfObject2));
    this.b.setOnClickListener(this);
    this.f = ((Button)localView.findViewById(2131558932));
    Button localButton3 = this.f;
    MainActivity localMainActivity3 = this.d;
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = locall.b("500credits", "$6.99");
    localButton3.setText(localMainActivity3.getString(2131296724, arrayOfObject3));
    this.f.setOnClickListener(this);
    TextView localTextView = (TextView)localView.findViewById(2131558924);
    if (!this.d.n())
    {
      if (this.d.o())
      {
        MainActivity localMainActivity6 = this.d;
        Object[] arrayOfObject6 = new Object[1];
        arrayOfObject6[0] = this.d.getString(2131296737);
        localTextView.setText(localMainActivity6.getString(2131296735, arrayOfObject6));
        return localView;
      }
      if (MainActivity.p())
      {
        MainActivity localMainActivity5 = this.d;
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = this.d.getString(2131296738);
        localTextView.setText(localMainActivity5.getString(2131296735, arrayOfObject5));
        return localView;
      }
    }
    MainActivity localMainActivity4 = this.d;
    Object[] arrayOfObject4 = new Object[1];
    arrayOfObject4[0] = this.d.getString(2131296736);
    localTextView.setText(localMainActivity4.getString(2131296735, arrayOfObject4));
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.s.e
 * JD-Core Version:    0.6.2
 */