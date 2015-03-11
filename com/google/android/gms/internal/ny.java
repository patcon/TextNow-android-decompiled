package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

public final class ny extends d
  implements Moment
{
  private nw amZ;

  public ny(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }

  private nw nt()
  {
    try
    {
      if (this.amZ == null)
      {
        byte[] arrayOfByte = getByteArray("momentImpl");
        Parcel localParcel = Parcel.obtain();
        localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
        localParcel.setDataPosition(0);
        this.amZ = nw.CREATOR.dc(localParcel);
        localParcel.recycle();
      }
      return this.amZ;
    }
    finally
    {
    }
  }

  public final String getId()
  {
    return nt().getId();
  }

  public final ItemScope getResult()
  {
    return nt().getResult();
  }

  public final String getStartDate()
  {
    return nt().getStartDate();
  }

  public final ItemScope getTarget()
  {
    return nt().getTarget();
  }

  public final String getType()
  {
    return nt().getType();
  }

  public final boolean hasId()
  {
    return nt().hasId();
  }

  public final boolean hasResult()
  {
    return nt().hasResult();
  }

  public final boolean hasStartDate()
  {
    return nt().hasStartDate();
  }

  public final boolean hasTarget()
  {
    return nt().hasTarget();
  }

  public final boolean hasType()
  {
    return nt().hasType();
  }

  public final nw ns()
  {
    return nt();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ny
 * JD-Core Version:    0.6.2
 */