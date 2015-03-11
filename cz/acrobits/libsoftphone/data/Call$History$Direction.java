package cz.acrobits.libsoftphone.data;

public enum Call$History$Direction
{
  static
  {
    Incoming = new Direction("Incoming", 1);
    Outgoing = new Direction("Outgoing", 2);
    Direction[] arrayOfDirection = new Direction[3];
    arrayOfDirection[0] = Unknown;
    arrayOfDirection[1] = Incoming;
    arrayOfDirection[2] = Outgoing;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Call.History.Direction
 * JD-Core Version:    0.6.2
 */