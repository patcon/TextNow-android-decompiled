package com.facebook.widget;

public enum LikeView$HorizontalAlignment
{
  static HorizontalAlignment DEFAULT = CENTER;
  private int intValue;
  private String stringValue;

  static
  {
    HorizontalAlignment[] arrayOfHorizontalAlignment = new HorizontalAlignment[3];
    arrayOfHorizontalAlignment[0] = CENTER;
    arrayOfHorizontalAlignment[1] = LEFT;
    arrayOfHorizontalAlignment[2] = RIGHT;
  }

  private LikeView$HorizontalAlignment(String paramString, int paramInt)
  {
    this.stringValue = paramString;
    this.intValue = paramInt;
  }

  static HorizontalAlignment fromInt(int paramInt)
  {
    for (HorizontalAlignment localHorizontalAlignment : values())
      if (localHorizontalAlignment.getValue() == paramInt)
        return localHorizontalAlignment;
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
 * Qualified Name:     com.facebook.widget.LikeView.HorizontalAlignment
 * JD-Core Version:    0.6.2
 */