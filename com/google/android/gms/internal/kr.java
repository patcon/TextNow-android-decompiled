package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

public final class kr extends d
  implements Moment
{
  private kp adp;

  public kr(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }

  private kp kE()
  {
    try
    {
      if (this.adp == null)
      {
        byte[] arrayOfByte = getByteArray("momentImpl");
        Parcel localParcel = Parcel.obtain();
        localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
        localParcel.setDataPosition(0);
        this.adp = kp.CREATOR.bF(localParcel);
        localParcel.recycle();
      }
      return this.adp;
    }
    finally
    {
    }
  }

  public final String getId()
  {
    return kE().getId();
  }

  public final ItemScope getResult()
  {
    return kE().getResult();
  }

  public final String getStartDate()
  {
    return kE().getStartDate();
  }

  public final ItemScope getTarget()
  {
    return kE().getTarget();
  }

  public final String getType()
  {
    return kE().getType();
  }

  public final boolean hasId()
  {
    return kE().hasId();
  }

  public final boolean hasResult()
  {
    return kE().hasId();
  }

  public final boolean hasStartDate()
  {
    return kE().hasStartDate();
  }

  public final boolean hasTarget()
  {
    return kE().hasTarget();
  }

  public final boolean hasType()
  {
    return kE().hasType();
  }

  public final kp kD()
  {
    return kE();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kr
 * JD-Core Version:    0.6.2
 */