package com.enflick.android.TextNow.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.enflick.android.TextNow.b;

public class TintedImageView extends ImageView
{
  private final String a = "TintedImageView";
  private int b = -1;
  private int c = -1;

  public TintedImageView(Context paramContext)
  {
    super(paramContext);
  }

  public TintedImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (!isInEditMode())
      a(paramContext, paramAttributeSet);
  }

  public TintedImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (!isInEditMode())
      a(paramContext, paramAttributeSet);
  }

  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray;
    if (paramAttributeSet != null)
    {
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b.C);
      this.b = localTypedArray.getColor(0, -1);
      this.c = localTypedArray.getColor(1, -1);
      if ((this.c != -1) && (this.c != 16777215))
      {
        if (Build.VERSION.SDK_INT >= 16)
          break label79;
        setBackgroundDrawable(getBackground());
      }
    }
    while (true)
    {
      localTypedArray.recycle();
      setImageDrawable(getDrawable());
      return;
      label79: setBackground(getBackground());
    }
  }

  public final void a(int paramInt)
  {
    this.b = paramInt;
    setImageDrawable(getDrawable());
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

  public void setImageDrawable(Drawable paramDrawable)
  {
    if (paramDrawable != null)
      paramDrawable.mutate().setColorFilter(this.b, PorterDuff.Mode.MULTIPLY);
    super.setImageDrawable(paramDrawable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.TintedImageView
 * JD-Core Version:    0.6.2
 */