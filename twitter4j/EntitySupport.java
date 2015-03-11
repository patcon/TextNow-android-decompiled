package twitter4j;

public abstract interface EntitySupport
{
  public abstract HashtagEntity[] getHashtagEntities();

  public abstract MediaEntity[] getMediaEntities();

  public abstract SymbolEntity[] getSymbolEntities();

  public abstract URLEntity[] getURLEntities();

  public abstract UserMentionEntity[] getUserMentionEntities();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.EntitySupport
 * JD-Core Version:    0.6.2
 */