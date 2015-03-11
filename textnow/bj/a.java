package textnow.bj;

import android.os.Build.VERSION;
import textnow.bi.l;

public final class a extends textnow.bi.b
{
  static
  {
    if (Integer.parseInt(Build.VERSION.SDK) < 8)
      System.setProperty("http.keepAlive", "false");
  }

  public a()
  {
    this("");
  }

  private a(String paramString)
  {
    super(new b(), paramString);
  }

  public a(String paramString, l paraml)
  {
    super(new b(), paramString, paraml);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bj.a
 * JD-Core Version:    0.6.2
 */