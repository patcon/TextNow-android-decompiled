package com.enflick.android.TextNow.api.users;

import com.enflick.android.TextNow.api.common.c;
import java.io.File;
import textnow.t.a;
import textnow.t.e;

public final class ae extends c
{

  @e
  public String a;

  @a(a="voicemail_type")
  public int b;
  public File c;

  public ae(String paramString, int paramInt)
  {
    this(paramString, paramInt, null);
  }

  public ae(String paramString, int paramInt, File paramFile)
  {
    this.a = paramString;
    this.b = paramInt;
    this.c = paramFile;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.users.ae
 * JD-Core Version:    0.6.2
 */