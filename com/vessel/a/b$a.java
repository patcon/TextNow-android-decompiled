package com.vessel.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class b$a extends SQLiteOpenHelper
{
  private b$a(Context paramContext)
  {
    super(paramContext, "vessel", null, 2);
  }

  public static a a(Context paramContext)
  {
    try
    {
      if (b.c() == null)
        b.a(new a(paramContext.getApplicationContext()));
      a locala = b.c();
      return locala;
    }
    finally
    {
    }
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table vessel_abtest_db (  _id  integer primary key, abtest text not null, name text not null, active integer default 0);");
    paramSQLiteDatabase.execSQL("create table vessel_events( _id INTEGER PRIMARY KEY, event TEXT NOT NULL);");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 != paramInt2)
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS vessel_abtest_db");
      onCreate(paramSQLiteDatabase);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.a.b.a
 * JD-Core Version:    0.6.2
 */