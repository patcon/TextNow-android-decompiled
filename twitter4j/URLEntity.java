package twitter4j;

import java.io.Serializable;

public abstract interface URLEntity extends Serializable, TweetEntity
{
  public abstract String getDisplayURL();

  public abstract int getEnd();

  public abstract String getExpandedURL();

  public abstract int getStart();

  public abstract String getText();

  public abstract String getURL();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.URLEntity
 * JD-Core Version:    0.6.2
 */