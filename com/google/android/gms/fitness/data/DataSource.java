package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.kw;

public class DataSource
  implements SafeParcelable
{
  public static final Parcelable.Creator<DataSource> CREATOR = new g();
  public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
  public static final int TYPE_DERIVED = 1;
  public static final int TYPE_RAW;
  private final int BR;
  private final int FD;
  private final Device SO;
  private final a SP;
  private final String SQ;
  private final boolean SR;
  private final String SS;
  private final DataType Sp;
  private final String mName;

  DataSource(int paramInt1, DataType paramDataType, String paramString1, int paramInt2, Device paramDevice, a parama, String paramString2, boolean paramBoolean)
  {
    this.BR = paramInt1;
    this.Sp = paramDataType;
    this.FD = paramInt2;
    this.mName = paramString1;
    this.SO = paramDevice;
    this.SP = parama;
    this.SQ = paramString2;
    this.SR = paramBoolean;
    this.SS = iN();
  }

  private DataSource(DataSource.Builder paramBuilder)
  {
    this.BR = 3;
    this.Sp = DataSource.Builder.a(paramBuilder);
    this.FD = DataSource.Builder.b(paramBuilder);
    this.mName = DataSource.Builder.c(paramBuilder);
    this.SO = DataSource.Builder.d(paramBuilder);
    this.SP = DataSource.Builder.e(paramBuilder);
    this.SQ = DataSource.Builder.f(paramBuilder);
    this.SR = DataSource.Builder.g(paramBuilder);
    this.SS = iN();
  }

  private boolean a(DataSource paramDataSource)
  {
    return this.SS.equals(paramDataSource.SS);
  }

  public static DataSource extract(Intent paramIntent)
  {
    if (paramIntent == null)
      return null;
    return (DataSource)c.a(paramIntent, "vnd.google.fitness.data_source", CREATOR);
  }

  private String getTypeString()
  {
    switch (this.FD)
    {
    default:
      throw new IllegalArgumentException("invalid type value");
    case 0:
      return "raw";
    case 1:
    }
    return "derived";
  }

  private String iN()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getTypeString());
    localStringBuilder.append(":").append(this.Sp.getName());
    if (this.SP != null)
      localStringBuilder.append(":").append(this.SP.getPackageName());
    if (this.SO != null)
      localStringBuilder.append(":").append(this.SO.getStreamIdentifier());
    if (this.SQ != null)
      localStringBuilder.append(":").append(this.SQ);
    return localStringBuilder.toString();
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataSource)) && (a((DataSource)paramObject)));
  }

  public String getAppPackageName()
  {
    if (this.SP == null)
      return null;
    return this.SP.getPackageName();
  }

  public DataType getDataType()
  {
    return this.Sp;
  }

  public Device getDevice()
  {
    return this.SO;
  }

  public String getName()
  {
    return this.mName;
  }

  public String getStreamIdentifier()
  {
    return this.SS;
  }

  public String getStreamName()
  {
    return this.SQ;
  }

  public int getType()
  {
    return this.FD;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    return this.SS.hashCode();
  }

  public a iM()
  {
    return this.SP;
  }

  public boolean iO()
  {
    return this.SR;
  }

  public DataSource iP()
  {
    Device localDevice;
    if (this.SO == null)
    {
      localDevice = null;
      if (this.SP != null)
        break label63;
    }
    label63: for (a locala = null; ; locala = this.SP.iA())
    {
      return new DataSource(3, this.Sp, this.mName, this.FD, localDevice, locala, kw.bt(this.SQ), this.SR);
      localDevice = this.SO.iT();
      break;
    }
  }

  public String toDebugString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    String str1;
    String str2;
    label50: String str3;
    label107: StringBuilder localStringBuilder4;
    if (this.FD == 0)
    {
      str1 = "r";
      StringBuilder localStringBuilder2 = localStringBuilder1.append(str1).append(":").append(this.Sp.iQ());
      if (this.SP != null)
        break label164;
      str2 = "";
      StringBuilder localStringBuilder3 = localStringBuilder2.append(str2);
      if (this.SO == null)
        break label214;
      str3 = ":" + this.SO.getModel() + ":" + this.SO.getUid();
      localStringBuilder4 = localStringBuilder3.append(str3);
      if (this.SQ == null)
        break label221;
    }
    label164: label214: label221: for (String str4 = ":" + this.SQ; ; str4 = "")
    {
      return str4;
      str1 = "d";
      break;
      if (this.SP.equals(a.Sw))
      {
        str2 = ":gms";
        break label50;
      }
      str2 = ":" + this.SP.getPackageName();
      break label50;
      str3 = "";
      break label107;
    }
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DataSource{");
    localStringBuilder.append(getTypeString());
    if (this.mName != null)
      localStringBuilder.append(":").append(this.mName);
    if (this.SP != null)
      localStringBuilder.append(":").append(this.SP);
    if (this.SO != null)
      localStringBuilder.append(":").append(this.SO);
    if (this.SQ != null)
      localStringBuilder.append(":").append(this.SQ);
    localStringBuilder.append(":").append(this.Sp);
    return "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(kw.c(this), paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.DataSource
 * JD-Core Version:    0.6.2
 */