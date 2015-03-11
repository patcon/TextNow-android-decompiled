package com.enflick.android.TextNow.activities;

import com.enflick.android.TextNow.tasks.c;
import java.util.List;

class MessageViewFragment$BatchMessageSenderTask extends c
{
  private c[] d;

  public MessageViewFragment$BatchMessageSenderTask(List<c> paramList)
  {
    this.d = ((c[])paramList.toArray(new c[paramList.size()]));
  }

  public void run()
  {
    c[] arrayOfc = this.d;
    int i = arrayOfc.length;
    for (int j = 0; j < i; j++)
      arrayOfc[j].c(g());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.MessageViewFragment.BatchMessageSenderTask
 * JD-Core Version:    0.6.2
 */