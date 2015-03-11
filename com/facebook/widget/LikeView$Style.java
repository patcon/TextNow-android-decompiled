package com.facebook.widget;

public enum LikeView$Style
{
  static Style DEFAULT = STANDARD;
  private int intValue;
  private String stringValue;

  static
  {
    BUTTON = new Style("BUTTON", 1, "button", 1);
    BOX_COUNT = new Style("BOX_COUNT", 2, "box_count", 2);
    Style[] arrayOfStyle = new Style[3];
    arrayOfStyle[0] = STANDARD;
    arrayOfStyle[1] = BUTTON;
    arrayOfStyle[2] = BOX_COUNT;
  }

  private LikeView$Style(String paramString, int paramInt)
  {
    this.stringValue = paramString;
    this.intValue = paramInt;
  }

  static Style fromInt(int paramInt)
  {
    for (Style localStyle : values())
      if (localStyle.getValue() == paramInt)
        return localStyle;
    return null;
  }

  private int getValue()
  {
    return this.intValue;
  }

  public final String toString()
  {
    return this.stringValue;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.widget.LikeView.Style
 * JD-Core Version:    0.6.2
 */