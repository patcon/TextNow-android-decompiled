package com.enflick.android.TextNow.activities;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.preference.enflick.preferences.CallRingtonePreference;
import android.preference.enflick.preferences.CustomVoicemailEnablePreference;
import android.preference.enflick.preferences.EmailNotificationsPreference;
import android.preference.enflick.preferences.ImportSMSPreference;
import android.preference.enflick.preferences.NativeSMSCheckBoxPreference;
import android.preference.enflick.preferences.NotificationSoundPreference;
import android.preference.enflick.preferences.SelectablePreference;
import android.preference.enflick.preferences.UrlPreference;
import android.support.v4.app.k;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.tasks.CallForwardingDisableTask;
import com.enflick.android.TextNow.tasks.CallForwardingEnableTask;
import com.enflick.android.TextNow.tasks.LogoutTask;
import com.enflick.android.TextNow.tasks.UpdateUserInfoTask;
import com.enflick.android.TextNow.tasks.VoicemailDisableTask;
import com.enflick.android.TextNow.tasks.VoicemailEnableTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import textnow.v.g;
import textnow.v.x;
import textnow.v.z;
import textnow.z.p;
import textnow.z.s;
import textnow.z.u;
import textnow.z.v;

public class ah extends ac
{
  private Preference f;

  public static ah a()
  {
    ah localah = new ah();
    localah.a(3);
    return localah;
  }

