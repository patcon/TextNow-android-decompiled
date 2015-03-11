package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.g.a;
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.ho;

public final class SignInButton extends FrameLayout
  implements View.OnClickListener
{
  public static final int COLOR_DARK = 0;
  public static final int COLOR_LIGHT = 1;
  public static final int SIZE_ICON_ONLY = 2;
  public static final int SIZE_STANDARD = 0;
  public static final int SIZE_WIDE = 1;
  private int Dj;
  private View Dk;
  private View.OnClickListener Dl = null;
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

  private void C(Context paramContext)
  {
    if (this.Dk != null)
      removeView(this.Dk);
    try
    {
      this.Dk = hn.b(paramContext, this.mSize, this.Dj);
      addView(this.Dk);
      this.Dk.setEnabled(isEnabled());
      this.Dk.setOnClickListener(this);
      return;
    }
    catch (g.a locala)
    {
      while (true)
        this.Dk = a(paramContext, this.mSize, this.Dj);
    }
  }

  private static Button a(Context paramContext, int paramInt1, int paramInt2)
  {
    ho localho = new ho(paramContext);
    localho.a(paramContext.getResources(), paramInt1, paramInt2);
    return localho;
  }

  public final void onClick(View paramView)
  {
    if ((this.Dl != null) && (paramView == this.Dk))
      this.Dl.onClick(this);
  }

  public final void setColorScheme(int paramInt)
  {
    setStyle(this.mSize, paramInt);
  }

  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    this.Dk.setEnabled(paramBoolean);
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.Dl = paramOnClickListener;
    if (this.Dk != null)
      this.Dk.setOnClickListener(this);
  }

  public final void setSize(int paramInt)
  {
    setStyle(paramInt, this.Dj);
  }

  public final void setStyle(int paramInt1, int paramInt2)
  {
    boolean bool1;
    if ((paramInt1 >= 0) && (paramInt1 < 3))
    {
      bool1 = true;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      hm.a(bool1, "Unknown button size %d", arrayOfObject1);
      if ((paramInt2 < 0) || (paramInt2 >= 2))
        break label92;
    }
    label92: for (boolean bool2 = true; ; bool2 = false)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt2);
      hm.a(bool2, "Unknown color scheme %s", arrayOfObject2);
      this.mSize = paramInt1;
      this.Dj = paramInt2;
      C(getContext());
      return;
      bool1 = false;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.SignInButton
 * JD-Core Version:    0.6.2
 */