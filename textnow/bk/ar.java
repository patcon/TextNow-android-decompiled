package textnow.bk;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;

public final class ar
{
  private final bc a = new bc();
  private bv b;
  private final ac c = new ac();
  private Context d;
  private Object e;
  private volatile boolean f = false;
  private volatile as g = new as();

  private ar(Object paramObject, Context paramContext)
  {
    cb.b();
    if (paramObject == null)
      throw new IllegalArgumentException("Key inside the ImageLoader cannot be null!");
    this.d = paramContext.getApplicationContext();
    this.e = paramObject;
    this.b = bg.a(paramContext);
  }

  private static Integer a(Integer paramInteger, int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInteger == null)
        paramInteger = Integer.valueOf(paramInt);
    }
    else
      return paramInteger;
    return Integer.valueOf(Math.min(paramInteger.intValue(), paramInt));
  }

  public static ar a(Fragment paramFragment)
  {
    return new ar(paramFragment, paramFragment.getActivity());
  }

  private by a(ImageView paramImageView, as paramas)
  {
    by localby = new by();
    if (paramas.a != null)
    {
      localby.a = paramas.a;
      return localby;
    }
    Object localObject = paramas.c;
    Integer localInteger1 = paramas.b;
    w localw;
    Integer localInteger2;
    int j;
    if (paramas.e)
    {
      localw = this.c.a(this.d);
      int i = localw.a.intValue();
      if (localObject == null)
        localObject = localw.a;
      localInteger2 = Integer.valueOf(Math.min(i, ((Integer)localObject).intValue()));
      j = localw.b.intValue();
      if (localInteger1 != null)
        break label190;
    }
    label190: for (Integer localInteger3 = localw.b; ; localInteger3 = localInteger1)
    {
      localInteger1 = Integer.valueOf(Math.min(j, localInteger3.intValue()));
      localObject = localInteger2;
      if ((paramas.d) && (paramImageView != null))
      {
        Point localPoint = ce.a(paramImageView);
        localObject = a((Integer)localObject, localPoint.x);
        localInteger1 = a(localInteger1, localPoint.y);
      }
      localby.b = ((Integer)localObject);
      localby.c = localInteger1;
      return localby;
    }
  }

  private void a(ImageView paramImageView, q paramq, as paramas, av paramav)
  {
    if (!paramq.g())
    {
      av localav = this.a.a(paramImageView);
      if (localav != null)
        this.b.a(localav);
      this.a.a(paramImageView, paramav);
    }
    if ((paramImageView != null) && (paramas.g))
    {
      if (paramas.h == null)
        break label89;
      paramImageView.setImageResource(paramas.h.intValue());
    }
    while (true)
    {
      this.b.a(this.e, paramq, paramav);
      return;
      label89: paramImageView.setImageBitmap(null);
    }
  }

  private boolean c()
  {
    try
    {
      boolean bool = this.f;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a()
  {
    cb.b();
    try
    {
      this.f = true;
      List localList = this.b.a(this.e);
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        if (localIterator.hasNext())
        {
          av localav = (av)localIterator.next();
          this.a.a(localav);
        }
      }
    }
    finally
    {
    }
  }

  public final void a(final ImageView paramImageView, String paramString, as paramas, final au paramau)
  {
    if (paramImageView == null)
      throw new IllegalArgumentException("The method \"loadImage(ImageView, String)\" requires a non-null ImageView to be passed in.");
    if (!c())
      if (paramas != null)
        break label136;
    label136: for (final as localas = this.g; ; localas = paramas)
    {
      if (paramau == null);
      final q localq;
      for (Object localObject = new av()
      {
        public final void a(String paramAnonymousString)
        {
          ImageView localImageView = ar.b(ar.this).a(this);
          if ((localImageView != null) && (localas.i != null))
            localImageView.setImageResource(localas.i.intValue());
        }

        public final void a(az paramAnonymousaz)
        {
          ImageView localImageView = ar.b(ar.this).a(this);
          if (localImageView != null)
            localImageView.setImageBitmap(paramAnonymousaz.a());
        }
      }
      ; ; localObject = new av()
      {
        public final void a(String paramAnonymousString)
        {
          ImageView localImageView = ar.b(ar.this).a(this);
          if ((localImageView != null) && (localas.i != null))
            localImageView.setImageResource(localas.i.intValue());
          paramau.a(paramAnonymousString);
        }

        public final void a(az paramAnonymousaz)
        {
          ImageView localImageView = ar.b(ar.this).a(this);
          paramau.a(localImageView, paramAnonymousaz.a(), paramAnonymousaz.b());
        }
      })
      {
        localq = new q(paramString, a(paramImageView, localas), localas);
        if (!cb.a())
          break;
        a(paramImageView, localq, localas, (av)localObject);
        return;
      }
      new Handler(this.d.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          if (!ar.a(ar.this))
            ar.a(ar.this, paramImageView, localq, localas, this.d);
        }
      });
      return;
    }
  }

  public final void a(bp parambp)
  {
    as localas = parambp.b;
    q localq = new q(parambp.a, a(null, localas), localas);
    localq.a(ay.h);
    aj.a(this.d).a(localq, new o());
  }

  public final void b()
  {
    aj.a(this.d).a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.ar
 * JD-Core Version:    0.6.2
 */