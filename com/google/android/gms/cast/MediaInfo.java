package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.in;
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
  private JSONObject AA;
  private final String At;
  private int Au;
  private String Av;
  private MediaMetadata Aw;
  private long Ax;
  private List<MediaTrack> Ay;
  private TextTrackStyle Az;

  MediaInfo(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("content ID cannot be null or empty");
    this.At = paramString;
    this.Au = -1;
  }

  MediaInfo(JSONObject paramJSONObject)
  {
    this.At = paramJSONObject.getString("contentId");
    String str = paramJSONObject.getString("streamType");
    if ("NONE".equals(str))
      this.Au = 0;
    while (true)
    {
      this.Av = paramJSONObject.getString("contentType");
      if (paramJSONObject.has("metadata"))
      {
        JSONObject localJSONObject2 = paramJSONObject.getJSONObject("metadata");
        this.Aw = new MediaMetadata(localJSONObject2.getInt("metadataType"));
        this.Aw.b(localJSONObject2);
      }
      this.Ax = gi.b(paramJSONObject.optDouble("duration", 0.0D));
      if (!paramJSONObject.has("tracks"))
        break;
      this.Ay = new ArrayList();
      JSONArray localJSONArray = paramJSONObject.getJSONArray("tracks");
      while (i < localJSONArray.length())
      {
        MediaTrack localMediaTrack = new MediaTrack(localJSONArray.getJSONObject(i));
        this.Ay.add(localMediaTrack);
        i++;
      }
      if ("BUFFERED".equals(str))
        this.Au = 1;
      else if ("LIVE".equals(str))
        this.Au = 2;
      else
        this.Au = -1;
    }
    this.Ay = null;
    TextTrackStyle localTextTrackStyle;
    if (paramJSONObject.has("textTrackStyle"))
    {
      JSONObject localJSONObject1 = paramJSONObject.getJSONObject("textTrackStyle");
      localTextTrackStyle = new TextTrackStyle();
      localTextTrackStyle.b(localJSONObject1);
    }
    for (this.Az = localTextTrackStyle; ; this.Az = null)
    {
      this.AA = paramJSONObject.optJSONObject("customData");
      return;
    }
  }

  final void a(MediaMetadata paramMediaMetadata)
  {
    this.Aw = paramMediaMetadata;
  }

  final void b(List<MediaTrack> paramList)
  {
    this.Ay = paramList;
  }

  final void dY()
  {
    if (TextUtils.isEmpty(this.At))
      throw new IllegalArgumentException("content ID cannot be null or empty");
    if (TextUtils.isEmpty(this.Av))
      throw new IllegalArgumentException("content type cannot be null or empty");
    if (this.Au == -1)
      throw new IllegalArgumentException("a valid stream type must be specified");
  }

  public final JSONObject dZ()
  {
    JSONObject localJSONObject = new JSONObject();
    while (true)
    {
      try
      {
        localJSONObject.put("contentId", this.At);
        switch (this.Au)
        {
        default:
          localJSONObject.put("streamType", localObject);
          if (this.Av != null)
            localJSONObject.put("contentType", this.Av);
          if (this.Aw != null)
            localJSONObject.put("metadata", this.Aw.dZ());
          localJSONObject.put("duration", gi.o(this.Ax));
          if (this.Ay != null)
          {
            JSONArray localJSONArray = new JSONArray();
            Iterator localIterator = this.Ay.iterator();
            if (localIterator.hasNext())
            {
              localJSONArray.put(((MediaTrack)localIterator.next()).dZ());
              continue;
            }
            localJSONObject.put("tracks", localJSONArray);
          }
          if (this.Az != null)
            localJSONObject.put("textTrackStyle", this.Az.dZ());
          if (this.AA != null)
          {
            localJSONObject.put("customData", this.AA);
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
    if (this.AA == null)
    {
      i = 1;
      label36: if (localMediaInfo.AA != null)
        break label204;
    }
    label204: for (int j = 1; ; j = 0)
    {
      bool2 = false;
      if (i != j)
        break;
      if ((this.AA != null) && (localMediaInfo.AA != null))
      {
        boolean bool7 = in.d(this.AA, localMediaInfo.AA);
        bool2 = false;
        if (!bool7)
          break;
      }
      boolean bool3 = gi.a(this.At, localMediaInfo.At);
      bool2 = false;
      if (!bool3)
        break;
      int k = this.Au;
      int m = localMediaInfo.Au;
      bool2 = false;
      if (k != m)
        break;
      boolean bool4 = gi.a(this.Av, localMediaInfo.Av);
      bool2 = false;
      if (!bool4)
        break;
      boolean bool5 = gi.a(this.Aw, localMediaInfo.Aw);
      bool2 = false;
      if (!bool5)
        break;
      boolean bool6 = this.Ax < localMediaInfo.Ax;
      bool2 = false;
      if (bool6)
        break;
      return true;
      i = 0;
      break label36;
    }
  }

  public final String getContentId()
  {
    return this.At;
  }

  public final String getContentType()
  {
    return this.Av;
  }

  public final JSONObject getCustomData()
  {
    return this.AA;
  }

  public final List<MediaTrack> getMediaTracks()
  {
    return this.Ay;
  }

  public final MediaMetadata getMetadata()
  {
    return this.Aw;
  }

  public final long getStreamDuration()
  {
    return this.Ax;
  }

  public final int getStreamType()
  {
    return this.Au;
  }

  public final TextTrackStyle getTextTrackStyle()
  {
    return this.Az;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this.At;
    arrayOfObject[1] = Integer.valueOf(this.Au);
    arrayOfObject[2] = this.Av;
    arrayOfObject[3] = this.Aw;
    arrayOfObject[4] = Long.valueOf(this.Ax);
    arrayOfObject[5] = String.valueOf(this.AA);
    return hk.hashCode(arrayOfObject);
  }

  final void m(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Stream duration cannot be negative");
    this.Ax = paramLong;
  }

  final void setContentType(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("content type cannot be null or empty");
    this.Av = paramString;
  }

  final void setCustomData(JSONObject paramJSONObject)
  {
    this.AA = paramJSONObject;
  }

  final void setStreamType(int paramInt)
  {
    if ((paramInt < -1) || (paramInt > 2))
      throw new IllegalArgumentException("invalid stream type");
    this.Au = paramInt;
  }

  public final void setTextTrackStyle(TextTrackStyle paramTextTrackStyle)
  {
    this.Az = paramTextTrackStyle;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaInfo
 * JD-Core Version:    0.6.2
 */