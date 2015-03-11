package twitter4j;

import java.io.Serializable;
import java.util.Date;

public abstract interface Trends extends Serializable, Comparable<Trends>, TwitterResponse
{
  public abstract Date getAsOf();

  public abstract Location getLocation();

  public abstract Date getTrendAt();

  public abstract Trend[] getTrends();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.Trends
 * JD-Core Version:    0.6.2
 */