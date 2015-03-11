package cz.acrobits.libsoftphone.data;

public enum AudioRoute
{
  static
  {
    Headset = new AudioRoute("Headset", 1);
    Speaker = new AudioRoute("Speaker", 2);
    BluetoothSCO = new AudioRoute("BluetoothSCO", 3);
    BluetoothA2DP = new AudioRoute("BluetoothA2DP", 4);
    AudioRoute[] arrayOfAudioRoute = new AudioRoute[5];
    arrayOfAudioRoute[0] = Receiver;
    arrayOfAudioRoute[1] = Headset;
    arrayOfAudioRoute[2] = Speaker;
    arrayOfAudioRoute[3] = BluetoothSCO;
    arrayOfAudioRoute[4] = BluetoothA2DP;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.AudioRoute
 * JD-Core Version:    0.6.2
 */