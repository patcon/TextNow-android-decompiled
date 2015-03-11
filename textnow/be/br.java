package textnow.be;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.tremorvideo.sdk.android.videoad.bc;
import com.tremorvideo.sdk.android.videoad.bd;
import com.tremorvideo.sdk.android.videoad.r;
import java.util.GregorianCalendar;

public final class br extends at
{
  double A = 0.0D;
  int B = 0;
  Paint a;
  Paint b;
  Paint q;
  Paint r;
  Paint s;
  int t = 0;
  int u = 0;
  int v = 0;
  int w = 0;
  int x = 0;
  int y = 0;
  int z;

  public br(ao paramao)
  {
    super(paramao);
  }

  private int a(int paramInt1, int paramInt2)
  {
    if (this.t > 0)
      return this.t;
    this.t = (2 + (0 + d(paramInt2)));
    return this.t;
  }

  private Paint a(l paraml, int paramInt)
  {
    if (paraml == l.a)
      return b(paramInt);
    if (paraml == l.c)
    {
      if (this.s != null)
        return this.s;
      this.s = new Paint();
      this.s.setTextSize(0.4F * paramInt);
      this.s.setColor(-1);
      this.s.setAntiAlias(true);
      return this.s;
    }
    if (paraml == l.b)
    {
      if (this.r != null)
        return this.r;
      this.r = new Paint();
      this.r.setTextSize(0.4F * paramInt);
      this.r.setColor(-1);
      this.r.setAntiAlias(true);
      this.r.setFakeBoldText(true);
      return this.r;
    }
    return b(paramInt);
  }

