package textnow.be;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;

public class f extends at
{
  private static int[] q = new int[20];
  private static int r = 0;
  protected final int[] a = { 10, 20, 30 };
  protected String b;

  public f(ao paramao)
  {
    super(paramao);
  }

  private void a(String paramString, h paramh, RectF paramRectF, TextPaint paramTextPaint, Canvas paramCanvas)
  {
    int i = 0;
    r = 0;
    int j = 0;
    int i3;
    int i4;
    if (j < paramString.length())
    {
      i3 = paramTextPaint.breakText(paramString, j, paramString.length(), true, paramRectF.width(), null);
      if (i3 != 0)
      {
        if ((j + i3 >= paramString.length()) || (Character.isWhitespace(paramString.charAt(j + i3))))
          break label519;
        for (i4 = i3; (i4 > 0) && (!Character.isWhitespace(paramString.charAt(j + i4))); i4--);
        if (i4 == 0)
          break label519;
      }
    }
    while (true)
    {
      q[r] = i4;
      r = 1 + r;
      j += i4;
      break;
      int k = Math.max(1, (int)Math.floor(paramRectF.height() / paramTextPaint.getTextSize()));
      float f1 = Math.min(r, k);
      float f2 = f1 * paramTextPaint.getTextSize();
      boolean bool = this.i.e().e();
      float f3 = 0.0F;
      if (!bool)
        f3 = -paramTextPaint.descent();
      float f4;
      int n;
      int i1;
      label280: String str;
      float f5;
      float f6;
      switch (1.a[paramh.ordinal()])
      {
      default:
        f4 = paramRectF.top;
        int m = Math.round(f4);
        n = 0;
        i1 = m;
        if (i < f1)
        {
          str = paramString.substring(n, n + q[i]).trim();
          f5 = paramTextPaint.measureText(str);
          switch (1.a[paramh.ordinal()])
          {
          default:
            f6 = paramRectF.left;
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          }
        }
        break;
      case 1:
      case 4:
      case 7:
      case 2:
      case 5:
      case 8:
      case 3:
      case 6:
      case 9:
        while (true)
        {
          paramCanvas.drawText(str, f6, f3 + i1 + paramTextPaint.getTextSize(), paramTextPaint);
          i1 = (int)(i1 + paramTextPaint.getTextSize());
          int i2 = n + q[i];
          i++;
          n = i2;
          break label280;
          f4 = paramRectF.top;
          break;
          f4 = paramRectF.top + (paramRectF.height() - f2) / 2.0F;
          break;
          f4 = paramRectF.bottom - f2;
          break;
          f6 = paramRectF.left;
          continue;
          f6 = paramRectF.left + (paramRectF.width() - f5) / 2.0F;
          continue;
          f6 = paramRectF.right - f5;
        }
      }
      return;
      label519: i4 = i3;
    }
  }

  protected String a(as paramas, g paramg, long paramLong)
  {
    if (this.b != null)
      return this.b;
    return this.i.e().a(paramg.a);
  }

