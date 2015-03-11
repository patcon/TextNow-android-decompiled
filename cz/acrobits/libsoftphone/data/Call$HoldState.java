package cz.acrobits.libsoftphone.data;

public enum Call$HoldState
{
  static
  {
    Active = new HoldState("Active", 1);
    Pending = new HoldState("Pending", 2);
    Held = new HoldState("Held", 3);
    HoldState[] arrayOfHoldState = new HoldState[4];
    arrayOfHoldState[0] = None;
    arrayOfHoldState[1] = Active;
    arrayOfHoldState[2] = Pending;
    arrayOfHoldState[3] = Held;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Call.HoldState
 * JD-Core Version:    0.6.2
 */