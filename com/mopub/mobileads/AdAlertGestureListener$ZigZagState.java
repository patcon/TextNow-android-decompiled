package com.mopub.mobileads;

 enum AdAlertGestureListener$ZigZagState
{
  static
  {
    GOING_RIGHT = new ZigZagState("GOING_RIGHT", 1);
    GOING_LEFT = new ZigZagState("GOING_LEFT", 2);
    FINISHED = new ZigZagState("FINISHED", 3);
    FAILED = new ZigZagState("FAILED", 4);
    ZigZagState[] arrayOfZigZagState = new ZigZagState[5];
    arrayOfZigZagState[0] = UNSET;
    arrayOfZigZagState[1] = GOING_RIGHT;
    arrayOfZigZagState[2] = GOING_LEFT;
    arrayOfZigZagState[3] = FINISHED;
    arrayOfZigZagState[4] = FAILED;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdAlertGestureListener.ZigZagState
 * JD-Core Version:    0.6.2
 */