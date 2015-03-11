package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

public final class as extends bm
{
  public static final bn d = new bn()
  {
  };
  public int a;
  public CharSequence b;
  public PendingIntent c;
  private final Bundle e;
  private final bs[] f;

  public as(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramCharSequence, paramPendingIntent, new Bundle(), null);
  }

  private as(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, bs[] paramArrayOfbs)
  {
    this.a = paramInt;
    this.b = av.e(paramCharSequence);
    this.c = paramPendingIntent;
    if (paramBundle != null);
    while (true)
    {
      this.e = paramBundle;
      this.f = null;
      return;
      paramBundle = new Bundle();
    }
  }

  protected final int a()
  {
    return this.a;
  }

  protected final CharSequence b()
  {
    return this.b;
  }

  protected final PendingIntent c()
  {
    return this.c;
  }

  public final Bundle d()
  {
    return this.e;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.as
 * JD-Core Version:    0.6.2
 */