package com.facebook;

class AppEventsLogger$EventSuppression
{
  private AppEventsLogger.SuppressionTimeoutBehavior behavior;
  private int timeoutPeriod;

  AppEventsLogger$EventSuppression(int paramInt, AppEventsLogger.SuppressionTimeoutBehavior paramSuppressionTimeoutBehavior)
  {
    this.timeoutPeriod = paramInt;
    this.behavior = paramSuppressionTimeoutBehavior;
  }

  AppEventsLogger.SuppressionTimeoutBehavior getBehavior()
  {
    return this.behavior;
  }

  int getTimeoutPeriod()
  {
    return this.timeoutPeriod;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.EventSuppression
 * JD-Core Version:    0.6.2
 */