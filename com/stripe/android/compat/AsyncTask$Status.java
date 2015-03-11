package com.stripe.android.compat;

public enum AsyncTask$Status
{
  static
  {
    FINISHED = new Status("FINISHED", 2);
    Status[] arrayOfStatus = new Status[3];
    arrayOfStatus[0] = PENDING;
    arrayOfStatus[1] = RUNNING;
    arrayOfStatus[2] = FINISHED;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.android.compat.AsyncTask.Status
 * JD-Core Version:    0.6.2
 */