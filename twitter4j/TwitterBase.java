package twitter4j;

import twitter4j.auth.Authorization;
import twitter4j.conf.Configuration;

public abstract interface TwitterBase
{
  public abstract void addRateLimitStatusListener(RateLimitStatusListener paramRateLimitStatusListener);

  public abstract Authorization getAuthorization();

  public abstract Configuration getConfiguration();

  public abstract long getId();

  public abstract String getScreenName();

  public abstract void shutdown();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.TwitterBase
 * JD-Core Version:    0.6.2
 */