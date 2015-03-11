package textnow.z;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.d;
import android.text.TextUtils;
import com.enflick.android.TextNow.persistence.contentproviders.c;
import java.io.Serializable;
import textnow.v.b;
import textnow.v.k;

public final class e
  implements Serializable
{
  private static String[] h = { "_id", "contact_value", "contact_type", "contact_name", "message_type", "message_text", "date", "contact_uri" };
  private String a;
  private int b;
  private String c;
  private int d;
  private String e;
  private long f;
  private String g;
  private long i;

  public e(Cursor paramCursor)
  {
    this.i = paramCursor.getLong(0);
    this.a = paramCursor.getString(1);
    this.b = paramCursor.getInt(2);
    this.c = paramCursor.getString(3);
    this.d = paramCursor.getInt(4);
    this.e = paramCursor.getString(5);
    this.f = paramCursor.getLong(6);
    this.g = paramCursor.getString(7);
  }

  public static d a(Context paramContext, String paramString, boolean paramBoolean)
  {
    String str;
    String[] arrayOfString;
    if (paramBoolean)
      if (paramString != null)
      {
        str = "(message_type=? OR (message_type=? AND message_text LIKE ?)) AND contact_value=?";
        arrayOfString = new String[4];
        arrayOfString[0] = "101";
        arrayOfString[1] = "1";
        arrayOfString[2] = "Missed call from%";
        arrayOfString[3] = paramString;
      }
    while (true)
    {
      return new d(paramContext, c.d, h, str, arrayOfString, "date DESC");
      str = "message_type=? OR (message_type=? AND message_text LIKE ?)";
      arrayOfString = new String[] { "101", "1", "Missed call from%" };
      continue;
      if (paramString != null)
      {
        str = "(message_type IN (?, ?, ?, ?) OR (message_type=? AND message_text LIKE ?)) AND contact_value = ?";
        arrayOfString = new String[] { "100", "101", "103", "102", "1", "Missed call from%", paramString };
      }
      else
      {
        str = "message_type IN (?, ?, ?, ?) OR (message_type=? AND message_text LIKE ?)";
        arrayOfString = new String[] { "100", "101", "103", "102", "1", "Missed call from%" };
      }
    }
  }

  public final long a()
  {
    return this.i;
  }

  public final String b()
  {
    return this.a;
  }

  public final int c()
  {
    return this.b;
  }

  public final String d()
  {
    return this.c;
  }

  public final int e()
  {
    return this.d;
  }

  public final String f()
  {
    return this.e;
  }

  public final long g()
  {
    return this.f;
  }

  public final String h()
  {
    return this.g;
  }

  public final String i()
  {
    if (!TextUtils.isEmpty(this.c))
      return this.c;
    if (this.b == 2)
    {
      if (k.a(this.a))
        return "Unknown Number";
      return b.f(this.a);
    }
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.e
 * JD-Core Version:    0.6.2
 */