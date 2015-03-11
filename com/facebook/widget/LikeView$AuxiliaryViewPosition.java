package com.facebook.widget;

public enum LikeView$AuxiliaryViewPosition
{
  static AuxiliaryViewPosition DEFAULT = BOTTOM;
  private int intValue;
  private String stringValue;

  static
  {
    AuxiliaryViewPosition[] arrayOfAuxiliaryViewPosition = new AuxiliaryViewPosition[3];
    arrayOfAuxiliaryViewPosition[0] = BOTTOM;
    arrayOfAuxiliaryViewPosition[1] = INLINE;
    arrayOfAuxiliaryViewPosition[2] = TOP;
  }

  private LikeView$AuxiliaryViewPosition(String paramString, int paramInt)
  {
    this.stringValue = paramString;
    this.intValue = paramInt;
  }

  static AuxiliaryViewPosition fromInt(int paramInt)
  {
    for (AuxiliaryViewPosition localAuxiliaryViewPosition : values())
      if (localAuxiliaryViewPosition.getValue() == paramInt)
        return localAuxiliaryViewPosition;
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
 * Qualified Name:     com.facebook.widget.LikeView.AuxiliaryViewPosition
 * JD-Core Version:    0.6.2
 */