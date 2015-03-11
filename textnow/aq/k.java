package textnow.aq;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class k
  implements LocationListener
{
  static final String b = k.class.getName();
  Location a = null;

  public final Location a()
  {
    if (this.a != null)
      return new Location(this.a);
    return null;
  }

  public void onLocationChanged(Location paramLocation)
  {
    boolean bool1 = true;
    new StringBuilder("onLocationChanged() : ").append(paramLocation.getProvider()).append(":").append(paramLocation.getLatitude()).append(":").append(paramLocation.getLongitude()).append(":").append(paramLocation.getAccuracy());
    Location localLocation = this.a;
    if (localLocation == null);
    label157: label289: 
    while (true)
    {
      if (bool1)
        this.a = paramLocation;
      return;
      long l = paramLocation.getTime() - localLocation.getTime();
      int i;
      label104: int j;
      label116: int k;
      label126: int n;
      int i1;
      label165: int i2;
      label176: String str1;
      String str2;
      boolean bool2;
      if (l > 120000L)
      {
        i = bool1;
        if (l >= -120000L)
          break label243;
        j = bool1;
        if (l <= 0L)
          break label249;
        k = bool1;
        if (i != 0)
          break label253;
        if (j == 0)
        {
          int m = (int)(paramLocation.getAccuracy() - localLocation.getAccuracy());
          if (m <= 0)
            break label255;
          n = bool1;
          if (m >= 0)
            break label261;
          i1 = bool1;
          if (m <= 200)
            break label267;
          i2 = bool1;
          str1 = paramLocation.getProvider();
          str2 = localLocation.getProvider();
          if (str1 != null)
            break label279;
          if (str2 != null)
            break label273;
          bool2 = bool1;
        }
      }
      while (true)
      {
        if ((i1 != 0) || ((k != 0) && (n == 0)) || ((k != 0) && (i2 == 0) && (bool2)))
          break label289;
        bool1 = false;
        break;
        i = 0;
        break label104;
        label243: j = 0;
        break label116;
        label249: k = 0;
        break label126;
        label253: break;
        label255: n = 0;
        break label157;
        i1 = 0;
        break label165;
        i2 = 0;
        break label176;
        bool2 = false;
        continue;
        bool2 = str1.equals(str2);
      }
    }
  }

  public void onProviderDisabled(String paramString)
  {
    new StringBuilder("onProviderDisabled: ").append(paramString);
  }

  public void onProviderEnabled(String paramString)
  {
    new StringBuilder("onProviderEnabled: ").append(paramString);
  }

  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
    StringBuilder localStringBuilder = new StringBuilder("onStatusChanged: ").append(paramString).append(" status: ");
    String str;
    if (paramInt == 2)
      str = "available ";
    while (true)
    {
      localStringBuilder.append(str);
      return;
      if (paramInt == 1)
        str = "temporarily unavailable";
      else if (paramInt == 0)
        str = "Out of Service";
      else
        str = "unknown";
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aq.k
 * JD-Core Version:    0.6.2
 */