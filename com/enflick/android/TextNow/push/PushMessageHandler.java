package com.enflick.android.TextNow.push;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.phone.h;
import com.enflick.android.TextNow.activities.quickreply.QuickReplyActivityBase;
import com.enflick.android.TextNow.activities.quickreply.QuickReplyKeyGuardActivity;
import com.enflick.android.TextNow.tasks.AcceptCallTask;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.GetSubscriptionTask;
import com.enflick.android.TextNow.tasks.GetUserInfoTask;
import com.enflick.android.TextNow.tasks.SetRegistrationIdTask;
import com.enflick.android.TextNow.tasks.SpeedTestTask;
import textnow.aa.a;
import textnow.v.b;
import textnow.v.k;
import textnow.z.p;
import textnow.z.s;
import textnow.z.u;

public class PushMessageHandler
{
  private static final String TAG = "PushMessageHandler";

  public static void registerWithServer(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(new u(paramContext).m()))
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
    u localu;
    if (localBundle != null)
    {
      localu = new u(paramContext);
      if (localu.l());
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
          break label337;
        if (!TextUtils.isEmpty(str10))
          break label350;
        l = 0L;
        int k = str1.indexOf(":");
        str11 = "";
        if (k < 0)
          break label363;
        if (k > 0)
          str11 = str1.substring(0, k);
        if (k >= -1 + str1.length())
          break label795;
        String str16 = str1.substring(k + 1);
        str12 = str11;
        str13 = str16;
      }
    }
    while (true)
    {
      label253: if (!TextUtils.isEmpty(str5))
        str12 = str5;
      if (!str12.equals(str5));
      for (String str14 = k.a(paramContext.getContentResolver(), str12); ; str14 = str12)
      {
        String str15 = str13.trim();
        a.a(paramContext).a(str8, str14, i, str15, j, 0, l);
        new GetNewMessagesTask().b(paramContext);
        return;
        i = Integer.valueOf(str9).intValue();
        break label170;
        label337: j = Integer.valueOf(str3).intValue();
        break label178;
        label350: l = Long.valueOf(str10).longValue();
        break label189;
        label363: str12 = "";
        str13 = str1;
        break label253;
        if ("true".equals(str2))
        {
          String str7 = localBundle.getString("contact_value");
          KeyguardManager localKeyguardManager = (KeyguardManager)paramContext.getSystemService("keyguard");
          if ((!TextNowApp.c()) && (localu.z()))
          {
            if ((!localKeyguardManager.inKeyguardRestrictedInputMode()) || (!localu.A()))
              break label497;
            if (j == 0)
              break label503;
          }
          label497: label503: for (Intent localIntent = new Intent(paramContext, QuickReplyKeyGuardActivity.class); ; localIntent = new Intent(paramContext, QuickReplyActivityBase.class))
          {
            localIntent.addFlags(268435456);
            localIntent.putExtra("extra_outgoing_contact_value", str7);
            localIntent.putExtra("extra_source", 0);
            paramContext.startActivity(localIntent);
            new GetNewMessagesTask().b(paramContext);
            return;
            j = 0;
            break;
          }
        }
        if (str4 != null)
        {
          new StringBuilder().append("incoming call received, caller number: ").append(str4).toString();
          h.f();
          return;
        }
        if ((str1 != null) && (str3 == null))
        {
          a.a(paramContext).b(str1);
          new GetUserInfoTask(localu.b()).b(paramContext);
          if (TextUtils.isEmpty(new s(paramContext).f()))
            break;
          new GetSubscriptionTask(localu.b()).b(paramContext);
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
              if ((h.a().p() != null) || (!b.n(paramContext)))
              {
                new AcceptCallTask(str6, false).b(paramContext);
                return;
              }
            }
            catch (Exception localException)
            {
              new SpeedTestTask(new p(paramContext), null, str6).b(paramContext);
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
        new GetUserInfoTask(localu.b()).b(paramContext);
        return;
      }
      label795: str12 = str11;
      str13 = "";
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.push.PushMessageHandler
 * JD-Core Version:    0.6.2
 */