package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.SmsManager;
import android.text.TextUtils;
import java.util.ArrayList;
import textnow.q.a;
import textnow.q.b;
import textnow.u.f;
import textnow.u.k;
import textnow.u.r;

public class SendSMSTask extends c
{
  private String d;
  private String e;
  private String f;

  public SendSMSTask(String paramString1, String paramString2, String paramString3)
  {
    this.d = paramString2;
    this.e = paramString1;
    this.f = paramString3;
  }

  public void run()
  {
    r localr = new r(this.a);
    if ((!b.k(this.a)) && (!localr.Q()) && (!"911".equals(this.e)));
    int i;
    do
    {
      SmsManager localSmsManager;
      ArrayList localArrayList;
      do
      {
        do
          return;
        while ((TextUtils.isEmpty(this.e)) || (TextUtils.isEmpty(this.f)));
        localSmsManager = SmsManager.getDefault();
        localArrayList = localSmsManager.divideMessage(this.f);
        if ((localArrayList != null) && (localArrayList.size() > 0))
          break;
      }
      while (!a.a);
      new StringBuilder().append("Null or empty messages array generated for message body: '").append(this.f).toString();
      return;
      if (localArrayList.size() == 1)
        localSmsManager.sendTextMessage(this.e, null, this.f, null, null);
      while (true)
      {
        k.a(this.a, 2, this.e, this.d, 1, 2, true, this.f, "", 1);
        String[] arrayOfString1 = { "count (*)" };
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = this.e;
        Uri localUri = com.enflick.android.TextNow.persistence.contentproviders.c.d;
        Cursor localCursor = this.a.getContentResolver().query(localUri, arrayOfString1, "view_conversations.contact_value = ?", arrayOfString2, null);
        i = 0;
        if (localCursor != null);
        try
        {
          boolean bool = localCursor.moveToFirst();
          i = 0;
          if (bool)
          {
            int j = localCursor.getInt(0);
            i = j;
          }
          localCursor.close();
          if (i == 0)
          {
            new StringBuilder().append("New conversation with: ").append(this.e).toString();
            f.a(this.a.getContentResolver(), 2, this.e, this.d, null);
            return;
            localSmsManager.sendMultipartTextMessage(this.e, null, localArrayList, null, null);
          }
        }
        finally
        {
          localCursor.close();
        }
      }
    }
    while (i <= 1);
    new StringBuilder().append("Too many conversations matched contactValue:").append(this.e).toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SendSMSTask
 * JD-Core Version:    0.6.2
 */