package com.enflick.android.TextNow.widget;

import android.annotation.TargetApi;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.content.l;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import com.enflick.android.TextNow.activities.phone.s;
import cz.acrobits.libsoftphone.data.Call.State;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONObject;
import textnow.q.b;
import textnow.u.f;
import textnow.u.r;

@TargetApi(11)
public class ConversationsWidgetFactory
  implements l<Cursor>, RemoteViewsService.RemoteViewsFactory
{
  private int appWidgetId;
  private Context ctxt = null;
  private Cursor mCursor;
  private android.support.v4.content.d mCursorLoader;
  private r mUserInfo;

  public ConversationsWidgetFactory(Context paramContext, Intent paramIntent)
  {
    this.ctxt = paramContext;
    this.mCursorLoader = f.a(paramContext, 4);
    this.mCursorLoader.registerListener(0, this);
    this.mCursorLoader.startLoading();
    this.mUserInfo = new r(paramContext);
    this.appWidgetId = paramIntent.getIntExtra("appWidgetId", 0);
  }

  public int getCount()
  {
    if (this.mCursor != null)
      return this.mCursor.getCount();
    return 0;
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public RemoteViews getLoadingView()
  {
    return null;
  }

  public RemoteViews getViewAt(int paramInt)
  {
    RemoteViews localRemoteViews;
    f localf;
    int i;
    String str1;
    String str2;
    int j;
    int k;
    boolean bool1;
    int m;
    if ((this.mCursor != null) && (this.mCursor.moveToPosition(paramInt)))
    {
      localRemoteViews = new RemoteViews(this.ctxt.getPackageName(), 2130903097);
      localf = new f(this.mCursor);
      i = localf.d();
      str1 = localf.c();
      str2 = localf.e();
      j = localf.j();
      k = localf.k();
      bool1 = str1.equalsIgnoreCase("support@enflick.com");
      if (bool1)
      {
        localRemoteViews.setTextViewText(2131165365, str1);
        m = 0;
        if (i != 2)
          break label264;
      }
    }
    while (true)
    {
      try
      {
        com.enflick.android.TextNow.activities.phone.d locald = com.enflick.android.TextNow.activities.phone.d.a();
        s locals1 = locald.p();
        locald.q();
        Call.State localState = locald.y();
        Iterator localIterator = locald.G().iterator();
        if (localIterator.hasNext())
        {
          s locals2 = (s)localIterator.next();
          if ((locals1 == null) || (!localf.c().equals(locals2.b().a())))
            break label876;
          boolean bool2 = com.enflick.android.TextNow.activities.phone.d.c(localState);
          if ((!bool2) || (locals1 == null))
            break label876;
          i1 = 1;
          m = i1;
          continue;
          if (TextUtils.isEmpty(str2))
          {
            if (i == 2)
              str1 = b.f(str1);
            localRemoteViews.setTextViewText(2131165365, str1);
            break;
          }
          localRemoteViews.setTextViewText(2131165365, str2);
        }
      }
      catch (com.enflick.android.TextNow.activities.phone.j localj)
      {
      }
      label264: if (m != 0)
      {
        localRemoteViews.setViewVisibility(2131165367, 0);
        localRemoteViews.setViewVisibility(2131165369, 8);
        localRemoteViews.setViewVisibility(2131165366, 8);
        localRemoteViews.setOnClickFillInIntent(2131165364, TNWidget.createConversationIntent(localf, this.ctxt, TNWidget.MessageType.EXISTING, "ConversationsWidgetProvider"));
        return localRemoteViews;
      }
      localRemoteViews.setViewVisibility(2131165367, 8);
      localRemoteViews.setViewVisibility(2131165369, 0);
      switch (j)
      {
      default:
        localRemoteViews.setTextViewText(2131165371, "Message");
        localRemoteViews.setViewVisibility(2131165370, 8);
      case 2:
      case 0:
      case 1:
      case 8:
      case 100:
      case 101:
      case 102:
      case 103:
      }
      while (true)
      {
        int n = localf.i();
        label448: label461: Object localObject;
        if (n > 99)
        {
          localRemoteViews.setTextViewText(2131165366, "*");
          localRemoteViews.setViewVisibility(2131165366, 0);
          if (!bool1)
            break label849;
          localRemoteViews.setImageViewResource(2131165361, 2130837598);
          localRemoteViews.setTextViewText(2131165372, b.a(localf.g(), this.mUserInfo.t()));
          break;
          if (k == 1);
          for (String str5 = "Photo received"; ; str5 = "Photo sent")
          {
            localRemoteViews.setTextViewText(2131165371, str5);
            localRemoteViews.setViewVisibility(2131165370, 8);
            break;
          }
          localObject = localf.f();
          if (localObject == null);
        }
        try
        {
          JSONObject localJSONObject = new JSONObject((String)localObject);
          if (localJSONObject.has("string"))
          {
            String str4 = localJSONObject.getString("string");
            localObject = str4;
          }
          label567: if ((localObject != null) && (((String)localObject).length() > 100))
            localObject = ((String)localObject).substring(0, 100);
          localRemoteViews.setTextViewText(2131165371, (CharSequence)localObject);
          while (true)
          {
            localRemoteViews.setViewVisibility(2131165370, 8);
            break;
            localRemoteViews.setTextViewText(2131165371, "Message");
          }
          String str3 = localf.f();
          if ((str3 != null) && (str3.length() > 100))
            str3 = str3.substring(0, 100);
          localRemoteViews.setTextViewText(2131165371, str3);
          localRemoteViews.setViewVisibility(2131165370, 8);
          continue;
          localRemoteViews.setTextViewText(2131165371, this.ctxt.getString(2131493143));
          localRemoteViews.setImageViewResource(2131165370, 2130838020);
          localRemoteViews.setViewVisibility(2131165370, 0);
          continue;
          localRemoteViews.setTextViewText(2131165371, this.ctxt.getString(2131493361));
          localRemoteViews.setImageViewResource(2131165370, 2130837989);
          localRemoteViews.setViewVisibility(2131165370, 0);
          continue;
          localRemoteViews.setTextViewText(2131165371, this.ctxt.getString(2131493362));
          localRemoteViews.setImageViewResource(2131165370, 2130837989);
          localRemoteViews.setViewVisibility(2131165370, 0);
          continue;
          localRemoteViews.setTextViewText(2131165371, this.ctxt.getString(2131493360));
          localRemoteViews.setImageViewResource(2131165370, 2130838015);
          localRemoteViews.setViewVisibility(2131165370, 0);
          continue;
          if (n > 0)
          {
            localRemoteViews.setTextViewText(2131165366, String.valueOf(n));
            localRemoteViews.setViewVisibility(2131165366, 0);
            break label448;
          }
          localRemoteViews.setViewVisibility(2131165366, 8);
          break label448;
          label849: f.c(localf.h());
          localRemoteViews.setImageViewResource(2131165361, 2130837594);
          break label461;
          return null;
        }
        catch (Exception localException)
        {
          break label567;
        }
      }
      label876: int i1 = m;
    }
  }

  public int getViewTypeCount()
  {
    return 1;
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public void onCreate()
  {
  }

  public void onDataSetChanged()
  {
  }

  public void onDestroy()
  {
  }

  public void onLoadComplete(android.support.v4.content.j<Cursor> paramj, Cursor paramCursor)
  {
    this.mCursor = paramCursor;
    AppWidgetManager.getInstance(this.ctxt).notifyAppWidgetViewDataChanged(this.appWidgetId, 2131165743);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.widget.ConversationsWidgetFactory
 * JD-Core Version:    0.6.2
 */