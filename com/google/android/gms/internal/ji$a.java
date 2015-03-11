package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

public class ji$a<I, O>
  implements SafeParcelable
{
  public static final jk CREATOR = new jk();
  private final int BR;
  protected final int MA;
  protected final boolean MB;
  protected final String MC;
  protected final int MD;
  protected final Class<? extends ji> ME;
  protected final String MF;
  private jm MG;
  private ji.b<I, O> MH;
  protected final int My;
  protected final boolean Mz;

  ji$a(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, jd paramjd)
  {
    this.BR = paramInt1;
    this.My = paramInt2;
    this.Mz = paramBoolean1;
    this.MA = paramInt3;
    this.MB = paramBoolean2;
    this.MC = paramString1;
    this.MD = paramInt4;
    if (paramString2 == null)
      this.ME = null;
    for (this.MF = null; paramjd == null; this.MF = paramString2)
    {
      this.MH = null;
      return;
      this.ME = jp.class;
    }
    this.MH = paramjd.hb();
  }

  protected ji$a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, String paramString, int paramInt3, Class<? extends ji> paramClass, ji.b<I, O> paramb)
  {
    this.BR = 1;
    this.My = paramInt1;
    this.Mz = paramBoolean1;
    this.MA = paramInt2;
    this.MB = paramBoolean2;
    this.MC = paramString;
    this.MD = paramInt3;
    this.ME = paramClass;
    if (paramClass == null);
    for (this.MF = null; ; this.MF = paramClass.getCanonicalName())
    {
      this.MH = paramb;
      return;
    }
  }

  public static a a(String paramString, int paramInt, ji.b<?, ?> paramb, boolean paramBoolean)
  {
    return new a(paramb.hd(), paramBoolean, paramb.he(), false, paramString, paramInt, null, paramb);
  }

  public static <T extends ji> a<T, T> a(String paramString, int paramInt, Class<T> paramClass)
  {
    return new a(11, false, 11, false, paramString, paramInt, paramClass, null);
  }

  public static <T extends ji> a<ArrayList<T>, ArrayList<T>> b(String paramString, int paramInt, Class<T> paramClass)
  {
    return new a(11, true, 11, true, paramString, paramInt, paramClass, null);
  }

  public static a<Integer, Integer> i(String paramString, int paramInt)
  {
    return new a(0, false, 0, false, paramString, paramInt, null, null);
  }

  public static a<Double, Double> j(String paramString, int paramInt)
  {
    return new a(4, false, 4, false, paramString, paramInt, null, null);
  }

  public static a<Boolean, Boolean> k(String paramString, int paramInt)
  {
    return new a(6, false, 6, false, paramString, paramInt, null, null);
  }

  public static a<String, String> l(String paramString, int paramInt)
  {
    return new a(7, false, 7, false, paramString, paramInt, null, null);
  }

  public static a<ArrayList<String>, ArrayList<String>> m(String paramString, int paramInt)
  {
    return new a(7, true, 7, true, paramString, paramInt, null, null);
  }

  public void a(jm paramjm)
  {
    this.MG = paramjm;
  }

  public I convertBack(O paramO)
  {
    return this.MH.convertBack(paramO);
  }

  public int describeContents()
  {
    return 0;
  }

  public int getVersionCode()
  {
    return this.BR;
  }

  public int hd()
  {
    return this.My;
  }

  public int he()
  {
    return this.MA;
  }

  public a<I, O> hi()
  {
    return new a(this.BR, this.My, this.Mz, this.MA, this.MB, this.MC, this.MD, this.MF, hq());
  }

  public boolean hj()
  {
    return this.Mz;
  }

  public boolean hk()
  {
    return this.MB;
  }

  public String hl()
  {
    return this.MC;
  }

  public int hm()
  {
    return this.MD;
  }

  public Class<? extends ji> hn()
  {
    return this.ME;
  }

  String ho()
  {
    if (this.MF == null)
      return null;
    return this.MF;
  }

  public boolean hp()
  {
    return this.MH != null;
  }

  jd hq()
  {
    if (this.MH == null)
      return null;
    return jd.a(this.MH);
  }

  public HashMap<String, a<?, ?>> hr()
  {
    o.i(this.MF);
    o.i(this.MG);
    return this.MG.be(this.MF);
  }

  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("Field\n");
    localStringBuilder1.append("            versionCode=").append(this.BR).append('\n');
    localStringBuilder1.append("                 typeIn=").append(this.My).append('\n');
    localStringBuilder1.append("            typeInArray=").append(this.Mz).append('\n');
    localStringBuilder1.append("                typeOut=").append(this.MA).append('\n');
    localStringBuilder1.append("           typeOutArray=").append(this.MB).append('\n');
    localStringBuilder1.append("        outputFieldName=").append(this.MC).append('\n');
    localStringBuilder1.append("      safeParcelFieldId=").append(this.MD).append('\n');
    localStringBuilder1.append("       concreteTypeName=").append(ho()).append('\n');
    if (hn() != null)
      localStringBuilder1.append("     concreteType.class=").append(hn().getCanonicalName()).append('\n');
    StringBuilder localStringBuilder2 = localStringBuilder1.append("          converterName=");
    if (this.MH == null);
    for (String str = "null"; ; str = this.MH.getClass().getCanonicalName())
    {
      localStringBuilder2.append(str).append('\n');
      return localStringBuilder1.toString();
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    jk.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ji.a
 * JD-Core Version:    0.6.2
 */