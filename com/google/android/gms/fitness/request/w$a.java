package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.Session;
import java.util.concurrent.TimeUnit;

public class w$a
{
  private Session St;

  public a b(Session paramSession)
  {
    if (paramSession.getEndTime(TimeUnit.MILLISECONDS) == 0L);
    for (boolean bool = true; ; bool = false)
    {
      o.b(bool, "Cannot start a session which has already ended");
      this.St = paramSession;
      return this;
    }
  }

  public w jA()
  {
    return new w(this, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.w.a
 * JD-Core Version:    0.6.2
 */