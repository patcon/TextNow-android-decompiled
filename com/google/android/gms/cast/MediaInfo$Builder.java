package com.google.android.gms.cast;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class MediaInfo$Builder
{
  private final MediaInfo Fm;

  public MediaInfo$Builder(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Content ID cannot be empty");
    this.Fm = new MediaInfo(paramString);
  }

  public MediaInfo build()
  {
    this.Fm.fv();
    return this.Fm;
  }

  public Builder setContentType(String paramString)
  {
    this.Fm.setContentType(paramString);
    return this;
  }

  public Builder setCustomData(JSONObject paramJSONObject)
  {
    this.Fm.setCustomData(paramJSONObject);
    return this;
  }

  public Builder setMediaTracks(List<MediaTrack> paramList)
  {
    this.Fm.c(paramList);
    return this;
  }

  public Builder setMetadata(MediaMetadata paramMediaMetadata)
  {
    this.Fm.a(paramMediaMetadata);
    return this;
  }

  public Builder setStreamDuration(long paramLong)
  {
    this.Fm.m(paramLong);
    return this;
  }

  public Builder setStreamType(int paramInt)
  {
    this.Fm.setStreamType(paramInt);
    return this;
  }

  public Builder setTextTrackStyle(TextTrackStyle paramTextTrackStyle)
  {
    this.Fm.setTextTrackStyle(paramTextTrackStyle);
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaInfo.Builder
 * JD-Core Version:    0.6.2
 */