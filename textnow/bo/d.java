package textnow.bo;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.hockeyapp.android.a;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import textnow.bp.g;

public final class d extends AsyncTask<Void, Void, HashMap<String, String>>
{
  private Context a;
  private Handler b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private boolean i;
  private ProgressDialog j;

  public d(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Handler paramHandler, boolean paramBoolean)
  {
    this.a = paramContext;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramString5;
    this.h = paramString6;
    this.b = paramHandler;
    this.i = paramBoolean;
    if (paramContext != null)
      a.a(paramContext);
  }

  private HashMap<String, String> a(HttpClient paramHttpClient)
  {
    try
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new BasicNameValuePair("name", this.d));
      localArrayList.add(new BasicNameValuePair("email", this.e));
      localArrayList.add(new BasicNameValuePair("subject", this.f));
      localArrayList.add(new BasicNameValuePair("text", this.g));
      localArrayList.add(new BasicNameValuePair("bundle_identifier", a.d));
      localArrayList.add(new BasicNameValuePair("bundle_short_version", a.c));
      localArrayList.add(new BasicNameValuePair("bundle_version", a.b));
      localArrayList.add(new BasicNameValuePair("os_version", a.e));
      localArrayList.add(new BasicNameValuePair("oem", a.g));
      localArrayList.add(new BasicNameValuePair("model", a.f));
      UrlEncodedFormEntity localUrlEncodedFormEntity = new UrlEncodedFormEntity(localArrayList, "UTF-8");
      localUrlEncodedFormEntity.setContentEncoding("UTF-8");
      HttpPut localHttpPut;
      HttpPost localHttpPost;
      if (this.h != null)
      {
        this.c = (this.c + this.h + "/");
        localHttpPut = new HttpPut(this.c);
        localHttpPost = null;
        if (localHttpPut == null)
          break label405;
        localHttpPut.setEntity(localUrlEncodedFormEntity);
      }
      label405: HttpResponse localHttpResponse;
      for (Object localObject = paramHttpClient.execute(localHttpPut); ; localObject = localHttpResponse)
      {
        if (localObject == null)
          break label429;
        HttpEntity localHttpEntity = ((HttpResponse)localObject).getEntity();
        HashMap localHashMap = new HashMap();
        localHashMap.put("type", "send");
        localHashMap.put("response", EntityUtils.toString(localHttpEntity));
        localHashMap.put("status", "" + ((HttpResponse)localObject).getStatusLine().getStatusCode());
        return localHashMap;
        localHttpPost = new HttpPost(this.c);
        localHttpPut = null;
        break;
        localHttpPost.setEntity(localUrlEncodedFormEntity);
        localHttpResponse = paramHttpClient.execute(localHttpPost);
      }
      label429: return null;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
      return null;
    }
    catch (ClientProtocolException localClientProtocolException)
    {
      while (true)
        localClientProtocolException.printStackTrace();
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }

  private HashMap<String, String> b(HttpClient paramHttpClient)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.c + g.a(this.h));
    HttpGet localHttpGet = new HttpGet(localStringBuilder.toString());
    try
    {
      HttpResponse localHttpResponse = paramHttpClient.execute(localHttpGet);
      HttpEntity localHttpEntity = localHttpResponse.getEntity();
      HashMap localHashMap = new HashMap();
      localHashMap.put("type", "fetch");
      localHashMap.put("response", EntityUtils.toString(localHttpEntity));
      localHashMap.put("status", "" + localHttpResponse.getStatusLine().getStatusCode());
      return localHashMap;
    }
    catch (ClientProtocolException localClientProtocolException)
    {
      localClientProtocolException.printStackTrace();
      return null;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
        localIllegalStateException.printStackTrace();
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }

  public final void a()
  {
    this.a = null;
    this.j = null;
  }

  protected final void onPreExecute()
  {
    String str = "Sending feedback..";
    if (this.i)
      str = "Retrieving discussions...";
    if ((this.j == null) || (!this.j.isShowing()))
      this.j = ProgressDialog.show(this.a, "", str, true, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bo.d
 * JD-Core Version:    0.6.2
 */