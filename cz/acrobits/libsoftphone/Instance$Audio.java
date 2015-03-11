package cz.acrobits.libsoftphone;

import cz.acrobits.libsoftphone.data.AudioRoute;

public final class Instance$Audio
{
  public static native void dtmfOff();

  public static void dtmfOn(byte paramByte)
  {
    dtmfOn(paramByte, true);
  }

  public static native void dtmfOn(byte paramByte, boolean paramBoolean);

  public static native AudioRoute getAudioRoute();

  public static native AudioRoute[] getAvailableCallAudioRoutes();

  public static native AudioRoute getCallAudioRoute();

  public static native boolean isDeviceMuted();

  public static native boolean isMute();

  public static native void setCallAudioRoute(AudioRoute paramAudioRoute);

  public static native void setMute(boolean paramBoolean);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.Audio
 * JD-Core Version:    0.6.2
 */