package twitter4j.auth;

public abstract interface AuthorizationConfiguration
{
  public abstract String getOAuth2AccessToken();

  public abstract String getOAuth2TokenType();

  public abstract String getOAuthAccessToken();

  public abstract String getOAuthAccessTokenSecret();

  public abstract String getOAuthConsumerKey();

  public abstract String getOAuthConsumerSecret();

  public abstract String getPassword();

  public abstract String getUser();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.auth.AuthorizationConfiguration
 * JD-Core Version:    0.6.2
 */