package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.n;

final class a$a
{
  public final Uri uri;

  public a$a(Uri paramUri)
  {
    this.uri = paramUri;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a))
      return false;
    if (this == paramObject)
      return true;
    return n.equal(((a)paramObject).uri, this.uri);
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.uri;
    return n.hashCode(arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a.a
 * JD-Core Version:    0.6.2
 */