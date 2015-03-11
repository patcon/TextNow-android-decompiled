package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public final class b extends c.a
{
  private Fragment Sj;

  private b(Fragment paramFragment)
  {
    this.Sj = paramFragment;
  }

  public static b a(Fragment paramFragment)
  {
    if (paramFragment != null)
      return new b(paramFragment);
    return null;
  }

  public final void d(d paramd)
  {
    View localView = (View)e.f(paramd);
    this.Sj.registerForContextMenu(localView);
  }

  public final void e(d paramd)
  {
    View localView = (View)e.f(paramd);
    this.Sj.unregisterForContextMenu(localView);
  }

  public final Bundle getArguments()
  {
    return this.Sj.getArguments();
  }

  public final int getId()
  {
    return this.Sj.getId();
  }

  public final boolean getRetainInstance()
  {
    return this.Sj.getRetainInstance();
  }

  public final String getTag()
  {
    return this.Sj.getTag();
  }

  public final int getTargetRequestCode()
  {
    return this.Sj.getTargetRequestCode();
  }

  public final boolean getUserVisibleHint()
  {
    return this.Sj.getUserVisibleHint();
  }

  public final d getView()
  {
    return e.k(this.Sj.getView());
  }

  public final boolean isAdded()
  {
    return this.Sj.isAdded();
  }

  public final boolean isDetached()
  {
    return this.Sj.isDetached();
  }

  public final boolean isHidden()
  {
    return this.Sj.isHidden();
  }

  public final boolean isInLayout()
  {
    return this.Sj.isInLayout();
  }

  public final boolean isRemoving()
  {
    return this.Sj.isRemoving();
  }

  public final boolean isResumed()
  {
    return this.Sj.isResumed();
  }

  public final boolean isVisible()
  {
    return this.Sj.isVisible();
  }

  public final d iu()
  {
    return e.k(this.Sj.getActivity());
  }

  public final c iv()
  {
    return a(this.Sj.getParentFragment());
  }

  public final d iw()
  {
    return e.k(this.Sj.getResources());
  }

  public final c ix()
  {
    return a(this.Sj.getTargetFragment());
  }

  public final void setHasOptionsMenu(boolean paramBoolean)
  {
    this.Sj.setHasOptionsMenu(paramBoolean);
  }

  public final void setMenuVisibility(boolean paramBoolean)
  {
    this.Sj.setMenuVisibility(paramBoolean);
  }

  public final void setRetainInstance(boolean paramBoolean)
  {
    this.Sj.setRetainInstance(paramBoolean);
  }

  public final void setUserVisibleHint(boolean paramBoolean)
  {
    this.Sj.setUserVisibleHint(paramBoolean);
  }

  public final void startActivity(Intent paramIntent)
  {
    this.Sj.startActivity(paramIntent);
  }

  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    this.Sj.startActivityForResult(paramIntent, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.b
 * JD-Core Version:    0.6.2
 */