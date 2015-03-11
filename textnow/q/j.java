package textnow.q;

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
        paramImageView.setImageResource(2130837596);
        return;
      }
      paramImageView.setImageBitmap(BitmapFactory.decodeStream(localInputStream));
      return;
    }
    catch (Throwable localThrowable)
    {
      paramImageView.setImageResource(2130837596);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.j
 * JD-Core Version:    0.6.2
 */