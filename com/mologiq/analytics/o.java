package com.mologiq.analytics;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class o extends SQLiteOpenHelper
{
  private static final int a = Integer.parseInt("1.3.6".replaceAll("\\.", ""));
  private static o c;
  private SQLiteDatabase b;

  private o(Context paramContext)
  {
    super(paramContext, "mologiq", null, a);
  }

  private k a(int paramInt)
  {
    h();
    SQLiteDatabase localSQLiteDatabase = this.b;
    String[] arrayOfString1 = { "id", "name", "classification_id" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(paramInt);
    Cursor localCursor = localSQLiteDatabase.query("applist", arrayOfString1, "id=?", arrayOfString2, null, null, null, null);
    if (localCursor != null);
    try
    {
      if ((localCursor.moveToFirst()) && (localCursor.getCount() > 0))
      {
        k localk = new k();
        localk.b(Integer.parseInt(localCursor.getString(0)));
        localk.a(localCursor.getString(1));
        localk.a(Integer.parseInt(localCursor.getString(2)));
        return localk;
      }
      return null;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      a();
    }
  }

  public static o a(Context paramContext)
  {
    try
    {
      if (c == null)
        c = new o(paramContext);
      o localo = c;
      return localo;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        ak.a(ak.a(localThrowable));
    }
    finally
    {
    }
  }

  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("DELETE FROM installapplist");
  }

  private int b(k paramk)
  {
    try
    {
      h();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("id", Integer.valueOf(paramk.c()));
      localContentValues.put("name", paramk.b());
      localContentValues.put("classification_id", Integer.valueOf(paramk.a()));
      SQLiteDatabase localSQLiteDatabase = this.b;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramk.c());
      int i = localSQLiteDatabase.update("applist", localContentValues, "id = ?", arrayOfString);
      return i;
    }
    finally
    {
      a();
    }
  }

  private r b(int paramInt)
  {
    h();
    SQLiteDatabase localSQLiteDatabase = this.b;
    String[] arrayOfString1 = { "id", "apps", "mean" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(paramInt);
    Cursor localCursor = localSQLiteDatabase.query("meanlist", arrayOfString1, "id=?", arrayOfString2, null, null, null, null);
    if (localCursor != null);
    try
    {
      if ((localCursor.moveToFirst()) && (localCursor.getCount() > 0))
      {
        q localq = q.a();
        localq.getClass();
        r localr = new r(localq);
        localr.a(localCursor.getInt(0));
        String[] arrayOfString3 = localCursor.getString(1).split(",");
        ArrayList localArrayList = new ArrayList();
        for (int i = 1; i < -1 + arrayOfString3.length; i++)
          localArrayList.add(Integer.valueOf(Integer.parseInt(arrayOfString3[i])));
        localr.a(localArrayList);
        localr.b(localCursor.getInt(2));
        return localr;
      }
      return null;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      a();
    }
  }

  private void h()
  {
    try
    {
      if ((this.b == null) || (!this.b.isOpen()))
        this.b = c.getWritableDatabase();
      return;
    }
    finally
    {
    }
  }

  private s i()
  {
    q localq1 = q.a();
    localq1.getClass();
    s locals1 = new s(localq1);
    h();
    Cursor localCursor = this.b.query("meanlist", null, null, null, null, null, null);
    ArrayList localArrayList1 = new ArrayList();
    if (localCursor != null);
    try
    {
      if ((localCursor.moveToFirst()) && (localCursor.getCount() > 0))
      {
        do
        {
          q localq2 = q.a();
          localq2.getClass();
          r localr = new r(localq2);
          localr.a(localCursor.getInt(0));
          String[] arrayOfString = localCursor.getString(1).split(",");
          ArrayList localArrayList2 = new ArrayList();
          for (int i = 1; i < -1 + arrayOfString.length; i++)
            localArrayList2.add(Integer.valueOf(Integer.parseInt(arrayOfString[i])));
          localr.a(localArrayList2);
          localr.b(localCursor.getInt(2));
          localArrayList1.add(localr);
        }
        while (localCursor.moveToNext());
        locals1.a(localArrayList1);
        s locals2 = e();
        locals1.a(locals2.a());
        locals1.a(locals2.b());
      }
      return locals1;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      a();
    }
  }

  public final void a()
  {
  }

  final void a(int paramInt, SQLiteDatabase paramSQLiteDatabase)
  {
    s locals;
    Cursor localCursor;
    if ((paramInt <= d()) && (paramInt > 0))
    {
      locals = i();
      if (locals != null)
        localCursor = paramSQLiteDatabase.rawQuery("Select * from applist, installapplist Where applist.name = installapplist.packagename", null);
    }
    label145: label694: label705: label708: label713: 
    while (true)
    {
      Object localObject2;
      k localk;
      Object localObject4;
      try
      {
        boolean bool = localCursor.moveToFirst();
        localObject2 = null;
        if (!bool)
          break label694;
        localk = new k();
        localk.b(localCursor.getInt(localCursor.getColumnIndex("id")));
        localk.a(localCursor.getInt(localCursor.getColumnIndex("classification_id")));
        localk.a(localCursor.getString(localCursor.getColumnIndex("name")));
        if (localk.a() <= 0)
          break label356;
        int i1 = 0;
        Iterator localIterator3 = locals.c().iterator();
        localObject4 = localObject2;
        if (!localIterator3.hasNext())
          break label708;
        r localr2 = (r)localIterator3.next();
        int i2 = localr2.a();
        if (localk.a() == i2)
        {
          Iterator localIterator4 = localr2.c().iterator();
          if (localIterator4.hasNext())
          {
            if (((Integer)localIterator4.next()).intValue() != localk.c())
              continue;
            i1 = 1;
          }
        }
        if (i1 == 0)
          break label705;
        if (localObject4 == null)
          localObject4 = new HashMap();
        if (((Map)localObject4).containsKey(Integer.valueOf(localk.a())))
        {
          int i3 = 1 + ((Integer)((Map)localObject4).get(Integer.valueOf(localk.a()))).intValue();
          ((Map)localObject4).put(Integer.valueOf(localk.a()), Integer.valueOf(i3));
          continue;
        }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
      ((Map)localObject4).put(Integer.valueOf(localk.a()), Integer.valueOf(1));
      while (true)
      {
        label356: if (localCursor.moveToNext())
          break label713;
        for (Object localObject3 = localObject2; ; localObject3 = null)
        {
          if ((locals != null) && (localObject3 != null))
          {
            HashMap localHashMap = new HashMap();
            Iterator localIterator1 = locals.c().iterator();
            while (localIterator1.hasNext())
            {
              r localr1 = (r)localIterator1.next();
              int j = localr1.a();
              if (localObject3.containsKey(Integer.valueOf(j)))
              {
                int k = ((Integer)localObject3.get(Integer.valueOf(localr1.a()))).intValue();
                int m = localr1.b();
                int n = k - m;
                ak.a(" Classification Id:= " + j + "count:=" + k + " mean:= " + m + " valueFromMean:= " + n);
                localHashMap.put(Integer.valueOf(j), Integer.valueOf(n));
              }
            }
            Map localMap = ak.a(localHashMap, ak.b);
            paramSQLiteDatabase.execSQL("DELETE FROM audience");
            Iterator localIterator2 = localMap.entrySet().iterator();
            while (localIterator2.hasNext())
            {
              int i = ((Integer)((Map.Entry)localIterator2.next()).getKey()).intValue();
              ak.a(" Audience Id:= " + i);
              ContentValues localContentValues = new ContentValues();
              localContentValues.put("id", Integer.valueOf(i));
              paramSQLiteDatabase.insert("audience", null, localContentValues);
            }
          }
          if (localCursor != null)
            localCursor.close();
          return;
        }
        locals = null;
        break;
        break label145;
        localObject2 = localObject4;
      }
    }
  }

  final void a(final Context paramContext, final int paramInt)
  {
    final SQLiteDatabase localSQLiteDatabase = c.getWritableDatabase();
    localSQLiteDatabase.acquireReference();
    new Thread(new Runnable()
    {
      public final void run()
      {
        try
        {
          List localList = paramContext.getPackageManager().getInstalledApplications(128);
          o.a(localSQLiteDatabase);
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            ApplicationInfo localApplicationInfo = (ApplicationInfo)localIterator.next();
            if (localSQLiteDatabase != null)
            {
              ContentValues localContentValues = new ContentValues();
              localContentValues.put("packagename", localApplicationInfo.packageName);
              localSQLiteDatabase.insert("installapplist", null, localContentValues);
            }
          }
        }
        catch (Throwable localThrowable)
        {
          ak.a("===== Background Thread " + ak.a(localThrowable));
          return;
          o.this.a(paramInt, localSQLiteDatabase);
          return;
        }
        finally
        {
          if (localSQLiteDatabase != null)
            localSQLiteDatabase.close();
        }
      }
    }).start();
  }

  final void a(k paramk)
  {
    if (a(paramk.c()) == null)
    {
      h();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("id", Integer.valueOf(paramk.c()));
      localContentValues.put("name", paramk.b());
      localContentValues.put("classification_id", Integer.valueOf(paramk.a()));
      this.b.insert("applist", null, localContentValues);
      a();
      return;
    }
    b(paramk);
  }

  final void a(r paramr)
  {
    if (b(paramr.a()) == null)
    {
      h();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("id", Integer.valueOf(paramr.a()));
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < paramr.c().size(); i++)
      {
        localStringBuilder.append(paramr.c().get(i));
        if (i != -1 + paramr.c().size())
          localStringBuilder.append(",");
      }
      localContentValues.put("apps", localStringBuilder.toString());
      localContentValues.put("mean", Integer.valueOf(paramr.b()));
      this.b.insert("meanlist", null, localContentValues);
      a();
    }
  }

  final void a(s params)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("version", params.a());
    localContentValues.put("appcount", Integer.valueOf(params.b()));
    s locals = e();
    if (locals == null)
    {
      h();
      this.b.insert("meanInfo", null, localContentValues);
      a();
    }
    while (locals.a().equalsIgnoreCase(params.a()))
      return;
    h();
    this.b.execSQL("DELETE FROM meanlist");
    this.b.update("meanInfo", localContentValues, null, null);
    a();
  }

  public final int b()
  {
    h();
    Cursor localCursor = this.b.rawQuery("SELECT  * FROM applist WHERE id = (SELECT MAX(id) FROM applist)", null);
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = Integer.parseInt(localCursor.getString(0));
        return i;
      }
      return 0;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      a();
    }
  }

  public final int c()
  {
    h();
    Cursor localCursor = this.b.rawQuery("SELECT  * FROM applist", null);
    int j;
    if (localCursor == null)
      j = 0;
    while (true)
    {
      if (localCursor != null)
        localCursor.close();
      a();
      return j;
      try
      {
        int i = localCursor.getCount();
        j = i;
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
        a();
      }
    }
  }

  public final int d()
  {
    h();
    Cursor localCursor = this.b.query("meanlist", null, null, null, null, null, null);
    int j;
    if (localCursor == null)
      j = 0;
    while (true)
    {
      if (localCursor != null)
        localCursor.close();
      a();
      return j;
      try
      {
        int i = localCursor.getCount();
        j = i;
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
        a();
      }
    }
  }

  public final s e()
  {
    h();
    Cursor localCursor = this.b.query("meanInfo", null, null, null, null, null, null);
    if (localCursor != null);
    try
    {
      if ((localCursor.moveToFirst()) && (localCursor.getCount() > 0))
      {
        q localq = q.a();
        localq.getClass();
        s locals = new s(localq);
        locals.a(localCursor.getString(localCursor.getColumnIndex("version")));
        locals.a(localCursor.getInt(localCursor.getColumnIndex("appcount")));
        return locals;
      }
      return null;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      a();
    }
  }

  final List<Integer> f()
  {
    ArrayList localArrayList = new ArrayList();
    h();
    Cursor localCursor = this.b.rawQuery("Select * from applist, installapplist Where applist.name = installapplist.packagename", null);
    try
    {
      if (localCursor.moveToFirst())
      {
        boolean bool;
        do
        {
          int i = localCursor.getInt(localCursor.getColumnIndex("id"));
          ak.a(" Install App Id:= " + i);
          localArrayList.add(Integer.valueOf(i));
          bool = localCursor.moveToNext();
        }
        while (bool);
      }
      return localArrayList;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      a();
    }
  }

  final List<Integer> g()
  {
    h();
    Cursor localCursor = this.b.query("audience", null, null, null, null, null, null);
    ArrayList localArrayList = new ArrayList();
    try
    {
      if (localCursor.moveToFirst())
        do
          localArrayList.add(Integer.valueOf(localCursor.getInt(localCursor.getColumnIndex("id"))));
        while (localCursor.moveToNext());
      this.b.execSQL("DELETE FROM audience");
      return localArrayList;
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      a();
    }
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE applist(id INTEGER PRIMARY KEY,name TEXT,classification_id INTEGER)");
    paramSQLiteDatabase.execSQL("CREATE TABLE meanlist(id INTEGER PRIMARY KEY,apps TEXT,mean INTEGER)");
    paramSQLiteDatabase.execSQL("CREATE TABLE meanInfo(version TEXT, appcount INTEGER)");
    paramSQLiteDatabase.execSQL("CREATE TABLE installapplist(packagename TEXT )");
    paramSQLiteDatabase.execSQL("CREATE TABLE audience(id INTEGER )");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS applist");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS meanlist");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS meanInfo");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS installapplist");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS audience");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.o
 * JD-Core Version:    0.6.2
 */