package com.enflick.android.TextNow.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public abstract class AbsDrawerView extends ScrollView
{
  private a a;

  public AbsDrawerView(Context paramContext)
  {
    super(paramContext);
  }

  public AbsDrawerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AbsDrawerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public static void a()
  {
  }

  public abstract void a(int paramInt);

  public final void a(a parama)
  {
    this.a = parama;
  }

  public void b()
  {
  }

  protected final void b(int paramInt)
  {
    if (this.a != null)
      this.a.b(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.AbsDrawerView
 * JD-Core Version:    0.6.2
 */