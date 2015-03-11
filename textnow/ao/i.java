package textnow.ao;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import textnow.am.a;
import textnow.am.b;
import textnow.am.o;
import textnow.am.q;

final class i
  implements b, q
{
  private i(h paramh)
  {
  }

  public final void a(a parama)
  {
    if (h.b(this.a) != null)
      h.b(this.a).a(parama);
  }

  public final void a(o paramo)
  {
    float f1 = paramo.e();
    k localk = (k)h.c(this.a).get(paramo);
    if ((0x1FF & localk.a) != 0)
    {
      View localView2 = (View)h.d(this.a).get();
      if (localView2 != null)
        localView2.invalidate();
    }
    ArrayList localArrayList = localk.b;
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      for (int j = 0; j < i; j++)
      {
        j localj = (j)localArrayList.get(j);
        float f2 = localj.b + f1 * localj.c;
        h.a(this.a, localj.a, f2);
      }
    }
    View localView1 = (View)h.d(this.a).get();
    if (localView1 != null)
      localView1.invalidate();
  }

  public final void b(a parama)
  {
    if (h.b(this.a) != null)
      h.b(this.a).b(parama);
    h.c(this.a).remove(parama);
    if (h.c(this.a).isEmpty())
      h.a(this.a, null);
  }

  public final void c(a parama)
  {
    if (h.b(this.a) != null)
      h.b(this.a).c(parama);
  }

  public final void d(a parama)
  {
    if (h.b(this.a) != null)
      h.b(this.a).d(parama);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ao.i
 * JD-Core Version:    0.6.2
 */