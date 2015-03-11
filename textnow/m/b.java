package textnow.m;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ah;
import android.support.v4.content.j;
import textnow.k.g;

public final class b
  implements ah<Cursor>
{
  private Context a;
  private g b;

  public b(Context paramContext, g paramg)
  {
    this.a = paramContext;
    this.b = paramg;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.m.b
 * JD-Core Version:    0.6.2
 */