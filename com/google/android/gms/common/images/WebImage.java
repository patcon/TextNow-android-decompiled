package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hk;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage
  implements SafeParcelable
{
  public static final Parcelable.Creator<WebImage> CREATOR = new b();
  private final Uri Fu;
  private final int ku;
  private final int kv;
  private final int xM;

  WebImage(int paramInt1, Uri paramUri, int paramInt2, int paramInt3)
  {
    this.xM = paramInt1;
    this.Fu = paramUri;
    this.ku = paramInt2;
    this.kv = paramInt3;
  }

  public WebImage(Uri paramUri)
  {
    this(paramUri, 0, 0);
  }

  public WebImage(Uri paramUri, int paramInt1, int paramInt2)
  {
    this(1, paramUri, paramInt1, paramInt2);
    if (paramUri == null)
      throw new IllegalArgumentException("url cannot be null");
    if ((paramInt1 < 0) || (paramInt2 < 0))
      throw new IllegalArgumentException("width and height must not be negative");
  }

  public WebImage(JSONObject paramJSONObject)
  {
    this(c(paramJSONObject), paramJSONObject.optInt("width", 0), paramJSONObject.optInt("height", 0));
  }

  private static Uri c(JSONObject paramJSONObject)
  {
    boolean bool = paramJSONObject.has("url");
    Object localObject = null;
    if (bool);
    try
    {
      Uri localUri = Uri.parse(paramJSONObject.getString("url"));
      localObject = localUri;
      return localObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return null;
  }

  public final JSONObject dZ()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("url", this.Fu.toString());
      localJSONObject.put("width", this.ku);
      localJSONObject.put("height", this.kv);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return localJSONObject;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    WebImage localWebImage;
    do
    {
      return true;
      if ((paramObject == null) || (!(paramObject instanceof WebImage)))
        return false;
      localWebImage = (WebImage)paramObject;
    }
    while ((hk.equal(this.Fu, localWebImage.Fu)) && (this.ku == localWebImage.ku) && (this.kv == localWebImage.kv));
    return false;
  }

  public final int getHeight()
  {
    return this.kv;
  }

  public final Uri getUrl()
  {
    return this.Fu;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final int getWidth()
  {
    return this.ku;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.Fu;
    arrayOfObject[1] = Integer.valueOf(this.ku);
    arrayOfObject[2] = Integer.valueOf(this.kv);
    return hk.hashCode(arrayOfObject);
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.ku);
    arrayOfObject[1] = Integer.valueOf(this.kv);
    arrayOfObject[2] = this.Fu.toString();
    return String.format("Image %dx%d %s", arrayOfObject);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.WebImage
 * JD-Core Version:    0.6.2
 */