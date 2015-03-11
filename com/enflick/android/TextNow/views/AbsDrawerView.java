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

  public abstract void a();

  public abstract void a(int paramInt);

  public final void a(a parama)
  {
    this.a = parama;
  }

  public final void b()
  {
    if (this.a != null)
      this.a.g();
  }

  protected final void b(int paramInt)
  {
    if (this.a != null)
      this.a.a(paramInt);
  }

  public void c()
  {
    if (this.a != null)
      this.a.h();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.AbsDrawerView
 * JD-Core Version:    0.6.2
 */