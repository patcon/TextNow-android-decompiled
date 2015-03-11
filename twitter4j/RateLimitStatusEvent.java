package twitter4j;

import java.util.EventObject;

public final class RateLimitStatusEvent extends EventObject
{
  private static final long serialVersionUID = -2332507741769177298L;
  private boolean isAccountRateLimitStatus;
  private RateLimitStatus rateLimitStatus;

  RateLimitStatusEvent(Object paramObject, RateLimitStatus paramRateLimitStatus, boolean paramBoolean)
  {
    super(paramObject);
    this.rateLimitStatus = paramRateLimitStatus;
    this.isAccountRateLimitStatus = paramBoolean;
  }

  public final RateLimitStatus getRateLimitStatus()
  {
    return this.rateLimitStatus;
  }

  public final boolean isAccountRateLimitStatus()
  {
    return this.isAccountRateLimitStatus;
  }

  public final boolean isIPRateLimitStatus()
  {
    return !this.isAccountRateLimitStatus;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.RateLimitStatusEvent
 * JD-Core Version:    0.6.2
 */