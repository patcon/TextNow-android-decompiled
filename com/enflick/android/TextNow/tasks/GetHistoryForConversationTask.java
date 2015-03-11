package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.enflick.android.TextNow.api.responsemodel.Message;
import com.enflick.android.TextNow.api.responsemodel.Messages;
import com.enflick.android.TextNow.api.users.MessagesGet;
import com.enflick.android.TextNow.api.users.n;
import com.enflick.android.TextNow.persistence.contentproviders.g;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import textnow.aa.a;
import textnow.v.b;
import textnow.v.k;
import textnow.z.u;

public class GetHistoryForConversationTask extends c
{
  private String d;
  private int e;

  public GetHistoryForConversationTask(String paramString, int paramInt)
  {
    this.d = paramString;
    this.e = paramInt;
  }

  public void run()
  {
    textnow.z.i locali = new textnow.z.i(this.a, this.d);
    n localn = new n(new u(this.a).b());
    long l1 = locali.b();
    localn.a = l1;
    localn.b = "past";
    localn.d = this.d;
    localn.f = 1;
    localn.g = 1;
    localn.c = 10;
    textnow.x.i locali1 = new MessagesGet(this.a).runSync(localn);
    if (a(locali1))
      return;
    Messages localMessages = (Messages)locali1.c();
    if (localMessages == null)
    {
      new StringBuilder().append("Error fetching msgs for conversation with :").append(this.d).append(", null returned").toString();
      return;
    }
    Message[] arrayOfMessage = localMessages.messages;
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    String[] arrayOfString = { "message_id" };
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    long l2 = l1;
    Message localMessage;
    ContentValues localContentValues;
    if (i < arrayOfMessage.length)
    {
      localMessage = arrayOfMessage[i];
      localContentValues = new ContentValues();
      if (localMessage.id >= l2)
        break label730;
    }
    label730: for (long l3 = localMessage.id; ; l3 = l2)
    {
      String str1 = localMessage.contactName;
      if (localMessage.contactType == 5)
        str1 = k.b(g().getContentResolver(), str1);
      String str2 = localMessage.message;
      localContentValues.put("message_id", Long.valueOf(localMessage.id));
      localContentValues.put("contact_value", this.d);
      localContentValues.put("contact_type", Integer.valueOf(this.e));
      localContentValues.put("contact_name", str1);
      localContentValues.put("message_direction", Integer.valueOf(localMessage.messageDirection));
      localContentValues.put("message_type", Integer.valueOf(localMessage.messageType));
      localContentValues.put("message_text", str2.trim());
      localContentValues.put("read", Boolean.valueOf(localMessage.read));
      localContentValues.put("date", Long.valueOf(b.d(localMessage.date).getTime()));
      localContentValues.put("message_source", Integer.valueOf(0));
      if ((localMessage.messageDirection == 2) && (localMessage.messageType == 2))
      {
        localHashMap.put(Long.valueOf(localMessage.id), localContentValues);
        if (localStringBuilder.length() == 0)
          localStringBuilder.append(localMessage.id);
      }
      while (true)
      {
        i++;
        l2 = l3;
        break;
        localStringBuilder.append("," + localMessage.id);
        continue;
        localArrayList.add(localContentValues);
      }
      if (!localHashMap.isEmpty())
      {
        Cursor localCursor = this.a.getContentResolver().query(g.d, arrayOfString, "message_id IN " + "(" + localStringBuilder.toString() + ")", null, null);
        if (localCursor != null)
        {
          while (localCursor.moveToNext())
            localHashMap.remove(Long.valueOf(localCursor.getLong(0)));
          localCursor.close();
        }
      }
      if (!localHashMap.isEmpty())
        localArrayList.addAll(localHashMap.values());
      new StringBuilder().append("Bulk inserting ").append(arrayOfMessage.length).append(" messages into database").toString();
      this.a.getContentResolver().bulkInsert(g.d, (ContentValues[])localArrayList.toArray(new ContentValues[0]));
      locali.b(l2);
      locali.B();
      a.a(this.a).e();
      a.a(this.a).d();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetHistoryForConversationTask
 * JD-Core Version:    0.6.2
 */