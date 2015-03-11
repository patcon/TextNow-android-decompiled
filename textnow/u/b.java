package textnow.u;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import java.io.ByteArrayOutputStream;
import java.io.File;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import textnow.q.f;

public class b extends c
{
  public b(String paramString)
  {
    super(paramString);
  }

  protected File a(Context paramContext)
  {
    return new File(this.a);
  }

  public final ContentBody b(Context paramContext)
  {
    File localFile = a(paramContext);
    if (!localFile.exists())
      return null;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(localFile.getAbsolutePath(), localOptions);
    int i = localOptions.outWidth;
    int j = localOptions.outHeight;
    if ((localFile.length() < 2097152L) && (i <= 1024) && (j <= 1024))
      return new FileBody(localFile, "tempfile", "application/octet-stream", "UTF-8");
    new StringBuilder().append("Resizing image file for upload: ").append(this.a).toString();
    Bitmap localBitmap = f.a(localFile.getAbsolutePath(), 1024);
    if (localBitmap == null)
    {
      new StringBuilder().append("Unable to resize image: ").append(this.a).toString();
      return null;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    localBitmap.compress(Bitmap.CompressFormat.JPEG, 75, localByteArrayOutputStream);
    try
    {
      ByteArrayBody localByteArrayBody = new ByteArrayBody(localByteArrayOutputStream.toByteArray(), "application/octet-stream", "tempfile");
      return localByteArrayBody;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.b
 * JD-Core Version:    0.6.2
 */