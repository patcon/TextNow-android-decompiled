package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.enflick.android.TextNow.activities.phone.t;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import textnow.q.b;
import textnow.q.k;
import textnow.u.g;
import textnow.u.r;

public class ImportSMSTask extends c
{
  private static final String[] d = { "_id", "address", "body", "date", "type" };
  private static final Uri e = Uri.parse("content://sms");
  private static final Object f = new Object();
  private int g = 250;

  public ImportSMSTask()
  {
    this(250);
  }

  private ImportSMSTask(int paramInt)
  {
  }

  private Set<String> a()
  {
    HashSet localHashSet = new HashSet();
    Cursor localCursor;
    try
    {
      String[] arrayOfString = { "view_conversations.contact_value" };
      Uri localUri = com.enflick.android.TextNow.persistence.contentproviders.c.d;
      localCursor = this.a.getContentResolver().query(localUri, arrayOfString, null, null, null);
      if (localCursor != null)
        try
        {
          localCursor.moveToFirst();
          while (!localCursor.isAfterLast())
          {
            localHashSet.add(localCursor.getString(0));
            localCursor.moveToNext();
          }
        }
        finally
        {
          localCursor.close();
        }
    }
    catch (SQLiteException localSQLiteException)
    {
      Log.getStackTraceString(localSQLiteException);
    }
    return localHashSet;
    localCursor.close();
    return localHashSet;
  }

  public void run()
  {
    Set localSet = a();
    HashMap localHashMap = new HashMap();
    r localr = new r(this.a);
    long l1 = localr.R();
    long l2;
    Cursor localCursor;
    if (l1 < 0L)
    {
      l2 = new Date().getTime();
      String[] arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(l2);
      localCursor = this.a.getContentResolver().query(e, d, "date <= ?", arrayOfString, "date DESC limit " + this.g);
      if (localCursor == null)
        return;
    }
    while (true)
    {
      long l3;
      long l4;
      int j;
      label230: String str4;
      try
      {
        boolean bool1 = localCursor.moveToFirst();
        l3 = l2;
        if (bool1)
          synchronized (f)
          {
            ArrayList localArrayList = new ArrayList();
            int i = 0;
            if ((i < 30) && (bool1))
            {
              l4 = localCursor.getLong(3);
              String str1 = localCursor.getString(2);
              String str2 = localCursor.getString(1);
              String str3 = b.b(str2);
              if (str3 != null)
              {
                if (TextUtils.isEmpty(str3))
                  break label729;
                if (localCursor.getInt(4) != 2)
                  break label716;
                j = 2;
                str4 = t.a(this.a, localSet, str3);
                ContentValues localContentValues = new ContentValues();
                localContentValues.put("message_id", Integer.valueOf(localCursor.getInt(0)));
                if (str4 != null)
                  break label740;
                str5 = str3;
                localContentValues.put("contact_value", str5);
                localContentValues.put("contact_type", Integer.valueOf(2));
                localContentValues.put("contact_name", b.f(str3));
                localContentValues.put("message_direction", Integer.valueOf(j));
                localContentValues.put("message_type", Integer.valueOf(1));
                localContentValues.put("message_source", Integer.valueOf(1));
                if (str1 == null)
                  str1 = "";
                localContentValues.put("message_text", str1);
                localContentValues.put("read", Boolean.valueOf(true));
                localContentValues.put("date", Long.valueOf(l4));
                if (str4 != null)
                  break label747;
                str6 = str3;
                localHashMap.put(str6, Long.valueOf(l4));
                localArrayList.add(localContentValues);
                if (str4 != null)
                  break label729;
                Uri localUri = textnow.u.f.a(this.a.getContentResolver(), 2, str3, b.f(str3));
                k.a(this.a.getContentResolver(), localUri, str3, 2);
                localSet.add(str3);
                break label729;
                label466: boolean bool2 = localCursor.moveToNext();
                i++;
                l3 = l4;
                bool1 = bool2;
                continue;
              }
              str3 = b.a(str2, true);
              continue;
            }
            new StringBuilder().append("Bulk inserting ").append(localArrayList.size()).append(" messages into database").toString();
            this.a.getContentResolver().bulkInsert(com.enflick.android.TextNow.persistence.contentproviders.f.d, (ContentValues[])localArrayList.toArray(new ContentValues[0]));
            localr.n();
          }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
      if (localCursor != null)
        localCursor.close();
      Iterator localIterator = localHashMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str7 = (String)localEntry.getKey();
        Long localLong = (Long)localEntry.getValue();
        g localg = new g(this.a, str7);
        localg.a(localLong.longValue());
        localg.n();
      }
      localr.d(l3);
      localr.d(true);
      localr.n();
      return;
      label716: label729: 
      do
      {
        l4 = l3;
        break label466;
        j = 1;
        break label230;
        l2 = l1;
        break;
      }
      while (l4 >= l3);
      continue;
      label740: String str5 = str4;
      continue;
      label747: String str6 = str4;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.ImportSMSTask
 * JD-Core Version:    0.6.2
 */