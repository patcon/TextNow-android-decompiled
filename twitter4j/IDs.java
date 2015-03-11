package twitter4j;

import java.io.Serializable;

public abstract interface IDs extends Serializable, CursorSupport, TwitterResponse
{
  public abstract long[] getIDs();

  public abstract long getNextCursor();

  public abstract long getPreviousCursor();

  public abstract boolean hasNext();

  public abstract boolean hasPrevious();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.IDs
 * JD-Core Version:    0.6.2
 */