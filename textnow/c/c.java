package textnow.c;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class c<T>
  implements Parcelable.Creator<T>
{
  final d<T> a;

  public c(d<T> paramd)
  {
    this.a = paramd;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.c.c
 * JD-Core Version:    0.6.2
 */