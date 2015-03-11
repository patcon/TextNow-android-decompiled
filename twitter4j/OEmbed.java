package twitter4j;

import java.io.Serializable;

public abstract interface OEmbed extends Serializable, TwitterResponse
{
  public abstract String getAuthorName();

  public abstract String getAuthorURL();

  public abstract long getCacheAge();

  public abstract String getHtml();

  public abstract String getURL();

  public abstract String getVersion();

  public abstract int getWidth();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.OEmbed
 * JD-Core Version:    0.6.2
 */