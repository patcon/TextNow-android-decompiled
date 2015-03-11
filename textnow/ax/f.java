package textnow.ax;

import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class f
  implements ValueCallback<String>
{
  CountDownLatch a = null;
  public String b;
  public ArrayList<String> c = new ArrayList();
  private final String d = f.class.getName();

  f(CountDownLatch paramCountDownLatch)
  {
    this.a = paramCountDownLatch;
  }

  private void a(String paramString1, String paramString2)
  {
    if (paramString1 == null);
    for (String str = "null"; ; str = paramString1)
    {
      long l = 0L;
      if (this.a != null)
        l = this.a.getCount();
      new StringBuilder("in ").append(paramString2).append("(").append(str).append(") count = ").append(l);
      this.b = paramString1;
      if (paramString1 == null)
        this.c.add("");
      while (this.a != null)
      {
        this.a.countDown();
        new StringBuilder("in ").append(paramString2).append("() count = ").append(this.a.getCount());
        return;
        this.c.add(paramString1);
      }
      new StringBuilder("in ").append(paramString2).append("() latch == null").toString();
      return;
    }
  }

  @JavascriptInterface
  public final void a(String paramString)
  {
    a(paramString, "getString");
  }

  public final void a(CountDownLatch paramCountDownLatch)
  {
    if (this.a != null);
    this.a = paramCountDownLatch;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ax.f
 * JD-Core Version:    0.6.2
 */