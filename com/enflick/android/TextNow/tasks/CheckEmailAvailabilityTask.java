package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.EmailsHead;
import com.enflick.android.TextNow.api.b;

public class CheckEmailAvailabilityTask extends c
{
  private String d;

  public CheckEmailAvailabilityTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    b localb = new b(this.d);
    if (a(new EmailsHead(this.a).runSync(localb)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.CheckEmailAvailabilityTask
 * JD-Core Version:    0.6.2
 */