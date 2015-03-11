package com.google.android.gms.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ec$a extends SQLiteOpenHelper
{
  public ec$a(ec paramec, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 4);
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(ec.cs());
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    gs.U("Database updated from version " + paramInt1 + " to version " + paramInt2);
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS InAppPurchase");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ec.a
 * JD-Core Version:    0.6.2
 */