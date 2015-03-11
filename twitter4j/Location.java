package twitter4j;

import java.io.Serializable;

public abstract interface Location extends Serializable
{
  public abstract String getCountryCode();

  public abstract String getCountryName();

  public abstract String getName();

  public abstract int getPlaceCode();

  public abstract String getPlaceName();

  public abstract String getURL();

  public abstract int getWoeid();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.Location
 * JD-Core Version:    0.6.2
 */