package cz.acrobits.libsoftphone.data;

public enum Network
{
  static
  {
    ThreeG = new Network("ThreeG", 2);
    Network[] arrayOfNetwork = new Network[3];
    arrayOfNetwork[0] = NoneAvailable;
    arrayOfNetwork[1] = WiFi;
    arrayOfNetwork[2] = ThreeG;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Network
 * JD-Core Version:    0.6.2
 */