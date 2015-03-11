package com.enflick.android.TextNow.persistence.contentproviders;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public abstract interface b
{
  public abstract int a(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString, int paramInt);

  public abstract int a(Uri paramUri, String paramString, String[] paramArrayOfString, int paramInt);

  public abstract Cursor a(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, int paramInt);

  public abstract Uri a(Uri paramUri, ContentValues paramContentValues, int paramInt);

  public abstract String a(int paramInt);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.persistence.contentproviders.b
 * JD-Core Version:    0.6.2
 */