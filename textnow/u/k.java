package textnow.u;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.content.d;
import android.text.TextUtils;
import com.enflick.android.TextNow.persistence.contentproviders.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class k
{
  private static final Set<Integer> a;
  private static String[] b = { "_id", "message_text", "message_type", "message_id", "message_direction", "contact_value", "contact_name", "contact_type", "date", "state", "attach", "message_source" };
  private long c;
  private String d;
  private String e;
  private int f;
  private String g;
  private long h;
  private int i;
  private int j;
  private long k;
  private int l;
  private String m;
  private int n;

  static
  {
    HashSet localHashSet = new HashSet();
    a = localHashSet;
    localHashSet.add(Integer.valueOf(0));
    a.add(Integer.valueOf(1));
    a.add(Integer.valueOf(2));
    a.add(Integer.valueOf(3));
    a.add(Integer.valueOf(4));
    a.add(Integer.valueOf(5));
    a.add(Integer.valueOf(7));
    a.add(Integer.valueOf(8));
    a.add(Integer.valueOf(9));
    a.add(Integer.valueOf(10));
  }

  public k(Cursor paramCursor)
  {
    this.c = paramCursor.getLong(0);
    this.g = paramCursor.getString(1);
    this.i = paramCursor.getInt(2);
    this.h = paramCursor.getLong(3);
    this.j = paramCursor.getInt(4);
    this.d = paramCursor.getString(5);
    this.e = paramCursor.getString(6);
    this.f = paramCursor.getInt(7);
    this.k = paramCursor.getLong(8);
    this.l = paramCursor.getInt(9);
    this.m = paramCursor.getString(10);
    this.n = paramCursor.getInt(11);
  }

  public static Uri a(Context paramContext, int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean, String paramString3, String paramString4, int paramInt4)
  {
    ContentValues localContentValues = new ContentValues();
    r localr = new r(paramContext);
    String str = localr.u();
    if ((paramInt2 == 1) && (paramInt4 != 1) && (!TextUtils.isEmpty(str)))
      paramString3 = paramString3 + "\n" + str;
    localContentValues.put("message_id", Long.valueOf(UUID.randomUUID().getMostSignificantBits()));
    localContentValues.put("contact_value", paramString1);
    localContentValues.put("contact_type", Integer.valueOf(paramInt1));
    if (paramString2 == null)
      paramString2 = "";
    localContentValues.put("contact_name", paramString2);
    localContentValues.put("message_direction", Integer.valueOf(paramInt3));
    localContentValues.put("message_type", Integer.valueOf(paramInt2));
    localContentValues.put("message_text", paramString3);
    localContentValues.put("read", Boolean.valueOf(paramBoolean));
    localContentValues.put("date", Long.valueOf(new Date().getTime() + localr.t()));
    localContentValues.put("state", Integer.valueOf(0));
    if (paramString4 == null)
      paramString4 = "";
    localContentValues.put("attach", paramString4);
    localContentValues.put("message_source", Integer.valueOf(paramInt4));
    return paramContext.getContentResolver().insert(f.d, localContentValues);
  }

  public static d a(Context paramContext, String paramString)
  {
    String[] arrayOfString = { paramString };
    return new d(paramContext, f.d, b, "contact_value = ?", arrayOfString, "date");
  }

  public static boolean a(int paramInt)
  {
    return a.contains(Integer.valueOf(paramInt));
  }

  public static ArrayList<k> b(Context paramContext, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = { paramString };
    Cursor localCursor = paramContext.getContentResolver().query(f.d, b, "contact_value = ?", arrayOfString, "date");
    if (localCursor != null)
      try
      {
        if (localCursor.moveToNext())
          localArrayList.add(new k(localCursor));
      }
      finally
      {
        localCursor.close();
      }
    return localArrayList;
  }

  public final String a()
  {
    return ContentUris.withAppendedId(f.d, this.c).toString();
  }

  public final String b()
  {
    return this.d;
  }

  public final String c()
  {
    return this.e;
  }

  public final int d()
  {
    return this.f;
  }

  public final String e()
  {
    return this.g;
  }

  public final long f()
  {
    return this.h;
  }

  public final int g()
  {
    return this.i;
  }

  public final int h()
  {
    return this.j;
  }

  public final long i()
  {
    return this.k;
  }

  public final int j()
  {
    return this.l;
  }

  public final String k()
  {
    return this.m;
  }

  public final int l()
  {
    return this.n;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.k
 * JD-Core Version:    0.6.2
 */