package com.enflick.android.TextNow.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.widget.RemoteViews;
import com.enflick.android.TextNow.ads.b;

public class ActionsWidgetProvider extends TNWidgetProvider
{
  private static final int REQUEST_CODE = 0;
  public static final String WIDGET_NAME = "ActionsWidgetProvider";

  public void onDisabled(Context paramContext)
  {
    super.onDisabled(paramContext);
  }

  public void onEnabled(Context paramContext)
  {
    super.onEnabled(paramContext);
    b.a("add_widget", "widget_type", "action");
  }

  protected void processWidget(Context paramContext, int paramInt, AppWidgetManager paramAppWidgetManager)
  {
    new StringBuilder().append("Processing Actions Widget #").append(paramInt).toString();
    RemoteViews localRemoteViews = new RemoteViews(paramContext.getPackageName(), 2130903220);
    localRemoteViews.setOnClickPendingIntent(2131559036, TNWidget.getPendingConversationIntent(paramContext, 0, TNWidget.MessageType.NEW, "ActionsWidgetProvider"));
    localRemoteViews.setOnClickPendingIntent(2131559035, TNWidget.getDialerIntent(null, paramContext, 0, "ActionsWidgetProvider"));
    localRemoteViews.setOnClickPendingIntent(2131559034, TNWidget.getLaunchIntent(paramContext));
    paramAppWidgetManager.updateAppWidget(paramInt, localRemoteViews);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.widget.ActionsWidgetProvider
 * JD-Core Version:    0.6.2
 */