  public static ah c(int paramInt)
  {
    ah localah = new ah();
    localah.a(paramInt);
    return localah;
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int i = paramc.i();
    String str = paramc.j();
    if (this.d == null);
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    return false;
                    this.d.v();
                    if (localClass != UpdateUserInfoTask.class)
                      break;
                    for (int i1 = 0; i1 < c().getPreferenceCount(); i1++)
                      a(c().getPreference(i1), bool, i, str);
                  }
                  while (!bool);
                  this.c = new u(this.d);
                }
                while (!this.d.w());
                if (paramBoolean)
                {
                  this.d.b(2131296433);
                  return false;
                }
                this.d.b(2131296622);
                return false;
                if (localClass == LogoutTask.class)
                {
                  if (!bool)
                  {
                    this.d.finish();
                    WelcomeActivity.a(this.d);
                    return false;
                  }
                  if (!paramBoolean)
                  {
                    this.d.b(2131296535);
                    return false;
                  }
                  this.d.b(2131296433);
                  return false;
                }
                if (localClass != CallForwardingEnableTask.class)
                  break;
                for (int n = 0; n < c().getPreferenceCount(); n++)
                  a(c().getPreference(n), bool, i, str);
              }
              while ((!bool) || (!this.d.w()) || (this.d.c(str)));
              this.d.b(2131296623);
              return false;
              if (localClass != CallForwardingDisableTask.class)
                break;
              for (int m = 0; m < c().getPreferenceCount(); m++)
                a(c().getPreference(m), bool, i, str);
            }
            while ((!bool) || (!this.d.w()) || (this.d.c(str)));
            this.d.b(2131296623);
            return false;
            if (localClass != VoicemailEnableTask.class)
              break;
            for (int k = 0; k < c().getPreferenceCount(); k++)
              a(c().getPreference(k), bool, i, str);
          }
          while (!bool);
          if ((this.d.w()) && (!this.d.c(str)))
            this.d.b(2131296624);
        }
        while (this.c.P().equals("2"));
        this.f.setEnabled(false);
        this.f.setSummary(2131296697);
        return false;
      }
      while (localClass != VoicemailDisableTask.class);
      for (int j = 0; j < c().getPreferenceCount(); j++)
        a(c().getPreference(j), bool, i, str);
    }
    while ((!bool) || (!this.d.w()) || (this.d.c(str)));
    this.d.b(2131296624);
    return false;
  }

  public final String l()
  {
    switch (this.b)
    {
    default:
      return "/Settings";
    case 1:
      return "/About";
    case 2:
      return "/Wallpaper";
    case 3:
      return "/Call_Forwarding";
    case 4:
    }
    return "/Voicemail";
  }

  public final String m()
  {
    if ((z.d(this.d)) && (this.b != 0))
      return null;
    int i;
    switch (this.b)
    {
    default:
      i = 2131296640;
    case 2:
    case 3:
    case 4:
    case 1:
    }
    while (true)
    {
      return this.d.getString(i);
      i = 2131296657;
      continue;
      i = 2131296678;
      continue;
      i = 2131296692;
      continue;
      i = 2131296632;
    }
  }

  public final int n()
  {
    return 2131558837;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 5)
      if (paramIntent != null)
      {
        com.enflick.android.TextNow.ads.b.b("change_ringtone");
        Uri localUri3 = (Uri)paramIntent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
        ((CallRingtonePreference)a("userinfo_ringtone")).onSaveRingtone(localUri3);
      }
    do
    {
      do
      {
        return;
        if (paramInt1 != 6)
          break;
      }
      while (paramIntent == null);
      Uri localUri2 = (Uri)paramIntent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
      ((NotificationSoundPreference)a("userinfo_notification_sound")).onSaveRingtone(localUri2);
      return;
      if ((paramInt1 == 2) && (paramInt2 == -1) && (paramIntent != null) && (paramIntent.getData() != null) && (paramIntent.getData().toString().startsWith("content://")))
      {
        String str = g.a(this.d, paramIntent.getData().toString());
        Uri localUri1 = paramIntent.getData();
        Intent localIntent = new Intent(this.d, WallpaperPreviewActivity.class);
        localIntent.setData(localUri1);
        localIntent.putExtra("local_path", str);
        startActivityForResult(localIntent, 4);
        return;
      }
    }
    while ((paramInt1 != 4) || (paramInt2 != -1));
    com.enflick.android.TextNow.ads.b.b("change_wallpaper_custom_complete");
    File localFile1 = this.d.getFileStreamPath("tempWallpaper");
    File localFile2 = this.d.getFileStreamPath("wallpaper.png");
    if ((localFile2 != null) && (localFile1 != null) && (localFile1.exists()))
    {
      if (localFile2.exists())
        localFile2.delete();
      localFile1.renameTo(localFile2);
      this.c.p(localFile2.getAbsolutePath());
      this.c.B();
      return;
    }
    this.d.b(2131296658);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    final SelectablePreference localSelectablePreference2;
    final SelectablePreference localSelectablePreference3;
    final SelectablePreference localSelectablePreference4;
    final LinkedList localLinkedList;
    String str5;
    switch (this.b)
    {
    default:
      b(2131034120);
      final SelectablePreference localSelectablePreference1 = (SelectablePreference)a("settings_wallpaper");
      localSelectablePreference2 = (SelectablePreference)a("settings_about");
      localSelectablePreference3 = (SelectablePreference)a("settings_call_forwarding");
      localSelectablePreference4 = (SelectablePreference)a("settings_custom_voicemail");
      final SelectablePreference localSelectablePreference5 = (SelectablePreference)a("theme_pref");
      localLinkedList = new LinkedList();
      localLinkedList.add(localSelectablePreference1);
      localLinkedList.add(localSelectablePreference2);
      localLinkedList.add(localSelectablePreference3);
      localLinkedList.add(localSelectablePreference4);
      localLinkedList.add(localSelectablePreference5);
      localSelectablePreference1.setOnPreferenceClickListener(new ad(c(2), localLinkedList)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          ah.a(ah.this, localLinkedList, localSelectablePreference1);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      localSelectablePreference5.setOnPreferenceClickListener(new ad(new aw(null), localLinkedList)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          ah.a(ah.this, localLinkedList, localSelectablePreference5);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      if ((this.d.n()) || (this.d.o()) || (MainActivity.p()))
        if (!textnow.v.b.a(this.c.r(), this.c.N()))
          if (TextUtils.isEmpty(this.c.O()))
            str5 = "";
      break;
    case 2:
    case 3:
    case 4:
    case 1:
    }
    while (true)
    {
      localSelectablePreference3.setSummary(str5);
      localSelectablePreference3.setOnPreferenceClickListener(new ad(c(3), localLinkedList)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          ah.a(ah.this, localLinkedList, localSelectablePreference3);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      label309: label354: PreferenceGroup localPreferenceGroup;
      Vibrator localVibrator;
      if (h.d())
      {
        localSelectablePreference4.setOnPreferenceClickListener(new ad(c(4), localLinkedList)
        {
          public final boolean onPreferenceClick(Preference paramAnonymousPreference)
          {
            com.enflick.android.TextNow.ads.b.b("tap_to_view_voicemail");
            ah.a(ah.this, localLinkedList, localSelectablePreference4);
            return super.onPreferenceClick(paramAnonymousPreference);
          }
        });
        a("userinfo_proximity_sensor").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
        {
          public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
          {
            if (((Boolean)paramAnonymousObject).booleanValue());
            for (String str = "on"; ; str = "off")
            {
              com.enflick.android.TextNow.ads.b.a("toggle_proximity", "action", str);
              return true;
            }
          }
        });
        localPreferenceGroup = (PreferenceGroup)a("messaging_cat");
        localVibrator = (Vibrator)this.d.getSystemService("vibrator");
      }
      try
      {
        Method localMethod = Vibrator.class.getMethod("hasVibrator", new Class[0]);
        Preference localPreference7;
        if (localMethod != null)
        {
          localPreference7 = a("userinfo_vibrate");
          if (((Boolean)localMethod.invoke(localVibrator, new Object[0])).booleanValue())
            break label1847;
          localPreferenceGroup.removePreference(localPreference7);
        }
        while (true)
        {
          EmailNotificationsPreference localEmailNotificationsPreference = (EmailNotificationsPreference)a("userinfo_forward_messages");
          localEmailNotificationsPreference.setChecked(this.c.i());
          localEmailNotificationsPreference.setOnPreferenceChangeListener(localEmailNotificationsPreference);
          localPreference4 = a("userinfo_chathead");
          Preference localPreference5 = a("userinfo_quickreply");
          Preference localPreference6 = a("userinfo_quickreply_on_keyguard");
          if (textnow.v.b.f())
            break label1868;
          localPreferenceGroup.removePreference(localPreference4);
          localPreference6.setDependency("userinfo_quickreply");
          localPreference5.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
          {
            public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
            {
              if (((Boolean)paramAnonymousObject).booleanValue());
              for (String str = "on"; ; str = "off")
              {
                com.enflick.android.TextNow.ads.b.a("toggle_quick_reply", "action", str);
                return true;
              }
            }
          });
          localPreference6.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
          {
            public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
            {
              if (((Boolean)paramAnonymousObject).booleanValue());
              for (String str = "on"; ; str = "off")
              {
                com.enflick.android.TextNow.ads.b.a("toggle_quick_reply_on_keyguard", "action", str);
                return true;
              }
            }
          });
          a("userinfo_hidden_timestamps").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
          {
            public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
            {
              if (((Boolean)paramAnonymousObject).booleanValue());
              for (String str = "on"; ; str = "off")
              {
                com.enflick.android.TextNow.ads.b.a("toggle_hidden_timestamps", "setting", str);
                return true;
              }
            }
          });
          localNativeSMSCheckBoxPreference = (NativeSMSCheckBoxPreference)a("userinfo_unified_inbox");
          localImportSMSPreference = (ImportSMSPreference)a("userinfo_unified_import");
          locale = textnow.v.b.g(this.d);
          if ((locale != textnow.v.e.a) && (!textnow.v.b.h(this.d)))
            break label1884;
          localPreferenceGroup.removePreference(localNativeSMSCheckBoxPreference);
          localPreferenceGroup.removePreference(localImportSMSPreference);
          this.c.f(false);
          this.c.B();
          localSelectablePreference2.setOnPreferenceClickListener(new ad(c(1), localLinkedList)
          {
            public final boolean onPreferenceClick(Preference paramAnonymousPreference)
            {
              ah.a(ah.this, localLinkedList, localSelectablePreference2);
              return super.onPreferenceClick(paramAnonymousPreference);
            }
          });
          a("settings_logout").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
          {
            public final boolean onPreferenceClick(Preference paramAnonymousPreference)
            {
              com.enflick.android.TextNow.ads.b.b("log_out");
              ah.this.d.a(ah.this.getString(2131296428), false);
              new LogoutTask().b(ah.this.d);
              return true;
            }
          });
          a("settings_feedback").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
          {
            public final boolean onPreferenceClick(Preference paramAnonymousPreference)
            {
              textnow.v.b.a(ah.this.d, textnow.v.d.a);
              return true;
            }
          });
          if ((0x2 & TextNowApp.a().getApplicationInfo().flags) != 0)
          {
            PreferenceCategory localPreferenceCategory2 = (PreferenceCategory)a("general_cat");
            PreferenceScreen localPreferenceScreen = b().createPreferenceScreen(this.d);
            localPreferenceScreen.setTitle("Developer Options");
            localPreferenceScreen.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
            {
              public final boolean onPreferenceClick(Preference paramAnonymousPreference)
              {
                ah.this.d.a(i.a());
                return true;
              }
            });
            localPreferenceScreen.setLayoutResource(2130903197);
            localPreferenceCategory2.addPreference(localPreferenceScreen);
          }
          while (true)
          {
            return;
            b(2131034123);
            if (this.b == 2)
            {
              a("settings_wallpaper_gallery").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
              {
                public final boolean onPreferenceClick(Preference paramAnonymousPreference)
                {
                  com.enflick.android.TextNow.ads.b.a("change_wallpaper", "type", "custom");
                  Intent localIntent = new Intent("android.intent.action.PICK");
                  localIntent.setType("image/*");
                  ah.this.startActivityForResult(localIntent, 2);
                  return true;
                }
              });
              a("settings_wallpaper_reset").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
              {
                public final boolean onPreferenceClick(Preference paramAnonymousPreference)
                {
                  com.enflick.android.TextNow.ads.b.a("change_wallpaper", "type", "default");
                  ah.this.c.p("");
                  ah.this.c.B();
                  ah.this.d.b(2131296656);
                  return true;
                }
              });
              return;
              b(2131034114);
              if (this.b == 3)
              {
                Preference localPreference2 = a("userinfo_callforwarding_status");
                CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)a("userinfo_callforwarding_enabled");
                Preference localPreference3 = a("userinfo_callforwarding_forward_to");
                localPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
                {
                  public final boolean onPreferenceClick(Preference paramAnonymousPreference)
                  {
                    ah.this.d.a(textnow.s.d.a());
                    return true;
                  }
                });
                if (textnow.v.b.a(this.c.r(), this.c.N()))
                {
                  localPreference2.setSummary(2131296679);
                  localCheckBoxPreference.setEnabled(false);
                  localPreference3.setEnabled(false);
                  return;
                }
                String str3 = getResources().getString(2131296687);
                Object[] arrayOfObject1 = new Object[1];
                arrayOfObject1[0] = this.c.N();
                localPreference2.setSummary(String.format(str3, arrayOfObject1));
                localCheckBoxPreference.setEnabled(true);
                if (TextUtils.isEmpty(this.c.O()))
                {
                  localPreference3.setEnabled(false);
                  localCheckBoxPreference.setChecked(false);
                  return;
                }
                localPreference3.setEnabled(true);
                localCheckBoxPreference.setChecked(true);
                return;
                b(2131034115);
                if (this.b == 4)
                {
                  final CustomVoicemailEnablePreference localCustomVoicemailEnablePreference = (CustomVoicemailEnablePreference)a("userinfo_custom_voicemail_enabled");
                  final ListPreference localListPreference = (ListPreference)a("userinfo_custom_voicemail_type");
                  final Preference localPreference1 = a("userinfo_custom_voicemail_option");
                  this.f = localPreference1;
                  String str2 = this.c.P().trim();
                  if ((str2.equals("0")) || (str2.equals("")))
                  {
                    localListPreference.setEnabled(false);
                    localPreference1.setEnabled(false);
                    localCustomVoicemailEnablePreference.setChecked(false);
                    localListPreference.setSummary(getString(2131296695));
                    localPreference1.setSummary(2131296697);
                  }
                  while (true)
                  {
                    final textnow.t.c localc = new textnow.t.c(getActivity(), new aj(this, localListPreference, localPreference1));
                    localc.a(new textnow.t.d()
                    {
                      public final void a()
                      {
                        localListPreference.setValue(this.b);
                        localListPreference.setSummary(this.b);
                      }
                    });
                    z.a(localc, this.d);
                    localCustomVoicemailEnablePreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
                    {
                      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
                      {
                        if (((Boolean)paramAnonymousObject).booleanValue())
                        {
                          AlertDialog.Builder localBuilder = new AlertDialog.Builder(ah.this.d);
                          localBuilder.setTitle(2131296694);
                          localBuilder.setNegativeButton(2131296425, new DialogInterface.OnClickListener()
                          {
                            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                            {
                              ah.13.this.a.setChecked(false);
                              paramAnonymous2DialogInterface.dismiss();
                            }
                          });
                          localBuilder.setSingleChoiceItems(2131623946, -1, new DialogInterface.OnClickListener()
                          {
                            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                            {
                              HashMap localHashMap = new HashMap();
                              localHashMap.put("action", "on");
                              switch (paramAnonymous2Int)
                              {
                              default:
                              case 0:
                              case 1:
                              }
                              while (true)
                              {
                                com.enflick.android.TextNow.ads.b.a("toggle_voicemail", localHashMap);
                                paramAnonymous2DialogInterface.dismiss();
                                return;
                                localHashMap.put("selection", "default");
                                ah.a(ah.this, ah.13.this.b);
                                ah.b(ah.this, ah.13.this.c);
                                ah.13.this.b.setValue(ah.this.getString(2131296695));
                                ah.13.this.c.setSummary(2131296697);
                                new VoicemailEnableTask().b(ah.this.getActivity());
                                ah.this.d.a(ah.this.getString(2131296429), false);
                                continue;
                                localHashMap.put("selection", "custom");
                                ah.13.this.d.show();
                              }
                            }
                          });
                          localBuilder.create().show();
                        }
                        while (true)
                        {
                          return true;
                          com.enflick.android.TextNow.ads.b.a("toggle_voicemail", "action", "off");
                          new VoicemailDisableTask().b(ah.this.getActivity());
                          ah.b(ah.this, localListPreference);
                          localListPreference.setValue(ah.this.getString(2131296695));
                          localPreference1.setSummary(2131296697);
                          ah.b(ah.this, localPreference1);
                          ah.this.d.a(ah.this.getString(2131296429), false);
                        }
                      }
                    });
                    localListPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
                    {
                      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
                      {
                        if (((String)paramAnonymousObject).equals(ah.this.getString(2131296695)))
                        {
                          com.enflick.android.TextNow.ads.b.a("change_voicemail_greeting", "action", "default");
                          new VoicemailEnableTask().b(ah.this.getActivity());
                          ah.this.d.a(ah.this.getString(2131296429), false);
                          ah.b(ah.this, localPreference1);
                          localListPreference.setValue(ah.this.getString(2131296695));
                          localPreference1.setSummary(2131296697);
                        }
                        while (true)
                        {
                          return true;
                          localc.show();
                        }
                      }
                    });
                    localPreference1.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
                    {
                      public final boolean onPreferenceClick(Preference paramAnonymousPreference)
                      {
                        try
                        {
                          final k localk = ah.this.getActivity();
                          v localv = g.a(localk);
                          localc = new textnow.t.c(localk, new textnow.t.e()
                          {
                            public final void a(Uri paramAnonymous2Uri)
                            {
                              new StringBuilder().append("Saving file to uri: ").append(paramAnonymous2Uri.toString()).toString();
                              new VoicemailEnableTask(paramAnonymous2Uri, localk).b(ah.this.getActivity());
                              ah.this.d.a(localk.getResources().getString(2131296429), false);
                            }
                          }
                          , localv.a(), localv.b());
                          z.a(localc, ah.this.d);
                          localc.show();
                          return false;
                        }
                        catch (FileNotFoundException localFileNotFoundException)
                        {
                          while (true)
                            textnow.t.c localc = new textnow.t.c(ah.this.getActivity(), new aj(ah.this, localListPreference, localPreference1));
                        }
                      }
                    });
                    return;
                    if (str2.equals("1"))
                    {
                      localListPreference.setEnabled(true);
                      localPreference1.setEnabled(false);
                      localCustomVoicemailEnablePreference.setChecked(true);
                      localListPreference.setValue(getString(2131296695));
                      localListPreference.setSummary(getString(2131296695));
                      localPreference1.setSummary(2131296697);
                    }
                    else
                    {
                      if (!str2.equals("2"))
                        break;
                      localListPreference.setEnabled(true);
                      localPreference1.setEnabled(true);
                      localCustomVoicemailEnablePreference.setChecked(true);
                      localListPreference.setValue(getString(2131296696));
                      localListPreference.setSummary(getString(2131296696));
                      localPreference1.setSummary(null);
                      if (!g.b(this.d))
                        localPreference1.setEnabled(false);
                    }
                  }
                  throw new IllegalStateException("Voicemail status is unknown: " + str2);
                  b(2131034112);
                  if (this.b == 1)
                  {
                    ((UrlPreference)a("settings_about_support")).a("http://support.textnow.com/");
                    ((UrlPreference)a("settings_about_twitter")).a("http://twitter.com/textnowapp");
                    ((UrlPreference)a("settings_about_facebook")).a("http://www.facebook.com/TextNow");
                    View localView1 = this.a.findViewById(2131558902);
                    View localView2 = this.a.findViewById(2131558903);
                    localView1.setVisibility(0);
                    localView2.setVisibility(0);
                    if ((this.c.Z()) && ("ACTIVE".equalsIgnoreCase(new s(this.d).f())))
                      localView2.setOnClickListener(new ai(this, (byte)0));
                    TextView localTextView1 = (TextView)this.a.findViewById(2131558904);
                    try
                    {
                      String str1 = this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionName;
                      if (new p(this.d).z())
                        localTextView1.setText(getString(2131296636, new Object[] { str1 }) + "a");
                      while ((!x.a.equals("https://api.textnow.me/api2.0/")) || (!"release".equals("release")))
                      {
                        TextView localTextView2 = (TextView)this.a.findViewById(2131558905);
                        localTextView2.setText("master-71-2f30f2fae450fe2f8a510787860cb2050ea819c1");
                        localTextView2.setVisibility(0);
                        return;
                        localTextView1.setText(getString(2131296636, new Object[] { str1 }));
                      }
                    }
                    catch (PackageManager.NameNotFoundException localNameNotFoundException)
                    {
                      while (true)
                        localNameNotFoundException.printStackTrace();
                    }
                  }
                }
              }
            }
          }
          String str4 = getString(2131296680);
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = this.c.O();
          str5 = String.format(str4, arrayOfObject2);
          break;
          localSelectablePreference3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
          {
            public final boolean onPreferenceClick(Preference paramAnonymousPreference)
            {
              ah.a(ah.this, localLinkedList, localSelectablePreference3);
              ah.this.d.a(textnow.s.d.a());
              return true;
            }
          });
          break label309;
          ((PreferenceCategory)a("calling_cat")).removePreference(localSelectablePreference3);
          break label309;
          PreferenceCategory localPreferenceCategory1 = (PreferenceCategory)a("calling_cat");
          c().removePreference(localPreferenceCategory1);
          break label354;
          label1847: localPreference7.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
          {
            public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
            {
              if (((Boolean)paramAnonymousObject).booleanValue());
              for (String str = "on"; ; str = "off")
              {
                com.enflick.android.TextNow.ads.b.a("toggle_vibrate", "action", str);
                return true;
              }
            }
          });
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          Preference localPreference4;
          NativeSMSCheckBoxPreference localNativeSMSCheckBoxPreference;
          ImportSMSPreference localImportSMSPreference;
          textnow.v.e locale;
          continue;
          label1868: localPreference4.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
          {
            public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
            {
              if (((Boolean)paramAnonymousObject).booleanValue());
              for (String str = "on"; ; str = "off")
              {
                com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "setting", str);
                return true;
              }
            }
          });
          continue;
          label1884: if (locale == textnow.v.e.b)
          {
            localNativeSMSCheckBoxPreference.setEnabled(false);
            localNativeSMSCheckBoxPreference.setTitle(localNativeSMSCheckBoxPreference.getTitle() + " - Requires SIM");
            localPreferenceGroup.removePreference(localImportSMSPreference);
            this.c.f(false);
            this.c.B();
          }
          else if (textnow.v.b.j(this.d))
          {
            localNativeSMSCheckBoxPreference.setChecked(true);
            localNativeSMSCheckBoxPreference.setEnabled(false);
          }
        }
      }
    }
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    this.c.B();
  }

  public void onResume()
  {
    super.onResume();
    SelectablePreference localSelectablePreference = (SelectablePreference)a("settings_call_forwarding");
    String str;
    if ((localSelectablePreference != null) && (!textnow.v.b.a(this.c.r(), this.c.N())))
    {
      str = this.c.O();
      if (TextUtils.isEmpty(str))
        localSelectablePreference.setSummary(2131296686);
    }
    else
    {
      return;
    }
    localSelectablePreference.setSummary(str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ah
 * JD-Core Version:    0.6.2
 */