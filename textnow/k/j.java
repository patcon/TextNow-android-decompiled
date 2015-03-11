package textnow.k;

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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import cz.acrobits.libsoftphone.data.Call.State;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import textnow.ao.a;
import textnow.q.ad;
import textnow.q.b;
import textnow.q.q;
import textnow.u.f;
import textnow.u.r;

public final class j extends android.support.v4.widget.c
  implements View.OnClickListener
{
  private static final textnow.q.s l = new l();
  private final HashMap<Long, String> j = new HashMap();
  private String k;
  private int m;
  private r n;
  private final k o;
  private com.enflick.android.TextNow.activities.phone.d p;

  public j(Context paramContext, Cursor paramCursor, int paramInt, k paramk)
  {
    super(paramContext, null, 0);
    this.o = paramk;
    this.m = ad.a(this.d, 70);
    this.n = new r(paramContext);
    try
    {
      this.p = com.enflick.android.TextNow.activities.phone.d.a();
      return;
    }
    catch (com.enflick.android.TextNow.activities.phone.j localj)
    {
    }
  }

  private void a(View paramView, int paramInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    localMarginLayoutParams.rightMargin = (paramInt / Math.abs(paramInt) * ad.a(this.d, Math.abs(paramInt)));
    paramView.setLayoutParams(localMarginLayoutParams);
  }

  private void a(m paramm)
  {
    TypedArray localTypedArray = this.d.obtainStyledAttributes(new int[] { 2130772192 });
    paramm.h.setImageResource(localTypedArray.getResourceId(0, 2130837991));
    localTypedArray.recycle();
  }

  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903095, paramViewGroup, false);
    if (!com.enflick.android.TextNow.activities.phone.d.d())
      localView.findViewById(2131165367).setVisibility(8);
    m localm = new m(localView);
    localm.u.setOnClickListener(this);
    localm.t.setOnClickListener(this);
    localView.setTag(localm);
    return localView;
  }

  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    m localm1 = (m)paramView.getTag();
    m localm2;
    if (localm1 == null)
    {
      localm2 = new m(paramView);
      paramView.setTag(localm2);
    }
    for (m localm3 = localm2; ; localm3 = localm1)
    {
      if ((paramView != null) && (paramView.getHeight() <= 1))
      {
        ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
        localLayoutParams.height = this.m;
        paramView.setLayoutParams(localLayoutParams);
      }
      if (localm3.r != null)
        a.b(localm3.r, 0.0F);
      f localf = new f(paramCursor);
      String str1 = localf.c();
      long l1 = localf.a();
      int i = localf.j();
      int i1 = localf.k();
      localm3.a = localf;
      localm3.b.setText(localf.o());
      boolean bool = str1.equalsIgnoreCase("support@enflick.com");
      int i2;
      int i3;
      int i4;
      int i8;
      int i9;
      if (this.p != null)
      {
        com.enflick.android.TextNow.activities.phone.s locals1 = this.p.p();
        com.enflick.android.TextNow.activities.phone.c localc = this.p.q();
        Call.State localState = this.p.y();
        Iterator localIterator = this.p.G().iterator();
        i2 = 0;
        i3 = 0;
        i4 = 0;
        if (!localIterator.hasNext())
          break label351;
        com.enflick.android.TextNow.activities.phone.s locals2 = (com.enflick.android.TextNow.activities.phone.s)localIterator.next();
        if ((locals1 == null) || (!localm3.a.c().equals(locals2.b().a())))
          break label1695;
        if (this.p.d(locals2.a()))
          i3 = 1;
        if ((this.p.J()) && (localc.c(locals2)))
          i4 = 1;
        if ((!com.enflick.android.TextNow.activities.phone.d.c(localState)) || (locals1 == null))
          break label1695;
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
          localm3.u.setVisibility(8);
          a(localm3.s, -80);
          localm3.l = true;
          localm3.i.setVisibility(0);
          localm3.k.setVisibility(8);
          localm3.f.setVisibility(8);
          if (i3 != 0)
          {
            localm3.j.setText(2131493356);
            if ((l1 != this.o.h()) || (!ad.b(this.d)) || (i2 != 0))
              break label1671;
            localm3.g.setVisibility(0);
          }
        }
        while (true)
        {
          label578: int i5;
          label701: label735: Object localObject;
          if (Build.VERSION.SDK_INT < 11)
          {
            if (a(paramView))
              paramView.setBackgroundDrawable(this.d.getResources().getDrawable(2130837630));
          }
          else
          {
            return;
            if (i4 != 0)
            {
              localm3.j.setText(2131493122);
              break;
            }
            localm3.j.setText(2131493121);
            break;
            if ((this.p != null) && (textnow.u.d.a(localf.c(), localf.d())))
            {
              localm3.u.setVisibility(0);
              a(localm3.s, -160);
              localm3.l = false;
              localm3.i.setVisibility(8);
              localm3.k.setVisibility(0);
            }
            switch (i)
            {
            default:
              localm3.c.setText(2131493144);
              localm3.h.setVisibility(8);
            case 2:
            case 0:
              label779: 
              do
              {
                i5 = localf.i();
                if (i5 <= 99)
                  break label1273;
                localm3.f.setText("*");
                localm3.f.setVisibility(0);
                if (!bool)
                  break label1316;
                localm3.d.setVisibility(0);
                localm3.d.setImageResource(2130837598);
                localm3.d.setTag(null);
                localm3.m.setVisibility(8);
                localm3.e.setText(b.a(localf.g(), this.n.t()));
                break;
                localm3.u.setVisibility(8);
                a(localm3.s, -80);
                break label578;
                TextView localTextView3 = localm3.c;
                if (i1 == 1);
                for (int i7 = 2131493142; ; i7 = 2131493141)
                {
                  localTextView3.setText(i7);
                  localm3.h.setVisibility(8);
                  break;
                }
                localObject = localf.f();
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
            label923: TextView localTextView2 = localm3.c;
            if ((localObject != null) && (((String)localObject).length() > 100))
              localObject = ((String)localObject).substring(0, 100);
            localTextView2.setText((CharSequence)localObject, TextView.BufferType.EDITABLE);
            break label701;
            String str3 = localf.f();
            TextView localTextView1 = localm3.c;
            if ((str3 != null) && (str3.length() > 100))
              str3 = str3.substring(0, 100);
            localTextView1.setText(str3, TextView.BufferType.EDITABLE);
            localm3.h.setVisibility(8);
            com.enflick.android.TextNow.views.emoticons.d.a(this.d).a(localm3.c);
            break label701;
            localm3.c.setText(2131493143);
            localm3.h.setImageResource(2130838020);
            localm3.h.setVisibility(0);
            TypedArray localTypedArray2 = this.d.obtainStyledAttributes(new int[] { 2130772194 });
            localm3.h.setImageResource(localTypedArray2.getResourceId(0, 2130838022));
            localTypedArray2.recycle();
            break label701;
            localm3.c.setText(2131493361);
            localm3.h.setImageResource(2130837989);
            a(localm3);
            localm3.h.setVisibility(0);
            break label701;
            localm3.c.setText(2131493362);
            localm3.h.setImageResource(2130837989);
            a(localm3);
            localm3.h.setVisibility(0);
            break label701;
            localm3.c.setText(2131493360);
            localm3.h.setImageResource(2130838015);
            TypedArray localTypedArray1 = this.d.obtainStyledAttributes(new int[] { 2130772193 });
            localm3.h.setImageResource(localTypedArray1.getResourceId(0, 2130838017));
            localTypedArray1.recycle();
            localm3.h.setVisibility(0);
            break label701;
            label1273: if (i5 > 0)
            {
              localm3.f.setText(String.valueOf(i5));
              localm3.f.setVisibility(0);
              break label735;
            }
            localm3.f.setVisibility(8);
            break label735;
            label1316: String str2 = localf.h();
            if (localm3.a.d() == 5)
            {
              localm3.d.setVisibility(8);
              localm3.d.setTag(null);
              localm3.m.setVisibility(0);
              localm3.q.setTag(null);
              localm3.p.setTag(null);
              localm3.o.setTag(null);
              localm3.n.setTag(null);
              String[] arrayOfString = str2.split(",");
              int i6 = arrayOfString.length;
              if (i6 > 4)
                i6 = 4;
              switch (i6)
              {
              default:
                break;
              case 1:
              case 4:
              case 3:
              case 2:
                while (true)
                {
                  q.a(this.d).a(localm3.n, Uri.parse(arrayOfString[0]), l);
                  break;
                  q.a(this.d).a(localm3.q, Uri.parse(arrayOfString[3]), l);
                  q.a(this.d).a(localm3.p, Uri.parse(arrayOfString[2]), l);
                  q.a(this.d).a(localm3.o, Uri.parse(arrayOfString[1]), l);
                }
              }
            }
            if (f.c(str2))
            {
              localm3.d.setVisibility(0);
              localm3.m.setVisibility(8);
              localm3.d.setTag(null);
              localm3.d.setImageResource(2130837594);
              break label779;
            }
            localm3.d.setVisibility(0);
            localm3.m.setVisibility(8);
            Uri localUri = Uri.parse(str2);
            localm3.d.setTag(localUri);
            q.a(this.d).a(localm3.d, localUri);
            break label779;
            label1671: localm3.g.setVisibility(8);
            continue;
            paramView.setBackgroundColor(0);
            return;
          }
          catch (Exception localException)
          {
            break label923;
          }
        }
        label1695: i8 = i4;
        i9 = i3;
      }
    }
  }

  public final boolean a(View paramView)
  {
    m localm = (m)paramView.getTag();
    return (localm != null) && (localm.a != null) && (this.j.containsKey(Long.valueOf(localm.a.a())));
  }

  public final boolean a(View paramView, boolean paramBoolean)
  {
    boolean bool = true;
    m localm2;
    if (paramBoolean)
      if (!a(paramView))
      {
        localm2 = (m)paramView.getTag();
        if (localm2.a != null)
        {
          if (!bool)
            break label103;
          this.j.put(Long.valueOf(localm2.a.a()), localm2.a.c());
          label62: if (this.o != null)
          {
            k localk = this.o;
            this.j.size();
            localk.g();
          }
        }
      }
    label103: m localm1;
    do
    {
      return bool;
      bool = false;
      break;
      this.j.remove(Long.valueOf(localm2.a.a()));
      break label62;
      localm1 = (m)paramView.getTag();
    }
    while (localm1.a == null);
    this.k = localm1.a.c();
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.j
 * JD-Core Version:    0.6.2
 */