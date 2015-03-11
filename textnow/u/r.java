package textnow.u;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.enflick.android.TextNow.persistence.contentproviders.c;
import com.enflick.android.TextNow.persistence.contentproviders.f;
import com.enflick.android.TextNow.persistence.contentproviders.g;
import java.util.Calendar;
import textnow.q.b;

public final class r extends p
{
  public r(Context paramContext)
  {
    super(paramContext);
  }

  public final void A(String paramString)
  {
    c("userinfo_ad_removal_expiry", paramString);
  }

  public final boolean A()
  {
    return b("userinfo_quickreply", true).booleanValue();
  }

  public final void B(String paramString)
  {
    c("userinfo_twitter_access_token", paramString);
  }

  public final boolean B()
  {
    return b("userinfo_quickreply_on_keyguard", false).booleanValue();
  }

  public final int C()
  {
    return b("userinfo_credits", 0);
  }

  public final void C(String paramString)
  {
    c("userinfo_twitter_token_secret", paramString);
  }

  public final String D()
  {
    return h("userinfo_sip_ip");
  }

  public final void D(String paramString)
  {
    c("userinfo_next_twitter_message", paramString);
  }

  public final String E()
  {
    return h("userinfo_sip_username");
  }

  public final void E(String paramString)
  {
    c("userinfo_idfa", paramString);
  }

  public final String F()
  {
    return h("userinfo_sip_password");
  }

  public final void F(String paramString)
  {
    c("userinfo_last_number_called", paramString);
  }

  public final String G()
  {
    return h("userinfo_sip_stun");
  }

  public final String H()
  {
    return h("userinfo_sip_proxy");
  }

