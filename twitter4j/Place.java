package twitter4j;

import java.io.Serializable;

public abstract interface Place extends Serializable, Comparable<Place>, TwitterResponse
{
  public abstract GeoLocation[][] getBoundingBoxCoordinates();

  public abstract String getBoundingBoxType();

  public abstract Place[] getContainedWithIn();

  public abstract String getCountry();

  public abstract String getCountryCode();

  public abstract String getFullName();

  public abstract GeoLocation[][] getGeometryCoordinates();

  public abstract String getGeometryType();

  public abstract String getId();

  public abstract String getName();

  public abstract String getPlaceType();

  public abstract String getStreetAddress();

  public abstract String getURL();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.Place
 * JD-Core Version:    0.6.2
 */