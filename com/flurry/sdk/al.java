package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.TextView;

public class al
{
  private static int a;
  private static int b;
  private Path c = null;
  private PathShape d = null;
  private ShapeDrawable e = null;
  private TextView f = null;
  private int g = 0;
  private float h = 0.0F;
  private RectF i = null;
  private final float j = -90.0F;

  public al()
  {
    a = 3;
    b = 1;
  }

  public al(Context paramContext, int paramInt1, int paramInt2)
  {
    a = fc.b(2);
    b = fc.b(1);
    this.g = a(paramInt1, paramInt2);
    a(paramContext);
  }

  private int a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
      return paramInt1 / 2;
    return paramInt2 / 2;
  }

  private void a(Context paramContext)
  {
    this.f = new TextView(paramContext);
    this.f.setTextColor(-1);
    this.f.setTypeface(Typeface.MONOSPACE);
    this.f.setTextSize(1, 12.0F);
    this.f.setGravity(17);
  }

  @SuppressLint({"NewApi"})
  private void c(int paramInt)
  {
    Drawable localDrawable = b(paramInt);
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.f.setBackground(localDrawable);
      return;
    }
    this.f.setBackgroundDrawable(localDrawable);
  }

  private void d(int paramInt)
  {
    c(paramInt);
  }

  private void e(int paramInt)
  {
    this.f.setText(Integer.toString(paramInt));
  }

  public View a()
  {
    return this.f;
  }

  public void a(int paramInt)
  {
    this.h = (360.0F / (paramInt / 1000));
    c(paramInt);
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    if (this.f != null)
    {
      c(paramInt);
      e(paramInt);
    }
  }

  public Drawable b(int paramInt)
  {
    this.i = new RectF();
    this.i.set(a, a, this.g - a, this.g - a);
    this.c = new Path();
    this.c.arcTo(this.i, -90.0F, 1.0F + -paramInt * this.h, false);
    this.d = new PathShape(this.c, this.g, this.g);
    this.e = new ShapeDrawable(this.d);
    this.e.setIntrinsicHeight(2 * this.g);
    this.e.setIntrinsicWidth(2 * this.g);
    this.e.getPaint().setStyle(Paint.Style.STROKE);
    this.e.getPaint().setColor(-1);
    this.e.getPaint().setStrokeWidth(b);
    this.e.getPaint().setAntiAlias(true);
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setColor(-16777216);
    localGradientDrawable.setShape(1);
    localGradientDrawable.setAlpha(178);
    Drawable[] arrayOfDrawable = new Drawable[2];
    arrayOfDrawable[0] = localGradientDrawable;
    arrayOfDrawable[1] = this.e;
    return new LayerDrawable(arrayOfDrawable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.al
 * JD-Core Version:    0.6.2
 */