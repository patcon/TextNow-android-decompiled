package textnow.u;

import java.util.List;
import textnow.q.b;

public final class h
{
  private String a;
  private String b;
  private List<i> c;

  public final String a()
  {
    return this.a;
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }

  public final void a(List<i> paramList)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.h
 * JD-Core Version:    0.6.2
 */