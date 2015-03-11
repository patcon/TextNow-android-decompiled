package android.preference.enflick.preferences;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Toast;

public class UrlPreference extends Preference
{
  private String a;

  public UrlPreference(final Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
    {
      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
      {
        boolean bool1 = TextUtils.isEmpty(UrlPreference.a(UrlPreference.this));
        boolean bool2 = false;
        if (!bool1);
        try
        {
          Intent localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setData(Uri.parse(UrlPreference.a(UrlPreference.this)));
          UrlPreference.this.getContext().startActivity(localIntent);
          bool2 = true;
          return bool2;
        }
        catch (Exception localException)
        {
          Toast.makeText(paramContext, 2131296432, 0).show();
          localException.printStackTrace();
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.UrlPreference
 * JD-Core Version:    0.6.2
 */