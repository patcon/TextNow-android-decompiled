package textnow.au;

import android.net.Uri;
import com.tremorvideo.sdk.android.videoad.r;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class a
{
  private ArrayList<String[]> a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f = null;
  private String g;

  public a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.b = paramString3;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString4;
    this.f = null;
    this.a = new ArrayList();
  }

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.b = paramString4;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString5;
    this.f = paramString3;
    this.a = new ArrayList();
  }

  private static String a(InputStream paramInputStream)
  {
    try
    {
      char[] arrayOfChar = new char[65536];
      StringBuilder localStringBuilder = new StringBuilder();
      InputStreamReader localInputStreamReader = new InputStreamReader(paramInputStream, "UTF-8");
      int i;
      do
      {
        i = localInputStreamReader.read(arrayOfChar, 0, arrayOfChar.length);
        if (i > 0)
          localStringBuilder.append(arrayOfChar, 0, i);
      }
      while (i >= 0);
      localInputStreamReader.close();
      String str = localStringBuilder.toString();
      return str;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return "";
  }

  private static String a(List<String[]> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList);
    Collections.sort(localArrayList, new Comparator()
    {
    });
    int i = 0;
    String str3;
    for (Object localObject = ""; i < localArrayList.size(); localObject = str3)
    {
      String[] arrayOfString = (String[])localArrayList.get(i);
      String str1 = (String)localObject + arrayOfString[0];
      String str2 = str1 + '=';
      str3 = str2 + arrayOfString[1];
      if (i != -1 + localArrayList.size())
        str3 = str3 + '&';
      i++;
    }
    return localObject;
  }

  private static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = (3 - paramArrayOfByte.length % 3) % 3;
    byte[] arrayOfByte = new byte[i + paramArrayOfByte.length];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    int m;
    for (int j = 0; ; j += 3)
    {
      int k = arrayOfByte.length;
      m = 0;
      if (j >= k)
        break;
      int n = ((0xFF & arrayOfByte[j]) << 16) + ((0xFF & arrayOfByte[(j + 1)]) << 8) + (0xFF & arrayOfByte[(j + 2)]);
      localStringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(0x3F & n >> 18));
      localStringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(0x3F & n >> 12));
      localStringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(0x3F & n >> 6));
      localStringBuilder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(0x3F & n >> 0));
    }
    while (m < i)
    {
      localStringBuilder.setCharAt(m + (localStringBuilder.length() - i), '=');
      m++;
    }
    return localStringBuilder.toString();
  }

  private static String b(String paramString1, String paramString2)
  {
    try
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString2.getBytes("UTF-8"), "HmacSHA1");
      Mac localMac = Mac.getInstance("HmacSHA1");
      localMac.init(localSecretKeySpec);
      String str = a(localMac.doFinal(paramString1.getBytes("UTF-8")));
      return str;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }

  private String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < this.a.size(); i++)
    {
      String[] arrayOfString = (String[])this.a.get(i);
      localStringBuilder.append(arrayOfString[0] + "=" + arrayOfString[1]);
      if (i < -1 + this.a.size())
        localStringBuilder.append('&');
    }
    return localStringBuilder.toString();
  }

  public final void a(String paramString1, String paramString2)
  {
    try
    {
      String str = URLEncoder.encode(paramString2, "UTF-8").replace("*", "%2A").replace("+", "%20").replace("%7E", "~");
      this.a.add(new String[] { paramString1, str });
      return;
    }
    catch (Exception localException)
    {
      r.a(localException);
    }
  }

  public final boolean a()
  {
    long l;
    String str1;
    ArrayList localArrayList;
    try
    {
      l = System.currentTimeMillis() / 1000L;
      str1 = String.valueOf(l) + String.valueOf(new Random().nextInt());
      localArrayList = new ArrayList();
      String[] arrayOfString1 = new String[2];
      arrayOfString1[0] = "oauth_consumer_key";
      arrayOfString1[1] = this.c;
      localArrayList.add(arrayOfString1);
      localArrayList.add(new String[] { "oauth_signature_method", "HMAC-SHA1" });
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = "oauth_timestamp";
      arrayOfString2[1] = Long.toString(l);
      localArrayList.add(arrayOfString2);
      localArrayList.add(new String[] { "oauth_nonce", str1 });
      localArrayList.add(new String[] { "oauth_version", "1.0" });
      if (this.f != null)
      {
        String[] arrayOfString3 = new String[2];
        arrayOfString3[0] = "oauth_token";
        arrayOfString3[1] = this.f;
        localArrayList.add(arrayOfString3);
      }
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
        localArrayList.add((String[])localIterator.next());
    }
    catch (Exception localException)
    {
      r.a("Error sending OAuth request", localException);
      this.g = "";
      return false;
    }
    String str2 = a(localArrayList);
    String str3 = "" + this.b + "&";
    String str4 = str3 + Uri.encode(this.e) + "&";
    String str5 = Uri.encode(b(str4 + Uri.encode(str2), this.d));
    String str6 = "OAuth " + "oauth_nonce=\"" + Uri.encode(str1) + "\", ";
    String str7 = str6 + "oauth_signature_method=\"HMAC-SHA1\", ";
    String str8 = str7 + "oauth_timestamp=\"" + l + "\", ";
    String str9 = str8 + "oauth_consumer_key=\"" + this.c + "\", ";
    String str10 = str9 + "oauth_signature=\"" + str5 + "\", ";
    if (this.f != null)
      str10 = str10 + "oauth_token=\"" + this.f + "\", ";
    String str11 = str10 + "oauth_version=\"1.0\"";
    String str12 = d();
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.e).openConnection();
    localHttpURLConnection.setDoInput(true);
    localHttpURLConnection.setDoOutput(true);
    localHttpURLConnection.setRequestMethod(this.b);
    localHttpURLConnection.setReadTimeout(18000);
    localHttpURLConnection.setConnectTimeout(18000);
    localHttpURLConnection.setRequestProperty("Authorization", str11);
    localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    localHttpURLConnection.setRequestProperty("Content-Length", String.valueOf(str12.getBytes().length));
    localHttpURLConnection.getOutputStream().write(str12.getBytes());
    int i = localHttpURLConnection.getResponseCode();
    if ((i >= 200) && (i < 300))
    {
      this.g = a(localHttpURLConnection.getInputStream());
      return true;
    }
    this.g = a(localHttpURLConnection.getErrorStream());
    return false;
  }

  public final HashMap<String, String> b()
  {
    HashMap localHashMap = new HashMap();
    String[] arrayOfString1 = this.g.split("&");
    int i = arrayOfString1.length;
    for (int j = 0; j < i; j++)
    {
      String[] arrayOfString2 = arrayOfString1[j].split("=");
      if (arrayOfString2.length == 2)
        localHashMap.put(arrayOfString2[0], arrayOfString2[1]);
    }
    return localHashMap;
  }

  public final String c()
  {
    return this.g;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.au.a
 * JD-Core Version:    0.6.2
 */