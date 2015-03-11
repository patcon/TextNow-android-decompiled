package textnow.bg;

public final class i
  implements Runnable
{
  String a;

  public i(e parame, String paramString)
  {
    this.a = paramString;
  }

  public final void run()
  {
    this.b.loadUrl("javascript:" + this.a);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bg.i
 * JD-Core Version:    0.6.2
 */