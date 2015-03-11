package twitter4j;

import java.io.Serializable;

public abstract interface Trend extends Serializable
{
  public abstract String getName();

  public abstract String getQuery();

  public abstract String getURL();

  public abstract String getUrl();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.Trend
 * JD-Core Version:    0.6.2
 */