package com.enflick.android.TextNow.tasks;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.enflick.android.TextNow.api.users.MessagesPost;
import com.enflick.android.TextNow.api.users.o;
import com.enflick.android.TextNow.persistence.contentproviders.d;
import java.util.Date;
import java.util.HashMap;
import textnow.v.k;
import textnow.x.i;
import textnow.z.h;
import textnow.z.m;
import textnow.z.u;

public class SendMessageTask extends c
{
  private int d;
  private String e;
  private String f;
  private String g;
  private int h;
  private textnow.z.c i;
  private String j;
  private boolean k = false;

  public SendMessageTask(Context paramContext, int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, int paramInt3, boolean paramBoolean, String paramString4, textnow.z.c paramc)
  {
    this.e = paramString1.toLowerCase();
    this.f = paramString2;
    this.d = paramInt1;
    this.h = paramInt2;
    this.g = paramString4.trim();
    this.i = paramc;
    int m = this.d;
    String str1 = this.e;
    String str2 = this.f;
    int n = this.h;
    String str3 = this.g;
    String str4;
    Cursor localCursor;
    int i1;
    if (this.i != null)
    {
      str4 = this.i.a();
      this.j = m.a(paramContext, m, str1, str2, n, paramInt3, paramBoolean, str3, str4, 0).toString();
      String[] arrayOfString1 = { "count (*)" };
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.e;
      Uri localUri1 = d.d;
      localCursor = paramContext.getContentResolver().query(localUri1, arrayOfString1, "view_conversations.contact_value = ?", arrayOfString2, null);
      i1 = 0;
      if (localCursor == null);
    }
    label380: 
    do
    {
      Uri localUri2;
      ContentResolver localContentResolver;
      String str5;
      do
      {
        Uri localUri3;
        do
        {
          do
            try
            {
              boolean bool = localCursor.moveToFirst();
              i1 = 0;
              if (bool)
              {
                int i2 = localCursor.getInt(0);
                i1 = i2;
              }
              localCursor.close();
              if (i1 != 0)
                break label380;
              new StringBuilder().append("New conversation with: ").append(this.e).toString();
              localUri2 = h.a(paramContext.getContentResolver(), this.d, this.e, this.f, paramString3);
              if (TextUtils.isEmpty(paramString3))
              {
                k.a(paramContext.getContentResolver(), localUri2, paramString1, paramInt1);
                return;
                str4 = "";
                break;
              }
            }
            finally
            {
              localCursor.close();
            }
          while (!TextUtils.isEmpty(this.f));
          localContentResolver = paramContext.getContentResolver();
          localUri3 = Uri.parse(paramString3);
        }
        while (localUri3 == null);
        str5 = k.b(localContentResolver, localUri3);
      }
      while (str5 == null);
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("contact_name", str5);
      localContentResolver.update(localUri2, localContentValues, null, null);
      return;
    }
    while (i1 <= 1);
    new StringBuilder().append("Too many conversations matched contactValue:").append(this.e).toString();
  }

  public SendMessageTask(Context paramContext, m paramm)
  {
    this.e = paramm.b().toLowerCase();
    this.f = paramm.c();
    this.d = paramm.d();
    this.h = paramm.g();
    this.g = paramm.e();
    this.i = textnow.z.c.a(paramContext, paramm.k());
    this.j = paramm.a();
    this.k = true;
    String str = new u(paramContext).s();
    if ((!TextUtils.isEmpty(str)) && (this.g.endsWith("\n" + str)))
    {
      int m = ("\n" + str).length();
      this.g = this.g.substring(0, this.g.length() - m);
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("state", Integer.valueOf(0));
    paramContext.getContentResolver().update(Uri.parse(this.j), localContentValues, null, null);
  }

  public final String a()
  {
    return this.j;
  }

  public void run()
  {
    u localu = new u(this.a);
    Uri localUri = Uri.parse(this.j);
    o localo = new o(localu.b(), localu.g(), this.d, this.e, this.g, this.i);
    localo.f = this.f;
    i locali = new MessagesPost(this.a).runSync(localo);
    if (a(locali))
    {
      ContentValues localContentValues1 = new ContentValues();
      localContentValues1.put("state", Integer.valueOf(1));
      this.a.getContentResolver().update(localUri, localContentValues1, null, null);
    }
    HashMap localHashMap;
    do
    {
      return;
      localHashMap = (HashMap)locali.c();
    }
    while ((localHashMap == null) || (!localHashMap.containsKey("id")));
    try
    {
      long l2 = Long.valueOf(localHashMap.get("id").toString()).longValue();
      l1 = l2;
      ContentValues localContentValues2 = new ContentValues();
      if (l1 != -1L)
        localContentValues2.put("message_id", Long.valueOf(l1));
      localContentValues2.put("state", Integer.valueOf(0));
      if (this.k)
        localContentValues2.put("date", Long.valueOf(new Date().getTime() + new u(this.a).r()));
      if (localHashMap.containsKey("url"))
        localContentValues2.put("message_text", localHashMap.get("url").toString());
      int m = this.a.getContentResolver().update(localUri, localContentValues2, null, null);
      if (m != 1)
      {
        new StringBuilder().append("Updated ").append(m).append(" rows in REST callback instead of just 1").toString();
        return;
      }
    }
    catch (Exception localException)
    {
      long l1;
      while (true)
      {
        new StringBuilder().append("not a valid message id: ").append(localHashMap.get("id")).toString();
        l1 = -1L;
      }
      new StringBuilder().append("Updated row ").append(l1).append(" in REST callback").toString();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.SendMessageTask
 * JD-Core Version:    0.6.2
 */