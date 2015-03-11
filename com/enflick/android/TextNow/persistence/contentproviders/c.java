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

public final class c extends a
  implements b
{
  public static final Uri d = Uri.parse("content://com.enflick.android.TextNow.TNContentProvider/conversations");

  public c(TNContentProvider paramTNContentProvider, Context paramContext, textnow.v.a parama)
  {
    super(paramTNContentProvider, paramContext, parama);
  }

  public static void a(UriMatcher paramUriMatcher)
  {
    paramUriMatcher.addURI("com.enflick.android.TextNow.TNContentProvider", "conversations", 104);
    paramUriMatcher.addURI("com.enflick.android.TextNow.TNContentProvider", "conversations/#", 105);
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
    case 105:
      String str = paramUri.getLastPathSegment();
      localStringBuilder = new StringBuilder("_id=" + str);
      if (!TextUtils.isEmpty(paramString))
        localStringBuilder.append(" AND " + paramString);
      break;
    case 104:
    }
    for (int i = localSQLiteDatabase.update("conversations", paramContentValues, localStringBuilder.toString(), null); ; i = localSQLiteDatabase.update("conversations", paramContentValues, paramString, paramArrayOfString))
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
    case 104:
      i = localSQLiteDatabase.delete("conversations", paramString, paramArrayOfString);
    case 105:
    }
    while (true)
    {
      this.b.getContentResolver().notifyChange(paramUri, null);
      return i;
      String str = paramUri.getLastPathSegment();
      if (TextUtils.isEmpty(paramString))
        i = localSQLiteDatabase.delete("conversations", "_id=" + str, null);
      else
        i = localSQLiteDatabase.delete("conversations", paramString + " and " + "_id" + "=" + str, paramArrayOfString);
    }
  }

  public final Cursor a(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = this.c.getWritableDatabase();
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("view_conversations");
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown URI");
    case 105:
      localSQLiteQueryBuilder.appendWhere("_id=" + paramUri.getLastPathSegment());
    case 104:
    }
    Cursor localCursor = localSQLiteQueryBuilder.query(localSQLiteDatabase, paramArrayOfString1, paramString1, paramArrayOfString2, null, null, paramString2);
    localCursor.setNotificationUri(this.b.getContentResolver(), paramUri);
    return localCursor;
  }

  public final Uri a(Uri paramUri, ContentValues paramContentValues, int paramInt)
  {
    if (paramInt != 104)
      throw new IllegalArgumentException("Invalid URI for insert");
    boolean bool = a(paramContentValues);
    long l = this.c.getWritableDatabase().insertWithOnConflict("conversations", null, paramContentValues, 5);
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
    case 104:
      return "vnd.android.cursor.dir/com.enflick.android.TextNow-message";
    case 105:
    }
    return "vnd.android.cursor.item/com.enflick.android.TextNow-message";
  }

  public final void a()
  {
    TNContentProvider.a(104, this);
    TNContentProvider.a(105, this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.persistence.contentproviders.c
 * JD-Core Version:    0.6.2
 */