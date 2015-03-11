package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.jz;
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
  private long Dj;
  private int FD;
  private int FE;
  private String Fc;
  private String Fe;
  private String Fg;
  private JSONObject Fl;
  private String mName;

  MediaTrack(long paramLong, int paramInt)
  {
    clear();
    this.Dj = paramLong;
    if ((paramInt <= 0) || (paramInt > 3))
      throw new IllegalArgumentException("invalid type " + paramInt);
    this.FD = paramInt;
  }

  MediaTrack(JSONObject paramJSONObject)
  {
    c(paramJSONObject);
  }

  private void c(JSONObject paramJSONObject)
  {
    clear();
    this.Dj = paramJSONObject.getLong("trackId");
    String str1 = paramJSONObject.getString("type");
    String str2;
    if ("TEXT".equals(str1))
    {
      this.FD = 1;
      this.Fe = paramJSONObject.optString("trackContentId", null);
      this.Fg = paramJSONObject.optString("trackContentType", null);
      this.mName = paramJSONObject.optString("name", null);
      this.Fc = paramJSONObject.optString("language", null);
      if (!paramJSONObject.has("subtype"))
        break label276;
      str2 = paramJSONObject.getString("subtype");
      if (!"SUBTITLES".equals(str2))
        break label181;
      this.FE = 1;
    }
    label276: 
    while (true)
    {
      this.Fl = paramJSONObject.optJSONObject("customData");
      return;
      if ("AUDIO".equals(str1))
      {
        this.FD = 2;
        break;
      }
      if ("VIDEO".equals(str1))
      {
        this.FD = 3;
        break;
      }
      throw new JSONException("invalid type: " + str1);
      label181: if ("CAPTIONS".equals(str2))
      {
        this.FE = 2;
      }
      else if ("DESCRIPTIONS".equals(str2))
      {
        this.FE = 3;
      }
      else if ("CHAPTERS".equals(str2))
      {
        this.FE = 4;
      }
      else if ("METADATA".equals(str2))
      {
        this.FE = 5;
      }
      else
      {
        throw new JSONException("invalid subtype: " + str2);
        this.FE = 0;
      }
    }
  }

  private void clear()
  {
    this.Dj = 0L;
    this.FD = 0;
    this.Fe = null;
    this.mName = null;
    this.Fc = null;
    this.FE = -1;
    this.Fl = null;
  }

  final void aa(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 5))
      throw new IllegalArgumentException("invalid subtype " + paramInt);
    if ((paramInt != 0) && (this.FD != 1))
      throw new IllegalArgumentException("subtypes are only valid for text tracks");
    this.FE = paramInt;
  }

  public final JSONObject bK()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("trackId", this.Dj);
      switch (this.FD)
      {
      default:
        if (this.Fe != null)
          localJSONObject.put("trackContentId", this.Fe);
        if (this.Fg != null)
          localJSONObject.put("trackContentType", this.Fg);
        if (this.mName != null)
          localJSONObject.put("name", this.mName);
        if (!TextUtils.isEmpty(this.Fc))
          localJSONObject.put("language", this.Fc);
        switch (this.FE)
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
        if (this.Fl == null)
          break label276;
        localJSONObject.put("customData", this.Fl);
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
    if (this.Fl == null)
    {
      i = 1;
      label36: if (localMediaTrack.Fl != null)
        break label247;
    }
    label247: for (int j = 1; ; j = 0)
    {
      bool2 = false;
      if (i != j)
        break;
      if ((this.Fl != null) && (localMediaTrack.Fl != null))
      {
        boolean bool8 = jz.d(this.Fl, localMediaTrack.Fl);
        bool2 = false;
        if (!bool8)
          break;
      }
      boolean bool3 = this.Dj < localMediaTrack.Dj;
      bool2 = false;
      if (bool3)
        break;
      int k = this.FD;
      int m = localMediaTrack.FD;
      bool2 = false;
      if (k != m)
        break;
      boolean bool4 = ik.a(this.Fe, localMediaTrack.Fe);
      bool2 = false;
      if (!bool4)
        break;
      boolean bool5 = ik.a(this.Fg, localMediaTrack.Fg);
      bool2 = false;
      if (!bool5)
        break;
      boolean bool6 = ik.a(this.mName, localMediaTrack.mName);
      bool2 = false;
      if (!bool6)
        break;
      boolean bool7 = ik.a(this.Fc, localMediaTrack.Fc);
      bool2 = false;
      if (!bool7)
        break;
      int n = this.FE;
      int i1 = localMediaTrack.FE;
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

  public final long getId()
  {
    return this.Dj;
  }

  public final String getLanguage()
  {
    return this.Fc;
  }

  public final String getName()
  {
    return this.mName;
  }

  public final int getSubtype()
  {
    return this.FE;
  }

  public final int getType()
  {
    return this.FD;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = Long.valueOf(this.Dj);
    arrayOfObject[1] = Integer.valueOf(this.FD);
    arrayOfObject[2] = this.Fe;
    arrayOfObject[3] = this.Fg;
    arrayOfObject[4] = this.mName;
    arrayOfObject[5] = this.Fc;
    arrayOfObject[6] = Integer.valueOf(this.FE);
    arrayOfObject[7] = this.Fl;
    return n.hashCode(arrayOfObject);
  }

  public final void setContentId(String paramString)
  {
    this.Fe = paramString;
  }

  public final void setContentType(String paramString)
  {
    this.Fg = paramString;
  }

  final void setCustomData(JSONObject paramJSONObject)
  {
    this.Fl = paramJSONObject;
  }

  final void setLanguage(String paramString)
  {
    this.Fc = paramString;
  }

  final void setName(String paramString)
  {
    this.mName = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaTrack
 * JD-Core Version:    0.6.2
 */