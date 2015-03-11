package twitter4j;

import java.io.Serializable;

public abstract interface AccountTotals extends Serializable, TwitterResponse
{
  public abstract int getFavorites();

  public abstract int getFollowers();

  public abstract int getFriends();

  public abstract int getUpdates();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.AccountTotals
 * JD-Core Version:    0.6.2
 */