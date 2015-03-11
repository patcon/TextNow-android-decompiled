package textnow.v;

import android.content.ContentResolver;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.widget.ImageView;
import java.io.InputStream;

public final class j
{
  public static void a(ContentResolver paramContentResolver, Uri paramUri, ImageView paramImageView, int paramInt)
  {
    try
    {
      InputStream localInputStream = ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri, true);
      if (localInputStream == null)
      {
        paramImageView.setImageResource(2130837560);
        return;
      }
      paramImageView.setImageBitmap(BitmapFactory.decodeStream(localInputStream));
      return;
    }
    catch (Throwable localThrowable)
    {
      paramImageView.setImageResource(2130837560);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.j
 * JD-Core Version:    0.6.2
 */