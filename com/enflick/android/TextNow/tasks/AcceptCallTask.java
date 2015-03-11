package com.enflick.android.TextNow.tasks;

import com.enflick.android.TextNow.api.calls.CallsAcceptCallPost;
import com.enflick.android.TextNow.api.calls.a;

public class AcceptCallTask extends c
{
  private String d;
  private boolean e;

  public AcceptCallTask(String paramString, boolean paramBoolean)
  {
    this.d = paramString;
    this.e = paramBoolean;
  }

  public void run()
  {
    a locala = new a(this.d, this.e);
    new CallsAcceptCallPost(this.a).runSync(locala);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.AcceptCallTask
 * JD-Core Version:    0.6.2
 */