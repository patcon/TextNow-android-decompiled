package com.enflick.android.TextNow.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class QuickReplyConversationFlipper extends LinearLayout
  implements Animation.AnimationListener
{
  static int a;
  private Context b;
  private Animation c;
  private Animation d;
  private Animation e;
  private Animation f;
  private ViewFlipper g;
  private PageIndicator h;
  private f i;
  private float j = 0.0F;
  private boolean k = false;

  public QuickReplyConversationFlipper(Context paramContext)
  {
    super(paramContext);
    LayoutInflater.from(paramContext).inflate(2130903172, this);
    this.b = paramContext;
    b();
  }

  public QuickReplyConversationFlipper(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(2130903172, this);
    this.b = paramContext;
    b();
  }

  private void b()
  {
    this.c = AnimationUtils.loadAnimation(this.b, 2130968589);
    this.c.setDuration(200L);
    this.c.setAnimationListener(this);
    this.d = AnimationUtils.loadAnimation(this.b, 2130968590);
    this.d.setDuration(200L);
    this.d.setAnimationListener(this);
    this.e = AnimationUtils.loadAnimation(this.b, 2130968591);
    this.e.setDuration(200L);
    this.f = AnimationUtils.loadAnimation(this.b, 2130968592);
    this.f.setDuration(200L);
    a = 50;
  }

  public final ViewFlipper a()
  {
    return this.g;
  }

  public final void a(View paramView)
  {
    this.g.addView(paramView);
    if (this.g.getChildCount() > 1)
      this.h.c();
    if ((this.h.g() > 1) && (this.h.getVisibility() != 0))
      this.h.setVisibility(0);
  }

  public final void a(f paramf)
  {
    this.i = paramf;
  }

  public final void b(View paramView)
  {
    this.g.removeView(paramView);
    this.h.a();
    if (this.h.g() <= 1)
    {
      this.h.b(0);
      this.h.setVisibility(4);
      return;
    }
    int m = this.h.f();
    if (m >= this.h.g())
    {
      this.h.b(-1 + this.h.g());
      return;
    }
    this.h.b(m);
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
      if ((this.j < f1) && (f2 > a) && (this.g.getChildCount() > 1) && ((this.k) || (this.h.f() > 0)))
      {
        this.g.setInAnimation(this.c);
        this.g.setOutAnimation(this.f);
        ((QuickReplyConversationView)this.g.getCurrentView()).b();
        this.g.showPrevious();
        this.h.e();
        return true;
      }
    }
    while ((this.j <= f1) || (f2 <= a) || (this.g.getChildCount() <= 1) || ((!this.k) && (this.h.f() == -1 + this.h.g())));
    this.g.setInAnimation(this.d);
    this.g.setOutAnimation(this.e);
    ((QuickReplyConversationView)this.g.getCurrentView()).b();
    this.g.showNext();
    this.h.d();
    return true;
  }

  public void onAnimationEnd(Animation paramAnimation)
  {
    if (this.i != null)
      this.i.a();
  }

  public void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public void onAnimationStart(Animation paramAnimation)
  {
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.g = ((ViewFlipper)findViewById(2131165635));
    this.h = ((PageIndicator)findViewById(2131165519));
    this.h.a(new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        if (paramAnonymousInt1 > paramAnonymousInt2)
        {
          QuickReplyConversationFlipper.b(QuickReplyConversationFlipper.this).setInAnimation(QuickReplyConversationFlipper.a(QuickReplyConversationFlipper.this));
          QuickReplyConversationFlipper.b(QuickReplyConversationFlipper.this).setOutAnimation(QuickReplyConversationFlipper.c(QuickReplyConversationFlipper.this));
        }
        while (true)
        {
          QuickReplyConversationFlipper.b(QuickReplyConversationFlipper.this).setDisplayedChild(paramAnonymousInt1);
          return;
          if (paramAnonymousInt1 < paramAnonymousInt2)
          {
            QuickReplyConversationFlipper.b(QuickReplyConversationFlipper.this).setInAnimation(QuickReplyConversationFlipper.d(QuickReplyConversationFlipper.this));
            QuickReplyConversationFlipper.b(QuickReplyConversationFlipper.this).setOutAnimation(QuickReplyConversationFlipper.e(QuickReplyConversationFlipper.this));
          }
        }
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.QuickReplyConversationFlipper
 * JD-Core Version:    0.6.2
 */