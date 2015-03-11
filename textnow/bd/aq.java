package textnow.bd;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;

public final class aq
{
  private final bb a = new bb();
  private bt b;
  private final ab c = new ab();
  private Context d;
  private Object e;
  private volatile boolean f = false;
  private volatile ar g = new ar();

  private aq(Object paramObject, Context paramContext)
  {
    bz.b();
    if (paramObject == null)
      throw new IllegalArgumentException("Key inside the ImageLoader cannot be null!");
    this.d = paramContext.getApplicationContext();
    this.e = paramObject;
    this.b = bf.a(paramContext);
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

  public static aq a(Fragment paramFragment)
  {
    return new aq(paramFragment, paramFragment.getActivity());
  }

  private void a(ImageView paramImageView, p paramp, ar paramar, au paramau)
  {
    if (!paramp.g())
    {
      au localau = this.a.a(paramImageView);
      if (localau != null)
        this.b.a(localau);
      this.a.a(paramImageView, paramau);
    }
    if ((paramImageView != null) && (paramar.g))
    {
      if (paramar.h == null)
        break label89;
      paramImageView.setImageResource(paramar.h.intValue());
    }
    while (true)
    {
      this.b.a(this.e, paramp, paramau);
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
    bz.b();
    try
    {
      this.f = true;
      List localList = this.b.a(this.e);
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        if (localIterator.hasNext())
        {
          au localau = (au)localIterator.next();
          this.a.a(localau);
        }
      }
    }
    finally
    {
    }
  }

  public final void a(final ImageView paramImageView, String paramString, ar paramar, final at paramat)
  {
    if (paramImageView == null)
      throw new IllegalArgumentException("The method \"loadImage(ImageView, String)\" requires a non-null ImageView to be passed in.");
    if (!c())
      if (paramar != null)
        break label345;
    label304: label311: label345: for (final ar localar = this.g; ; localar = paramar)
    {
      if (paramat == null);
      bw localbw1;
      bw localbw2;
      final p localp;
      for (Object localObject1 = new au()
      {
        public final void a(String paramAnonymousString)
        {
          ImageView localImageView = aq.b(aq.this).a(this);
          if ((localImageView != null) && (localar.i != null))
            localImageView.setImageResource(localar.i.intValue());
        }

        public final void a(ay paramAnonymousay)
        {
          ImageView localImageView = aq.b(aq.this).a(this);
          if (localImageView != null)
            localImageView.setImageBitmap(paramAnonymousay.a());
        }
      }
      ; ; localObject1 = new au()
      {
        public final void a(String paramAnonymousString)
        {
          ImageView localImageView = aq.b(aq.this).a(this);
          if ((localImageView != null) && (localar.i != null))
            localImageView.setImageResource(localar.i.intValue());
        }

        public final void a(ay paramAnonymousay)
        {
          ImageView localImageView = aq.b(aq.this).a(this);
          paramat.a(localImageView, paramAnonymousay.a(), paramAnonymousay.b());
        }
      })
      {
        localbw1 = new bw();
        if (localar.a == null)
          break;
        localbw1.a = localar.a;
        localbw2 = localbw1;
        localp = new p(paramString, localbw2, localar);
        if (!bz.a())
          break label311;
        a(paramImageView, localp, localar, (au)localObject1);
        return;
      }
      Object localObject2 = localar.c;
      Integer localInteger1 = localar.b;
      v localv;
      Integer localInteger2;
      int j;
      if (localar.e)
      {
        localv = this.c.a(this.d);
        int i = localv.a.intValue();
        if (localObject2 == null)
          localObject2 = localv.a;
        localInteger2 = Integer.valueOf(Math.min(i, ((Integer)localObject2).intValue()));
        j = localv.b.intValue();
        if (localInteger1 != null)
          break label304;
      }
      for (Integer localInteger3 = localv.b; ; localInteger3 = localInteger1)
      {
        localInteger1 = Integer.valueOf(Math.min(j, localInteger3.intValue()));
        localObject2 = localInteger2;
        if ((localar.d) && (paramImageView != null))
        {
          Point localPoint = cc.a(paramImageView);
          localObject2 = a((Integer)localObject2, localPoint.x);
          localInteger1 = a(localInteger1, localPoint.y);
        }
        localbw1.b = ((Integer)localObject2);
        localbw1.c = localInteger1;
        localbw2 = localbw1;
        break;
      }
      new Handler(this.d.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          if (!aq.a(aq.this))
            aq.a(aq.this, paramImageView, localp, localar, this.d);
        }
      });
      return;
    }
  }

  public final void b()
  {
    ai.a(this.d).a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.aq
 * JD-Core Version:    0.6.2
 */