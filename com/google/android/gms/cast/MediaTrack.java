package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.in;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
  public static final int SUBTYPE_CAPTIONS = 2;
  public static final int SUBTYPE_CHAPTERS = 4;
  public static final int SUBTYPE_DESCRIPTIONS = 3;
  public static final int SUBTYPE_METADATA = 5;
  public static final int SUBTYPE_NONE = 0;
  public static final int SUBTYPE_SUBTITLES = 1;
  public static final int SUBTYPE_UNKNOWN = -1;
  public static final int TYPE_AUDIO = 2;
  public static final int TYPE_TEXT = 1;
  public static final int TYPE_UNKNOWN = 0;
  public static final int TYPE_VIDEO = 3;
  private JSONObject AA;
  private long AS;
  private int AT;
  private int AU;
  private String Ar;
  private String At;
  private String Av;
  private String mName;

  MediaTrack(long paramLong, int paramInt)
  {
    clear();
    this.AS = paramLong;
    if ((paramInt <= 0) || (paramInt > 3))
      throw new IllegalArgumentException("invalid type " + paramInt);
    this.AT = paramInt;
  }

  MediaTrack(JSONObject paramJSONObject)
  {
    b(paramJSONObject);
  }

  private void b(JSONObject paramJSONObject)
  {
    clear();
    this.AS = paramJSONObject.getLong("trackId");
    String str1 = paramJSONObject.getString("type");
    String str2;
    if ("TEXT".equals(str1))
    {
      this.AT = 1;
      this.At = paramJSONObject.optString("trackContentId", null);
      this.Av = paramJSONObject.optString("trackContentType", null);
      this.mName = paramJSONObject.optString("name", null);
      this.Ar = paramJSONObject.optString("language", null);
      if (!paramJSONObject.has("subtype"))
        break label276;
      str2 = paramJSONObject.getString("subtype");
      if (!"SUBTITLES".equals(str2))
        break label181;
      this.AU = 1;
    }
    label276: 
    while (true)
    {
      this.AA = paramJSONObject.optJSONObject("customData");
      return;
      if ("AUDIO".equals(str1))
      {
        this.AT = 2;
        break;
      }
      if ("VIDEO".equals(str1))
      {
        this.AT = 3;
        break;
      }
      throw new JSONException("invalid type: " + str1);
      label181: if ("CAPTIONS".equals(str2))
      {
        this.AU = 2;
      }
      else if ("DESCRIPTIONS".equals(str2))
      {
        this.AU = 3;
      }
      else if ("CHAPTERS".equals(str2))
      {
        this.AU = 4;
      }
      else if ("METADATA".equals(str2))
      {
        this.AU = 5;
      }
      else
      {
        throw new JSONException("invalid subtype: " + str2);
        this.AU = 0;
      }
    }
  }

  private void clear()
  {
    this.AS = 0L;
    this.AT = 0;
    this.At = null;
    this.mName = null;
    this.Ar = null;
    this.AU = -1;
    this.AA = null;
  }

  final void R(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 5))
      throw new IllegalArgumentException("invalid subtype " + paramInt);
    if ((paramInt != 0) && (this.AT != 1))
      throw new IllegalArgumentException("subtypes are only valid for text tracks");
    this.AU = paramInt;
  }

  public final JSONObject dZ()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("trackId", this.AS);
      switch (this.AT)
      {
      default:
        if (this.At != null)
          localJSONObject.put("trackContentId", this.At);
        if (this.Av != null)
          localJSONObject.put("trackContentType", this.Av);
        if (this.mName != null)
          localJSONObject.put("name", this.mName);
        if (!TextUtils.isEmpty(this.Ar))
          localJSONObject.put("language", this.Ar);
        switch (this.AU)
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
        break;
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        if (this.AA == null)
          break label276;
        localJSONObject.put("customData", this.AA);
        return localJSONObject;
        localJSONObject.put("type", "TEXT");
        break;
        localJSONObject.put("type", "AUDIO");
        break;
        localJSONObject.put("type", "VIDEO");
        break;
        localJSONObject.put("subtype", "SUBTITLES");
        continue;
        localJSONObject.put("subtype", "CAPTIONS");
        continue;
        localJSONObject.put("subtype", "DESCRIPTIONS");
        continue;
        localJSONObject.put("subtype", "CHAPTERS");
        continue;
        localJSONObject.put("subtype", "METADATA");
      }
      label276: return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return localJSONObject;
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
      bool1 = paramObject instanceof MediaTrack;
      bool2 = false;
    }
    while (!bool1);
    MediaTrack localMediaTrack = (MediaTrack)paramObject;
    int i;
    if (this.AA == null)
    {
      i = 1;
      label36: if (localMediaTrack.AA != null)
        break label247;
    }
    label247: for (int j = 1; ; j = 0)
    {
      bool2 = false;
      if (i != j)
        break;
      if ((this.AA != null) && (localMediaTrack.AA != null))
      {
        boolean bool8 = in.d(this.AA, localMediaTrack.AA);
        bool2 = false;
        if (!bool8)
          break;
      }
      boolean bool3 = this.AS < localMediaTrack.AS;
      bool2 = false;
      if (bool3)
        break;
      int k = this.AT;
      int m = localMediaTrack.AT;
      bool2 = false;
      if (k != m)
        break;
      boolean bool4 = gi.a(this.At, localMediaTrack.At);
      bool2 = false;
      if (!bool4)
        break;
      boolean bool5 = gi.a(this.Av, localMediaTrack.Av);
      bool2 = false;
      if (!bool5)
        break;
      boolean bool6 = gi.a(this.mName, localMediaTrack.mName);
      bool2 = false;
      if (!bool6)
        break;
      boolean bool7 = gi.a(this.Ar, localMediaTrack.Ar);
      bool2 = false;
      if (!bool7)
        break;
      int n = this.AU;
      int i1 = localMediaTrack.AU;
      bool2 = false;
      if (n != i1)
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

  public final long getId()
  {
    return this.AS;
  }

  public final String getLanguage()
  {
    return this.Ar;
  }

  public final String getName()
  {
    return this.mName;
  }

  public final int getSubtype()
  {
    return this.AU;
  }

  public final int getType()
  {
    return this.AT;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = Long.valueOf(this.AS);
    arrayOfObject[1] = Integer.valueOf(this.AT);
    arrayOfObject[2] = this.At;
    arrayOfObject[3] = this.Av;
    arrayOfObject[4] = this.mName;
    arrayOfObject[5] = this.Ar;
    arrayOfObject[6] = Integer.valueOf(this.AU);
    arrayOfObject[7] = this.AA;
    return hk.hashCode(arrayOfObject);
  }

  public final void setContentId(String paramString)
  {
    this.At = paramString;
  }

  public final void setContentType(String paramString)
  {
    this.Av = paramString;
  }

  final void setCustomData(JSONObject paramJSONObject)
  {
    this.AA = paramJSONObject;
  }

  final void setLanguage(String paramString)
  {
    this.Ar = paramString;
  }

  final void setName(String paramString)
  {
    this.mName = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaTrack
 * JD-Core Version:    0.6.2
 */