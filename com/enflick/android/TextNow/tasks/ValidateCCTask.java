package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.users.activation.ValidateCC;
import textnow.z.u;

public class ValidateCCTask extends c
{
  private String d;

  public ValidateCCTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    com.enflick.android.TextNow.api.users.activation.c localc = new com.enflick.android.TextNow.api.users.activation.c(new u(this.a).b(), this.d);
    if (a(new ValidateCC(this.a).runSync(localc)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.ValidateCCTask
 * JD-Core Version:    0.6.2
 */