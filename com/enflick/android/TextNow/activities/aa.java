package com.enflick.android.TextNow.activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Editable.Factory;
import android.text.TextUtils;
import com.enflick.android.TextNow.tasks.a;
import com.enflick.android.TextNow.views.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import textnow.v.b;
import textnow.v.o;
import textnow.v.z;
import textnow.z.h;
import textnow.z.u;

public final class aa
{
  public static ab a(Editable paramEditable)
  {
    Editable localEditable = Editable.Factory.getInstance().newEditable(paramEditable);
    k[] arrayOfk = (k[])localEditable.getSpans(0, localEditable.length(), k.class);
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = arrayOfk.length;
    for (int j = 0; j < i; j++)
    {
      k localk = arrayOfk[j];
      textnow.z.f localf4 = localk.a();
      if ((localf4.b() != 3) || (b.a(localf4.a())))
        if (localf4.b() == 2)
        {
          String str5 = b.b(localf4.a());
          if (str5 != null)
            localf4.a(str5);
        }
        else
        {
          if (!localHashSet.contains(localf4.a()))
          {
            localHashSet.add(localf4.a());
            localArrayList1.add(localf4);
          }
          localEditable.replace(localEditable.getSpanStart(localk), localEditable.getSpanEnd(localk), "");
        }
    }
    String[] arrayOfString = localEditable.toString().split(",");
    int k = arrayOfString.length;
    int m = 0;
    String str1;
    String str4;
    if (m < k)
    {
      str1 = arrayOfString[m].trim();
      if (!TextUtils.isEmpty(str1))
      {
        if (!str1.contains("@"))
          break label346;
        if (!b.a(str1))
          break label335;
        if (!str1.toLowerCase(Locale.US).endsWith("@textnow.me"))
          break label521;
        str4 = str1.substring(0, str1.indexOf("@"));
      }
    }
    for (int n = 1; ; n = 3)
    {
      textnow.z.f localf3 = new textnow.z.f(str4, n, "", null, true);
      if (!localHashSet.contains(str4))
      {
        localHashSet.add(str4);
        localArrayList1.add(localf3);
      }
      while (true)
      {
        m++;
        break;
        label335: localArrayList2.add(str1);
        continue;
        label346: if (b.b(str1.charAt(0)))
        {
          String str3 = str1 + "@textnow.me";
          textnow.z.f localf2 = new textnow.z.f(str3, 3, str3, null, true);
          if (!localHashSet.contains(str3))
          {
            localHashSet.add(str3);
            localArrayList1.add(localf2);
          }
        }
        else
        {
          if ("911".equals(b.e(str1)));
          for (String str2 = "911"; ; str2 = b.b(str1))
          {
            if (str2 == null)
              break label498;
            textnow.z.f localf1 = new textnow.z.f(str2, 2, "", null, true);
            if (localHashSet.contains(str2))
              break;
            localHashSet.add(str2);
            localArrayList1.add(localf1);
            break;
          }
          label498: localArrayList2.add(str1);
        }
      }
      return new ab(localArrayList1, localArrayList2);
      label521: str4 = str1;
    }
  }

  public static void a(Context paramContext, final h paramh)
  {
    new AsyncTask()
    {
      private Void a()
      {
        Intent localIntent1 = new Intent(aa.this, MainActivity.class);
        localIntent1.putExtra("extra_msg_view_type", 2);
        localIntent1.putExtra("extra_selected_cv", paramh.c());
        localIntent1.setAction("android.intent.action.MAIN");
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("android.intent.extra.shortcut.INTENT", localIntent1);
        String str;
        if ((paramh.d() == 2) && (TextUtils.isEmpty(paramh.e())))
          str = b.g(paramh.c());
        while (true)
        {
          if (str.length() > 12)
            str = str.substring(0, 12);
          localIntent2.putExtra("android.intent.extra.shortcut.NAME", str);
          o localo = o.a(aa.this);
          Uri localUri;
          label161: Object localObject;
          if (!h.c(paramh.h()))
          {
            localUri = Uri.parse(paramh.h());
            localObject = localo.a(localUri, 0, true, false);
            if (localObject != null)
              break label269;
          }
          try
          {
            Resources localResources = aa.this.getResources();
            int i;
            label202: Bitmap localBitmap;
            if (paramh.d() == 5)
            {
              i = 2130837862;
              localBitmap = BitmapFactory.decodeResource(localResources, i);
            }
            label269: for (localObject = localBitmap; ; localObject = textnow.v.f.a((Bitmap)localObject, Math.min(((Bitmap)localObject).getWidth(), z.a(aa.this, 48)), 1))
            {
              label215: localIntent2.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)localObject);
              localIntent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
              aa.this.sendBroadcast(localIntent2);
              return null;
              str = paramh.p();
              break;
              localUri = null;
              break label161;
              i = 2130837861;
              break label202;
            }
          }
          catch (Exception localException)
          {
            break label215;
          }
        }
      }
    }
    .execute(new Void[0]);
  }

  public static final void a(Context paramContext, h paramh, boolean paramBoolean)
  {
    if (paramh != null)
      new a(paramContext, paramh, null, null, Boolean.valueOf(paramBoolean), paramh.a()).execute(new Void[0]);
  }

  public static final void a(ao paramao, h paramh)
  {
    String str = paramh.m();
    Uri localUri;
    if (!TextUtils.isEmpty(str))
      localUri = Uri.parse(str);
    while (true)
    {
      Intent localIntent = new Intent("android.intent.action.RINGTONE_PICKER");
      z.a(localIntent, localUri, paramao, z.a(paramao, new u(paramao).u()));
      try
      {
        paramao.startActivityForResult(localIntent, 12);
        return;
        localUri = Uri.EMPTY;
      }
      catch (Exception localException)
      {
        paramao.b(2131296893);
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.aa
 * JD-Core Version:    0.6.2
 */