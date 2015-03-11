package textnow.ai;

import java.lang.reflect.Type;
import java.util.Map;
import textnow.af.f;
import textnow.af.y;

final class h<K, V> extends y<Map<K, V>>
{
  private final y<K> b;
  private final y<V> c;
  private final textnow.ah.o<? extends Map<K, V>> d;

  public h(f paramf, Type paramType1, y<K> paramy, Type paramType2, y<V> paramy1, textnow.ah.o<? extends Map<K, V>> paramo)
  {
    this.b = new o(paramType1, paramType2, paramy);
    this.c = new o(paramType1, paramo, paramy1);
    Object localObject;
    this.d = localObject;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.h
 * JD-Core Version:    0.6.2
 */