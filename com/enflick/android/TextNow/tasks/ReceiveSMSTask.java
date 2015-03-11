package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.enflick.android.TextNow.activities.phone.t;
import com.enflick.android.TextNow.broadcast.sms.SmsBroadcast;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import textnow.q.b;
import textnow.q.k;
import textnow.q.o;
import textnow.u.r;

public class ReceiveSMSTask extends c
{
  private static final Object d = new Object();
  private SmsBroadcast[] e;

  public ReceiveSMSTask(SmsBroadcast[] paramArrayOfSmsBroadcast)
  {
    this.e = paramArrayOfSmsBroadcast;
  }

  private Set<String> a()
  {
    HashSet localHashSet = new HashSet();
    try
    {
      String[] arrayOfString = { "view_conversations.contact_value" };
      Uri localUri = com.enflick.android.TextNow.persistence.contentproviders.c.d;
      Cursor localCursor = this.a.getContentResolver().query(localUri, arrayOfString, null, null, null);
      if (localCursor != null)
      {
        try
        {
          if (localCursor.moveToNext())
            localHashSet.add(localCursor.getString(0));
        }
        finally
        {
          localCursor.close();
        }
        return localHashSet;
      }
    }
    catch (SQLiteException localSQLiteException)
    {
    }
    return localHashSet;
  }

  protected final boolean d_()
  {
    return true;
  }

  public void run()
  {
    Set localSet = a();
    r localr = new r(this.a);
    while (true)
    {
      int i;
      String str1;
      synchronized (d)
      {
        ArrayList localArrayList = new ArrayList();
        i = 0;
        SmsBroadcast localSmsBroadcast;
        if (i < this.e.length)
        {
          localSmsBroadcast = this.e[i];
          if (localSmsBroadcast != null)
          {
            ContentValues localContentValues = new ContentValues();
            localContentValues.put("message_id", Long.valueOf(UUID.randomUUID().getMostSignificantBits()));
            str1 = t.a(this.a, localSet, localSmsBroadcast.getSender());
            if (str1 != null)
              break label410;
            str2 = localSmsBroadcast.getSender();
            localContentValues.put("contact_value", str2);
            localContentValues.put("contact_type", Integer.valueOf(2));
            localContentValues.put("contact_name", b.f(localSmsBroadcast.getSender()));
            localContentValues.put("message_direction", Integer.valueOf(1));
            localContentValues.put("message_type", Integer.valueOf(1));
            localContentValues.put("message_source", Integer.valueOf(1));
            String str3;
            if (localSmsBroadcast.getContents() == null)
            {
              str3 = "";
              localContentValues.put("message_text", str3);
              localContentValues.put("read", Boolean.valueOf(false));
              localContentValues.put("date", Long.valueOf(new Date().getTime()));
              localArrayList.add(localContentValues);
              if (str1 == null)
              {
                Uri localUri = textnow.u.f.a(this.a.getContentResolver(), 2, localSmsBroadcast.getSender(), b.f(localSmsBroadcast.getSender()));
                k.a(this.a.getContentResolver(), localUri, localSmsBroadcast.getSender(), 2);
                localSet.add(localSmsBroadcast.getSender());
              }
            }
            else
            {
              str3 = localSmsBroadcast.getContents().trim();
              continue;
            }
          }
        }
        else
        {
          new StringBuilder().append("Bulk inserting ").append(localArrayList.size()).append(" messages into database").toString();
          this.a.getContentResolver().bulkInsert(com.enflick.android.TextNow.persistence.contentproviders.f.d, (ContentValues[])localArrayList.toArray(new ContentValues[0]));
          localr.n();
          localr.d(true);
          localr.n();
          o.a(this.a).d();
          return;
        }
      }
      i++;
      continue;
      label410: String str2 = str1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.ReceiveSMSTask
 * JD-Core Version:    0.6.2
 */