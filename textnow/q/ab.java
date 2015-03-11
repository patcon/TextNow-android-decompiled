package textnow.q;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

public final class ab
{
  public static int a(Context paramContext, int paramInt)
  {
    if (paramInt == 0)
      return 2130837599;
    if (a(paramInt))
    {
      TypedArray localTypedArray2 = paramContext.getResources().obtainTypedArray(2131623942);
      int j = localTypedArray2.getResourceId(paramInt - 1, 2131296333);
      localTypedArray2.recycle();
      return j;
    }
    TypedArray localTypedArray1 = paramContext.getResources().obtainTypedArray(2131623943);
    int i = localTypedArray1.getResourceId(paramInt - 101, 2131296331);
    localTypedArray1.recycle();
    return i;
  }

  public static boolean a(int paramInt)
  {
    return (paramInt > 0) && (paramInt < 100);
  }

  public static String b(Context paramContext, int paramInt)
  {
    String[] arrayOfString = paramContext.getResources().getStringArray(2131623951);
    if (paramInt == 0)
      return arrayOfString[(-1 + arrayOfString.length)];
    if (a(paramInt))
      return arrayOfString[(paramInt - 1)];
    return arrayOfString[(paramInt - 101)];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.q.ab
 * JD-Core Version:    0.6.2
 */