  public void a(as paramas, long paramLong)
  {
    if (!l());
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    h localh;
    int i4;
    String str1;
    int i5;
    do
    {
      g localg1;
      g localg2;
      float f1;
      do
      {
        au localau;
        do
        {
          return;
          localau = a(paramLong);
        }
        while (localau == null);
        localg1 = (g)localau.a;
        localg2 = (g)localau.b;
        f1 = localau.c;
        this.m = localg1.v;
      }
      while ((localg1.a == -1) || (!d(localg1.v)));
      i = m.a(localg1.f, localg2.f, localg1.g, localg2.g, f1);
      j = m.a(localg1.h, localg2.h, localg1.i, localg2.i, f1);
      k = m.a(localg1.j, localg2.j, localg1.k, localg2.k, f1);
      m = m.a(localg1.l, localg2.l, localg1.m, localg2.m, f1);
      n = m.a(localg1.n, localg2.n, localg1.o, localg2.o, f1);
      i1 = m.a(localg1.p, localg2.p, localg1.q, localg2.q, f1);
      i2 = m.a(localg1.r, localg2.r, localg1.s, localg2.s, f1);
      i3 = m.a(localg1.t, localg2.t, localg1.u, localg2.u, f1);
      float f2 = m.b(localg1.d, localg2.d, localg1.e, localg2.e, f1);
      localh = h.values()[localg1.c];
      i4 = this.a[localg1.b];
      str1 = a(paramas, localg1, paramLong);
      i5 = Math.round(f2 * str1.length());
    }
    while (i5 == 0);
    if (i5 != str1.length())
      if (str1.length() < i5)
        i5 = str1.length();
    for (String str2 = str1.substring(0, i5); ; str2 = str1)
    {
      Point localPoint1 = t.a(k, m, this.e.a);
      int i6 = i - localPoint1.x;
      int i7 = j - localPoint1.y;
      paramas.a(i6, i7, k, m, this.n, this.e.a);
      float f3 = paramas.c();
      float f4 = paramas.d();
      float f5 = paramas.e();
      float f6 = paramas.f();
      if (this.e.a() != null)
      {
        ah localah = this.e.a().c(paramas, paramLong);
        float f11 = f3 + Math.round(localah.a);
        float f12 = f4 + Math.round(localah.b);
        Point localPoint2 = t.a(Math.round(localah.f), Math.round(localah.g), this.e.b);
        f3 = f11 + localPoint2.x;
        f4 = f12 + localPoint2.y;
      }
      RectF localRectF1 = a(paramas, paramLong, new RectF(f3, f4, f5 + f3, f6 + f4));
      float f7 = Math.round(localRectF1.left);
      float f8 = Math.round(localRectF1.top);
      float f9 = Math.round(localRectF1.width());
      float f10 = Math.round(localRectF1.height());
      Canvas localCanvas = paramas.a;
      localCanvas.save();
      TextPaint localTextPaint = new TextPaint();
      localTextPaint.setColor(Color.argb(i3, n, i1, i2));
      localTextPaint.setTextSize(i4 * paramas.a(this.n));
      localTextPaint.setAntiAlias(true);
      localTextPaint.setTypeface(Typeface.create("helvetica", 1));
      RectF localRectF2 = new RectF(f7, f8, f9 + f7, f10 + f8);
      a(str2, localh, localRectF2, localTextPaint, localCanvas);
      localCanvas.restore();
      return;
    }
  }

  public final ah b(as paramas, long paramLong)
  {
    au localau = a(paramLong);
    if (localau != null)
    {
      g localg1 = (g)localau.a;
      g localg2 = (g)localau.b;
      float f1 = localau.c;
      if (localg1.a != -1)
      {
        float f2 = m.b(localg1.f, localg2.f, localg1.g, localg2.g, f1);
        float f3 = m.b(localg1.h, localg2.h, localg1.i, localg2.i, f1);
        float f4 = m.b(localg1.j, localg2.j, localg1.k, localg2.k, f1);
        float f5 = m.b(localg1.l, localg2.l, localg1.m, localg2.m, f1);
        PointF localPointF = t.a(f4, f5, this.e.a);
        paramas.a(f2 - localPointF.x, f3 - localPointF.y, f4, f5, this.n, this.e.a);
        float f6 = paramas.c();
        float f7 = paramas.d();
        float f8 = paramas.e();
        float f9 = paramas.f();
        if (this.e.a() != null)
        {
          ah localah = this.e.a().c(paramas, paramLong);
          float f10 = f6 + localah.a;
          float f11 = f7 + localah.b;
          Point localPoint = t.a(Math.round(localah.f), Math.round(localah.g), this.e.b);
          f6 = f10 + localPoint.x;
          f7 = f11 + localPoint.y;
        }
        RectF localRectF = a(paramas, paramLong, new RectF(f6, f7, f8 + f6, f9 + f7));
        return new ah(localRectF.left, localRectF.top, localRectF.width(), localRectF.height(), 1.0F, 1.0F, 0.0F);
      }
    }
    return ah.h;
  }

  public final void b()
  {
    this.b = null;
    super.b();
  }

  protected g c()
  {
    return new g(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.f
 * JD-Core Version:    0.6.2
 */