package textnow.av;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

public abstract class b
{
  private static final WeakHashMap<View, b> a = new WeakHashMap(0);

  public static b a(View paramView)
  {
    Object localObject = (b)a.get(paramView);
    int i;
    if (localObject == null)
    {
      i = Integer.valueOf(Build.VERSION.SDK).intValue();
      if (i < 14)
        break label51;
      localObject = new g(paramView);
    }
    while (true)
    {
      a.put(paramView, localObject);
      return localObject;
      label51: if (i >= 11)
        localObject = new c(paramView);
      else
        localObject = new h(paramView);
    }
  }

  public abstract b a(float paramFloat);

  public abstract b a(long paramLong);

  public abstract b a(Interpolator paramInterpolator);

  public abstract b a(textnow.at.b paramb);

  public abstract b b(float paramFloat);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.av.b
 * JD-Core Version:    0.6.2
 */