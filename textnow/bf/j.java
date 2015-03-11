package textnow.bf;

import android.app.Activity;
import android.widget.RelativeLayout.LayoutParams;
import com.tremorvideo.sdk.android.videoad.dn;
import com.tremorvideo.sdk.android.videoad.eg;
import com.tremorvideo.sdk.android.videoad.ei;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.json.JSONObject;

public final class j
  implements i
{
  private dn a;
  private Activity b;
  private ArrayList<l> c = new ArrayList();

  public j(Activity paramActivity, dn paramdn)
  {
    this.a = paramdn;
    this.b = paramActivity;
  }

  private l b(int paramInt)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      if (paramInt == locall.a())
        return locall;
    }
    return null;
  }

  public final void a()
  {
    this.a.a(this.c);
  }

  public final void a(float paramFloat, int paramInt)
  {
    l locall = b(paramInt);
    if (locall != null)
      locall.a(paramFloat);
  }

  public final void a(int paramInt)
  {
    this.a.a(b(paramInt));
  }

  public final void a(RelativeLayout.LayoutParams paramLayoutParams, int paramInt)
  {
    l locall = b(paramInt);
    this.a.a(paramLayoutParams, locall);
  }

  public final void a(String paramString1, String paramString2, int paramInt)
  {
    try
    {
      JSONObject localJSONObject1 = new JSONObject(paramString2);
      JSONObject localJSONObject2 = this.a.p().r().f;
      l locall = new l(this.b, paramInt, paramString1, localJSONObject1, localJSONObject2);
      locall.a(this);
      this.c.add(locall);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final void a(String paramString, List<NameValuePair> paramList)
  {
    this.a.a(paramString, paramList);
  }

  public final void a(l paraml)
  {
    this.a.b(paraml);
  }

  public final void b()
  {
    if (this.c != null)
    {
      this.c.clear();
      this.c = null;
      System.gc();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bf.j
 * JD-Core Version:    0.6.2
 */