package com.enflick.android.TextNow.activities;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ah;
import textnow.u.f;

public final class g
  implements ah<Cursor>
{
  public g(e parame)
  {
  }

  public final android.support.v4.content.j<Cursor> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return f.a(this.a.e);
  }

  public final void onLoaderReset(android.support.v4.content.j<Cursor> paramj)
  {
    e.c(this.a).b(null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.g
 * JD-Core Version:    0.6.2
 */