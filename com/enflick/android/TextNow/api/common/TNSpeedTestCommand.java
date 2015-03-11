package com.enflick.android.TextNow.api.common;

import android.content.Context;
import textnow.y.b;

@b(a="GET")
public class TNSpeedTestCommand extends TNDownloadCommand
{
  private int a;
  private int b;

  public TNSpeedTestCommand(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    super(paramContext, paramString);
    this.a = paramInt1;
    this.b = paramInt2;
  }

  protected int getConnectionTimeOut()
  {
    return this.a;
  }

  protected int getSocketTimeOut()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.common.TNSpeedTestCommand
 * JD-Core Version:    0.6.2
 */