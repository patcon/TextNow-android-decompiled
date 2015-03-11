package cz.acrobits.libsoftphone.data;

public enum SecurityStatus$State
{
  static
  {
    KeyExchange = new State("KeyExchange", 1);
    Encrypted = new State("Encrypted", 2);
    State[] arrayOfState = new State[3];
    arrayOfState[0] = Unencrypted;
    arrayOfState[1] = KeyExchange;
    arrayOfState[2] = Encrypted;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.SecurityStatus.State
 * JD-Core Version:    0.6.2
 */