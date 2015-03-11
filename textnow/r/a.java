package textnow.r;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import textnow.u.d;
import textnow.u.r;

public final class a extends AsyncTask<Void, Void, Boolean>
{
  private Context a;
  private r b;
  private d c;
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
    this.b = new r(paramContext);
    this.e = this.a.getResources().getString(2131493545);
    this.f = this.a.getResources().getString(2131493546);
    this.g = this.a.getResources().getString(2131493547);
    this.h = this.a.getResources().getString(2131493548);
    this.i = this.a.getResources().getString(2131493549);
    this.j = this.a.getResources().getString(2131493550);
    this.k = this.a.getResources().getString(2131493551);
    this.l = this.a.getResources().getString(2131493552);
    this.m = this.a.getResources().getString(2131493553);
    this.n = this.a.getResources().getString(2131493556);
  }

  public final void a(d paramd)
  {
    this.c = paramd;
    execute(new Void[0]);
  }

  protected final void onPreExecute()
  {
    this.d.w();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.r.a
 * JD-Core Version:    0.6.2
 */