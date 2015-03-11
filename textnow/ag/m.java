package textnow.ag;

import java.util.Map.Entry;
import java.util.Set;

public final class m extends j
{
  private final textnow.ai.j<String, j> a = new textnow.ai.j();

  public final void a(String paramString, j paramj)
  {
    if (paramj == null)
      paramj = l.a;
    this.a.put(paramString, paramj);
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof m)) && (((m)paramObject).a.equals(this.a)));
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }

  public final Set<Map.Entry<String, j>> n()
  {
    return this.a.entrySet();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ag.m
 * JD-Core Version:    0.6.2
 */