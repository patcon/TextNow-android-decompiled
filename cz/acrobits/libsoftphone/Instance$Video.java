package cz.acrobits.libsoftphone;

import cz.acrobits.libsoftphone.data.CameraInfo;

public class Instance$Video
{
  public static native CameraInfo[] enumerateCameras();

  public static native CameraInfo getCurrentCamera();

  public static native boolean switchCamera(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.Video
 * JD-Core Version:    0.6.2
 */