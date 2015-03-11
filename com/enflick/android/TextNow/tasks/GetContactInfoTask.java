package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.ContactsGet;
import com.enflick.android.TextNow.api.a;
import java.util.HashMap;
import textnow.s.i;

public class GetContactInfoTask extends c
{
  private String d;
  private int e = 0;

  public GetContactInfoTask(String paramString)
  {
    this.d = paramString;
  }

  public final boolean a()
  {
    return this.e == 1;
  }

  public final String b()
  {
    return this.d;
  }

  protected final boolean d_()
  {
    return true;
  }

  public void run()
  {
    a locala = new a(this.d);
    i locali = new ContactsGet(this.a).runSync(locala);
    if (a(locali));
    HashMap localHashMap;
    do
    {
      return;
      localHashMap = (HashMap)locali.c();
    }
    while ((localHashMap == null) || (!this.d.equals(String.valueOf(localHashMap.get("contact_value")))) || (localHashMap.get("network_type") == null));
    this.e = ((Integer)localHashMap.get("network_type")).intValue();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetContactInfoTask
 * JD-Core Version:    0.6.2
 */