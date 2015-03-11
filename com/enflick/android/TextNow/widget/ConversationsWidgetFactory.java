package com.enflick.android.TextNow.widget;

import android.annotation.TargetApi;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.content.d;
import android.support.v4.content.j;
import android.support.v4.content.l;
import android.text.TextUtils;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import com.enflick.android.TextNow.activities.phone.n;
import com.enflick.android.TextNow.activities.phone.w;
import cz.acrobits.libsoftphone.data.Call.State;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONObject;
import textnow.v.b;
import textnow.v.o;
import textnow.v.z;
import textnow.z.u;

@TargetApi(11)
public class ConversationsWidgetFactory
  implements l<Cursor>, RemoteViewsService.RemoteViewsFactory
{
  private int appWidgetId;
  private Context ctxt = null;
  private Cursor mCursor;
  private d mCursorLoader;
  private u mUserInfo;

  public ConversationsWidgetFactory(Context paramContext, Intent paramIntent)
  {
    this.ctxt = paramContext;
    this.mCursorLoader = textnow.z.h.a(paramContext, 4);
    this.mCursorLoader.registerListener(0, this);
    this.mCursorLoader.startLoading();
    this.mUserInfo = new u(paramContext);
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
    textnow.z.h localh;
    int i;
    String str1;
    String str2;
    int j;
    int k;
    boolean bool1;
    int m;
    if ((this.mCursor != null) && (this.mCursor.moveToPosition(paramInt)))
    {
      localRemoteViews = new RemoteViews(this.ctxt.getPackageName(), 2130903109);
      localh = new textnow.z.h(this.mCursor);
      i = localh.d();
      str1 = localh.c();
      str2 = localh.e();
      j = localh.j();
      k = localh.k();
      bool1 = str1.equalsIgnoreCase("support@enflick.com");
      if (bool1)
      {
        localRemoteViews.setTextViewText(2131558631, str1);
        m = 0;
        if (i != 2)
          break label264;
      }
    }
    while (true)
    {
      try
      {
        com.enflick.android.TextNow.activities.phone.h localh1 = com.enflick.android.TextNow.activities.phone.h.a();
        w localw1 = localh1.p();
        localh1.q();
        Call.State localState = localh1.y();
        Iterator localIterator = localh1.G().iterator();
        if (localIterator.hasNext())
        {
          w localw2 = (w)localIterator.next();
          if ((localw1 == null) || (!localh.c().equals(localw2.b().a())))
            break label1011;
          boolean bool2 = com.enflick.android.TextNow.activities.phone.h.c(localState);
          if ((!bool2) || (localw1 == null))
            break label1011;
          i1 = 1;
          m = i1;
          continue;
          if (TextUtils.isEmpty(str2))
          {
            if (i == 2)
              str1 = b.f(str1);
            localRemoteViews.setTextViewText(2131558631, str1);
            break;
          }
          localRemoteViews.setTextViewText(2131558631, str2);
        }
      }
      catch (n localn)
      {
      }
      label264: if (m != 0)
      {
        localRemoteViews.setViewVisibility(2131558633, 0);
        localRemoteViews.setViewVisibility(2131558635, 8);
        localRemoteViews.setViewVisibility(2131558638, 8);
        localRemoteViews.setOnClickFillInIntent(2131558630, TNWidget.createConversationIntent(localh, this.ctxt, TNWidget.MessageType.EXISTING, "ConversationsWidgetProvider"));
        return localRemoteViews;
      }
      localRemoteViews.setViewVisibility(2131558633, 8);
      localRemoteViews.setViewVisibility(2131558635, 0);
      switch (j)
      {
      default:
        localRemoteViews.setTextViewText(2131558637, "Message");
        localRemoteViews.setViewVisibility(2131558636, 8);
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
        int n = localh.i();
        label448: label484: Object localObject;
        if (n > 99)
        {
          localRemoteViews.setTextViewText(2131558638, "*");
          localRemoteViews.setViewVisibility(2131558638, 0);
          if (!bool1)
            break label874;
          localRemoteViews.setImageViewBitmap(2131558557, textnow.v.f.a(BitmapFactory.decodeResource(this.ctxt.getResources(), 2130837562), z.a(this.ctxt, 48), 0));
          localRemoteViews.setTextViewText(2131558632, b.a(localh.g(), this.mUserInfo.r()));
          break;
          if (k == 1);
          for (String str6 = "Photo received"; ; str6 = "Photo sent")
          {
            localRemoteViews.setTextViewText(2131558637, str6);
            localRemoteViews.setViewVisibility(2131558636, 8);
            break;
          }
          localObject = localh.f();
          if (localObject == null);
        }
        try
        {
          JSONObject localJSONObject = new JSONObject((String)localObject);
          if (localJSONObject.has("string"))
          {
            String str5 = localJSONObject.getString("string");
            localObject = str5;
          }
          label592: if ((localObject != null) && (((String)localObject).length() > 100))
            localObject = ((String)localObject).substring(0, 100);
          localRemoteViews.setTextViewText(2131558637, (CharSequence)localObject);
          while (true)
          {
            localRemoteViews.setViewVisibility(2131558636, 8);
            break;
            localRemoteViews.setTextViewText(2131558637, "Message");
          }
          String str4 = localh.f();
          if ((str4 != null) && (str4.length() > 100))
            str4 = str4.substring(0, 100);
          localRemoteViews.setTextViewText(2131558637, str4);
          localRemoteViews.setViewVisibility(2131558636, 8);
          continue;
          localRemoteViews.setTextViewText(2131558637, this.ctxt.getString(2131296555));
          localRemoteViews.setImageViewResource(2131558636, 2130837981);
          localRemoteViews.setViewVisibility(2131558636, 0);
          continue;
          localRemoteViews.setTextViewText(2131558637, this.ctxt.getString(2131296764));
          localRemoteViews.setImageViewResource(2131558636, 2130837950);
          localRemoteViews.setViewVisibility(2131558636, 0);
          continue;
          localRemoteViews.setTextViewText(2131558637, this.ctxt.getString(2131296765));
          localRemoteViews.setImageViewResource(2131558636, 2130837950);
          localRemoteViews.setViewVisibility(2131558636, 0);
          continue;
          localRemoteViews.setTextViewText(2131558637, this.ctxt.getString(2131296763));
          localRemoteViews.setImageViewResource(2131558636, 2130837976);
          localRemoteViews.setViewVisibility(2131558636, 0);
          continue;
          if (n > 0)
          {
            localRemoteViews.setTextViewText(2131558638, String.valueOf(n));
            localRemoteViews.setViewVisibility(2131558638, 0);
            break label448;
          }
          localRemoteViews.setViewVisibility(2131558638, 8);
          break label448;
          label874: String str3 = localh.h();
          if ((localh.d() == 5) || (textnow.z.h.c(str3)))
          {
            localRemoteViews.setImageViewBitmap(2131558557, textnow.v.f.a(BitmapFactory.decodeResource(this.ctxt.getResources(), 2130837558), z.a(this.ctxt, 48), 0));
            break label484;
          }
          Bitmap localBitmap = o.a(this.ctxt).a(Uri.parse(str3), 2130837558, true, true);
          if (localBitmap != null)
          {
            localRemoteViews.setImageViewBitmap(2131558557, localBitmap);
            break label484;
          }
          localRemoteViews.setImageViewBitmap(2131558557, textnow.v.f.a(BitmapFactory.decodeResource(this.ctxt.getResources(), 2130837558), z.a(this.ctxt, 48), 0));
          break label484;
          return null;
        }
        catch (Exception localException)
        {
          break label592;
        }
      }
      label1011: int i1 = m;
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

  public void onLoadComplete(j<Cursor> paramj, Cursor paramCursor)
  {
    this.mCursor = paramCursor;
    AppWidgetManager.getInstance(this.ctxt).notifyAppWidgetViewDataChanged(this.appWidgetId, 2131559038);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.widget.ConversationsWidgetFactory
 * JD-Core Version:    0.6.2
 */