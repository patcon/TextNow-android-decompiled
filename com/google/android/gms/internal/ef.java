package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public final class ef
{
  public final int errorCode;
  public final bl nM;
  public final bu nN;
  public final String nO;
  public final bo nP;
  public final List<String> nt;
  public final List<String> nu;
  public final long nx;
  public final int orientation;
  public final ex oy;
  public final ai pX;
  public final String qa;
  public final long qf;
  public final boolean qg;
  public final long qh;
  public final List<String> qi;
  public final String ql;
  public final al rA;
  public final long rB;
  public final long rC;
  public final JSONObject ry;
  public final bm rz;

  public ef(ai paramai, ex paramex, List<String> paramList1, int paramInt1, List<String> paramList2, List<String> paramList3, int paramInt2, long paramLong1, String paramString1, boolean paramBoolean, bl parambl, bu parambu, String paramString2, bm parambm, bo parambo, long paramLong2, al paramal, long paramLong3, long paramLong4, long paramLong5, String paramString3, JSONObject paramJSONObject)
  {
    this.pX = paramai;
    this.oy = paramex;
    List localList1;
    List localList2;
    if (paramList1 != null)
    {
      localList1 = Collections.unmodifiableList(paramList1);
      this.nt = localList1;
      this.errorCode = paramInt1;
      if (paramList2 == null)
        break label175;
      localList2 = Collections.unmodifiableList(paramList2);
      label48: this.nu = localList2;
      if (paramList3 == null)
        break label181;
    }
    label175: label181: for (List localList3 = Collections.unmodifiableList(paramList3); ; localList3 = null)
    {
      this.qi = localList3;
      this.orientation = paramInt2;
      this.nx = paramLong1;
      this.qa = paramString1;
      this.qg = paramBoolean;
      this.nM = parambl;
      this.nN = parambu;
      this.nO = paramString2;
      this.rz = parambm;
      this.nP = parambo;
      this.qh = paramLong2;
      this.rA = paramal;
      this.qf = paramLong3;
      this.rB = paramLong4;
      this.rC = paramLong5;
      this.ql = paramString3;
      this.ry = paramJSONObject;
      return;
      localList1 = null;
      break;
      localList2 = null;
      break label48;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ef
 * JD-Core Version:    0.6.2
 */