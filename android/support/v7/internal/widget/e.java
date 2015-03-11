package android.support.v7.internal.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class e
  implements Comparable<e>
{
  public final ResolveInfo a;
  public float b;

  public e(d paramd, ResolveInfo paramResolveInfo)
  {
    this.a = paramResolveInfo;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    e locale;
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (getClass() != paramObject.getClass())
        return false;
      locale = (e)paramObject;
    }
    while (Float.floatToIntBits(this.b) == Float.floatToIntBits(locale.b));
    return false;
  }

  public final int hashCode()
  {
    return 31 + Float.floatToIntBits(this.b);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append("resolveInfo:").append(this.a.toString());
    localStringBuilder.append("; weight:").append(new BigDecimal(this.b));
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.e
 * JD-Core Version:    0.6.2
 */