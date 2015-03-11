package com.enflick.android.TextNow.activities.preferences;

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
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.ads.a;
import textnow.u.r;

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
      setSummary(2131493240);
    String str;
    do
    {
      Ringtone localRingtone;
      do
      {
        return;
        if (localUri == Uri.EMPTY)
        {
          setSummary(2131493241);
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
      this.a.j().startActivityForResult(localIntent, 6);
      return;
    }
    catch (Exception localException)
    {
      this.a.c(2131493519);
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
      paramIntent.putExtra("android.intent.extra.ringtone.TITLE", getContext().getString(2131493242));
      return;
      if (localUri == Uri.EMPTY)
        localUri = null;
    }
  }

  protected Uri onRestoreRingtone()
  {
    String str = new r(getContext()).v();
    if (str == null)
      return null;
    if (!TextUtils.isEmpty(str))
      return Uri.parse(str);
    return Uri.EMPTY;
  }

  public void onSaveRingtone(Uri paramUri)
  {
    a.b("change_notification");
    r localr = new r(getContext());
    if (paramUri != null);
    for (String str = paramUri.toString(); ; str = "")
    {
      localr.n(str);
      localr.n();
      a();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.preferences.NotificationSoundPreference
 * JD-Core Version:    0.6.2
 */