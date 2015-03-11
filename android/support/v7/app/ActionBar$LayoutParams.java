package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import textnow.g.k;

public class ActionBar$LayoutParams extends ViewGroup.MarginLayoutParams
{
  public int a = -1;

  public ActionBar$LayoutParams(int paramInt)
  {
    this(-2, -1, 19);
  }

  private ActionBar$LayoutParams(int paramInt1, int paramInt2, int paramInt3)
  {
    super(-2, -1);
    this.a = paramInt3;
  }

  public ActionBar$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.b);
    this.a = localTypedArray.getInt(0, -1);
    localTypedArray.recycle();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.ActionBar.LayoutParams
 * JD-Core Version:    0.6.2
 */