package com.enflick.android.TextNow.tasks;

import android.net.Uri;
import com.enflick.android.TextNow.api.common.TNDownloadCommand;
import java.io.InputStream;
import textnow.q.g;
import textnow.q.h;
import textnow.u.r;

public class DownloadVoicemailTask extends c
{
  private String d;
  private String e;
  private String f;
  private h g;

  public DownloadVoicemailTask(String paramString1, String paramString2)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.g = h.d;
  }

  public void run()
  {
    textnow.s.i locali = new TNDownloadCommand(this.a, this.d).a();
    if (a(locali));
    do
    {
      textnow.q.i locali1;
      do
      {
        return;
        InputStream localInputStream = (InputStream)locali.b();
        locali1 = g.a(this.a, this.g, localInputStream);
      }
      while ((locali1 == null) || (locali1.b() == null));
      this.f = locali1.b().toString();
    }
    while (this.f == null);
    r localr = new r(this.a);
    localr.z(this.e);
    localr.y(this.f);
    localr.n();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.DownloadVoicemailTask
 * JD-Core Version:    0.6.2
 */