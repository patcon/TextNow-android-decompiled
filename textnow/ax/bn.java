package textnow.ax;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import com.tremorvideo.sdk.android.videoad.bc;
import com.tremorvideo.sdk.android.videoad.bd;
import com.tremorvideo.sdk.android.videoad.bg;
import com.tremorvideo.sdk.android.videoad.bh;
import com.tremorvideo.sdk.android.videoad.ei;
import com.tremorvideo.sdk.android.videoad.r;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bn extends at
  implements bg, bh
{
  int A = 0;
  int B = 0;
  int C = 0;
  int D = 0;
  int E = 0;
  int F = 0;
  int G = 0;
  int H = 0;
  double I = 0.0D;
  int J = 0;
  String K;
  String L;
  String M;
  int N;
  int O = 0;
  int P = 0;
  String Q = "Enter Zip";
  boolean R = false;
  String S;
  String T;
  String U;
  String V;
  String W;
  int X = 0;
  int Y;
  Bitmap Z;
  Paint a;
  Bitmap aa;
  boolean ab = true;
  int ac = r.E();
  ArrayList<bp> ad = new ArrayList();
  private final String ae = "Choose your cable provider  >";
  private final String af = "Choose your cable provider";
  private final String ag = ">";
  private final String ah = "Find Channels";
  private final String ai = "Searching...";
  private final String aj = "No Provider for Zip Code";
  private final String ak = "Enter Zip";
  private String al = "Searching...";
  private String am = "Choose your cable provider  >";
  Paint b;
  Paint q;
  Paint r;
  Paint s;
  Paint t;
  int u = 0;
  int v = 0;
  int w = 0;
  int x = 0;
  int y = 0;
  int z = 0;

  public bn(ao paramao)
  {
    super(paramao);
  }

  private int a(int paramInt1, int paramInt2)
  {
    if (this.D > 0)
      return this.D;
    int i = Math.round(m().measureText("Choose your cable provider  >")) + this.ac;
    int j = paramInt1 - i - e(paramInt2) - d(paramInt1);
    if (this.P == 0)
    {
      if (j - 4 > 0)
      {
        int m = j / 3;
        if (m > this.ac)
          m = this.ac;
        this.P = m;
      }
    }
    else
      if (j - 4 <= 0)
        break label159;
    label159: for (this.D = (paramInt1 - paramInt1 / 3 - 3 * this.P - e(paramInt2)); ; this.D = (paramInt1 - 3 * this.P - e(paramInt2)))
    {
      return this.D;
      int k = (paramInt1 - i - e(paramInt2)) / 3;
      if (k > this.ac)
        k = this.ac;
      this.P = k;
      break;
    }
  }

  private void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Paint localPaint = new Paint();
    localPaint.setColor(Color.argb(this.O, 255, 255, 255));
    localPaint.setStyle(Paint.Style.FILL);
    if (this.Y > 0)
    {
      paramCanvas.drawRoundRect(new RectF(paramInt1, paramInt2, -1 + (paramInt1 + paramInt3), -1 + (paramInt2 + paramInt4)), this.Y, this.Y, localPaint);
      return;
    }
    paramCanvas.drawRect(paramInt1, paramInt2, -1 + (paramInt1 + paramInt3), -1 + (paramInt2 + paramInt4), localPaint);
  }

  private int b(int paramInt1, int paramInt2)
  {
    Paint localPaint = c();
    int i = this.ac;
    if ((paramInt1 - Math.round(localPaint.measureText("Find Channels") + i) - a(paramInt1, paramInt2) - e(paramInt2) >= 0) && (this.P >= 4))
      return this.P;
    return -1;
  }

  private int c(int paramInt)
  {
    if (this.B > 0)
      return this.B;
    this.B = Math.round(20.0F + c().measureText(this.al));
    return this.B;
  }

  private Paint c()
  {
    if (this.b != null)
      return this.b;
    this.b = new Paint();
    this.b.setTextSize(this.ac);
    this.b.setColor(Color.parseColor(this.V));
    this.b.setTypeface(Typeface.create("helvetica", 0));
    this.b.setAntiAlias(true);
    this.b.setAlpha(this.O);
    return this.b;
  }

  private int d(int paramInt)
  {
    if (this.x > 0)
      return this.x;
    this.x = (paramInt / 3);
    return this.x;
  }

  private int e(int paramInt)
  {
    if (this.H > 0)
      return this.H;
    Paint localPaint = m();
    int i = this.ac;
    this.H = Math.round(localPaint.measureText("Enter Zip") + i * 3);
    return this.H;
  }

  private Paint m()
  {
    if (this.q != null)
      return this.q;
    this.q = new Paint();
    this.q.setTextSize(this.ac);
    this.q.setColor(-16777216);
    this.q.setTypeface(Typeface.create("helvetica", 0));
    this.q.setAntiAlias(true);
    this.q.setAlpha(this.O);
    return this.q;
  }

  public final void a()
  {
    super.a();
    this.u = 0;
    this.v = 0;
    this.E = 0;
    this.F = 0;
    this.G = 0;
    this.H = 0;
    this.w = 0;
    this.x = 0;
    this.C = 0;
    this.D = 0;
    this.a = null;
    this.b = null;
    this.r = null;
    this.s = null;
    this.t = null;
    this.J = 250;
    this.P = 0;
    this.ac = r.E();
  }

  public final void a(String paramString)
  {
    int i = 0;
    if (paramString != null);
    while (true)
    {
      StringBuffer localStringBuffer;
      int k;
      try
      {
        JSONArray localJSONArray = new JSONArray(paramString);
        int j;
        if (localJSONArray.length() > this.N)
        {
          j = this.N;
          localStringBuffer = new StringBuffer();
          k = 0;
          if (k >= j)
            break label179;
          if (k > 0)
          {
            if (k + 1 != j)
              break label167;
            if (k == 1)
              localStringBuffer.append(" or ");
          }
          else
          {
            String str = localJSONArray.getJSONObject(k).getString("channel");
            if (str == null)
              break label219;
            localStringBuffer.append(str);
            i = 1;
            break label219;
          }
        }
        else
        {
          j = localJSONArray.length();
          continue;
        }
        localStringBuffer.append(", or ");
        continue;
      }
      catch (Exception localException)
      {
        this.al = "Not Available";
        r.d("Failed to get Channel " + localException);
      }
      return;
      label167: localStringBuffer.append(", ");
      continue;
      label179: if ((i != 0) && (localStringBuffer.length() > 0))
      {
        this.al = this.M.replace("%CHANNEL#%", localStringBuffer.toString());
        return;
      }
      this.al = "Not Available";
      return;
      label219: k++;
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    int i = 0;
    if (paramString1 != null)
      try
      {
        this.ad.clear();
        JSONArray localJSONArray = new JSONArray(paramString1);
        int j = 0;
        while (i < localJSONArray.length())
        {
          JSONObject localJSONObject = localJSONArray.getJSONObject(i);
          String str1 = localJSONObject.getString("name");
          String str2 = localJSONObject.getString("lineupId");
          j = 1;
          this.ad.add(new bp(this, str1, str2));
          i++;
        }
        if (j != 0);
        for (this.am = "Choose your cable provider  >"; (paramString2 != null) && (paramString2.equals("launch")) && (!this.ad.isEmpty()); this.am = "No Provider for Zip Code")
        {
          this.i.e().c().a(bc.at, this, this.ad, this.T);
          return;
        }
      }
      catch (Exception localException)
      {
        r.d("Failed to get the Provider " + localException);
        this.am = "No Provider for Zip Code";
      }
  }

  public final void a(as paramas, long paramLong)
  {
    if (!l());
    bo localbo1;
    bo localbo2;
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
      localbo1 = (bo)localau.a;
      localbo2 = (bo)localau.b;
      f1 = localau.c;
      this.m = localbo1.k;
    }
    while (!d(localbo1.k));
    float f2 = m.b(localbo1.a, localbo2.a, localbo1.b, localbo2.b, f1);
    float f3 = m.b(localbo1.c, localbo2.c, localbo1.d, localbo2.d, f1);
    float f4 = m.b(localbo1.e, localbo2.e, localbo1.f, localbo2.f, f1);
    float f5 = m.b(localbo1.g, localbo2.g, localbo1.h, localbo2.h, f1);
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
    this.O = m.a(localbo1.i, localbo2.i, localbo1.j, localbo2.j, f1);
    int i = Math.round(f13);
    int j = Math.round(f12);
    int k = Math.round(f13);
    int m;
    int n;
    label512: int i1;
    int i2;
    int i3;
    int i4;
    label549: int i5;
    if (this.C > 0)
    {
      m = this.C;
      n = a(j, k);
      if (this.G <= 0)
      {
        if (b(j, k) <= 0)
          break label980;
        this.G = (j / 3 + this.P);
      }
      i1 = this.G;
      i2 = e(k);
      i3 = b(j, k);
      if (this.z <= 0)
        break label991;
      i4 = this.z;
      i5 = (j - i4) / 2;
      if (i5 >= i4)
        break label1777;
    }
    label666: label980: label991: label1777: for (int i6 = i4 + this.ac; ; i6 = i5)
    {
      c(k);
      localCanvas.saveLayerAlpha(new RectF(new Rect(-1 + Math.round(f10), Math.round(f11), 1 + Math.round(localRectF.right), Math.round(localRectF.bottom))), this.O, 1);
      localCanvas.translate(Math.round(f10), Math.round(f11));
      Paint localPaint1;
      int i7;
      if (this.r != null)
      {
        localPaint1 = this.r;
        i7 = k + 0;
        if (this.a == null)
          break label1072;
      }
      for (Paint localPaint2 = this.a; ; localPaint2 = this.a)
      {
        localCanvas.drawRect(0.0F, 0.0F, j + 0, k + 0, localPaint2);
        localCanvas.drawRect(0.0F, 0.0F, -1 + (j + 0), -1 + (k + 0), localPaint1);
        if (!this.R)
          break label1160;
        int i26 = this.ac;
        int i27 = i26 * 2;
        if (this.aa == null)
          this.aa = Bitmap.createScaledBitmap(BitmapFactory.decodeFile(this.i.e().b() + "/comps/station_finder/common/reset.png"), i27, i27, true);
        Paint localPaint7 = new Paint();
        localPaint7.setFilterBitmap(true);
        localPaint7.setAlpha(this.O);
        int i28 = Math.round(i / 2) - Math.round(i27 / 2);
        localCanvas.drawBitmap(this.aa, 0 + i26, i28, localPaint7);
        int i29 = c(i);
        Paint localPaint8 = c();
        int i30 = i6 + (i29 - (20 + Math.round(localPaint8.measureText(this.al)))) / 2;
        int i31 = 0 + Math.round((i - localPaint8.getTextSize()) / 2.0F);
        localCanvas.drawText(this.al, i30, i31 + localPaint8.getTextSize() - localPaint8.descent(), localPaint8);
        localCanvas.restore();
        return;
        this.C = (j - a(j, k) - this.P);
        m = this.C;
        break;
        this.G = this.P;
        break label512;
        this.z = (4 * this.ac);
        i4 = this.z;
        break label549;
        this.r = new Paint();
        this.r.setColor(Color.parseColor(this.W));
        this.r.setStyle(Paint.Style.STROKE);
        this.r.setAlpha(255 * this.X / 100);
        localPaint1 = this.r;
        break label666;
        int i8 = Color.parseColor(this.W);
        LinearGradient localLinearGradient = new LinearGradient(0.0F, 0, 0.0F, i7, i8, i8, Shader.TileMode.CLAMP);
        this.a = new Paint();
        this.a.setDither(true);
        this.a.setShader(localLinearGradient);
        this.a.setAlpha(255 * this.X / 100);
      }
      int i9 = a(n, i);
      Paint localPaint3 = m();
      int i10 = Math.round(localPaint3.measureText(">"));
      int i11 = 0 + Math.round((i - localPaint3.getTextSize()) / 2.0F);
      int i12 = this.ac;
      int i13 = m + Math.round(i12 / 2);
      int i14 = i12 * 3;
      int i15 = i / 2 - i14 / 2;
      a(localCanvas, m, i15, n, i14);
      if (this.am.equals("Choose your cable provider  >"))
      {
        localCanvas.drawText("Choose your cable provider", i13, i11 + localPaint3.getTextSize() - localPaint3.descent(), localPaint3);
        localCanvas.drawText(">", m + i9 - Math.round(i12 / 2) - i10, i11 + localPaint3.getTextSize() - localPaint3.descent(), localPaint3);
      }
      while (true)
      {
        int i16 = e(i);
        Paint localPaint4 = m();
        if (this.ab)
        {
          String str = this.i.e().a.d;
          this.ab = false;
          if ((str != null) && (str.length() > 0))
          {
            this.Q = str;
            this.am = "Searching...";
            new bq(this).execute(new String[] { "provider", null });
          }
        }
        int i17 = this.ac;
        int i18 = i17 * 3;
        int i19 = i / 2 - i18 / 2;
        int i20 = i1 + Math.round(i17 / 2);
        int i21 = Math.round(0 + Math.round((i - localPaint4.getTextSize()) / 2.0F) + localPaint4.getTextSize() - localPaint4.descent());
        a(localCanvas, i1, i19, i2, i18);
        localCanvas.drawText(this.Q, i20, i21, localPaint4);
        int i22 = i17 + Math.round(i17 / 2);
        if (this.Z == null)
          this.Z = Bitmap.createScaledBitmap(BitmapFactory.decodeFile(this.i.e().b() + "/comps/station_finder/common/magnifying_glass_large.png"), i22, i22, true);
        Paint localPaint5 = new Paint();
        localPaint5.setFilterBitmap(true);
        localPaint5.setAlpha(this.O);
        localCanvas.drawBitmap(this.Z, i1 + i16 - i17 / 2 - i22, i19 + i18 / 2 - i22 / 2, localPaint5);
        if (i3 < 0)
          break;
        int i23 = d(i1 - 1);
        Paint localPaint6 = c();
        int i24 = i3 + (i23 - Math.round(localPaint6.measureText("Find Channels"))) / 2;
        int i25 = 0 + Math.round((i - localPaint6.getTextSize()) / 2.0F);
        localCanvas.drawText("Find Channels", i24, i25 + localPaint6.getTextSize() - localPaint6.descent(), localPaint6);
        break;
        localCanvas.drawText(this.am, i13, i11 + localPaint3.getTextSize() - localPaint3.descent(), localPaint3);
      }
    }
  }

  public final void a(y paramy)
  {
    super.a(paramy);
    try
    {
      this.K = paramy.c();
      r.d("SceneObjectStationFinder JSON is" + this.K);
      JSONObject localJSONObject1 = new JSONObject(this.K);
      JSONObject localJSONObject2 = localJSONObject1.getJSONObject("params");
      this.U = localJSONObject1.getString("zip_path");
      this.L = localJSONObject2.getString("stationID");
      this.M = localJSONObject2.getString("stationMessage");
      this.N = Integer.parseInt(localJSONObject2.getString("numChannels"));
      this.V = localJSONObject2.getString("textColor");
      this.W = localJSONObject2.getString("backgroundColor");
      this.X = Integer.parseInt(localJSONObject2.getString("backgroundAlpha"));
      this.Y = Integer.parseInt(localJSONObject2.getString("cornerStyle"));
      this.j = true;
      return;
    }
    catch (Exception localException)
    {
      while (true)
        r.d("SceneObjectStationFinder Exception=" + localException);
    }
  }

  public final boolean a(int paramInt)
  {
    while (true)
    {
      int i;
      try
      {
        if ((this.S == null) || (this.T == null))
        {
          String str = m.b(this.i.e().b() + "/" + this.U + "native_config.txt");
          if ((str != null) && (str.length() > 0))
          {
            JSONArray localJSONArray = new JSONObject(str).getJSONArray("events");
            i = 0;
            if (i < localJSONArray.length())
            {
              JSONObject localJSONObject = localJSONArray.getJSONObject(i);
              if (localJSONObject.getString("name").equals("Interact_ZipCodeFinder_Click"))
                this.S = localJSONObject.getString("tag");
              else if (localJSONObject.getString("name").equals("Interact_SelectServiceProvider_Click"))
                this.T = localJSONObject.getString("tag");
            }
          }
        }
      }
      catch (Exception localException)
      {
        if (this.R)
        {
          if ((paramInt >= this.y) && (paramInt < this.y + this.z))
          {
            this.R = false;
            this.al = "Searching...";
          }
          return false;
        }
        if ((paramInt >= this.G) && (paramInt < this.G + this.H))
        {
          this.i.e().c().a(bc.au, this, null, this.S);
          return true;
        }
        if ((paramInt < this.C) || (paramInt >= this.C + this.D) || (this.am.equals("No Provider for Zip Code")) || (this.Q.equals("Enter Zip")))
          continue;
        if ((this.ad == null) || (this.ad.isEmpty()))
        {
          this.am = "Searching...";
          new bq(this).execute(new String[] { "provider", "launch" });
          continue;
        }
        this.i.e().c().a(bc.at, this, this.ad, this.T);
        return true;
      }
      i++;
    }
  }

  public final ah b(as paramas, long paramLong)
  {
    au localau = a(paramLong);
    if (localau != null)
    {
      bo localbo1 = (bo)localau.a;
      bo localbo2 = (bo)localau.b;
      float f1 = localau.c;
      float f2 = m.b(localbo1.a, localbo2.a, localbo1.b, localbo2.b, f1);
      float f3 = m.b(localbo1.c, localbo2.c, localbo1.d, localbo2.d, f1);
      float f4 = m.b(localbo1.e, localbo2.e, localbo1.f, localbo2.f, f1);
      float f5 = m.b(localbo1.g, localbo2.g, localbo1.h, localbo2.h, f1);
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

  public final void b()
  {
    super.b();
    this.R = false;
    this.al = "Searching...";
    this.am = "Choose your cable provider  >";
    this.ab = true;
    this.Q = "Enter Zip";
    if (this.ad != null)
      this.ad.clear();
  }

  public final void b(int paramInt)
  {
    r.d("SceneObjectStationFinder:onProviderSelected at position=" + paramInt);
    this.R = true;
    String str = ((bp)this.ad.get(paramInt)).b;
    new bq(this).execute(new String[] { "channel", null, str });
  }

  public final void d(String paramString)
  {
    if ((this.Q.equals(paramString)) && (this.ad != null) && (!this.ad.isEmpty()));
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        this.am = "Searching...";
        this.ad.clear();
        this.Q = paramString;
        r.d("SceneObjectStationFinder:onZipChanged zip=" + this.Q);
        new bq(this).execute(new String[] { "provider", null });
      }
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.bn
 * JD-Core Version:    0.6.2
 */