package android.support.v7.app;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.w;
import textnow.i.a;

final class g
  implements w
{
  private g(ActionBarActivityDelegateBase paramActionBarActivityDelegateBase)
  {
  }

  public final void a(i parami, boolean paramBoolean)
  {
    i locali = parami.q();
    if (locali != parami);
    ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState;
    for (int i = 1; ; i = 0)
    {
      ActionBarActivityDelegateBase localActionBarActivityDelegateBase = this.a;
      if (i != 0)
        parami = locali;
      localPanelFeatureState = ActionBarActivityDelegateBase.a(localActionBarActivityDelegateBase, parami);
      if (localPanelFeatureState != null)
      {
        if (i == 0)
          break;
        ActionBarActivityDelegateBase.a(this.a, localPanelFeatureState.a, localPanelFeatureState, locali);
        ActionBarActivityDelegateBase.a(this.a, localPanelFeatureState, true);
      }
      return;
    }
    this.a.a.closeOptionsMenu();
    ActionBarActivityDelegateBase.a(this.a, localPanelFeatureState, paramBoolean);
  }

  public final boolean a(i parami)
  {
    if ((parami == null) && (this.a.b))
    {
      a locala = this.a.j();
      if ((locala != null) && (!this.a.l()))
        locala.c(8, parami);
    }
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.g
 * JD-Core Version:    0.6.2
 */