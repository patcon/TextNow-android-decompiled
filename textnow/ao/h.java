package textnow.ao;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

final class h extends b
{
  ArrayList<j> a = new ArrayList();
  private final textnow.ap.a b;
  private final WeakReference<View> c;
  private long d;
  private boolean e = false;
  private long f = 0L;
  private boolean g = false;
  private Interpolator h;
  private boolean i = false;
  private textnow.am.b j = null;
  private i k = new i(this, (byte)0);
  private Runnable l = new Runnable()
  {
    public final void run()
    {
      h.a(h.this);
    }
  };
  private HashMap<textnow.am.a, k> m = new HashMap();

  h(View paramView)
  {
    this.c = new WeakReference(paramView);
    this.b = textnow.ap.a.a(paramView);
  }

  public final b a(float paramFloat)
  {
    float f1;
    float f2;
    textnow.am.a locala;
    int i2;
    label189: int n;
    switch (1)
    {
    default:
      f1 = 0.0F;
      f2 = paramFloat - f1;
      if (this.m.size() > 0)
      {
        Iterator localIterator = this.m.keySet().iterator();
        k localk;
        label243: 
        do
        {
          if (!localIterator.hasNext())
            break label449;
          locala = (textnow.am.a)localIterator.next();
          localk = (k)this.m.get(locala);
          if (((0x1 & localk.a) == 0) || (localk.b == null))
            break label443;
          int i1 = localk.b.size();
          i2 = 0;
          if (i2 >= i1)
            break label443;
          if (((j)localk.b.get(i2)).a != 1)
            break;
          localk.b.remove(i2);
          localk.a = (0xFFFFFFFE & localk.a);
          n = 1;
        }
        while ((n == 0) || (localk.a != 0));
      }
      break;
    case 1:
    case 2:
    case 16:
    case 32:
    case 64:
    case 4:
    case 8:
    case 128:
    case 256:
    case 512:
    }
    while (true)
    {
      if (locala != null)
        locala.b();
      j localj = new j(1, f1, f2);
      this.a.add(localj);
      View localView = (View)this.c.get();
      if (localView != null)
      {
        localView.removeCallbacks(this.l);
        localView.post(this.l);
      }
      return this;
      f1 = this.b.g();
      break;
      f1 = this.b.h();
      break;
      f1 = this.b.b();
      break;
      f1 = this.b.c();
      break;
      f1 = this.b.d();
      break;
      f1 = this.b.e();
      break;
      f1 = this.b.f();
      break;
      f1 = this.b.i();
      break;
      f1 = this.b.j();
      break;
      f1 = this.b.a();
      break;
      i2++;
      break label189;
      label443: n = 0;
      break label243;
      label449: locala = null;
    }
  }

  public final b a(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Animators cannot have negative duration: " + paramLong);
    this.e = true;
    this.d = paramLong;
    return this;
  }

  public final b a(Interpolator paramInterpolator)
  {
    this.i = true;
    this.h = paramInterpolator;
    return this;
  }

  public final b a(textnow.am.b paramb)
  {
    this.j = paramb;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ao.h
 * JD-Core Version:    0.6.2
 */