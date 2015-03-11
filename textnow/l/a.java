package textnow.l;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.ag;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView.Tokenizer;
import android.widget.Toast;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.activities.u;
import com.enflick.android.TextNow.activities.v;
import com.enflick.android.TextNow.activities.z;
import com.enflick.android.TextNow.tasks.AddGroupMemberTask;
import com.enflick.android.TextNow.tasks.c;
import com.enflick.android.TextNow.views.RecipientField;
import com.enflick.android.TextNow.views.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import textnow.k.g;
import textnow.m.b;
import textnow.u.d;

public final class a extends ao
  implements View.OnClickListener
{
  private String a;
  private RecipientField b;
  private MultiAutoCompleteTextView.Tokenizer g;
  private g h;
  private boolean i;

  public static a a(String paramString)
  {
    a locala = new a();
    Bundle localBundle = new Bundle();
    localBundle.putString("arg_contact_value", paramString);
    locala.setArguments(localBundle);
    return locala;
  }

  public final boolean B()
  {
    C();
    return super.B();
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    this.e.r();
    Class localClass = paramc.getClass();
    boolean bool = false;
    if (localClass == AddGroupMemberTask.class)
    {
      if ((!paramc.h()) || ("GROUP_MEMBER_EXISTS".equals(paramc.j())))
        break label55;
      this.e.c(2131493025);
    }
    while (true)
    {
      bool = true;
      return bool;
      label55: this.e.onBackPressed();
    }
  }

  protected final String k()
  {
    return "/Add_Group_Members";
  }

  protected final String l()
  {
    return this.e.getString(2131493409);
  }

  public final int m()
  {
    return 2131165537;
  }

  protected final boolean n()
  {
    return true;
  }

  public final void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131165489:
    }
    while (true)
    {
      return;
      List localList = u.a(this.b.getText()).a();
      if (localList == null)
      {
        Toast.makeText(this.e, 2131493137, 0).show();
        return;
      }
      if (localList.isEmpty())
      {
        Toast.makeText(this.e, 2131493137, 0).show();
        return;
      }
      HashMap localHashMap = new HashMap();
      Iterator localIterator1 = localList.iterator();
      int j = 0;
      while (localIterator1.hasNext())
      {
        d locald = (d)localIterator1.next();
        if (locald.b() == 3)
        {
          if (locald.a().toLowerCase(Locale.US).endsWith("@textnow.me"))
            localHashMap.put(locald.a().substring(0, locald.a().indexOf("@")), Integer.valueOf(1));
          else
            j++;
        }
        else if (locald.b() == 2)
          localHashMap.put(locald.a(), Integer.valueOf(2));
        else
          localHashMap.put(locald.a(), Integer.valueOf(1));
      }
      if (j != 0)
      {
        if (j == 1)
        {
          this.e.d(2131493430);
          return;
        }
        MainActivity localMainActivity = this.e;
        String str = this.e.getString(2131493429);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(j);
        localMainActivity.b(String.format(str, arrayOfObject));
        return;
      }
      if (!localHashMap.isEmpty())
      {
        this.e.a(2131493418, false);
        Iterator localIterator2 = localHashMap.entrySet().iterator();
        while (localIterator2.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator2.next();
          new AddGroupMemberTask(this.a, (String)localEntry.getKey(), String.valueOf(localEntry.getValue())).b(this.e);
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
    View localView = paramLayoutInflater.inflate(2130903124, null);
    this.b = ((RecipientField)localView.findViewById(2131165488));
    this.g = new k();
    this.h = new g(getActivity(), null);
    ListView localListView = (ListView)localView.findViewById(2131165490);
    this.b.a(new z(localListView, this.b, this.g, this.h));
    localListView.setAdapter(this.h);
    localListView.setOnItemClickListener(new com.enflick.android.TextNow.activities.a(localListView, this.b, this.g));
    localListView.setAdapter(this.h);
    getLoaderManager().a(0, null, new b(getActivity(), this.h));
    localView.findViewById(2131165489).setOnClickListener(this);
    this.i = true;
    return localView;
  }

  protected final IBinder x()
  {
    if (this.i)
      return this.b.getApplicationWindowToken();
    return super.x();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.l.a
 * JD-Core Version:    0.6.2
 */