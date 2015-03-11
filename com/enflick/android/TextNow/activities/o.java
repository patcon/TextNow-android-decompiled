package com.enflick.android.TextNow.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class o extends Fragment
{
  private int a;
  private String b;
  private String c;
  private TextView d;
  private TextView e;

  public static o a(int paramInt, String paramString1, String paramString2)
  {
    o localo = new o();
    Bundle localBundle = new Bundle();
    localBundle.putInt("res", paramInt);
    localBundle.putString("title", paramString1);
    localBundle.putString("desc", paramString2);
    localo.setArguments(localBundle);
    return localo;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    if (localBundle != null)
    {
      this.a = localBundle.getInt("res");
      this.b = localBundle.getString("title");
      this.c = localBundle.getString("desc");
    }
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903147, paramViewGroup, false);
    ImageView localImageView = (ImageView)localView.findViewById(2131558794);
    this.d = ((TextView)localView.findViewById(2131558485));
    this.e = ((TextView)localView.findViewById(2131558796));
    localImageView.setImageResource(this.a);
    this.d.setText(this.b);
    this.e.setText(this.c);
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.o
 * JD-Core Version:    0.6.2
 */