package com.enflick.android.TextNow.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public abstract class TNWidgetProvider extends AppWidgetProvider
{
  public static final String EXTRA_WIDGET_NAME = "EXTRA_WIDGET_NAME";
  public static final String WIDGET_LOGIN_CHANGE = "com.enflick.android.TextNow.widget.WIDGET_LOGIN_CHANGE";
  protected static ConcurrentHashMap<Integer, TNWidget> mWidgets;

  public void onDeleted(Context paramContext, int[] paramArrayOfInt)
  {
    super.onDeleted(paramContext, paramArrayOfInt);
  }

  public void onDisabled(Context paramContext)
  {
    super.onDisabled(paramContext);
  }

  public void onEnabled(Context paramContext)
  {
    super.onEnabled(paramContext);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    super.onReceive(paramContext, paramIntent);
    new StringBuilder().append("Intent: ").append(paramIntent.getAction()).toString();
    if ((paramIntent.getAction().equals("com.enflick.android.TextNow.widget.WIDGET_LOGIN_CHANGE")) && (mWidgets != null) && (mWidgets.size() > 0))
    {
      Iterator localIterator = mWidgets.values().iterator();
      while (localIterator.hasNext())
      {
        TNWidget localTNWidget = (TNWidget)localIterator.next();
        if (localTNWidget.getName().equals(getClass().getSimpleName()))
          processWidget(paramContext, localTNWidget.getId(), AppWidgetManager.getInstance(paramContext));
      }
    }
  }

  public void onUpdate(Context paramContext, AppWidgetManager paramAppWidgetManager, int[] paramArrayOfInt)
  {
    if (mWidgets == null)
      mWidgets = new ConcurrentHashMap();
    for (int i = 0; i < paramArrayOfInt.length; i++)
    {
      if (mWidgets.get(Integer.valueOf(paramArrayOfInt[i])) == null)
        mWidgets.put(Integer.valueOf(paramArrayOfInt[i]), new TNWidget(getClass().getSimpleName(), paramArrayOfInt[i]));
      new StringBuilder().append("Parsing widget ").append(paramArrayOfInt[i]).toString();
      processWidget(paramContext, paramArrayOfInt[i], paramAppWidgetManager);
    }
    super.onUpdate(paramContext, paramAppWidgetManager, paramArrayOfInt);
  }

  protected abstract void processWidget(Context paramContext, int paramInt, AppWidgetManager paramAppWidgetManager);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.widget.TNWidgetProvider
 * JD-Core Version:    0.6.2
 */