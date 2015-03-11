package textnow.ai;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import textnow.af.y;
import textnow.ag.b;

final class q<T extends Enum<T>> extends y<T>
{
  private final Map<String, T> a = new HashMap();
  private final Map<T, String> b = new HashMap();

  public q(Class<T> paramClass)
  {
    while (true)
    {
      String str1;
      try
      {
        Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
        int i = arrayOfEnum.length;
        int j = 0;
        if (j < i)
        {
          Enum localEnum = arrayOfEnum[j];
          str1 = localEnum.name();
          b localb = (b)paramClass.getField(str1).getAnnotation(b.class);
          if (localb == null)
            break label135;
          str2 = localb.a();
          this.a.put(str2, localEnum);
          this.b.put(localEnum, str2);
          j++;
          continue;
        }
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        throw new AssertionError();
      }
      return;
      label135: String str2 = str1;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.q
 * JD-Core Version:    0.6.2
 */