package twitter4j;

import java.util.Map;

public abstract interface MediaEntity extends URLEntity
{
  public abstract long getId();

  public abstract String getMediaURL();

  public abstract String getMediaURLHttps();

  public abstract Map<Integer, MediaEntity.Size> getSizes();

  public abstract String getType();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.MediaEntity
 * JD-Core Version:    0.6.2
 */