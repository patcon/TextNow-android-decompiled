package cz.acrobits.libsoftphone.data;

public enum CameraInfo$Rotation
{
  static
  {
    Rotate_0 = new Rotation("Rotate_0", 1);
    Rotate_90 = new Rotation("Rotate_90", 2);
    Rotate_180 = new Rotation("Rotate_180", 3);
    Rotate_270 = new Rotation("Rotate_270", 4);
    Rotation[] arrayOfRotation = new Rotation[5];
    arrayOfRotation[0] = Unknown;
    arrayOfRotation[1] = Rotate_0;
    arrayOfRotation[2] = Rotate_90;
    arrayOfRotation[3] = Rotate_180;
    arrayOfRotation[4] = Rotate_270;
  }

  public static native Rotation fromDegrees(int paramInt);

  public final native int toDegrees();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.CameraInfo.Rotation
 * JD-Core Version:    0.6.2
 */