package android.support.v7.internal.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class j
{
  public final ComponentName a;
  public final long b;
  public final float c;

  public j(ComponentName paramComponentName, long paramLong, float paramFloat)
  {
    this.a = paramComponentName;
    this.b = paramLong;
    this.c = paramFloat;
  }

  public j(String paramString, long paramLong, float paramFloat)
  {
    this(ComponentName.unflattenFromString(paramString), paramLong, paramFloat);
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    j localj;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
      localj = (j)paramObject;
      if (this.a == null)
      {
        if (localj.a != null)
          return false;
      }
      else if (!this.a.equals(localj.a))
        return false;
      if (this.b != localj.b)
        return false;
    }
    while (Float.floatToIntBits(this.c) == Float.floatToIntBits(localj.c));
    return false;
  }

  public final int hashCode()
  {
    if (this.a == null);
    for (int i = 0; ; i = this.a.hashCode())
      return 31 * (31 * (i + 31) + (int)(this.b ^ this.b >>> 32)) + Float.floatToIntBits(this.c);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("; activity:").append(this.a);
    localStringBuilder.append("; time:").append(this.b);
    localStringBuilder.append("; weight:").append(new BigDecimal(this.c));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.j
 * JD-Core Version:    0.6.2
 */