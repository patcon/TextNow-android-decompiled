package com.admarvel.android.util;

import android.content.Context;
import android.os.AsyncTask;
import com.admarvel.android.ads.AdFetcher;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class a$b extends AsyncTask<Integer, Void, String>
{
  private final String b;
  private final String c;

  public a$b(a parama, String paramString)
  {
    this.c = paramString;
    this.b = (this.c + ".zip");
  }

  protected String a(Integer[] paramArrayOfInteger)
  {
    while (true)
    {
      int i;
      int n;
      int i2;
      String str7;
      try
      {
        i = paramArrayOfInteger[0].intValue();
        File[] arrayOfFile = a.a(this.a).listFiles();
        if ((arrayOfFile == null) || (arrayOfFile.length == 0))
          break label809;
        if (i <= a.b(this.a))
          break label803;
        j = a.b(this.a);
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        int k = arrayOfFile.length;
        int m = 0;
        if (m < k)
        {
          localArrayList2.add(arrayOfFile[m]);
          m++;
          continue;
        }
        Context localContext = (Context)a.a().get();
        String str1 = a.a(this.a).getAbsolutePath() + "/log_";
        String str2 = a.a(this.a).getAbsolutePath() + "/ss_";
        String str3 = a.a(this.a).getAbsolutePath() + "/sse_";
        String str4 = a.a(this.a).getAbsolutePath() + "/ssr_";
        if (localContext != null)
        {
          n = a.a(this.a, localContext);
          i1 = 0;
          i2 = i1 + 1;
          if (i1 != j)
          {
            if (n <= 0)
              n = a.b(this.a);
            File localFile1 = new File(str1 + n + ".txt");
            if (localFile1.exists())
              localArrayList1.add(localFile1.getAbsolutePath());
            File localFile2 = new File(str2 + n + ".jpg");
            if (localFile2.exists())
              localArrayList1.add(localFile2.getAbsolutePath());
            File localFile3 = new File(str3 + n + ".jpg");
            if (localFile3.exists())
              localArrayList1.add(localFile3.getAbsolutePath());
            File localFile4 = new File(str4 + n + ".jpg");
            if (!localFile4.exists())
              break label811;
            localArrayList1.add(localFile4.getAbsolutePath());
            break label811;
          }
        }
        String[] arrayOfString = new String[localArrayList1.size()];
        Iterator localIterator = localArrayList1.iterator();
        int i3 = 0;
        if (localIterator.hasNext())
        {
          String str12 = (String)localIterator.next();
          int i4 = i3 + 1;
          arrayOfString[i3] = str12;
          i3 = i4;
          continue;
        }
        String str5 = a.a(this.a).getAbsolutePath() + "/" + this.b;
        new h(arrayOfString, str5).a();
        String str6 = "http://sdk-rh.admarvel.com/adhistory/upload?" + "platform=android";
        str7 = str6 + "&deviceid=" + OptionalUtils.getId(localContext);
        if (localContext != null)
        {
          str8 = str7 + "&appid=" + localContext.getPackageName();
          String str9 = str8 + "&zipguid=" + this.c;
          String str10 = str9 + "&timestamp=" + System.currentTimeMillis();
          String str11 = str10 + AdFetcher.lastAdRequestPostString;
          a.a(this.a, str11, str5);
          return str5;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return null;
      }
      String str8 = str7;
      continue;
      label803: int j = i;
      continue;
      label809: return null;
      label811: n--;
      int i1 = i2;
    }
  }

  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
  }

  protected void onPreExecute()
  {
    super.onPreExecute();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.a.b
 * JD-Core Version:    0.6.2
 */