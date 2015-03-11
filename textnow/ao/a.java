package textnow.ao;

import android.view.View;

public final class a
{
  public static float a(View paramView)
  {
    if (textnow.ap.a.a)
      return textnow.ap.a.a(paramView).g();
    return paramView.getTranslationX();
  }

  public static void a(View paramView, float paramFloat)
  {
    if (textnow.ap.a.a)
    {
      textnow.ap.a.a(paramView).a(paramFloat);
      return;
    }
    paramView.setAlpha(paramFloat);
  }

  public static float b(View paramView)
  {
    if (textnow.ap.a.a)
      return textnow.ap.a.a(paramView).i();
    return paramView.getX();
  }

  public static void b(View paramView, float paramFloat)
  {
    if (textnow.ap.a.a)
    {
      textnow.ap.a.a(paramView).g(paramFloat);
      return;
    }
    paramView.setTranslationX(paramFloat);
  }

  public static void c(View paramView, float paramFloat)
  {
    if (textnow.ap.a.a)
    {
      textnow.ap.a.a(paramView).h(paramFloat);
      return;
    }
    paramView.setTranslationY(paramFloat);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ao.a
 * JD-Core Version:    0.6.2
 */