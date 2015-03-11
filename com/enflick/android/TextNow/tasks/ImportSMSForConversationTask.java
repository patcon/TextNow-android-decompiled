package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.enflick.android.TextNow.persistence.contentproviders.g;
import java.util.ArrayList;
import textnow.v.b;
import textnow.z.i;
import textnow.z.u;

public class ImportSMSForConversationTask extends c
{
  private static final String[] d = { "_id", "address", "body", "date", "type" };
  private static final Uri e = Uri.parse("content://sms");
  private static final Object f = new Object();
  private String g;

  public ImportSMSForConversationTask(String paramString)
  {
    this.g = paramString;
  }

  public void run()
  {
    u localu = new u(this.a);
    i locali = new i(this.a, this.g);
    long l1 = locali.a();
    String[] arrayOfString = new String[3];
    arrayOfString[0] = String.valueOf(l1);
    arrayOfString[1] = ("+1" + this.g);
    arrayOfString[2] = this.g;
    Cursor localCursor = this.a.getContentResolver().query(e, d, "date <= ? and (address = ? or address = ?)", arrayOfString, "date DESC limit 30");
    if (localCursor == null)
      return;
    while (true)
    {
      long l2;
      long l3;
      try
      {
        boolean bool1 = localCursor.moveToFirst();
        l2 = l1;
        if (bool1)
          synchronized (f)
          {
            ArrayList localArrayList = new ArrayList();
            int i = 0;
            if ((i < 30) && (bool1))
            {
              l3 = localCursor.getLong(3);
              String str1 = localCursor.getString(2);
              String str2 = localCursor.getString(1);
              String str3 = b.b(str2);
              if (str3 != null)
              {
                str4 = str3;
                if (TextUtils.isEmpty(str4))
                  break label537;
                int j = localCursor.getInt(4);
                int k = 1;
                if (j == 2)
                  k = 2;
                ContentValues localContentValues = new ContentValues();
                localContentValues.put("message_id", Integer.valueOf(localCursor.getInt(0)));
                localContentValues.put("contact_value", this.g);
                localContentValues.put("contact_type", Integer.valueOf(2));
                localContentValues.put("contact_name", b.f(str4));
                localContentValues.put("message_direction", Integer.valueOf(k));
                localContentValues.put("message_type", Integer.valueOf(1));
                localContentValues.put("message_source", Integer.valueOf(1));
                if (str1 == null)
                  str1 = "";
                localContentValues.put("message_text", str1);
                localContentValues.put("read", Boolean.valueOf(true));
                localContentValues.put("date", Long.valueOf(l3));
                localArrayList.add(localContentValues);
                break label537;
                boolean bool2 = localCursor.moveToNext();
                i++;
                l2 = l3;
                bool1 = bool2;
                continue;
              }
              String str4 = b.a(str2, true);
              continue;
            }
            new StringBuilder().append("Bulk inserting ").append(localArrayList.size()).append(" messages into database").toString();
            this.a.getContentResolver().bulkInsert(g.d, (ContentValues[])localArrayList.toArray(new ContentValues[0]));
            localu.B();
          }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
      }
      if (localCursor != null)
        localCursor.close();
      locali.a(l2);
      locali.B();
      return;
      label537: 
      while (l3 >= l2)
      {
        l3 = l2;
        break;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.ImportSMSForConversationTask
 * JD-Core Version:    0.6.2
 */