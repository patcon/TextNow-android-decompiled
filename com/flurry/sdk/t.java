package com.flurry.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.flurry.android.FlurryAdSize;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import com.flurry.android.impl.ads.avro.protocol.v10.Configuration;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class t
{
  private static final String a = t.class.getSimpleName();
  private final FlurryAdModule b;
  private final w c;
  private final Map<String, String> d;
  private final Map<String, t.a> e;
  private Configuration f;
  private int g;
  private boolean h;

  public t(FlurryAdModule paramFlurryAdModule)
  {
    this.b = paramFlurryAdModule;
    this.c = new w();
    this.d = new HashMap();
    this.e = new HashMap();
  }

  private t.a a(String paramString)
  {
    try
    {
      t.a locala = (t.a)this.e.get(paramString);
      if (locala == null)
      {
        locala = new t.a(this, paramString);
        this.e.put(paramString, locala);
      }
      return locala;
    }
    finally
    {
    }
  }

  private void e()
  {
    try
    {
      Configuration localConfiguration = this.f;
      if (localConfiguration == null);
      while (true)
      {
        return;
        if (!this.h)
          break;
        eo.a(3, a, "Media player assets: download not necessary");
      }
    }
    finally
    {
    }
    if (this.g < 3);
    for (final String str1 = this.f.b().toString() + "android.zip"; ; str1 = "http://flurry.cachefly.net/vast/videocontrols/v1/android.zip")
    {
      final File localFile1 = do.a().b().getFileStreamPath(".flurryads.mediaassets");
      final SharedPreferences localSharedPreferences = do.a().b().getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0);
      String str2 = localSharedPreferences.getString("flurry_last_media_asset_url", null);
      if ((str2 != null) && (str2.equals(str1)) && (localFile1.exists()))
      {
        eo.a(3, a, "Media player assets: unchanged, download not necessary");
        this.h = true;
        break;
      }
      final File localFile2 = do.a().b().getFileStreamPath(".flurryads.mediaassets.tmp");
      localFile2.delete();
      eo.a(3, a, "Media player assets: attempting download from url: " + str1);
      at localat = new at(localFile2);
      localat.a(str1);
      localat.a(new as.a()
      {
        public void a(as paramAnonymousas)
        {
          if ((paramAnonymousas.a()) && (localFile2.exists()))
          {
            localFile1.delete();
            if (localFile2.renameTo(localFile1))
            {
              eo.a(3, t.d(), "Media player assets: download successful");
              SharedPreferences.Editor localEditor = localSharedPreferences.edit();
              localEditor.putString("flurry_last_media_asset_url", str1);
              localEditor.commit();
              t.a(t.this, true);
              return;
            }
            eo.a(3, t.d(), "Media player assets: couldn't rename tmp file (giving up)");
            return;
          }
          eo.a(3, t.d(), "Media player assets: download failed");
          if (ev.a().c())
            t.e(t.this);
          do.a().a(new ff()
          {
            public void a()
            {
              t.c(t.this);
            }
          }
          , 10000L);
        }
      });
      localat.d();
      break;
    }
  }

  public void a()
  {
    if (this.f == null)
    {
      a("", null, FlurryAdSize.BANNER_BOTTOM, true, null);
      return;
    }
    e();
  }

  public void a(String paramString, ViewGroup paramViewGroup, FlurryAdSize paramFlurryAdSize, boolean paramBoolean, AdUnit paramAdUnit)
  {
    eo.a(3, a, "requestAd: adSpaceName = " + paramString + ", viewGroup = " + paramViewGroup + ", size = " + paramFlurryAdSize + ", refresh = " + paramBoolean);
    a(paramString).a(paramViewGroup, paramFlurryAdSize, paramBoolean, paramAdUnit);
  }

  public void a(String paramString, List<AdUnit> paramList, int paramInt)
  {
    try
    {
      if ((!TextUtils.isEmpty(paramString)) && (paramList != null) && (paramList.size() > 0))
        t.a.a(a(paramString), paramList, paramInt);
      return;
    }
    finally
    {
    }
  }

  public void b()
  {
    Iterator localIterator = this.e.values().iterator();
    while (localIterator.hasNext())
      ((t.a)localIterator.next()).a();
    this.e.clear();
  }

  public File c()
  {
    if (this.h)
      return do.a().b().getFileStreamPath(".flurryads.mediaassets");
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.t
 * JD-Core Version:    0.6.2
 */