package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.af;
import android.support.v4.view.av;
import android.support.v7.internal.widget.al;
import android.support.v7.internal.widget.ao;
import android.support.v7.internal.widget.ar;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CompoundButton;
import java.util.List;
import textnow.g.b;
import textnow.g.l;

public class SwitchCompat extends CompoundButton
{
  private static final int[] G = { 16842912 };
  private static final int[] a;
  private Layout A;
  private Layout B;
  private TransformationMethod C;
  private Animation D;
  private final Rect E = new Rect();
  private final al F;
  private Drawable b;
  private Drawable c;
  private int d;
  private int e;
  private int f;
  private boolean g;
  private CharSequence h;
  private CharSequence i;
  private boolean j;
  private int k;
  private int l;
  private float m;
  private float n;
  private VelocityTracker o = VelocityTracker.obtain();
  private int p;
  private float q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private TextPaint y = new TextPaint(1);
  private ColorStateList z;

  static
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = 16842904;
    arrayOfInt[1] = 16842901;
    arrayOfInt[2] = b.x;
    a = arrayOfInt;
  }

  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.w);
  }

  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getResources();
    this.y.density = localResources.getDisplayMetrics().density;
    ao localao = ao.a(paramContext, paramAttributeSet, l.bo, paramInt, 0);
    this.b = localao.a(l.br);
    this.c = localao.a(l.by);
    this.h = localao.b(l.bq);
    this.i = localao.b(l.bp);
    this.j = localao.a(l.bs, true);
    this.d = localao.d(l.bx, 0);
    this.e = localao.d(l.bu, 0);
    this.f = localao.d(l.bv, 0);
    this.g = localao.a(l.bt, false);
    int i1 = localao.f(l.bw, 0);
    TypedArray localTypedArray;
    if (i1 != 0)
    {
      localTypedArray = paramContext.obtainStyledAttributes(i1, a);
      ColorStateList localColorStateList = localTypedArray.getColorStateList(0);
      if (localColorStateList == null)
        break label352;
      this.z = localColorStateList;
      int i2 = localTypedArray.getDimensionPixelSize(1, 0);
      if ((i2 != 0) && (i2 != this.y.getTextSize()))
      {
        this.y.setTextSize(i2);
        requestLayout();
      }
      if (!localTypedArray.getBoolean(2, false))
        break label363;
    }
    label352: label363: for (this.C = new textnow.j.a(getContext()); ; this.C = null)
    {
      localTypedArray.recycle();
      this.F = localao.c();
      localao.b();
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
      this.l = localViewConfiguration.getScaledTouchSlop();
      this.p = localViewConfiguration.getScaledMinimumFlingVelocity();
      refreshDrawableState();
      setChecked(isChecked());
      return;
      this.z = getTextColors();
      break;
    }
  }

  private Layout a(CharSequence paramCharSequence)
  {
    if (this.C != null);
    for (CharSequence localCharSequence = this.C.getTransformation(paramCharSequence, this); ; localCharSequence = paramCharSequence)
      return new StaticLayout(localCharSequence, this.y, (int)Math.ceil(Layout.getDesiredWidth(localCharSequence, this.y)), Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
  }

  private void a(float paramFloat)
  {
    this.q = paramFloat;
    invalidate();
  }

  private boolean a()
  {
    return this.q > 0.5F;
  }

  private int b()
  {
    if (ar.a(this));
    for (float f1 = 1.0F - this.q; ; f1 = this.q)
      return (int)(0.5F + f1 * c());
  }

  private int c()
  {
    if (this.c != null)
    {
      Rect localRect = this.E;
      this.c.getPadding(localRect);
      return this.r - this.t - localRect.left - localRect.right;
    }
    return 0;
  }

  public void draw(Canvas paramCanvas)
  {
    Rect localRect = this.E;
    int i1 = this.u;
    int i2 = this.v;
    int i3 = this.w;
    int i4 = this.x;
    int i5 = i1 + b();
    if (this.c != null)
    {
      this.c.getPadding(localRect);
      i5 += localRect.left;
      this.c.setBounds(i1, i2, i3, i4);
    }
    if (this.b != null)
    {
      this.b.getPadding(localRect);
      int i6 = i5 - localRect.left;
      int i7 = i5 + this.t + localRect.right;
      this.b.setBounds(i6, i2, i7, i4);
      Drawable localDrawable = getBackground();
      if (localDrawable != null)
        textnow.a.a.a(localDrawable, i6, i2, i7, i4);
    }
    super.draw(paramCanvas);
  }

  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    super.drawableHotspotChanged(paramFloat1, paramFloat2);
    if (this.b != null)
      textnow.a.a.a(this.b, paramFloat1, paramFloat2);
    if (this.c != null)
      textnow.a.a.a(this.c, paramFloat1, paramFloat2);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if (this.b != null)
      this.b.setState(arrayOfInt);
    if (this.c != null)
      this.c.setState(arrayOfInt);
    invalidate();
  }

  public int getCompoundPaddingLeft()
  {
    int i1;
    if (!ar.a(this))
      i1 = super.getCompoundPaddingLeft();
    do
    {
      return i1;
      i1 = super.getCompoundPaddingLeft() + this.r;
    }
    while (TextUtils.isEmpty(getText()));
    return i1 + this.f;
  }

  public int getCompoundPaddingRight()
  {
    int i1;
    if (ar.a(this))
      i1 = super.getCompoundPaddingRight();
    do
    {
      return i1;
      i1 = super.getCompoundPaddingRight() + this.r;
    }
    while (TextUtils.isEmpty(getText()));
    return i1 + this.f;
  }

  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.b != null)
        this.b.jumpToCurrentState();
      if (this.c != null)
        this.c.jumpToCurrentState();
      if ((this.D != null) && (this.D.hasStarted()) && (!this.D.hasEnded()))
      {
        clearAnimation();
        this.D = null;
      }
    }
  }

  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked())
      mergeDrawableStates(arrayOfInt, G);
    return arrayOfInt;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Rect localRect1 = this.E;
    Drawable localDrawable1 = this.c;
    int i3;
    int i4;
    int i5;
    Layout localLayout;
    label100: Rect localRect2;
    if (localDrawable1 != null)
    {
      localDrawable1.getPadding(localRect1);
      int i1 = this.v;
      int i2 = this.x;
      i3 = i1 + localRect1.top;
      i4 = i2 - localRect1.bottom;
      Drawable localDrawable2 = this.b;
      if (localDrawable1 != null)
        localDrawable1.draw(paramCanvas);
      i5 = paramCanvas.save();
      if (localDrawable2 != null)
        localDrawable2.draw(paramCanvas);
      if (!a())
        break label230;
      localLayout = this.A;
      if (localLayout != null)
      {
        int[] arrayOfInt = getDrawableState();
        if (this.z != null)
          this.y.setColor(this.z.getColorForState(arrayOfInt, 0));
        this.y.drawableState = arrayOfInt;
        if (localDrawable2 == null)
          break label239;
        localRect2 = localDrawable2.getBounds();
      }
    }
    label230: label239: for (int i6 = localRect2.left + localRect2.right; ; i6 = getWidth())
    {
      int i7 = i6 / 2 - localLayout.getWidth() / 2;
      int i8 = (i3 + i4) / 2 - localLayout.getHeight() / 2;
      paramCanvas.translate(i7, i8);
      localLayout.draw(paramCanvas);
      paramCanvas.restoreToCount(i5);
      return;
      localRect1.setEmpty();
      break;
      localLayout = this.B;
      break label100;
    }
  }

  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(SwitchCompat.class.getName());
  }

  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(SwitchCompat.class.getName());
      if (!isChecked())
        break label59;
    }
    CharSequence localCharSequence2;
    label59: for (CharSequence localCharSequence1 = this.h; ; localCharSequence1 = this.i)
    {
      if (!TextUtils.isEmpty(localCharSequence1))
      {
        localCharSequence2 = paramAccessibilityNodeInfo.getText();
        if (!TextUtils.isEmpty(localCharSequence2))
          break;
        paramAccessibilityNodeInfo.setText(localCharSequence1);
      }
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localCharSequence2).append(' ').append(localCharSequence1);
    paramAccessibilityNodeInfo.setText(localStringBuilder);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Rect localRect;
    int i2;
    int i1;
    label69: int i4;
    int i3;
    if (this.b != null)
    {
      localRect = this.E;
      if (this.c != null)
        this.c.getPadding(localRect);
    }
    else
    {
      if (!ar.a(this))
        break label152;
      i2 = 0 + getPaddingLeft();
      i1 = 0 + (0 + (i2 + this.r));
      switch (0x70 & getGravity())
      {
      default:
        i4 = getPaddingTop();
        i3 = i4 + this.s;
      case 16:
      case 80:
      }
    }
    while (true)
    {
      this.u = i2;
      this.v = i4;
      this.x = i3;
      this.w = i1;
      return;
      localRect.setEmpty();
      break;
      label152: i1 = 0 + (getWidth() - getPaddingRight());
      i2 = 0 + (0 + (i1 - this.r));
      break label69;
      i4 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2 - this.s / 2;
      i3 = i4 + this.s;
      continue;
      i3 = getHeight() - getPaddingBottom();
      i4 = i3 - this.s;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.j)
    {
      if (this.A == null)
        this.A = a(this.h);
      if (this.B == null)
        this.B = a(this.i);
    }
    Rect localRect = this.E;
    int i2;
    int i1;
    int i3;
    if (this.b != null)
    {
      this.b.getPadding(localRect);
      i2 = this.b.getIntrinsicWidth() - localRect.left - localRect.right;
      i1 = this.b.getIntrinsicHeight();
      if (!this.j)
        break label252;
      i3 = Math.max(this.A.getWidth(), this.B.getWidth()) + 2 * this.d;
      label127: this.t = Math.max(i3, i2);
      if (this.c == null)
        break label258;
      this.c.getPadding(localRect);
    }
    for (int i4 = this.c.getIntrinsicHeight(); ; i4 = 0)
    {
      int i5 = localRect.left;
      int i6 = localRect.right;
      int i7 = Math.max(this.e, i6 + (i5 + 2 * this.t));
      int i8 = Math.max(i4, i1);
      this.r = i7;
      this.s = i8;
      super.onMeasure(paramInt1, paramInt2);
      if (getMeasuredHeight() < i8)
        setMeasuredDimension(av.k(this), i8);
      return;
      i1 = 0;
      i2 = 0;
      break;
      label252: i3 = 0;
      break label127;
      label258: localRect.setEmpty();
    }
  }

  @TargetApi(14)
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked());
    for (CharSequence localCharSequence = this.h; ; localCharSequence = this.i)
    {
      if (localCharSequence != null)
        paramAccessibilityEvent.getText().add(localCharSequence);
      return;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = 1.0F;
    int i1 = 1;
    this.o.addMovement(paramMotionEvent);
    switch (af.a(paramMotionEvent))
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      i1 = super.onTouchEvent(paramMotionEvent);
      label469: label480: 
      while (true)
      {
        return i1;
        float f9 = paramMotionEvent.getX();
        float f10 = paramMotionEvent.getY();
        if (!isEnabled())
          break;
        int i5 = b();
        this.b.getPadding(this.E);
        int i6 = this.v - this.l;
        int i7 = i5 + this.u - this.l;
        int i8 = i7 + this.t + this.E.left + this.E.right + this.l;
        int i9 = this.x + this.l;
        boolean bool4 = f9 < i7;
        int i10 = 0;
        if (bool4)
        {
          boolean bool5 = f9 < i8;
          i10 = 0;
          if (bool5)
          {
            boolean bool6 = f10 < i6;
            i10 = 0;
            if (bool6)
            {
              boolean bool7 = f10 < i9;
              i10 = 0;
              if (bool7)
                i10 = i1;
            }
          }
        }
        if (i10 == 0)
          break;
        this.k = i1;
        this.m = f9;
        this.n = f10;
        break;
        switch (this.k)
        {
        case 0:
        default:
          break;
        case 1:
          float f7 = paramMotionEvent.getX();
          float f8 = paramMotionEvent.getY();
          if ((Math.abs(f7 - this.m) <= this.l) && (Math.abs(f8 - this.n) <= this.l))
            break;
          this.k = 2;
          getParent().requestDisallowInterceptTouchEvent(i1);
          this.m = f7;
          this.n = f8;
          return i1;
        case 2:
          float f3 = paramMotionEvent.getX();
          int i4 = c();
          float f4 = f3 - this.m;
          float f5;
          float f6;
          if (i4 != 0)
          {
            f5 = f4 / i4;
            if (ar.a(this))
              f5 = -f5;
            f6 = f5 + this.q;
            if (f6 >= 0.0F)
              break label469;
            f1 = 0.0F;
          }
          while (true)
          {
            if (f1 == this.q)
              break label480;
            this.m = f3;
            a(f1);
            return i1;
            if (f4 > 0.0F)
            {
              f5 = f1;
              break;
            }
            f5 = -1.0F;
            break;
            if (f6 <= f1)
              f1 = f6;
          }
        }
      }
      if (this.k == 2)
      {
        this.k = 0;
        float f2;
        boolean bool1;
        if ((paramMotionEvent.getAction() == i1) && (isEnabled()))
        {
          int i2 = i1;
          if (i2 == 0)
            break label648;
          this.o.computeCurrentVelocity(1000);
          f2 = this.o.getXVelocity();
          if (Math.abs(f2) <= this.p)
            break label639;
          if (!ar.a(this))
            break label619;
          boolean bool3 = f2 < 0.0F;
          bool1 = false;
          if (bool3)
            bool1 = i1;
        }
        while (true)
        {
          setChecked(bool1);
          MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
          localMotionEvent.setAction(3);
          super.onTouchEvent(localMotionEvent);
          localMotionEvent.recycle();
          super.onTouchEvent(paramMotionEvent);
          return i1;
          int i3 = 0;
          break;
          label619: boolean bool2 = f2 < 0.0F;
          bool1 = false;
          if (bool2)
          {
            bool1 = i1;
            continue;
            label639: bool1 = a();
            continue;
            label648: bool1 = isChecked();
          }
        }
      }
      this.k = 0;
      this.o.clear();
    }
  }

  public void setChecked(boolean paramBoolean)
  {
    float f1 = 1.0F;
    super.setChecked(paramBoolean);
    boolean bool = isChecked();
    if (getWindowToken() != null)
    {
      final float f2 = this.q;
      if (bool);
      while (true)
      {
        this.D = new Animation()
        {
          protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
          {
            SwitchCompat.a(SwitchCompat.this, f2 + paramAnonymousFloat * this.b);
          }
        };
        this.D.setDuration(250L);
        startAnimation(this.D);
        return;
        f1 = 0.0F;
      }
    }
    if (this.D != null)
    {
      clearAnimation();
      this.D = null;
    }
    if (bool);
    while (true)
    {
      a(f1);
      return;
      f1 = 0.0F;
    }
  }

  public void toggle()
  {
    if (!isChecked());
    for (boolean bool = true; ; bool = false)
    {
      setChecked(bool);
      return;
    }
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.b) || (paramDrawable == this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SwitchCompat
 * JD-Core Version:    0.6.2
 */