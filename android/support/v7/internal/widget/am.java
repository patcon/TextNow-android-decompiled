package android.support.v7.internal.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import textnow.e.e;

final class am extends e<Integer, PorterDuffColorFilter>
{
  public am(int paramInt)
  {
    super(6);
  }

  private static int b(int paramInt, PorterDuff.Mode paramMode)
  {
    return 31 * (paramInt + 31) + paramMode.hashCode();
  }

  final PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    return (PorterDuffColorFilter)get(Integer.valueOf(b(paramInt, paramMode)));
  }

  final PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
  {
    return (PorterDuffColorFilter)put(Integer.valueOf(b(paramInt, paramMode)), paramPorterDuffColorFilter);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.am
 * JD-Core Version:    0.6.2
 */