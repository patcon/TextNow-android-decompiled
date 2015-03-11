package textnow.z;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import textnow.v.b;
import textnow.v.k;

public final class h
  implements Serializable
{
  private static String[] a = { "_id", "contact_value", "contact_type", "contact_name", "contact_uri", "latest_message_text", "latest_message_date", "num_unread", "latest_message_type", "latest_message_direction", "custom_wallpaper", "custom_ringtone", "notification_disabled" };
  private long b;
  private String c;
  private int d;
  private String e;
  private String f = "hello";
  private int g;
  private int h;
  private int i;
  private long j;
  private String k;
  private String l;
  private String m;
  private int n;

  public h(Cursor paramCursor)
  {
    a(paramCursor);
  }

  public static Uri a(ContentResolver paramContentResolver, int paramInt, String paramString1, String paramString2)
  {
    return a(paramContentResolver, paramInt, paramString1, paramString2, null);
  }

  public static Uri a(ContentResolver paramContentResolver, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("contact_type", Integer.valueOf(paramInt));
    localContentValues.put("contact_name", paramString2);
    localContentValues.put("contact_value", paramString1);
    localContentValues.put("custom_ringtone", "android.resource://com.enflick.android.TextNow/2131099650");
    localContentValues.put("notification_disabled", Integer.valueOf(0));
    if (paramString3 != null)
      localContentValues.put("contact_uri", paramString3);
    return paramContentResolver.insert(com.enflick.android.TextNow.persistence.contentproviders.d.d, localContentValues);
  }

  public static android.support.v4.content.d a(Context paramContext)
  {
    return new android.support.v4.content.d(paramContext, com.enflick.android.TextNow.persistence.contentproviders.d.d, a, null, null, "latest_message_date DESC");
  }

  public static android.support.v4.content.d a(Context paramContext, int paramInt)
  {
    return new android.support.v4.content.d(paramContext, com.enflick.android.TextNow.persistence.contentproviders.d.d, a, null, null, "latest_message_date DESC LIMIT " + 4);
  }

  public static List<h> a(ContentResolver paramContentResolver, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = paramContentResolver.query(com.enflick.android.TextNow.persistence.contentproviders.d.d, a, null, null, "latest_message_date DESC LIMIT " + 5);
    if (localCursor != null)
      try
      {
        if (localCursor.moveToNext())
          localArrayList.add(new h(localCursor));
      }
      finally
      {
        localCursor.close();
      }
    return localArrayList;
  }

  public static h a(ContentResolver paramContentResolver, String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0));
    Cursor localCursor;
    do
    {
      ArrayList localArrayList;
      StringBuilder localStringBuilder;
      do
      {
        return null;
        localArrayList = new ArrayList();
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("view_conversations.contact_value IN(");
        for (int i1 = 0; i1 < paramArrayOfString.length; i1++)
          if (!TextUtils.isEmpty(paramArrayOfString[i1]))
          {
            localArrayList.add(paramArrayOfString[i1]);
            localStringBuilder.append("?,");
          }
        if (localStringBuilder.length() > 0)
        {
          localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
          localStringBuilder.append(')');
        }
      }
      while (localArrayList.size() <= 0);
      localCursor = paramContentResolver.query(com.enflick.android.TextNow.persistence.contentproviders.d.d, a, localStringBuilder.toString(), (String[])localArrayList.toArray(new String[0]), null);
    }
    while (localCursor == null);
    try
    {
      boolean bool = localCursor.moveToFirst();
      h localh = null;
      if (bool)
        localh = new h(localCursor);
      return localh;
    }
    finally
    {
      localCursor.close();
    }
  }

  public static h a(Context paramContext, f paramf)
  {
    if (paramf == null)
      return null;
    g localg = f.a(paramContext, b(paramContext), paramf.a(), paramf.b());
    if (localg != null);
    for (String str = localg.a; ; str = paramf.a())
      return a(paramContext.getContentResolver(), new String[] { str });
  }

  private void a(Cursor paramCursor)
  {
    this.b = paramCursor.getLong(0);
    this.c = paramCursor.getString(1);
    this.d = paramCursor.getInt(2);
    this.e = paramCursor.getString(3);
    this.k = paramCursor.getString(4);
    this.f = paramCursor.getString(5);
    this.j = paramCursor.getLong(6);
    this.g = paramCursor.getInt(7);
    this.h = paramCursor.getInt(8);
    this.i = paramCursor.getInt(9);
    this.l = paramCursor.getString(10);
    this.m = paramCursor.getString(11);
    this.n = paramCursor.getInt(12);
  }

  public static Set<String> b(Context paramContext)
  {
    HashSet localHashSet = new HashSet();
    try
    {
      String[] arrayOfString = { "view_conversations.contact_value" };
      Uri localUri = com.enflick.android.TextNow.persistence.contentproviders.d.d;
      Cursor localCursor = paramContext.getContentResolver().query(localUri, arrayOfString, null, null, null);
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

  public static boolean c(String paramString)
  {
    return (TextUtils.isEmpty(paramString)) || ("NON_CONTACT".equals(paramString));
  }

  public static String[] o()
  {
    return a;
  }

  public final long a()
  {
    return this.b;
  }

  public final void a(ContentResolver paramContentResolver)
  {
    Cursor localCursor;
    if (this.c != null)
    {
      Uri localUri = com.enflick.android.TextNow.persistence.contentproviders.d.d;
      String[] arrayOfString1 = a;
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.c;
      localCursor = paramContentResolver.query(localUri, arrayOfString1, "view_conversations.contact_value=?", arrayOfString2, null);
      if (localCursor == null);
    }
    try
    {
      if (localCursor.moveToFirst())
        a(localCursor);
      return;
    }
    finally
    {
      localCursor.close();
    }
  }

  public final void a(String paramString)
  {
    this.l = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i1 = 1; ; i1 = 0)
    {
      this.n = i1;
      return;
    }
  }

  public final String b()
  {
    return ContentUris.withAppendedId(com.enflick.android.TextNow.persistence.contentproviders.d.d, this.b).toString();
  }

  public final void b(String paramString)
  {
    this.m = paramString;
  }

  public final String c()
  {
    return this.c;
  }

  public final int d()
  {
    return this.d;
  }

  public final String e()
  {
    return this.e;
  }

  public final String f()
  {
    return this.f;
  }

  public final long g()
  {
    return this.j;
  }

  public final String h()
  {
    return this.k;
  }

  public final int i()
  {
    return this.g;
  }

  public final int j()
  {
    return this.h;
  }

  public final int k()
  {
    return this.i;
  }

  public final String l()
  {
    return this.l;
  }

  public final String m()
  {
    return this.m;
  }

  public final boolean n()
  {
    return this.n == 1;
  }

  public final String p()
  {
    if (this.c.equalsIgnoreCase("support@enflick.com"))
      return this.c;
    if (TextUtils.isEmpty(this.e))
    {
      if (this.d == 2)
      {
        if (k.a(this.c))
          return "Unknown Number";
        return b.f(this.c);
      }
      return this.c;
    }
    return this.e;
  }

  public final String toString()
  {
    int i1 = 1;
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("[");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("id=" + this.b).append(" contact_type=" + this.d).append(" contact_value=" + this.c).append(" contact_name=" + this.e).append(" latestMessageText=" + this.f).append(" unreadCount=" + this.g).append(" latestMessageType=" + this.h).append(" latestMessageDirection=" + this.i).append(" latestMessageData=" + this.j).append(" contact_uri=" + this.k.toString()).append(" wallpaper=" + this.l).append(" ringtone=" + this.m);
    StringBuilder localStringBuilder3 = new StringBuilder().append(" notification_disabled=");
    if (this.n == i1);
    while (true)
    {
      localStringBuilder2.append(i1);
      localStringBuilder1.append("]");
      return localStringBuilder1.toString();
      int i2 = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.h
 * JD-Core Version:    0.6.2
 */