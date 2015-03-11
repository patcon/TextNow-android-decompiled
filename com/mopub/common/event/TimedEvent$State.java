package com.mopub.common.event;

 enum TimedEvent$State
{
  static
  {
    STOPPED = new State("STOPPED", 1);
    CANCELLED = new State("CANCELLED", 2);
    State[] arrayOfState = new State[3];
    arrayOfState[0] = WAITING;
    arrayOfState[1] = STOPPED;
    arrayOfState[2] = CANCELLED;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.event.TimedEvent.State
 * JD-Core Version:    0.6.2
 */