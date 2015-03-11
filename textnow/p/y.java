package textnow.p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.widget.f;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.enflick.android.TextNow.views.AvatarView;
import com.enflick.android.TextNow.views.TintedFrameLayout;
import com.enflick.android.TextNow.views.TintedLinearLayout;
import com.enflick.android.TextNow.views.emoticons.d;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;
import textnow.ad.a;
import textnow.bk.ar;
import textnow.bk.as;
import textnow.bk.au;
import textnow.bk.bb;
import textnow.v.b;
import textnow.v.g;
import textnow.v.o;
import textnow.z.h;
import textnow.z.m;
import textnow.z.u;

public final class y extends f
  implements View.OnClickListener
{
  private static final Map<Integer, Integer> n = new HashMap();
  private static as y;
  private a A;
  private final z B;
  private final Map<Long, String> j = new TreeMap();
  private final Set<String> k = new HashSet();
  private long l = 0L;
  private View m = null;
  private long o = -1L;
  private String p = null;
  private d q;
  private boolean r;
  private boolean s;
  private String t = "";
  private boolean u;
  private u v;
  private ar w;
  private au x;
  private h z;

  static
  {
    as localas = new as();
    y = localas;
    localas.h = Integer.valueOf(2130837994);
    y.i = Integer.valueOf(2130837995);
    y.b = Integer.valueOf(250);
    y.c = Integer.valueOf(250);
    n.put(Integer.valueOf(0), Integer.valueOf(2130903165));
    n.put(Integer.valueOf(1), Integer.valueOf(2130903155));
    n.put(Integer.valueOf(2), Integer.valueOf(2130903170));
    n.put(Integer.valueOf(3), Integer.valueOf(2130903160));
    n.put(Integer.valueOf(4), Integer.valueOf(2130903166));
    n.put(Integer.valueOf(5), Integer.valueOf(2130903168));
    n.put(Integer.valueOf(6), Integer.valueOf(2130903156));
    n.put(Integer.valueOf(7), Integer.valueOf(2130903157));
    n.put(Integer.valueOf(8), Integer.valueOf(2130903163));
    n.put(Integer.valueOf(9), Integer.valueOf(2130903161));
    n.put(Integer.valueOf(12), Integer.valueOf(2130903167));
    n.put(Integer.valueOf(13), Integer.valueOf(2130903169));
    n.put(Integer.valueOf(14), Integer.valueOf(2130903159));
    n.put(Integer.valueOf(15), Integer.valueOf(2130903158));
    n.put(Integer.valueOf(16), Integer.valueOf(2130903164));
    n.put(Integer.valueOf(17), Integer.valueOf(2130903162));
  }

  public y(Context paramContext, Cursor paramCursor, int paramInt, z paramz, ar paramar, boolean paramBoolean1, boolean paramBoolean2, h paramh)
  {
    super(paramContext, null, 0);
    this.B = paramz;
    this.q = d.a(paramContext);
    this.w = paramar;
    this.x = new au()
    {
      public final void a(ImageView paramAnonymousImageView, Bitmap paramAnonymousBitmap, bb paramAnonymousbb)
      {
        Context localContext = y.a(y.this);
        if ((paramAnonymousbb == bb.b) || (paramAnonymousbb == bb.c));
        for (boolean bool = true; ; bool = false)
        {
          textnow.v.z.a(localContext, paramAnonymousImageView, paramAnonymousBitmap, bool);
          return;
        }
      }

      public final void a(String paramAnonymousString)
      {
      }
    };
    this.r = paramBoolean1;
    this.s = paramBoolean2;
    a(paramh);
    this.v = new u(paramContext);
    l();
  }

  private int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      switch (paramInt2)
      {
      default:
        return 1;
      case 0:
        if (this.u)
          return 17;
        return 9;
      case 2:
        return 3;
      case 100:
        if (this.u)
          return 14;
        return 6;
      case 101:
        if (this.u)
          return 15;
        return 7;
      case 8:
      }
      if (this.u)
        return 16;
      return 8;
    }
    switch (paramInt2)
    {
    default:
      return 0;
    case 2:
      return 2;
    case 103:
      if (this.u)
        return 13;
      return 5;
    case 102:
    }
    if (this.u)
      return 12;
    return 4;
  }

  private static String a(m paramm)
  {
    switch (paramm.g())
    {
    case 5:
    case 6:
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 7:
    case 8:
    case 9:
    case 0:
    }
    while (true)
    {
      return "";
      return paramm.e();
      try
      {
        JSONObject localJSONObject = new JSONObject(paramm.e());
        if (localJSONObject.has("string"))
        {
          String str = localJSONObject.getString("string");
          return str;
        }
      }
      catch (Exception localException)
      {
      }
    }
    return paramm.e();
  }

  private Spannable b(String paramString)
  {
    Spannable localSpannable = Spannable.Factory.getInstance().newSpannable(paramString);
    if (!TextUtils.isEmpty(this.t))
    {
      int i = paramString.toLowerCase(Locale.US).indexOf(this.t, 0);
      if (i >= 0)
      {
        int i1 = i + this.t.length();
        localSpannable.setSpan(new BackgroundColorSpan(this.d.getResources().getColor(2131230820)), i, i1, 33);
      }
    }
    return localSpannable;
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    m localm = new m(paramCursor);
    int i = localm.h();
    int i1 = localm.l();
    int i2 = localm.g();
    int i3 = a(i, i2);
    Integer localInteger = (Integer)n.get(Integer.valueOf(i3));
    if (localInteger == null)
      localInteger = Integer.valueOf(2130903155);
    View localView = localLayoutInflater.inflate(localInteger.intValue(), paramViewGroup, false);
    localView.setTag(new aa(localView, i2, i1, i));
    return localView;
  }

  public final void a(long paramLong)
  {
    this.l = paramLong;
  }

  public final void a(View paramView)
  {
    this.m = paramView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    m localm = new m(paramCursor);
    int i = localm.g();
    int i1 = localm.l();
    int i2 = localm.j();
    aa localaa1 = (aa)paramView.getTag();
    aa localaa3;
    boolean bool1;
    label252: int i21;
    label293: label319: int i20;
    if ((localaa1 == null) || (localaa1.p != i))
    {
      aa localaa2 = new aa(paramView, i, i1, -1);
      paramView.setTag(localaa2);
      localaa3 = localaa2;
      localaa3.q = i1;
      localaa3.a = localm;
      int i3 = paramCursor.getPosition();
      int i4 = paramCursor.getInt(2);
      if ((i4 == 1) || (i4 == 2))
      {
        long l1 = paramCursor.getLong(8);
        int i5 = paramCursor.getInt(4);
        String str1 = paramCursor.getString(6);
        if (paramCursor.moveToNext())
        {
          int i22 = paramCursor.getInt(2);
          long l2 = paramCursor.getLong(8);
          int i23 = paramCursor.getInt(4);
          String str7 = paramCursor.getString(6);
          paramCursor.moveToPosition(i3);
          if (((i22 == 1) || (i22 == 2)) && (i5 == i23) && (str1.equals(str7)) && (l2 - l1 < 300000L))
          {
            bool1 = true;
            localaa3.s = bool1;
            if (localaa3.c != null)
            {
              if (this.z == null)
                break label900;
              AvatarView localAvatarView = localaa3.c;
              if (!localaa3.s)
                break label819;
              i21 = 8;
              localAvatarView.setVisibility(i21);
              if (this.A == null)
                break label825;
              localaa3.c.a(this.A);
            }
            if (localaa3.o != null)
            {
              View localView3 = localaa3.o;
              if (!localaa3.s)
                break label913;
              i20 = 8;
              label346: localView3.setVisibility(i20);
            }
            if (Build.VERSION.SDK_INT < 11)
            {
              int i16 = paramView.getPaddingLeft();
              int i17 = paramView.getPaddingRight();
              int i18 = paramView.getPaddingTop();
              int i19 = paramView.getPaddingBottom();
              if (!b(paramView))
                break label919;
              paramView.setBackgroundDrawable(this.d.getResources().getDrawable(2130837585));
              label410: paramView.setPadding(i16, i18, i17, i19);
            }
            switch (i)
            {
            default:
            case 0:
            case 1:
            case 2:
            case 103:
            }
          }
        }
      }
    }
    while (true)
      while (true)
      {
        String str3 = b.a(localaa3.a.i(), this.v.r());
        int i11;
        label541: label573: label606: int i10;
        label661: float f;
        label682: label706: label740: String str4;
        label806: label819: label825: label977: label986: label993: TextView localTextView5;
        label900: label913: label919: int i14;
        if (localaa3.e != null)
        {
          if ((!this.v.D()) || (localaa3.p != 1))
            break label1768;
          TextView localTextView3 = localaa3.e;
          if (localaa3.a.f() == this.l)
          {
            i11 = 0;
            localTextView3.setVisibility(i11);
            if (localaa3.a.f() == this.l)
              this.m = localaa3.e;
            if (localaa3.q != 1)
              break label1780;
            localaa3.e.setText(paramContext.getString(2131296581, new Object[] { str3 }));
          }
        }
        else
        {
          if (((localaa3.p == 2) || (localaa3.p == 1)) && (localaa3.i != null))
          {
            if (localaa3.r != 2)
              break label1834;
            View localView2 = localaa3.i;
            if (!localaa3.s)
              break label1793;
            i10 = 2130837691;
            localView2.setBackgroundResource(i10);
            if (localaa3.q != 1)
              break label1801;
            f = 0.8F;
            if (!(localaa3.i instanceof TintedFrameLayout))
              break label1807;
            ((TintedFrameLayout)localaa3.i).a(f);
          }
          if (localaa3.g != null)
          {
            if (i2 != 1)
              break label2113;
            localaa3.g.setImageResource(2130837937);
            localaa3.g.setVisibility(0);
          }
          if ((localaa3.u == null) || (!this.r))
            break label2137;
          localaa3.u.setVisibility(0);
          if (localm.h() == 1)
          {
            str4 = localm.c();
            if ((!TextUtils.isEmpty(str4)) && (localaa3.p != 0))
              break label2126;
            localaa3.u.setVisibility(8);
          }
          return;
          bool1 = false;
          break label252;
          bool1 = false;
          break label252;
          i21 = 0;
          break label293;
          if ("support@enflick.com".equalsIgnoreCase(this.z.c()))
          {
            localaa3.c.setImageResource(2130837562);
            break label319;
          }
          if (this.z.d() == 5)
          {
            localaa3.c.a(localm.c());
            break label319;
          }
          localaa3.c.a(this.z.p());
          break label319;
          localaa3.c.setVisibility(8);
          break label319;
          i20 = 0;
          break label346;
          paramView.setBackgroundColor(0);
          break label410;
          if (localaa3.n != null)
          {
            if (!paramCursor.moveToPrevious())
              break label1255;
            if (new m(paramCursor).l() == i1)
              break label1242;
            if (i1 == 1)
            {
              localaa3.t.setText(2131296577);
              localaa3.n.setVisibility(0);
              paramCursor.moveToNext();
            }
          }
          else if (localaa3.p == 0)
          {
            localTextView5 = localaa3.d;
            i14 = 1;
          }
        }
        try
        {
          JSONObject localJSONObject = new JSONObject(localaa3.a.e());
          if (localJSONObject.has("string"))
            localTextView5.setText(b(localJSONObject.getString("string")));
          TypedArray localTypedArray;
          if ((localJSONObject.has("type")) && (localaa3.h != null))
          {
            int i15 = localJSONObject.getInt("type");
            localTypedArray = this.d.obtainStyledAttributes(new int[] { 2130772255, 2130772256, 2130772257 });
            switch (i15)
            {
            case 103:
            default:
            case 100:
            case 104:
            case 101:
            case 102:
            }
          }
          Spannable localSpannable;
          while (true)
          {
            localTypedArray.recycle();
            if (i14 != 0)
              break;
            localSpannable = b(localaa3.a.e());
            if (localaa3.i == null)
              break label1328;
            localaa3.d.setText(localSpannable, TextView.BufferType.EDITABLE);
            Linkify.addLinks(localaa3.d, 15);
            this.q.a(localaa3.d);
            localaa3.d.setMovementMethod(null);
            break;
            localaa3.t.setText(2131296578);
            break label977;
            label1242: localaa3.n.setVisibility(8);
            break label986;
            label1255: localaa3.n.setVisibility(8);
            break label993;
            localaa3.h.setImageResource(localTypedArray.getResourceId(0, 2130837946));
            continue;
            localaa3.h.setImageResource(localTypedArray.getResourceId(1, 2130837942));
            continue;
            localaa3.h.setImageResource(localTypedArray.getResourceId(2, 2130837944));
          }
          label1328: localaa3.d.setText(localSpannable, TextView.BufferType.EDITABLE);
          Linkify.addLinks(localaa3.d, 15);
          this.q.a(localaa3.d);
          localaa3.d.setMovementMethod(null);
          continue;
          String str5 = localaa3.a.e();
          String str6 = localaa3.a.k();
          if (!TextUtils.isEmpty(str6))
          {
            if (str6.startsWith("content://"))
              str6 = g.a(this.d, str6);
            if (!TextUtils.isEmpty(str6))
            {
              if (str6.toLowerCase().startsWith("http"))
              {
                this.w.a(localaa3.f, str6, y, this.x);
                continue;
              }
              this.w.a(localaa3.f, Uri.fromFile(new File(str6)).toString(), y, this.x);
            }
          }
          else if (!TextUtils.isEmpty(str5))
          {
            this.w.a(localaa3.f, str5 + "&thumb=" + 250, y, this.x);
          }
          else
          {
            localaa3.f.setImageResource(2130837994);
            continue;
            str2 = localaa3.a.e();
          }
        }
        catch (Exception localException2)
        {
          try
          {
            String str2;
            if (TextUtils.isEmpty(str2));
            for (int i12 = 0; ; i12 = Integer.valueOf(str2).intValue())
            {
              if ((i12 >= 0) || (localaa3.j == null))
                break label1639;
              localaa3.j.setVisibility(8);
              break;
            }
            label1639: localaa3.j.setVisibility(0);
            if (localaa3.l != null)
            {
              int i13 = (i12 + 59) / 60;
              TextView localTextView4 = localaa3.l;
              Resources localResources3 = this.d.getResources();
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = Integer.valueOf(i13);
              localTextView4.setText(localResources3.getQuantityString(2131689477, i13, arrayOfObject));
              localaa3.m.setOnClickListener(this);
              if (this.s)
                localaa3.m.setVisibility(8);
              this.k.add(localaa3.a.a());
              continue;
              i11 = 8;
              break label541;
              label1768: localaa3.e.setVisibility(0);
              break label573;
              label1780: localaa3.e.setText(str3);
              break label606;
              label1793: i10 = 2130837690;
              break label661;
              label1801: f = 1.0F;
              break label682;
              label1807: if (!(localaa3.i instanceof TintedLinearLayout))
                break label706;
              ((TintedLinearLayout)localaa3.i).a(f);
              break label706;
              label1834: boolean bool2 = textnow.v.y.a(this.v.ab().intValue());
              View localView1 = localaa3.i;
              int i6;
              label1869: int i9;
              label1912: int i8;
              if (localaa3.s)
              {
                i6 = 2130837689;
                localView1.setBackgroundResource(i6);
                if (localaa3.d != null)
                {
                  TextView localTextView2 = localaa3.d;
                  Resources localResources2 = this.d.getResources();
                  if (!this.u)
                    break label2029;
                  i9 = 2131230926;
                  localTextView2.setTextColor(localResources2.getColorStateList(i9));
                }
                if (localaa3.u != null)
                {
                  TextView localTextView1 = localaa3.u;
                  Resources localResources1 = this.d.getResources();
                  if (!this.u)
                    break label2050;
                  i8 = 2131230927;
                  label1960: localTextView1.setTextColor(localResources1.getColorStateList(i8));
                }
                if (!this.u)
                  break label2071;
              }
              label2050: label2071: for (int i7 = this.d.getResources().getColor(2131230816); ; i7 = textnow.v.y.b(this.d, 2130772245))
              {
                if (!(localaa3.i instanceof TintedFrameLayout))
                  break label2086;
                ((TintedFrameLayout)localaa3.i).a(i7);
                break;
                i6 = 2130837688;
                break label1869;
                label2029: if (bool2)
                {
                  i9 = 2131230926;
                  break label1912;
                }
                i9 = 2131230928;
                break label1912;
                if (bool2)
                {
                  i8 = 2131230927;
                  break label1960;
                }
                i8 = 2131230929;
                break label1960;
              }
              label2086: if (!(localaa3.i instanceof TintedLinearLayout))
                break label706;
              ((TintedLinearLayout)localaa3.i).a(i7);
              break label706;
              label2113: localaa3.g.setVisibility(8);
              break label740;
              label2126: localaa3.u.setText(str4);
              return;
              label2137: if (localaa3.u == null)
                break label806;
              localaa3.u.setVisibility(8);
              return;
              localaa3 = localaa1;
              break;
              localException2 = localException2;
              i14 = 0;
            }
          }
          catch (Exception localException1)
          {
          }
        }
      }
  }

  public final void a(String paramString)
  {
    this.t = paramString;
  }

  public final void a(h paramh)
  {
    this.z = paramh;
    if ((this.z != null) && (this.z.d() != 5) && (!"support@enflick.com".equalsIgnoreCase(this.z.c())))
    {
      Bitmap localBitmap = o.a(this.d).a(Uri.parse(this.z.h()), 2130837558, false, true);
      if (localBitmap != null)
        this.A = new a(localBitmap);
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.r = true;
  }

  public final boolean a(View paramView, boolean paramBoolean)
  {
    boolean bool = true;
    aa localaa2;
    if (paramBoolean)
      if (!b(paramView))
      {
        localaa2 = (aa)paramView.getTag();
        if (localaa2.a != null)
        {
          if (!bool)
            break label110;
          this.j.put(Long.valueOf(localaa2.a.f()), a(localaa2.a));
          label64: if (this.B != null)
          {
            z localz = this.B;
            localaa2.a.f();
            this.j.size();
            localz.q();
          }
        }
      }
    label110: aa localaa1;
    do
    {
      return bool;
      bool = false;
      break;
      this.j.remove(Long.valueOf(localaa2.a.f()));
      break label64;
      localaa1 = (aa)paramView.getTag();
    }
    while (localaa1.a == null);
    this.o = localaa1.a.f();
    this.p = localaa1.a.e();
    return bool;
  }

  public final boolean b(View paramView)
  {
    aa localaa = (aa)paramView.getTag();
    return (localaa != null) && (localaa.a != null) && (this.j.containsKey(Long.valueOf(localaa.a.f())));
  }

  public final long c()
  {
    return this.l;
  }

  public final View d()
  {
    return this.m;
  }

  public final Set<Long> e()
  {
    return this.j.keySet();
  }

  public final Set<String> f()
  {
    return this.k;
  }

  public final String g()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.j.entrySet().iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (i == 0)
        localStringBuilder.append("\n");
      while (true)
      {
        localStringBuilder.append((String)localEntry.getValue());
        break;
        i = 0;
      }
    }
    return localStringBuilder.toString();
  }

  public final int getItemViewType(int paramInt)
  {
    Cursor localCursor = a();
    if ((!localCursor.isClosed()) && (localCursor.moveToPosition(paramInt)))
    {
      m localm = new m(localCursor);
      return a(localm.h(), localm.g());
    }
    return -1;
  }

  public final int getViewTypeCount()
  {
    return 19;
  }

  public final long h()
  {
    return this.o;
  }

  public final String i()
  {
    return this.p;
  }

  public final void j()
  {
    if (this.j.size() > 0)
      this.j.clear();
    this.o = -1L;
    this.p = null;
  }

  public final String k()
  {
    return this.t;
  }

  public final void l()
  {
    if ((!TextUtils.isEmpty(this.v.v())) || ((this.z != null) && (!TextUtils.isEmpty(this.z.l()))));
    for (boolean bool = true; ; bool = false)
    {
      this.u = bool;
      return;
    }
  }

  public final void onClick(View paramView)
  {
    if (paramView.getId() == 2131558859);
    this.B.r();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.y
 * JD-Core Version:    0.6.2
 */