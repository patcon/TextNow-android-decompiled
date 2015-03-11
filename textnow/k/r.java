package textnow.k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.widget.c;
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
import textnow.bd.aq;
import textnow.bd.ar;
import textnow.bd.at;
import textnow.bd.ba;
import textnow.q.ad;
import textnow.q.b;
import textnow.q.g;
import textnow.u.f;
import textnow.u.k;

public final class r extends c
  implements View.OnClickListener
{
  private static ar x;
  private static final int[] y = { 2130837603, 2130837604, 2130837605, 2130837606, 2130837607, 2130837608, 2130837609 };
  private static final int[] z = { 2130837811, 2130837807, 2130837824, 2130837823, 2130837825, 2130837822, 2130837827 };
  private f A;
  private final s B;
  private final Map<Long, String> j = new TreeMap();
  private final Set<String> k = new HashSet();
  private long l = -1L;
  private String m = null;
  private d n;
  private boolean o;
  private Map<String, Integer> p = new HashMap();
  private int q;
  private boolean r;
  private String s = "";
  private boolean t;
  private textnow.u.r u;
  private aq v;
  private at w;

  static
  {
    ar localar = new ar();
    x = localar;
    localar.h = Integer.valueOf(2130838032);
    x.i = Integer.valueOf(2130838033);
    x.b = Integer.valueOf(250);
    x.c = Integer.valueOf(250);
  }

  public r(Context paramContext, Cursor paramCursor, int paramInt, s params, aq paramaq, boolean paramBoolean1, boolean paramBoolean2, f paramf)
  {
    super(paramContext, null, 0);
    this.B = params;
    this.n = d.a(paramContext);
    this.v = paramaq;
    this.w = new at()
    {
      public final void a(ImageView paramAnonymousImageView, Bitmap paramAnonymousBitmap, ba paramAnonymousba)
      {
        Context localContext = r.a(r.this);
        if ((paramAnonymousba == ba.b) || (paramAnonymousba == ba.c));
        for (boolean bool = true; ; bool = false)
        {
          ad.a(localContext, paramAnonymousImageView, paramAnonymousBitmap, bool);
          return;
        }
      }
    };
    this.o = paramBoolean1;
    this.r = paramBoolean2;
    this.A = paramf;
    this.u = new textnow.u.r(paramContext);
    i();
  }

  private static String a(k paramk)
  {
    switch (paramk.g())
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
      return paramk.e();
      try
      {
        JSONObject localJSONObject = new JSONObject(paramk.e());
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
    return paramk.e();
  }

  private Spannable b(String paramString)
  {
    Spannable localSpannable = Spannable.Factory.getInstance().newSpannable(paramString);
    if (!TextUtils.isEmpty(this.s))
    {
      int i = paramString.toLowerCase(Locale.US).indexOf(this.s, 0);
      if (i >= 0)
      {
        int i1 = i + this.s.length();
        localSpannable.setSpan(new BackgroundColorSpan(this.d.getResources().getColor(2131296300)), i, i1, 33);
      }
    }
    return localSpannable;
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    k localk = new k(paramCursor);
    int i = localk.h();
    int i1 = localk.l();
    int i2 = localk.g();
    View localView;
    if (i == 1)
      switch (i2)
      {
      default:
        localView = localLayoutInflater.inflate(2130903138, paramViewGroup, false);
      case 2:
      case 100:
      case 101:
      case 8:
      case 0:
      }
    while (true)
    {
      localView.setTag(new t(localView, i2, i1, i));
      return localView;
      localView = localLayoutInflater.inflate(2130903143, paramViewGroup, false);
      continue;
      if (this.t)
      {
        localView = localLayoutInflater.inflate(2130903142, paramViewGroup, false);
      }
      else
      {
        localView = localLayoutInflater.inflate(2130903139, paramViewGroup, false);
        continue;
        if (this.t)
        {
          localView = localLayoutInflater.inflate(2130903141, paramViewGroup, false);
        }
        else
        {
          localView = localLayoutInflater.inflate(2130903140, paramViewGroup, false);
          continue;
          if (this.t)
          {
            localView = localLayoutInflater.inflate(2130903147, paramViewGroup, false);
          }
          else
          {
            localView = localLayoutInflater.inflate(2130903146, paramViewGroup, false);
            continue;
            if (this.t)
            {
              localView = localLayoutInflater.inflate(2130903145, paramViewGroup, false);
            }
            else
            {
              localView = localLayoutInflater.inflate(2130903144, paramViewGroup, false);
              continue;
              switch (i2)
              {
              default:
                if (this.t)
                  localView = localLayoutInflater.inflate(2130903155, paramViewGroup, false);
                break;
              case 2:
                if (this.t)
                  localView = localLayoutInflater.inflate(2130903154, paramViewGroup, false);
                else
                  localView = localLayoutInflater.inflate(2130903153, paramViewGroup, false);
                break;
              case 102:
                if (this.t)
                  localView = localLayoutInflater.inflate(2130903150, paramViewGroup, false);
                else
                  localView = localLayoutInflater.inflate(2130903149, paramViewGroup, false);
                break;
              case 103:
                if (this.t)
                {
                  localView = localLayoutInflater.inflate(2130903152, paramViewGroup, false);
                }
                else
                {
                  localView = localLayoutInflater.inflate(2130903151, paramViewGroup, false);
                  continue;
                  localView = localLayoutInflater.inflate(2130903148, paramViewGroup, false);
                }
                break;
              }
            }
          }
        }
      }
    }
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    k localk = new k(paramCursor);
    int i = localk.g();
    int i1 = localk.l();
    int i2 = localk.j();
    t localt1 = (t)paramView.getTag();
    t localt3;
    if ((localt1 == null) || (localt1.p != i))
    {
      t localt2 = new t(paramView, i, i1, -1);
      paramView.setTag(localt2);
      localt3 = localt2;
      localt3.q = i1;
      localt3.a = localk;
      if (Build.VERSION.SDK_INT < 11)
      {
        if (a(paramView))
          paramView.setBackgroundDrawable(this.d.getResources().getDrawable(2130837630));
      }
      else
        label127: switch (i)
        {
        default:
        case 0:
        case 1:
        case 2:
        case 103:
        }
    }
    while (true)
      while (true)
      {
        localt3.d.setText(b.a(localt3.a.i(), this.u.t()));
        if (localt3.e != null)
          localt3.e.setText(b.a(localt3.a.i(), this.u.t()));
        label266: String str3;
        int i3;
        label345: int i4;
        label382: String str2;
        label501: TextView localTextView2;
        label560: label569: label576: int i10;
        if (localt3.g != null)
        {
          if (i2 == 1)
          {
            localt3.g.setImageResource(2130837976);
            localt3.g.setVisibility(0);
          }
        }
        else
        {
          if ((localt3.a.d() == 5) && (localt3.a.h() == 1))
          {
            View localView = localt3.i;
            str3 = localt3.a.c();
            if (localView != null)
            {
              if (!this.p.containsKey(str3))
                break label1469;
              i3 = ((Integer)this.p.get(str3)).intValue();
              if (new textnow.u.r(this.d).ac().intValue() != 0)
                break label1518;
              i4 = y[java.lang.Math.min(-1 + y.length, i3)];
              int i5 = ad.a(this.d, 25);
              int i6 = ad.a(this.d, 16);
              int i7 = ad.a(this.d, 20);
              localView.setBackgroundResource(i4);
              localView.setPadding(i5, i7, i6, i7);
            }
          }
          if ((localt3.t == null) || (!this.o))
            break label1549;
          localt3.t.setVisibility(0);
          if (localk.h() == 1)
          {
            str2 = localk.c();
            if ((!TextUtils.isEmpty(str2)) && (localt3.p != 0))
              break label1538;
            localt3.t.setVisibility(8);
          }
          return;
          paramView.setBackgroundColor(0);
          break label127;
          if (localt3.o != null)
          {
            if (!paramCursor.moveToPrevious())
              break label867;
            if (new k(paramCursor).l() == i1)
              break label854;
            if (i1 == 1)
            {
              localt3.s.setText(2131493165);
              localt3.o.setVisibility(0);
              paramCursor.moveToNext();
            }
          }
          else if (localt3.p == 0)
          {
            localTextView2 = localt3.b;
            i10 = 1;
          }
        }
        try
        {
          JSONObject localJSONObject = new JSONObject(localt3.a.e());
          if (localJSONObject.has("string"))
            localTextView2.setText(b(localJSONObject.getString("string")));
          TypedArray localTypedArray;
          if ((localJSONObject.has("type")) && (localt3.h != null))
          {
            int i11 = localJSONObject.getInt("type");
            localTypedArray = this.d.obtainStyledAttributes(new int[] { 2130772175, 2130772176, 2130772177 });
            switch (i11)
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
            if (i10 != 0)
              break;
            localSpannable = b(localt3.a.e());
            if (localt3.i == null)
              break label1023;
            if (localt3.q != 1)
              break label956;
            localt3.i.setVisibility(8);
            localt3.j.setVisibility(0);
            localt3.c.setText(localSpannable, TextView.BufferType.EDITABLE);
            Linkify.addLinks(localt3.c, 15);
            this.n.a(localt3.c);
            localt3.c.setMovementMethod(null);
            break;
            localt3.s.setText(2131493166);
            break label560;
            label854: localt3.o.setVisibility(8);
            break label569;
            label867: localt3.o.setVisibility(8);
            break label576;
            localt3.h.setImageResource(localTypedArray.getResourceId(0, 2130837985));
            if (this.B != null)
            {
              this.B.A();
              continue;
              localt3.h.setImageResource(localTypedArray.getResourceId(1, 2130837981));
              continue;
              localt3.h.setImageResource(localTypedArray.getResourceId(2, 2130837983));
            }
          }
          label956: localt3.i.setVisibility(0);
          localt3.j.setVisibility(8);
          localt3.b.setText(localSpannable, TextView.BufferType.EDITABLE);
          Linkify.addLinks(localt3.b, 15);
          this.n.a(localt3.b);
          localt3.b.setMovementMethod(null);
          continue;
          label1023: localt3.b.setText(localSpannable, TextView.BufferType.EDITABLE);
          Linkify.addLinks(localt3.b, 15);
          this.n.a(localt3.b);
          localt3.b.setMovementMethod(null);
          continue;
          String str4 = localt3.a.e();
          String str5 = localt3.a.k();
          if (!TextUtils.isEmpty(str5))
          {
            if (str5.startsWith("content://"))
              str5 = g.a(this.d, str5);
            if (!TextUtils.isEmpty(str5))
            {
              if (str5.toLowerCase().startsWith("http"))
              {
                this.v.a(localt3.f, str5, x, this.w);
                continue;
              }
              this.v.a(localt3.f, Uri.fromFile(new File(str5)).toString(), x, this.w);
            }
          }
          else if (!TextUtils.isEmpty(str4))
          {
            this.v.a(localt3.f, str4 + "&thumb=" + 250, x, this.w);
          }
          else
          {
            localt3.f.setImageResource(2130838032);
            continue;
            str1 = localt3.a.e();
          }
        }
        catch (Exception localException)
        {
          try
          {
            String str1;
            if (TextUtils.isEmpty(str1));
            for (int i8 = 0; ; i8 = Integer.valueOf(str1).intValue())
            {
              if ((i8 >= 0) || (localt3.k == null))
                break label1334;
              localt3.k.setVisibility(8);
              break;
            }
            label1334: localt3.k.setVisibility(0);
            if (localt3.m != null)
            {
              int i9 = (i8 + 59) / 60;
              TextView localTextView1 = localt3.m;
              Resources localResources = this.d.getResources();
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = Integer.valueOf(i9);
              localTextView1.setText(localResources.getQuantityString(2131689477, i9, arrayOfObject));
              localt3.n.setOnClickListener(this);
              if (this.r)
                localt3.n.setVisibility(8);
              this.k.add(localt3.a.a());
              continue;
              localt3.g.setVisibility(8);
              break label266;
              label1469: this.p.put(str3, Integer.valueOf(this.q));
              i3 = this.q;
              this.q = (1 + this.q);
              this.q %= 7;
              break label345;
              label1518: i4 = z[java.lang.Math.min(-1 + z.length, i3)];
              break label382;
              label1538: localt3.t.setText(str2);
              return;
              label1549: if (localt3.t == null)
                break label501;
              localt3.t.setVisibility(8);
              return;
              localt3 = localt1;
              break;
              localException = localException;
              i10 = 0;
            }
          }
          catch (NumberFormatException localNumberFormatException)
          {
          }
        }
      }
  }

  public final void a(String paramString)
  {
    this.s = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    this.o = true;
  }

  public final boolean a(View paramView)
  {
    t localt = (t)paramView.getTag();
    return (localt != null) && (localt.a != null) && (this.j.containsKey(Long.valueOf(localt.a.f())));
  }

  public final boolean a(View paramView, boolean paramBoolean)
  {
    boolean bool = true;
    t localt2;
    if (paramBoolean)
      if (!a(paramView))
      {
        localt2 = (t)paramView.getTag();
        if (localt2.a != null)
        {
          if (!bool)
            break label110;
          this.j.put(Long.valueOf(localt2.a.f()), a(localt2.a));
          label64: if (this.B != null)
          {
            s locals = this.B;
            localt2.a.f();
            this.j.size();
            locals.p();
          }
        }
      }
    label110: t localt1;
    do
    {
      return bool;
      bool = false;
      break;
      this.j.remove(Long.valueOf(localt2.a.f()));
      break label64;
      localt1 = (t)paramView.getTag();
    }
    while (localt1.a == null);
    this.l = localt1.a.f();
    this.m = localt1.a.e();
    return bool;
  }

  public final Set<Long> c()
  {
    return this.j.keySet();
  }

  public final Set<String> d()
  {
    return this.k;
  }

  public final String e()
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

  public final long f()
  {
    return this.l;
  }

  public final String g()
  {
    return this.m;
  }

  public final int getItemViewType(int paramInt)
  {
    Cursor localCursor = a();
    if ((!localCursor.isClosed()) && (localCursor.moveToPosition(paramInt)))
    {
      k localk = new k(localCursor);
      int i = localk.h();
      int i1 = localk.g();
      if (i == 1)
      {
        switch (i1)
        {
        default:
          return 1;
        case 0:
          if (this.t)
            return 17;
          return 9;
        case 2:
          return 3;
        case 100:
          if (this.t)
            return 14;
          return 6;
        case 101:
          if (this.t)
            return 15;
          return 7;
        case 8:
        }
        if (this.t)
          return 16;
        return 8;
      }
      switch (i1)
      {
      default:
        if (this.t)
          return 10;
        break;
      case 2:
        if (this.t)
          return 11;
        return 2;
      case 103:
        if (this.t)
          return 13;
        return 5;
      case 102:
        if (this.t)
          return 12;
        return 4;
      }
      return 0;
    }
    return -1;
  }

  public final int getViewTypeCount()
  {
    return 19;
  }

  public final void h()
  {
    if (this.j.size() > 0)
      this.j.clear();
    this.l = -1L;
    this.m = null;
  }

  public final void i()
  {
    if ((!TextUtils.isEmpty(this.u.x())) || ((this.A != null) && (!TextUtils.isEmpty(this.A.l()))));
    for (boolean bool = true; ; bool = false)
    {
      this.t = bool;
      return;
    }
  }

  public final void onClick(View paramView)
  {
    if (paramView.getId() == 2131165565);
    this.B.q();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.r
 * JD-Core Version:    0.6.2
 */