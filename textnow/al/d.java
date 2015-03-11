package textnow.al;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.handmark.pulltorefresh.library.a;
import com.handmark.pulltorefresh.library.e;
import com.handmark.pulltorefresh.library.k;

public abstract class d extends FrameLayout
  implements a
{
  static final Interpolator a = new LinearInterpolator();
  protected final ImageView b;
  protected final ProgressBar c;
  protected final e d;
  protected final k e;
  private FrameLayout f;
  private boolean g;
  private final TextView h;
  private final TextView i;
  private CharSequence j;
  private CharSequence k;
  private CharSequence l;

  public d(Context paramContext, e parame, k paramk, TypedArray paramTypedArray)
  {
    super(paramContext);
    this.d = parame;
    this.e = paramk;
    FrameLayout.LayoutParams localLayoutParams;
    int i2;
    label179: Drawable localDrawable1;
    switch (1.a[paramk.ordinal()])
    {
    default:
      LayoutInflater.from(paramContext).inflate(2130903185, this);
      this.f = ((FrameLayout)findViewById(2131558914));
      this.h = ((TextView)this.f.findViewById(2131558917));
      this.c = ((ProgressBar)this.f.findViewById(2131558916));
      this.i = ((TextView)this.f.findViewById(2131558918));
      this.b = ((ImageView)this.f.findViewById(2131558915));
      localLayoutParams = (FrameLayout.LayoutParams)this.f.getLayoutParams();
      switch (1.b[parame.ordinal()])
      {
      default:
        if (paramk == k.a)
        {
          i2 = 80;
          localLayoutParams.gravity = i2;
          this.j = paramContext.getString(2131296387);
          this.k = paramContext.getString(2131296389);
          this.l = paramContext.getString(2131296388);
          if (paramTypedArray.hasValue(1))
          {
            Drawable localDrawable2 = paramTypedArray.getDrawable(1);
            if (localDrawable2 != null)
              setBackgroundDrawable(localDrawable2);
          }
          if (paramTypedArray.hasValue(10))
          {
            TypedValue localTypedValue1 = new TypedValue();
            paramTypedArray.getValue(10, localTypedValue1);
            int n = localTypedValue1.data;
            if (this.h != null)
              this.h.setTextAppearance(getContext(), n);
            if (this.i != null)
              this.i.setTextAppearance(getContext(), n);
          }
          if (paramTypedArray.hasValue(11))
          {
            TypedValue localTypedValue2 = new TypedValue();
            paramTypedArray.getValue(11, localTypedValue2);
            int i1 = localTypedValue2.data;
            if (this.i != null)
              this.i.setTextAppearance(getContext(), i1);
          }
          if (paramTypedArray.hasValue(2))
          {
            ColorStateList localColorStateList2 = paramTypedArray.getColorStateList(2);
            if (localColorStateList2 != null)
            {
              if (this.h != null)
                this.h.setTextColor(localColorStateList2);
              if (this.i != null)
                this.i.setTextColor(localColorStateList2);
            }
          }
          if (paramTypedArray.hasValue(3))
          {
            ColorStateList localColorStateList1 = paramTypedArray.getColorStateList(3);
            if ((localColorStateList1 != null) && (this.i != null))
              this.i.setTextColor(localColorStateList1);
          }
          boolean bool = paramTypedArray.hasValue(6);
          localDrawable1 = null;
          if (bool)
            localDrawable1 = paramTypedArray.getDrawable(6);
          switch (1.b[parame.ordinal()])
          {
          default:
            if (paramTypedArray.hasValue(7))
              localDrawable1 = paramTypedArray.getDrawable(7);
            break;
          case 1:
          }
        }
        break;
      case 1:
      }
      break;
    case 1:
    }
    while (true)
    {
      if (localDrawable1 == null)
        localDrawable1 = paramContext.getResources().getDrawable(e());
      this.b.setImageDrawable(localDrawable1);
      this.g = (localDrawable1 instanceof AnimationDrawable);
      a(localDrawable1);
      j();
      return;
      LayoutInflater.from(paramContext).inflate(2130903184, this);
      break;
      if (paramk == k.a);
      for (int m = 48; ; m = 3)
      {
        localLayoutParams.gravity = m;
        this.j = paramContext.getString(2131296393);
        this.k = paramContext.getString(2131296395);
        this.l = paramContext.getString(2131296394);
        break;
      }
      i2 = 5;
      break label179;
      if (paramTypedArray.hasValue(17))
      {
        f.a("ptrDrawableTop", "ptrDrawableStart");
        localDrawable1 = paramTypedArray.getDrawable(17);
        continue;
        if (paramTypedArray.hasValue(8))
        {
          localDrawable1 = paramTypedArray.getDrawable(8);
        }
        else if (paramTypedArray.hasValue(18))
        {
          f.a("ptrDrawableBottom", "ptrDrawableEnd");
          localDrawable1 = paramTypedArray.getDrawable(18);
        }
      }
    }
  }

  protected abstract void a();

  protected abstract void a(float paramFloat);

  public final void a(int paramInt)
  {
    getLayoutParams().height = paramInt;
    requestLayout();
  }

  protected abstract void a(Drawable paramDrawable);

  public final void a(CharSequence paramCharSequence)
  {
    this.j = paramCharSequence;
  }

  protected abstract void b();

  public final void b(float paramFloat)
  {
    if (!this.g)
      a(paramFloat);
  }

  public final void b(int paramInt)
  {
    getLayoutParams().width = paramInt;
    requestLayout();
  }

  public final void b(CharSequence paramCharSequence)
  {
    this.k = paramCharSequence;
  }

  protected abstract void c();

  public final void c(CharSequence paramCharSequence)
  {
    this.l = paramCharSequence;
  }

  protected abstract void d();

  protected abstract int e();

  public final int f()
  {
    switch (1.a[this.e.ordinal()])
    {
    default:
      return this.f.getHeight();
    case 1:
    }
    return this.f.getWidth();
  }

  public final void g()
  {
    if (this.h != null)
      this.h.setText(this.j);
    a();
  }

  public final void h()
  {
    if (this.h != null)
      this.h.setText(this.k);
    if (this.g)
      ((AnimationDrawable)this.b.getDrawable()).start();
    while (true)
    {
      if (this.i != null)
        this.i.setVisibility(8);
      return;
      b();
    }
  }

  public final void i()
  {
    if (this.h != null)
      this.h.setText(this.l);
    c();
  }

  public final void j()
  {
    if (this.h != null)
      this.h.setText(this.j);
    this.b.setVisibility(0);
    if (this.g)
      ((AnimationDrawable)this.b.getDrawable()).stop();
    while (true)
    {
      if (this.i != null)
      {
        if (!TextUtils.isEmpty(this.i.getText()))
          break;
        this.i.setVisibility(8);
      }
      return;
      d();
    }
    this.i.setVisibility(0);
  }

  public final void k()
  {
    if (4 == this.h.getVisibility())
      this.h.setVisibility(0);
    if (4 == this.c.getVisibility())
      this.c.setVisibility(0);
    if (4 == this.b.getVisibility())
      this.b.setVisibility(0);
    if (4 == this.i.getVisibility())
      this.i.setVisibility(0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.al.d
 * JD-Core Version:    0.6.2
 */