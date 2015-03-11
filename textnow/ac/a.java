package textnow.ac;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.enflick.android.TextNow.persistence.contentproviders.d;
import com.enflick.android.TextNow.persistence.contentproviders.g;

public final class a
{
  public static void a(ContentResolver paramContentResolver, String paramString)
  {
    paramContentResolver.delete(d.d, "contact_value = ?", new String[] { paramString });
    paramContentResolver.delete(g.d, "contact_value = ?", new String[] { paramString });
  }

  public static void a(ContentResolver paramContentResolver, String paramString, ContentValues paramContentValues)
  {
    paramContentResolver.update(d.d, paramContentValues, "contact_value=?", new String[] { paramString });
  }

  public static void a(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("contact_name", paramString2);
    a(paramContentResolver, paramString1, localContentValues);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ac.a
 * JD-Core Version:    0.6.2
 */