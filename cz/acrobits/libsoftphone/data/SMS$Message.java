package cz.acrobits.libsoftphone.data;

import cz.acrobits.ali.PointerHolder;

public final class SMS$Message extends PointerHolder
{
  public static native Message create();

  public final native void addRecipient(SMS.Recipient paramRecipient);

  public final native String getAccountId();

  public final native SMS.Direction getDirection();

  public final native long getMessageId();

  public final native SMS.Recipient getRecipient(int paramInt);

  public final native int getRecipientCount();

  public final native String getRecipientTitles();

  public final native String getRecipients();

  public final native long getSentDate();

  public final native SMS.Status getStatus();

  public final native int getSuccessfulRecipientCount();

  public final native String getText();

  public final native int getUnreadCount();

  public final native boolean isDirty();

  public final native boolean isRecipientSuccessful(String paramString);

  public final native void removeRecipient(int paramInt);

  public final native void setAccountId(String paramString);

  public final native void setDirection(SMS.Direction paramDirection);

  public final native void setRecipient(int paramInt, SMS.Recipient paramRecipient);

  public final native boolean setRecipientSent(String paramString);

  public final native void setSentDate(long paramLong);

  public final native void setText(String paramString);

  public final native void setUnread();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.SMS.Message
 * JD-Core Version:    0.6.2
 */