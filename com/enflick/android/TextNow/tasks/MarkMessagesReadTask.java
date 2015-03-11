package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.enflick.android.TextNow.api.users.ConversationsPatch;
import textnow.q.o;
import textnow.s.i;
import textnow.u.r;

public class MarkMessagesReadTask extends c
{
  private String d;

  public MarkMessagesReadTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    r localr = new r(this.a);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("read", Integer.valueOf(1));
    Uri localUri = com.enflick.android.TextNow.persistence.contentproviders.f.d;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.d;
    Cursor localCursor = this.a.getContentResolver().query(localUri, new String[] { "count(*) AS count" }, "contact_value = ? AND read = 0", arrayOfString, null);
    i locali;
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      if (localCursor.getInt(0) <= 0)
        break label210;
      this.a.getContentResolver().update(localUri, localContentValues, "contact_value = ? AND read = 0", arrayOfString);
      com.enflick.android.TextNow.api.users.f localf = new com.enflick.android.TextNow.api.users.f(localr.b(), this.d);
      locali = new ConversationsPatch(this.a).runSync(localf);
      if (!a(locali));
    }
    else
    {
      return;
    }
    int i = Integer.valueOf((String)locali.c()).intValue();
    new StringBuilder().append(i).append(" msgs were marked read on the server").toString();
    o.a(this.a).d();
    label210: localCursor.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.MarkMessagesReadTask
 * JD-Core Version:    0.6.2
 */