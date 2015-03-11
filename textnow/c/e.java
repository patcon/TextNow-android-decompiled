package textnow.c;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class e<T>
  implements Parcelable.ClassLoaderCreator<T>
{
  private final d<T> a;

  public e(d<T> paramd)
  {
    this.a = paramd;
  }

  public final T createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }

  public final T createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return this.a.a(paramParcel, paramClassLoader);
  }

  public final T[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.c.e
 * JD-Core Version:    0.6.2
 */