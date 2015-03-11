package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

public final class h extends c.a
{
  private Fragment FV;

  private h(Fragment paramFragment)
  {
    this.FV = paramFragment;
  }

  public static h a(Fragment paramFragment)
  {
    if (paramFragment != null)
      return new h(paramFragment);
    return null;
  }

  public final void c(d paramd)
  {
    View localView = (View)e.e(paramd);
    this.FV.registerForContextMenu(localView);
  }

  public final void d(d paramd)
  {
    View localView = (View)e.e(paramd);
    this.FV.unregisterForContextMenu(localView);
  }

  public final d gI()
  {
    return e.h(this.FV.getActivity());
  }

  public final c gJ()
  {
    return a(this.FV.getParentFragment());
  }

  public final d gK()
  {
    return e.h(this.FV.getResources());
  }

  public final c gL()
  {
    return a(this.FV.getTargetFragment());
  }

  public final Bundle getArguments()
  {
    return this.FV.getArguments();
  }

  public final int getId()
  {
    return this.FV.getId();
  }

  public final boolean getRetainInstance()
  {
    return this.FV.getRetainInstance();
  }

  public final String getTag()
  {
    return this.FV.getTag();
  }

  public final int getTargetRequestCode()
  {
    return this.FV.getTargetRequestCode();
  }

  public final boolean getUserVisibleHint()
  {
    return this.FV.getUserVisibleHint();
  }

  public final d getView()
  {
    return e.h(this.FV.getView());
  }

  public final boolean isAdded()
  {
    return this.FV.isAdded();
  }

  public final boolean isDetached()
  {
    return this.FV.isDetached();
  }

  public final boolean isHidden()
  {
    return this.FV.isHidden();
  }

  public final boolean isInLayout()
  {
    return this.FV.isInLayout();
  }

  public final boolean isRemoving()
  {
    return this.FV.isRemoving();
  }

  public final boolean isResumed()
  {
    return this.FV.isResumed();
  }

  public final boolean isVisible()
  {
    return this.FV.isVisible();
  }

  public final void setHasOptionsMenu(boolean paramBoolean)
  {
    this.FV.setHasOptionsMenu(paramBoolean);
  }

  public final void setMenuVisibility(boolean paramBoolean)
  {
    this.FV.setMenuVisibility(paramBoolean);
  }

  public final void setRetainInstance(boolean paramBoolean)
  {
    this.FV.setRetainInstance(paramBoolean);
  }

  public final void setUserVisibleHint(boolean paramBoolean)
  {
    this.FV.setUserVisibleHint(paramBoolean);
  }

  public final void startActivity(Intent paramIntent)
  {
    this.FV.startActivity(paramIntent);
  }

  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    this.FV.startActivityForResult(paramIntent, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.h
 * JD-Core Version:    0.6.2
 */