package com.enflick.android.TextNow.activities;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.enflick.android.TextNow.tasks.DownloadToFileTask;
import com.enflick.android.TextNow.tasks.c;
import java.io.File;
import textnow.bd.aq;
import textnow.bd.ar;
import textnow.bd.at;
import textnow.bd.ba;
import textnow.q.ad;
import textnow.q.g;
import textnow.q.h;
import textnow.u.k;

public class j extends ao
{
  private static ar a;
  private String b;
  private String g;
  private String h;
  private boolean i;
  private aq j;
  private at k;

  static
  {
    ar localar = new ar();
    a = localar;
    localar.h = Integer.valueOf(2130838032);
    a.i = Integer.valueOf(2130838033);
  }

  public static j a(k paramk)
  {
    j localj = new j();
    Bundle localBundle = new Bundle();
    localBundle.putString("remote_path", paramk.e());
    localBundle.putString("local_source", paramk.k());
    localBundle.putString("message_uri", paramk.a());
    localj.setArguments(localBundle);
    return localj;
  }

  private void a()
  {
    this.h = null;
    if (this.g != null)
      new AsyncTask()
      {
      }
      .execute(new Void[0]);
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int m = paramc.i();
    if (localClass == DownloadToFileTask.class)
    {
      h localh = ((DownloadToFileTask)paramc).b();
      String str = ((DownloadToFileTask)paramc).a();
      this.e.r();
      if (bool)
        if (localh == h.a)
          if (m == 404)
            this.e.c(2131493160);
      while (true)
      {
        return true;
        this.e.c(2131493159);
        continue;
        this.e.c(2131493400);
        continue;
        if (TextUtils.isEmpty(str))
        {
          this.e.c(2131493400);
        }
        else
        {
          this.i = true;
          this.e.supportInvalidateOptionsMenu();
        }
      }
    }
    return false;
  }

  protected final String k()
  {
    return "/Image_Preview";
  }

  protected final String l()
  {
    return this.e.getString(2131493353);
  }

  public final int m()
  {
    return 2131165537;
  }

  protected final boolean n()
  {
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getArguments();
    this.b = localBundle.getString("remote_path");
    this.g = localBundle.getString("message_uri");
    this.h = localBundle.getString("local_source");
    boolean bool;
    if ((!TextUtils.isEmpty(this.h)) && (g.b(this.e, this.h)))
      bool = true;
    while (true)
    {
      this.i = bool;
      try
      {
        this.j = aq.a(this);
        label79: this.k = new at()
        {
          public final void a(ImageView paramAnonymousImageView, Bitmap paramAnonymousBitmap, ba paramAnonymousba)
          {
            MainActivity localMainActivity = j.this.e;
            if ((paramAnonymousba == ba.b) || (paramAnonymousba == ba.c));
            for (boolean bool = true; ; bool = false)
            {
              ad.a(localMainActivity, paramAnonymousImageView, paramAnonymousBitmap, bool);
              return;
            }
          }
        };
        this.e.y();
        this.e.f(true);
        setHasOptionsMenu(true);
        return;
        bool = false;
      }
      catch (Exception localException)
      {
        break label79;
      }
    }
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131755014, paramMenu);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903128, null);
    ImageView localImageView = (ImageView)localView.findViewById(2131165495);
    boolean bool = TextUtils.isEmpty(this.h);
    int m = 0;
    String str;
    if (!bool)
    {
      if (!this.i)
        break label239;
      if (!this.h.startsWith("content://"))
        break label200;
      str = g.a(this.e, this.h);
      if (!TextUtils.isEmpty(str))
        break label132;
      this.i = false;
      this.e.supportInvalidateOptionsMenu();
      a();
    }
    while (true)
    {
      if (m == 0)
      {
        if (TextUtils.isEmpty(this.b))
          break;
        this.j.a(localImageView, this.b, a, this.k);
      }
      return localView;
      label132: if (str.toLowerCase().startsWith("http"))
      {
        this.i = false;
        this.e.supportInvalidateOptionsMenu();
        m = 0;
      }
      else
      {
        this.j.a(localImageView, Uri.fromFile(new File(str)).toString(), a, this.k);
        m = 1;
        continue;
        label200: this.j.a(localImageView, Uri.fromFile(new File(this.h)).toString(), a, this.k);
        m = 1;
        continue;
        label239: a();
        m = 0;
      }
    }
    localImageView.setImageResource(2130838032);
    return localView;
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    if (getActivity() != null)
    {
      this.e.z();
      this.e.f(false);
    }
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = true;
    switch (paramMenuItem.getItemId())
    {
    default:
      bool = super.onOptionsItemSelected(paramMenuItem);
    case 2131165783:
    }
    do
      return bool;
    while ((TextUtils.isEmpty(this.b)) || (this.g == null));
    this.e.a(2131493022, bool);
    new DownloadToFileTask(this.g, this.b, h.a).b(this.e);
    return bool;
  }

  public void onPrepareOptionsMenu(Menu paramMenu)
  {
    super.onPrepareOptionsMenu(paramMenu);
    if (this.i)
      new p(paramMenu).a(2131165783);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.j
 * JD-Core Version:    0.6.2
 */