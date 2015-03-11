package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
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
import textnow.g.c;

public class ListPopupWindow
{
  private boolean A;
  int a = 2147483647;
  private Context b;
  private PopupWindow c;
  private ListAdapter d;
  private s e;
  private int f = -2;
  private int g = -2;
  private int h;
  private int i;
  private boolean j;
  private boolean k = false;
  private boolean l = false;
  private View m;
  private int n = 0;
  private DataSetObserver o;
  private View p;
  private Drawable q;
  private AdapterView.OnItemClickListener r;
  private AdapterView.OnItemSelectedListener s;
  private final x t = new x(this, (byte)0);
  private final w u = new w(this, (byte)0);
  private final v v = new v(this, (byte)0);
  private final t w = new t(this, (byte)0);
  private Runnable x;
  private Handler y = new Handler();
  private Rect z = new Rect();

  public ListPopupWindow(Context paramContext)
  {
    this(paramContext, null, c.j);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, c.j);
  }

  public ListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.b = paramContext;
    this.c = new PopupWindow(paramContext, paramAttributeSet, paramInt);
    this.c.setInputMethodMode(1);
  }

  public final Drawable a()
  {
    return this.c.getBackground();
  }

  public final void a(int paramInt)
  {
    this.n = 0;
  }

  public final void a(Drawable paramDrawable)
  {
    this.c.setBackgroundDrawable(paramDrawable);
  }

  public final void a(View paramView)
  {
    this.p = paramView;
  }

  public final void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.r = paramOnItemClickListener;
  }

  public void a(ListAdapter paramListAdapter)
  {
    if (this.o == null)
      this.o = new u(this, (byte)0);
    while (true)
    {
      this.d = paramListAdapter;
      if (this.d != null)
        paramListAdapter.registerDataSetObserver(this.o);
      if (this.e != null)
        this.e.setAdapter(this.d);
      return;
      if (this.d != null)
        this.d.unregisterDataSetObserver(this.o);
    }
  }

  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.c.setOnDismissListener(paramOnDismissListener);
  }

  public final void a(boolean paramBoolean)
  {
    this.A = true;
    this.c.setFocusable(true);
  }

  public final View b()
  {
    return this.p;
  }

  public final void b(int paramInt)
  {
    this.h = paramInt;
  }

  public void c()
  {
    int i1 = 1;
    int i2 = -1;
    s locals;
    View localView3;
    Object localObject;
    LinearLayout.LayoutParams localLayoutParams2;
    label251: LinearLayout.LayoutParams localLayoutParams3;
    if (this.e == null)
    {
      Context localContext = this.b;
      this.x = new Runnable()
      {
        public final void run()
        {
          View localView = ListPopupWindow.this.b();
          if ((localView != null) && (localView.getWindowToken() != null))
            ListPopupWindow.this.c();
        }
      };
      if (!this.A)
      {
        int i19 = i1;
        this.e = new s(localContext, i19);
        if (this.q != null)
          this.e.setSelector(this.q);
        this.e.setAdapter(this.d);
        this.e.setOnItemClickListener(this.r);
        this.e.setFocusable(i1);
        this.e.setFocusableInTouchMode(i1);
        this.e.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            if (paramAnonymousInt != -1)
            {
              s locals = ListPopupWindow.a(ListPopupWindow.this);
              if (locals != null)
                s.a(locals, false);
            }
          }

          public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
          {
          }
        });
        this.e.setOnScrollListener(this.v);
        if (this.s != null)
          this.e.setOnItemSelectedListener(this.s);
        locals = this.e;
        localView3 = this.m;
        if (localView3 == null)
          break label1287;
        localObject = new LinearLayout(localContext);
        ((LinearLayout)localObject).setOrientation(i1);
        localLayoutParams2 = new LinearLayout.LayoutParams(i2, 0, 1.0F);
        switch (this.n)
        {
        default:
          new StringBuilder().append("Invalid hint position ").append(this.n).toString();
          localView3.measure(View.MeasureSpec.makeMeasureSpec(this.g, -2147483648), 0);
          localLayoutParams3 = (LinearLayout.LayoutParams)localView3.getLayoutParams();
        case 1:
        case 0:
        }
      }
    }
    label776: label1039: label1044: label1055: label1066: for (int i3 = localView3.getMeasuredHeight() + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin; ; i3 = 0)
    {
      this.c.setContentView((View)localObject);
      label305: label575: label969: label1228: 
      while (true)
      {
        Drawable localDrawable = this.c.getBackground();
        int i4;
        label365: label379: View localView2;
        int i7;
        Rect localRect;
        int[] arrayOfInt;
        int i8;
        if (localDrawable != null)
        {
          localDrawable.getPadding(this.z);
          i4 = this.z.top + this.z.bottom;
          if (!this.j)
            this.i = (-this.z.top);
          if (this.c.getInputMethodMode() != 2)
            break label776;
          int i5 = i1;
          localView2 = this.p;
          i7 = this.i;
          localRect = new Rect();
          localView2.getWindowVisibleDisplayFrame(localRect);
          arrayOfInt = new int[2];
          localView2.getLocationOnScreen(arrayOfInt);
          i8 = localRect.bottom;
          if (i5 == 0)
            break label1274;
        }
        label592: label611: label618: label1014: label1274: for (int i9 = localView2.getContext().getResources().getDisplayMetrics().heightPixels; ; i9 = i8)
        {
          int i10 = Math.max(i9 - (arrayOfInt[i1] + localView2.getHeight()) - i7, i7 + (arrayOfInt[i1] - localRect.top));
          if (this.c.getBackground() != null)
          {
            this.c.getBackground().getPadding(this.z);
            i10 -= this.z.top + this.z.bottom;
          }
          int i11;
          int i14;
          int i15;
          PopupWindow localPopupWindow2;
          if ((this.k) || (this.f == i2))
          {
            i11 = i10 + i4;
            boolean bool2 = g();
            if (!this.c.isShowing())
              break label1044;
            if (this.g != i2)
              break label939;
            i14 = i2;
            if (this.f != i2)
              break label1014;
            if (!bool2)
              break label969;
            i15 = i11;
            if (!bool2)
              break label980;
            PopupWindow localPopupWindow4 = this.c;
            if (this.g != i2)
              break label975;
            localPopupWindow4.setWindowLayoutMode(i2, 0);
            localPopupWindow2 = this.c;
            if ((this.l) || (this.k))
              break label1039;
          }
          boolean bool1;
          while (true)
          {
            localPopupWindow2.setOutsideTouchable(i1);
            this.c.update(this.p, this.h, this.i, i14, i15);
            return;
            int i20 = 0;
            break;
            ((LinearLayout)localObject).addView(locals, localLayoutParams2);
            ((LinearLayout)localObject).addView(localView3);
            break label251;
            ((LinearLayout)localObject).addView(localView3);
            ((LinearLayout)localObject).addView(locals, localLayoutParams2);
            break label251;
            this.c.getContentView();
            View localView1 = this.m;
            if (localView1 == null)
              break label1281;
            LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
            i3 = localView1.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin;
            break label305;
            this.z.setEmpty();
            i4 = 0;
            break label365;
            int i6 = 0;
            break label379;
            int i17;
            switch (this.g)
            {
            default:
              i17 = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
            case -2:
            case -1:
            }
            while (true)
            {
              int i18 = this.e.a(i17, i10 - i3, i2);
              if (i18 > 0)
                i3 += i4;
              i11 = i3 + i18;
              break;
              i17 = View.MeasureSpec.makeMeasureSpec(this.b.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), -2147483648);
              continue;
              i17 = View.MeasureSpec.makeMeasureSpec(this.b.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), 1073741824);
            }
            if (this.g == -2)
            {
              i14 = this.p.getWidth();
              break label575;
            }
            i14 = this.g;
            break label575;
            i15 = i2;
            break label592;
            i2 = 0;
            break label611;
            PopupWindow localPopupWindow3 = this.c;
            if (this.g == i2);
            for (int i16 = i2; ; i16 = 0)
            {
              localPopupWindow3.setWindowLayoutMode(i16, i2);
              break;
            }
            if (this.f == -2)
            {
              i15 = i11;
              break label618;
            }
            i15 = this.f;
            break label618;
            bool1 = false;
          }
          int i12;
          int i13;
          PopupWindow localPopupWindow1;
          if (this.g == i2)
          {
            i12 = i2;
            if (this.f != i2)
              break label1228;
            i13 = i2;
            this.c.setWindowLayoutMode(i12, i13);
            localPopupWindow1 = this.c;
            if ((this.l) || (this.k))
              break label1269;
          }
          while (true)
          {
            localPopupWindow1.setOutsideTouchable(bool1);
            this.c.setTouchInterceptor(this.u);
            this.c.showAsDropDown(this.p, this.h, this.i);
            this.e.setSelection(i2);
            if ((!this.A) || (this.e.isInTouchMode()))
              e();
            if (this.A)
              break;
            this.y.post(this.w);
            return;
            if (this.g == -2)
            {
              this.c.setWidth(this.p.getWidth());
              i12 = 0;
              break label1055;
            }
            this.c.setWidth(this.g);
            i12 = 0;
            break label1055;
            if (this.f == -2)
            {
              this.c.setHeight(i11);
              i13 = 0;
              break label1066;
            }
            this.c.setHeight(this.f);
            i13 = 0;
            break label1066;
            bool1 = false;
          }
        }
        label975: label980: label1269: i3 = 0;
      }
      label939: localObject = locals;
    }
  }

  public final void c(int paramInt)
  {
    this.i = paramInt;
    this.j = true;
  }

  public final void d()
  {
    this.c.dismiss();
    if (this.m != null)
    {
      ViewParent localViewParent = this.m.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.m);
    }
    this.c.setContentView(null);
    this.e = null;
    this.y.removeCallbacks(this.t);
  }

  public final void d(int paramInt)
  {
    Drawable localDrawable = this.c.getBackground();
    if (localDrawable != null)
    {
      localDrawable.getPadding(this.z);
      this.g = (paramInt + (this.z.left + this.z.right));
      return;
    }
    this.g = paramInt;
  }

  public final void e()
  {
    s locals = this.e;
    if (locals != null)
    {
      s.a(locals, true);
      locals.requestLayout();
    }
  }

  public final void e(int paramInt)
  {
    this.c.setInputMethodMode(2);
  }

  public final void f(int paramInt)
  {
    s locals = this.e;
    if ((this.c.isShowing()) && (locals != null))
    {
      s.a(locals, false);
      locals.setSelection(paramInt);
      if (locals.getChoiceMode() != 0)
        locals.setItemChecked(paramInt, true);
    }
  }

  public final boolean f()
  {
    return this.c.isShowing();
  }

  public final boolean g()
  {
    return this.c.getInputMethodMode() == 2;
  }

  public final ListView h()
  {
    return this.e;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.ListPopupWindow
 * JD-Core Version:    0.6.2
 */