package textnow.r;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.support.v4.content.d;

public final class a extends d
{
  public a(Context paramContext)
  {
    super(paramContext);
  }

  public final Cursor d()
  {
    Context localContext = getContext();
    String[] arrayOfString1 = { "_id", "photo_id", "display_name", "data2", "data1", "contact_id", "data3" };
    String[] arrayOfString2 = { "_id", "photo_id", "data4", "data2", "data1", "contact_id", "data3" };
    return new MergeCursor(new Cursor[] { localContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, arrayOfString1, null, null, null), localContext.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, arrayOfString2, null, null, null) });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.r.a
 * JD-Core Version:    0.6.2
 */