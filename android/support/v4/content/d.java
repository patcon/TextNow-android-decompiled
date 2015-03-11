package android.support.v4.content;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class d extends a<Cursor>
{
  final j<Cursor>.k f = new k(this);
  Uri g;
  String[] h;
  String i;
  String[] j;
  String k;
  Cursor l;

  public d(Context paramContext)
  {
    super(paramContext);
  }

  public d(Context paramContext, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    super(paramContext);
    this.g = paramUri;
    this.h = paramArrayOfString1;
    this.i = paramString1;
    this.j = paramArrayOfString2;
    this.k = paramString2;
  }

  private void a(Cursor paramCursor)
  {
    if (isReset())
      if (paramCursor != null)
        paramCursor.close();
    Cursor localCursor;
    do
    {
      return;
      localCursor = this.l;
      this.l = paramCursor;
      if (isStarted())
        super.deliverResult(paramCursor);
    }
    while ((localCursor == null) || (localCursor == paramCursor) || (localCursor.isClosed()));
    localCursor.close();
  }

  public Cursor d()
  {
    Cursor localCursor = getContext().getContentResolver().query(this.g, this.h, this.i, this.j, this.k);
    if (localCursor != null)
    {
      localCursor.getCount();
      localCursor.registerContentObserver(this.f);
    }
    return localCursor;
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mUri=");
    paramPrintWriter.println(this.g);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mProjection=");
    paramPrintWriter.println(Arrays.toString(this.h));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelection=");
    paramPrintWriter.println(this.i);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelectionArgs=");
    paramPrintWriter.println(Arrays.toString(this.j));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSortOrder=");
    paramPrintWriter.println(this.k);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCursor=");
    paramPrintWriter.println(this.l);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mContentChanged=");
    paramPrintWriter.println(this.mContentChanged);
  }

  protected void onReset()
  {
    super.onReset();
    onStopLoading();
    if ((this.l != null) && (!this.l.isClosed()))
      this.l.close();
    this.l = null;
  }

  protected void onStartLoading()
  {
    if (this.l != null)
      a(this.l);
    if ((takeContentChanged()) || (this.l == null))
      forceLoad();
  }

  protected void onStopLoading()
  {
    a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.content.d
 * JD-Core Version:    0.6.2
 */