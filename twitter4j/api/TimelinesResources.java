package twitter4j.api;

import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;

public abstract interface TimelinesResources
{
  public abstract ResponseList<Status> getHomeTimeline();

  public abstract ResponseList<Status> getHomeTimeline(Paging paramPaging);

  public abstract ResponseList<Status> getMentions();

  public abstract ResponseList<Status> getMentions(Paging paramPaging);

  public abstract ResponseList<Status> getMentionsTimeline();

  public abstract ResponseList<Status> getMentionsTimeline(Paging paramPaging);

  public abstract ResponseList<Status> getRetweetsOfMe();

  public abstract ResponseList<Status> getRetweetsOfMe(Paging paramPaging);

  public abstract ResponseList<Status> getUserTimeline();

  public abstract ResponseList<Status> getUserTimeline(long paramLong);

  public abstract ResponseList<Status> getUserTimeline(long paramLong, Paging paramPaging);

  public abstract ResponseList<Status> getUserTimeline(String paramString);

  public abstract ResponseList<Status> getUserTimeline(String paramString, Paging paramPaging);

  public abstract ResponseList<Status> getUserTimeline(Paging paramPaging);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.TimelinesResources
 * JD-Core Version:    0.6.2
 */