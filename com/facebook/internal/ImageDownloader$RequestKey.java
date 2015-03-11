package com.facebook.internal;

import java.net.URI;

class ImageDownloader$RequestKey
{
  private static final int HASH_MULTIPLIER = 37;
  private static final int HASH_SEED = 29;
  Object tag;
  URI uri;

  ImageDownloader$RequestKey(URI paramURI, Object paramObject)
  {
    this.uri = paramURI;
    this.tag = paramObject;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof RequestKey;
      bool1 = false;
      if (bool2)
      {
        RequestKey localRequestKey = (RequestKey)paramObject;
        URI localURI1 = localRequestKey.uri;
        URI localURI2 = this.uri;
        bool1 = false;
        if (localURI1 == localURI2)
        {
          Object localObject1 = localRequestKey.tag;
          Object localObject2 = this.tag;
          bool1 = false;
          if (localObject1 == localObject2)
            bool1 = true;
        }
      }
    }
    return bool1;
  }

  public int hashCode()
  {
    return 37 * (1073 + this.uri.hashCode()) + this.tag.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.internal.ImageDownloader.RequestKey
 * JD-Core Version:    0.6.2
 */