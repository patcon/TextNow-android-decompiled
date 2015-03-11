package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.api.responsemodel.Message;
import com.enflick.android.TextNow.api.responsemodel.Messages;
import com.enflick.android.TextNow.api.responsemodel.Messages.Status;
import com.enflick.android.TextNow.api.users.MessagesGet;
import com.enflick.android.TextNow.api.users.n;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import textnow.aa.a;
import textnow.v.k;
import textnow.z.f;
import textnow.z.h;
import textnow.z.m;
import textnow.z.p;
import textnow.z.u;

public class GetNewMessagesTask extends c
{
  private static final Object d = new Object();
  private boolean e = false;
  private boolean f = false;

  public GetNewMessagesTask()
  {
    this(false, false);
  }

  public GetNewMessagesTask(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }

  protected final boolean e_()
  {
    return true;
  }

  public void run()
  {
    Set localSet = h.b(this.a);
    u localu = new u(this.a);
    String str1 = localu.b();
    MessagesGet localMessagesGet = new MessagesGet(this.a);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int i = 2;
    int j = -1;
    int k = -1;
    String[] arrayOfString = { "message_id" };
    HashSet localHashSet = new HashSet();
    long l1;
    long l2;
    label106: Messages localMessages;
    synchronized (d)
    {
      l1 = localu.k();
      int m = localu.j();
      if (l1 != 0L)
        break label1576;
      l2 = 1L;
      n localn = new n(str1);
      localn.b = "future";
      localn.f = 1;
      localn.c = 30;
      localn.a = l2;
      localn.e = m;
      textnow.x.i locali = localMessagesGet.runSync(localn);
      if (a(locali))
        return;
      localMessages = (Messages)locali.c();
      if (localMessages == null)
        return;
    }
    Message[] arrayOfMessage = localMessages.messages;
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap = new HashMap();
    StringBuilder localStringBuilder = new StringBuilder();
    int n = 0;
    long l3 = l2;
    while (true)
    {
      int i1 = arrayOfMessage.length;
      Message localMessage;
      int i3;
      int i4;
      Object localObject6;
      Object localObject7;
      Object localObject8;
      ContentValues localContentValues;
      textnow.z.g localg;
      int i2;
      label373: String str2;
      label385: String str3;
      label412: String str4;
      String str5;
      if (n < i1)
      {
        localMessage = arrayOfMessage[n];
        if (!m.a(localMessage.messageType))
        {
          new StringBuilder().append("Do not understand message type ").append(localMessage.messageType).toString();
          i3 = k;
          i4 = i;
          localObject6 = localObject3;
          localObject7 = localObject2;
          localObject8 = localObject1;
          break label1606;
        }
        localContentValues = new ContentValues();
        localContentValues.put("message_id", Long.valueOf(localMessage.id));
        localg = f.a(this.a, localSet, localMessage.contactValue, localMessage.contactType);
        if (localg != null)
        {
          i2 = localg.b;
          if (localg == null)
            break label842;
          str2 = localg.a;
          str3 = localMessage.contactName;
          if (i2 != 5)
            break label852;
          str3 = k.b(g().getContentResolver(), str3);
          str4 = localMessage.message;
          if ((i2 == 5) && ((localg == null) || (localMessage.messageType == 0)))
            localHashSet.add(str2);
          localContentValues.put("contact_value", str2);
          localContentValues.put("contact_type", Integer.valueOf(i2));
          localContentValues.put("contact_name", str3);
          localContentValues.put("message_direction", Integer.valueOf(localMessage.messageDirection));
          localContentValues.put("message_type", Integer.valueOf(localMessage.messageType));
          localContentValues.put("message_source", Integer.valueOf(0));
          if (str4 != null)
            break label878;
          str5 = "";
          label526: localContentValues.put("message_text", str5);
          localContentValues.put("read", Boolean.valueOf(localMessage.read));
          localContentValues.put("date", Long.valueOf(textnow.v.b.d(localMessage.date).getTime()));
          if ((localMessage.messageDirection != 2) || (localMessage.messageType != 2))
            break label921;
          localHashMap.put(Long.valueOf(localMessage.id), localContentValues);
          if (localStringBuilder.length() != 0)
            break label888;
          localStringBuilder.append(localMessage.id);
          label624: if (localMessage.messageDirection == 1)
          {
            if (localMessage.messageType != 2)
              break label932;
            com.enflick.android.TextNow.ads.b.a("receive_message", "message_type", "image");
          }
          label653: if (l3 >= localMessage.id)
            break label1583;
          l3 = localMessage.id;
          int i5 = localMessage.messageDirection;
          j = localMessage.messageType;
          localObject7 = localMessage.contactName;
          localObject8 = str5;
          i3 = i5;
          String str6 = str2;
          i4 = i2;
          localObject6 = str6;
        }
      }
      while (true)
      {
        if (localg != null)
          break label1606;
        try
        {
          Uri localUri = h.a(this.a.getContentResolver(), localMessage.contactType, localMessage.contactValue, localMessage.contactName);
          textnow.z.i locali1 = new textnow.z.i(this.a, localMessage.contactValue);
          locali1.b(localMessage.id);
          locali1.B();
          k.a(this.a.getContentResolver(), localUri, localMessage.contactValue, localMessage.contactType);
          localSet.add(localMessage.contactValue);
        }
        catch (Exception localException1)
        {
          a(true);
          a("DB_ERROR");
          return;
        }
        i2 = localMessage.contactType;
        break label373;
        label842: str2 = localMessage.contactValue;
        break label385;
        label852: if (localMessage.contactType != 2)
          break label412;
        str3 = k.a(g().getContentResolver(), str2);
        break label412;
        label878: str5 = str4.trim();
        break label526;
        label888: localStringBuilder.append("," + localMessage.id);
        break label624;
        label921: localArrayList.add(localContentValues);
        break label624;
        label932: if (localMessage.messageType == 10)
        {
          com.enflick.android.TextNow.ads.b.a("receive_message", "message_type", "location");
          break label653;
        }
        if (localMessage.messageType != 1)
          break label653;
        com.enflick.android.TextNow.ads.b.a("receive_message", "message_type", "text");
        break label653;
        if (!localHashMap.isEmpty())
        {
          Cursor localCursor = this.a.getContentResolver().query(com.enflick.android.TextNow.persistence.contentproviders.g.d, arrayOfString, "message_id IN " + "(" + localStringBuilder.toString() + ")", null, null);
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
        new StringBuilder().append("Bulk inserting ").append(localArrayList.size()).append(" messages into database").toString();
        while (true)
        {
          Object localObject10;
          Object localObject9;
          try
          {
            this.a.getContentResolver().bulkInsert(com.enflick.android.TextNow.persistence.contentproviders.g.d, (ContentValues[])localArrayList.toArray(new ContentValues[0]));
            int i6 = arrayOfMessage.length;
            Messages.Status localStatus = localMessages.status;
            if (localStatus != null)
              localu.a(localStatus.latest_announcement_id);
            localu.a(l3);
            localu.B();
            String str7 = localMessages.status.settingsVersion;
            if (i6 == 30)
              break;
            if (localHashSet.size() == 1)
            {
              new GetGroupTask((String)localHashSet.iterator().next()).c(this.a);
              localu.d(true);
              localu.B();
              if (str7 != null)
              {
                p localp = new p(this.a);
                if (!localp.r().equals(str7))
                {
                  GetSettingsTask localGetSettingsTask = new GetSettingsTask();
                  localGetSettingsTask.c(this.a);
                  if (localGetSettingsTask.a())
                  {
                    localp.b(str7);
                    localp.B();
                  }
                }
              }
              if ((this.e) || (this.f))
              {
                if (localObject1 == null)
                  break label1519;
                if (k == 1)
                {
                  if (j != 8)
                    break label1569;
                  if (!TextUtils.isEmpty((CharSequence)localObject2))
                    break label1512;
                  localObject10 = localObject3;
                  localObject9 = String.format(this.a.getResources().getString(2131296576), new Object[] { localObject10 });
                  a.a(this.a).a((String)localObject3, (String)localObject2, i, (String)localObject9, j, 0, l3);
                }
                localu.c(15000L);
                localu.B();
              }
              a.a(this.a).e();
              a.a(this.a).d();
              return;
            }
          }
          catch (Exception localException2)
          {
            a(true);
            a("DB_ERROR");
            return;
          }
          label1569: if (localHashSet.size() > 1)
          {
            new GetGroupsTask().c(this.a);
            continue;
            label1512: localObject10 = localObject2;
            continue;
            label1519: if (!this.f)
            {
              long l4 = localu.L();
              if (TextNowApp.c());
              for (long l5 = 120000L; ; l5 = 900000L)
              {
                localu.c(Math.min(l4 * 2L, l5));
                break;
              }
              localObject9 = localObject1;
            }
          }
        }
        label1576: l2 = l1;
        break label106;
        label1583: i3 = k;
        i4 = i;
        localObject6 = localObject3;
        localObject7 = localObject2;
        localObject8 = localObject1;
      }
      label1606: n++;
      i = i4;
      localObject3 = localObject6;
      localObject2 = localObject7;
      localObject1 = localObject8;
      k = i3;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetNewMessagesTask
 * JD-Core Version:    0.6.2
 */