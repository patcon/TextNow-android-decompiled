package com.enflick.android.TextNow.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.enflick.android.TextNow.b;

public class TintedFrameLayout extends FrameLayout
{
  private final String a = "TintedFrameLayout";
  private int b = 16777215;
  private int c = 16777215;

  public TintedFrameLayout(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }

  public TintedFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }

  public TintedFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b.B);
      int i = 0;
      if (i < localTypedArray.length())
      {
        switch (localTypedArray.getIndex(i))
        {
        default:
        case 0:
        }
        while (true)
        {
          i++;
          break;
          this.b = localTypedArray.getInt(i, -1);
          a(this.b);
        }
      }
      localTypedArray.recycle();
    }
  }

  public final void a(float paramFloat)
  {
    float[] arrayOfFloat = new float[3];
    Color.colorToHSV(this.b, arrayOfFloat);
    arrayOfFloat[2] = (paramFloat * arrayOfFloat[2]);
    a(Color.HSVToColor(arrayOfFloat));
  }

  public final void a(int paramInt)
  {
    this.c = paramInt;
    if ((this.c != -1) && (this.c != 16777215))
    {
      if (Build.VERSION.SDK_INT < 16)
        setBackgroundDrawable(getBackground());
    }
    else
      return;
    setBackground(getBackground());
  }

  @TargetApi(16)
  public void setBackground(Drawable paramDrawable)
  {
    if ((this.c != -1) && (this.c != 16777215) && (paramDrawable != null))
      paramDrawable.mutate().setColorFilter(this.c, PorterDuff.Mode.MULTIPLY);
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = getPaddingRight();
    int m = getPaddingBottom();
    super.setBackground(paramDrawable);
    setPadding(i, j, k, m);
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    if ((this.c != -1) && (this.c != 16777215) && (paramDrawable != null))
      paramDrawable.mutate().setColorFilter(this.c, PorterDuff.Mode.MULTIPLY);
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = getPaddingRight();
    int m = getPaddingBottom();
    super.setBackgroundDrawable(paramDrawable);
    setPadding(i, j, k, m);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.TintedFrameLayout
 * JD-Core Version:    0.6.2
 */