package twitter4j.api;

import java.io.File;
import java.io.InputStream;
import twitter4j.AccountSettings;
import twitter4j.IDs;
import twitter4j.PagableResponseList;
import twitter4j.ResponseList;
import twitter4j.User;

public abstract interface UsersResources
{
  public abstract User createBlock(long paramLong);

  public abstract User createBlock(String paramString);

  public abstract User destroyBlock(long paramLong);

  public abstract User destroyBlock(String paramString);

  public abstract AccountSettings getAccountSettings();

  public abstract IDs getBlocksIDs();

  public abstract IDs getBlocksIDs(long paramLong);

  public abstract PagableResponseList<User> getBlocksList();

  public abstract PagableResponseList<User> getBlocksList(long paramLong);

  public abstract ResponseList<User> getContributees(long paramLong);

  public abstract ResponseList<User> getContributees(String paramString);

  public abstract ResponseList<User> getContributors(long paramLong);

  public abstract ResponseList<User> getContributors(String paramString);

  public abstract ResponseList<User> lookupUsers(long[] paramArrayOfLong);

  public abstract ResponseList<User> lookupUsers(String[] paramArrayOfString);

  public abstract void removeProfileBanner();

  public abstract ResponseList<User> searchUsers(String paramString, int paramInt);

  public abstract User showUser(long paramLong);

  public abstract User showUser(String paramString);

  public abstract AccountSettings updateAccountSettings(Integer paramInteger, Boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4);

  public abstract User updateProfile(String paramString1, String paramString2, String paramString3, String paramString4);

  public abstract User updateProfileBackgroundImage(File paramFile, boolean paramBoolean);

  public abstract User updateProfileBackgroundImage(InputStream paramInputStream, boolean paramBoolean);

  public abstract void updateProfileBanner(File paramFile);

  public abstract void updateProfileBanner(InputStream paramInputStream);

  public abstract User updateProfileColors(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  public abstract User updateProfileImage(File paramFile);

  public abstract User updateProfileImage(InputStream paramInputStream);

  public abstract User verifyCredentials();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.api.UsersResources
 * JD-Core Version:    0.6.2
 */