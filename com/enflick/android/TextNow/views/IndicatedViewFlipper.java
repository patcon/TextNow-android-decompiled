package com.enflick.android.TextNow.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class IndicatedViewFlipper extends LinearLayout
{
  static int a;
  private Context b;
  private ViewFlipper c;
  private PageIndicator d;
  private LayoutInflater e;
  private Animation f;
  private Animation g;
  private Animation h;
  private Animation i;
  private float j = 0.0F;
  private boolean k = false;

  public IndicatedViewFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = LayoutInflater.from(paramContext);
    this.e.inflate(2130903131, this);
    this.b = paramContext;
    this.f = AnimationUtils.loadAnimation(this.b, 2130968589);
    this.f.setDuration(200L);
    this.g = AnimationUtils.loadAnimation(this.b, 2130968590);
    this.g.setDuration(200L);
    this.h = AnimationUtils.loadAnimation(this.b, 2130968591);
    this.h.setDuration(200L);
    this.i = AnimationUtils.loadAnimation(this.b, 2130968592);
    this.i.setDuration(200L);
    a = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }

  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public final boolean a()
  {
    return this.k;
  }

  public final ViewFlipper b()
  {
    return this.c;
  }

  public final void b(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }

  public final PageIndicator c()
  {
    return this.d;
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    float f1;
    float f2;
    do
    {
      return super.dispatchTouchEvent(paramMotionEvent);
      this.j = paramMotionEvent.getX();
      return true | super.dispatchTouchEvent(paramMotionEvent);
      f1 = paramMotionEvent.getX();
      f2 = Math.abs(f1 - this.j);
      if ((this.j < f1) && (f2 > a) && (this.d.g() > 1) && ((this.k) || (this.d.f() > 0)))
      {
        this.c.setInAnimation(this.f);
        this.c.setOutAnimation(this.i);
        this.c.showPrevious();
        this.d.e();
        return true;
      }
    }
    while ((this.j <= f1) || (f2 <= a) || (this.d.g() <= 1) || ((!this.k) && (this.d.f() == -1 + this.d.g())));
    this.c.setInAnimation(this.g);
    this.c.setOutAnimation(this.h);
    this.c.showNext();
    this.d.d();
    return true;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((ViewFlipper)findViewById(2131165518));
    this.c.setClickable(true);
    this.d = ((PageIndicator)findViewById(2131165519));
    this.d.a(new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        if (paramAnonymousInt1 > paramAnonymousInt2)
        {
          IndicatedViewFlipper.b(IndicatedViewFlipper.this).setInAnimation(IndicatedViewFlipper.a(IndicatedViewFlipper.this));
          IndicatedViewFlipper.b(IndicatedViewFlipper.this).setOutAnimation(IndicatedViewFlipper.c(IndicatedViewFlipper.this));
        }
        while (true)
        {
          IndicatedViewFlipper.b(IndicatedViewFlipper.this).setDisplayedChild(paramAnonymousInt1);
          return;
          if (paramAnonymousInt1 < paramAnonymousInt2)
          {
            IndicatedViewFlipper.b(IndicatedViewFlipper.this).setInAnimation(IndicatedViewFlipper.d(IndicatedViewFlipper.this));
            IndicatedViewFlipper.b(IndicatedViewFlipper.this).setOutAnimation(IndicatedViewFlipper.e(IndicatedViewFlipper.this));
          }
        }
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.IndicatedViewFlipper
 * JD-Core Version:    0.6.2
 */