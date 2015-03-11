package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.jz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo
{
  public static final int STREAM_TYPE_BUFFERED = 1;
  public static final int STREAM_TYPE_INVALID = -1;
  public static final int STREAM_TYPE_LIVE = 2;
  public static final int STREAM_TYPE_NONE;
  private final String Fe;
  private int Ff;
  private String Fg;
  private MediaMetadata Fh;
  private long Fi;
  private List<MediaTrack> Fj;
  private TextTrackStyle Fk;
  private JSONObject Fl;

  MediaInfo(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("content ID cannot be null or empty");
    this.Fe = paramString;
    this.Ff = -1;
  }

  MediaInfo(JSONObject paramJSONObject)
  {
    this.Fe = paramJSONObject.getString("contentId");
    String str = paramJSONObject.getString("streamType");
    if ("NONE".equals(str))
      this.Ff = 0;
    while (true)
    {
      this.Fg = paramJSONObject.getString("contentType");
      if (paramJSONObject.has("metadata"))
      {
        JSONObject localJSONObject2 = paramJSONObject.getJSONObject("metadata");
        this.Fh = new MediaMetadata(localJSONObject2.getInt("metadataType"));
        this.Fh.c(localJSONObject2);
      }
      this.Fi = ik.b(paramJSONObject.optDouble("duration", 0.0D));
      if (!paramJSONObject.has("tracks"))
        break;
      this.Fj = new ArrayList();
      JSONArray localJSONArray = paramJSONObject.getJSONArray("tracks");
      while (i < localJSONArray.length())
      {
        MediaTrack localMediaTrack = new MediaTrack(localJSONArray.getJSONObject(i));
        this.Fj.add(localMediaTrack);
        i++;
      }
      if ("BUFFERED".equals(str))
        this.Ff = 1;
      else if ("LIVE".equals(str))
        this.Ff = 2;
      else
        this.Ff = -1;
    }
    this.Fj = null;
    TextTrackStyle localTextTrackStyle;
    if (paramJSONObject.has("textTrackStyle"))
    {
      JSONObject localJSONObject1 = paramJSONObject.getJSONObject("textTrackStyle");
      localTextTrackStyle = new TextTrackStyle();
      localTextTrackStyle.c(localJSONObject1);
    }
    for (this.Fk = localTextTrackStyle; ; this.Fk = null)
    {
      this.Fl = paramJSONObject.optJSONObject("customData");
      return;
    }
  }

  final void a(MediaMetadata paramMediaMetadata)
  {
    this.Fh = paramMediaMetadata;
  }

  public final JSONObject bK()
  {
    JSONObject localJSONObject = new JSONObject();
    while (true)
    {
      try
      {
        localJSONObject.put("contentId", this.Fe);
        switch (this.Ff)
        {
        default:
          localJSONObject.put("streamType", localObject);
          if (this.Fg != null)
            localJSONObject.put("contentType", this.Fg);
          if (this.Fh != null)
            localJSONObject.put("metadata", this.Fh.bK());
          localJSONObject.put("duration", ik.o(this.Fi));
          if (this.Fj != null)
          {
            JSONArray localJSONArray = new JSONArray();
            Iterator localIterator = this.Fj.iterator();
            if (localIterator.hasNext())
            {
              localJSONArray.put(((MediaTrack)localIterator.next()).bK());
              continue;
            }
            localJSONObject.put("tracks", localJSONArray);
          }
          if (this.Fk != null)
            localJSONObject.put("textTrackStyle", this.Fk.bK());
          if (this.Fl != null)
          {
            localJSONObject.put("customData", this.Fl);
            return localJSONObject;
            localObject = "NONE";
            continue;
          }
          break;
        case 1:
        case 2:
        }
      }
      catch (JSONException localJSONException)
      {
      }
      return localJSONObject;
      Object localObject = "BUFFERED";
      continue;
      localObject = "LIVE";
    }
  }

  final void c(List<MediaTrack> paramList)
  {
    this.Fj = paramList;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (this == paramObject)
      bool2 = true;
    boolean bool1;
    do
    {
      return bool2;
      bool1 = paramObject instanceof MediaInfo;
      bool2 = false;
    }
    while (!bool1);
    MediaInfo localMediaInfo = (MediaInfo)paramObject;
    int i;
    if (this.Fl == null)
    {
      i = 1;
      label36: if (localMediaInfo.Fl != null)
        break label204;
    }
    label204: for (int j = 1; ; j = 0)
    {
      bool2 = false;
      if (i != j)
        break;
      if ((this.Fl != null) && (localMediaInfo.Fl != null))
      {
        boolean bool7 = jz.d(this.Fl, localMediaInfo.Fl);
        bool2 = false;
        if (!bool7)
          break;
      }
      boolean bool3 = ik.a(this.Fe, localMediaInfo.Fe);
      bool2 = false;
      if (!bool3)
        break;
      int k = this.Ff;
      int m = localMediaInfo.Ff;
      bool2 = false;
      if (k != m)
        break;
      boolean bool4 = ik.a(this.Fg, localMediaInfo.Fg);
      bool2 = false;
      if (!bool4)
        break;
      boolean bool5 = ik.a(this.Fh, localMediaInfo.Fh);
      bool2 = false;
      if (!bool5)
        break;
      boolean bool6 = this.Fi < localMediaInfo.Fi;
      bool2 = false;
      if (bool6)
        break;
      return true;
      i = 0;
      break label36;
    }
  }

  final void fv()
  {
    if (TextUtils.isEmpty(this.Fe))
      throw new IllegalArgumentException("content ID cannot be null or empty");
    if (TextUtils.isEmpty(this.Fg))
      throw new IllegalArgumentException("content type cannot be null or empty");
    if (this.Ff == -1)
      throw new IllegalArgumentException("a valid stream type must be specified");
  }

  public final String getContentId()
  {
    return this.Fe;
  }

  public final String getContentType()
  {
    return this.Fg;
  }

  public final JSONObject getCustomData()
  {
    return this.Fl;
  }

  public final List<MediaTrack> getMediaTracks()
  {
    return this.Fj;
  }

  public final MediaMetadata getMetadata()
  {
    return this.Fh;
  }

  public final long getStreamDuration()
  {
    return this.Fi;
  }

  public final int getStreamType()
  {
    return this.Ff;
  }

  public final TextTrackStyle getTextTrackStyle()
  {
    return this.Fk;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this.Fe;
    arrayOfObject[1] = Integer.valueOf(this.Ff);
    arrayOfObject[2] = this.Fg;
    arrayOfObject[3] = this.Fh;
    arrayOfObject[4] = Long.valueOf(this.Fi);
    arrayOfObject[5] = String.valueOf(this.Fl);
    return n.hashCode(arrayOfObject);
  }

  final void m(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Stream duration cannot be negative");
    this.Fi = paramLong;
  }

  final void setContentType(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("content type cannot be null or empty");
    this.Fg = paramString;
  }

  final void setCustomData(JSONObject paramJSONObject)
  {
    this.Fl = paramJSONObject;
  }

  final void setStreamType(int paramInt)
  {
    if ((paramInt < -1) || (paramInt > 2))
      throw new IllegalArgumentException("invalid stream type");
    this.Ff = paramInt;
  }

  public final void setTextTrackStyle(TextTrackStyle paramTextTrackStyle)
  {
    this.Fk = paramTextTrackStyle;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaInfo
 * JD-Core Version:    0.6.2
 */