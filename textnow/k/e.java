package textnow.k;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.support.v4.content.d;
import android.support.v4.widget.c;
import android.text.TextUtils;

public abstract class e extends c
{
  protected static final String[] j = { "_id", "photo_id", "display_name", "data2", "data1", "contact_id", "data3" };
  protected static final String[] k = { "_id", "data2", "data1", "data3" };
  protected static final String[] l = { "_id", "photo_id", "display_name", "data2", "data1", "contact_id", "data3" };
  protected static final String[] m = { "_id", "data2", "data1", "data3" };

  public e(Context paramContext, Cursor paramCursor)
  {
    super(paramContext, paramCursor, true);
  }

  protected static int a(String paramString)
  {
    if ((paramString == null) || (paramString.indexOf("@") >= 0))
      return 2;
    return 1;
  }

  public static Cursor a(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return new MergeCursor(new Cursor[] { paramContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, j, null, null, null), paramContext.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, l, null, null, null) });
    return new MergeCursor(new Cursor[] { paramContext.getContentResolver().query(Uri.withAppendedPath(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, Uri.encode(paramString)), j, null, null, null), paramContext.getContentResolver().query(Uri.withAppendedPath(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, Uri.encode(paramString)), l, null, null, null) });
  }

  public static d a(Context paramContext, int paramInt, String paramString)
  {
    if (paramInt == 1)
      return new d(paramContext, ContactsContract.CommonDataKinds.Phone.CONTENT_URI, k, "contact_id=?", new String[] { paramString }, null);
    return new d(paramContext, ContactsContract.CommonDataKinds.Email.CONTENT_URI, m, "contact_id=?", new String[] { paramString }, null);
  }

  public final Cursor b(Cursor paramCursor)
  {
    return super.b(d(paramCursor));
  }

  protected Cursor d(Cursor paramCursor)
  {
    return paramCursor;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.e
 * JD-Core Version:    0.6.2
 */