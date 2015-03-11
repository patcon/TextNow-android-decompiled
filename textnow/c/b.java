package textnow.c;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public final class b
{
  public static <T> Parcelable.Creator<T> a(d<T> paramd)
  {
    if (Build.VERSION.SDK_INT >= 13)
      new e(paramd);
    return new c(paramd);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.c.b
 * JD-Core Version:    0.6.2
 */