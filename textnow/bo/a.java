package textnow.bo;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import net.hockeyapp.android.UpdateActivity;
import net.hockeyapp.android.i;
import net.hockeyapp.android.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import textnow.bp.h;

public final class a extends AsyncTask<String, String, JSONArray>
{
  protected String a;
  protected String b;
  private Activity c;
  private Boolean d;
  private j e;
  private long f;

  private static String a(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream), 1024);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      while (true)
      {
        String str = localBufferedReader.readLine();
        if (str == null)
          break;
        localStringBuilder.append(str + "\n");
      }
    }
    catch (IOException localIOException2)
    {
      localIOException2 = localIOException2;
      localIOException2.printStackTrace();
      try
      {
        paramInputStream.close();
        while (true)
        {
          return localStringBuilder.toString();
          try
          {
            paramInputStream.close();
          }
          catch (IOException localIOException4)
          {
            localIOException4.printStackTrace();
          }
        }
      }
      catch (IOException localIOException3)
      {
        while (true)
          localIOException3.printStackTrace();
      }
    }
    finally
    {
    }
    try
    {
      paramInputStream.close();
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      while (true)
        localIOException1.printStackTrace();
    }
  }

  private String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append("api/2/apps/");
    if (this.b != null);
    for (String str = this.b; ; str = this.c.getPackageName())
    {
      localStringBuilder.append(str);
      localStringBuilder.append("?format=" + paramString);
      if (Settings.Secure.getString(this.c.getContentResolver(), "android_id") != null)
        localStringBuilder.append("&udid=" + b(Settings.Secure.getString(this.c.getContentResolver(), "android_id")));
      localStringBuilder.append("&os=Android");
      localStringBuilder.append("&os_version=" + b(net.hockeyapp.android.a.e));
      localStringBuilder.append("&device=" + b(net.hockeyapp.android.a.f));
      localStringBuilder.append("&oem=" + b(net.hockeyapp.android.a.g));
      localStringBuilder.append("&app_version=" + b(net.hockeyapp.android.a.b));
      localStringBuilder.append("&sdk=" + b("HockeySDK"));
      localStringBuilder.append("&sdk_version=" + b("3.0.0"));
      localStringBuilder.append("&lang=" + b(Locale.getDefault().getLanguage()));
      localStringBuilder.append("&usage_time=" + this.f);
      return localStringBuilder.toString();
    }
  }

  private static JSONArray a(JSONArray paramJSONArray)
  {
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    while (true)
    {
      if (i < Math.min(paramJSONArray.length(), 25));
      try
      {
        localJSONArray.put(paramJSONArray.get(i));
        label33: i++;
        continue;
        return localJSONArray;
      }
      catch (JSONException localJSONException)
      {
        break label33;
      }
    }
  }

  @TargetApi(11)
  private void a(JSONArray paramJSONArray, Boolean paramBoolean)
  {
    j localj = this.e;
    UpdateActivity localUpdateActivity = null;
    if (localj != null)
      localUpdateActivity = UpdateActivity.class;
    if (localUpdateActivity == null)
      localUpdateActivity = UpdateActivity.class;
    if (this.c != null)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this.c, localUpdateActivity);
      localIntent.putExtra("json", paramJSONArray.toString());
      localIntent.putExtra("url", a("apk"));
      this.c.startActivity(localIntent);
      if (paramBoolean.booleanValue())
        this.c.finish();
    }
    c();
  }

  protected static boolean a()
  {
    return true;
  }

  private boolean a(JSONArray paramJSONArray, int paramInt)
  {
    int i = 0;
    try
    {
      while (true)
      {
        int j = paramJSONArray.length();
        boolean bool = false;
        if (i < j)
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
          if (localJSONObject.getInt("version") > paramInt)
          {
            if (localJSONObject.has("mandatory"))
              this.d = Boolean.valueOf(localJSONObject.getBoolean("mandatory"));
            bool = true;
          }
        }
        else
        {
          return bool;
        }
        i++;
      }
    }
    catch (JSONException localJSONException)
    {
    }
    return false;
  }

  private static String b(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return "";
  }

  private JSONArray b()
  {
    try
    {
      int i = Integer.parseInt(net.hockeyapp.android.a.b);
      JSONArray localJSONArray1 = new JSONArray(h.a(this.c));
      if (a(localJSONArray1, i))
        return localJSONArray1;
      URLConnection localURLConnection = new URL(a("json")).openConnection();
      localURLConnection.addRequestProperty("User-Agent", "Hockey/Android");
      if (Build.VERSION.SDK_INT <= 9)
        localURLConnection.setRequestProperty("connection", "close");
      localURLConnection.connect();
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(localURLConnection.getInputStream());
      String str = a(localBufferedInputStream);
      localBufferedInputStream.close();
      JSONArray localJSONArray2 = new JSONArray(str);
      if (a(localJSONArray2, i))
      {
        JSONArray localJSONArray3 = a(localJSONArray2);
        return localJSONArray3;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }

  private void c()
  {
    this.c = null;
    this.a = null;
    this.b = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bo.a
 * JD-Core Version:    0.6.2
 */