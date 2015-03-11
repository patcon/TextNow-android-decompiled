package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public final class b extends c.a
{
  private Fragment Mj;

  private b(Fragment paramFragment)
  {
    this.Mj = paramFragment;
  }

  public static b a(Fragment paramFragment)
  {
    if (paramFragment != null)
      return new b(paramFragment);
    return null;
  }

  public final void c(d paramd)
  {
    View localView = (View)e.e(paramd);
    this.Mj.registerForContextMenu(localView);
  }

  public final void d(d paramd)
  {
    View localView = (View)e.e(paramd);
    this.Mj.unregisterForContextMenu(localView);
  }

  public final d gI()
  {
    return e.h(this.Mj.getActivity());
  }

  public final c gJ()
  {
    return a(this.Mj.getParentFragment());
  }

  public final d gK()
  {
    return e.h(this.Mj.getResources());
  }

  public final c gL()
  {
    return a(this.Mj.getTargetFragment());
  }

  public final Bundle getArguments()
  {
    return this.Mj.getArguments();
  }

  public final int getId()
  {
    return this.Mj.getId();
  }

  public final boolean getRetainInstance()
  {
    return this.Mj.getRetainInstance();
  }

  public final String getTag()
  {
    return this.Mj.getTag();
  }

  public final int getTargetRequestCode()
  {
    return this.Mj.getTargetRequestCode();
  }

  public final boolean getUserVisibleHint()
  {
    return this.Mj.getUserVisibleHint();
  }

  public final d getView()
  {
    return e.h(this.Mj.getView());
  }

  public final boolean isAdded()
  {
    return this.Mj.isAdded();
  }

  public final boolean isDetached()
  {
    return this.Mj.isDetached();
  }

  public final boolean isHidden()
  {
    return this.Mj.isHidden();
  }

  public final boolean isInLayout()
  {
    return this.Mj.isInLayout();
  }

  public final boolean isRemoving()
  {
    return this.Mj.isRemoving();
  }

  public final boolean isResumed()
  {
    return this.Mj.isResumed();
  }

  public final boolean isVisible()
  {
    return this.Mj.isVisible();
  }

  public final void setHasOptionsMenu(boolean paramBoolean)
  {
    this.Mj.setHasOptionsMenu(paramBoolean);
  }

  public final void setMenuVisibility(boolean paramBoolean)
  {
    this.Mj.setMenuVisibility(paramBoolean);
  }

  public final void setRetainInstance(boolean paramBoolean)
  {
    this.Mj.setRetainInstance(paramBoolean);
  }

  public final void setUserVisibleHint(boolean paramBoolean)
  {
    this.Mj.setUserVisibleHint(paramBoolean);
  }

  public final void startActivity(Intent paramIntent)
  {
    this.Mj.startActivity(paramIntent);
  }

  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    this.Mj.startActivityForResult(paramIntent, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.b
 * JD-Core Version:    0.6.2
 */