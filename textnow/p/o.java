package textnow.p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.enflick.android.TextNow.activities.phone.n;
import com.enflick.android.TextNow.activities.phone.w;
import com.enflick.android.TextNow.views.AvatarView;
import com.enflick.android.TextNow.views.TintedImageView;
import cz.acrobits.libsoftphone.data.Call.State;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import textnow.av.a;
import textnow.v.b;
import textnow.v.z;
import textnow.z.u;

public final class o extends android.support.v4.widget.f
  implements View.OnClickListener
{
  private static final textnow.v.q l = new q();
  private final HashMap<Long, String> j = new HashMap();
  private String k;
  private int m;
  private u n;
  private final p o;
  private com.enflick.android.TextNow.activities.phone.h p;

  public o(Context paramContext, Cursor paramCursor, int paramInt, p paramp)
  {
    super(paramContext, null, 0);
    this.o = paramp;
    this.m = z.a(this.d, 72);
    this.n = new u(paramContext);
    try
    {
      this.p = com.enflick.android.TextNow.activities.phone.h.a();
      return;
    }
    catch (n localn)
    {
    }
  }

  private void a(View paramView, int paramInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    localMarginLayoutParams.rightMargin = (paramInt / Math.abs(paramInt) * z.a(this.d, Math.abs(paramInt)));
    paramView.setLayoutParams(localMarginLayoutParams);
  }

  private void a(r paramr)
  {
    TypedArray localTypedArray = this.d.obtainStyledAttributes(new int[] { 2130772272 });
    paramr.i.setImageResource(localTypedArray.getResourceId(0, 2130837952));
    localTypedArray.recycle();
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903107, paramViewGroup, false);
    if (!com.enflick.android.TextNow.activities.phone.h.d())
      localView.findViewById(2131558633).setVisibility(8);
    r localr = new r(localView);
    localr.q.setOnClickListener(this);
    localr.p.setOnClickListener(this);
    localView.setTag(localr);
    return localView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    r localr1 = (r)paramView.getTag();
    r localr2;
    if (localr1 == null)
    {
      localr2 = new r(paramView);
      paramView.setTag(localr2);
    }
    for (r localr3 = localr2; ; localr3 = localr1)
    {
      if ((paramView != null) && (paramView.getHeight() <= 1))
      {
        ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
        localLayoutParams.height = this.m;
        paramView.setLayoutParams(localLayoutParams);
      }
      if (localr3.n != null)
        a.b(localr3.n, 0.0F);
      textnow.z.h localh = new textnow.z.h(paramCursor);
      String str1 = localh.c();
      long l1 = localh.a();
      int i = localh.j();
      int i1 = localh.k();
      localr3.a = localh;
      localr3.b.setText(localh.p());
      boolean bool = str1.equalsIgnoreCase("support@enflick.com");
      int i2;
      int i3;
      int i4;
      int i8;
      int i9;
      if (this.p != null)
      {
        w localw1 = this.p.p();
        com.enflick.android.TextNow.activities.phone.d locald = this.p.q();
        Call.State localState = this.p.y();
        Iterator localIterator = this.p.G().iterator();
        i2 = 0;
        i3 = 0;
        i4 = 0;
        if (!localIterator.hasNext())
          break label351;
        w localw2 = (w)localIterator.next();
        if ((localw1 == null) || (!localr3.a.c().equals(localw2.b().a())))
          break label1618;
        if (this.p.d(localw2.a()))
          i3 = 1;
        if ((this.p.K()) && (locald.c(localw2)))
          i4 = 1;
        if ((!com.enflick.android.TextNow.activities.phone.h.c(localState)) || (localw1 == null))
          break label1618;
        i8 = i4;
        i9 = i3;
      }
      for (int i10 = 1; ; i10 = i2)
      {
        i2 = i10;
        i3 = i9;
        i4 = i8;
        break;
        i2 = 0;
        i3 = 0;
        i4 = 0;
        label351: if (i2 != 0)
        {
          localr3.q.setVisibility(8);
          a(localr3.o, -80);
          localr3.m = true;
          localr3.j.setVisibility(0);
          localr3.l.setVisibility(8);
          localr3.f.setVisibility(8);
          localr3.g.setVisibility(8);
          localr3.e.setVisibility(8);
          if (i3 != 0)
          {
            localr3.k.setText(2131296759);
            localr3.d.setImageDrawable(null);
            localr3.d.a(false, 1);
            if (!bool)
              break label1449;
            localr3.d.setImageResource(2130837562);
            localr3.d.setTag(null);
          }
        }
        while (true)
        {
          label531: label697: label829: int i5;
          label872: Object localObject;
          if ((l1 == this.o.h()) && (z.d(this.d)) && (i2 == 0))
          {
            localr3.h.setVisibility(0);
            if (Build.VERSION.SDK_INT < 11)
            {
              if (!a(paramView))
                break label1607;
              paramView.setBackgroundDrawable(this.d.getResources().getDrawable(2130837585));
            }
            return;
            if (i4 != 0)
            {
              localr3.k.setText(2131296534);
              break;
            }
            localr3.k.setText(2131296533);
            break;
            if ((this.p != null) && (textnow.z.f.a(localh.c(), localh.d())) && (!localh.c().equals(this.n.b() + "@textnow.me")) && (!localh.c().endsWith(this.n.c())))
            {
              localr3.q.setVisibility(0);
              a(localr3.o, -160);
              localr3.m = false;
              localr3.j.setVisibility(8);
              localr3.l.setVisibility(0);
              localr3.e.setVisibility(0);
            }
            switch (i)
            {
            default:
              localr3.c.setText(2131296556);
              localr3.i.setVisibility(8);
            case 2:
            case 0:
              do
              {
                i5 = localh.i();
                if (i5 <= 99)
                  break label1387;
                localr3.f.setText("*");
                localr3.f.setVisibility(0);
                localr3.g.setVisibility(0);
                localr3.e.setText(b.b(localh.g(), this.n.r()));
                break;
                localr3.q.setVisibility(8);
                a(localr3.o, -80);
                break label697;
                TextView localTextView2 = localr3.c;
                if (i1 == 1);
                for (int i7 = 2131296554; ; i7 = 2131296553)
                {
                  localTextView2.setText(i7);
                  localr3.i.setVisibility(8);
                  break;
                }
                localObject = localh.f();
              }
              while (localObject == null);
            case 1:
            case 8:
            case 100:
            case 101:
            case 102:
            case 103:
            }
          }
          try
          {
            JSONObject localJSONObject = new JSONObject((String)localObject);
            if (localJSONObject.has("string"))
            {
              String str4 = localJSONObject.getString("string");
              localObject = str4;
            }
            label1016: TextView localTextView1 = localr3.c;
            if ((localObject != null) && (((String)localObject).length() > 100))
              localObject = ((String)localObject).substring(0, 100);
            localTextView1.setText((CharSequence)localObject);
            break label829;
            String str3 = localh.f();
            if ((str3 != null) && (str3.length() > 100))
              str3 = str3.substring(0, 100);
            if (com.enflick.android.TextNow.views.emoticons.d.a(this.d).a(str3))
            {
              localr3.c.setText(str3, TextView.BufferType.EDITABLE);
              com.enflick.android.TextNow.views.emoticons.d.a(this.d).a(localr3.c);
            }
            while (true)
            {
              localr3.i.setVisibility(8);
              break;
              localr3.c.setText(str3);
            }
            localr3.c.setText(2131296555);
            localr3.i.setImageResource(2130837981);
            localr3.i.setVisibility(0);
            TypedArray localTypedArray2 = this.d.obtainStyledAttributes(new int[] { 2130772274 });
            localr3.i.setImageResource(localTypedArray2.getResourceId(0, 2130837983));
            localTypedArray2.recycle();
            break label829;
            localr3.c.setText(2131296764);
            localr3.i.setImageResource(2130837950);
            a(localr3);
            localr3.i.setVisibility(0);
            break label829;
            localr3.c.setText(2131296765);
            localr3.i.setImageResource(2130837950);
            a(localr3);
            localr3.i.setVisibility(0);
            break label829;
            localr3.c.setText(2131296763);
            localr3.i.setImageResource(2130837976);
            TypedArray localTypedArray1 = this.d.obtainStyledAttributes(new int[] { 2130772273 });
            localr3.i.setImageResource(localTypedArray1.getResourceId(0, 2130837978));
            localTypedArray1.recycle();
            localr3.i.setVisibility(0);
            break label829;
            label1387: if (i5 > 0)
            {
              localr3.f.setText(String.valueOf(i5));
              localr3.f.setVisibility(0);
              localr3.g.setVisibility(0);
              break label872;
            }
            localr3.f.setVisibility(8);
            localr3.g.setVisibility(8);
            break label872;
            label1449: String str2 = localh.h();
            if (localr3.a.d() == 5)
            {
              localr3.d.setTag(null);
              int i6 = str2.split(",").length;
              localr3.d.a(true, i6);
            }
            else if (textnow.z.h.c(str2))
            {
              localr3.d.a(localh.p());
              localr3.d.setTag(null);
              localr3.d.setImageDrawable(null);
            }
            else
            {
              Uri localUri = Uri.parse(str2);
              localr3.d.setTag(localUri);
              localr3.d.a(localh.p());
              textnow.v.o.a(this.d).a(localr3.d, localUri);
              continue;
              localr3.h.setVisibility(8);
              break label531;
              label1607: paramView.setBackgroundColor(0);
              return;
            }
          }
          catch (Exception localException)
          {
            break label1016;
          }
        }
        label1618: i8 = i4;
        i9 = i3;
      }
    }
  }

  public final boolean a(View paramView)
  {
    r localr = (r)paramView.getTag();
    return (localr != null) && (localr.a != null) && (this.j.containsKey(Long.valueOf(localr.a.a())));
  }

  public final boolean a(View paramView, boolean paramBoolean)
  {
    boolean bool = true;
    r localr2;
    if (paramBoolean)
      if (!a(paramView))
      {
        localr2 = (r)paramView.getTag();
        if (localr2.a != null)
        {
          if (!bool)
            break label103;
          this.j.put(Long.valueOf(localr2.a.a()), localr2.a.c());
          label62: if (this.o != null)
          {
            p localp = this.o;
            this.j.size();
            localp.g();
          }
        }
      }
    label103: r localr1;
    do
    {
      return bool;
      bool = false;
      break;
      this.j.remove(Long.valueOf(localr2.a.a()));
      break label62;
      localr1 = (r)paramView.getTag();
    }
    while (localr1.a == null);
    this.k = localr1.a.c();
    return bool;
  }

  public final HashMap<Long, String> c()
  {
    return this.j;
  }

  public final String d()
  {
    return this.k;
  }

  public final void e()
  {
    if (this.j.size() > 0)
      this.j.clear();
    this.k = null;
  }

  public final void onClick(View paramView)
  {
    if (this.o != null)
      this.o.a((View)paramView.getTag(), paramView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.o
 * JD-Core Version:    0.6.2
 */