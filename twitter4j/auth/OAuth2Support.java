package twitter4j.auth;

public abstract interface OAuth2Support
{
  public abstract OAuth2Token getOAuth2Token();

  public abstract void invalidateOAuth2Token();

  public abstract void setOAuth2Token(OAuth2Token paramOAuth2Token);

  public abstract void setOAuthConsumer(String paramString1, String paramString2);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.auth.OAuth2Support
 * JD-Core Version:    0.6.2
 */