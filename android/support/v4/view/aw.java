package android.support.v4.view;

import android.view.View;

final class aw extends be
{
  public final void a(View paramView)
  {
    paramView.requestApplyInsets();
  }

  public final void a(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }

  public final void a(View paramView, aj paramaj)
  {
    paramView.setOnApplyWindowInsetsListener(new bg.1(paramaj));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.aw
 * JD-Core Version:    0.6.2
 */