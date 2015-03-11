package textnow.r;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.content.j;
import textnow.p.l;

public final class b
  implements aa<Cursor>
{
  private Context a;
  private l b;

  public b(Context paramContext, l paraml)
  {
    this.a = paramContext;
    this.b = paraml;
  }

  public final j<Cursor> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return new a(this.a);
  }

  public final void onLoaderReset(j<Cursor> paramj)
  {
    this.b.b(null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.r.b
 * JD-Core Version:    0.6.2
 */