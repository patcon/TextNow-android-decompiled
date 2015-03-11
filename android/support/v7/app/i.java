package android.support.v7.app;

import android.os.Bundle;
import android.view.Window;

final class i extends f
{
  i(d paramd)
  {
    super(paramd);
  }

  public final ActionBar a()
  {
    l();
    return new o(this.a, this.a);
  }

  final void a(Bundle paramBundle)
  {
    this.a.getWindow().requestFeature(10);
    super.a(paramBundle);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.app.i
 * JD-Core Version:    0.6.2
 */