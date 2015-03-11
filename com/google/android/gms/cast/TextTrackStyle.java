package com.google.android.gms.cast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.ip;
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
  private JSONObject AA;
  private int BA;
  private int BB;
  private float Bs;
  private int Bt;
  private int Bu;
  private int Bv;
  private int Bw;
  private int Bx;
  private int By;
  private String Bz;
  private int td;

  public TextTrackStyle()
  {
    clear();
  }

  private int ah(String paramString)
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
    this.Bs = 1.0F;
    this.Bt = 0;
    this.td = 0;
    this.Bu = -1;
    this.Bv = 0;
    this.Bw = -1;
    this.Bx = 0;
    this.By = 0;
    this.Bz = null;
    this.BA = -1;
    this.BB = -1;
    this.AA = null;
  }

  public static TextTrackStyle fromSystemSettings(Context paramContext)
  {
    TextTrackStyle localTextTrackStyle = new TextTrackStyle();
    if (!ip.gi())
      return localTextTrackStyle;
    CaptioningManager localCaptioningManager = (CaptioningManager)paramContext.getSystemService("captioning");
    localTextTrackStyle.Bs = localCaptioningManager.getFontScale();
    CaptioningManager.CaptionStyle localCaptionStyle = localCaptioningManager.getUserStyle();
    localTextTrackStyle.td = localCaptionStyle.backgroundColor;
    localTextTrackStyle.Bt = localCaptionStyle.foregroundColor;
    Typeface localTypeface;
    label120: boolean bool1;
    boolean bool2;
    switch (localCaptionStyle.edgeType)
    {
    default:
      localTextTrackStyle.setEdgeType(0);
      localTextTrackStyle.Bv = localCaptionStyle.edgeColor;
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

  private String o(int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(Color.red(paramInt));
    arrayOfObject[1] = Integer.valueOf(Color.green(paramInt));
    arrayOfObject[2] = Integer.valueOf(Color.blue(paramInt));
    arrayOfObject[3] = Integer.valueOf(Color.alpha(paramInt));
    return String.format("#%02X%02X%02X%02X", arrayOfObject);
  }

  public final void b(JSONObject paramJSONObject)
  {
    clear();
    this.Bs = ((float)paramJSONObject.optDouble("fontScale", 1.0D));
    this.Bt = ah(paramJSONObject.optString("foregroundColor"));
    this.td = ah(paramJSONObject.optString("backgroundColor"));
    String str4;
    String str3;
    label122: String str2;
    label200: String str1;
    if (paramJSONObject.has("edgeType"))
    {
      str4 = paramJSONObject.getString("edgeType");
      if ("NONE".equals(str4))
        this.Bu = 0;
    }
    else
    {
      this.Bv = ah(paramJSONObject.optString("edgeColor"));
      if (paramJSONObject.has("windowType"))
      {
        str3 = paramJSONObject.getString("windowType");
        if (!"NONE".equals(str3))
          break label321;
        this.Bw = 0;
      }
      this.Bx = ah(paramJSONObject.optString("windowColor"));
      if (this.Bw == 2)
        this.By = paramJSONObject.optInt("windowRoundedCornerRadius", 0);
      this.Bz = paramJSONObject.optString("fontFamily", null);
      if (paramJSONObject.has("fontGenericFamily"))
      {
        str2 = paramJSONObject.getString("fontGenericFamily");
        if (!"SANS_SERIF".equals(str2))
          break label359;
        this.BA = 0;
      }
      if (paramJSONObject.has("fontStyle"))
      {
        str1 = paramJSONObject.getString("fontStyle");
        if (!"NORMAL".equals(str1))
          break label468;
        this.BB = 0;
      }
    }
    while (true)
    {
      this.AA = paramJSONObject.optJSONObject("customData");
      return;
      if ("OUTLINE".equals(str4))
      {
        this.Bu = 1;
        break;
      }
      if ("DROP_SHADOW".equals(str4))
      {
        this.Bu = 2;
        break;
      }
      if ("RAISED".equals(str4))
      {
        this.Bu = 3;
        break;
      }
      if (!"DEPRESSED".equals(str4))
        break;
      this.Bu = 4;
      break;
      label321: if ("NORMAL".equals(str3))
      {
        this.Bw = 1;
        break label122;
      }
      if (!"ROUNDED_CORNERS".equals(str3))
        break label122;
      this.Bw = 2;
      break label122;
      label359: if ("MONOSPACED_SANS_SERIF".equals(str2))
      {
        this.BA = 1;
        break label200;
      }
      if ("SERIF".equals(str2))
      {
        this.BA = 2;
        break label200;
      }
      if ("MONOSPACED_SERIF".equals(str2))
      {
        this.BA = 3;
        break label200;
      }
      if ("CASUAL".equals(str2))
      {
        this.BA = 4;
        break label200;
      }
      if ("CURSIVE".equals(str2))
      {
        this.BA = 5;
        break label200;
      }
      if (!"SMALL_CAPITALS".equals(str2))
        break label200;
      this.BA = 6;
      break label200;
      label468: if ("BOLD".equals(str1))
        this.BB = 1;
      else if ("ITALIC".equals(str1))
        this.BB = 2;
      else if ("BOLD_ITALIC".equals(str1))
        this.BB = 3;
    }
  }

  public final JSONObject dZ()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("fontScale", this.Bs);
      if (this.Bt != 0)
        localJSONObject.put("foregroundColor", o(this.Bt));
      if (this.td != 0)
        localJSONObject.put("backgroundColor", o(this.td));
      switch (this.Bu)
      {
      default:
        if (this.Bv != 0)
          localJSONObject.put("edgeColor", o(this.Bv));
        switch (this.Bw)
        {
        default:
          label156: if (this.Bx != 0)
            localJSONObject.put("windowColor", o(this.Bx));
          if (this.Bw == 2)
            localJSONObject.put("windowRoundedCornerRadius", this.By);
          if (this.Bz != null)
            localJSONObject.put("fontFamily", this.Bz);
          switch (this.BA)
          {
          default:
            label264: switch (this.BB)
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
        if (this.AA == null)
          break label577;
        localJSONObject.put("customData", this.AA);
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
        break label264;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "CASUAL");
        break label264;
        localJSONObject.put("fontGenericFamily", "CURSIVE");
        break label264;
        localJSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
        break label264;
        localJSONObject.put("fontStyle", "NORMAL");
        continue;
        localJSONObject.put("fontStyle", "BOLD");
        continue;
        localJSONObject.put("fontStyle", "ITALIC");
        continue;
        localJSONObject.put("fontStyle", "BOLD_ITALIC");
      }
      label577: return localJSONObject;
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
      bool1 = paramObject instanceof TextTrackStyle;
      bool2 = false;
    }
    while (!bool1);
    TextTrackStyle localTextTrackStyle = (TextTrackStyle)paramObject;
    int i;
    if (this.AA == null)
    {
      i = 1;
      label36: if (localTextTrackStyle.AA != null)
        break label316;
    }
    label316: for (int j = 1; ; j = 0)
    {
      bool2 = false;
      if (i != j)
        break;
      if ((this.AA != null) && (localTextTrackStyle.AA != null))
      {
        boolean bool5 = in.d(this.AA, localTextTrackStyle.AA);
        bool2 = false;
        if (!bool5)
          break;
      }
      boolean bool3 = this.Bs < localTextTrackStyle.Bs;
      bool2 = false;
      if (bool3)
        break;
      int k = this.Bt;
      int m = localTextTrackStyle.Bt;
      bool2 = false;
      if (k != m)
        break;
      int n = this.td;
      int i1 = localTextTrackStyle.td;
      bool2 = false;
      if (n != i1)
        break;
      int i2 = this.Bu;
      int i3 = localTextTrackStyle.Bu;
      bool2 = false;
      if (i2 != i3)
        break;
      int i4 = this.Bv;
      int i5 = localTextTrackStyle.Bv;
      bool2 = false;
      if (i4 != i5)
        break;
      int i6 = this.Bw;
      int i7 = localTextTrackStyle.Bw;
      bool2 = false;
      if (i6 != i7)
        break;
      int i8 = this.By;
      int i9 = localTextTrackStyle.By;
      bool2 = false;
      if (i8 != i9)
        break;
      boolean bool4 = gi.a(this.Bz, localTextTrackStyle.Bz);
      bool2 = false;
      if (!bool4)
        break;
      int i10 = this.BA;
      int i11 = localTextTrackStyle.BA;
      bool2 = false;
      if (i10 != i11)
        break;
      int i12 = this.BB;
      int i13 = localTextTrackStyle.BB;
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
    return this.td;
  }

  public final JSONObject getCustomData()
  {
    return this.AA;
  }

  public final int getEdgeColor()
  {
    return this.Bv;
  }

  public final int getEdgeType()
  {
    return this.Bu;
  }

  public final String getFontFamily()
  {
    return this.Bz;
  }

  public final int getFontGenericFamily()
  {
    return this.BA;
  }

  public final float getFontScale()
  {
    return this.Bs;
  }

  public final int getFontStyle()
  {
    return this.BB;
  }

  public final int getForegroundColor()
  {
    return this.Bt;
  }

  public final int getWindowColor()
  {
    return this.Bx;
  }

  public final int getWindowCornerRadius()
  {
    return this.By;
  }

  public final int getWindowType()
  {
    return this.Bw;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[12];
    arrayOfObject[0] = Float.valueOf(this.Bs);
    arrayOfObject[1] = Integer.valueOf(this.Bt);
    arrayOfObject[2] = Integer.valueOf(this.td);
    arrayOfObject[3] = Integer.valueOf(this.Bu);
    arrayOfObject[4] = Integer.valueOf(this.Bv);
    arrayOfObject[5] = Integer.valueOf(this.Bw);
    arrayOfObject[6] = Integer.valueOf(this.Bx);
    arrayOfObject[7] = Integer.valueOf(this.By);
    arrayOfObject[8] = this.Bz;
    arrayOfObject[9] = Integer.valueOf(this.BA);
    arrayOfObject[10] = Integer.valueOf(this.BB);
    arrayOfObject[11] = this.AA;
    return hk.hashCode(arrayOfObject);
  }

  public final void setBackgroundColor(int paramInt)
  {
    this.td = paramInt;
  }

  public final void setCustomData(JSONObject paramJSONObject)
  {
    this.AA = paramJSONObject;
  }

  public final void setEdgeColor(int paramInt)
  {
    this.Bv = paramInt;
  }

  public final void setEdgeType(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 4))
      throw new IllegalArgumentException("invalid edgeType");
    this.Bu = paramInt;
  }

  public final void setFontFamily(String paramString)
  {
    this.Bz = paramString;
  }

  public final void setFontGenericFamily(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 6))
      throw new IllegalArgumentException("invalid fontGenericFamily");
    this.BA = paramInt;
  }

  public final void setFontScale(float paramFloat)
  {
    this.Bs = paramFloat;
  }

  public final void setFontStyle(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 3))
      throw new IllegalArgumentException("invalid fontStyle");
    this.BB = paramInt;
  }

  public final void setForegroundColor(int paramInt)
  {
    this.Bt = paramInt;
  }

  public final void setWindowColor(int paramInt)
  {
    this.Bx = paramInt;
  }

  public final void setWindowCornerRadius(int paramInt)
  {
    if (paramInt < 0)
      throw new IllegalArgumentException("invalid windowCornerRadius");
    this.By = paramInt;
  }

  public final void setWindowType(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2))
      throw new IllegalArgumentException("invalid windowType");
    this.Bw = paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.TextTrackStyle
 * JD-Core Version:    0.6.2
 */