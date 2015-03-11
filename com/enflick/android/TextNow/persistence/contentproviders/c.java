package com.enflick.android.TextNow.persistence.contentproviders;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

public final class c extends a
  implements b
{
  public static final Uri d = Uri.parse("content://com.enflick.android.TextNow.TNContentProvider/view_calls");

  public c(TNContentProvider paramTNContentProvider, Context paramContext, textnow.ab.a parama)
  {
    super(paramTNContentProvider, paramContext, parama);
  }

  public static void a(UriMatcher paramUriMatcher)
  {
    paramUriMatcher.addURI("com.enflick.android.TextNow.TNContentProvider", "view_calls", 112);
    paramUriMatcher.addURI("com.enflick.android.TextNow.TNContentProvider", "view_calls/#", 113);
  }

  public final int a(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString, int paramInt)
  {
    throw new UnsupportedOperationException("Tried to update Calls content provider");
  }

  public final int a(Uri paramUri, String paramString, String[] paramArrayOfString, int paramInt)
  {
    throw new UnsupportedOperationException("Tried to delete on Calls content provider");
  }

  public final Cursor a(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = this.c.getWritableDatabase();
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("view_calls");
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown URI");
    case 113:
      localSQLiteQueryBuilder.appendWhere("_id=" + paramUri.getLastPathSegment());
    case 112:
    }
    Cursor localCursor = localSQLiteQueryBuilder.query(localSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, null, null, paramString2);
    localCursor.setNotificationUri(this.b.getContentResolver(), paramUri);
    return localCursor;
  }

  public final Uri a(Uri paramUri, ContentValues paramContentValues, int paramInt)
  {
    throw new UnsupportedOperationException("Tried to insert on Calls content provider");
  }

  public final String a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 112:
      return "vnd.android.cursor.dir/com.enflick.android.TextNow-message";
    case 113:
    }
    return "vnd.android.cursor.item/com.enflick.android.TextNow-message";
  }

  public final void a()
  {
    TNContentProvider.a(112, this);
    TNContentProvider.a(113, this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.persistence.contentproviders.c
 * JD-Core Version:    0.6.2
 */