package textnow.bd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

final class w extends SQLiteOpenHelper
{
  private final String[] a = { "url", "sizeondisk", "width", "height", "lastaccess" };
  private final String b = "img_cache";
  private final String c = "CREATE TABLE IF NOT EXISTS img_cache (" + this.a[0] + " VARCHAR PRIMARY KEY, " + this.a[1] + " INTEGER, " + this.a[2] + " INTEGER, " + this.a[3] + " INTEGER, " + this.a[4] + " INTEGER);";
  private final ScheduledThreadPoolExecutor d = new ScheduledThreadPoolExecutor(1);
  private x e;
  private r f = new r();

  public w(Context paramContext, x paramx)
  {
    super(paramContext, "imageCacheDatabase", null, 2);
    this.e = paramx;
    List localList = a();
    Collections.sort(localList, new Comparator()
    {
    });
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      ac localac = (ac)localIterator.next();
      this.f.a(localac.d(), localac);
    }
  }

  private List<ac> a()
  {
    Cursor localCursor = getReadableDatabase().query("img_cache", null, null, null, null, null, null);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
      localArrayList.add(new ac(localCursor.getString(0), localCursor.getLong(1), localCursor.getInt(2), localCursor.getInt(3), localCursor.getLong(4)));
    localCursor.close();
    return localArrayList;
  }

  private boolean d(String paramString)
  {
    String[] arrayOfString = { paramString };
    return 1 == getWritableDatabase().delete("img_cache", this.a[0] + " = ?", arrayOfString);
  }

  public final ac a(String paramString)
  {
    return this.f.a(paramString);
  }

  public final void a(long paramLong)
  {
    while (true)
    {
      String str = this.f.a(paramLong);
      if (str == null)
        break;
      d(str);
      this.e.a(str);
    }
  }

  public final void a(String paramString, long paramLong, int paramInt1, int paramInt2)
  {
    if (ad.a(paramString))
      throw new IllegalArgumentException("Cannot add a null URL to the database.");
    long l = System.currentTimeMillis();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put(this.a[0], paramString);
    localContentValues.put(this.a[1], Long.valueOf(paramLong));
    localContentValues.put(this.a[2], Integer.valueOf(paramInt1));
    localContentValues.put(this.a[3], Integer.valueOf(paramInt2));
    localContentValues.put(this.a[4], Long.valueOf(l));
    this.f.a(paramString, new ac(paramString, paramLong, paramInt1, paramInt2, l));
    getWritableDatabase().insertWithOnConflict("img_cache", null, localContentValues, 5);
  }

  public final boolean b(String paramString)
  {
    return this.f.b(paramString);
  }

  public final void c(String paramString)
  {
    this.f.c(paramString);
    d(paramString);
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL(this.c);
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE img_cache");
    paramSQLiteDatabase.execSQL(this.c);
    this.f = new r();
    this.e.a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.w
 * JD-Core Version:    0.6.2
 */