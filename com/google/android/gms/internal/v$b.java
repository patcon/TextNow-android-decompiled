package com.google.android.gms.internal;

import android.net.Uri.Builder;
import android.text.TextUtils;

@ez
public class v$b
  implements v.a
{
  private final fz.a mc;
  private final gv md;

  public v$b(fz.a parama, gv paramgv)
  {
    this.mc = parama;
    this.md = paramgv;
  }

  public void e(String paramString)
  {
    gs.S("An auto-clicking creative is blocked");
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("https");
    localBuilder.path("//pagead2.googlesyndication.com/pagead/gen_204");
    localBuilder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
    if (!TextUtils.isEmpty(paramString))
      localBuilder.appendQueryParameter("navigationURL", paramString);
    if ((this.mc != null) && (this.mc.vw != null) && (!TextUtils.isEmpty(this.mc.vw.tN)))
      localBuilder.appendQueryParameter("debugDialog", this.mc.vw.tN);
    gj.c(this.md.getContext(), this.md.dx().wD, localBuilder.toString());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.v.b
 * JD-Core Version:    0.6.2
 */