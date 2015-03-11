package twitter4j.api;

import twitter4j.Friendship;
import twitter4j.IDs;
import twitter4j.PagableResponseList;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.User;

public abstract interface FriendsFollowersResources
{
  public abstract User createFriendship(long paramLong);

  public abstract User createFriendship(long paramLong, boolean paramBoolean);

  public abstract User createFriendship(String paramString);

  public abstract User createFriendship(String paramString, boolean paramBoolean);

  public abstract User destroyFriendship(long paramLong);

  public abstract User destroyFriendship(String paramString);

  public abstract IDs getFollowersIDs(long paramLong);

  public abstract IDs getFollowersIDs(long paramLong1, long paramLong2);

  public abstract IDs getFollowersIDs(String paramString, long paramLong);

  public abstract PagableResponseList<User> getFollowersList(long paramLong1, long paramLong2);

  public abstract PagableResponseList<User> getFollowersList(String paramString, long paramLong);

  public abstract IDs getFriendsIDs(long paramLong);

  public abstract IDs getFriendsIDs(long paramLong1, long paramLong2);

  public abstract IDs getFriendsIDs(String paramString, long paramLong);

  public abstract PagableResponseList<User> getFriendsList(long paramLong1, long paramLong2);

  public abstract PagableResponseList<User> getFriendsList(String paramString, long paramLong);

  public abstract IDs getIncomingFriendships(long paramLong);

  public abstract IDs getOutgoingFriendships(long paramLong);

  public abstract ResponseList<Friendship> lookupFriendships(long[] paramArrayOfLong);

  public abstract ResponseList<Friendship> lookupFriendships(String[] paramArrayOfString);

  public abstract Relationship showFriendship(long paramLong1, long paramLong2);

  public abstract Relationship showFriendship(String paramString1, String paramString2);

  public abstract Relationship updateFriendship(long paramLong, boolean paramBoolean1, boolean paramBoolean2);

  public abstract Relationship updateFriendship(String paramString, boolean paramBoolean1, boolean paramBoolean2);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.FriendsFollowersResources
 * JD-Core Version:    0.6.2
 */