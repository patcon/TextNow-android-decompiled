package textnow.bc;

import android.os.Build.VERSION;
import textnow.bb.l;

public final class a extends textnow.bb.b
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bc.a
 * JD-Core Version:    0.6.2
 */