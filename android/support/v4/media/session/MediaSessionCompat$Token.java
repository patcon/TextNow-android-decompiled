package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$Token
  implements Parcelable
{
  public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator()
  {
  };
  private final Parcelable a;

  MediaSessionCompat$Token(Parcelable paramParcelable)
  {
    this.a = paramParcelable;
  }

  public final int describeContents()
  {
    return this.a.describeContents();
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.Token
 * JD-Core Version:    0.6.2
 */