package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import org.json.JSONObject;

@ez
public class aj
  implements ah
{
  private final gv md;

  public aj(Context paramContext, gt paramgt)
  {
    this.md = gv.a(paramContext, new ay(), false, false, null, paramgt);
  }

  private void runOnUiThread(Runnable paramRunnable)
  {
    if (gr.ds())
    {
      paramRunnable.run();
      return;
    }
    gr.wC.post(paramRunnable);
  }

  public void a(final ah.a parama)
  {
    this.md.du().a(new gw.a()
    {
      public void a(gv paramAnonymousgv)
      {
        parama.aM();
      }
    });
  }

  public void a(t paramt, dn paramdn, bw parambw, dq paramdq, boolean paramBoolean, bz parambz)
  {
    this.md.du().a(paramt, paramdn, parambw, paramdq, paramBoolean, parambz, new v(false));
  }

  public void a(String paramString, by paramby)
  {
    this.md.du().a(paramString, paramby);
  }

  public void a(final String paramString, final JSONObject paramJSONObject)
  {
    runOnUiThread(new Runnable()
    {
      public void run()
      {
        aj.a(aj.this).a(paramString, paramJSONObject);
      }
    });
  }

  public void destroy()
  {
    this.md.destroy();
  }

  public void f(final String paramString)
  {
    runOnUiThread(new Runnable()
    {
      public void run()
      {
        aj.a(aj.this).loadUrl(paramString);
      }
    });
  }

  public void g(String paramString)
  {
    this.md.du().a(paramString, null);
  }

  public void pause()
  {
    gj.a(this.md);
  }

  public void resume()
  {
    gj.b(this.md);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.aj
 * JD-Core Version:    0.6.2
 */