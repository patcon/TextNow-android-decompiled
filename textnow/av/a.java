package textnow.av;

import android.view.View;

public final class a
{
  public static float a(View paramView)
  {
    if (textnow.aw.a.a)
      return textnow.aw.a.a(paramView).g();
    return paramView.getTranslationX();
  }

  public static void a(View paramView, float paramFloat)
  {
    if (textnow.aw.a.a)
    {
      textnow.aw.a.a(paramView).a(paramFloat);
      return;
    }
    paramView.setAlpha(paramFloat);
  }

  public static float b(View paramView)
  {
    if (textnow.aw.a.a)
      return textnow.aw.a.a(paramView).i();
    return paramView.getX();
  }

  public static void b(View paramView, float paramFloat)
  {
    if (textnow.aw.a.a)
    {
      textnow.aw.a.a(paramView).g(paramFloat);
      return;
    }
    paramView.setTranslationX(paramFloat);
  }

  public static void c(View paramView, float paramFloat)
  {
    if (textnow.aw.a.a)
    {
      textnow.aw.a.a(paramView).h(paramFloat);
      return;
    }
    paramView.setTranslationY(paramFloat);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.av.a
 * JD-Core Version:    0.6.2
 */