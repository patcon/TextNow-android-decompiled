package cz.acrobits.libsoftphone.data;

import cz.acrobits.ali.PointerHolder;

public final class SMS$FetchResult extends PointerHolder
{
  public final native int getFetchedCount();

  public final native SMS.Message getMessage(int paramInt);

  public final native int getTotalCount();

  public final native boolean isEmpty();

  public final native SMS.Message removeMessage(int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.SMS.FetchResult
 * JD-Core Version:    0.6.2
 */