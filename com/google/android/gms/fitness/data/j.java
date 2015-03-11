package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j
  implements Parcelable.Creator<Field>
{
  static void a(Field paramField, Parcel paramParcel, int paramInt)
  {
    int i = b.D(paramParcel);
    b.a(paramParcel, 1, paramField.getName(), false);
    b.c(paramParcel, 1000, paramField.getVersionCode());
    b.c(paramParcel, 2, paramField.getFormat());
    b.H(paramParcel, i);
  }

  public Field bq(Parcel paramParcel)
  {
    int i = 0;
    int j = a.C(paramParcel);
    String str = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.B(paramParcel);
      switch (a.aD(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        str = a.o(paramParcel, m);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        i = a.g(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new Field(k, str, i);
  }

  public Field[] cG(int paramInt)
  {
    return new Field[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.j
 * JD-Core Version:    0.6.2
 */