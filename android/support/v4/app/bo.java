package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bo
{
  private static final Object a = new Object();
  private static Field b;
  private static boolean c;
  private static final Object d = new Object();

  public static Bundle a(Notification.Builder paramBuilder, bm parambm)
  {
    paramBuilder.addAction(parambm.a(), parambm.b(), parambm.c());
    Bundle localBundle = new Bundle(parambm.d());
    if (parambm.e() != null)
      localBundle.putParcelableArray("android.support.remoteInputs", cb.a(parambm.e()));
    return localBundle;
  }

  public static Bundle a(Notification paramNotification)
  {
    synchronized (a)
    {
      if (c)
        return null;
    }
    try
    {
      if (b == null)
      {
        Field localField = Notification.class.getDeclaredField("extras");
        if (!Bundle.class.isAssignableFrom(localField.getType()))
        {
          c = true;
          return null;
        }
        localField.setAccessible(true);
        b = localField;
      }
      Bundle localBundle = (Bundle)b.get(paramNotification);
      if (localBundle == null)
      {
        localBundle = new Bundle();
        b.set(paramNotification, localBundle);
      }
      return localBundle;
      localObject2 = finally;
      throw localObject2;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      c = true;
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label110: break label110;
    }
  }

  public static SparseArray<Bundle> a(List<Bundle> paramList)
  {
    SparseArray localSparseArray = null;
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      Bundle localBundle = (Bundle)paramList.get(j);
      if (localBundle != null)
      {
        if (localSparseArray == null)
          localSparseArray = new SparseArray();
        localSparseArray.put(j, localBundle);
      }
    }
    return localSparseArray;
  }

  public static void a(aq paramaq, CharSequence paramCharSequence1, boolean paramBoolean1, CharSequence paramCharSequence2, Bitmap paramBitmap1, Bitmap paramBitmap2, boolean paramBoolean2)
  {
    Notification.BigPictureStyle localBigPictureStyle = new Notification.BigPictureStyle(paramaq.a()).setBigContentTitle(paramCharSequence1).bigPicture(paramBitmap1);
    if (paramBoolean2)
      localBigPictureStyle.bigLargeIcon(paramBitmap2);
    if (paramBoolean1)
      localBigPictureStyle.setSummaryText(paramCharSequence2);
  }

  public static void a(aq paramaq, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    Notification.BigTextStyle localBigTextStyle = new Notification.BigTextStyle(paramaq.a()).setBigContentTitle(paramCharSequence1).bigText(paramCharSequence3);
    if (paramBoolean)
      localBigTextStyle.setSummaryText(paramCharSequence2);
  }

  public static void a(aq paramaq, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, ArrayList<CharSequence> paramArrayList)
  {
    Notification.InboxStyle localInboxStyle = new Notification.InboxStyle(paramaq.a()).setBigContentTitle(paramCharSequence1);
    if (paramBoolean)
      localInboxStyle.setSummaryText(paramCharSequence2);
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      localInboxStyle.addLine((CharSequence)localIterator.next());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bo
 * JD-Core Version:    0.6.2
 */