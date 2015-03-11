package android.preference.enflick.preferences;

import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.preference.RingtonePreference;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.ads.b;
import textnow.z.u;

public class NotificationSoundPreference extends RingtonePreference
{
  private MainActivity a;

  public NotificationSoundPreference(Context paramContext)
  {
    super(paramContext, null);
    this.a = ((MainActivity)paramContext);
  }

  public NotificationSoundPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = ((MainActivity)paramContext);
  }

  public NotificationSoundPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = ((MainActivity)paramContext);
  }

  private void a()
  {
    Uri localUri = onRestoreRingtone();
    if ((localUri == null) || (localUri.toString().startsWith("android.resource")))
      setSummary(2131296649);
    String str;
    do
    {
      Ringtone localRingtone;
      do
      {
        return;
        if (localUri == Uri.EMPTY)
        {
          setSummary(2131296650);
          return;
        }
        localRingtone = RingtoneManager.getRingtone(getContext(), localUri);
      }
      while (localRingtone == null);
      str = localRingtone.getTitle(getContext());
    }
    while (TextUtils.isEmpty(str));
    setSummary(str);
  }

  protected void onClick()
  {
    Intent localIntent = new Intent("android.intent.action.RINGTONE_PICKER");
    onPrepareRingtonePickerIntent(localIntent);
    try
    {
      this.a.k().startActivityForResult(localIntent, 6);
      return;
    }
    catch (Exception localException)
    {
      this.a.b(2131296893);
    }
  }

  protected View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    a();
    return localView;
  }

  protected void onPrepareRingtonePickerIntent(Intent paramIntent)
  {
    Uri localUri = onRestoreRingtone();
    if ((localUri == null) || (localUri.toString().startsWith("android.resource")))
      localUri = Settings.System.DEFAULT_NOTIFICATION_URI;
    while (true)
    {
      paramIntent.putExtra("android.intent.extra.ringtone.EXISTING_URI", localUri);
      paramIntent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
      Context localContext = getContext();
      paramIntent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Uri.parse("android.resource://" + localContext.getPackageName() + "/" + 2131099649));
      paramIntent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
      paramIntent.putExtra("android.intent.extra.ringtone.TYPE", 2);
      paramIntent.putExtra("android.intent.extra.ringtone.TITLE", getContext().getString(2131296651));
      return;
      if (localUri == Uri.EMPTY)
        localUri = null;
    }
  }

  protected Uri onRestoreRingtone()
  {
    String str = new u(getContext()).t();
    if (str == null)
      return null;
    if (!TextUtils.isEmpty(str))
      return Uri.parse(str);
    return Uri.EMPTY;
  }

  public void onSaveRingtone(Uri paramUri)
  {
    b.b("change_notification");
    u localu = new u(getContext());
    if (paramUri != null);
    for (String str = paramUri.toString(); ; str = "")
    {
      localu.n(str);
      localu.B();
      a();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.NotificationSoundPreference
 * JD-Core Version:    0.6.2
 */