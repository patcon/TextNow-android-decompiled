package com.enflick.android.TextNow.activities.preferences;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.text.TextUtils;
import android.util.AttributeSet;

public class UrlPreference extends Preference
{
  private String a;

  public UrlPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        if (!TextUtils.isEmpty(UrlPreference.a(UrlPreference.this)))
        {
          Intent localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setData(Uri.parse(UrlPreference.a(UrlPreference.this)));
          UrlPreference.this.getContext().startActivity(localIntent);
          return true;
        }
        return false;
      }
    });
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.UrlPreference
 * JD-Core Version:    0.6.2
 */