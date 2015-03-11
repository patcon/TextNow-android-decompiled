package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

public final class am
{
  private final int a;
  private final CharSequence b;
  private final PendingIntent c;
  private final Bundle d;
  private ArrayList<bz> e;

  public am(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramCharSequence, paramPendingIntent, new Bundle());
  }

  private am(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle)
  {
    this.a = paramInt;
    this.b = ap.e(paramCharSequence);
    this.c = paramPendingIntent;
    this.d = paramBundle;
  }

  public final al a()
  {
    if (this.e != null);
    for (bz[] arrayOfbz = (bz[])this.e.toArray(new bz[this.e.size()]); ; arrayOfbz = null)
      return new al(this.a, this.b, this.c, this.d, arrayOfbz, (byte)0);
  }

  public final am a(bz parambz)
  {
    if (this.e == null)
      this.e = new ArrayList();
    this.e.add(parambz);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.am
 * JD-Core Version:    0.6.2
 */