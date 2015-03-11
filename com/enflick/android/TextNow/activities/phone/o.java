package com.enflick.android.TextNow.activities.phone;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import textnow.av.a;

final class o
  implements View.OnTouchListener
{
  final int a = 150;
  private float c = 0.0F;
  private float d = 0.0F;
  private boolean e = false;

  private o(DialerFragment paramDialerFragment)
  {
  }

  private static boolean a(double paramDouble, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt3 > paramInt1)
      if ((paramInt4 < paramInt3) || (Math.abs(paramInt5 - paramInt2) > Math.tan(0.5235987755982988D) * (paramInt4 - paramInt1)));
    while ((paramInt4 <= paramInt3) && (Math.abs(paramInt5 - paramInt2) <= Math.tan(0.5235987755982988D) * (paramInt1 - paramInt4)))
    {
      return true;
      return false;
    }
    return false;
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      Rect localRect1 = new Rect();
      DialerFragment.f(this.b).getHitRect(localRect1);
      if (localRect1.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
      {
        this.e = true;
        this.c = paramMotionEvent.getX();
        this.d = paramMotionEvent.getY();
        DialerFragment.g(this.b).cancel();
        DialerFragment.h(this.b).clearAnimation();
        DialerFragment.i(this.b).clearAnimation();
        DialerFragment.h(this.b).setVisibility(8);
        DialerFragment.i(this.b).setVisibility(8);
        TranslateAnimation localTranslateAnimation1 = new TranslateAnimation((a.b(DialerFragment.f(this.b)) - a.b(DialerFragment.j(this.b))) / 2.0F, 0.0F, 0.0F, 0.0F);
        AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(0.0F, 1.0F);
        TranslateAnimation localTranslateAnimation2 = new TranslateAnimation((a.b(DialerFragment.f(this.b)) - a.b(DialerFragment.k(this.b))) / 2.0F, 0.0F, 0.0F, 0.0F);
        AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(0.0F, 1.0F);
        final AnimationSet localAnimationSet1 = new AnimationSet(true);
        final AnimationSet localAnimationSet2 = new AnimationSet(true);
        localAnimationSet1.addAnimation(localTranslateAnimation1);
        localAnimationSet1.addAnimation(localAlphaAnimation1);
        localAnimationSet1.setDuration(150L);
        localAnimationSet2.addAnimation(localTranslateAnimation2);
        localAnimationSet2.addAnimation(localAlphaAnimation2);
        localAnimationSet2.setDuration(150L);
        localAnimationSet1.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            DialerFragment.j(o.this.b).setVisibility(0);
            DialerFragment.k(o.this.b).setVisibility(0);
          }

          public final void onAnimationRepeat(Animation paramAnonymousAnimation)
          {
          }

          public final void onAnimationStart(Animation paramAnonymousAnimation)
          {
          }
        });
        DialerFragment.j(this.b).post(new Runnable()
        {
          public final void run()
          {
            DialerFragment.j(o.this.b).startAnimation(localAnimationSet1);
            DialerFragment.k(o.this.b).startAnimation(localAnimationSet2);
          }
        });
      }
    }
    do
    {
      return true;
      if ((paramMotionEvent.getAction() == 2) && (this.e))
      {
        a.b(DialerFragment.f(this.b), paramMotionEvent.getX() - this.c);
        a.c(DialerFragment.f(this.b), paramMotionEvent.getY() - this.d);
        Rect localRect5 = new Rect();
        Rect localRect6 = new Rect();
        Rect localRect7 = new Rect();
        DialerFragment.j(this.b).getHitRect(localRect5);
        DialerFragment.k(this.b).getHitRect(localRect6);
        DialerFragment.f(this.b).getHitRect(localRect7);
        int n = localRect5.left;
        int i1 = localRect6.right;
        int i2 = (i1 + n) / 2;
        int i3 = localRect5.centerY();
        if (a(0.5235987755982988D, i2, i3, n, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
        {
          a.a(DialerFragment.f(this.b), 0.0F);
          DialerFragment.j(this.b).setBackgroundResource(2130837835);
          DialerFragment.j(this.b).setImageResource(2130837557);
          return true;
        }
        if (a(0.5235987755982988D, i2, i3, i1, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
        {
          a.a(DialerFragment.f(this.b), 0.0F);
          DialerFragment.k(this.b).setBackgroundResource(2130838031);
          DialerFragment.k(this.b).setImageResource(2130837837);
          return true;
        }
        a.a(DialerFragment.f(this.b), 1.0F);
        DialerFragment.k(this.b).setBackgroundResource(17170445);
        DialerFragment.j(this.b).setBackgroundResource(17170445);
        DialerFragment.j(this.b).setImageResource(2130837556);
        DialerFragment.k(this.b).setImageResource(2130837836);
        return true;
      }
    }
    while ((paramMotionEvent.getAction() != 1) || (!this.e));
    this.e = false;
    Rect localRect2 = new Rect();
    Rect localRect3 = new Rect();
    Rect localRect4 = new Rect();
    DialerFragment.j(this.b).getHitRect(localRect2);
    DialerFragment.k(this.b).getHitRect(localRect3);
    DialerFragment.f(this.b).getHitRect(localRect4);
    int i = localRect2.left;
    int j = localRect3.right;
    int k = (j + i) / 2;
    int m = localRect2.centerY();
    if (a(0.5235987755982988D, k, m, i, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
    {
      DialerFragment.l(this.b);
      DialerFragment.m(this.b);
      return true;
    }
    if (a(0.5235987755982988D, k, m, j, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
    {
      DialerFragment.n(this.b);
      return true;
    }
    a.b(DialerFragment.f(this.b), 0.0F);
    a.c(DialerFragment.f(this.b), 0.0F);
    TranslateAnimation localTranslateAnimation3 = new TranslateAnimation(0.0F, (a.b(DialerFragment.f(this.b)) - a.b(DialerFragment.j(this.b))) / 2.0F, 0.0F, 0.0F);
    AlphaAnimation localAlphaAnimation3 = new AlphaAnimation(1.0F, 0.0F);
    TranslateAnimation localTranslateAnimation4 = new TranslateAnimation(0.0F, (a.b(DialerFragment.f(this.b)) - a.b(DialerFragment.k(this.b))) / 2.0F, 0.0F, 0.0F);
    AlphaAnimation localAlphaAnimation4 = new AlphaAnimation(1.0F, 0.0F);
    final AnimationSet localAnimationSet3 = new AnimationSet(true);
    final AnimationSet localAnimationSet4 = new AnimationSet(true);
    localAnimationSet3.addAnimation(localTranslateAnimation3);
    localAnimationSet3.addAnimation(localAlphaAnimation3);
    localAnimationSet3.setDuration(150L);
    localAnimationSet4.addAnimation(localTranslateAnimation4);
    localAnimationSet4.addAnimation(localAlphaAnimation4);
    localAnimationSet4.setDuration(150L);
    localAnimationSet3.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        DialerFragment.j(o.this.b).setVisibility(4);
        DialerFragment.k(o.this.b).setVisibility(4);
        if (!o.a(o.this))
          DialerFragment.h(o.this.b).startAnimation(DialerFragment.g(o.this.b));
      }

      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        DialerFragment.j(o.this.b).setBackgroundResource(17170445);
        DialerFragment.k(o.this.b).setBackgroundResource(17170445);
      }
    });
    DialerFragment.j(this.b).post(new Runnable()
    {
      public final void run()
      {
        DialerFragment.j(o.this.b).startAnimation(localAnimationSet3);
        DialerFragment.k(o.this.b).startAnimation(localAnimationSet4);
      }
    });
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.o
 * JD-Core Version:    0.6.2
 */