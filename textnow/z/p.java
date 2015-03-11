package textnow.z;

import android.content.Context;
import com.enflick.android.TextNow.api.responsemodel.Settings.AndroidSettings.Banner;
import textnow.af.f;

public final class p extends r
{
  public p(Context paramContext)
  {
    super(paramContext, "TNSettingsInfo");
  }

  public final String A()
  {
    return d("offerwall", "tapjoy");
  }

  public final void a(float paramFloat)
  {
    int i = b("call_rating", 0);
    a("call_rating_avg", (paramFloat + b() * i) / (i + 1));
    a("call_rating", i + 1);
  }

  public final void a(int paramInt)
  {
    new StringBuilder().append("Setting ping threshold to: ").append(paramInt).append("ms").toString();
    a("ping_threshold", paramInt);
  }

  public final void a(long paramLong)
  {
    a("last_call_rating_time", paramLong);
  }

  public final void a(String paramString)
  {
    new StringBuilder().append("Setting test file url: ").append(paramString).toString();
    c("test_file_url", paramString);
  }

  public final void a(q paramq, String paramString)
  {
    a("userinfo_debug_environment", paramq.a());
    if (paramString != null)
      c("server_custom", paramString);
  }

  public final void a(boolean paramBoolean)
  {
    a("force_call_rating", paramBoolean);
  }

  public final void a(Settings.AndroidSettings.Banner[] paramArrayOfBanner)
  {
    Settings.AndroidSettings.Banner[] arrayOfBanner = w();
    if (arrayOfBanner != null)
      for (int i = 0; i < paramArrayOfBanner.length; i++)
        if ((i < arrayOfBanner.length) && (arrayOfBanner[i] != null))
        {
          if (arrayOfBanner[i].lastDismissedTime > paramArrayOfBanner[i].lastDismissedTime)
            paramArrayOfBanner[i].lastDismissedTime = arrayOfBanner[i].lastDismissedTime;
          if (arrayOfBanner[i].firstDismissedTime > paramArrayOfBanner[i].firstDismissedTime)
            paramArrayOfBanner[i].firstDismissedTime = arrayOfBanner[i].firstDismissedTime;
        }
    c("banners_info", new f().a(paramArrayOfBanner));
  }

  public final boolean a()
  {
    return b("force_call_rating", false).booleanValue();
  }

  public final float b()
  {
    return b("call_rating_avg", 4.0F);
  }

  public final void b(float paramFloat)
  {
    a("call_rating_min_show_probability", paramFloat);
  }

  public final void b(int paramInt)
  {
    new StringBuilder().append("Setting ping threshold offset to: ").append(paramInt).append("ms").toString();
    a("ping_threshold_offset", paramInt);
  }

  public final void b(String paramString)
  {
    new StringBuilder().append("Setting settings version to: ").append(paramString).toString();
    c("settings_current_version", paramString);
  }

  public final void b(boolean paramBoolean)
  {
    new StringBuilder().append("setting vessel enabled to: ").append(paramBoolean).toString();
    a("settings_vessel_enabled", paramBoolean);
  }

  public final long c()
  {
    return b("last_call_rating_time", 0L);
  }

  public final void c(float paramFloat)
  {
    a("call_rating_max_show_probability", paramFloat);
  }

  public final void c(int paramInt)
  {
    a("rating_min_wait", paramInt);
  }

  public final void c(String paramString)
  {
    new StringBuilder().append("Setting codec order to: ").append(paramString).toString();
    c("settings_sip_codec_order", paramString);
  }

  public final void c(boolean paramBoolean)
  {
    a("cdma_aggressive", paramBoolean);
  }

  public final float d()
  {
    return b("call_rating_min_show_probability", 0.05F);
  }

  public final void d(float paramFloat)
  {
    a("change_sensitivity", paramFloat);
  }

  public final void d(int paramInt)
  {
    new StringBuilder().append("Setting max ping threshold to: ").append(paramInt).append("ms").toString();
    a("ping_max_threshold", paramInt);
  }

  public final void d(String paramString)
  {
    new StringBuilder().append("Setting override codec order to: ").append(paramString).toString();
    c("settings_sip_coder_order_override", paramString);
  }

  public final float e()
  {
    return b("call_rating_max_show_probability", 0.2F);
  }

  public final void e(float paramFloat)
  {
    a("satisfied_threshold", paramFloat);
  }

  public final void e(int paramInt)
  {
    new StringBuilder().append("Setting min ping threshold to: ").append(paramInt).append("ms").toString();
    a("ping_min_threshold", paramInt);
  }

