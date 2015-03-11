package com.enflick.android.TextNow.activities;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import textnow.u.d;

public class MessageViewFragment$MessageViewState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
  {
  };
  public static MessageViewState a = new MessageViewState("", new d[0], new String[0]);
  private String b;
  private d[] c;
  private String[] d;

  public MessageViewFragment$MessageViewState(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    Serializable localSerializable1 = paramParcel.readSerializable();
    d[] arrayOfd;
    Serializable localSerializable2;
    if ((localSerializable1 instanceof d[]))
    {
      arrayOfd = (d[])localSerializable1;
      this.c = arrayOfd;
      localSerializable2 = paramParcel.readSerializable();
      if (!(localSerializable2 instanceof String[]))
        break label70;
    }
    label70: for (String[] arrayOfString = (String[])localSerializable2; ; arrayOfString = new String[0])
    {
      this.d = arrayOfString;
      return;
      arrayOfd = new d[0];
      break;
    }
  }

  public MessageViewFragment$MessageViewState(String paramString, d[] paramArrayOfd, String[] paramArrayOfString)
  {
    this.b = paramString;
    this.c = paramArrayOfd;
    this.d = paramArrayOfString;
  }

  public final String a()
  {
    return this.b;
  }

  public final d[] b()
  {
    return this.c;
  }

  public final String[] c()
  {
    return this.d;
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
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.MessageViewFragment.MessageViewState
 * JD-Core Version:    0.6.2
 */