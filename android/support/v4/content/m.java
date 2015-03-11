package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class m
{
  private static final Object f = new Object();
  private static m g;
  private final Context a;
  private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> b = new HashMap();
  private final HashMap<String, ArrayList<o>> c = new HashMap();
  private final ArrayList<n> d = new ArrayList();
  private final Handler e;

  private m(Context paramContext)
  {
    this.a = paramContext;
    this.e = new Handler(paramContext.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        switch (paramAnonymousMessage.what)
        {
        default:
          super.handleMessage(paramAnonymousMessage);
          return;
        case 1:
        }
        m.a(m.this);
      }
    };
  }

  public static m a(Context paramContext)
  {
    synchronized (f)
    {
      if (g == null)
        g = new m(paramContext.getApplicationContext());
      m localm = g;
      return localm;
    }
  }

  public final void a(BroadcastReceiver paramBroadcastReceiver)
  {
    while (true)
    {
      int j;
      synchronized (this.b)
      {
        ArrayList localArrayList1 = (ArrayList)this.b.remove(paramBroadcastReceiver);
        if (localArrayList1 != null)
          break label174;
        return;
        if (i < localArrayList1.size())
        {
          IntentFilter localIntentFilter = (IntentFilter)localArrayList1.get(i);
          j = 0;
          if (j >= localIntentFilter.countActions())
            break label195;
          String str = localIntentFilter.getAction(j);
          ArrayList localArrayList2 = (ArrayList)this.c.get(str);
          if (localArrayList2 == null)
            break label189;
          k = 0;
          if (k < localArrayList2.size())
          {
            if (((o)localArrayList2.get(k)).b == paramBroadcastReceiver)
            {
              localArrayList2.remove(k);
              m = k - 1;
              break label180;
            }
          }
          else
          {
            if (localArrayList2.size() > 0)
              break label189;
            this.c.remove(str);
            break label189;
          }
        }
        else
        {
          return;
        }
      }
      int m = k;
      break label180;
      label174: int i = 0;
      continue;
      label180: int k = m + 1;
      continue;
      label189: j++;
      continue;
      label195: i++;
    }
  }

  public final void a(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    synchronized (this.b)
    {
      o localo = new o(paramIntentFilter, paramBroadcastReceiver);
      ArrayList localArrayList1 = (ArrayList)this.b.get(paramBroadcastReceiver);
      if (localArrayList1 == null)
      {
        localArrayList1 = new ArrayList(1);
        this.b.put(paramBroadcastReceiver, localArrayList1);
      }
      localArrayList1.add(paramIntentFilter);
      for (int i = 0; i < paramIntentFilter.countActions(); i++)
      {
        String str = paramIntentFilter.getAction(i);
        ArrayList localArrayList2 = (ArrayList)this.c.get(str);
        if (localArrayList2 == null)
        {
          localArrayList2 = new ArrayList(1);
          this.c.put(str, localArrayList2);
        }
        localArrayList2.add(localo);
      }
      return;
    }
  }

  public final boolean a(Intent paramIntent)
  {
    int i;
    label152: int j;
    Object localObject2;
    Object localObject3;
    int m;
    synchronized (this.b)
    {
      String str1 = paramIntent.getAction();
      String str2 = paramIntent.resolveTypeIfNeeded(this.a.getContentResolver());
      Uri localUri = paramIntent.getData();
      String str3 = paramIntent.getScheme();
      Set localSet = paramIntent.getCategories();
      if ((0x8 & paramIntent.getFlags()) == 0)
        break label482;
      i = 1;
      if (i != 0)
        new StringBuilder().append("Resolving type ").append(str2).append(" scheme ").append(str3).append(" of intent ").append(paramIntent).toString();
      ArrayList localArrayList = (ArrayList)this.c.get(paramIntent.getAction());
      if (localArrayList == null)
        break label452;
      if (i == 0)
        break label463;
      new StringBuilder().append("Action list: ").append(localArrayList).toString();
      break label463;
      if (j >= localArrayList.size())
        break label523;
      o localo = (o)localArrayList.get(j);
      if (i != 0)
        new StringBuilder().append("Matching against filter ").append(localo.a).toString();
      if (localo.c)
      {
        if (i == 0)
          break label488;
        localObject3 = localObject2;
      }
      else
      {
        m = localo.a.match(str1, str2, str3, localUri, localSet, "LocalBroadcastManager");
        if (m >= 0)
        {
          if (i != 0)
            new StringBuilder().append("  Filter matched!  match=0x").append(Integer.toHexString(m)).toString();
          if (localObject2 != null)
            break label456;
          localObject3 = new ArrayList();
          label293: ((ArrayList)localObject3).add(localo);
          localo.c = true;
        }
      }
    }
    String str4;
    if (i != 0)
      switch (m)
      {
      default:
        str4 = "unknown reason";
        label356: new StringBuilder().append("  Filter did not match: ").append(str4).toString();
        break;
      case -3:
      case -4:
      case -2:
      case -1:
      }
    while (true)
    {
      int k;
      if (k < ((ArrayList)localObject2).size())
      {
        ((o)((ArrayList)localObject2).get(k)).c = false;
        k++;
      }
      else
      {
        this.d.add(new n(paramIntent, (ArrayList)localObject2));
        if (!this.e.hasMessages(1))
          this.e.sendEmptyMessage(1);
        return true;
        label452: label456: label463: label482: label488: 
        do
        {
          return false;
          localObject3 = localObject2;
          break label293;
          localObject2 = null;
          j = 0;
          break label152;
          while (true)
          {
            j++;
            localObject2 = localObject3;
            break label152;
            i = 0;
            break;
            localObject3 = localObject2;
          }
          str4 = "action";
          break label356;
          str4 = "category";
          break label356;
          str4 = "data";
          break label356;
          str4 = "type";
          break label356;
        }
        while (localObject2 == null);
        label523: k = 0;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.content.m
 * JD-Core Version:    0.6.2
 */