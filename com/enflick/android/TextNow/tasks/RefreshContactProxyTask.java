package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.enflick.android.TextNow.api.responsemodel.ContactProxy;
import com.enflick.android.TextNow.api.users.ContactProxyNumberGet;
import com.enflick.android.TextNow.persistence.contentproviders.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import textnow.v.b;
import textnow.x.i;
import textnow.z.n;

public class RefreshContactProxyTask extends c
{
  private String d;

  public RefreshContactProxyTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    Cursor localCursor1 = this.a.getContentResolver().query(h.d, new String[] { "contact_value", "update_date" }, null, null, null);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    if (localCursor1 != null)
      try
      {
        if (localCursor1.moveToNext())
          localHashMap.put(localCursor1.getString(0), Long.valueOf(localCursor1.getLong(1)));
      }
      finally
      {
        localCursor1.close();
      }
    Cursor localCursor2 = this.a.getContentResolver().query(com.enflick.android.TextNow.persistence.contentproviders.d.d, new String[] { "contact_value", "contact_type" }, "contact_type=2 OR contact_type=1 OR contact_type=3", null, "latest_message_date DESC LIMIT 50");
    if (localCursor2 != null);
    while (true)
    {
      String str2;
      try
      {
        if (localCursor2.moveToNext())
        {
          str2 = localCursor2.getString(0);
          int i = localCursor2.getInt(1);
          if ((i == 3) && (!str2.endsWith("@textnow.me")))
            continue;
          if (i != 2)
            break label423;
          str2 = b.b(str2);
          if (str2 == null)
            break label423;
          str3 = "+1" + str2;
          long l = System.currentTimeMillis();
          if ((localHashMap.containsKey(str3)) && (l - ((Long)localHashMap.get(str3)).longValue() <= 604800000L))
            continue;
          localArrayList.add(str3);
          continue;
        }
      }
      finally
      {
        localCursor2.close();
      }
      localCursor2.close();
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        com.enflick.android.TextNow.api.users.d locald = new com.enflick.android.TextNow.api.users.d(this.d, str1);
        i locali = new ContactProxyNumberGet(this.a).runSync(locald);
        if (a(locali))
        {
          new StringBuilder().append("fail to get proxy number for ").append(str1).toString();
        }
        else
        {
          ContactProxy localContactProxy = (ContactProxy)locali.c();
          if (localContactProxy != null)
            n.a(this.a.getContentResolver(), str1, localContactProxy.proxyNumber);
        }
      }
      return;
      label423: String str3 = str2;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.RefreshContactProxyTask
 * JD-Core Version:    0.6.2
 */