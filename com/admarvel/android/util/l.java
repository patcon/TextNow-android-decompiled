package com.admarvel.android.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class l
{
  private final String a;
  private HttpURLConnection b;
  private String c;
  private OutputStream d;
  private PrintWriter e;

  public l(String paramString1, String paramString2)
  {
    this.c = paramString2;
    this.a = ("===" + System.currentTimeMillis() + "===");
    this.b = ((HttpURLConnection)new URL(paramString1).openConnection());
    this.b.setUseCaches(false);
    this.b.setDoOutput(true);
    this.b.setDoInput(true);
    this.b.setConnectTimeout(2000);
    this.b.setReadTimeout(2000);
    this.b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + this.a);
    this.d = this.b.getOutputStream();
    this.e = new PrintWriter(new OutputStreamWriter(this.d, paramString2), true);
  }

  public List<String> a()
  {
    ArrayList localArrayList = new ArrayList();
    this.e.append("\r\n").flush();
    this.e.append("--" + this.a + "--").append("\r\n");
    this.e.close();
    int i = this.b.getResponseCode();
    if (i == 200)
    {
      BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(this.b.getInputStream()));
      while (true)
      {
        String str = localBufferedReader.readLine();
        if (str == null)
          break;
        localArrayList.add(str);
      }
      localBufferedReader.close();
      this.b.disconnect();
      return localArrayList;
    }
    throw new IOException("Server returned non-OK status: " + i);
  }

  public void a(String paramString, File paramFile)
  {
    String str = paramFile.getName();
    this.e.append("--" + this.a).append("\r\n");
    this.e.append("Content-Disposition: form-data; name=\"" + paramString + "\"; filename=\"" + str + "\"").append("\r\n");
    this.e.append("Content-Type: " + URLConnection.guessContentTypeFromName(str)).append("\r\n");
    this.e.append("Content-Transfer-Encoding: binary").append("\r\n");
    this.e.append("\r\n");
    this.e.flush();
    FileInputStream localFileInputStream = new FileInputStream(paramFile);
    byte[] arrayOfByte = new byte[4096];
    while (true)
    {
      int i = localFileInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      this.d.write(arrayOfByte, 0, i);
    }
    this.d.flush();
    localFileInputStream.close();
    this.e.append("\r\n");
    this.e.flush();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.l
 * JD-Core Version:    0.6.2
 */