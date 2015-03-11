package twitter4j.internal.json;

import twitter4j.MediaEntity.Size;
import twitter4j.internal.org.json.JSONObject;

class MediaEntityJSONImpl$Size
  implements MediaEntity.Size
{
  private static final long serialVersionUID = 8681853416159361581L;
  int height;
  int resize;
  int width;

  MediaEntityJSONImpl$Size(JSONObject paramJSONObject)
  {
    this.width = paramJSONObject.getInt("w");
    this.height = paramJSONObject.getInt("h");
    if ("fit".equals(paramJSONObject.getString("resize")));
    for (int i = 100; ; i = 101)
    {
      this.resize = i;
      return;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    Size localSize;
    do
    {
      return true;
      if (!(paramObject instanceof Size))
        return false;
      localSize = (Size)paramObject;
      if (this.height != localSize.height)
        return false;
      if (this.resize != localSize.resize)
        return false;
    }
    while (this.width == localSize.width);
    return false;
  }

  public int getHeight()
  {
    return this.height;
  }

  public int getResize()
  {
    return this.resize;
  }

  public int getWidth()
  {
    return this.width;
  }

  public int hashCode()
  {
    return 31 * (31 * this.width + this.height) + this.resize;
  }

  public String toString()
  {
    return "Size{width=" + this.width + ", height=" + this.height + ", resize=" + this.resize + '}';
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.internal.json.MediaEntityJSONImpl.Size
 * JD-Core Version:    0.6.2
 */