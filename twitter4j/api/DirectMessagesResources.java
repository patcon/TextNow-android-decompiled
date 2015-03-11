package twitter4j.api;

import twitter4j.DirectMessage;
import twitter4j.Paging;
import twitter4j.ResponseList;

public abstract interface DirectMessagesResources
{
  public abstract DirectMessage destroyDirectMessage(long paramLong);

  public abstract ResponseList<DirectMessage> getDirectMessages();

  public abstract ResponseList<DirectMessage> getDirectMessages(Paging paramPaging);

  public abstract ResponseList<DirectMessage> getSentDirectMessages();

  public abstract ResponseList<DirectMessage> getSentDirectMessages(Paging paramPaging);

  public abstract DirectMessage sendDirectMessage(long paramLong, String paramString);

  public abstract DirectMessage sendDirectMessage(String paramString1, String paramString2);

  public abstract DirectMessage showDirectMessage(long paramLong);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.DirectMessagesResources
 * JD-Core Version:    0.6.2
 */