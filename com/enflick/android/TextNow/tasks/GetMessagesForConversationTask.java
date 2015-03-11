package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.enflick.android.TextNow.api.responsemodel.Message;
import com.enflick.android.TextNow.api.responsemodel.Messages;
import com.enflick.android.TextNow.api.users.MessagesGet;
import com.enflick.android.TextNow.api.users.n;
import com.enflick.android.TextNow.persistence.contentproviders.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import textnow.q.b;
import textnow.q.o;
import textnow.s.i;
import textnow.u.r;

public class GetMessagesForConversationTask extends c
{
  private String d;
  private int e;
  private long f;
  private boolean g;

  public GetMessagesForConversationTask(String paramString, int paramInt, long paramLong, boolean paramBoolean)
  {
    this.d = paramString;
    this.e = paramInt;
    this.f = paramLong;
    this.g = true;
  }

  public void run()
  {
    r localr = new r(this.a);
    n localn = new n(localr.b());
    if (this.f > 0L)
    {
      localn.a = this.f;
      localn.b = "future";
      localn.d = this.d;
    }
    i locali;
    for (localn.f = 1; ; localn.f = 1)
    {
      locali = new MessagesGet(this.a).runSync(localn);
      if (!a(locali))
        break;
      return;
      localn.a = 1L;
      localn.d = this.d;
    }
    Messages localMessages = (Messages)locali.c();
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
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int i = 2;
    int j = -1;
    int k = -1;
    long l1 = localr.k();
    if (l1 == 0L)
      l1 = 1L;
    long l2 = l1;
    int m = 0;
    int n = arrayOfMessage.length;
    Message localMessage;
    int i1;
    int i2;
    int i3;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    if (m < n)
    {
      localMessage = arrayOfMessage[m];
      if (!textnow.u.k.a(localMessage.messageType))
      {
        new StringBuilder().append("Do not understand message type ").append(localMessage.messageType).toString();
        i1 = k;
        i2 = j;
        i3 = i;
        localObject5 = localObject3;
        localObject6 = localObject2;
        localObject7 = localObject1;
      }
    }
    while (true)
    {
      int i4 = m + 1;
      i = i3;
      localObject3 = localObject5;
      localObject2 = localObject6;
      localObject1 = localObject7;
      m = i4;
      j = i2;
      k = i1;
      break;
      ContentValues localContentValues = new ContentValues();
      String str = localMessage.contactName;
      if (this.e == 5)
      {
        str = textnow.q.k.b(g().getContentResolver(), str);
        label388: localContentValues.put("message_id", Long.valueOf(localMessage.id));
        localContentValues.put("contact_value", this.d);
        localContentValues.put("contact_type", Integer.valueOf(this.e));
        localContentValues.put("contact_name", str);
        localContentValues.put("message_direction", Integer.valueOf(localMessage.messageDirection));
        localContentValues.put("message_type", Integer.valueOf(localMessage.messageType));
        localContentValues.put("message_text", localMessage.message.trim());
        localContentValues.put("read", Boolean.valueOf(localMessage.read));
        localContentValues.put("date", Long.valueOf(b.d(localMessage.date).getTime()));
        localContentValues.put("message_source", Integer.valueOf(0));
        if ((localMessage.messageDirection != 2) || (localMessage.messageType != 2))
          break label705;
        localHashMap.put(Long.valueOf(localMessage.id), localContentValues);
        if (localStringBuilder.length() != 0)
          break label673;
        localStringBuilder.append(localMessage.id);
      }
      while (true)
        if (l2 < localMessage.id)
        {
          l2 = localMessage.id;
          localObject7 = localMessage.message.trim();
          i1 = localMessage.messageDirection;
          i2 = localMessage.messageType;
          localObject6 = localMessage.contactName;
          localObject5 = this.d;
          i3 = this.e;
          break;
          if (this.e != 2)
            break label388;
          str = textnow.q.k.a(g().getContentResolver(), this.d);
          break label388;
          label673: localStringBuilder.append("," + localMessage.id);
          continue;
          label705: localArrayList.add(localContentValues);
          continue;
          if (!localHashMap.isEmpty())
          {
            Cursor localCursor = this.a.getContentResolver().query(f.d, arrayOfString, "message_id IN " + "(" + localStringBuilder.toString() + ")", null, null);
            if (localCursor != null)
              try
              {
                if (localCursor.moveToNext())
                  localHashMap.remove(Long.valueOf(localCursor.getLong(0)));
              }
              finally
              {
                localCursor.close();
              }
          }
          if (!localHashMap.isEmpty())
            localArrayList.addAll(localHashMap.values());
          if ((this.g) && (localObject1 != null) && (k == 1))
            o.a(this.a).a(localObject3, localObject2, i, localObject1, j, 0, l2);
          new StringBuilder().append("Bulk inserting ").append(arrayOfMessage.length).append(" messages into database").toString();
          this.a.getContentResolver().bulkInsert(f.d, (ContentValues[])localArrayList.toArray(new ContentValues[0]));
          o.a(this.a).d();
          return;
        }
      i1 = k;
      i2 = j;
      i3 = i;
      localObject5 = localObject3;
      localObject6 = localObject2;
      localObject7 = localObject1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetMessagesForConversationTask
 * JD-Core Version:    0.6.2
 */