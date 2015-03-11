package textnow.d;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public final class a
{
  public static <T> Parcelable.Creator<T> a(c<T> paramc)
  {
    if (Build.VERSION.SDK_INT >= 13)
      new d(paramc);
    return new b(paramc);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.d.a
 * JD-Core Version:    0.6.2
 */