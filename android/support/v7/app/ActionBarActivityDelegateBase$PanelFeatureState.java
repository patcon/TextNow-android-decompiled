package android.support.v7.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.i;
import android.view.View;
import android.view.ViewGroup;

final class ActionBarActivityDelegateBase$PanelFeatureState
{
  int a;
  ViewGroup b;
  View c;
  i d;
  g e;
  Context f;
  boolean g;
  boolean h;
  boolean i;
  public boolean j;
  boolean k;
  boolean l;
  Bundle m;

  ActionBarActivityDelegateBase$PanelFeatureState(int paramInt)
  {
    this.a = paramInt;
    this.k = false;
  }

  final void a(i parami)
  {
    if (parami == this.d);
    do
    {
      return;
      if (this.d != null)
        this.d.b(this.e);
      this.d = parami;
    }
    while ((parami == null) || (this.e == null));
    parami.a(this.e);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateBase.PanelFeatureState
 * JD-Core Version:    0.6.2
 */