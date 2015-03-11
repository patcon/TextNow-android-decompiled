package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class PlaybackStateCompat
  implements Parcelable
{
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator()
  {
  };
  private final int a;
  private final long b;
  private final long c;
  private final float d;
  private final long e;
  private final CharSequence f;
  private final long g;

  private PlaybackStateCompat(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readLong();
    this.d = paramParcel.readFloat();
    this.g = paramParcel.readLong();
    this.c = paramParcel.readLong();
    this.e = paramParcel.readLong();
    this.f = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=").append(this.a);
    localStringBuilder.append(", position=").append(this.b);
    localStringBuilder.append(", buffered position=").append(this.c);
    localStringBuilder.append(", speed=").append(this.d);
    localStringBuilder.append(", updated=").append(this.g);
    localStringBuilder.append(", actions=").append(this.e);
    localStringBuilder.append(", error=").append(this.f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeLong(this.b);
    paramParcel.writeFloat(this.d);
    paramParcel.writeLong(this.g);
    paramParcel.writeLong(this.c);
    paramParcel.writeLong(this.e);
    TextUtils.writeToParcel(this.f, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat
 * JD-Core Version:    0.6.2
 */