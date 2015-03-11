package textnow.q;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView.Tokenizer;
import android.widget.Toast;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.aa;
import com.enflick.android.TextNow.activities.ab;
import com.enflick.android.TextNow.activities.af;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.tasks.AddGroupMemberTask;
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.RecipientField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import textnow.z.f;

public final class a extends av
  implements View.OnClickListener
{
  private String a;
  private RecipientField b;
  private MultiAutoCompleteTextView.Tokenizer f;
  private textnow.p.l g;
  private boolean h;

  public static a a(String paramString)
  {
    a locala = new a();
    Bundle localBundle = new Bundle();
    localBundle.putString("arg_contact_value", paramString);
    locala.setArguments(localBundle);
    return locala;
  }

  public final boolean C()
  {
    e();
    return super.C();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    this.d.v();
    Class localClass = paramc.getClass();
    boolean bool = false;
    if (localClass == AddGroupMemberTask.class)
    {
      if ((!paramc.h()) || ("GROUP_MEMBER_EXISTS".equals(paramc.j())))
        break label55;
      this.d.b(2131296432);
    }
    while (true)
    {
      bool = true;
      return bool;
      label55: this.d.onBackPressed();
    }
  }

  protected final String l()
  {
    return "/Add_Group_Members";
  }

  protected final String m()
  {
    return this.d.getString(2131296806);
  }

  public final int n()
  {
    return 2131558814;
  }

  protected final boolean o()
  {
    return true;
  }

  public final void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131558760:
    }
    while (true)
    {
      return;
      List localList = aa.a(this.b.getText()).a();
      if (localList == null)
      {
        Toast.makeText(this.d, 2131296549, 0).show();
        return;
      }
      if (localList.isEmpty())
      {
        Toast.makeText(this.d, 2131296549, 0).show();
        return;
      }
      HashMap localHashMap = new HashMap();
      Iterator localIterator1 = localList.iterator();
      int i = 0;
      while (localIterator1.hasNext())
      {
        f localf = (f)localIterator1.next();
        if (localf.b() == 3)
        {
          if (localf.a().toLowerCase(Locale.US).endsWith("@textnow.me"))
            localHashMap.put(localf.a().substring(0, localf.a().indexOf("@")), Integer.valueOf(1));
          else
            i++;
        }
        else if (localf.b() == 2)
          localHashMap.put(localf.a(), Integer.valueOf(2));
        else
          localHashMap.put(localf.a(), Integer.valueOf(1));
      }
      if (i != 0)
      {
        if (i == 1)
        {
          this.d.c(2131296822);
          return;
        }
        MainActivity localMainActivity = this.d;
        String str = this.d.getString(2131296821);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i);
        localMainActivity.b(String.format(str, arrayOfObject));
        return;
      }
      if (!localHashMap.isEmpty())
      {
        this.d.a(2131296815, false);
        Iterator localIterator2 = localHashMap.entrySet().iterator();
        while (localIterator2.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator2.next();
          new AddGroupMemberTask(this.a, (String)localEntry.getKey(), String.valueOf(localEntry.getValue())).b(this.d);
        }
      }
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getArguments().getString("arg_contact_value");
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903138, null);
    this.b = ((RecipientField)localView.findViewById(2131558759));
    this.f = new com.enflick.android.TextNow.views.l();
    this.g = new textnow.p.l(getActivity(), null);
    ListView localListView = (ListView)localView.findViewById(2131558761);
    this.b.a(new af(localListView, this.b, this.f, this.g));
    localListView.setAdapter(this.g);
    localListView.setOnItemClickListener(new com.enflick.android.TextNow.activities.b(localListView, this.b, this.f));
    localListView.setAdapter(this.g);
    getLoaderManager().a(0, null, new textnow.r.b(getActivity(), this.g));
    localView.findViewById(2131558760).setOnClickListener(this);
    this.h = true;
    return localView;
  }

  protected final IBinder y()
  {
    if (this.h)
      return this.b.getApplicationWindowToken();
    return super.y();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.q.a
 * JD-Core Version:    0.6.2
 */