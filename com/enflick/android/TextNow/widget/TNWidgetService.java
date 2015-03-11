package com.enflick.android.TextNow.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import android.widget.RemoteViewsService.RemoteViewsFactory;

public class TNWidgetService extends RemoteViewsService
{
  public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent paramIntent)
  {
    if (paramIntent.hasExtra("EXTRA_WIDGET_NAME"))
    {
      String str = paramIntent.getStringExtra("EXTRA_WIDGET_NAME");
      new StringBuilder().append("Name: ").append(str).toString();
      if (str.equals("CONVO_WIDGET"))
        return new ConversationsWidgetFactory(getApplicationContext(), paramIntent);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.widget.TNWidgetService
 * JD-Core Version:    0.6.2
 */