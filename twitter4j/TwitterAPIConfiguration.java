package twitter4j;

import java.io.Serializable;
import java.util.Map;

public abstract interface TwitterAPIConfiguration extends Serializable, TwitterResponse
{
  public abstract int getCharactersReservedPerMedia();

  public abstract int getMaxMediaPerUpload();

  public abstract String[] getNonUsernamePaths();

  public abstract int getPhotoSizeLimit();

  public abstract Map<Integer, MediaEntity.Size> getPhotoSizes();

  public abstract int getShortURLLength();

  public abstract int getShortURLLengthHttps();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.TwitterAPIConfiguration
 * JD-Core Version:    0.6.2
 */