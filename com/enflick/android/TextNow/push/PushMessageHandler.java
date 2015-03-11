package com.enflick.android.TextNow.push;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.phone.d;
import com.enflick.android.TextNow.activities.quickreply.QuickReplyActivityBase;
import com.enflick.android.TextNow.activities.quickreply.QuickReplyKeyGuardActivity;
import com.enflick.android.TextNow.tasks.AcceptCallTask;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.SetRegistrationIdTask;
import com.enflick.android.TextNow.tasks.SpeedTestTask;
import textnow.q.o;
import textnow.u.n;
import textnow.u.r;

public class PushMessageHandler
{
  private static final String TAG = "PushMessageHandler";

  public static void registerWithServer(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(new r(paramContext).m()))
      return;
    new SetRegistrationIdTask(paramString).b(paramContext);
  }

  public static void unregisterWithServer(Context paramContext)
  {
    registerWithServer(paramContext, "");
  }

  public void onMessage(Intent paramIntent, Context paramContext)
  {
    int i = 2;
    int j = 1;
    Bundle localBundle = paramIntent.getExtras();
    r localr;
    if (localBundle != null)
    {
      localr = new r(paramContext);
      if (localr.l());
    }
    else
    {
      return;
    }
    new StringBuilder().append("content: ").append(localBundle).toString();
    String str1 = localBundle.getString("message");
    String str2 = localBundle.getString("outgoing");
    String str3 = localBundle.getString("type");
    String str4 = localBundle.getString("caller");
    String str5 = localBundle.getString("from_name");
    String str6 = localBundle.getString("uuid");
    String str8;
    String str9;
    String str10;
    label170: label178: long l;
    label189: String str11;
    String str12;
    String str13;
    if (((str2 == null) || ("false".equals(str2))) && (str3 != null) && (str1 != null))
    {
      str8 = localBundle.getString("contact_value");
      str9 = localBundle.getString("contact_type");
      str10 = localBundle.getString("id");
      if (TextUtils.isEmpty(str9))
      {
        if (!TextUtils.isEmpty(str3))
          break label316;
        if (!TextUtils.isEmpty(str10))
          break label329;
        l = 0L;
        int k = str1.indexOf(":");
        str11 = "";
        if (k < 0)
          break label342;
        if (k > 0)
          str11 = str1.substring(0, k);
        if (k >= -1 + str1.length())
          break label714;
        String str15 = str1.substring(k + 1);
        str12 = str11;
        str13 = str15;
      }
    }
    while (true)
    {
      if (!TextUtils.isEmpty(str5))
        str12 = str5;
      String str14 = str13.trim();
      o.a(paramContext).a(str8, str12, i, str14, j, 0, l);
      new GetNewMessagesTask().b(paramContext);
      return;
      i = Integer.valueOf(str9).intValue();
      break label170;
      label316: j = Integer.valueOf(str3).intValue();
      break label178;
      label329: l = Long.valueOf(str10).longValue();
      break label189;
      label342: str12 = "";
      str13 = str1;
      continue;
      if ("true".equals(str2))
      {
        String str7 = localBundle.getString("contact_value");
        KeyguardManager localKeyguardManager = (KeyguardManager)paramContext.getSystemService("keyguard");
        if ((!TextNowApp.c()) && (localr.A()))
          if ((!localKeyguardManager.inKeyguardRestrictedInputMode()) || (!localr.B()))
            break label471;
        label471: for (Intent localIntent = new Intent(paramContext, QuickReplyKeyGuardActivity.class); ; localIntent = new Intent(paramContext, QuickReplyActivityBase.class))
        {
          localIntent.addFlags(268435456);
          localIntent.putExtra("extra_outgoing_contact_value", str7);
          localIntent.putExtra("extra_source", 0);
          paramContext.startActivity(localIntent);
          new GetNewMessagesTask().b(paramContext);
          return;
        }
      }
      if (str4 != null)
      {
        new StringBuilder().append("incoming call received, caller number: ").append(str4).toString();
        d.f();
        return;
      }
      if ((str1 != null) && (str3 == null))
      {
        o.a(paramContext).b(str1);
        new GetUserInfoTask(localr.b()).b(paramContext);
        return;
      }
      if (str6 != null)
      {
        new StringBuilder().append("cdma request push received, uuid ").append(str6).toString();
        AudioManager localAudioManager;
        do
        {
          try
          {
            if (d.a().p() != null)
            {
              new AcceptCallTask(str6, false).b(paramContext);
              return;
            }
          }
          catch (Exception localException)
          {
            new SpeedTestTask(new n(paramContext), null, str6).b(paramContext);
            return;
          }
          localAudioManager = (AudioManager)paramContext.getSystemService("audio");
        }
        while ((localAudioManager == null) || ((localAudioManager.getMode() != i) && (localAudioManager.getMode() != j)));
        new AcceptCallTask(str6, true).b(paramContext);
        return;
      }
      if ((str1 != null) || (str4 != null) || (str6 != null))
        break;
      new GetUserInfoTask(localr.b()).b(paramContext);
      return;
      label714: str12 = str11;
      str13 = "";
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.push.PushMessageHandler
 * JD-Core Version:    0.6.2
 */