package textnow.av;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import textnow.at.a;

final class c extends b
{
  ArrayList<e> a = new ArrayList();
  private final WeakReference<View> b;
  private long c;
  private boolean d = false;
  private long e = 0L;
  private boolean f = false;
  private Interpolator g;
  private boolean h = false;
  private textnow.at.b i = null;
  private d j = new d(this, (byte)0);
  private Runnable k = new Runnable()
  {
    public final void run()
    {
      c.a(c.this);
    }
  };
  private HashMap<a, f> l = new HashMap();

  c(View paramView)
  {
    this.b = new WeakReference(paramView);
  }

  private void a(int paramInt, float paramFloat)
  {
    View localView1 = (View)this.b.get();
    if (localView1 != null);
    float f1;
    float f2;
    a locala;
    int i1;
    label208: int m;
    switch (paramInt)
    {
    default:
      f1 = 0.0F;
      f2 = paramFloat - f1;
      if (this.l.size() > 0)
      {
        Iterator localIterator = this.l.keySet().iterator();
        f localf;
        label263: 
        do
        {
          if (!localIterator.hasNext())
            break label450;
          locala = (a)localIterator.next();
          localf = (f)this.l.get(locala);
          if (((paramInt & localf.a) == 0) || (localf.b == null))
            break label444;
          int n = localf.b.size();
          i1 = 0;
          if (i1 >= n)
            break label444;
          if (((e)localf.b.get(i1)).a != paramInt)
            break;
          localf.b.remove(i1);
          localf.a &= (paramInt ^ 0xFFFFFFFF);
          m = 1;
        }
        while ((m == 0) || (localf.a != 0));
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
      e locale = new e(paramInt, f1, f2);
      this.a.add(locale);
      View localView2 = (View)this.b.get();
      if (localView2 != null)
      {
        localView2.removeCallbacks(this.k);
        localView2.post(this.k);
      }
      return;
      f1 = localView1.getTranslationX();
      break;
      f1 = localView1.getTranslationY();
      break;
      f1 = localView1.getRotation();
      break;
      f1 = localView1.getRotationX();
      break;
      f1 = localView1.getRotationY();
      break;
      f1 = localView1.getScaleX();
      break;
      f1 = localView1.getScaleY();
      break;
      f1 = localView1.getX();
      break;
      f1 = localView1.getY();
      break;
      f1 = localView1.getAlpha();
      break;
      i1++;
      break label208;
      label444: m = 0;
      break label263;
      label450: locala = null;
    }
  }

  public final b a(float paramFloat)
  {
    a(1, paramFloat);
    return this;
  }

  public final b a(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Animators cannot have negative duration: " + paramLong);
    this.d = true;
    this.c = paramLong;
    return this;
  }

  public final b a(Interpolator paramInterpolator)
  {
    this.h = true;
    this.g = paramInterpolator;
    return this;
  }

  public final b a(textnow.at.b paramb)
  {
    this.i = paramb;
    return this;
  }

  public final b b(float paramFloat)
  {
    a(2, paramFloat);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.av.c
 * JD-Core Version:    0.6.2
 */