package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.ads.a;
import com.enflick.android.TextNow.api.responsemodel.Message;
import com.enflick.android.TextNow.api.responsemodel.Messages;
import com.enflick.android.TextNow.api.responsemodel.Messages.Status;
import com.enflick.android.TextNow.api.users.MessagesGet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import textnow.q.b;
import textnow.q.o;
import textnow.s.i;
import textnow.u.d;
import textnow.u.e;
import textnow.u.g;
import textnow.u.r;

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

  protected final boolean d_()
  {
    return true;
  }

  public void run()
  {
    Set localSet = textnow.u.f.b(this.a);
    r localr = new r(this.a);
    String str1 = localr.b();
    MessagesGet localMessagesGet = new MessagesGet(this.a);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int i = 2;
    int j = -1;
    int k = -1;
    String[] arrayOfString = { "message_id" };
    long l1;
    long l2;
    label97: Messages localMessages;
    synchronized (d)
    {
      l1 = localr.k();
      int m = localr.j();
      if (l1 != 0L)
        break label1494;
      l2 = 1L;
      com.enflick.android.TextNow.api.users.n localn = new com.enflick.android.TextNow.api.users.n(str1);
      localn.b = "future";
      localn.f = 1;
      localn.c = 30;
      localn.a = l2;
      localn.e = m;
      i locali = localMessagesGet.runSync(localn);
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
      int i2;
      Object localObject6;
      Object localObject7;
      Object localObject8;
      ContentValues localContentValues;
      e locale;
      label368: String str2;
      label380: String str3;
      label407: String str4;
      String str5;
      if (n < i1)
      {
        localMessage = arrayOfMessage[n];
        if (!textnow.u.k.a(localMessage.messageType))
        {
          new StringBuilder().append("Do not understand message type ").append(localMessage.messageType).toString();
          i3 = k;
          i4 = j;
          i2 = i;
          localObject6 = localObject3;
          localObject7 = localObject2;
          localObject8 = localObject1;
          break label1528;
        }
        localContentValues = new ContentValues();
        localContentValues.put("message_id", Long.valueOf(localMessage.id));
        locale = d.a(this.a, localSet, localMessage.contactValue, localMessage.contactType);
        if (locale != null)
        {
          i2 = locale.b;
          if (locale == null)
            break label832;
          str2 = locale.a;
          str3 = localMessage.contactName;
          if (i2 != 5)
            break label842;
          str3 = textnow.q.k.b(g().getContentResolver(), str3);
          str4 = localMessage.message;
          if (i2 == 5)
            new GetGroupTask(localMessage.contactValue).b(g());
          localContentValues.put("contact_value", str2);
          localContentValues.put("contact_type", Integer.valueOf(i2));
          localContentValues.put("contact_name", str3);
          localContentValues.put("message_direction", Integer.valueOf(localMessage.messageDirection));
          localContentValues.put("message_type", Integer.valueOf(localMessage.messageType));
          localContentValues.put("message_source", Integer.valueOf(0));
          if (str4 != null)
            break label868;
          str5 = "";
          label520: localContentValues.put("message_text", str5);
          localContentValues.put("read", Boolean.valueOf(localMessage.read));
          localContentValues.put("date", Long.valueOf(b.d(localMessage.date).getTime()));
          if ((localMessage.messageDirection != 2) || (localMessage.messageType != 2))
            break label911;
          localHashMap.put(Long.valueOf(localMessage.id), localContentValues);
          if (localStringBuilder.length() != 0)
            break label878;
          localStringBuilder.append(localMessage.id);
          label618: if (localMessage.messageDirection == 1)
          {
            if (localMessage.messageType != 2)
              break label922;
            a.a("receive_message", "message_type", "image");
          }
          label647: if (l3 >= localMessage.id)
            break label1501;
          l3 = localMessage.id;
          int i5 = localMessage.messageDirection;
          int i6 = localMessage.messageType;
          localObject7 = localMessage.contactName;
          localObject6 = str2;
          i4 = i6;
          localObject8 = str5;
          i3 = i5;
        }
      }
      while (true)
      {
        if (locale != null)
          break label1528;
        try
        {
          Uri localUri = textnow.u.f.a(this.a.getContentResolver(), localMessage.contactType, localMessage.contactValue, localMessage.contactName);
          g localg = new g(this.a, localMessage.contactValue);
          localg.b(localMessage.id);
          localg.n();
          textnow.q.k.a(this.a.getContentResolver(), localUri, localMessage.contactValue, localMessage.contactType);
          localSet.add(localMessage.contactValue);
        }
        catch (Exception localException1)
        {
          a(true);
          a("DB_ERROR");
          return;
        }
        i2 = localMessage.contactType;
        break label368;
        label832: str2 = localMessage.contactValue;
        break label380;
        label842: if (localMessage.contactType != 2)
          break label407;
        str3 = textnow.q.k.a(g().getContentResolver(), str2);
        break label407;
        label868: str5 = str4.trim();
        break label520;
        label878: localStringBuilder.append("," + localMessage.id);
        break label618;
        label911: localArrayList.add(localContentValues);
        break label618;
        label922: if (localMessage.messageType == 10)
        {
          a.a("receive_message", "message_type", "location");
          break label647;
        }
        if (localMessage.messageType != 1)
          break label647;
        a.a("receive_message", "message_type", "text");
        break label647;
        if (!localHashMap.isEmpty())
        {
          Cursor localCursor = this.a.getContentResolver().query(com.enflick.android.TextNow.persistence.contentproviders.f.d, arrayOfString, "message_id IN " + "(" + localStringBuilder.toString() + ")", null, null);
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
          Object localObject9;
          try
          {
            this.a.getContentResolver().bulkInsert(com.enflick.android.TextNow.persistence.contentproviders.f.d, (ContentValues[])localArrayList.toArray(new ContentValues[0]));
            int i7 = arrayOfMessage.length;
            Messages.Status localStatus = localMessages.status;
            if (localStatus != null)
              localr.a(localStatus.latest_announcement_id);
            localr.a(l3);
            localr.n();
            String str6 = localMessages.status.settingsVersion;
            if (i7 == 30)
              break;
            localr.d(true);
            localr.n();
            if (str6 != null)
            {
              textnow.u.n localn1 = new textnow.u.n(this.a);
              if (!localn1.b().equals(str6))
              {
                GetSettingsTask localGetSettingsTask = new GetSettingsTask();
                localGetSettingsTask.c(this.a);
                if (localGetSettingsTask.a())
                {
                  localn1.b(str6);
                  localn1.n();
                }
              }
            }
            if ((this.e) || (this.f))
            {
              if (localObject1 == null)
                break label1437;
              if (k == 1)
              {
                if (j != 8)
                  break label1487;
                if (TextUtils.isEmpty((CharSequence)localObject2))
                {
                  localObject10 = localObject3;
                  localObject9 = String.format(this.a.getResources().getString(2131493164), new Object[] { localObject10 });
                  o.a(this.a).a((String)localObject3, (String)localObject2, i, (String)localObject9, j, 0, l3);
                }
              }
              else
              {
                localr.c(15000L);
                localr.n();
              }
            }
            else
            {
              o.a(this.a).d();
              return;
            }
          }
          catch (Exception localException2)
          {
            a(true);
            a("DB_ERROR");
            return;
          }
          Object localObject10 = localObject2;
          continue;
          label1437: if (!this.f)
          {
            long l4 = localr.J();
            if (TextNowApp.c());
            for (long l5 = 120000L; ; l5 = 900000L)
            {
              localr.c(Math.min(l4 * 2L, l5));
              break;
            }
            label1487: localObject9 = localObject1;
          }
        }
        label1494: l2 = l1;
        break label97;
        label1501: i3 = k;
        i4 = j;
        i2 = i;
        localObject6 = localObject3;
        localObject7 = localObject2;
        localObject8 = localObject1;
      }
      label1528: n++;
      i = i2;
      localObject3 = localObject6;
      localObject2 = localObject7;
      localObject1 = localObject8;
      k = i3;
      j = i4;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.GetNewMessagesTask
 * JD-Core Version:    0.6.2
 */