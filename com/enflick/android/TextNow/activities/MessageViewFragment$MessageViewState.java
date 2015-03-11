package com.enflick.android.TextNow.activities;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import textnow.z.f;

public class MessageViewFragment$MessageViewState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
  {
  };
  public static MessageViewState a = new MessageViewState();
  public String b = "";
  public f[] c;
  public String[] d;
  public String e = "";
  public int f = -1;

  public MessageViewFragment$MessageViewState()
  {
  }

  public MessageViewFragment$MessageViewState(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    Serializable localSerializable1 = paramParcel.readSerializable();
    f[] arrayOff;
    Serializable localSerializable2;
    if ((localSerializable1 instanceof f[]))
    {
      arrayOff = (f[])localSerializable1;
      this.c = arrayOff;
      localSerializable2 = paramParcel.readSerializable();
      if (!(localSerializable2 instanceof String[]))
        break label103;
    }
    label103: for (String[] arrayOfString = (String[])localSerializable2; ; arrayOfString = new String[0])
    {
      this.d = arrayOfString;
      this.e = paramParcel.readString();
      this.f = paramParcel.readInt();
      return;
      arrayOff = new f[0];
      break;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeSerializable(this.c);
    paramParcel.writeSerializable(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeInt(this.f);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.MessageViewFragment.MessageViewState
 * JD-Core Version:    0.6.2
 */