  public final void I()
  {
    try
    {
      i = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
      a("userinfo_intro_version_code", i);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localException.printStackTrace();
        int i = 0;
      }
    }
  }

  public final long J()
  {
    return b("userinfo_pull_interval", 15000L);
  }

  public final boolean K()
  {
    return b("userinfo_has_password", true).booleanValue();
  }

  public final String L()
  {
    return h("userinfo_forwarding_expiry");
  }

  public final String M()
  {
    return h("userinfo_forwarding_number");
  }

  public final String N()
  {
    return h("userinfo_voicemail");
  }

  public final String O()
  {
    return h("userinfo_voicemail_uri");
  }

  public final String P()
  {
    return h("userinfo_voicemail_timestamp");
  }

  public final boolean Q()
  {
    return b("userinfo_unified_inbox", false).booleanValue();
  }

  public final long R()
  {
    return b("userinfo_unified_date", -1L);
  }

  public final String S()
  {
    return d("userinfo_amazon_user_id", "");
  }

  public final boolean T()
  {
    return b("userinfo_911_prompt_accepted", false).booleanValue();
  }

  public final String U()
  {
    return d("userinfo_ad_removal_expiry", "0000-00-00");
  }

  public final String V()
  {
    return h("userinfo_twitter_access_token");
  }

  public final String W()
  {
    return h("userinfo_twitter_token_secret");
  }

  public final String X()
  {
    return h("userinfo_next_twitter_message");
  }

  public final boolean Y()
  {
    return b("userinfo_first_time_start", true).booleanValue();
  }

  public final boolean Z()
  {
    return b("userinfo_device_id_registered", false).booleanValue();
  }

  public final void a()
  {
    q localq = new q(this.a);
    localq.o();
    localq.n();
    o();
    n();
    this.a.getContentResolver().delete(f.d, null, null);
    this.a.getContentResolver().delete(c.d, null, null);
    this.a.getContentResolver().delete(g.d, null, null);
  }

  public final void a(int paramInt)
  {
    a("userinfo_latest_announcement_id", paramInt);
  }

  public final void a(long paramLong)
  {
    a("userinfo_latest_msg_id", paramLong);
  }

  public final void a(Integer paramInteger)
  {
    a("userinfo_theme_id", paramInteger.intValue());
  }

  public final void a(String paramString)
  {
    c("userinfo_username", paramString);
  }

  public final void a(boolean paramBoolean)
  {
    a("userinfo_email_verified", paramBoolean);
  }

  public final boolean aa()
  {
    return b("userinfo_feature_cdma_fallback", false).booleanValue();
  }

  public final String ab()
  {
    return d("userinfo_idfa", null);
  }

  public final Integer ac()
  {
    return Integer.valueOf(b("userinfo_theme_id", 101));
  }

  public final String ad()
  {
    return d("userinfo_last_number_called", "");
  }

  public final boolean ae()
  {
    return b("userinfo_proximity_sensor", true).booleanValue();
  }

  public final String b()
  {
    return h("userinfo_username");
  }

  public final void b(int paramInt)
  {
    a("userinfo_birth_year", paramInt);
  }

  public final void b(long paramLong)
  {
    a("userinfo_time_offset", paramLong);
  }

  public final void b(String paramString)
  {
    c("userinfo_phone", paramString);
  }

  public final void b(boolean paramBoolean)
  {
    a("userinfo_forward_messages", paramBoolean);
  }

  public final String c()
  {
    return h("userinfo_phone");
  }

  public final void c(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > 2))
    {
      a("userinfo_gender", 1);
      return;
    }
    a("userinfo_gender", paramInt);
  }

  public final void c(long paramLong)
  {
    a("userinfo_pull_interval", paramLong);
  }

  public final void c(String paramString)
  {
    c("userinfo_area_code", paramString);
  }

  public final void c(boolean paramBoolean)
  {
    a("userinfo_signedin", paramBoolean);
  }

  public final String d()
  {
    return h("userinfo_area_code");
  }

  public final void d(int paramInt)
  {
    a("userinfo_credits", paramInt);
  }

  public final void d(long paramLong)
  {
    a("userinfo_unified_date", paramLong);
  }

  public final void d(String paramString)
  {
    c("userinfo_phone_expiry", paramString);
  }

  public final void d(boolean paramBoolean)
  {
    a("userinfo_conversations_loaded", true);
  }

  public final String e()
  {
    return h("userinfo_email");
  }

  public final void e(String paramString)
  {
    c("userinfo_email", paramString);
  }

  public final void e(boolean paramBoolean)
  {
    a("userinfo_has_password", paramBoolean);
  }

  public final boolean e(int paramInt)
  {
    int i = b("userinfo_intro_version_code", 0);
    boolean bool = false;
    if (i < 345)
      bool = true;
    return bool;
  }

  public final void f(int paramInt)
  {
    a("userinfo_forwarding_status", paramInt);
  }

  public final void f(String paramString)
  {
    c("userinfo_facebook_id", paramString);
  }

  public final void f(boolean paramBoolean)
  {
    if (!paramBoolean)
      a("userinfo_unified_date", -1L);
    a("userinfo_unified_inbox", paramBoolean);
  }

  public final boolean f()
  {
    return b("userinfo_email_verified", false).booleanValue();
  }

  public final String g()
  {
    return h("userinfo_firstname");
  }

  public final void g(String paramString)
  {
    c("userinfo_firstname", paramString);
  }

  public final void g(boolean paramBoolean)
  {
    a("userinfo_911_prompt_accepted", true);
  }

  public final String h()
  {
    return h("userinfo_lastname");
  }

  public final void h(boolean paramBoolean)
  {
    a("userinfo_first_time_start", false);
  }

  public final void i(boolean paramBoolean)
  {
    a("userinfo_device_id_registered", paramBoolean);
  }

  public final boolean i()
  {
    return b("userinfo_forward_messages", false).booleanValue();
  }

  public final int j()
  {
    return b("userinfo_latest_announcement_id", 0);
  }

  public final void j(String paramString)
  {
    c("userinfo_lastname", paramString);
  }

  public final void j(boolean paramBoolean)
  {
    a("userinfo_feature_cdma_fallback", paramBoolean);
  }

  public final long k()
  {
    return b("userinfo_latest_msg_id", 0L);
  }

  public final void k(String paramString)
  {
    c("userinfo_last_update", paramString);
  }

  public final void l(String paramString)
  {
    c("userinfo_session_id", paramString);
  }

  public final boolean l()
  {
    return b("userinfo_signedin", false).booleanValue();
  }

  public final String m()
  {
    return h("userinfo_session_id");
  }

  public final void m(String paramString)
  {
    c("userinfo_signature", paramString);
  }

  public final void n(String paramString)
  {
    c("userinfo_notification_sound", paramString);
  }

  public final void o(String paramString)
  {
    c("userinfo_ringtone", paramString);
  }

  public final void p(String paramString)
  {
    c("userinfo_wallpaper", paramString);
  }

  public final boolean p()
  {
    return b("userinfo_conversations_loaded", false).booleanValue();
  }

  public final int q()
  {
    return Calendar.getInstance().get(1) - r();
  }

  public final void q(String paramString)
  {
    c("userinfo_sip_ip", paramString);
  }

  public final int r()
  {
    return b("userinfo_birth_year", -20 + Calendar.getInstance().get(1));
  }

  public final void r(String paramString)
  {
    c("userinfo_sip_username", paramString);
  }

  public final int s()
  {
    return b("userinfo_gender", 1);
  }

  public final void s(String paramString)
  {
    c("userinfo_sip_password", paramString);
  }

  public final long t()
  {
    return b("userinfo_time_offset", 0L);
  }

  public final void t(String paramString)
  {
    c("userinfo_sip_stun", paramString);
  }

  public final String u()
  {
    return h("userinfo_signature");
  }

  public final void u(String paramString)
  {
    c("userinfo_sip_proxy", paramString);
  }

  public final String v()
  {
    return d("userinfo_notification_sound", null);
  }

  public final void v(String paramString)
  {
    c("userinfo_forwarding_expiry", paramString);
  }

  public final String w()
  {
    return d("userinfo_ringtone", null);
  }

  public final void w(String paramString)
  {
    c("userinfo_forwarding_number", paramString);
  }

  public final String x()
  {
    return h("userinfo_wallpaper");
  }

  public final void x(String paramString)
  {
    c("userinfo_voicemail", paramString);
  }

  public final void y(String paramString)
  {
    c("userinfo_voicemail_uri", paramString);
  }

  public final boolean y()
  {
    return (b("userinfo_vibrate", true).booleanValue()) && (b.m(this.a));
  }

  public final void z(String paramString)
  {
    c("userinfo_voicemail_timestamp", paramString);
  }

  public final boolean z()
  {
    return b("userinfo_notification_light", true).booleanValue();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.r
 * JD-Core Version:    0.6.2
 */