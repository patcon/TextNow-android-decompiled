package textnow.ax;

import android.os.AsyncTask;
import com.tremorvideo.sdk.android.videoad.r;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

final class bq extends AsyncTask<String, Void, String>
{
  String a;
  String b;
  String c;
  String d;
  String e;
  final String f = "http://data.tmsapi.com/v1/lineups?postalCode=__ZIP__&api_key=dn3gkyv4pzcmfcp5fakh7raz";
  final String g = "http://data.tmsapi.com/v1/stations/__STATION__?lineupId=__LINEUP__&api_key=dn3gkyv4pzcmfcp5fakh7raz";

  public bq(bn parambn)
  {
  }

  private String a(String[] paramArrayOfString)
  {
    try
    {
      this.a = null;
      BasicHttpParams localBasicHttpParams = new BasicHttpParams();
      localBasicHttpParams.setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
      HttpConnectionParams.setTcpNoDelay(localBasicHttpParams, true);
      DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient(localBasicHttpParams);
      this.e = paramArrayOfString[0];
      this.b = paramArrayOfString[1];
      if (this.e.equals("provider"))
        this.d = "http://data.tmsapi.com/v1/lineups?postalCode=__ZIP__&api_key=dn3gkyv4pzcmfcp5fakh7raz".replace("__ZIP__", "" + this.h.Q);
      while (true)
      {
        HttpGet localHttpGet = new HttpGet(this.d);
        m.a(localHttpGet, this.d);
        this.a = EntityUtils.toString(localDefaultHttpClient.execute(localHttpGet).getEntity());
        return this.a;
        if (this.e.equals("channel"))
        {
          this.c = paramArrayOfString[2];
          this.d = "http://data.tmsapi.com/v1/stations/__STATION__?lineupId=__LINEUP__&api_key=dn3gkyv4pzcmfcp5fakh7raz".replace("__STATION__", "" + this.h.L);
          this.d = this.d.replace("__LINEUP__", "" + this.c);
        }
      }
    }
    catch (Exception localException)
    {
      r.a(localException);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ax.bq
 * JD-Core Version:    0.6.2
 */