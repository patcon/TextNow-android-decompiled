package com.vessel.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class b
{
  private static b.a a;
  private static b b;
  private SQLiteDatabase c;
  private b.a d;
  private Context e;
  private String[] f = { "abtest", "active " };
  private String[] g = { " _id ", "event" };

  private b(Context paramContext)
  {
    this.e = paramContext;
    this.d = b.a.a(paramContext);
  }

  public static b a(Context paramContext)
  {
    try
    {
      if (b == null)
        b = new b(paramContext);
      b localb = b;
      return localb;
    }
    finally
    {
    }
  }

  private void a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    try
    {
      paramSQLiteDatabase.beginTransaction();
      Cursor localCursor = paramSQLiteDatabase.query(paramString, new String[] { " _id " }, null, null, null, null, null);
      if (localCursor.getCount() > 100)
      {
        localCursor.moveToFirst();
        int i = localCursor.getCount();
        SQLiteStatement localSQLiteStatement = paramSQLiteDatabase.compileStatement("DELETE from " + paramString + " where  _id = ?");
        while ((i > 100) && (!localCursor.isAfterLast()))
        {
          localSQLiteStatement.bindLong(1, localCursor.getLong(0));
          localSQLiteStatement.execute();
          localCursor.moveToNext();
          i--;
        }
      }
      localCursor.close();
      paramSQLiteDatabase.setTransactionSuccessful();
    }
    catch (Exception localException)
    {
    }
    finally
    {
      if (paramSQLiteDatabase.inTransaction())
        paramSQLiteDatabase.endTransaction();
    }
  }

  private void d()
  {
    try
    {
      if ((this.d != null) && ((this.c == null) || (!this.c.isOpen())))
        this.c = this.d.getWritableDatabase();
      return;
    }
    finally
    {
    }
  }

  private void e()
  {
    try
    {
      if (this.d != null)
        this.d.close();
      if ((this.c != null) && (this.c.isOpen()))
      {
        this.c.close();
        this.c = null;
      }
      return;
    }
    finally
    {
    }
  }

  public final HashMap<String, f> a()
  {
    HashMap localHashMap = new HashMap();
    d();
    Cursor localCursor;
    if (this.c != null)
    {
      localCursor = this.c.query("vessel_abtest_db", this.f, null, null, null, null, null);
      if (localCursor.getCount() > 0)
        localCursor.moveToFirst();
    }
    while (true)
    {
      String str;
      boolean bool;
      if (!localCursor.isAfterLast())
      {
        str = localCursor.getString(0);
        if (localCursor.getInt(1) == 1)
          bool = true;
      }
      try
      {
        while (true)
        {
          f localf = new f(new JSONObject(str));
          localf.a(bool);
          localHashMap.put(localf.a, localf);
          label123: localCursor.moveToNext();
          break;
          bool = false;
        }
        localCursor.close();
        e();
        return localHashMap;
      }
      catch (Exception localException)
      {
        break label123;
      }
    }
  }

  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return;
    try
    {
      d();
      if (this.c != null)
      {
        String[] arrayOfString = { paramString };
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("active ", Integer.valueOf(1));
        this.c.update("vessel_abtest_db", localContentValues, " name  =?", arrayOfString);
        new StringBuilder().append(paramString).append(" is now activated.").toString();
      }
      e();
      return;
    }
    finally
    {
    }
  }

  // ERROR //
  public final void a(List<String> paramList)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +160 -> 161
    //   4: aload_1
    //   5: invokeinterface 207 1 0
    //   10: ifne +4 -> 14
    //   13: return
    //   14: aload_0
    //   15: invokespecial 144	com/vessel/a/b:d	()V
    //   18: aload_0
    //   19: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   22: ldc 209
    //   24: invokevirtual 95	android/database/sqlite/SQLiteDatabase:compileStatement	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    //   27: astore_3
    //   28: aload_0
    //   29: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   32: invokevirtual 60	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   35: aload_1
    //   36: invokeinterface 213 1 0
    //   41: astore 6
    //   43: aload 6
    //   45: invokeinterface 218 1 0
    //   50: ifeq +62 -> 112
    //   53: aload_3
    //   54: iconst_1
    //   55: aload 6
    //   57: invokeinterface 222 1 0
    //   62: checkcast 23	java/lang/String
    //   65: invokevirtual 226	android/database/sqlite/SQLiteStatement:bindString	(ILjava/lang/String;)V
    //   68: aload_3
    //   69: invokevirtual 230	android/database/sqlite/SQLiteStatement:executeInsert	()J
    //   72: pop2
    //   73: goto -30 -> 43
    //   76: astore 5
    //   78: aload_0
    //   79: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   82: invokevirtual 123	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   85: ifeq +10 -> 95
    //   88: aload_0
    //   89: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   92: invokevirtual 126	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   95: aload_0
    //   96: aload_0
    //   97: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   100: ldc 232
    //   102: invokespecial 234	com/vessel/a/b:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    //   105: aload_0
    //   106: invokespecial 174	com/vessel/a/b:e	()V
    //   109: return
    //   110: astore_2
    //   111: return
    //   112: aload_0
    //   113: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   116: invokevirtual 120	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   119: aload_0
    //   120: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   123: invokevirtual 123	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   126: ifeq -31 -> 95
    //   129: aload_0
    //   130: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   133: invokevirtual 126	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   136: goto -41 -> 95
    //   139: astore 4
    //   141: aload_0
    //   142: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   145: invokevirtual 123	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   148: ifeq +10 -> 158
    //   151: aload_0
    //   152: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   155: invokevirtual 126	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   158: aload 4
    //   160: athrow
    //   161: return
    //
    // Exception table:
    //   from	to	target	type
    //   28	43	76	java/lang/Exception
    //   43	73	76	java/lang/Exception
    //   112	119	76	java/lang/Exception
    //   4	13	110	java/lang/Exception
    //   14	28	110	java/lang/Exception
    //   78	95	110	java/lang/Exception
    //   95	109	110	java/lang/Exception
    //   119	136	110	java/lang/Exception
    //   141	158	110	java/lang/Exception
    //   158	161	110	java/lang/Exception
    //   28	43	139	finally
    //   43	73	139	finally
    //   112	119	139	finally
  }

  // ERROR //
  public final void a(org.json.JSONArray paramJSONArray)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +17 -> 20
    //   6: aload_1
    //   7: invokevirtual 240	org/json/JSONArray:length	()I
    //   10: ifeq +10 -> 20
    //   13: aload_0
    //   14: getfield 37	com/vessel/a/b:e	Landroid/content/Context;
    //   17: ifnonnull +6 -> 23
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: aload_0
    //   24: invokespecial 144	com/vessel/a/b:d	()V
    //   27: new 76	java/lang/StringBuilder
    //   30: dup
    //   31: ldc 242
    //   33: invokespecial 81	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   36: ldc 244
    //   38: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: ldc 246
    //   43: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: astore 5
    //   51: aload_0
    //   52: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   55: aload 5
    //   57: invokevirtual 95	android/database/sqlite/SQLiteDatabase:compileStatement	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
    //   60: astore 6
    //   62: aload_0
    //   63: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   66: invokevirtual 60	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   69: iconst_0
    //   70: istore 7
    //   72: aload_1
    //   73: invokevirtual 240	org/json/JSONArray:length	()I
    //   76: istore 8
    //   78: iload 7
    //   80: iload 8
    //   82: if_icmpge +115 -> 197
    //   85: aload_1
    //   86: iload 7
    //   88: invokevirtual 250	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   91: astore 10
    //   93: aload 10
    //   95: ldc 252
    //   97: invokevirtual 256	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   100: astore 11
    //   102: aload 11
    //   104: ifnull +18 -> 122
    //   107: aload 11
    //   109: aload_0
    //   110: getfield 37	com/vessel/a/b:e	Landroid/content/Context;
    //   113: invokestatic 261	com/vessel/a/d:a	(Lorg/json/JSONObject;Landroid/content/Context;)Z
    //   116: ifne +6 -> 122
    //   119: goto +156 -> 275
    //   122: aload 10
    //   124: ldc_w 263
    //   127: ldc_w 265
    //   130: invokevirtual 269	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   133: astore 12
    //   135: aload 10
    //   137: invokevirtual 270	org/json/JSONObject:toString	()Ljava/lang/String;
    //   140: astore 13
    //   142: aload 10
    //   144: ldc_w 272
    //   147: invokevirtual 276	org/json/JSONObject:optLong	(Ljava/lang/String;)J
    //   150: lstore 14
    //   152: aload 6
    //   154: iconst_1
    //   155: lload 14
    //   157: invokevirtual 108	android/database/sqlite/SQLiteStatement:bindLong	(IJ)V
    //   160: aload 6
    //   162: iconst_2
    //   163: aload 12
    //   165: invokevirtual 226	android/database/sqlite/SQLiteStatement:bindString	(ILjava/lang/String;)V
    //   168: aload 6
    //   170: iconst_3
    //   171: aload 13
    //   173: invokevirtual 226	android/database/sqlite/SQLiteStatement:bindString	(ILjava/lang/String;)V
    //   176: aload 6
    //   178: iconst_4
    //   179: lload 14
    //   181: invokevirtual 108	android/database/sqlite/SQLiteStatement:bindLong	(IJ)V
    //   184: aload 6
    //   186: invokevirtual 111	android/database/sqlite/SQLiteStatement:execute	()V
    //   189: goto +86 -> 275
    //   192: astore 9
    //   194: goto +81 -> 275
    //   197: aload_0
    //   198: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   201: invokevirtual 120	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   204: aload_0
    //   205: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   208: invokevirtual 123	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   211: ifeq +10 -> 221
    //   214: aload_0
    //   215: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   218: invokevirtual 126	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   221: aload_0
    //   222: invokespecial 174	com/vessel/a/b:e	()V
    //   225: aload_0
    //   226: monitorexit
    //   227: return
    //   228: astore_2
    //   229: aload_0
    //   230: monitorexit
    //   231: aload_2
    //   232: athrow
    //   233: astore 4
    //   235: aload_0
    //   236: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   239: invokevirtual 123	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   242: ifeq -21 -> 221
    //   245: aload_0
    //   246: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   249: invokevirtual 126	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   252: goto -31 -> 221
    //   255: astore_3
    //   256: aload_0
    //   257: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   260: invokevirtual 123	android/database/sqlite/SQLiteDatabase:inTransaction	()Z
    //   263: ifeq +10 -> 273
    //   266: aload_0
    //   267: getfield 129	com/vessel/a/b:c	Landroid/database/sqlite/SQLiteDatabase;
    //   270: invokevirtual 126	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   273: aload_3
    //   274: athrow
    //   275: iinc 7 1
    //   278: goto -206 -> 72
    //
    // Exception table:
    //   from	to	target	type
    //   85	102	192	java/lang/Exception
    //   107	119	192	java/lang/Exception
    //   122	189	192	java/lang/Exception
    //   6	20	228	finally
    //   20	22	228	finally
    //   23	27	228	finally
    //   204	221	228	finally
    //   221	227	228	finally
    //   235	252	228	finally
    //   256	273	228	finally
    //   273	275	228	finally
    //   27	69	233	java/lang/Exception
    //   72	78	233	java/lang/Exception
    //   197	204	233	java/lang/Exception
    //   27	69	255	finally
    //   72	78	255	finally
    //   85	102	255	finally
    //   107	119	255	finally
    //   122	189	255	finally
    //   197	204	255	finally
  }

  public final void a(String[] paramArrayOfString)
  {
    try
    {
      d();
      SQLiteStatement localSQLiteStatement = this.c.compileStatement("delete from vessel_events where _id =?");
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        localSQLiteStatement.bindString(1, paramArrayOfString[j]);
        localSQLiteStatement.execute();
      }
      e();
      return;
    }
    finally
    {
    }
  }

  public final a b()
  {
    Object localObject1 = null;
    try
    {
      d();
      if (this.c == null)
        e();
      while (true)
      {
        return localObject1;
        StringBuilder localStringBuilder = new StringBuilder();
        Cursor localCursor = this.c.query("vessel_events", this.g, null, null, null, null, null);
        localCursor.moveToFirst();
        ArrayList localArrayList = new ArrayList();
        for (int i = 1; !localCursor.isAfterLast(); i = 0)
        {
          if (i == 0)
            localStringBuilder.append('\n');
          localStringBuilder.append(localCursor.getString(1));
          localArrayList.add(localCursor.getString(0));
          localCursor.moveToNext();
        }
        localCursor.close();
        e();
        a locala = new a(localStringBuilder.toString(), (String[])localArrayList.toArray(new String[localArrayList.size()]));
        localObject1 = locala;
      }
    }
    finally
    {
    }
  }

  public final void b(String paramString)
  {
    try
    {
      if (TextUtils.isEmpty(paramString))
        return;
      d();
      if (this.c != null)
      {
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("event", paramString);
        this.c.insert("vessel_events", null, localContentValues);
        a(this.c, "vessel_events");
      }
      e();
      return;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.a.b
 * JD-Core Version:    0.6.2
 */