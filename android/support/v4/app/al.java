package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

public final class al extends bi
{
  public static final bj d = new bj()
  {
  };
  public int a;
  public CharSequence b;
  public PendingIntent c;
  private final Bundle e;
  private final bz[] f;

  public al(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramCharSequence, paramPendingIntent, new Bundle(), null);
  }

  private al(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, bz[] paramArrayOfbz)
  {
    this.a = paramInt;
    this.b = ap.e(paramCharSequence);
    this.c = paramPendingIntent;
    if (paramBundle != null);
    while (true)
    {
      this.e = paramBundle;
      this.f = paramArrayOfbz;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.al
 * JD-Core Version:    0.6.2
 */