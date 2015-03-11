package textnow.ar;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

public final class b
{
  protected static String a = "https://m.facebook.com/dialog/";
  protected static String b = "https://graph.facebook.com/";
  protected static String c = "https://api.facebook.com/restserver.php";
  private String d = null;
  private long e = 0L;
  private String f;
  private c g;

  public b(String paramString)
  {
    if (paramString == null)
      throw new IllegalArgumentException("You must specify your application ID when instantiating a Facebook object. See README for details.");
    this.f = paramString;
  }

  public final String a(Context paramContext)
  {
    CookieSyncManager.createInstance(paramContext);
    CookieManager.getInstance().removeAllCookie();
    Bundle localBundle = new Bundle();
    localBundle.putString("method", "auth.expireSession");
    if (!localBundle.containsKey("method"))
      throw new IllegalArgumentException("API method must be specified. (parameters must contain key \"method\" and value). See http://developers.facebook.com/docs/reference/rest/");
    String str = a(null, localBundle, "GET");
    this.d = null;
    this.e = 0L;
    return str;
  }

  public final String a(String paramString1, Bundle paramBundle, String paramString2)
  {
    paramBundle.putString("format", "json");
    if (a())
      paramBundle.putString("access_token", this.d);
    if (paramString1 != null);
    for (String str = b + paramString1; ; str = c)
      return j.a(str, paramString2, paramBundle);
  }

  public final void a(Activity paramActivity, String[] paramArrayOfString, int paramInt, c paramc)
  {
    this.g = paramc;
    Bundle localBundle = new Bundle();
    if (paramArrayOfString.length > 0)
      localBundle.putString("scope", TextUtils.join(",", paramArrayOfString));
    CookieSyncManager.createInstance(paramActivity);
    c local1 = new c()
    {
      public final void a()
      {
        b.a(b.this).a();
      }

      public final void a(Bundle paramAnonymousBundle)
      {
        CookieSyncManager.getInstance().sync();
        b.this.a(paramAnonymousBundle.getString("access_token"));
        b.this.b(paramAnonymousBundle.getString("expires_in"));
        if (b.this.a())
        {
          new StringBuilder().append("Login Success! access_token=").append(b.this.b()).append(" expires=").append(b.this.c()).toString();
          b.a(b.this).a(paramAnonymousBundle);
          return;
        }
        b.a(b.this).a(new d("Failed to receive access token."));
      }

      public final void a(a paramAnonymousa)
      {
        new StringBuilder().append("Login failed: ").append(paramAnonymousa).toString();
        b.a(b.this).a(paramAnonymousa);
      }

      public final void a(d paramAnonymousd)
      {
        new StringBuilder().append("Login failed: ").append(paramAnonymousd).toString();
        b.a(b.this).a(paramAnonymousd);
      }
    };
    String str1 = a + "oauth";
    localBundle.putString("display", "touch");
    localBundle.putString("redirect_uri", "fbconnect://success");
    if ("oauth".equals("oauth"))
    {
      localBundle.putString("type", "user_agent");
      localBundle.putString("client_id", this.f);
    }
    String str2;
    while (true)
    {
      if (a())
        localBundle.putString("access_token", this.d);
      str2 = str1 + "?" + j.a(localBundle);
      if (paramActivity.checkCallingOrSelfPermission("android.permission.INTERNET") == 0)
        break;
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
      localBuilder.setTitle("Error");
      localBuilder.setMessage("Application requires permission to access the Internet");
      localBuilder.create().show();
      return;
      localBundle.putString("app_id", this.f);
    }
    e.a(paramActivity, str2, local1).a();
  }

  public final void a(String paramString)
  {
    this.d = paramString;
  }

  public final boolean a()
  {
    return (this.d != null) && ((this.e == 0L) || (System.currentTimeMillis() < this.e));
  }

  public final String b()
  {
    return this.d;
  }

  public final void b(String paramString)
  {
    if ((paramString != null) && (!paramString.equals("0")))
      this.e = (System.currentTimeMillis() + 1000 * Integer.parseInt(paramString));
  }

  public final long c()
  {
    return this.e;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ar.b
 * JD-Core Version:    0.6.2
 */