package textnow.ax;

import com.tremorvideo.sdk.android.videoad.ba;
import com.tremorvideo.sdk.android.videoad.eh;

public final class ai
{
  public eh a;
  private String b;
  private String c;
  private int d;
  private int e;
  private ba[] f;
  private boolean g;

  public ai(String paramString1, String paramString2, int paramInt1, int paramInt2, ba[] paramArrayOfba, boolean paramBoolean, eh parameh)
  {
    this.d = paramInt1;
    this.e = paramInt2;
    this.b = paramString1;
    this.c = paramString2;
    this.f = paramArrayOfba;
    this.g = paramBoolean;
    this.a = parameh;
  }

  public final int a()
  {
    return this.d;
  }

  public final void a(String paramString)
  {
    this.c = paramString;
  }

  public final int b()
  {
    return this.e;
  }

  public final String c()
  {
    return this.b;
  }

  public final int d()
  {
    if ((this.b != null) && (this.b.startsWith("video-")))
      return -1 + Integer.parseInt(this.b.substring(-1 + this.b.length()));
    return -1;
  }

  public final String e()
  {
    return this.c;
  }

  public final boolean f()
  {
    return this.g;
  }

  public final ba[] g()
  {
    return this.f;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.ai
 * JD-Core Version:    0.6.2
 */