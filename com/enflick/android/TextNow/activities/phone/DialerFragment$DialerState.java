package com.enflick.android.TextNow.activities.phone;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import cz.acrobits.libsoftphone.data.AudioRoute;

public class DialerFragment$DialerState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
  {
  };
  public static DialerState a = new DialerState(AudioRoute.Headset);
  private AudioRoute b;

  public DialerFragment$DialerState(Parcel paramParcel)
  {
    this.b = AudioRoute.values()[paramParcel.readInt()];
  }

  public DialerFragment$DialerState(AudioRoute paramAudioRoute)
  {
    this.b = paramAudioRoute;
  }

  public final AudioRoute a()
  {
    return this.b;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.b.ordinal());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.DialerFragment.DialerState
 * JD-Core Version:    0.6.2
 */