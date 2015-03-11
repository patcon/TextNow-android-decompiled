package cz.acrobits.video;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;

public class CameraCallback
  implements Camera.PreviewCallback
{
  private long mSession;

  public CameraCallback(long paramLong)
  {
    this.mSession = paramLong;
  }

  public native void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.video.CameraCallback
 * JD-Core Version:    0.6.2
 */