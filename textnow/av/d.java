package textnow.av;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import textnow.at.a;
import textnow.at.b;
import textnow.at.o;
import textnow.at.q;

final class d
  implements b, q
{
  private d(c paramc)
  {
  }

  public final void a(a parama)
  {
    if (c.b(this.a) != null)
      c.b(this.a).a(parama);
  }

  public final void a(o paramo)
  {
    float f1 = paramo.f();
    f localf = (f)c.c(this.a).get(paramo);
    if ((0x1FF & localf.a) != 0)
    {
      View localView2 = (View)c.d(this.a).get();
      if (localView2 != null)
        localView2.invalidate();
    }
    ArrayList localArrayList = localf.b;
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        e locale = (e)localArrayList.get(j);
        float f2 = locale.b + f1 * locale.c;
        c.a(this.a, locale.a, f2);
      }
    }
    View localView1 = (View)c.d(this.a).get();
    if (localView1 != null)
      localView1.invalidate();
  }

  public final void b(a parama)
  {
    if (c.b(this.a) != null)
      c.b(this.a).b(parama);
    c.c(this.a).remove(parama);
    if (c.c(this.a).isEmpty())
      c.a(this.a, null);
  }

  public final void c(a parama)
  {
    if (c.b(this.a) != null)
      c.b(this.a).c(parama);
  }

  public final void d(a parama)
  {
    if (c.b(this.a) != null)
      c.b(this.a).d(parama);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.av.d
 * JD-Core Version:    0.6.2
 */