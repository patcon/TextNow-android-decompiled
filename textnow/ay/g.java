package textnow.ay;

import java.util.ArrayList;
import java.util.Map;

public final class g
  implements Runnable
{
  Map<String, String> a;
  d b;

  public g(Map<String, String> paramMap, d paramd)
  {
    this.a = paramd;
    Object localObject;
    this.b = localObject;
  }

  public final void run()
  {
    k localk = new k(this.b);
    d.a(this.c).add(localk);
    if (this.a.containsKey("data"))
    {
      String[] arrayOfString2 = new String[4];
      arrayOfString2[0] = ((String)this.a.get("url"));
      arrayOfString2[1] = ((String)this.a.get("type"));
      arrayOfString2[2] = ((String)this.a.get("header"));
      arrayOfString2[3] = ((String)this.a.get("data"));
      localk.execute(arrayOfString2);
      return;
    }
    String[] arrayOfString1 = new String[3];
    arrayOfString1[0] = ((String)this.a.get("url"));
    arrayOfString1[1] = ((String)this.a.get("type"));
    arrayOfString1[2] = ((String)this.a.get("header"));
    localk.execute(arrayOfString1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.g
 * JD-Core Version:    0.6.2
 */