  public final void e(String paramString)
  {
    c("settings_sip_proxy", paramString);
  }

  public final int f()
  {
    return b("ping_threshold", com.enflick.android.TextNow.activities.phone.a.a);
  }

  public final void f(int paramInt)
  {
    new StringBuilder().append("Setting bandwidth threshold to: ").append(paramInt).append("kB/s").toString();
    a("bandwidth_threshold", paramInt);
  }

  public final void f(String paramString)
  {
    c("sip_ip_override", paramString);
  }

  public final int g()
  {
    return b("ping_threshold_offset", 0);
  }

  public final void g(int paramInt)
  {
    new StringBuilder().append("Setting bandwidth threshold offset to: ").append(paramInt).append("kB/s").toString();
    a("bandwidth_threshold_offset", paramInt);
  }

  public final void g(String paramString)
  {
    c("offerwall", paramString);
  }

  public final int h()
  {
    int i = b("ping_max_threshold", com.enflick.android.TextNow.activities.phone.a.a);
    return Math.min(Math.max(m(), f() + b("ping_threshold_offset", 0)), i);
  }

  public final void h(int paramInt)
  {
    new StringBuilder().append("Setting max bandwidth threshold to: ").append(paramInt).append("ms").toString();
    a("bandwidth_max_threshold", paramInt);
  }

  public final int i()
  {
    int i = p();
    return Math.min(Math.max(b("bandwidth_min_threshold", com.enflick.android.TextNow.activities.phone.a.b), n() + b("bandwidth_threshold_offset", 0)), i);
  }

  public final void i(int paramInt)
  {
    new StringBuilder().append("Setting min bandwidth threshold to: ").append(paramInt).append("ms").toString();
    a("bandwidth_min_threshold", paramInt);
  }

  public final float j()
  {
    return b("change_sensitivity", 1.0F);
  }

  public final void j(int paramInt)
  {
    new StringBuilder().append("Setting download timeout to: ").append(paramInt).append("ms").toString();
    a("download_time_out", paramInt);
  }

  public final float k()
  {
    return b("satisfied_threshold", 4.5F);
  }

  public final int k(int paramInt)
  {
    return b("download_time_out", paramInt);
  }

  public final int l()
  {
    return b("rating_min_wait", 24);
  }

  public final int m()
  {
    return b("ping_min_threshold", com.enflick.android.TextNow.activities.phone.a.a);
  }

  public final int n()
  {
    return b("bandwidth_threshold", com.enflick.android.TextNow.activities.phone.a.b);
  }

  public final int o()
  {
    return b("bandwidth_threshold_offset", 0);
  }

  public final int p()
  {
    return b("bandwidth_max_threshold", com.enflick.android.TextNow.activities.phone.a.b);
  }

  public final String q()
  {
    return d("test_file_url", "http://speedtest.textnow.me/100k");
  }

  public final String r()
  {
    return d("settings_current_version", "0");
  }

  public final String s()
  {
    return d("settings_sip_codec_order", "105,3,102,0,8,9");
  }

  public final String t()
  {
    boolean bool = textnow.v.a.a;
    String str = null;
    if (bool)
      str = d("settings_sip_coder_order_override", null);
    return str;
  }

  public final String u()
  {
    boolean bool = textnow.v.a.a;
    String str = null;
    if (bool)
      str = d("settings_sip_proxy", null);
    return str;
  }

  public final String v()
  {
    boolean bool = textnow.v.a.a;
    String str = null;
    if (bool)
      str = d("sip_ip_override", null);
    return str;
  }

  public final Settings.AndroidSettings.Banner[] w()
  {
    f localf = new f();
    String str = d("banners_info", null);
    Settings.AndroidSettings.Banner[] arrayOfBanner = null;
    if (str != null)
      arrayOfBanner = (Settings.AndroidSettings.Banner[])localf.a(str, new textnow.aj.a()
      {
      }
      .b());
    return arrayOfBanner;
  }

  public final q x()
  {
    switch (b("userinfo_debug_environment", q.c.a()))
    {
    case 2:
    default:
      return q.c;
    case 0:
      return q.a;
    case 1:
      return q.b;
    case 3:
    }
    return q.d;
  }

  public final String y()
  {
    return d("server_custom", null);
  }

  public final boolean z()
  {
    return b("cdma_aggressive", false).booleanValue();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.p
 * JD-Core Version:    0.6.2
 */