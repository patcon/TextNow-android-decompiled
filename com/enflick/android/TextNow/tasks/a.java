package com.enflick.android.TextNow.tasks;

import android.content.Context;
import android.os.AsyncTask;
import textnow.u.f;

public final class a extends AsyncTask<Void, Void, Void>
{
  private String a;
  private String b;
  private String c;
  private f d;
  private Context e;

  public a(Context paramContext, f paramf, String paramString1, String paramString2, long paramLong)
  {
    this.d = paramf;
    this.d.b(paramString2);
    this.d.a(paramString1);
    this.a = paramString1;
    this.b = paramString2;
    this.c = Long.toString(paramLong);
    this.e = paramContext;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.a
 * JD-Core Version:    0.6.2
 */