package com.enflick.android.TextNow.persistence.contentproviders;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;

public final class f extends a
  implements b
{
  public static final Uri d = Uri.parse("content://com.enflick.android.TextNow.TNContentProvider/groups");

  public f(TNContentProvider paramTNContentProvider, Context paramContext, textnow.ab.a parama)
  {
    super(paramTNContentProvider, paramContext, parama);
  }

  public static void a(UriMatcher paramUriMatcher)
  {
    paramUriMatcher.addURI("com.enflick.android.TextNow.TNContentProvider", "groups", 106);
    paramUriMatcher.addURI("com.enflick.android.TextNow.TNContentProvider", "groups/#", 107);
  }

  public final int a(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = this.c.getWritableDatabase();
    boolean bool = a(paramContentValues);
    StringBuilder localStringBuilder;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown URI");
    case 107:
      String str = paramUri.getLastPathSegment();
      localStringBuilder = new StringBuilder("_id=" + str);
      if (!TextUtils.isEmpty(paramString))
        localStringBuilder.append(" AND " + paramString);
      break;
    case 106:
    }
    for (int i = localSQLiteDatabase.update("groups", paramContentValues, localStringBuilder.toString(), paramArrayOfString); ; i = localSQLiteDatabase.update("groups", paramContentValues, paramString, paramArrayOfString))
    {
      if (bool)
        this.b.getContentResolver().notifyChange(paramUri, null);
      return i;
    }
  }

  public final int a(Uri paramUri, String paramString, String[] paramArrayOfString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = this.c.getWritableDatabase();
    int i;
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown or Invalid URI " + paramUri);
    case 106:
      i = localSQLiteDatabase.delete("groups", paramString, paramArrayOfString);
    case 107:
    }
    while (true)
    {
      this.b.getContentResolver().notifyChange(paramUri, null);
      return i;
      String str = paramUri.getLastPathSegment();
      if (TextUtils.isEmpty(paramString))
        i = localSQLiteDatabase.delete("groups", "_id=" + str, null);
      else
        i = localSQLiteDatabase.delete("groups", paramString + " and " + "_id" + "=" + str, paramArrayOfString);
    }
  }

  public final Cursor a(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = this.c.getWritableDatabase();
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("groups");
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown URI");
    case 107:
      localSQLiteQueryBuilder.appendWhere("_id=" + paramUri.getLastPathSegment());
    case 106:
    }
    Cursor localCursor = localSQLiteQueryBuilder.query(localSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, null, null, paramString2);
    localCursor.setNotificationUri(this.b.getContentResolver(), paramUri);
    return localCursor;
  }

  public final Uri a(Uri paramUri, ContentValues paramContentValues, int paramInt)
  {
    if (paramInt != 106)
      throw new IllegalArgumentException("Invalid URI for insert");
    boolean bool = a(paramContentValues);
    long l = this.c.getWritableDatabase().insertWithOnConflict("groups", null, paramContentValues, 5);
    if (l > 0L)
    {
      Uri localUri = ContentUris.withAppendedId(paramUri, l);
      if (bool)
        this.b.getContentResolver().notifyChange(paramUri, null);
      return localUri;
    }
    throw new SQLException("Failed to insert row into " + paramUri);
  }

  public final String a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 106:
      return "vnd.android.cursor.dir/com.enflick.android.TextNow-message";
    case 107:
    }
    return "vnd.android.cursor.item/com.enflick.android.TextNow-message";
  }

  public final void a()
  {
    TNContentProvider.a(106, this);
    TNContentProvider.a(107, this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.persistence.contentproviders.f
 * JD-Core Version:    0.6.2
 */