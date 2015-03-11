package com.google.android.gms.cast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.jz;
import com.google.android.gms.internal.kc;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle
{
  public static final int COLOR_UNSPECIFIED = 0;
  public static final float DEFAULT_FONT_SCALE = 1.0F;
  public static final int EDGE_TYPE_DEPRESSED = 4;
  public static final int EDGE_TYPE_DROP_SHADOW = 2;
  public static final int EDGE_TYPE_NONE = 0;
  public static final int EDGE_TYPE_OUTLINE = 1;
  public static final int EDGE_TYPE_RAISED = 3;
  public static final int EDGE_TYPE_UNSPECIFIED = -1;
  public static final int FONT_FAMILY_CASUAL = 4;
  public static final int FONT_FAMILY_CURSIVE = 5;
  public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
  public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
  public static final int FONT_FAMILY_SANS_SERIF = 0;
  public static final int FONT_FAMILY_SERIF = 2;
  public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
  public static final int FONT_FAMILY_UNSPECIFIED = -1;
  public static final int FONT_STYLE_BOLD = 1;
  public static final int FONT_STYLE_BOLD_ITALIC = 3;
  public static final int FONT_STYLE_ITALIC = 2;
  public static final int FONT_STYLE_NORMAL = 0;
  public static final int FONT_STYLE_UNSPECIFIED = -1;
  public static final int WINDOW_TYPE_NONE = 0;
  public static final int WINDOW_TYPE_NORMAL = 1;
  public static final int WINDOW_TYPE_ROUNDED = 2;
  public static final int WINDOW_TYPE_UNSPECIFIED = -1;
  private JSONObject Fl;
  private float Gd;
  private int Ge;
  private int Gf;
  private int Gg;
  private int Gh;
  private int Gi;
  private int Gj;
  private String Gk;
  private int Gl;
  private int Gm;
  private int xm;

  public TextTrackStyle()
  {
    clear();
  }

  private int aC(String paramString)
  {
    int i = 0;
    if (paramString != null)
    {
      int j = paramString.length();
      i = 0;
      if (j == 9)
      {
        int k = paramString.charAt(0);
        i = 0;
        if (k != 35);
      }
    }
    try
    {
      int m = Integer.parseInt(paramString.substring(1, 3), 16);
      int n = Integer.parseInt(paramString.substring(3, 5), 16);
      int i1 = Integer.parseInt(paramString.substring(5, 7), 16);
      int i2 = Color.argb(Integer.parseInt(paramString.substring(7, 9), 16), m, n, i1);
      i = i2;
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0;
  }

  private void clear()
  {
    this.Gd = 1.0F;
    this.Ge = 0;
    this.xm = 0;
    this.Gf = -1;
    this.Gg = 0;
    this.Gh = -1;
    this.Gi = 0;
    this.Gj = 0;
    this.Gk = null;
    this.Gl = -1;
    this.Gm = -1;
    this.Fl = null;
  }

  public static TextTrackStyle fromSystemSettings(Context paramContext)
  {
    TextTrackStyle localTextTrackStyle = new TextTrackStyle();
    if (!kc.hH())
      return localTextTrackStyle;
    CaptioningManager localCaptioningManager = (CaptioningManager)paramContext.getSystemService("captioning");
    localTextTrackStyle.Gd = localCaptioningManager.getFontScale();
    CaptioningManager.CaptionStyle localCaptionStyle = localCaptioningManager.getUserStyle();
    localTextTrackStyle.xm = localCaptionStyle.backgroundColor;
    localTextTrackStyle.Ge = localCaptionStyle.foregroundColor;
    Typeface localTypeface;
    label120: boolean bool1;
    boolean bool2;
    switch (localCaptionStyle.edgeType)
    {
    default:
      localTextTrackStyle.setEdgeType(0);
      localTextTrackStyle.Gg = localCaptionStyle.edgeColor;
      localTypeface = localCaptionStyle.getTypeface();
      if (localTypeface != null)
      {
        if (!Typeface.MONOSPACE.equals(localTypeface))
          break label167;
        localTextTrackStyle.setFontGenericFamily(1);
        bool1 = localTypeface.isBold();
        bool2 = localTypeface.isItalic();
        if ((!bool1) || (!bool2))
          break label205;
        localTextTrackStyle.setFontStyle(3);
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      return localTextTrackStyle;
      localTextTrackStyle.setEdgeType(1);
      break;
      localTextTrackStyle.setEdgeType(2);
      break;
      label167: if ((!Typeface.SANS_SERIF.equals(localTypeface)) && (Typeface.SERIF.equals(localTypeface)))
      {
        localTextTrackStyle.setFontGenericFamily(2);
        break label120;
      }
      localTextTrackStyle.setFontGenericFamily(0);
      break label120;
      label205: if (bool1)
        localTextTrackStyle.setFontStyle(1);
      else if (bool2)
        localTextTrackStyle.setFontStyle(2);
      else
        localTextTrackStyle.setFontStyle(0);
    }
  }

  private String t(int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(Color.red(paramInt));
    arrayOfObject[1] = Integer.valueOf(Color.green(paramInt));
    arrayOfObject[2] = Integer.valueOf(Color.blue(paramInt));
    arrayOfObject[3] = Integer.valueOf(Color.alpha(paramInt));
    return String.format("#%02X%02X%02X%02X", arrayOfObject);
  }

  public final JSONObject bK()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("fontScale", this.Gd);
      if (this.Ge != 0)
        localJSONObject.put("foregroundColor", t(this.Ge));
      if (this.xm != 0)
        localJSONObject.put("backgroundColor", t(this.xm));
      switch (this.Gf)
      {
      default:
        if (this.Gg != 0)
          localJSONObject.put("edgeColor", t(this.Gg));
        switch (this.Gh)
        {
        default:
          label156: if (this.Gi != 0)
            localJSONObject.put("windowColor", t(this.Gi));
          if (this.Gh == 2)
            localJSONObject.put("windowRoundedCornerRadius", this.Gj);
          if (this.Gk != null)
            localJSONObject.put("fontFamily", this.Gk);
          switch (this.Gl)
          {
          default:
            label260: switch (this.Gm)
            {
            default:
            case 0:
            case 1:
            case 2:
            case 3:
            }
            break;
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          }
          break;
        case 0:
        case 1:
        case 2:
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        if (this.Fl == null)
          break label574;
        localJSONObject.put("customData", this.Fl);
        return localJSONObject;
        localJSONObject.put("edgeType", "NONE");
        break;
        localJSONObject.put("edgeType", "OUTLINE");
        break;
        localJSONObject.put("edgeType", "DROP_SHADOW");
        break;
        localJSONObject.put("edgeType", "RAISED");
        break;
        localJSONObject.put("edgeType", "DEPRESSED");
        break;
        localJSONObject.put("windowType", "NONE");
        break label156;
        localJSONObject.put("windowType", "NORMAL");
        break label156;
        localJSONObject.put("windowType", "ROUNDED_CORNERS");
        break label156;
        localJSONObject.put("fontGenericFamily", "SANS_SERIF");
        break label260;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
        break label260;
        localJSONObject.put("fontGenericFamily", "SERIF");
        break label260;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
        break label260;
        localJSONObject.put("fontGenericFamily", "CASUAL");
        break label260;
        localJSONObject.put("fontGenericFamily", "CURSIVE");
        break label260;
        localJSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
        break label260;
        localJSONObject.put("fontStyle", "NORMAL");
        continue;
        localJSONObject.put("fontStyle", "BOLD");
        continue;
        localJSONObject.put("fontStyle", "ITALIC");
        continue;
        localJSONObject.put("fontStyle", "BOLD_ITALIC");
      }
      label574: return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
    }
    return localJSONObject;
  }

  public final void c(JSONObject paramJSONObject)
  {
    clear();
    this.Gd = ((float)paramJSONObject.optDouble("fontScale", 1.0D));
    this.Ge = aC(paramJSONObject.optString("foregroundColor"));
    this.xm = aC(paramJSONObject.optString("backgroundColor"));
    String str4;
    String str3;
    label124: String str2;
    label201: String str1;
    if (paramJSONObject.has("edgeType"))
    {
      str4 = paramJSONObject.getString("edgeType");
      if ("NONE".equals(str4))
        this.Gf = 0;
    }
    else
    {
      this.Gg = aC(paramJSONObject.optString("edgeColor"));
      if (paramJSONObject.has("windowType"))
      {
        str3 = paramJSONObject.getString("windowType");
        if (!"NONE".equals(str3))
          break label320;
        this.Gh = 0;
      }
      this.Gi = aC(paramJSONObject.optString("windowColor"));
      if (this.Gh == 2)
        this.Gj = paramJSONObject.optInt("windowRoundedCornerRadius", 0);
      this.Gk = paramJSONObject.optString("fontFamily", null);
      if (paramJSONObject.has("fontGenericFamily"))
      {
        str2 = paramJSONObject.getString("fontGenericFamily");
        if (!"SANS_SERIF".equals(str2))
          break label358;
        this.Gl = 0;
      }
      if (paramJSONObject.has("fontStyle"))
      {
        str1 = paramJSONObject.getString("fontStyle");
        if (!"NORMAL".equals(str1))
          break label467;
        this.Gm = 0;
      }
    }
    while (true)
    {
      this.Fl = paramJSONObject.optJSONObject("customData");
      return;
      if ("OUTLINE".equals(str4))
      {
        this.Gf = 1;
        break;
      }
      if ("DROP_SHADOW".equals(str4))
      {
        this.Gf = 2;
        break;
      }
      if ("RAISED".equals(str4))
      {
        this.Gf = 3;
        break;
      }
      if (!"DEPRESSED".equals(str4))
        break;
      this.Gf = 4;
      break;
      label320: if ("NORMAL".equals(str3))
      {
        this.Gh = 1;
        break label124;
      }
      if (!"ROUNDED_CORNERS".equals(str3))
        break label124;
      this.Gh = 2;
      break label124;
      label358: if ("MONOSPACED_SANS_SERIF".equals(str2))
      {
        this.Gl = 1;
        break label201;
      }
      if ("SERIF".equals(str2))
      {
        this.Gl = 2;
        break label201;
      }
      if ("MONOSPACED_SERIF".equals(str2))
      {
        this.Gl = 3;
        break label201;
      }
      if ("CASUAL".equals(str2))
      {
        this.Gl = 4;
        break label201;
      }
      if ("CURSIVE".equals(str2))
      {
        this.Gl = 5;
        break label201;
      }
      if (!"SMALL_CAPITALS".equals(str2))
        break label201;
      this.Gl = 6;
      break label201;
      label467: if ("BOLD".equals(str1))
        this.Gm = 1;
      else if ("ITALIC".equals(str1))
        this.Gm = 2;
      else if ("BOLD_ITALIC".equals(str1))
        this.Gm = 3;
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
      bool1 = paramObject instanceof TextTrackStyle;
      bool2 = false;
    }
    while (!bool1);
    TextTrackStyle localTextTrackStyle = (TextTrackStyle)paramObject;
    int i;
    if (this.Fl == null)
    {
      i = 1;
      label36: if (localTextTrackStyle.Fl != null)
        break label316;
    }
    label316: for (int j = 1; ; j = 0)
    {
      bool2 = false;
      if (i != j)
        break;
      if ((this.Fl != null) && (localTextTrackStyle.Fl != null))
      {
        boolean bool5 = jz.d(this.Fl, localTextTrackStyle.Fl);
        bool2 = false;
        if (!bool5)
          break;
      }
      boolean bool3 = this.Gd < localTextTrackStyle.Gd;
      bool2 = false;
      if (bool3)
        break;
      int k = this.Ge;
      int m = localTextTrackStyle.Ge;
      bool2 = false;
      if (k != m)
        break;
      int n = this.xm;
      int i1 = localTextTrackStyle.xm;
      bool2 = false;
      if (n != i1)
        break;
      int i2 = this.Gf;
      int i3 = localTextTrackStyle.Gf;
      bool2 = false;
      if (i2 != i3)
        break;
      int i4 = this.Gg;
      int i5 = localTextTrackStyle.Gg;
      bool2 = false;
      if (i4 != i5)
        break;
      int i6 = this.Gh;
      int i7 = localTextTrackStyle.Gh;
      bool2 = false;
      if (i6 != i7)
        break;
      int i8 = this.Gj;
      int i9 = localTextTrackStyle.Gj;
      bool2 = false;
      if (i8 != i9)
        break;
      boolean bool4 = ik.a(this.Gk, localTextTrackStyle.Gk);
      bool2 = false;
      if (!bool4)
        break;
      int i10 = this.Gl;
      int i11 = localTextTrackStyle.Gl;
      bool2 = false;
      if (i10 != i11)
        break;
      int i12 = this.Gm;
      int i13 = localTextTrackStyle.Gm;
      bool2 = false;
      if (i12 != i13)
        break;
      return true;
      i = 0;
      break label36;
    }
  }

  public final int getBackgroundColor()
  {
    return this.xm;
  }

  public final JSONObject getCustomData()
  {
    return this.Fl;
  }

  public final int getEdgeColor()
  {
    return this.Gg;
  }

  public final int getEdgeType()
  {
    return this.Gf;
  }

  public final String getFontFamily()
  {
    return this.Gk;
  }

  public final int getFontGenericFamily()
  {
    return this.Gl;
  }

  public final float getFontScale()
  {
    return this.Gd;
  }

  public final int getFontStyle()
  {
    return this.Gm;
  }

  public final int getForegroundColor()
  {
    return this.Ge;
  }

  public final int getWindowColor()
  {
    return this.Gi;
  }

  public final int getWindowCornerRadius()
  {
    return this.Gj;
  }

  public final int getWindowType()
  {
    return this.Gh;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[12];
    arrayOfObject[0] = Float.valueOf(this.Gd);
    arrayOfObject[1] = Integer.valueOf(this.Ge);
    arrayOfObject[2] = Integer.valueOf(this.xm);
    arrayOfObject[3] = Integer.valueOf(this.Gf);
    arrayOfObject[4] = Integer.valueOf(this.Gg);
    arrayOfObject[5] = Integer.valueOf(this.Gh);
    arrayOfObject[6] = Integer.valueOf(this.Gi);
    arrayOfObject[7] = Integer.valueOf(this.Gj);
    arrayOfObject[8] = this.Gk;
    arrayOfObject[9] = Integer.valueOf(this.Gl);
    arrayOfObject[10] = Integer.valueOf(this.Gm);
    arrayOfObject[11] = this.Fl;
    return n.hashCode(arrayOfObject);
  }

  public final void setBackgroundColor(int paramInt)
  {
    this.xm = paramInt;
  }

  public final void setCustomData(JSONObject paramJSONObject)
  {
    this.Fl = paramJSONObject;
  }

  public final void setEdgeColor(int paramInt)
  {
    this.Gg = paramInt;
  }

  public final void setEdgeType(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 4))
      throw new IllegalArgumentException("invalid edgeType");
    this.Gf = paramInt;
  }

  public final void setFontFamily(String paramString)
  {
    this.Gk = paramString;
  }

  public final void setFontGenericFamily(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 6))
      throw new IllegalArgumentException("invalid fontGenericFamily");
    this.Gl = paramInt;
  }

  public final void setFontScale(float paramFloat)
  {
    this.Gd = paramFloat;
  }

  public final void setFontStyle(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 3))
      throw new IllegalArgumentException("invalid fontStyle");
    this.Gm = paramInt;
  }

  public final void setForegroundColor(int paramInt)
  {
    this.Ge = paramInt;
  }

  public final void setWindowColor(int paramInt)
  {
    this.Gi = paramInt;
  }

  public final void setWindowCornerRadius(int paramInt)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("invalid windowCornerRadius");
    this.Gj = paramInt;
  }

  public final void setWindowType(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2))
      throw new IllegalArgumentException("invalid windowType");
    this.Gh = paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.TextTrackStyle
 * JD-Core Version:    0.6.2
 */