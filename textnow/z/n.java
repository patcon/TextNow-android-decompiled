package textnow.z;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.enflick.android.TextNow.persistence.contentproviders.h;

public final class n
{
  private static String[] e = { "_id", "contact_value", "proxy_number", "update_date" };
  private long a;
  private String b;
  private String c;
  private long d;

  private n(Cursor paramCursor)
  {
    this.a = paramCursor.getLong(0);
    this.b = paramCursor.getString(1);
    this.c = paramCursor.getString(2);
    this.d = paramCursor.getLong(3);
  }

  public static Uri a(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("contact_value", paramString1);
    localContentValues.put("proxy_number", paramString2);
    localContentValues.put("update_date", Long.valueOf(System.currentTimeMillis()));
    localContentValues.put("not_notify", Integer.valueOf(1));
    return paramContentResolver.insert(h.d, localContentValues);
  }

  public static n a(ContentResolver paramContentResolver, String paramString)
  {
    if (paramString == null);
    Cursor localCursor;
    do
    {
      return null;
      localCursor = paramContentResolver.query(h.d, e, "contact_value=?", new String[] { paramString }, null);
    }
    while (localCursor == null);
    try
    {
      boolean bool = localCursor.moveToFirst();
      n localn = null;
      if (bool)
        localn = new n(localCursor);
      return localn;
    }
    finally
    {
      localCursor.close();
    }
  }

  public final String a()
  {
    return this.c;
  }

  public final boolean b()
  {
    return System.currentTimeMillis() - this.d > 604800000L;
  }

  public final String toString()
  {
    return "contact=[" + this.b + "] proxy=[" + this.c + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.n
 * JD-Core Version:    0.6.2
 */