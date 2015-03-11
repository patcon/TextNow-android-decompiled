package com.enflick.android.TextNow.views;

import android.content.Context;
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
  protected e c;
  protected ArrayList<ImageView> d = new ArrayList();
  protected LinearLayout e;
  protected int f;
  protected int g = 0;

  public PageIndicator(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = LayoutInflater.from(paramContext);
    this.a.inflate(2130903161, this);
    this.b = paramContext;
  }

  private void c(int paramInt)
  {
    int i = 0;
    if (i < this.d.size())
    {
      if (i == paramInt)
        ((ImageView)this.d.get(i)).setImageResource(2130837922);
      while (true)
      {
        i++;
        break;
        ((ImageView)this.d.get(i)).setImageResource(2130837923);
      }
    }
  }

  public final void a()
  {
    int i = -1 + this.d.size();
    this.d.remove(i);
    this.e.removeViewAt(i);
  }

  public final void a(int paramInt)
  {
    b(paramInt);
    ((ImageView)this.d.get(paramInt)).setImageResource(2130837923);
  }

  public final void a(View paramView)
  {
    this.e.addView(paramView);
    this.d.add((ImageView)paramView);
  }

  public final void a(e parame)
  {
    this.c = parame;
  }

  public final void b()
  {
    this.d.clear();
    this.e.removeAllViews();
  }

  public final void b(int paramInt)
  {
    this.f = paramInt;
    c(paramInt);
  }

  public final void c()
  {
    ImageView localImageView = new ImageView(this.b);
    localImageView.setLayoutParams(((ImageView)this.d.get(0)).getLayoutParams());
    localImageView.setImageResource(2130837923);
    localImageView.setBackgroundResource(2130838063);
    localImageView.setTag("page" + this.d.size());
    localImageView.setFocusable(true);
    localImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    localImageView.setOnFocusChangeListener(this);
    this.d.add(localImageView);
    this.e.addView(localImageView, -1 + this.d.size());
  }

  public final void d()
  {
    this.g = this.f;
    if (this.f == -1 + this.d.size());
    for (this.f = 0; ; this.f = (1 + this.f))
    {
      c(this.f);
      return;
    }
  }

  public final void e()
  {
    this.g = this.f;
    if (this.f == 0);
    for (this.f = (-1 + this.d.size()); ; this.f = (-1 + this.f))
    {
      c(this.f);
      return;
    }
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
    this.e = ((LinearLayout)findViewById(2131165595));
    this.e.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
      }
    });
    ImageView localImageView = (ImageView)findViewById(2131165596);
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
      int i = Integer.valueOf(str.substring(-1 + str.length())).intValue();
      a(i);
      this.c.a(i, this.g);
      return;
    }
    ((ImageView)paramView).setImageResource(2130837922);
    this.g = this.f;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.PageIndicator
 * JD-Core Version:    0.6.2
 */