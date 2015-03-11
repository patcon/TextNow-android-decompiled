package textnow.z;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.enflick.android.TextNow.persistence.contentproviders.d;
import com.enflick.android.TextNow.persistence.contentproviders.g;
import com.enflick.android.TextNow.persistence.contentproviders.h;
import java.util.Calendar;
import textnow.v.b;

public final class u extends r
{
  public u(Context paramContext)
  {
    super(paramContext);
  }

  public final void A(String paramString)
  {
    c("userinfo_ad_removal_expiry", paramString);
  }

  public final boolean A()
  {
    return b("userinfo_quickreply_on_keyguard", false).booleanValue();
  }

  public final void B(String paramString)
  {
    c("userinfo_idfa", paramString);
  }

  public final void C(String paramString)
  {
    c("userinfo_last_number_called", paramString);
  }

  public final boolean D()
  {
    return b("userinfo_hidden_timestamps", false).booleanValue();
  }

  public final int E()
  {
    return b("userinfo_credits", 0);
  }

  public final String F()
  {
    return h("userinfo_sip_ip");
  }

  public final String G()
  {
    return h("userinfo_sip_username");
  }

  public final String H()
  {
    return h("userinfo_sip_password");
  }

  public final String I()
  {
    return h("userinfo_sip_stun");
  }

  public final String J()
  {
    return h("userinfo_sip_proxy");
  }

  public final void K()
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

  public final long L()
  {
    return b("userinfo_pull_interval", 15000L);
  }

  public final boolean M()
  {
    return b("userinfo_has_password", true).booleanValue();
  }

  public final String N()
  {
    return h("userinfo_forwarding_expiry");
  }

  public final String O()
  {
    return h("userinfo_forwarding_number");
  }

  public final String P()
  {
    return h("userinfo_voicemail");
  }

  public final String Q()
  {
    return h("userinfo_voicemail_uri");
  }

  public final String R()
  {
    return h("userinfo_voicemail_timestamp");
  }

  public final boolean S()
  {
    return b("userinfo_unified_inbox", false).booleanValue();
  }

  public final long T()
  {
    return b("userinfo_unified_date", -1L);
  }

  public final String U()
  {
    return d("userinfo_amazon_user_id", "");
  }

  public final boolean V()
  {
    return b("userinfo_911_prompt_accepted", false).booleanValue();
  }

  public final String W()
  {
    return d("userinfo_ad_removal_expiry", "0000-00-00");
  }

  public final boolean X()
  {
    return b("userinfo_first_time_start", true).booleanValue();
  }

  public final boolean Y()
  {
    return b("userinfo_device_id_registered", false).booleanValue();
  }

  public final boolean Z()
  {
    return b("userinfo_feature_cdma_fallback", false).booleanValue();
  }

  public final void a()
  {
    s locals = new s(this.a);
    locals.C();
    locals.B();
    C();
    B();
    this.a.getContentResolver().delete(g.d, null, null);
    this.a.getContentResolver().delete(d.d, null, null);
    this.a.getContentResolver().delete(h.d, null, null);
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

  public final String aa()
  {
    return d("userinfo_idfa", null);
  }

  public final Integer ab()
  {
    int i = b("userinfo_theme_id", 101);
    if (i == 0)
      return Integer.valueOf(101);
    return Integer.valueOf(i);
  }

  public final String ac()
  {
    return d("userinfo_last_number_called", "");
  }

  public final boolean ad()
  {
    return b("userinfo_proximity_sensor", true).booleanValue();
  }

  public final boolean ae()
  {
    return b("userinfo_voicemail_speakeron", true).booleanValue();
  }

  public final int af()
  {
    return b("userinfo_is_paid_tn_device", -1);
  }

  public final boolean ag()
  {
    return b("userinfo_new_byosd", false).booleanValue();
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

  public final void e(int paramInt)
  {
    a("userinfo_forwarding_status", paramInt);
  }

  public final void e(String paramString)
  {
    c("userinfo_email", paramString);
  }

  public final void e(boolean paramBoolean)
  {
    a("userinfo_has_password", paramBoolean);
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

  public final void k(boolean paramBoolean)
  {
    a("userinfo_voicemail_speakeron", paramBoolean);
  }

  public final void l(String paramString)
  {
    c("userinfo_session_id", paramString);
  }

  public final void l(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      a("userinfo_is_paid_tn_device", i);
      return;
    }
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

  public final void m(boolean paramBoolean)
  {
    a("userinfo_new_byosd", paramBoolean);
  }

  public final void n(String paramString)
  {
    c("userinfo_notification_sound", paramString);
  }

  public final boolean n()
  {
    return b("userinfo_conversations_loaded", false).booleanValue();
  }

  public final int o()
  {
    return Calendar.getInstance().get(1) - p();
  }

  public final void o(String paramString)
  {
    c("userinfo_ringtone", paramString);
  }

  public final int p()
  {
    return b("userinfo_birth_year", -20 + Calendar.getInstance().get(1));
  }

  public final void p(String paramString)
  {
    c("userinfo_wallpaper", paramString);
  }

  public final int q()
  {
    return b("userinfo_gender", 1);
  }

  public final void q(String paramString)
  {
    c("userinfo_sip_ip", paramString);
  }

  public final long r()
  {
    return b("userinfo_time_offset", 0L);
  }

  public final void r(String paramString)
  {
    c("userinfo_sip_username", paramString);
  }

  public final String s()
  {
    return h("userinfo_signature");
  }

  public final void s(String paramString)
  {
    c("userinfo_sip_password", paramString);
  }

  public final String t()
  {
    return d("userinfo_notification_sound", null);
  }

  public final void t(String paramString)
  {
    c("userinfo_sip_stun", paramString);
  }

  public final String u()
  {
    return d("userinfo_ringtone", null);
  }

  public final void u(String paramString)
  {
    c("userinfo_sip_proxy", paramString);
  }

  public final String v()
  {
    return h("userinfo_wallpaper");
  }

  public final void v(String paramString)
  {
    c("userinfo_forwarding_expiry", paramString);
  }

  public final void w(String paramString)
  {
    c("userinfo_forwarding_number", paramString);
  }

  public final boolean w()
  {
    return (b("userinfo_vibrate", true).booleanValue()) && (b.l(this.a));
  }

  public final void x(String paramString)
  {
    c("userinfo_voicemail", paramString);
  }

  public final boolean x()
  {
    return b("userinfo_notification_light", true).booleanValue();
  }

  public final void y(String paramString)
  {
    c("userinfo_voicemail_uri", paramString);
  }

  public final boolean y()
  {
    return b("userinfo_chathead", true).booleanValue();
  }

  public final void z(String paramString)
  {
    c("userinfo_voicemail_timestamp", paramString);
  }

  public final boolean z()
  {
    return b("userinfo_quickreply", true).booleanValue();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.u
 * JD-Core Version:    0.6.2
 */