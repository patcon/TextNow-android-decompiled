package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

public final class h extends c.a
{
  private Fragment Lt;

  private h(Fragment paramFragment)
  {
    this.Lt = paramFragment;
  }

  public static h a(Fragment paramFragment)
  {
    if (paramFragment != null)
      return new h(paramFragment);
    return null;
  }

  public final void d(d paramd)
  {
    View localView = (View)e.f(paramd);
    this.Lt.registerForContextMenu(localView);
  }

  public final void e(d paramd)
  {
    View localView = (View)e.f(paramd);
    this.Lt.unregisterForContextMenu(localView);
  }

  public final Bundle getArguments()
  {
    return this.Lt.getArguments();
  }

  public final int getId()
  {
    return this.Lt.getId();
  }

  public final boolean getRetainInstance()
  {
    return this.Lt.getRetainInstance();
  }

  public final String getTag()
  {
    return this.Lt.getTag();
  }

  public final int getTargetRequestCode()
  {
    return this.Lt.getTargetRequestCode();
  }

  public final boolean getUserVisibleHint()
  {
    return this.Lt.getUserVisibleHint();
  }

  public final d getView()
  {
    return e.k(this.Lt.getView());
  }

  public final boolean isAdded()
  {
    return this.Lt.isAdded();
  }

  public final boolean isDetached()
  {
    return this.Lt.isDetached();
  }

  public final boolean isHidden()
  {
    return this.Lt.isHidden();
  }

  public final boolean isInLayout()
  {
    return this.Lt.isInLayout();
  }

  public final boolean isRemoving()
  {
    return this.Lt.isRemoving();
  }

  public final boolean isResumed()
  {
    return this.Lt.isResumed();
  }

  public final boolean isVisible()
  {
    return this.Lt.isVisible();
  }

  public final d iu()
  {
    return e.k(this.Lt.getActivity());
  }

  public final c iv()
  {
    return a(this.Lt.getParentFragment());
  }

  public final d iw()
  {
    return e.k(this.Lt.getResources());
  }

  public final c ix()
  {
    return a(this.Lt.getTargetFragment());
  }

  public final void setHasOptionsMenu(boolean paramBoolean)
  {
    this.Lt.setHasOptionsMenu(paramBoolean);
  }

  public final void setMenuVisibility(boolean paramBoolean)
  {
    this.Lt.setMenuVisibility(paramBoolean);
  }

  public final void setRetainInstance(boolean paramBoolean)
  {
    this.Lt.setRetainInstance(paramBoolean);
  }

  public final void setUserVisibleHint(boolean paramBoolean)
  {
    this.Lt.setUserVisibleHint(paramBoolean);
  }

  public final void startActivity(Intent paramIntent)
  {
    this.Lt.startActivity(paramIntent);
  }

  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    this.Lt.startActivityForResult(paramIntent, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.h
 * JD-Core Version:    0.6.2
 */