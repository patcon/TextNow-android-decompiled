package twitter4j;

import java.io.Serializable;

public abstract interface StatusDeletionNotice extends Serializable, Comparable<StatusDeletionNotice>
{
  public abstract long getStatusId();

  public abstract long getUserId();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.StatusDeletionNotice
 * JD-Core Version:    0.6.2
 */