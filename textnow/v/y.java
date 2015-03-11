package textnow.v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import textnow.z.u;

public final class y
{
  public static int a(Context paramContext, int paramInt)
  {
    if (paramInt == 0)
      return 2131362079;
    if (a(paramInt))
    {
      TypedArray localTypedArray2 = paramContext.getResources().obtainTypedArray(2131623940);
      int j = localTypedArray2.getResourceId(paramInt - 1, 2131362080);
      localTypedArray2.recycle();
      return j;
    }
    TypedArray localTypedArray1 = paramContext.getResources().obtainTypedArray(2131623941);
    int i = localTypedArray1.getResourceId(paramInt - 101, 2131362079);
    localTypedArray1.recycle();
    return i;
  }

  public static boolean a(int paramInt)
  {
    return (paramInt > 0) && (paramInt < 100);
  }

  public static int b(Context paramContext, int paramInt)
  {
    int i = new u(paramContext).ab().intValue();
    TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(a(paramContext, i), new int[] { paramInt });
    int j = localTypedArray.getResourceId(0, 2131230803);
    localTypedArray.recycle();
    return paramContext.getResources().getColor(j);
  }

  public static String c(Context paramContext, int paramInt)
  {
    String[] arrayOfString = paramContext.getResources().getStringArray(2131623951);
    if (paramInt == 0)
      return arrayOfString[(-1 + arrayOfString.length)];
    if (a(paramInt))
      return arrayOfString[(paramInt - 1)];
    return arrayOfString[(paramInt - 101)];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.y
 * JD-Core Version:    0.6.2
 */