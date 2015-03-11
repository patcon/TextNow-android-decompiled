package cz.acrobits.ali;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class XMLTree$ParcelableCreator
  implements Parcelable.Creator<XMLTree>
{
  public final XMLTree createFromParcel(Parcel paramParcel)
  {
    return XMLTree.parse(paramParcel.readString());
  }

  public final XMLTree[] newArray(int paramInt)
  {
    return new XMLTree[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.ali.XMLTree.ParcelableCreator
 * JD-Core Version:    0.6.2
 */