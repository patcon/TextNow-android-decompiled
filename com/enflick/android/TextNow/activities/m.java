package com.enflick.android.TextNow.activities;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.i;
import android.support.v4.app.k;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bz;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.enflick.android.TextNow.views.PageIndicator;
import com.enflick.android.TextNow.views.o;
import textnow.av.a;

public final class m extends i
  implements bz, View.OnClickListener
{
  private ao a;
  private String b;
  private String c;
  private TextView d;
  private ViewPager e;
  private PageIndicator f;
  private n g;
  private boolean h = false;

  public static m a()
  {
    return new m();
  }

  public final void a(int paramInt)
  {
    this.f.d(paramInt);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    double d1;
    if (((paramInt1 == 1) && (paramFloat > 0.0F)) || ((paramInt1 == 2) && (paramFloat < 0.0F)))
    {
      TextView localTextView = this.d;
      if (paramFloat <= 0.5D)
      {
        d1 = 1.0F - 2.0F * paramFloat;
        a.a(localTextView, (float)d1);
      }
    }
    else if (paramInt1 == 1)
    {
      if ((paramFloat < 0.5D) || (this.h))
        break label106;
      this.d.setText(this.c);
      this.h = true;
    }
    label106: 
    while ((paramFloat >= 0.5D) || (!this.h))
    {
      return;
      d1 = 2.0D * (paramFloat - 0.5D);
      break;
    }
    this.d.setText(this.b);
    this.h = false;
  }

  public final void b(int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    if (paramView.getId() == 2131558793)
    {
      if ((getActivity() instanceof IntroActivity))
        getActivity().finish();
    }
    else
      return;
    dismiss();
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = ((ao)getActivity());
    this.a.setRequestedOrientation(1);
    this.a.setRequestedOrientation(5);
    setHasOptionsMenu(false);
  }

  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    Dialog localDialog = super.onCreateDialog(paramBundle);
    localDialog.getWindow().requestFeature(1);
    return localDialog;
  }

  @SuppressLint({"ResourceAsColor"})
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903146, null);
    String[] arrayOfString1 = this.a.getResources().getStringArray(2131623953);
    String[] arrayOfString2 = this.a.getResources().getStringArray(2131623954);
    TypedArray localTypedArray = this.a.getResources().obtainTypedArray(2131623943);
    int[] arrayOfInt = new int[localTypedArray.length()];
    for (int i = 0; i < arrayOfInt.length; i++)
      arrayOfInt[i] = localTypedArray.getResourceId(i, 0);
    localTypedArray.recycle();
    this.b = getString(2131296426);
    this.c = getString(2131296931);
    this.e = ((ViewPager)localView.findViewById(2131558766));
    this.e.a(false, new com.enflick.android.TextNow.views.n(o.d));
    this.f = ((PageIndicator)localView.findViewById(2131558791));
    this.f.a(2131230808);
    this.f.b(2131230807);
    this.f.c(-1 + arrayOfString1.length);
    this.f.d(0);
    this.g = new n(getChildFragmentManager(), arrayOfString1, arrayOfString2, arrayOfInt);
    this.e.a(this.g);
    this.e.b(1);
    this.e.a(this);
    this.d = ((TextView)localView.findViewById(2131558793));
    this.d.setOnClickListener(this);
    return localView;
  }

  public final void onDestroy()
  {
    super.onDestroy();
    this.e = null;
    this.g = null;
  }

  public final void onDestroyView()
  {
    super.onDestroyView();
    this.a.setRequestedOrientation(4);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.m
 * JD-Core Version:    0.6.2
 */