package textnow.bo;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import textnow.bn.d;

public final class c extends AsyncTask<Void, Void, d>
{
  private Context a;
  private String b;
  private Handler c;

  public c(Context paramContext, String paramString, Handler paramHandler)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = paramHandler;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bo.c
 * JD-Core Version:    0.6.2
 */