package com.enflick.android.TextNow.tasks;

import android.content.Context;
import com.enflick.android.TextNow.api.users.GroupsDeleteContactValue;
import com.enflick.android.TextNow.api.users.g;
import textnow.u.r;
import textnow.w.b;

public class DeleteGroupTask extends c
{
  private String d;

  public DeleteGroupTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    g localg = new g(new r(this.a).b(), this.d);
    if (a(new GroupsDeleteContactValue(this.a).runSync(localg)))
      return;
    b.c(this.a.getContentResolver(), this.d);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.DeleteGroupTask
 * JD-Core Version:    0.6.2
 */