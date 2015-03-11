package android.support.v7.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class ActionBarActivityDelegateBase$PanelFeatureState$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
  };
  int a;
  boolean b;
  Bundle c;

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    if (this.b);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      if (this.b)
        paramParcel.writeBundle(this.c);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateBase.PanelFeatureState.SavedState
 * JD-Core Version:    0.6.2
 */