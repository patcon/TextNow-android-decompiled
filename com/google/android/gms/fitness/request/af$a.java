package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.data.Subscription;

public class af$a
{
  private Subscription US;
  private boolean UT = false;

  public a b(Subscription paramSubscription)
  {
    this.US = paramSubscription;
    return this;
  }

  public af jF()
  {
    if (this.US != null);
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "Must call setSubscription()");
      return new af(this, null);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.af.a
 * JD-Core Version:    0.6.2
 */