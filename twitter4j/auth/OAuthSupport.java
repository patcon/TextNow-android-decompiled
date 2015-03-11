package twitter4j.auth;

public abstract interface OAuthSupport
{
  public abstract AccessToken getOAuthAccessToken();

  public abstract AccessToken getOAuthAccessToken(String paramString);

  public abstract AccessToken getOAuthAccessToken(String paramString1, String paramString2);

  public abstract AccessToken getOAuthAccessToken(RequestToken paramRequestToken);

  public abstract AccessToken getOAuthAccessToken(RequestToken paramRequestToken, String paramString);

  public abstract RequestToken getOAuthRequestToken();

  public abstract RequestToken getOAuthRequestToken(String paramString);

  public abstract RequestToken getOAuthRequestToken(String paramString1, String paramString2);

  public abstract void setOAuthAccessToken(AccessToken paramAccessToken);

  public abstract void setOAuthConsumer(String paramString1, String paramString2);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.auth.OAuthSupport
 * JD-Core Version:    0.6.2
 */