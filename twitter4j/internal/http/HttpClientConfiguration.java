package twitter4j.internal.http;

public abstract interface HttpClientConfiguration
{
  public abstract int getHttpConnectionTimeout();

  public abstract int getHttpDefaultMaxPerRoute();

  public abstract int getHttpMaxTotalConnections();

  public abstract String getHttpProxyHost();

  public abstract String getHttpProxyPassword();

  public abstract int getHttpProxyPort();

  public abstract String getHttpProxyUser();

  public abstract int getHttpReadTimeout();

  public abstract int getHttpRetryCount();

  public abstract int getHttpRetryIntervalSeconds();

  public abstract boolean isGZIPEnabled();

  public abstract boolean isPrettyDebugEnabled();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.http.HttpClientConfiguration
 * JD-Core Version:    0.6.2
 */