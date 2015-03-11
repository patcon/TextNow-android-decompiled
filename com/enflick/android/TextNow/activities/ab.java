package com.enflick.android.TextNow.activities;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
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
import android.support.v4.app.v;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.preferences.CallRingtonePreference;
import com.enflick.android.TextNow.activities.preferences.CustomVoicemailEnablePreference;
import com.enflick.android.TextNow.activities.preferences.EmailNotificationsPreference;
import com.enflick.android.TextNow.activities.preferences.ImportSMSPreference;
import com.enflick.android.TextNow.activities.preferences.NativeSMSCheckBoxPreference;
import com.enflick.android.TextNow.activities.preferences.NotificationSoundPreference;
import com.enflick.android.TextNow.activities.preferences.SelectablePreference;
import com.enflick.android.TextNow.activities.preferences.UrlPreference;
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
import textnow.q.aa;
import textnow.q.b;
import textnow.q.g;
import textnow.u.q;
import textnow.u.r;
import textnow.u.t;

public class ab extends w
{
  private Preference g;

  public static ab a()
  {
    ab localab = new ab();
    localab.a(3);
    return localab;
  }

  public static ab c(int paramInt)
  {
    ab localab = new ab();
    localab.a(paramInt);
    return localab;
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int i = paramc.i();
    String str = paramc.j();
    this.e.r();
    if (localClass == UpdateUserInfoTask.class)
    {
      for (int i1 = 0; i1 < c().getPreferenceCount(); i1++)
        a(c().getPreference(i1), bool, i, str);
      if (bool)
      {
        this.c = new r(this.e);
        if (this.e.s())
        {
          if (!paramBoolean)
            break label121;
          this.e.c(2131493026);
        }
      }
    }
    label121: 
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
                this.e.c(2131493213);
                return false;
                if (localClass == LogoutTask.class)
                {
                  if (!bool)
                  {
                    this.e.finish();
                    WelcomeActivity.a(this.e);
                    return false;
                  }
                  if (!paramBoolean)
                  {
                    this.e.c(2131493123);
                    return false;
                  }
                  this.e.c(2131493026);
                  return false;
                }
                if (localClass != CallForwardingEnableTask.class)
                  break;
                for (int n = 0; n < c().getPreferenceCount(); n++)
                  a(c().getPreference(n), bool, i, str);
              }
              while ((!bool) || (!this.e.s()) || (this.e.c(str)));
              this.e.c(2131493214);
              return false;
              if (localClass != CallForwardingDisableTask.class)
                break;
              for (int m = 0; m < c().getPreferenceCount(); m++)
                a(c().getPreference(m), bool, i, str);
            }
            while ((!bool) || (!this.e.s()) || (this.e.c(str)));
            this.e.c(2131493214);
            return false;
            if (localClass != VoicemailEnableTask.class)
              break;
            for (int k = 0; k < c().getPreferenceCount(); k++)
              a(c().getPreference(k), bool, i, str);
          }
          while (!bool);
          if ((this.e.s()) && (!this.e.c(str)))
            this.e.c(2131493215);
        }
        while (this.c.N().equals("2"));
        this.g.setEnabled(false);
        this.g.setSummary(2131493288);
        return false;
      }
      while (localClass != VoicemailDisableTask.class);
      for (int j = 0; j < c().getPreferenceCount(); j++)
        a(c().getPreference(j), bool, i, str);
    }
    while ((!bool) || (!this.e.s()) || (this.e.c(str)));
    this.e.c(2131493215);
    return false;
  }

  public final String k()
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

  public final String l()
  {
    if ((textnow.q.ad.b(this.e)) && (this.b != 0))
      return null;
    int i;
    switch (this.b)
    {
    default:
      i = 2131493231;
    case 2:
    case 3:
    case 4:
    case 1:
    }
    while (true)
    {
      return this.e.getString(i);
      i = 2131493248;
      continue;
      i = 2131493269;
      continue;
      i = 2131493283;
      continue;
      i = 2131493223;
    }
  }

  public final int m()
  {
    return 2131165542;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 5)
      if (paramIntent != null)
      {
        com.enflick.android.TextNow.ads.a.b("change_ringtone");
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
        String str = g.a(this.e, paramIntent.getData().toString());
        Uri localUri1 = paramIntent.getData();
        Intent localIntent = new Intent(this.e, WallpaperPreviewActivity.class);
        localIntent.setData(localUri1);
        localIntent.putExtra("local_path", str);
        startActivityForResult(localIntent, 4);
        return;
      }
    }
    while ((paramInt1 != 4) || (paramInt2 != -1));
    com.enflick.android.TextNow.ads.a.b("change_wallpaper_custom_complete");
    File localFile1 = this.e.getFileStreamPath("tempWallpaper");
    File localFile2 = this.e.getFileStreamPath("wallpaper.png");
    if ((localFile2 != null) && (localFile1 != null) && (localFile1.exists()))
    {
      if (localFile2.exists())
        localFile2.delete();
      localFile1.renameTo(localFile2);
      this.c.p(localFile2.getAbsolutePath());
      this.c.n();
      return;
    }
    this.e.c(2131493249);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    final SelectablePreference localSelectablePreference2;
    final SelectablePreference localSelectablePreference3;
    final SelectablePreference localSelectablePreference4;
    final LinkedList localLinkedList;
    String str4;
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
      localSelectablePreference1.setOnPreferenceClickListener(new x(c(2), localLinkedList)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          ab.a(ab.this, localLinkedList, localSelectablePreference1);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      localSelectablePreference5.setOnPreferenceClickListener(new x(new ap(null), localLinkedList)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          ab.a(ab.this, localLinkedList, localSelectablePreference5);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      if ((this.e.l()) || (this.e.m()) || (MainActivity.n()))
        if (!b.a(this.c.t(), this.c.L()))
          if (TextUtils.isEmpty(this.c.M()))
            str4 = "";
      break;
    case 2:
    case 3:
    case 4:
    case 1:
    }
    while (true)
    {
      localSelectablePreference3.setSummary(str4);
      localSelectablePreference3.setOnPreferenceClickListener(new x(c(3), localLinkedList)
      {
        public final boolean onPreferenceClick(Preference paramAnonymousPreference)
        {
          ab.a(ab.this, localLinkedList, localSelectablePreference3);
          return super.onPreferenceClick(paramAnonymousPreference);
        }
      });
      label309: label354: PreferenceGroup localPreferenceGroup;
      Vibrator localVibrator;
      if (com.enflick.android.TextNow.activities.phone.d.d())
      {
        localSelectablePreference4.setOnPreferenceClickListener(new x(c(4), localLinkedList)
        {
          public final boolean onPreferenceClick(Preference paramAnonymousPreference)
          {
            com.enflick.android.TextNow.ads.a.b("tap_to_view_voicemail");
            ab.a(ab.this, localLinkedList, localSelectablePreference4);
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
              com.enflick.android.TextNow.ads.a.a("toggle_proximity", "action", str);
              return true;
            }
          }
        });
        localPreferenceGroup = (PreferenceGroup)a("messaging_cat");
        localVibrator = (Vibrator)this.e.getSystemService("vibrator");
      }
      try
      {
        Method localMethod = Vibrator.class.getMethod("hasVibrator", new Class[0]);
        Preference localPreference4;
        if (localMethod != null)
        {
          localPreference4 = a("userinfo_vibrate");
          if (((Boolean)localMethod.invoke(localVibrator, new Object[0])).booleanValue())
            break label1700;
          localPreferenceGroup.removePreference(localPreference4);
        }
        while (true)
        {
          EmailNotificationsPreference localEmailNotificationsPreference = (EmailNotificationsPreference)a("userinfo_forward_messages");
          localEmailNotificationsPreference.setChecked(this.c.i());
          localEmailNotificationsPreference.setOnPreferenceChangeListener(localEmailNotificationsPreference);
          a("userinfo_quickreply").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
          {
            public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
            {
              if (((Boolean)paramAnonymousObject).booleanValue());
              for (String str = "on"; ; str = "off")
              {
                com.enflick.android.TextNow.ads.a.a("toggle_quick_reply", "action", str);
                return true;
              }
            }
          });
          a("userinfo_quickreply_on_keyguard").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
          {
            public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
            {
              if (((Boolean)paramAnonymousObject).booleanValue());
              for (String str = "on"; ; str = "off")
              {
                com.enflick.android.TextNow.ads.a.a("toggle_quick_reply_on_keyguard", "action", str);
                return true;
              }
            }
          });
          localNativeSMSCheckBoxPreference = (NativeSMSCheckBoxPreference)a("userinfo_unified_inbox");
          localImportSMSPreference = (ImportSMSPreference)a("userinfo_unified_import");
          locale = b.h(this.e);
          if ((locale != textnow.q.e.a) && (!b.i(this.e)))
            break label1721;
          localPreferenceGroup.removePreference(localNativeSMSCheckBoxPreference);
          localPreferenceGroup.removePreference(localImportSMSPreference);
          this.c.f(false);
          this.c.n();
          localSelectablePreference2.setOnPreferenceClickListener(new x(c(1), localLinkedList)
          {
            public final boolean onPreferenceClick(Preference paramAnonymousPreference)
            {
              ab.a(ab.this, localLinkedList, localSelectablePreference2);
              return super.onPreferenceClick(paramAnonymousPreference);
            }
          });
          a("settings_logout").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
          {
            public final boolean onPreferenceClick(Preference paramAnonymousPreference)
            {
              com.enflick.android.TextNow.ads.a.b("log_out");
              ab.this.e.a(ab.this.getString(2131493021), false);
              new LogoutTask().b(ab.this.e);
              return true;
            }
          });
          if (textnow.q.a.a)
          {
            PreferenceCategory localPreferenceCategory2 = (PreferenceCategory)a("general_cat");
            PreferenceScreen localPreferenceScreen = b().createPreferenceScreen(this.e);
            localPreferenceScreen.setTitle("Developer Options");
            localPreferenceScreen.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
            {
              public final boolean onPreferenceClick(Preference paramAnonymousPreference)
              {
                ab.this.e.a(h.a());
                return true;
              }
            });
            localPreferenceScreen.setLayoutResource(2130903179);
            localPreferenceCategory2.addPreference(localPreferenceScreen);
          }
          while (true)
          {
            return;
            b(2131034122);
            if (this.b == 2)
            {
              a("settings_wallpaper_gallery").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
              {
                public final boolean onPreferenceClick(Preference paramAnonymousPreference)
                {
                  com.enflick.android.TextNow.ads.a.a("change_wallpaper", "type", "custom");
                  Intent localIntent = new Intent("android.intent.action.PICK");
                  localIntent.setType("image/*");
                  ab.this.startActivityForResult(localIntent, 2);
                  return true;
                }
              });
              a("settings_wallpaper_reset").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
              {
                public final boolean onPreferenceClick(Preference paramAnonymousPreference)
                {
                  com.enflick.android.TextNow.ads.a.a("change_wallpaper", "type", "default");
                  ab.this.c.p("");
                  ab.this.c.n();
                  ab.this.e.c(2131493247);
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
                    ab.this.e.a(textnow.n.d.a());
                    return true;
                  }
                });
                if (b.a(this.c.t(), this.c.L()))
                {
                  localPreference2.setSummary(2131493270);
                  localCheckBoxPreference.setEnabled(false);
                  localPreference3.setEnabled(false);
                  return;
                }
                String str2 = getResources().getString(2131493278);
                Object[] arrayOfObject1 = new Object[1];
                arrayOfObject1[0] = this.c.L();
                localPreference2.setSummary(String.format(str2, arrayOfObject1));
                localCheckBoxPreference.setEnabled(true);
                if (TextUtils.isEmpty(this.c.M()))
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
                  this.g = localPreference1;
                  String str1 = this.c.N().trim();
                  if ((str1.equals("0")) || (str1.equals("")))
                  {
                    localListPreference.setEnabled(false);
                    localPreference1.setEnabled(false);
                    localCustomVoicemailEnablePreference.setChecked(false);
                    localListPreference.setSummary(getString(2131493286));
                    localPreference1.setSummary(2131493288);
                  }
                  while (true)
                  {
                    final textnow.o.c localc = new textnow.o.c(getActivity(), new ad(this, localListPreference, localPreference1));
                    localc.a(new textnow.o.d()
                    {
                      public final void a()
                      {
                        localListPreference.setValue(this.b);
                        localListPreference.setSummary(this.b);
                      }
                    });
                    textnow.q.ad.a(localc, this.e);
                    localCustomVoicemailEnablePreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
                    {
                      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
                      {
                        if (((Boolean)paramAnonymousObject).booleanValue())
                        {
                          AlertDialog.Builder localBuilder = new AlertDialog.Builder(ab.this.e);
                          localBuilder.setTitle(2131493285);
                          localBuilder.setNegativeButton(2131493019, new DialogInterface.OnClickListener()
                          {
                            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                            {
                              ab.9.this.a.setChecked(false);
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
                                com.enflick.android.TextNow.ads.a.a("toggle_voicemail", localHashMap);
                                paramAnonymous2DialogInterface.dismiss();
                                return;
                                localHashMap.put("selection", "default");
                                ab.a(ab.this, ab.9.this.b);
                                ab.b(ab.this, ab.9.this.c);
                                ab.9.this.b.setValue(ab.this.getString(2131493286));
                                ab.9.this.c.setSummary(2131493288);
                                new VoicemailEnableTask().b(ab.this.getActivity());
                                ab.this.e.a(ab.this.getString(2131493022), false);
                                continue;
                                localHashMap.put("selection", "custom");
                                ab.9.this.d.show();
                              }
                            }
                          });
                          localBuilder.create().show();
                        }
                        while (true)
                        {
                          return true;
                          com.enflick.android.TextNow.ads.a.a("toggle_voicemail", "action", "off");
                          new VoicemailDisableTask().b(ab.this.getActivity());
                          ab.b(ab.this, localListPreference);
                          localListPreference.setValue(ab.this.getString(2131493286));
                          localPreference1.setSummary(2131493288);
                          ab.b(ab.this, localPreference1);
                          ab.this.e.a(ab.this.getString(2131493022), false);
                        }
                      }
                    });
                    localListPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
                    {
                      public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
                      {
                        if (((String)paramAnonymousObject).equals(ab.this.getString(2131493286)))
                        {
                          com.enflick.android.TextNow.ads.a.a("change_voicemail_greeting", "action", "default");
                          new VoicemailEnableTask().b(ab.this.getActivity());
                          ab.this.e.a(ab.this.getString(2131493022), false);
                          ab.b(ab.this, localPreference1);
                          localListPreference.setValue(ab.this.getString(2131493286));
                          localPreference1.setSummary(2131493288);
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
                          final v localv = ab.this.getActivity();
                          t localt = g.a(localv);
                          localc = new textnow.o.c(localv, new textnow.o.e()
                          {
                            public final void a(Uri paramAnonymous2Uri)
                            {
                              new StringBuilder().append("Saving file to uri: ").append(paramAnonymous2Uri.toString()).toString();
                              new VoicemailEnableTask(paramAnonymous2Uri, localv).b(ab.this.getActivity());
                              ab.this.e.a(localv.getResources().getString(2131493022), false);
                            }
                          }
                          , localt.a(), localt.b());
                          textnow.q.ad.a(localc, ab.this.e);
                          localc.show();
                          return false;
                        }
                        catch (FileNotFoundException localFileNotFoundException)
                        {
                          while (true)
                            textnow.o.c localc = new textnow.o.c(ab.this.getActivity(), new ad(ab.this, localListPreference, localPreference1));
                        }
                      }
                    });
                    return;
                    if (str1.equals("1"))
                    {
                      localListPreference.setEnabled(true);
                      localPreference1.setEnabled(false);
                      localCustomVoicemailEnablePreference.setChecked(true);
                      localListPreference.setValue(getString(2131493286));
                      localListPreference.setSummary(getString(2131493286));
                      localPreference1.setSummary(2131493288);
                    }
                    else
                    {
                      if (!str1.equals("2"))
                        break;
                      localListPreference.setEnabled(true);
                      localPreference1.setEnabled(true);
                      localCustomVoicemailEnablePreference.setChecked(true);
                      localListPreference.setValue(getString(2131493287));
                      localListPreference.setSummary(getString(2131493287));
                      localPreference1.setSummary(null);
                      if (!g.b(this.e))
                        localPreference1.setEnabled(false);
                    }
                  }
                  throw new IllegalStateException("Voicemail status is unknown: " + str1);
                  b(2131034112);
                  if (this.b == 1)
                  {
                    ((UrlPreference)a("settings_about_support")).a("http://support.textnow.com/");
                    ((UrlPreference)a("settings_about_twitter")).a("http://twitter.com/textnowapp");
                    ((UrlPreference)a("settings_about_facebook")).a("http://www.facebook.com/TextNow");
                    View localView1 = this.a.findViewById(2131165600);
                    View localView2 = this.a.findViewById(2131165601);
                    localView1.setVisibility(0);
                    localView2.setVisibility(0);
                    if ((this.c.aa()) && ("ACTIVE".equalsIgnoreCase(new q(this.e).d())))
                      localView2.setOnClickListener(new ac(this, (byte)0));
                    TextView localTextView1 = (TextView)this.a.findViewById(2131165602);
                    try
                    {
                      localTextView1.setText(getString(2131493227, new Object[] { this.e.getPackageManager().getPackageInfo(this.e.getPackageName(), 0).versionName }));
                      if ((!aa.a.equals("https://api.textnow.me/api2.0/")) || (!"release".equals("release")))
                      {
                        TextView localTextView2 = (TextView)this.a.findViewById(2131165603);
                        localTextView2.setText("master-52-1ee3db2660cbcff69d2ef233baefc293211e4892");
                        localTextView2.setVisibility(0);
                        return;
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
          String str3 = getString(2131493271);
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = this.c.M();
          str4 = String.format(str3, arrayOfObject2);
          break;
          localSelectablePreference3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener()
          {
            public final boolean onPreferenceClick(Preference paramAnonymousPreference)
            {
              ab.a(ab.this, localLinkedList, localSelectablePreference3);
              ab.this.e.a(textnow.n.d.a());
              return true;
            }
          });
          break label309;
          ((PreferenceCategory)a("calling_cat")).removePreference(localSelectablePreference3);
          break label309;
          PreferenceCategory localPreferenceCategory1 = (PreferenceCategory)a("calling_cat");
          c().removePreference(localPreferenceCategory1);
          break label354;
          label1700: localPreference4.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener()
          {
            public final boolean onPreferenceChange(Preference paramAnonymousPreference, Object paramAnonymousObject)
            {
              if (((Boolean)paramAnonymousObject).booleanValue());
              for (String str = "on"; ; str = "off")
              {
                com.enflick.android.TextNow.ads.a.a("toggle_vibrate", "action", str);
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
          NativeSMSCheckBoxPreference localNativeSMSCheckBoxPreference;
          ImportSMSPreference localImportSMSPreference;
          textnow.q.e locale;
          continue;
          label1721: if (locale == textnow.q.e.b)
          {
            localNativeSMSCheckBoxPreference.setEnabled(false);
            localNativeSMSCheckBoxPreference.setTitle(localNativeSMSCheckBoxPreference.getTitle() + " - Requires SIM");
            localPreferenceGroup.removePreference(localImportSMSPreference);
            this.c.f(false);
            this.c.n();
          }
          else if (b.k(this.e))
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
    this.c.n();
  }

  public void onResume()
  {
    super.onResume();
    SelectablePreference localSelectablePreference = (SelectablePreference)a("settings_call_forwarding");
    String str;
    if ((localSelectablePreference != null) && (!b.a(this.c.t(), this.c.L())))
    {
      str = this.c.M();
      if (TextUtils.isEmpty(str))
        localSelectablePreference.setSummary(2131493277);
    }
    else
    {
      return;
    }
    localSelectablePreference.setSummary(str);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.ab
 * JD-Core Version:    0.6.2
 */