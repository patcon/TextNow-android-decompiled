package textnow.az;

import java.util.ArrayList;
import java.util.Map;

public final class j
  implements Runnable
{
  Map<String, String> a;

  public j(Map<String, String> paramMap)
  {
    Object localObject;
    this.a = localObject;
  }

  public final void run()
  {
    g localg = new g(this.b);
    e.a(this.b).add(localg);
    if (this.a.containsKey("data"))
    {
      String[] arrayOfString2 = new String[4];
      arrayOfString2[0] = ((String)this.a.get("url"));
      arrayOfString2[1] = ((String)this.a.get("type"));
      arrayOfString2[2] = ((String)this.a.get("header"));
      arrayOfString2[3] = ((String)this.a.get("data"));
      localg.execute(arrayOfString2);
      return;
    }
    String[] arrayOfString1 = new String[3];
    arrayOfString1[0] = ((String)this.a.get("url"));
    arrayOfString1[1] = ((String)this.a.get("type"));
    arrayOfString1[2] = ((String)this.a.get("header"));
    localg.execute(arrayOfString1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.az.j
 * JD-Core Version:    0.6.2
 */