package twitter4j.api;

import java.util.Map;
import twitter4j.RateLimitStatus;
import twitter4j.ResponseList;
import twitter4j.TwitterAPIConfiguration;

public abstract interface HelpResources
{
  public abstract TwitterAPIConfiguration getAPIConfiguration();

  public abstract ResponseList<HelpResources.Language> getLanguages();

  public abstract String getPrivacyPolicy();

  public abstract Map<String, RateLimitStatus> getRateLimitStatus();

  public abstract Map<String, RateLimitStatus> getRateLimitStatus(String[] paramArrayOfString);

  public abstract String getTermsOfService();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.HelpResources
 * JD-Core Version:    0.6.2
 */