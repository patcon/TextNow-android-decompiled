package twitter4j.api;

import twitter4j.IDs;
import twitter4j.OEmbed;
import twitter4j.OEmbedRequest;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.StatusUpdate;

public abstract interface TweetsResources
{
  public abstract Status destroyStatus(long paramLong);

  public abstract OEmbed getOEmbed(OEmbedRequest paramOEmbedRequest);

  public abstract IDs getRetweeterIds(long paramLong1, int paramInt, long paramLong2);

  public abstract IDs getRetweeterIds(long paramLong1, long paramLong2);

  public abstract ResponseList<Status> getRetweets(long paramLong);

  public abstract Status retweetStatus(long paramLong);

  public abstract Status showStatus(long paramLong);

  public abstract Status updateStatus(String paramString);

  public abstract Status updateStatus(StatusUpdate paramStatusUpdate);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.TweetsResources
 * JD-Core Version:    0.6.2
 */