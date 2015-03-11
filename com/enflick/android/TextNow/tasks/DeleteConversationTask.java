package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.ConversationsDelete;
import com.enflick.android.TextNow.api.users.e;
import textnow.u.r;

public class DeleteConversationTask extends c
{
  private String d;

  public DeleteConversationTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    e locale = new e(new r(this.a).b(), this.d);
    if (a(new ConversationsDelete(this.a).runSync(locale)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.DeleteConversationTask
 * JD-Core Version:    0.6.2
 */