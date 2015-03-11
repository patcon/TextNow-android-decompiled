package android.support.v4.app;

import android.app.Notification;

final class bu
  implements by
{
  final String a;
  final int b;
  final String c;
  final Notification d;

  public bu(String paramString1, int paramInt, String paramString2, Notification paramNotification)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramString2;
    this.d = paramNotification;
  }

  public final void a(w paramw)
  {
    paramw.a(this.a, this.b, this.c, this.d);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("NotifyTask[");
    localStringBuilder.append("packageName:").append(this.a);
    localStringBuilder.append(", id:").append(this.b);
    localStringBuilder.append(", tag:").append(this.c);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.bu
 * JD-Core Version:    0.6.2
 */