package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class ap
{
  Notification A;
  Notification B = new Notification();
  public ArrayList<String> C;
  Context a;
  CharSequence b;
  CharSequence c;
  PendingIntent d;
  PendingIntent e;
  RemoteViews f;
  Bitmap g;
  CharSequence h;
  int i;
  int j;
  boolean k = true;
  boolean l;
  bb m;
  CharSequence n;
  int o;
  int p;
  boolean q;
  String r;
  boolean s;
  String t;
  ArrayList<al> u = new ArrayList();
  boolean v = false;
  String w;
  Bundle x;
  int y = 0;
  int z = 0;

  public ap(Context paramContext)
  {
    this.a = paramContext;
    this.B.when = System.currentTimeMillis();
    this.B.audioStreamType = -1;
    this.j = 0;
    this.C = new ArrayList();
  }

  private void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Notification localNotification2 = this.B;
      localNotification2.flags = (paramInt | localNotification2.flags);
      return;
    }
    Notification localNotification1 = this.B;
    localNotification1.flags &= (paramInt ^ 0xFFFFFFFF);
  }

  protected static CharSequence e(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null);
    while (paramCharSequence.length() <= 5120)
      return paramCharSequence;
    return paramCharSequence.subSequence(0, 5120);
  }

  public final Notification a()
  {
    return ak.a().a(this);
  }

  public final ap a(int paramInt)
  {
    this.B.icon = paramInt;
    return this;
  }

  public final ap a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 1;
    this.B.ledARGB = paramInt1;
    this.B.ledOnMS = 800;
    this.B.ledOffMS = 3000;
    int i2;
    Notification localNotification;
    int i3;
    if ((this.B.ledOnMS != 0) && (this.B.ledOffMS != 0))
    {
      i2 = i1;
      localNotification = this.B;
      i3 = 0xFFFFFFFE & this.B.flags;
      if (i2 == 0)
        break label96;
    }
    while (true)
    {
      localNotification.flags = (i3 | i1);
      return this;
      i2 = 0;
      break;
      label96: i1 = 0;
    }
  }

  public final ap a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this.u.add(new al(paramInt, paramCharSequence, paramPendingIntent));
    return this;
  }

  public final ap a(long paramLong)
  {
    this.B.when = paramLong;
    return this;
  }

  public final ap a(PendingIntent paramPendingIntent)
  {
    this.d = paramPendingIntent;
    return this;
  }

  public final ap a(Bitmap paramBitmap)
  {
    this.g = paramBitmap;
    return this;
  }

  public final ap a(Uri paramUri)
  {
    this.B.sound = paramUri;
    this.B.audioStreamType = -1;
    return this;
  }

  public final ap a(aq paramaq)
  {
    paramaq.a(this);
    return this;
  }

  public final ap a(bb parambb)
  {
    if (this.m != parambb)
    {
      this.m = parambb;
      if (this.m != null)
      {
        bb localbb = this.m;
        if (localbb.d != this)
        {
          localbb.d = this;
          if (localbb.d != null)
            localbb.d.a(localbb);
        }
      }
    }
    return this;
  }

  public final ap a(CharSequence paramCharSequence)
  {
    this.b = e(paramCharSequence);
    return this;
  }

  public final ap a(boolean paramBoolean)
  {
    this.l = true;
    return this;
  }

  public final ap a(long[] paramArrayOfLong)
  {
    this.B.vibrate = paramArrayOfLong;
    return this;
  }

  public final ap b(int paramInt)
  {
    this.j = 1;
    return this;
  }

  public final ap b(CharSequence paramCharSequence)
  {
    this.c = e(paramCharSequence);
    return this;
  }

  public final ap b(boolean paramBoolean)
  {
    a(2, true);
    return this;
  }

  public final ap c(CharSequence paramCharSequence)
  {
    this.n = e(paramCharSequence);
    return this;
  }

  public final ap c(boolean paramBoolean)
  {
    a(16, true);
    return this;
  }

  public final ap d(CharSequence paramCharSequence)
  {
    this.B.tickerText = e(paramCharSequence);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ap
 * JD-Core Version:    0.6.2
 */