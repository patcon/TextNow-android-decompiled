package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bp
  implements ap, aq
{
  private Notification.Builder a;
  private final Bundle b;
  private List<Bundle> c = new ArrayList();

  public bp(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, int paramInt4, CharSequence paramCharSequence4, boolean paramBoolean3, Bundle paramBundle, String paramString1, boolean paramBoolean4, String paramString2)
  {
    Notification.Builder localBuilder1 = new Notification.Builder(paramContext).setWhen(paramNotification.when).setSmallIcon(paramNotification.icon, paramNotification.iconLevel).setContent(paramNotification.contentView).setTicker(paramNotification.tickerText, paramRemoteViews).setSound(paramNotification.sound, paramNotification.audioStreamType).setVibrate(paramNotification.vibrate).setLights(paramNotification.ledARGB, paramNotification.ledOnMS, paramNotification.ledOffMS);
    boolean bool1;
    boolean bool2;
    label126: boolean bool3;
    label148: boolean bool4;
    if ((0x2 & paramNotification.flags) != 0)
    {
      bool1 = true;
      Notification.Builder localBuilder2 = localBuilder1.setOngoing(bool1);
      if ((0x8 & paramNotification.flags) == 0)
        break label345;
      bool2 = true;
      Notification.Builder localBuilder3 = localBuilder2.setOnlyAlertOnce(bool2);
      if ((0x10 & paramNotification.flags) == 0)
        break label351;
      bool3 = true;
      Notification.Builder localBuilder4 = localBuilder3.setAutoCancel(bool3).setDefaults(paramNotification.defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(paramCharSequence4).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1).setDeleteIntent(paramNotification.deleteIntent);
      if ((0x80 & paramNotification.flags) == 0)
        break label357;
      bool4 = true;
      label209: this.a = localBuilder4.setFullScreenIntent(paramPendingIntent2, bool4).setLargeIcon(paramBitmap).setNumber(paramInt1).setUsesChronometer(paramBoolean2).setPriority(paramInt4).setProgress(paramInt2, paramInt3, paramBoolean1);
      this.b = new Bundle();
      if (paramBundle != null)
        this.b.putAll(paramBundle);
      if (paramBoolean3)
        this.b.putBoolean("android.support.localOnly", true);
      if (paramString1 != null)
      {
        this.b.putString("android.support.groupKey", paramString1);
        if (!paramBoolean4)
          break label363;
        this.b.putBoolean("android.support.isGroupSummary", true);
      }
    }
    while (true)
    {
      if (paramString2 != null)
        this.b.putString("android.support.sortKey", paramString2);
      return;
      bool1 = false;
      break;
      label345: bool2 = false;
      break label126;
      label351: bool3 = false;
      break label148;
      label357: bool4 = false;
      break label209;
      label363: this.b.putBoolean("android.support.useSideChannel", true);
    }
  }

  public final Notification.Builder a()
  {
    return this.a;
  }

  public final void a(bm parambm)
  {
    this.c.add(bo.a(this.a, parambm));
  }

  public final Notification b()
  {
    Notification localNotification = this.a.build();
    Bundle localBundle1 = bo.a(localNotification);
    Bundle localBundle2 = new Bundle(this.b);
    Iterator localIterator = this.b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (localBundle1.containsKey(str))
        localBundle2.remove(str);
    }
    localBundle1.putAll(localBundle2);
    SparseArray localSparseArray = bo.a(this.c);
    if (localSparseArray != null)
      bo.a(localNotification).putSparseParcelableArray("android.support.actionExtras", localSparseArray);
    return localNotification;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bp
 * JD-Core Version:    0.6.2
 */