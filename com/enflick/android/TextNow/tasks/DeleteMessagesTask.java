package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.MessagesDelete;
import com.enflick.android.TextNow.api.users.m;
import textnow.u.r;

public class DeleteMessagesTask extends c
{
  private String d;

  public DeleteMessagesTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    m localm = new m(new r(this.a).b(), this.d);
    if (a(new MessagesDelete(this.a).runSync(localm)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.DeleteMessagesTask
 * JD-Core Version:    0.6.2
 */