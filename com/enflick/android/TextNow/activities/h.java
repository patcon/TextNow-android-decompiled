package com.enflick.android.TextNow.activities;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.aa;
import android.support.v4.content.j;
import textnow.p.o;

public final class h
  implements aa<Cursor>
{
  public h(f paramf)
  {
  }

  public final j<Cursor> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return textnow.z.h.a(this.a.d);
  }

  public final void onLoaderReset(j<Cursor> paramj)
  {
    f.c(this.a).b(null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.h
 * JD-Core Version:    0.6.2
 */