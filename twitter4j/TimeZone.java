package twitter4j;

import java.io.Serializable;

public abstract interface TimeZone extends Serializable
{
  public abstract String getName();

  public abstract String tzinfoName();

  public abstract int utcOffset();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.TimeZone
 * JD-Core Version:    0.6.2
 */