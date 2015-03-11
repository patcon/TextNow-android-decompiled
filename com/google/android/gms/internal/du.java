package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class du
  implements SafeParcelable
{
  public static final dv CREATOR = new dv();
  public final int errorCode;
  public final List<String> nt;
  public final List<String> nu;
  public final long nx;
  public final String oA;
  public final int orientation;
  public final String qe;
  public final long qf;
  public final boolean qg;
  public final long qh;
  public final List<String> qi;
  public final String qj;
  public final long qk;
  public final String ql;
  public final boolean qm;
  public final String qn;
  public final String qo;
  public final int versionCode;

  public du(int paramInt)
  {
    this(7, null, null, null, paramInt, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null);
  }

  public du(int paramInt, long paramLong)
  {
    this(7, null, null, null, paramInt, null, -1L, false, -1L, null, paramLong, -1, null, -1L, null, false, null, null);
  }

  du(int paramInt1, String paramString1, String paramString2, List<String> paramList1, int paramInt2, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt3, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6)
  {
    this.versionCode = paramInt1;
    this.oA = paramString1;
    this.qe = paramString2;
    List localList1;
    List localList2;
    if (paramList1 != null)
    {
      localList1 = Collections.unmodifiableList(paramList1);
      this.nt = localList1;
      this.errorCode = paramInt2;
      if (paramList2 == null)
        break label152;
      localList2 = Collections.unmodifiableList(paramList2);
      label55: this.nu = localList2;
      this.qf = paramLong1;
      this.qg = paramBoolean1;
      this.qh = paramLong2;
      if (paramList3 == null)
        break label158;
    }
    label152: label158: for (List localList3 = Collections.unmodifiableList(paramList3); ; localList3 = null)
    {
      this.qi = localList3;
      this.nx = paramLong3;
      this.orientation = paramInt3;
      this.qj = paramString3;
      this.qk = paramLong4;
      this.ql = paramString4;
      this.qm = paramBoolean2;
      this.qn = paramString5;
      this.qo = paramString6;
      return;
      localList1 = null;
      break;
      localList2 = null;
      break label55;
    }
  }

  public du(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean, long paramLong2, List<String> paramList3, long paramLong3, int paramInt, String paramString3, long paramLong4, String paramString4, String paramString5)
  {
    this(7, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean, paramLong2, paramList3, paramLong3, paramInt, paramString3, paramLong4, paramString4, false, null, paramString5);
  }

  public du(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2, long paramLong1, boolean paramBoolean1, long paramLong2, List<String> paramList3, long paramLong3, int paramInt, String paramString3, long paramLong4, String paramString4, boolean paramBoolean2, String paramString5, String paramString6)
  {
    this(7, paramString1, paramString2, paramList1, -2, paramList2, paramLong1, paramBoolean1, paramLong2, paramList3, paramLong3, paramInt, paramString3, paramLong4, paramString4, paramBoolean2, paramString5, paramString6);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    dv.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.du
 * JD-Core Version:    0.6.2
 */