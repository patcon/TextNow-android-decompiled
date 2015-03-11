package com.enflick.android.TextNow.tasks;

import android.content.ContentValues;
import android.content.Context;
import com.enflick.android.TextNow.api.users.GroupsPatchContactValue;
import com.enflick.android.TextNow.api.users.j;
import textnow.ac.a;
import textnow.ac.b;
import textnow.z.u;

public class UpdateGroupInfoTask extends c
{
  private String d;
  private String e;

  public UpdateGroupInfoTask(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
  }

  public void run()
  {
    j localj = new j(new u(this.a).b(), this.d, this.e);
    if (a(new GroupsPatchContactValue(this.a).runSync(localj)))
      return;
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("title", this.e);
    b.a(this.a.getContentResolver(), this.d, localContentValues);
    a.a(this.a.getContentResolver(), this.d, this.e);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.UpdateGroupInfoTask
 * JD-Core Version:    0.6.2
 */