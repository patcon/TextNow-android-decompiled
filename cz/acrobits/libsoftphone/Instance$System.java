package cz.acrobits.libsoftphone;

import cz.acrobits.libsoftphone.data.CodecInfo;
import cz.acrobits.libsoftphone.data.Network;

public final class Instance$System
{
  public static native void applicationDidBecomeActive();

  public static native void applicationDidEnterBackground();

  public static native void applicationWillEnterForeground();

  public static native void applicationWillResignActive();

  public static native void applicationWillTerminate();

  public static native boolean canApplicationTerminate();

  public static native String getApplicationBuild();

  public static native String getApplicationId();

  public static native String getApplicationName();

  public static native String getApplicationVersion();

  public static native CodecInfo[] getAudioCodecs();

  public static native String getCpuVersion();

  public static native Network getCurrentNetworkType();

  public static native String getImei();

  public static native String getUniqueId();

  public static native CodecInfo[] getVideoCodecs();

  public static native boolean isApplicationActive();

  public static native boolean isApplicationInBackground();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.System
 * JD-Core Version:    0.6.2
 */