package textnow.x;

import android.content.Context;
import com.enflick.android.TextNow.thirdparty.VesselWrapper.TestLoadedListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import textnow.u.n;

public final class a
{
  private static n a;
  private static Set<String> b = Collections.synchronizedSet(new HashSet());
  private static List<VesselWrapper.TestLoadedListener> c = Collections.synchronizedList(new ArrayList());
  private static Set<String> d = Collections.synchronizedSet(new HashSet());

  public static void a(Context paramContext)
  {
    a = new n(paramContext);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.x.a
 * JD-Core Version:    0.6.2
 */