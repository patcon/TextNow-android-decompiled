package textnow.aj;

import java.lang.reflect.Type;
import java.util.Map;
import textnow.ag.e;
import textnow.ag.s;
import textnow.ai.q;

final class h<K, V> extends s<Map<K, V>>
{
  private final s<K> b;
  private final s<V> c;
  private final q<? extends Map<K, V>> d;

  public h(e parame, Type paramType1, s<K> params, Type paramType2, s<V> params1, q<? extends Map<K, V>> paramq)
  {
    this.b = new o(paramType1, paramType2, params);
    this.c = new o(paramType1, paramq, params1);
    Object localObject;
    this.d = localObject;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.aj.h
 * JD-Core Version:    0.6.2
 */