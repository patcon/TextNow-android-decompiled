package textnow.ay;

public final class r
  implements Runnable
{
  String a;

  public r(l paraml, String paramString)
  {
    this.a = paramString;
  }

  public final void run()
  {
    if (com.tremorvideo.sdk.android.videoad.r.p() < 19)
    {
      this.b.loadUrl("javascript:" + this.a);
      return;
    }
    this.b.evaluateJavascript(this.a, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.r
 * JD-Core Version:    0.6.2
 */