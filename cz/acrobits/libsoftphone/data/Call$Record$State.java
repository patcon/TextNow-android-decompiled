package cz.acrobits.libsoftphone.data;

public enum Call$Record$State
{
  static
  {
    Paused = new State("Paused", 2);
    State[] arrayOfState = new State[3];
    arrayOfState[0] = Initial;
    arrayOfState[1] = Recording;
    arrayOfState[2] = Paused;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Call.Record.State
 * JD-Core Version:    0.6.2
 */