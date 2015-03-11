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
import com.enflick.android.TextNow.ads.a;
import textnow.u.r;

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
    a.a("add_widget", "widget_type", "conversation");
  }

  protected void processWidget(Context paramContext, int paramInt, AppWidgetManager paramAppWidgetManager)
  {
    Intent localIntent = new Intent(paramContext, TNWidgetService.class);
    localIntent.putExtra("appWidgetId", paramInt);
    localIntent.putExtra("EXTRA_WIDGET_NAME", "CONVO_WIDGET");
    localIntent.setData(Uri.parse(localIntent.toUri(1)));
    RemoteViews localRemoteViews = new RemoteViews(paramContext.getPackageName(), 2130903205);
    r localr = new r(paramContext);
    if ((localr.l()) && (!TextUtils.isEmpty(localr.m())))
    {
      localRemoteViews.setPendingIntentTemplate(2131165743, PendingIntent.getActivity(paramContext, 0, new Intent(paramContext, MainActivity.class), 134217728));
      localRemoteViews.setViewVisibility(2131165744, 8);
      localRemoteViews.setViewVisibility(2131165743, 0);
      localRemoteViews.setViewVisibility(2131165740, 0);
      localRemoteViews.setViewVisibility(2131165741, 0);
      localRemoteViews.setRemoteAdapter(paramInt, 2131165743, localIntent);
      localRemoteViews.setOnClickPendingIntent(2131165741, TNWidget.getPendingConversationIntent(paramContext, 1, TNWidget.MessageType.NEW, "ConversationsWidgetProvider"));
      localRemoteViews.setOnClickPendingIntent(2131165740, TNWidget.getDialerIntent(null, paramContext, 1, "ConversationsWidgetProvider"));
      localRemoteViews.setOnClickPendingIntent(2131165739, TNWidget.getLaunchIntent(paramContext));
    }
    while (true)
    {
      paramAppWidgetManager.updateAppWidget(paramInt, localRemoteViews);
      return;
      localRemoteViews.setViewVisibility(2131165744, 0);
      localRemoteViews.setViewVisibility(2131165743, 8);
      localRemoteViews.setViewVisibility(2131165740, 8);
      localRemoteViews.setViewVisibility(2131165741, 8);
      localRemoteViews.setOnClickPendingIntent(2131165742, TNWidget.getLaunchIntent(paramContext));
      localRemoteViews.setOnClickPendingIntent(2131165746, TNWidget.getLoginIntent(paramContext));
      localRemoteViews.setOnClickPendingIntent(2131165747, TNWidget.getCreateAccountIntent(paramContext));
      localRemoteViews.setOnClickPendingIntent(2131165745, TNWidget.getFacebookIntent(paramContext));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.widget.ConversationsWidgetProvider
 * JD-Core Version:    0.6.2
 */