package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.Notification.InboxStyle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bk
{
  private static final Object a = new Object();
  private static Field b;
  private static boolean c;
  private static final Object d = new Object();

  public static Bundle a(Notification.Builder paramBuilder, bi parambi)
  {
    paramBuilder.addAction(parambi.a(), parambi.b(), parambi.c());
    Bundle localBundle = new Bundle(parambi.d());
    if (parambi.e() != null)
      localBundle.putParcelableArray("android.support.remoteInputs", cj.a(parambi.e()));
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

  public static ArrayList<Parcelable> a(bi[] paramArrayOfbi)
  {
    Object localObject;
    if (paramArrayOfbi == null)
      localObject = null;
    while (true)
    {
      return localObject;
      localObject = new ArrayList(paramArrayOfbi.length);
      int i = paramArrayOfbi.length;
      for (int j = 0; j < i; j++)
      {
        bi localbi = paramArrayOfbi[j];
        Bundle localBundle = new Bundle();
        localBundle.putInt("icon", localbi.a());
        localBundle.putCharSequence("title", localbi.b());
        localBundle.putParcelable("actionIntent", localbi.c());
        localBundle.putBundle("extras", localbi.d());
        localBundle.putParcelableArray("remoteInputs", cj.a(localbi.e()));
        ((ArrayList)localObject).add(localBundle);
      }
    }
  }

  public static void a(aj paramaj, CharSequence paramCharSequence1, boolean paramBoolean1, CharSequence paramCharSequence2, Bitmap paramBitmap1, Bitmap paramBitmap2, boolean paramBoolean2)
  {
    Notification.BigPictureStyle localBigPictureStyle = new Notification.BigPictureStyle(paramaj.a()).setBigContentTitle(paramCharSequence1).bigPicture(paramBitmap1);
    if (paramBoolean2)
      localBigPictureStyle.bigLargeIcon(paramBitmap2);
    if (paramBoolean1)
      localBigPictureStyle.setSummaryText(paramCharSequence2);
  }

  public static void a(aj paramaj, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, CharSequence paramCharSequence3)
  {
    Notification.BigTextStyle localBigTextStyle = new Notification.BigTextStyle(paramaj.a()).setBigContentTitle(paramCharSequence1).bigText(paramCharSequence3);
    if (paramBoolean)
      localBigTextStyle.setSummaryText(paramCharSequence2);
  }

  public static void a(aj paramaj, CharSequence paramCharSequence1, boolean paramBoolean, CharSequence paramCharSequence2, ArrayList<CharSequence> paramArrayList)
  {
    Notification.InboxStyle localInboxStyle = new Notification.InboxStyle(paramaj.a()).setBigContentTitle(paramCharSequence1);
    if (paramBoolean)
      localInboxStyle.setSummaryText(paramCharSequence2);
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      localInboxStyle.addLine((CharSequence)localIterator.next());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bk
 * JD-Core Version:    0.6.2
 */