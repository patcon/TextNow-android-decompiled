package com.google.android.gms.cast;

import com.google.android.gms.internal.gi;
import java.util.Locale;
import org.json.JSONObject;

public class MediaTrack$Builder
{
  private final MediaTrack AV;

  public MediaTrack$Builder(long paramLong, int paramInt)
  {
    this.AV = new MediaTrack(paramLong, paramInt);
  }

  public MediaTrack build()
  {
    return this.AV;
  }

  public Builder setContentId(String paramString)
  {
    this.AV.setContentId(paramString);
    return this;
  }

  public Builder setContentType(String paramString)
  {
    this.AV.setContentType(paramString);
    return this;
  }

  public Builder setCustomData(JSONObject paramJSONObject)
  {
    this.AV.setCustomData(paramJSONObject);
    return this;
  }

  public Builder setLanguage(String paramString)
  {
    this.AV.setLanguage(paramString);
    return this;
  }

  public Builder setLanguage(Locale paramLocale)
  {
    this.AV.setLanguage(gi.b(paramLocale));
    return this;
  }

  public Builder setName(String paramString)
  {
    this.AV.setName(paramString);
    return this;
  }

  public Builder setSubtype(int paramInt)
  {
    this.AV.R(paramInt);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaTrack.Builder
 * JD-Core Version:    0.6.2
 */