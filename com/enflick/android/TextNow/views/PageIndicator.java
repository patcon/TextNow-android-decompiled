package com.enflick.android.TextNow.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class PageIndicator extends LinearLayout
  implements View.OnFocusChangeListener
{
  protected LayoutInflater a;
  protected Context b;
  protected f c;
  protected ArrayList<ImageView> d = new ArrayList();
  protected LinearLayout e;
  protected int f;
  protected int g = 0;
  private int h;
  private int i;

  public PageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = LayoutInflater.from(paramContext);
    this.a.inflate(2130903177, this);
    this.b = paramContext;
    this.h = this.b.getResources().getColor(2131230805);
    this.i = this.b.getResources().getColor(2131230806);
  }

  private static void a(ImageView paramImageView, int paramInt)
  {
    paramImageView.getDrawable().mutate().setColorFilter(paramInt, PorterDuff.Mode.MULTIPLY);
  }

  private void f(int paramInt)
  {
    int j = 0;
    if (j < this.d.size())
    {
      if (j == paramInt)
        a((ImageView)this.d.get(j), this.h);
      while (true)
      {
        j++;
        break;
        a((ImageView)this.d.get(j), this.i);
      }
    }
  }

  public final void a()
  {
    int j = -1 + this.d.size();
    this.d.remove(j);
    this.e.removeViewAt(j);
  }

  public final void a(int paramInt)
  {
    this.h = this.b.getResources().getColor(2131230808);
  }

  public final void a(View paramView)
  {
    this.e.addView(paramView);
    this.d.add((ImageView)paramView);
  }

  public final void a(f paramf)
  {
    this.c = paramf;
  }

  public final void b()
  {
    this.d.clear();
    this.e.removeAllViews();
  }

  public final void b(int paramInt)
  {
    this.i = this.b.getResources().getColor(2131230807);
  }

  public final void c()
  {
    ImageView localImageView = new ImageView(this.b);
    localImageView.setLayoutParams(((ImageView)this.d.get(0)).getLayoutParams());
    localImageView.setImageResource(2130837886);
    localImageView.setTag("page" + this.d.size());
    localImageView.setFocusable(true);
    localImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    localImageView.setOnFocusChangeListener(this);
    this.d.add(localImageView);
    this.e.addView(localImageView, -1 + this.d.size());
  }

  public final void c(int paramInt)
  {
    for (int j = 0; j < paramInt; j++)
      c();
  }

  public final void d()
  {
    this.g = this.f;
    if (this.f == -1 + this.d.size());
    for (this.f = 0; ; this.f = (1 + this.f))
    {
      f(this.f);
      return;
    }
  }

  public final void d(int paramInt)
  {
    e(paramInt);
  }

  public final void e()
  {
    this.g = this.f;
    if (this.f == 0);
    for (this.f = (-1 + this.d.size()); ; this.f = (-1 + this.f))
    {
      f(this.f);
      return;
    }
  }

  public final void e(int paramInt)
  {
    this.f = paramInt;
    f(paramInt);
  }

  public final int f()
  {
    return this.f;
  }

  public final int g()
  {
    return this.d.size();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.e = ((LinearLayout)findViewById(2131558891));
    this.e.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
      }
    });
    ImageView localImageView = (ImageView)findViewById(2131558767);
    localImageView.setOnFocusChangeListener(this);
    this.d.add(localImageView);
    this.f = 0;
    this.e.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean)
          ((ImageView)PageIndicator.this.d.get(0)).requestFocus();
      }
    });
  }

  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      String str = (String)paramView.getTag();
      int j = Integer.valueOf(str.substring(-1 + str.length())).intValue();
      e(j);
      this.c.a(j, this.g);
      return;
    }
    a((ImageView)paramView, this.h);
    this.g = this.f;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.PageIndicator
 * JD-Core Version:    0.6.2
 */