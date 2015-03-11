package twitter4j.api;

import twitter4j.GeoLocation;
import twitter4j.GeoQuery;
import twitter4j.Place;
import twitter4j.ResponseList;
import twitter4j.SimilarPlaces;

public abstract interface PlacesGeoResources
{
  public abstract Place createPlace(String paramString1, String paramString2, String paramString3, GeoLocation paramGeoLocation, String paramString4);

  public abstract Place getGeoDetails(String paramString);

  public abstract SimilarPlaces getSimilarPlaces(GeoLocation paramGeoLocation, String paramString1, String paramString2, String paramString3);

  public abstract ResponseList<Place> reverseGeoCode(GeoQuery paramGeoQuery);

  public abstract ResponseList<Place> searchPlaces(GeoQuery paramGeoQuery);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.PlacesGeoResources
 * JD-Core Version:    0.6.2
 */