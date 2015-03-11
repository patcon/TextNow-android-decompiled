package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.g.a;

public final class SignInButton extends FrameLayout
  implements View.OnClickListener
{
  public static final int COLOR_DARK = 0;
  public static final int COLOR_LIGHT = 1;
  public static final int SIZE_ICON_ONLY = 2;
  public static final int SIZE_STANDARD = 0;
  public static final int SIZE_WIDE = 1;
  private View Im;
  private View.OnClickListener In = null;
  private int mColor;
  private int mSize;

  public SignInButton(Context paramContext)
  {
    this(paramContext, null);
  }

  public SignInButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public SignInButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setStyle(0, 0);
  }

  private void G(Context paramContext)
  {
    if (this.Im != null)
      removeView(this.Im);
    try
    {
      this.Im = p.b(paramContext, this.mSize, this.mColor);
      addView(this.Im);
      this.Im.setEnabled(isEnabled());
      this.Im.setOnClickListener(this);
      return;
    }
    catch (g.a locala)
    {
      while (true)
        this.Im = a(paramContext, this.mSize, this.mColor);
    }
  }

  private static Button a(Context paramContext, int paramInt1, int paramInt2)
  {
    q localq = new q(paramContext);
    localq.a(paramContext.getResources(), paramInt1, paramInt2);
    return localq;
  }

  public final void onClick(View paramView)
  {
    if ((this.In != null) && (paramView == this.Im))
      this.In.onClick(this);
  }

  public final void setColorScheme(int paramInt)
  {
    setStyle(this.mSize, paramInt);
  }

  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.Im.setEnabled(paramBoolean);
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.In = paramOnClickListener;
    if (this.Im != null)
      this.Im.setOnClickListener(this);
  }

  public final void setSize(int paramInt)
  {
    setStyle(paramInt, this.mColor);
  }

  public final void setStyle(int paramInt1, int paramInt2)
  {
    boolean bool1;
    if ((paramInt1 >= 0) && (paramInt1 < 3))
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      o.a(bool1, "Unknown button size %d", arrayOfObject1);
      if ((paramInt2 < 0) || (paramInt2 >= 2))
        break label92;
    }
    label92: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt2);
      o.a(bool2, "Unknown color scheme %s", arrayOfObject2);
      this.mSize = paramInt1;
      this.mColor = paramInt2;
      G(getContext());
      return;
      bool1 = false;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SignInButton
 * JD-Core Version:    0.6.2
 */