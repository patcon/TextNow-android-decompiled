package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator()
  {
  };
  private final int a;
  private final float b;

  private RatingCompat(int paramInt, float paramFloat)
  {
    this.a = paramInt;
    this.b = paramFloat;
  }

  public final int describeContents()
  {
    return this.a;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("Rating:style=").append(this.a).append(" rating=");
    if (this.b < 0.0F);
    for (String str = "unrated"; ; str = String.valueOf(this.b))
      return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeFloat(this.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.media.RatingCompat
 * JD-Core Version:    0.6.2
 */