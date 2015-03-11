package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.jp;
import java.util.List;

public abstract interface d extends IInterface
{
  public abstract j a(b paramb, int paramInt1, int paramInt2, int paramInt3, String paramString);

  public abstract void a(jp paramjp);

  public abstract void a(b paramb);

  public abstract void a(b paramb, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3);

  public abstract void a(b paramb, Uri paramUri, Bundle paramBundle);

  public abstract void a(b paramb, jp paramjp);

  public abstract void a(b paramb, String paramString);

  public abstract void a(b paramb, String paramString1, String paramString2);

  public abstract void a(b paramb, List<String> paramList);

  public abstract void a(String paramString, jb paramjb1, jb paramjb2);

  public abstract void b(b paramb);

  public abstract void b(b paramb, String paramString);

  public abstract void c(b paramb, String paramString);

  public abstract void clearDefaultAccount();

  public abstract void d(b paramb, String paramString);

  public abstract void e(b paramb, String paramString);

  public abstract String getAccountName();

  public abstract String nb();

  public abstract boolean nc();

  public abstract String nd();

  public abstract void removeMoment(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.d
 * JD-Core Version:    0.6.2
 */