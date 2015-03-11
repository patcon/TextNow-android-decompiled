package com.enflick.android.TextNow.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.WelcomeActivity;
import textnow.u.d;
import textnow.u.f;

public class TNWidget
{
  public static final String WIDGET_ACTION_CONVO = "widget_action_convo";
  public static final String WIDGET_ACTION_DIALER = "widget_action_dialer";
  public static final String WIDGET_ACTION_LAUNCH = "widget_action_launch";
  private static PendingIntent sCreatePending;
  private static PendingIntent sFbPending;
  private static PendingIntent sLoginPending;
  private int mId;
  private String mName;

  public TNWidget(String paramString, int paramInt)
  {
    this.mName = paramString;
    this.mId = paramInt;
  }

  public static Intent createConversationIntent(f paramf, Context paramContext, TNWidget.MessageType paramMessageType, String paramString)
  {
    int i = 1;
    switch (1.$SwitchMap$com$enflick$android$TextNow$widget$TNWidget$MessageType[paramMessageType.ordinal()])
    {
    case 1:
    default:
    case 2:
    }
    while (true)
    {
      Intent localIntent = new Intent(paramContext, MainActivity.class);
      localIntent.putExtra("extra_msg_view_type", i);
      localIntent.putExtra("extra_selected_convo", paramf);
      localIntent.putExtra("extra_launched_from_widget", paramString);
      localIntent.setAction("widget_action_convo");
      return localIntent;
      i = 2;
    }
  }

  public static PendingIntent getCreateAccountIntent(Context paramContext)
  {
    if (sCreatePending == null)
    {
      Intent localIntent = new Intent(paramContext, WelcomeActivity.class);
      localIntent.setAction("action_create_account");
      sCreatePending = PendingIntent.getActivity(paramContext, 0, localIntent, 134217728);
    }
    return sCreatePending;
  }

  public static PendingIntent getDialerIntent(d paramd, Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent(paramContext, MainActivity.class);
    localIntent.putExtra("extra_show_dialer", true);
    localIntent.putExtra("extra_dialer_contact", paramd);
    localIntent.putExtra("extra_launched_from_widget", paramString);
    localIntent.setAction("widget_action_dialer");
    return PendingIntent.getActivity(paramContext, paramInt, localIntent, 134217728);
  }

  public static PendingIntent getFacebookIntent(Context paramContext)
  {
    if (sFbPending == null)
    {
      Intent localIntent = new Intent(paramContext, WelcomeActivity.class);
      localIntent.setAction("action_login_facebook");
      sFbPending = PendingIntent.getActivity(paramContext, 0, localIntent, 134217728);
    }
    return sFbPending;
  }

  public static PendingIntent getLaunchIntent(Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, WelcomeActivity.class);
    localIntent.putExtra("extra_from_notification", true);
    localIntent.addFlags(1048576);
    localIntent.setAction("widget_action_launch");
    return PendingIntent.getActivity(paramContext, 0, localIntent, 134217728);
  }

  public static PendingIntent getLoginIntent(Context paramContext)
  {
    if (sLoginPending == null)
    {
      Intent localIntent = new Intent(paramContext, WelcomeActivity.class);
      localIntent.setAction("action_login_standard");
      sLoginPending = PendingIntent.getActivity(paramContext, 0, localIntent, 134217728);
    }
    return sLoginPending;
  }

  public static PendingIntent getPendingConversationIntent(Context paramContext, int paramInt, TNWidget.MessageType paramMessageType, String paramString)
  {
    return PendingIntent.getActivity(paramContext, paramInt, createConversationIntent(null, paramContext, paramMessageType, paramString), 134217728);
  }

  public int getId()
  {
    return this.mId;
  }

  public String getName()
  {
    return this.mName;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.widget.TNWidget
 * JD-Core Version:    0.6.2
 */