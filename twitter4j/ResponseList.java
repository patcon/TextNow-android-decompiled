package twitter4j;

import java.util.List;

public abstract interface ResponseList<T> extends List<T>, TwitterResponse
{
  public abstract RateLimitStatus getRateLimitStatus();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.ResponseList
 * JD-Core Version:    0.6.2
 */