package textnow.n;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.customloader.CustomLoader;
import com.enflick.android.TextNow.customloader.IAdcolony;
import com.enflick.android.TextNow.customloader.ISupersonic;
import com.enflick.android.TextNow.customloader.ITapjoy;
import com.enflick.android.TextNow.customloader.ITremor;
import com.enflick.android.TextNow.customloader.IVungle;
import com.enflick.android.TextNow.tasks.c;
import com.flurry.android.FlurryAdListener;
import com.flurry.android.FlurryAdSize;
import com.flurry.android.FlurryAdType;
import com.flurry.android.FlurryAds;
import java.util.HashMap;
import java.util.Map;
import textnow.q.ad;
import textnow.q.b;
import textnow.u.n;
import textnow.u.r;

public class a extends ao
  implements View.OnClickListener, FlurryAdListener
{
  private View a;
  private View b;
  private boolean g;
  private boolean h;
  private boolean i = false;
  private ViewGroup j;
  private ITremor k;
  private IAdcolony l;
  private IVungle m;
  private ISupersonic n;
  private ITapjoy o;

  public static a a()
  {
    return new a();
  }

  private void c()
  {
    try
    {
      if (this.k != null)
      {
        if ((com.enflick.android.TextNow.ads.a.a("EARN_CREDITS_VIDEO")) || ((this.l != null) && (this.l.isReady("vz50bf79f808d846f1974882"))))
          break label132;
        IVungle localIVungle = this.m;
        i1 = 0;
        if (localIVungle != null)
        {
          boolean bool = this.m.isVideoAvailable();
          i1 = 0;
          if (bool)
            break label132;
        }
        if ((i1 != 0) && (this.k.showAd(this.e, 1118)))
        {
          this.i = false;
          return;
        }
      }
      this.i = true;
      if (!f())
      {
        d();
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        this.i = true;
        if (f())
          break;
        d();
        return;
        label132: int i1 = 1;
      }
    }
  }

  private void d()
  {
    if (!com.enflick.android.TextNow.ads.a.a("EARN_CREDITS_VIDEO"))
    {
      this.e.a(2131493021, true);
      com.enflick.android.TextNow.ads.a.a(this.e, "EARN_CREDITS_VIDEO", this.j, FlurryAdSize.FULLSCREEN);
      return;
    }
    com.enflick.android.TextNow.ads.a.a(this.e, "EARN_CREDITS_VIDEO", this.j);
  }

  private boolean e()
  {
    if ((this.m != null) && (this.m.isVideoAvailable()))
      return this.m.playAd();
    return false;
  }

  private boolean f()
  {
    if (this.l != null)
      return this.l.showAd("vz50bf79f808d846f1974882");
    return false;
  }

  private void g()
  {
    int i1 = 1;
    String str = new n(this.e).m();
    if ((b.g(this.e)) || (this.h));
    while (true)
    {
      int i2;
      try
      {
        if (("supersonic".equalsIgnoreCase(str)) && (this.n != null))
        {
          this.n.showOfferwall(this.e, "2fa5bfad", this.c.b(), null);
          i2 = i1;
          if ((i2 != 0) || (this.o == null))
            break label180;
          this.o.showOffersWithCurrencyID("df20c47d-1920-45fb-abcd-2fe2db59adc0", false);
          if (i1 == 0)
            this.e.c(2131493025);
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        i2 = 0;
        continue;
      }
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
      localBuilder.setTitle(2131493341).setMessage(2131493342).setNegativeButton(2131493019, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      }).setPositiveButton(2131493020, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          a.b(a.this, true);
          a.i(a.this);
        }
      });
      localBuilder.show();
      return;
      label180: i1 = i2;
    }
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final void b()
  {
    this.i = true;
    new Handler().postDelayed(new Runnable()
    {
      public final void run()
      {
        if (!a.j(a.this))
          a.k(a.this);
      }
    }
    , 200L);
  }

  public final String k()
  {
    return "/Earn_Credits";
  }

  public final String l()
  {
    if (ad.b(this.e))
      return null;
    return this.e.getString(2131493313);
  }

  public final int m()
  {
    return 2131165539;
  }

  public final boolean n()
  {
    return true;
  }

  public void onAdClicked(String paramString)
  {
  }

  public void onAdClosed(String paramString)
  {
  }

  public void onAdOpened(String paramString)
  {
  }

  public void onApplicationExit(String paramString)
  {
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131165435:
      com.enflick.android.TextNow.ads.a.a("earn_credits", "type", "video");
      if (b.g(getActivity()))
      {
        c();
        return;
      }
      if (this.g)
      {
        c();
        return;
      }
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
      localBuilder.setTitle(2131493341).setMessage(2131493342).setNegativeButton(2131493019, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      }).setPositiveButton(2131493020, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          a.a(a.this, true);
          a.h(a.this);
        }
      });
      localBuilder.show();
      return;
    case 2131165440:
    }
    com.enflick.android.TextNow.ads.a.a("earn_credits", "type", "offer");
    g();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    try
    {
      l3 = System.currentTimeMillis();
      localCustomLoader = CustomLoader.newVideoLoader(this.e, "com.enflick.android.TextNow.customloader.wrappers.video.TremorWrapper");
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        long l3;
        CustomLoader localCustomLoader;
        this.k = ((ITremor)localCustomLoader.loadWrapper(ITremor.class, "com.enflick.android.TextNow.customloader.wrappers.video.TremorWrapper"));
        try
        {
          label39: this.l = ((IAdcolony)localCustomLoader.loadWrapper(IAdcolony.class, "com.enflick.android.TextNow.customloader.wrappers.video.AdcolonyWrapper"));
          try
          {
            label56: this.m = ((IVungle)localCustomLoader.loadWrapper(IVungle.class, "com.enflick.android.TextNow.customloader.wrappers.video.VungleWrapper"));
            try
            {
              label73: this.n = ((ISupersonic)localCustomLoader.loadWrapper(ISupersonic.class, "com.enflick.android.TextNow.customloader.wrappers.video.SupersonicWrapper"));
              try
              {
                label90: this.o = ((ITapjoy)localCustomLoader.loadWrapper(ITapjoy.class, "com.enflick.android.TextNow.customloader.wrappers.video.TapjoyWrapper"));
                label107: new StringBuilder().append("sdk loading completed, took ").append(System.currentTimeMillis() - l3).append("ms").toString();
                while (true)
                {
                  if ((textnow.q.a.a) && (this.o != null))
                    this.o.enableLogging(true);
                  HashMap localHashMap = new HashMap();
                  localHashMap.put("userId", this.c.b());
                  com.enflick.android.TextNow.ads.a.a(localHashMap);
                  FlurryAds.setAdListener(this);
                  System.currentTimeMillis();
                  long l1 = System.currentTimeMillis();
                  if (this.l != null)
                  {
                    this.l.configure(this.e, b.a(this.e) + ",skippable", "app8c9e08dcc17c45919c91b8", "vz50bf79f808d846f1974882");
                    this.l.setCustomID(this.c.b());
                    new StringBuilder().append("Adcolony initialized in ").append(System.currentTimeMillis() - l1).append("ms").toString();
                  }
                  new Thread(new Runnable()
                  {
                    public final void run()
                    {
                      long l1 = System.currentTimeMillis();
                      if (a.c(a.this) != null)
                      {
                        a.c(a.this).init(a.d(a.this).getApplicationContext(), "com.enflick.android.TextNow");
                        new StringBuilder().append("Vungle initialized in ").append(System.currentTimeMillis() - l1).append("ms").toString();
                      }
                      long l2 = System.currentTimeMillis();
                      if (a.e(a.this) != null)
                      {
                        a.e(a.this).requestTapjoyConnect(a.f(a.this).getApplicationContext(), "df20c47d-1920-45fb-abcd-2fe2db59adc0", "qjEORgd2Ly7ln4g4msVC");
                        a.e(a.this).setUserID(a.g(a.this).b());
                        new StringBuilder().append("Tapjoy initialized in ").append(System.currentTimeMillis() - l2).append("ms").toString();
                      }
                    }
                  }).start();
                  long l2 = System.currentTimeMillis();
                  if (this.k != null)
                  {
                    this.k.initialize(this.e, "475094");
                    this.k.updateSettings(this.c.q(), this.c.s());
                    new StringBuilder().append("Tremor initialized in ").append(System.currentTimeMillis() - l2).append("ms").toString();
                  }
                  return;
                  localThrowable1 = localThrowable1;
                }
              }
              catch (Throwable localThrowable6)
              {
                break label107;
              }
            }
            catch (Throwable localThrowable5)
            {
              break label90;
            }
          }
          catch (Throwable localThrowable4)
          {
            break label73;
          }
        }
        catch (Throwable localThrowable3)
        {
          break label56;
        }
      }
      catch (Throwable localThrowable2)
      {
        break label39;
      }
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    View localView = paramLayoutInflater.inflate(2130903113, null);
    this.a = localView.findViewById(2131165435);
    this.a.setOnClickListener(this);
    if (textnow.q.a.a)
      this.a.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          a.a(a.this);
          return true;
        }
      });
    this.b = localView.findViewById(2131165440);
    this.b.setOnClickListener(this);
    if (textnow.q.a.a)
      this.b.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          a.b(a.this);
          return true;
        }
      });
    this.j = paramViewGroup;
    com.enflick.android.TextNow.ads.a.a(this.e, "EARN_CREDITS_VIDEO", this.j, FlurryAdSize.FULLSCREEN);
    return localView;
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.k != null)
      this.k.destroy();
    com.enflick.android.TextNow.ads.a.b(this.e, "EARN_CREDITS_VIDEO", this.j);
  }

  public void onPause()
  {
    super.onPause();
    if (this.l != null)
      this.l.pause();
    if (this.m != null)
      this.m.onPause();
  }

  public void onRenderFailed(String paramString)
  {
  }

  public void onRendered(String paramString)
  {
  }

  public void onResume()
  {
    super.onResume();
    if (this.l != null)
      this.l.resume(this.e);
    if (this.m != null)
      this.m.onResume();
  }

  public void onStart()
  {
    super.onStart();
    if (this.k != null)
      this.k.start();
  }

  public void onVideoCompleted(String paramString)
  {
  }

  public boolean shouldDisplayAd(String paramString, FlurryAdType paramFlurryAdType)
  {
    return true;
  }

  public void spaceDidFailToReceiveAd(String paramString)
  {
    new StringBuilder().append("space ").append(paramString).append(" failed to receive ad").toString();
    if (!this.i);
    do
    {
      return;
      this.e.r();
    }
    while (e());
    this.e.c(2131493331);
  }

  public void spaceDidReceiveAd(String paramString)
  {
    new StringBuilder().append("space ").append(paramString).append(" received ad").toString();
    if (!this.i)
      return;
    this.e.r();
    new Handler().postDelayed(new Runnable()
    {
      public final void run()
      {
        com.enflick.android.TextNow.ads.a.a(a.x(a.this), "EARN_CREDITS_VIDEO", a.m(a.this));
      }
    }
    , 200L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.n.a
 * JD-Core Version:    0.6.2
 */