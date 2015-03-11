package textnow.k;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import java.util.UUID;
import org.json.JSONObject;

public final class w
{
  private static String[] k = { "contact_name", "contact_value", "latest_message_date", "latest_message_type", "contact_type", "contact_uri" };
  private static String[] l = { "_id", "message_text", "contact_name", "contact_value", "date", "message_type", "contact_type" };
  protected long a;
  protected String b;
  protected String c;
  protected String d;
  protected long e;
  protected int f;
  protected int g;
  protected String h;
  protected String i;
  protected int j;

  public w()
  {
  }

  public w(Cursor paramCursor)
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

  public static w a(Cursor paramCursor)
  {
    w localw = new w();
    localw.a = paramCursor.getLong(0);
    localw.b = paramCursor.getString(1);
    localw.c = paramCursor.getString(2);
    localw.d = paramCursor.getString(3);
    localw.e = paramCursor.getLong(4);
    localw.f = paramCursor.getInt(5);
    localw.g = paramCursor.getInt(6);
    localw.h = null;
    if (localw.f == 0);
    try
    {
      JSONObject localJSONObject = new JSONObject(localw.b);
      if (localJSONObject.has("string"))
        localw.b = localJSONObject.getString("string");
      return localw;
    }
    catch (Exception localException)
    {
    }
    return localw;
  }

  public static String[] a()
  {
    return k;
  }

  public static w b(Cursor paramCursor)
  {
    w localw = new w();
    localw.a = UUID.randomUUID().getMostSignificantBits();
    localw.b = "";
    localw.c = paramCursor.getString(0);
    localw.d = paramCursor.getString(1);
    localw.e = paramCursor.getLong(2);
    localw.f = paramCursor.getInt(3);
    localw.g = paramCursor.getInt(4);
    localw.h = paramCursor.getString(5);
    return localw;
  }

  public static String[] b()
  {
    return l;
  }

  public final void a(int paramInt)
  {
    this.j = paramInt;
  }

  public final void a(MatrixCursor paramMatrixCursor)
  {
    paramMatrixCursor.newRow().add(Long.valueOf(this.a)).add(this.b).add(this.c).add(this.d).add(Long.valueOf(this.e)).add(Integer.valueOf(this.f)).add(Integer.valueOf(this.g)).add(this.h);
  }

  public final void a(String paramString)
  {
    this.i = paramString;
  }

  public final int c()
  {
    return this.j;
  }

  public final String d()
  {
    return this.i;
  }

  public final long e()
  {
    return this.a;
  }

  public final String f()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.w
 * JD-Core Version:    0.6.2
 */