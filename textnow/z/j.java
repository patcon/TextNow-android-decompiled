package textnow.z;

import java.util.List;
import textnow.v.b;

public final class j
{
  private String a;
  private String b;
  private List<k> c;

  public final String a()
  {
    return this.a;
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }

  public final void a(List<k> paramList)
  {
    this.c = paramList;
  }

  public final void b(String paramString)
  {
    this.b = paramString;
  }

  public final String toString()
  {
    String str = "null";
    if (this.c != null)
      str = "{" + b.a(this.c, ",") + "}";
    return "title=[" + this.a + "] contact_value=[" + this.b + "] members=[" + str + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.j
 * JD-Core Version:    0.6.2
 */