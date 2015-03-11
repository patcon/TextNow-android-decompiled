package com.enflick.android.TextNow.tasks;

import android.content.Context;
import android.os.AsyncTask;
import textnow.z.h;

public final class a extends AsyncTask<Void, Void, Void>
{
  private String a;
  private String b;
  private Boolean c;
  private String d;
  private h e;
  private Context f;

  public a(Context paramContext, h paramh, String paramString1, String paramString2, Boolean paramBoolean, long paramLong)
  {
    this.e = paramh;
    this.e.b(paramString2);
    this.e.a(paramString1);
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramBoolean;
    this.d = Long.toString(paramLong);
    this.f = paramContext;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.a
 * JD-Core Version:    0.6.2
 */