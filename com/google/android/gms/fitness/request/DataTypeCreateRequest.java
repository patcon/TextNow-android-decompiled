package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Field;
import java.util.Collections;
import java.util.List;

public class DataTypeCreateRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<DataTypeCreateRequest> CREATOR = new i();
  private final int BR;
  private final List<Field> SY;
  private final String mName;

  DataTypeCreateRequest(int paramInt, String paramString, List<Field> paramList)
  {
    this.BR = paramInt;
    this.mName = paramString;
    this.SY = Collections.unmodifiableList(paramList);
  }

  private DataTypeCreateRequest(DataTypeCreateRequest.Builder paramBuilder)
  {
    this.BR = 1;
    this.mName = DataTypeCreateRequest.Builder.a(paramBuilder);
    this.SY = Collections.unmodifiableList(DataTypeCreateRequest.Builder.b(paramBuilder));
  }

  private boolean a(DataTypeCreateRequest paramDataTypeCreateRequest)
  {
    return (n.equal(this.mName, paramDataTypeCreateRequest.mName)) && (n.equal(this.SY, paramDataTypeCreateRequest.SY));
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataTypeCreateRequest)) && (a((DataTypeCreateRequest)paramObject)));
  }

  public List<Field> getFields()
  {
    return this.SY;
  }

  public String getName()
  {
    return this.mName;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.mName;
    arrayOfObject[1] = this.SY;
    return n.hashCode(arrayOfObject);
  }

  public String toString()
  {
    return n.h(this).a("name", this.mName).a("fields", this.SY).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.DataTypeCreateRequest
 * JD-Core Version:    0.6.2
 */