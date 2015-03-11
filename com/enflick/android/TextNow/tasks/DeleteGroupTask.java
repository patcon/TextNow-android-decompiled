package com.enflick.android.TextNow.tasks;

import android.content.Context;
import com.enflick.android.TextNow.api.users.GroupsDeleteContactValue;
import com.enflick.android.TextNow.api.users.g;
import textnow.ac.b;
import textnow.z.u;

public class DeleteGroupTask extends c
{
  private String d;

  public DeleteGroupTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    g localg = new g(new u(this.a).b(), this.d);
    if (a(new GroupsDeleteContactValue(this.a).runSync(localg)))
      return;
    b.c(this.a.getContentResolver(), this.d);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.DeleteGroupTask
 * JD-Core Version:    0.6.2
 */