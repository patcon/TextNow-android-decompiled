package textnow.u;

import android.content.Context;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.Banner;
import textnow.z.f;

public final class n extends p
{
  public n(Context paramContext)
  {
    super(paramContext, "TNSettingsInfo");
  }

  public final String a()
  {
    return d("test_file_url", "http://speedtest.textnow.me/100k");
  }

  public final void a(int paramInt)
  {
    new StringBuilder().append("Setting ping threshold to: ").append(paramInt).append("ms").toString();
    a("ping_threshold", paramInt);
  }

  public final void a(Settings.AndroidSettings.Banner paramBanner)
  {
    c("userinfo_banner_info", new f().a(paramBanner));
  }

  public final void a(String paramString)
  {
    new StringBuilder().append("Setting test file url: ").append(paramString).toString();
    c("test_file_url", paramString);
  }

  public final void a(o paramo, String paramString)
  {
    a("userinfo_debug_environment", paramo.a());
    if (paramString != null)
      c("server_custom", paramString);
  }

  public final void a(boolean paramBoolean)
  {
    new StringBuilder().append("setting vessel enabled to: ").append(paramBoolean).toString();
    a("settings_vessel_enabled", paramBoolean);
  }

  public final int b(int paramInt)
  {
    return b("ping_threshold", paramInt);
  }

  public final String b()
  {
    return d("settings_current_version", "0");
  }

  public final void b(String paramString)
  {
    new StringBuilder().append("Setting settings version to: ").append(paramString).toString();
    c("settings_current_version", paramString);
  }

  public final void b(boolean paramBoolean)
  {
    a("cdma_aggressive", paramBoolean);
  }

  public final String c()
  {
    return d("settings_sip_codec_order", "105,3,102,0,8,9");
  }

  public final void c(int paramInt)
  {
    new StringBuilder().append("Setting bandwidth threshold to: ").append(paramInt).append("kB/s").toString();
    a("bandwidth_threshold", paramInt);
  }

  public final void c(String paramString)
  {
    new StringBuilder().append("Setting codec order to: ").append(paramString).toString();
    c("settings_sip_codec_order", paramString);
  }

  public final int d(int paramInt)
  {
    return b("bandwidth_threshold", paramInt);
  }

  public final String d()
  {
    boolean bool = textnow.q.a.a;
    String str = null;
    if (bool)
      str = d("settings_sip_coder_order_override", null);
    return str;
  }

  public final void d(String paramString)
  {
    new StringBuilder().append("Setting override codec order to: ").append(paramString).toString();
    c("settings_sip_coder_order_override", paramString);
  }

  public final String e()
  {
    boolean bool = textnow.q.a.a;
    String str = null;
    if (bool)
      str = d("settings_sip_proxy", null);
    return str;
  }

  public final void e(int paramInt)
  {
    new StringBuilder().append("Setting download timeout to: ").append(paramInt).append("ms").toString();
    a("download_time_out", paramInt);
  }

  public final void e(String paramString)
  {
    c("settings_sip_proxy", paramString);
  }

  public final int f(int paramInt)
  {
    return b("download_time_out", paramInt);
  }

  public final String f()
  {
    boolean bool = textnow.q.a.a;
    String str = null;
    if (bool)
      str = d("sip_ip_override", null);
    return str;
  }

  public final void f(String paramString)
  {
    c("sip_ip_override", paramString);
  }

  public final void g()
  {
    a("userinfo_last_banner_dismiss_time", System.currentTimeMillis());
  }

  public final void g(String paramString)
  {
    c("offerwall", paramString);
  }

  public final boolean h()
  {
    Settings.AndroidSettings.Banner localBanner = i();
    if (localBanner == null);
    while (System.currentTimeMillis() - b("userinfo_last_banner_dismiss_time", 0L) <= 1000 * (60 * (60 * (24 * localBanner.interval))))
      return false;
    return true;
  }

  public final Settings.AndroidSettings.Banner i()
  {
    f localf = new f();
    String str = d("userinfo_banner_info", null);
    Settings.AndroidSettings.Banner localBanner = null;
    if (str != null)
      localBanner = (Settings.AndroidSettings.Banner)localf.a(str, new textnow.ad.a()
      {
      }
      .b());
    return localBanner;
  }

  public final o j()
  {
    switch (b("userinfo_debug_environment", o.c.a()))
    {
    case 2:
    default:
      return o.c;
    case 0:
      return o.a;
    case 1:
      return o.b;
    case 3:
    }
    return o.d;
  }

  public final String k()
  {
    return d("server_custom", null);
  }

  public final boolean l()
  {
    return b("cdma_aggressive", false).booleanValue();
  }

  public final String m()
  {
    return d("offerwall", "tapjoy");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.n
 * JD-Core Version:    0.6.2
 */