package twitter4j;

import java.io.Serializable;

public abstract interface UserMentionEntity extends Serializable, TweetEntity
{
  public abstract int getEnd();

  public abstract long getId();

  public abstract String getName();

  public abstract String getScreenName();

  public abstract int getStart();

  public abstract String getText();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.UserMentionEntity
 * JD-Core Version:    0.6.2
 */