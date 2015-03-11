package textnow.ay;

import java.util.ArrayList;
import java.util.Map;

public final class q
  implements Runnable
{
  Map<String, String> a;

  public q(Map<String, String> paramMap)
  {
    Object localObject;
    this.a = localObject;
  }

  public final void run()
  {
    n localn = new n(this.b);
    l.c(this.b).add(localn);
    if (this.a.containsKey("data"))
    {
      String[] arrayOfString2 = new String[4];
      arrayOfString2[0] = ((String)this.a.get("url"));
      arrayOfString2[1] = ((String)this.a.get("type"));
      arrayOfString2[2] = ((String)this.a.get("header"));
      arrayOfString2[3] = ((String)this.a.get("data"));
      localn.execute(arrayOfString2);
      return;
    }
    String[] arrayOfString1 = new String[3];
    arrayOfString1[0] = ((String)this.a.get("url"));
    arrayOfString1[1] = ((String)this.a.get("type"));
    arrayOfString1[2] = ((String)this.a.get("header"));
    localn.execute(arrayOfString1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ay.q
 * JD-Core Version:    0.6.2
 */