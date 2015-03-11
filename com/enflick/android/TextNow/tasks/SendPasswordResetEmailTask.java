package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.PasswordForgotPost;
import com.enflick.android.TextNow.api.f;

public class SendPasswordResetEmailTask extends c
{
  private String d;

  public SendPasswordResetEmailTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    f localf = new f(this.d);
    if (a(new PasswordForgotPost(this.a).runSync(localf)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SendPasswordResetEmailTask
 * JD-Core Version:    0.6.2
 */