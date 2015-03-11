package textnow.s;

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
import com.enflick.android.TextNow.activities.av;
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
import textnow.v.z;
import textnow.z.p;
import textnow.z.u;

public class a extends av
  implements View.OnClickListener, FlurryAdListener
{
  private View a;
  private View b;
  private boolean f;
  private boolean g;
  private boolean h = false;
  private ViewGroup i;
  private ITremor j;
  private IAdcolony k;
  private IVungle l;
  private ISupersonic m;
  private ITapjoy n;

  public static a a()
  {
    return new a();
  }

  private void c()
  {
    try
    {
      if (this.j != null)
      {
        if ((com.enflick.android.TextNow.ads.b.a("EARN_CREDITS_VIDEO")) || ((this.k != null) && (this.k.isReady("vz50bf79f808d846f1974882"))))
          break label132;
        IVungle localIVungle = this.l;
        i1 = 0;
        if (localIVungle != null)
        {
          boolean bool = this.l.isVideoAvailable();
          i1 = 0;
          if (bool)
            break label132;
        }
        if ((i1 != 0) && (this.j.showAd(this.d, 1118)))
        {
          this.h = false;
          return;
        }
      }
      this.h = true;
      if (!g())
      {
        d();
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        this.h = true;
        if (g())
          break;
        d();
        return;
        label132: int i1 = 1;
      }
    }
  }

  private void d()
  {
    if (!com.enflick.android.TextNow.ads.b.a("EARN_CREDITS_VIDEO"))
    {
      this.d.a(2131296428, true);
      com.enflick.android.TextNow.ads.b.a(this.d, "EARN_CREDITS_VIDEO", this.i, FlurryAdSize.FULLSCREEN);
      return;
    }
    com.enflick.android.TextNow.ads.b.a(this.d, "EARN_CREDITS_VIDEO", this.i);
  }

  private boolean f()
  {
    if ((this.l != null) && (this.l.isVideoAvailable()))
      return this.l.playAd();
    return false;
  }

  private boolean g()
  {
    if (this.k != null)
      return this.k.showAd("vz50bf79f808d846f1974882");
    return false;
  }

  private void h()
  {
    int i1 = 1;
    String str = new p(this.d).A();
    if ((textnow.v.b.f(this.d)) || (this.g));
    while (true)
    {
      int i2;
      try
      {
        if (("supersonic".equalsIgnoreCase(str)) && (this.m != null))
        {
          this.m.showOfferwall(this.d, "2fa5bfad", this.c.b(), null);
          i2 = i1;
          if ((i2 != 0) || (this.n == null))
            break label197;
          this.n.showOffersWithCurrencyID("df20c47d-1920-45fb-abcd-2fe2db59adc0", false);
          if (i1 == 0)
            this.d.b(2131296432);
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        i2 = 0;
        continue;
      }
      if ((this.d == null) || (!this.d.isFinishing()))
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
        localBuilder.setTitle(2131296744).setMessage(2131296745).setNegativeButton(2131296425, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        }).setPositiveButton(2131296427, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            a.b(a.this, true);
            a.i(a.this);
          }
        });
        localBuilder.show();
        return;
        label197: i1 = i2;
      }
    }
  }

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final void b()
  {
    this.h = true;
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

  public final String l()
  {
    return "/Earn_Credits";
  }

  public final String m()
  {
    if (z.d(this.d))
      return null;
    return this.d.getString(2131296716);
  }

  public final int n()
  {
    return 2131558823;
  }

  public final boolean o()
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
    case 2131558706:
      do
      {
        return;
        com.enflick.android.TextNow.ads.b.a("earn_credits", "type", "video");
        if (textnow.v.b.f(getActivity()))
        {
          c();
          return;
        }
        if (this.f)
        {
          c();
          return;
        }
      }
      while ((this.d != null) && (this.d.isFinishing()));
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
      localBuilder.setTitle(2131296744).setMessage(2131296745).setNegativeButton(2131296425, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      }).setPositiveButton(2131296427, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          a.a(a.this, true);
          a.h(a.this);
        }
      });
      localBuilder.show();
      return;
    case 2131558711:
    }
    com.enflick.android.TextNow.ads.b.a("earn_credits", "type", "offer");
    h();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    try
    {
      l3 = System.currentTimeMillis();
      localCustomLoader = CustomLoader.newVideoLoader(this.d, "com.enflick.android.TextNow.customloader.wrappers.video.TremorWrapper");
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        long l3;
        CustomLoader localCustomLoader;
        this.j = ((ITremor)localCustomLoader.loadWrapper(ITremor.class, "com.enflick.android.TextNow.customloader.wrappers.video.TremorWrapper"));
        try
        {
          label39: this.k = ((IAdcolony)localCustomLoader.loadWrapper(IAdcolony.class, "com.enflick.android.TextNow.customloader.wrappers.video.AdcolonyWrapper"));
          try
          {
            label56: this.l = ((IVungle)localCustomLoader.loadWrapper(IVungle.class, "com.enflick.android.TextNow.customloader.wrappers.video.VungleWrapper"));
            try
            {
              label73: this.m = ((ISupersonic)localCustomLoader.loadWrapper(ISupersonic.class, "com.enflick.android.TextNow.customloader.wrappers.video.SupersonicWrapper"));
              try
              {
                label90: this.n = ((ITapjoy)localCustomLoader.loadWrapper(ITapjoy.class, "com.enflick.android.TextNow.customloader.wrappers.video.TapjoyWrapper"));
                label107: new StringBuilder().append("sdk loading completed, took ").append(System.currentTimeMillis() - l3).append("ms").toString();
                while (true)
                {
                  if ((textnow.v.a.a) && (this.n != null))
                    this.n.enableLogging(true);
                  HashMap localHashMap = new HashMap();
                  localHashMap.put("userId", this.c.b());
                  com.enflick.android.TextNow.ads.b.a(localHashMap);
                  FlurryAds.setAdListener(this);
                  System.currentTimeMillis();
                  long l1 = System.currentTimeMillis();
                  if (this.k != null)
                  {
                    this.k.configure(this.d, textnow.v.b.a(this.d) + ",skippable", "app8c9e08dcc17c45919c91b8", "vz50bf79f808d846f1974882");
                    this.k.setCustomID(this.c.b());
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
                  if (this.j != null)
                  {
                    this.j.initialize(this.d, "475094");
                    this.j.updateSettings(this.c.o(), this.c.q());
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
    View localView = paramLayoutInflater.inflate(2130903125, null);
    this.a = localView.findViewById(2131558706);
    this.a.setOnClickListener(this);
    if (textnow.v.a.a)
      this.a.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          a.a(a.this);
          return true;
        }
      });
    this.b = localView.findViewById(2131558711);
    this.b.setOnClickListener(this);
    if (textnow.v.a.a)
      this.b.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          a.b(a.this);
          return true;
        }
      });
    this.i = paramViewGroup;
    com.enflick.android.TextNow.ads.b.a(this.d, "EARN_CREDITS_VIDEO", this.i, FlurryAdSize.FULLSCREEN);
    return localView;
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.j != null)
      this.j.destroy();
    if (this.m != null)
      this.m.release(this.d);
    com.enflick.android.TextNow.ads.b.b(this.d, "EARN_CREDITS_VIDEO", this.i);
  }

  public void onPause()
  {
    super.onPause();
    if (this.k != null)
      this.k.pause();
    if (this.l != null)
      this.l.onPause();
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
    if (this.k != null)
      this.k.resume(this.d);
    if (this.l != null)
      this.l.onResume();
  }

  public void onStart()
  {
    super.onStart();
    if (this.j != null)
      this.j.start();
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
    if (!this.h);
    do
    {
      return;
      this.d.v();
    }
    while (f());
    this.d.b(2131296734);
  }

  public void spaceDidReceiveAd(String paramString)
  {
    new StringBuilder().append("space ").append(paramString).append(" received ad").toString();
    if (!this.h)
      return;
    this.d.v();
    new Handler().postDelayed(new Runnable()
    {
      public final void run()
      {
        com.enflick.android.TextNow.ads.b.a(a.x(a.this), "EARN_CREDITS_VIDEO", a.m(a.this));
      }
    }
    , 200L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.s.a
 * JD-Core Version:    0.6.2
 */