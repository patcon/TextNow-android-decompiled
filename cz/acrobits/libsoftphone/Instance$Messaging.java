package cz.acrobits.libsoftphone;

import cz.acrobits.libsoftphone.data.SMS.CharacterCounts;
import cz.acrobits.libsoftphone.data.SMS.FetchConstraint;
import cz.acrobits.libsoftphone.data.SMS.FetchResult;
import cz.acrobits.libsoftphone.data.SMS.Message;

public final class Instance$Messaging
{
  public static native boolean cancelSendMessage(long paramLong);

  public static native void clearDraftMessage(String paramString);

  public static native boolean deleteAll();

  public static native boolean deleteConversation(String paramString);

  public static native boolean deleteMessage(long paramLong);

  public static native boolean deleteMessages(long[] paramArrayOfLong);

  public static native SMS.Message fetchMessage(long paramLong);

  public static native SMS.FetchResult fetchMessages(SMS.FetchConstraint paramFetchConstraint);

  public static native SMS.FetchResult fetchTopConversations(long paramLong, int paramInt);

  public static native int getConversationCount();

  public static native SMS.CharacterCounts getSmsCharacterCounts(String paramString);

  public static native int getTotalCount();

  public static native int getTotalUnreadCount();

  public static native boolean isSendMessagePending(String paramString);

  public static native SMS.Message loadDraftMessage(String paramString);

  public static native void markConversationRead(String paramString);

  public static native boolean saveDraftMessage(String paramString, SMS.Message paramMessage);

  public static native boolean sendMessage(String paramString, SMS.Message paramMessage);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.Messaging
 * JD-Core Version:    0.6.2
 */