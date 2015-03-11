package textnow.bd;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;

final class c extends b
{
  c(q paramq)
  {
    super(paramq);
  }

  protected final void a(String paramString)
  {
    q localq = a();
    if (localq.l() != null)
      localq.l();
    if (URLUtil.isValidUrl(paramString))
    {
      a().getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
      return;
    }
    localq.a("Attempting to open invalid url: ", paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bd.c
 * JD-Core Version:    0.6.2
 */