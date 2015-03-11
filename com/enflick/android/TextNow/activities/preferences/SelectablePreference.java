package com.enflick.android.TextNow.activities.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import textnow.q.ad;

public class SelectablePreference extends Preference
{
  private ImageView a;
  private boolean b = false;

  public SelectablePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void a(int paramInt)
  {
    if (this.a != null)
    {
      this.a.setVisibility(paramInt);
      if (paramInt != 0)
        break label27;
    }
    label27: for (boolean bool = true; ; bool = false)
    {
      this.b = bool;
      return;
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    if (ad.b(getContext()));
    for (ImageView localImageView = (ImageView)localView.findViewById(2131165648); ; localImageView = null)
    {
      this.a = localImageView;
      if (!this.b)
        break;
      a(0);
      return localView;
    }
    a(8);
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.SelectablePreference
 * JD-Core Version:    0.6.2
 */