  private void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramCanvas.save();
    k[] arrayOfk = this.i.e().o();
    int i = 0;
    if (arrayOfk != null)
    {
      int i3 = arrayOfk.length;
      i = 0;
      int i4 = 0;
      while (i4 < i3)
      {
        k localk2 = arrayOfk[i4];
        if (localk2.c == 0)
          localk2.c = Math.round(a(localk2.a, paramInt4).measureText(localk2.b));
        int i5 = i + localk2.c;
        i4++;
        i = i5;
      }
    }
    this.z = i;
    int j = paramInt1 + 2 + e(paramInt3);
    b(paramCanvas, paramInt1, 0, paramInt3, paramInt4);
    paramCanvas.clipRect(paramInt1 + 2, 0, -2 + (paramInt1 + paramInt3), paramInt4);
    if (arrayOfk == null)
    {
      Paint localPaint2 = b(paramInt4);
      int i2 = Math.round((paramInt4 - localPaint2.getTextSize()) / 2.0F);
      paramCanvas.drawText("Loading Show Times...", j, i2 + localPaint2.getTextSize() - localPaint2.descent(), localPaint2);
    }
    while (true)
    {
      paramCanvas.restore();
      return;
      int k = arrayOfk.length;
      int m = 0;
      int n = j;
      while (m < k)
      {
        k localk1 = arrayOfk[m];
        Paint localPaint1 = a(localk1.a, paramInt4);
        int i1 = Math.round((paramInt4 - localPaint1.getTextSize()) / 2.0F);
        paramCanvas.save();
        paramCanvas.translate(n, i1 + localPaint1.getTextSize() - localPaint1.descent());
        paramCanvas.drawText(localk1.b, 0.0F, 0.0F, localPaint1);
        paramCanvas.restore();
        n += localk1.c;
        m++;
      }
    }
  }

  private int b(int paramInt1, int paramInt2)
  {
    if (this.w > 0)
      return this.w;
    this.w = (2 + (a(paramInt1, paramInt2) + c(paramInt2)));
    return this.w;
  }

  private Paint b(int paramInt)
  {
    if (this.b != null)
      return this.b;
    this.b = new Paint();
    this.b.setTextSize(0.4F * paramInt);
    this.b.setColor(-1);
    this.b.setAntiAlias(true);
    return this.b;
  }

  private void b(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Paint localPaint1;
    int i;
    if (this.q != null)
    {
      localPaint1 = this.q;
      i = paramInt2 + paramInt4;
      if (this.a == null)
        break label126;
    }
    for (Paint localPaint2 = this.a; ; localPaint2 = this.a)
    {
      paramCanvas.drawRect(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4, localPaint2);
      paramCanvas.drawRect(paramInt1, paramInt2, -1 + (paramInt1 + paramInt3), -1 + (paramInt2 + paramInt4), localPaint1);
      return;
      this.q = new Paint();
      this.q.setColor(Color.argb(255, 73, 73, 73));
      this.q.setStyle(Paint.Style.STROKE);
      localPaint1 = this.q;
      break;
      label126: int[] arrayOfInt = new int[3];
      arrayOfInt[0] = Color.argb(255, 54, 54, 54);
      arrayOfInt[1] = Color.argb(255, 35, 35, 35);
      arrayOfInt[2] = Color.argb(255, 35, 35, 35);
      float[] arrayOfFloat = { 0.0F, 0.75F, 1.0F };
      LinearGradient localLinearGradient = new LinearGradient(0.0F, paramInt2, 0.0F, i, arrayOfInt, arrayOfFloat, Shader.TileMode.CLAMP);
      this.a = new Paint();
      this.a.setDither(true);
      this.a.setShader(localLinearGradient);
    }
  }

  private int c(int paramInt)
  {
    if (this.u > 0)
      return this.u;
    this.u = Math.round(20.0F + b(paramInt).measureText("0000-00-00"));
    return this.u;
  }

  private int d(int paramInt)
  {
    if (this.y > 0)
      return this.y;
    this.y = Math.round(20.0F + b(paramInt).measureText("00000"));
    return this.y;
  }

  private int e(int paramInt)
  {
    if (this.i.e().o() == null)
      return 0;
    if (this.A <= -(paramInt + this.z))
      this.A = 0.0D;
    return paramInt + (int)this.A;
  }

  public final void a()
  {
    super.a();
    this.t = 0;
    this.u = 0;
    this.v = 0;
    this.w = 0;
    this.x = 0;
    this.y = 0;
    this.a = null;
    this.b = null;
    this.q = null;
    this.r = null;
    this.s = null;
    this.B = 250;
    k[] arrayOfk = this.i.e().o();
    if (arrayOfk != null)
    {
      int i = arrayOfk.length;
      for (int j = 0; j < i; j++)
        arrayOfk[j].c = 0;
    }
  }

  public final void a(aj paramaj, long paramLong)
  {
    if ((this.i.e().o() != null) && (this.z != 0))
    {
      if (this.B > 0)
      {
        this.B = ((int)Math.max(0L, this.B - paramLong));
        if (this.B == 0)
        {
          a();
          this.B = 0;
        }
      }
      double d = 0.2D * this.v;
      this.A -= d * paramLong / 1000.0D;
    }
  }

  public final void a(as paramas, long paramLong)
  {
    if (!l());
    bs localbs1;
    bs localbs2;
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
      localbs1 = (bs)localau.a;
      localbs2 = (bs)localau.b;
      f1 = localau.c;
      this.m = localbs1.i;
    }
    while (!d(localbs1.i));
    float f2 = m.b(localbs1.a, localbs2.a, localbs1.b, localbs2.b, f1);
    float f3 = m.b(localbs1.c, localbs2.c, localbs1.d, localbs2.d, f1);
    float f4 = m.b(localbs1.e, localbs2.e, localbs1.f, localbs2.f, f1);
    float f5 = m.b(localbs1.g, localbs2.g, localbs1.h, localbs2.h, f1);
    Canvas localCanvas = paramas.a;
    PointF localPointF = t.a(f4, f5, this.e.a);
    paramas.a(f2 - localPointF.x, f3 - localPointF.y, f4, f5, this.n, this.e.a);
    float f6 = paramas.c();
    float f7 = paramas.d();
    float f8 = paramas.e();
    float f9 = paramas.f();
    if (this.e.a() != null)
    {
      ah localah = this.e.a().c(paramas, paramLong);
      float f14 = f6 + localah.a;
      float f15 = f7 + localah.b;
      Point localPoint = t.a(Math.round(localah.f), Math.round(localah.g), this.e.b);
      f6 = f14 + localPoint.x;
      f7 = f15 + localPoint.y;
    }
    RectF localRectF = a(paramas, paramLong, new RectF(f6, f7, f8 + f6, f9 + f7));
    float f10 = localRectF.left;
    float f11 = localRectF.top;
    float f12 = localRectF.width();
    float f13 = localRectF.height();
    int i = Math.round(f13);
    int j = Math.round(f12);
    int k = Math.round(f13);
    int m = d(k);
    int n = a(j, k);
    int i1 = c(k);
    int i2 = b(j, k);
    if (this.v > 0);
    for (int i4 = this.v; ; i4 = this.v)
    {
      localCanvas.save();
      localCanvas.translate(Math.round(f10), Math.round(f11));
      int i5 = d(i);
      Paint localPaint1 = b(i);
      String str1 = this.i.e().p();
      int i6 = 0 + (i5 - Math.round(localPaint1.measureText(str1))) / 2;
      int i7 = 0 + Math.round((i - localPaint1.getTextSize()) / 2.0F);
      b(localCanvas, 0, 0, m, i);
      localCanvas.drawText(str1, i6, i7 + localPaint1.getTextSize() - localPaint1.descent(), localPaint1);
      a(localCanvas, i2, 0, i4, i);
      int i8 = c(i);
      int i9 = i + 0;
      int i10 = n + 0;
      Paint localPaint2 = b(i);
      GregorianCalendar localGregorianCalendar = this.i.e().q();
      int i11 = localGregorianCalendar.get(1);
      int i12 = localGregorianCalendar.get(5);
      int i13 = 1 + localGregorianCalendar.get(2);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(i11);
      arrayOfObject[1] = Integer.valueOf(i13);
      arrayOfObject[2] = Integer.valueOf(i12);
      String str2 = String.format("%d-%02d-%02d", arrayOfObject);
      int i14 = i10 + (i8 - Math.round(localPaint2.measureText(str2))) / 2;
      int i15 = 0 + Math.round((i9 - localPaint2.getTextSize()) / 2.0F);
      b(localCanvas, n, 0, i1, i);
      localCanvas.drawText(str2, i14, i15 + localPaint2.getTextSize() - localPaint2.descent(), localPaint2);
      localCanvas.restore();
      return;
      int i3 = b(j, k);
      this.v = (Math.round(j) - i3);
    }
  }

  public final void a(y paramy)
  {
    super.a(paramy);
    this.j = true;
  }

  public final boolean a(int paramInt)
  {
    int k;
    int m;
    label97: k localk;
    if ((paramInt >= this.x) && (paramInt < this.x + this.y))
    {
      this.i.e().c().a(bc.J);
      if ((paramInt >= this.w) && (paramInt <= this.w + this.v))
      {
        int i = e(this.v) + this.w;
        k[] arrayOfk = this.i.e().o();
        if (arrayOfk == null)
          break label266;
        int j = arrayOfk.length;
        k = 0;
        m = i;
        if (k >= j)
          break label266;
        localk = arrayOfk[k];
        if ((m >= paramInt) || (m + localk.c < paramInt))
          break label250;
      }
    }
    while (true)
    {
      if ((localk != null) && (localk.d != null) && (localk.d != ""))
      {
        r.d("TMS URL: " + localk.d);
        bd localbd = this.i.e().c();
        localbd.a(bc.I);
        localbd.b(localk.d);
      }
      return false;
      if ((paramInt < this.t) || (paramInt >= this.t + this.u))
        break;
      this.i.e().c().a(bc.K);
      return true;
      label250: m += localk.c;
      k++;
      break label97;
      label266: localk = null;
    }
  }

  public final ah b(as paramas, long paramLong)
  {
    au localau = a(paramLong);
    if (localau != null)
    {
      bs localbs1 = (bs)localau.a;
      bs localbs2 = (bs)localau.b;
      float f1 = localau.c;
      float f2 = m.b(localbs1.a, localbs2.a, localbs1.b, localbs2.b, f1);
      float f3 = m.b(localbs1.c, localbs2.c, localbs1.d, localbs2.d, f1);
      float f4 = m.b(localbs1.e, localbs2.e, localbs1.f, localbs2.f, f1);
      float f5 = m.b(localbs1.g, localbs2.g, localbs1.h, localbs2.h, f1);
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
      return new ah(localRectF.left, localRectF.top, localRectF.right - localRectF.left, localRectF.bottom - localRectF.top, 1.0F, 1.0F, 0.0F);
    }
    return ah.h;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.be.br
 * JD-Core Version:    0.6.2
 */