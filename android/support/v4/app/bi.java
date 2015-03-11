package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class bi
  implements ap, aq
{
  private Notification.Builder a;
  private Bundle b;

  public bi(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4, CharSequence paramCharSequence4, boolean paramBoolean4, ArrayList<String> paramArrayList, Bundle paramBundle, String paramString1, boolean paramBoolean5, String paramString2)
  {
    Notification.Builder localBuilder1 = new Notification.Builder(paramContext).setWhen(paramNotification.when).setShowWhen(paramBoolean2).setSmallIcon(paramNotification.icon, paramNotification.iconLevel).setContent(paramNotification.contentView).setTicker(paramNotification.tickerText, paramRemoteViews).setSound(paramNotification.sound, paramNotification.audioStreamType).setVibrate(paramNotification.vibrate).setLights(paramNotification.ledARGB, paramNotification.ledOnMS, paramNotification.ledOffMS);
    boolean bool1;
    boolean bool2;
    label120: boolean bool3;
    label142: Notification.Builder localBuilder4;
    if ((0x2 & paramNotification.flags) != 0)
    {
      bool1 = true;
      Notification.Builder localBuilder2 = localBuilder1.setOngoing(bool1);
      if ((0x8 & paramNotification.flags) == 0)
        break label335;
      bool2 = true;
      Notification.Builder localBuilder3 = localBuilder2.setOnlyAlertOnce(bool2);
      if ((0x10 & paramNotification.flags) == 0)
        break label341;
      bool3 = true;
      localBuilder4 = localBuilder3.setAutoCancel(bool3).setDefaults(paramNotification.defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(paramCharSequence4).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1).setDeleteIntent(paramNotification.deleteIntent);
      if ((0x80 & paramNotification.flags) == 0)
        break label347;
    }
    label335: label341: label347: for (boolean bool4 = true; ; bool4 = false)
    {
      this.a = localBuilder4.setFullScreenIntent(paramPendingIntent2, bool4).setLargeIcon(paramBitmap).setNumber(paramInt1).setUsesChronometer(paramBoolean3).setPriority(paramInt4).setProgress(paramInt2, paramInt3, paramBoolean1).setLocalOnly(paramBoolean4).setGroup(paramString1).setGroupSummary(paramBoolean5).setSortKey(paramString2);
      this.b = new Bundle();
      if (paramBundle != null)
        this.b.putAll(paramBundle);
      if ((paramArrayList != null) && (!paramArrayList.isEmpty()))
        this.b.putStringArray("android.people", (String[])paramArrayList.toArray(new String[paramArrayList.size()]));
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label120;
      bool3 = false;
      break label142;
    }
  }

  public final Notification.Builder a()
  {
    return this.a;
  }

  public final void a(bm parambm)
  {
    bh.a(this.a, parambm);
  }

  public final Notification b()
  {
    this.a.setExtras(this.b);
    return this.a.build();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bi
 * JD-Core Version:    0.6.2
 */