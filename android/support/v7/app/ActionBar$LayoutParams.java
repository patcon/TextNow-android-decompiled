package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import textnow.g.l;

public class ActionBar$LayoutParams extends ViewGroup.MarginLayoutParams
{
  public int a = 0;

  public ActionBar$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    this.a = 8388627;
  }

  public ActionBar$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l.b);
    this.a = localTypedArray.getInt(l.c, 0);
    localTypedArray.recycle();
  }

  public ActionBar$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.a = paramLayoutParams.a;
  }

  public ActionBar$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.ActionBar.LayoutParams
 * JD-Core Version:    0.6.2
 */