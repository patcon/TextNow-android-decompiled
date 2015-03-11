package com.enflick.android.TextNow.api.common;

import android.content.Context;
import java.net.URI;
import textnow.s.c;
import textnow.s.h;
import textnow.s.i;
import textnow.t.b;

@b(a="GET")
public class TNDownloadCommand extends c
{
  private URI a;

  public TNDownloadCommand(Context paramContext, String paramString)
  {
    super(paramContext);
    this.a = URI.create(paramString);
  }

  public final i a()
  {
    setRequest(new h());
    run();
    return getResponse();
  }

  protected URI buildURI()
  {
    return this.a;
  }

  protected int getConnectionTimeOut()
  {
    return 0;
  }

  protected String getContentType()
  {
    return "application/octet-stream";
  }

  protected int getSocketTimeOut()
  {
    return 0;
  }

  protected String getUserAgent()
  {
    return TNHttpCommand.buildUserAgent(this.mContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.common.TNDownloadCommand
 * JD-Core Version:    0.6.2
 */