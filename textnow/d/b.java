package textnow.d;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b<T>
  implements Parcelable.Creator<T>
{
  final c<T> a;

  public b(c<T> paramc)
  {
    this.a = paramc;
  }

  public final T createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }

  public final T[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.d.b
 * JD-Core Version:    0.6.2
 */