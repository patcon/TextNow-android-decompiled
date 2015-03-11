package textnow.w;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import textnow.z.f;
import textnow.z.u;

public final class a extends AsyncTask<Void, Void, Boolean>
{
  private Context a;
  private u b;
  private f c;
  private b d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private String n;

  public a(Context paramContext, b paramb)
  {
    this.a = paramContext;
    this.d = paramb;
    this.b = new u(paramContext);
    this.e = this.a.getResources().getString(2131296913);
    this.f = this.a.getResources().getString(2131296914);
    this.g = this.a.getResources().getString(2131296916);
    this.h = this.a.getResources().getString(2131296917);
    this.i = this.a.getResources().getString(2131296918);
    this.j = this.a.getResources().getString(2131296919);
    this.k = this.a.getResources().getString(2131296920);
    this.l = this.a.getResources().getString(2131296921);
    this.m = this.a.getResources().getString(2131296922);
    this.n = this.a.getResources().getString(2131296925);
  }

  public final void a(f paramf)
  {
    this.c = paramf;
    execute(new Void[0]);
  }

  protected final void onPreExecute()
  {
    this.d.x();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.w.a
 * JD-Core Version:    0.6.2
 */