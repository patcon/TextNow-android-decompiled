package twitter4j.api;

import twitter4j.GeoLocation;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.Trends;

public abstract interface TrendsResources
{
  public abstract ResponseList<Location> getAvailableTrends();

  public abstract ResponseList<Location> getAvailableTrends(GeoLocation paramGeoLocation);

  public abstract ResponseList<Location> getClosestTrends(GeoLocation paramGeoLocation);

  public abstract Trends getLocationTrends(int paramInt);

  public abstract Trends getPlaceTrends(int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.TrendsResources
 * JD-Core Version:    0.6.2
 */