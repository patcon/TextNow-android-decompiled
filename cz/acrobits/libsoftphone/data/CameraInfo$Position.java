package cz.acrobits.libsoftphone.data;

public enum CameraInfo$Position
{
  static
  {
    Front = new Position("Front", 1);
    Back = new Position("Back", 2);
    Virtual = new Position("Virtual", 3);
    Position[] arrayOfPosition = new Position[4];
    arrayOfPosition[0] = Unknown;
    arrayOfPosition[1] = Front;
    arrayOfPosition[2] = Back;
    arrayOfPosition[3] = Virtual;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.CameraInfo.Position
 * JD-Core Version:    0.6.2
 */