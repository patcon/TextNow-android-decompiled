package twitter4j.api;

import twitter4j.User;

public abstract interface SpamReportingResource
{
  public abstract User reportSpam(long paramLong);

  public abstract User reportSpam(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.SpamReportingResource
 * JD-Core Version:    0.6.2
 */