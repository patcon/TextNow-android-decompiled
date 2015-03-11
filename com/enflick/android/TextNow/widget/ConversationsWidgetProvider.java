package com.enflick.android.TextNow.widget;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.ads.b;
import textnow.z.u;

@TargetApi(11)
public class ConversationsWidgetProvider extends TNWidgetProvider
{
  private static final int REQUEST_CODE = 1;
  public static final String WIDGET_NAME = "ConversationsWidgetProvider";
  public static final String WidgetName = "CONVO_WIDGET";

  public void onDisabled(Context paramContext)
  {
    super.onDisabled(paramContext);
  }

  public void onEnabled(Context paramContext)
  {
    super.onEnabled(paramContext);
    b.a("add_widget", "widget_type", "conversation");
  }

  protected void processWidget(Context paramContext, int paramInt, AppWidgetManager paramAppWidgetManager)
  {
    Intent localIntent = new Intent(paramContext, TNWidgetService.class);
    localIntent.putExtra("appWidgetId", paramInt);
    localIntent.putExtra("EXTRA_WIDGET_NAME", "CONVO_WIDGET");
    localIntent.setData(Uri.parse(localIntent.toUri(1)));
    RemoteViews localRemoteViews = new RemoteViews(paramContext.getPackageName(), 2130903221);
    u localu = new u(paramContext);
    if ((localu.l()) && (!TextUtils.isEmpty(localu.m())))
    {
      localRemoteViews.setPendingIntentTemplate(2131559038, PendingIntent.getActivity(paramContext, 0, new Intent(paramContext, MainActivity.class), 134217728));
      localRemoteViews.setViewVisibility(2131559039, 8);
      localRemoteViews.setViewVisibility(2131559038, 0);
      localRemoteViews.setViewVisibility(2131559035, 0);
      localRemoteViews.setViewVisibility(2131559036, 0);
      localRemoteViews.setRemoteAdapter(paramInt, 2131559038, localIntent);
      localRemoteViews.setOnClickPendingIntent(2131559036, TNWidget.getPendingConversationIntent(paramContext, 1, TNWidget.MessageType.NEW, "ConversationsWidgetProvider"));
      localRemoteViews.setOnClickPendingIntent(2131559035, TNWidget.getDialerIntent(null, paramContext, 1, "ConversationsWidgetProvider"));
      localRemoteViews.setOnClickPendingIntent(2131559034, TNWidget.getLaunchIntent(paramContext));
    }
    while (true)
    {
      paramAppWidgetManager.updateAppWidget(paramInt, localRemoteViews);
      return;
      localRemoteViews.setViewVisibility(2131559039, 0);
      localRemoteViews.setViewVisibility(2131559038, 8);
      localRemoteViews.setViewVisibility(2131559035, 8);
      localRemoteViews.setViewVisibility(2131559036, 8);
      localRemoteViews.setOnClickPendingIntent(2131559037, TNWidget.getLaunchIntent(paramContext));
      localRemoteViews.setOnClickPendingIntent(2131559041, TNWidget.getLoginIntent(paramContext));
      localRemoteViews.setOnClickPendingIntent(2131559042, TNWidget.getCreateAccountIntent(paramContext));
      localRemoteViews.setOnClickPendingIntent(2131559040, TNWidget.getFacebookIntent(paramContext));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.widget.ConversationsWidgetProvider
 * JD-Core Version:    0.6.2
 */