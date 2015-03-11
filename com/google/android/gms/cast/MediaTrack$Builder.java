package com.google.android.gms.cast;

import com.google.android.gms.internal.ik;
import java.util.Locale;
import org.json.JSONObject;

public class MediaTrack$Builder
{
  private final MediaTrack FF;

  public MediaTrack$Builder(long paramLong, int paramInt)
  {
    this.FF = new MediaTrack(paramLong, paramInt);
  }

  public MediaTrack build()
  {
    return this.FF;
  }

  public Builder setContentId(String paramString)
  {
    this.FF.setContentId(paramString);
    return this;
  }

  public Builder setContentType(String paramString)
  {
    this.FF.setContentType(paramString);
    return this;
  }

  public Builder setCustomData(JSONObject paramJSONObject)
  {
    this.FF.setCustomData(paramJSONObject);
    return this;
  }

  public Builder setLanguage(String paramString)
  {
    this.FF.setLanguage(paramString);
    return this;
  }

  public Builder setLanguage(Locale paramLocale)
  {
    this.FF.setLanguage(ik.b(paramLocale));
    return this;
  }

  public Builder setName(String paramString)
  {
    this.FF.setName(paramString);
    return this;
  }

  public Builder setSubtype(int paramInt)
  {
    this.FF.aa(paramInt);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaTrack.Builder
 * JD-Core Version:    0.6.2
 */