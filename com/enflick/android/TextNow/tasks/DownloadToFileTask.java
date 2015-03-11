package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.enflick.android.TextNow.api.common.TNDownloadCommand;
import java.io.File;
import java.io.InputStream;
import textnow.v.g;
import textnow.v.h;

public class DownloadToFileTask extends c
{
  private String d;
  private String e;
  private String f;
  private h g;

  public DownloadToFileTask(String paramString1, String paramString2, h paramh)
  {
    this.d = paramString1;
    this.e = paramString2;
    this.g = paramh;
  }

  public final String a()
  {
    return this.d;
  }

  public final String b()
  {
    return this.f;
  }

  public final h c()
  {
    return this.g;
  }

  public final String d()
  {
    return this.e;
  }

  public void run()
  {
    do
    {
      textnow.v.i locali1;
      do
      {
        textnow.x.i locali;
        try
        {
          TNDownloadCommand localTNDownloadCommand = new TNDownloadCommand(this.a, this.e);
          locali = localTNDownloadCommand.a();
          if (a(locali))
            return;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          a(true);
          return;
        }
        InputStream localInputStream = (InputStream)locali.b();
        locali1 = g.a(this.a, this.g, localInputStream);
      }
      while (locali1 == null);
      this.f = locali1.a().getAbsolutePath();
    }
    while ((this.f == null) || (this.d == null));
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("attach", this.f);
    this.a.getContentResolver().update(Uri.parse(this.d), localContentValues, null, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.DownloadToFileTask
 * JD-Core Version:    0.6.2
 */