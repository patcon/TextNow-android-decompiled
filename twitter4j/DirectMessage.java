package twitter4j;

import java.io.Serializable;
import java.util.Date;

public abstract interface DirectMessage extends Serializable, EntitySupport, TwitterResponse
{
  public abstract Date getCreatedAt();

  public abstract long getId();

  public abstract User getRecipient();

  public abstract long getRecipientId();

  public abstract String getRecipientScreenName();

  public abstract User getSender();

  public abstract long getSenderId();

  public abstract String getSenderScreenName();

  public abstract String getText();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.DirectMessage
 * JD-Core Version:    0.6.2
 */