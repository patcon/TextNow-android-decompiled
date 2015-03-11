package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.internal.widget.AppCompatPopupWindow;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;
import textnow.d.f;
import textnow.g.b;
import textnow.g.l;

public class ListPopupWindow
{
  private static Method a;
  private Handler A = new Handler();
  private Rect B = new Rect();
  private boolean C;
  private int D;
  int b = 2147483647;
  private Context c;
  private PopupWindow d;
  private ListAdapter e;
  private z f;
  private int g = -2;
  private int h = -2;
  private int i;
  private int j;
  private boolean k;
  private int l = 0;
  private boolean m = false;
  private boolean n = false;
  private View o;
  private int p = 0;
  private DataSetObserver q;
  private View r;
  private Drawable s;
  private AdapterView.OnItemClickListener t;
  private AdapterView.OnItemSelectedListener u;
  private final ah v = new ah(this, (byte)0);
  private final ag w = new ag(this, (byte)0);
  private final af x = new af(this, (byte)0);
  private final ad y = new ad(this, (byte)0);
  private Runnable z;

  static
  {
    try
    {
      Class[] arrayOfClass = new Class[1];
      arrayOfClass[0] = Boolean.TYPE;
      a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", arrayOfClass);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
  }

  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, b.s);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.s);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.c = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l.ag, paramInt, 0);
    this.i = localTypedArray.getDimensionPixelOffset(l.ah, 0);
    this.j = localTypedArray.getDimensionPixelOffset(l.ai, 0);
    if (this.j != 0)
      this.k = true;
    localTypedArray.recycle();
    this.d = new AppCompatPopupWindow(paramContext, paramAttributeSet, paramInt);
    this.d.setInputMethodMode(1);
    this.D = f.a(this.c.getResources().getConfiguration().locale);
  }

  public final void a()
  {
    this.d.dismiss();
    if (this.o != null)
    {
      ViewParent localViewParent = this.o.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.o);
    }
    this.d.setContentView(null);
    this.f = null;
    this.A.removeCallbacks(this.v);
  }

  public final void a(int paramInt)
  {
    this.p = 0;
  }

  public final void a(Drawable paramDrawable)
  {
    this.d.setBackgroundDrawable(paramDrawable);
  }

  public final void a(View paramView)
  {
    this.r = paramView;
  }

  public final void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.t = paramOnItemClickListener;
  }

  public void a(ListAdapter paramListAdapter)
  {
    if (this.q == null)
      this.q = new ae(this, (byte)0);
    while (true)
    {
      this.e = paramListAdapter;
      if (this.e != null)
        paramListAdapter.registerDataSetObserver(this.q);
      if (this.f != null)
        this.f.setAdapter(this.e);
      return;
      if (this.e != null)
        this.e.unregisterDataSetObserver(this.q);
    }
  }

  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.d.setOnDismissListener(paramOnDismissListener);
  }

  public final void a(boolean paramBoolean)
  {
    this.C = true;
    this.d.setFocusable(true);
  }

  public final void b(int paramInt)
  {
    this.l = paramInt;
  }

  public final boolean b()
  {
    return this.d.isShowing();
  }

  public final void c()
  {
    int i1 = 1;
    int i2 = -1;
    z localz;
    View localView2;
    Object localObject;
    LinearLayout.LayoutParams localLayoutParams2;
    label252: LinearLayout.LayoutParams localLayoutParams3;
    if (this.f == null)
    {
      Context localContext = this.c;
      this.z = new Runnable()
      {
        public final void run()
        {
          View localView = ListPopupWindow.this.d();
          if ((localView != null) && (localView.getWindowToken() != null))
            ListPopupWindow.this.c();
        }
      };
      if (!this.C)
      {
        int i15 = i1;
        this.f = new z(localContext, i15);
        if (this.s != null)
          this.f.setSelector(this.s);
        this.f.setAdapter(this.e);
        this.f.setOnItemClickListener(this.t);
        this.f.setFocusable(i1);
        this.f.setFocusableInTouchMode(i1);
        this.f.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            if (paramAnonymousInt != -1)
            {
              z localz = ListPopupWindow.a(ListPopupWindow.this);
              if (localz != null)
                z.a(localz, false);
            }
          }

          public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
          {
          }
        });
        this.f.setOnScrollListener(this.x);
        if (this.u != null)
          this.f.setOnItemSelectedListener(this.u);
        localz = this.f;
        localView2 = this.o;
        if (localView2 == null)
          break label1198;
        localObject = new LinearLayout(localContext);
        ((LinearLayout)localObject).setOrientation(i1);
        localLayoutParams2 = new LinearLayout.LayoutParams(i2, 0, 1.0F);
        switch (this.p)
        {
        default:
          new StringBuilder().append("Invalid hint position ").append(this.p).toString();
          localView2.measure(View.MeasureSpec.makeMeasureSpec(this.h, -2147483648), 0);
          localLayoutParams3 = (LinearLayout.LayoutParams)localView2.getLayoutParams();
        case 1:
        case 0:
        }
      }
    }
    for (int i3 = localView2.getMeasuredHeight() + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin; ; i3 = 0)
    {
      this.d.setContentView((View)localObject);
      while (true)
      {
        label306: Drawable localDrawable = this.d.getBackground();
        int i4;
        label366: int i5;
        int i6;
        int i9;
        label440: int i11;
        label457: label476: int i10;
        if (localDrawable != null)
        {
          localDrawable.getPadding(this.B);
          i4 = this.B.top + this.B.bottom;
          if (!this.k)
            this.j = (-this.B.top);
          this.d.getInputMethodMode();
          i5 = this.d.getMaxAvailableHeight(this.r, this.j);
          if ((!this.m) && (this.g != i2))
            break label645;
          i6 = i5 + i4;
          boolean bool2 = f();
          if (!this.d.isShowing())
            break label912;
          if (this.h != i2)
            break label803;
          i9 = i2;
          if (this.g != i2)
            break label882;
          if (!bool2)
            break label833;
          i11 = i6;
          if (!bool2)
            break label844;
          PopupWindow localPopupWindow5 = this.d;
          if (this.h != i2)
            break label839;
          localPopupWindow5.setWindowLayoutMode(i2, 0);
          i10 = i11;
          label487: PopupWindow localPopupWindow3 = this.d;
          if ((this.n) || (this.m))
            break label907;
          label507: localPopupWindow3.setOutsideTouchable(i1);
          this.d.update(this.r, this.i, this.j, i9, i10);
        }
        while (true)
        {
          return;
          int i16 = 0;
          break;
          ((LinearLayout)localObject).addView(localz, localLayoutParams2);
          ((LinearLayout)localObject).addView(localView2);
          break label252;
          ((LinearLayout)localObject).addView(localView2);
          ((LinearLayout)localObject).addView(localz, localLayoutParams2);
          break label252;
          this.d.getContentView();
          View localView1 = this.o;
          if (localView1 != null)
          {
            LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
            i3 = localView1.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin;
            break label306;
            this.B.setEmpty();
            i4 = 0;
            break label366;
            label645: int i13;
            switch (this.h)
            {
            default:
              i13 = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
            case -2:
            case -1:
            }
            while (true)
            {
              int i14 = this.f.a(i13, i5 - i3, i2);
              if (i14 > 0)
                i3 += i4;
              i6 = i3 + i14;
              break;
              i13 = View.MeasureSpec.makeMeasureSpec(this.c.getResources().getDisplayMetrics().widthPixels - (this.B.left + this.B.right), -2147483648);
              continue;
              i13 = View.MeasureSpec.makeMeasureSpec(this.c.getResources().getDisplayMetrics().widthPixels - (this.B.left + this.B.right), 1073741824);
            }
            label803: if (this.h == -2)
            {
              i9 = this.r.getWidth();
              break label440;
            }
            i9 = this.h;
            break label440;
            label833: i11 = i2;
            break label457;
            label839: i2 = 0;
            break label476;
            label844: PopupWindow localPopupWindow4 = this.d;
            if (this.h == i2);
            for (int i12 = i2; ; i12 = 0)
            {
              localPopupWindow4.setWindowLayoutMode(i12, i2);
              i10 = i11;
              break;
            }
            label882: if (this.g == -2)
            {
              i10 = i6;
              break label487;
            }
            i10 = this.g;
            break label487;
            label907: boolean bool1 = false;
            break label507;
            label912: int i7;
            label923: int i8;
            if (this.h == i2)
            {
              i7 = i2;
              if (this.g != i2)
                break label1141;
              i8 = i2;
              label934: this.d.setWindowLayoutMode(i7, i8);
              if (a == null);
            }
            try
            {
              Method localMethod = a;
              PopupWindow localPopupWindow2 = this.d;
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = Boolean.valueOf(true);
              localMethod.invoke(localPopupWindow2, arrayOfObject);
              label986: PopupWindow localPopupWindow1 = this.d;
              if ((!this.n) && (!this.m));
              while (true)
              {
                localPopupWindow1.setOutsideTouchable(bool1);
                this.d.setTouchInterceptor(this.w);
                android.support.v4.widget.ad.a(this.d, this.r, this.i, this.j, this.l);
                this.f.setSelection(i2);
                if ((!this.C) || (this.f.isInTouchMode()))
                  e();
                if (this.C)
                  break;
                this.A.post(this.y);
                return;
                if (this.h == -2)
                {
                  this.d.setWidth(this.r.getWidth());
                  i7 = 0;
                  break label923;
                }
                this.d.setWidth(this.h);
                i7 = 0;
                break label923;
                label1141: if (this.g == -2)
                {
                  this.d.setHeight(i6);
                  i8 = 0;
                  break label934;
                }
                this.d.setHeight(this.g);
                i8 = 0;
                break label934;
                bool1 = false;
              }
            }
            catch (Exception localException)
            {
              break label986;
            }
          }
        }
        i3 = 0;
      }
      label1198: localObject = localz;
    }
  }

  public final void c(int paramInt)
  {
    Drawable localDrawable = this.d.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.B);
      this.h = (paramInt + (this.B.left + this.B.right));
      return;
    }
    this.h = paramInt;
  }

  public final View d()
  {
    return this.r;
  }

  public final void d(int paramInt)
  {
    this.d.setInputMethodMode(2);
  }

  public final void e()
  {
    z localz = this.f;
    if (localz != null)
    {
      z.a(localz, true);
      localz.requestLayout();
    }
  }

  public final boolean f()
  {
    return this.d.getInputMethodMode() == 2;
  }

  public final ListView g()
  {
    return this.f;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ListPopupWindow
 * JD-Core Version:    0.6.2
 */