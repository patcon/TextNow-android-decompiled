package com.enflick.android.TextNow.persistence.contentproviders;

import android.content.ContentValues;
import android.content.Context;

public abstract class a
{
  protected TNContentProvider a;
  protected Context b;
  protected textnow.v.a c;

  public a(TNContentProvider paramTNContentProvider, Context paramContext, textnow.v.a parama)
  {
    this.a = paramTNContentProvider;
    this.b = paramContext;
    this.c = parama;
  }

  protected static boolean a(ContentValues paramContentValues)
  {
    if (paramContentValues.containsKey("not_notify"))
    {
      paramContentValues.remove("not_notify");
      return false;
    }
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.persistence.contentproviders.a
 * JD-Core Version:    0.6.2
 */