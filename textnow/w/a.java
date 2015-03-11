package textnow.w;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.enflick.android.TextNow.persistence.contentproviders.c;
import com.enflick.android.TextNow.persistence.contentproviders.f;

public final class a
{
  public static void a(ContentResolver paramContentResolver, String paramString)
  {
    paramContentResolver.delete(c.d, "contact_value = ?", new String[] { paramString });
    paramContentResolver.delete(f.d, "contact_value = ?", new String[] { paramString });
  }

  public static void a(ContentResolver paramContentResolver, String paramString, ContentValues paramContentValues)
  {
    paramContentResolver.update(c.d, paramContentValues, "contact_value=?", new String[] { paramString });
  }

  public static void a(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("contact_name", paramString2);
    a(paramContentResolver, paramString1, localContentValues);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.w.a
 * JD-Core Version:    0.6.2
 */