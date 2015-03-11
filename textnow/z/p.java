package textnow.z;

import java.util.Map.Entry;
import java.util.Set;
import textnow.ab.j;

public final class p extends m
{
  private final j<String, m> a = new j();

  public final Set<Map.Entry<String, m>> a()
  {
    return this.a.entrySet();
  }

  public final m a(String paramString)
  {
    return (m)this.a.get(paramString);
  }

  public final void a(String paramString, m paramm)
  {
    if (paramm == null)
      paramm = o.a;
    this.a.put(paramString, paramm);
  }

  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof p)) && (((p)paramObject).a.equals(this.a)));
  }

  public final int hashCode()
  {
    return this.a.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.z.p
 * JD-Core Version:    0.6.2
 */