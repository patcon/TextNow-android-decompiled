package textnow.p;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import java.util.UUID;
import org.json.JSONObject;

public final class ad
{
  private static String[] i = { "contact_name", "contact_value", "latest_message_date", "latest_message_type", "contact_type", "contact_uri" };
  private static String[] j = { "_id", "message_text", "contact_name", "contact_value", "date", "message_type", "contact_type" };
  protected long a;
  protected String b;
  protected String c;
  protected String d;
  protected long e;
  protected int f;
  protected int g;
  protected String h;

  public ad()
  {
  }

  public ad(Cursor paramCursor)
  {
    this.a = paramCursor.getLong(0);
    this.b = paramCursor.getString(1);
    this.c = paramCursor.getString(2);
    this.d = paramCursor.getString(3);
    this.e = paramCursor.getLong(4);
    this.f = paramCursor.getInt(5);
    this.g = paramCursor.getInt(6);
    this.h = paramCursor.getString(7);
  }

  public static ad a(Cursor paramCursor)
  {
    ad localad = new ad();
    localad.a = paramCursor.getLong(0);
    localad.b = paramCursor.getString(1);
    localad.c = paramCursor.getString(2);
    localad.d = paramCursor.getString(3);
    localad.e = paramCursor.getLong(4);
    localad.f = paramCursor.getInt(5);
    localad.g = paramCursor.getInt(6);
    localad.h = null;
    if (localad.f == 0);
    try
    {
      JSONObject localJSONObject = new JSONObject(localad.b);
      if (localJSONObject.has("string"))
        localad.b = localJSONObject.getString("string");
      return localad;
    }
    catch (Exception localException)
    {
    }
    return localad;
  }

  public static String[] a()
  {
    return i;
  }

  public static ad b(Cursor paramCursor)
  {
    ad localad = new ad();
    localad.a = UUID.randomUUID().getMostSignificantBits();
    localad.b = "";
    localad.c = paramCursor.getString(0);
    localad.d = paramCursor.getString(1);
    localad.e = paramCursor.getLong(2);
    localad.f = paramCursor.getInt(3);
    localad.g = paramCursor.getInt(4);
    localad.h = paramCursor.getString(5);
    return localad;
  }

  public static String[] b()
  {
    return j;
  }

  public final void a(MatrixCursor paramMatrixCursor)
  {
    paramMatrixCursor.newRow().add(Long.valueOf(this.a)).add(this.b).add(this.c).add(this.d).add(Long.valueOf(this.e)).add(Integer.valueOf(this.f)).add(Integer.valueOf(this.g)).add(this.h);
  }

  public final long c()
  {
    return this.a;
  }

  public final String d()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.ad
 * JD-Core Version:    0.6.2
 */