package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.enflick.android.TextNow.api.users.ConversationsPatch;
import com.enflick.android.TextNow.api.users.f;
import com.enflick.android.TextNow.persistence.contentproviders.g;
import textnow.aa.a;
import textnow.x.i;
import textnow.z.u;

public class MarkMessagesReadTask extends c
{
  private String d;

  public MarkMessagesReadTask(String paramString)
  {
    this.d = paramString;
  }

  public void run()
  {
    u localu = new u(this.a);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("read", Integer.valueOf(1));
    localContentValues.put("not_notify", Integer.valueOf(1));
    Uri localUri = g.d;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.d;
    Cursor localCursor = this.a.getContentResolver().query(localUri, new String[] { "count(*) AS count" }, "contact_value = ? AND read = 0", arrayOfString, null);
    i locali;
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      if (localCursor.getInt(0) <= 0)
        break label230;
      this.a.getContentResolver().update(localUri, localContentValues, "contact_value = ? AND read = 0", arrayOfString);
      f localf = new f(localu.b(), this.d);
      locali = new ConversationsPatch(this.a).runSync(localf);
      if (!a(locali));
    }
    else
    {
      return;
    }
    int i = Integer.valueOf((String)locali.c()).intValue();
    new StringBuilder().append(i).append(" msgs were marked read on the server").toString();
    a.a(this.a).e();
    a.a(this.a).d();
    label230: localCursor.close();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.MarkMessagesReadTask
 * JD-Core Version:    0.6.2
 */