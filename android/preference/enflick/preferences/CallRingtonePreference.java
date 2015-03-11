package android.preference.enflick.preferences;

import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.preference.RingtonePreference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import textnow.v.b;
import textnow.v.z;
import textnow.z.u;

public class CallRingtonePreference extends RingtonePreference
{
  private MainActivity a;

  public CallRingtonePreference(Context paramContext)
  {
    super(paramContext, null);
    this.a = ((MainActivity)paramContext);
  }

  public CallRingtonePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = ((MainActivity)paramContext);
  }

  public CallRingtonePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = ((MainActivity)paramContext);
  }

  private void a()
  {
    Uri localUri = onRestoreRingtone();
    if (b.h(this.a))
      if (localUri == null)
        setSummary(2131296650);
    String str1;
    do
    {
      Ringtone localRingtone1;
      do
      {
        String str2;
        do
        {
          Ringtone localRingtone2;
          do
          {
            return;
            localRingtone2 = RingtoneManager.getRingtone(getContext(), localUri);
          }
          while (localRingtone2 == null);
          str2 = localRingtone2.getTitle(getContext());
        }
        while (TextUtils.isEmpty(str2));
        setSummary(str2);
        return;
        if ((localUri == null) || (localUri.toString().startsWith("android.resource")))
        {
          setSummary(2131296649);
          return;
        }
        if (localUri == Uri.EMPTY)
        {
          setSummary(2131296650);
          return;
        }
        localRingtone1 = RingtoneManager.getRingtone(getContext(), localUri);
      }
      while (localRingtone1 == null);
      str1 = localRingtone1.getTitle(getContext());
    }
    while (TextUtils.isEmpty(str1));
    setSummary(str1);
  }

  protected void onClick()
  {
    Intent localIntent = new Intent("android.intent.action.RINGTONE_PICKER");
    onPrepareRingtonePickerIntent(localIntent);
    try
    {
      this.a.k().startActivityForResult(localIntent, 5);
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
    z.a(paramIntent, onRestoreRingtone(), getContext(), null);
  }

  protected Uri onRestoreRingtone()
  {
    if (b.h(this.a))
      return RingtoneManager.getActualDefaultRingtoneUri(this.a, 1);
    String str = new u(getContext()).u();
    if (str == null)
      return null;
    if (!TextUtils.isEmpty(str))
      return Uri.parse(str);
    return Uri.EMPTY;
  }

  public void onSaveRingtone(Uri paramUri)
  {
    u localu = new u(getContext());
    if (paramUri != null);
    for (String str = paramUri.toString(); ; str = "")
    {
      localu.o(str);
      localu.B();
      if (b.h(this.a))
        z.a(this.a, paramUri);
      a();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.preference.enflick.preferences.CallRingtonePreference
 * JD-Core Version:    0.6.2
 */