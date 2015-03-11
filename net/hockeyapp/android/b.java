package net.hockeyapp.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import textnow.bi.e;

public final class b
{
  private static String a = null;
  private static String b = null;

  public static void a(Context paramContext, String paramString)
  {
    if (paramContext != null)
    {
      b = "https://sdk.hockeyapp.net/";
      a = paramString;
      a.a(paramContext);
      if (a == null)
        a = a.d;
    }
    Boolean localBoolean1 = Boolean.valueOf(false);
    final WeakReference localWeakReference = new WeakReference(paramContext);
    int i = b(localWeakReference);
    final boolean bool;
    if (i == 1)
    {
      Boolean localBoolean2 = Boolean.valueOf(false);
      if (0 != 0)
        localBoolean2 = Boolean.valueOf(false | Boolean.valueOf(false | localBoolean2.booleanValue()).booleanValue());
      if (!localBoolean2.booleanValue())
      {
        bool = localBoolean1.booleanValue();
        if (localWeakReference == null)
          break label238;
      }
    }
    label238: for (Context localContext = (Context)localWeakReference.get(); ; localContext = null)
    {
      if (localContext != null)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(localContext);
        localBuilder.setTitle(f.a(null, 0));
        localBuilder.setMessage(f.a(null, 1));
        localBuilder.setNegativeButton(f.a(null, 2), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            if (b.this != null);
            b.a(localWeakReference);
            b.a(localWeakReference, b.this, bool);
          }
        });
        localBuilder.setPositiveButton(f.a(null, 3), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            b.b(b.this, this.b, bool);
          }
        });
        localBuilder.create().show();
      }
      return;
      c(localWeakReference, null, localBoolean1.booleanValue());
      return;
      if (i == 2)
      {
        c(localWeakReference, null, localBoolean1.booleanValue());
        return;
      }
      a(null, localBoolean1.booleanValue());
      return;
    }
  }

  public static void a(WeakReference<Context> paramWeakReference)
  {
    String[] arrayOfString = a();
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      new StringBuilder().append("Found ").append(arrayOfString.length).append(" stacktrace(s).").toString();
      int i = 0;
      while (true)
        if (i < arrayOfString.length)
        {
          if (paramWeakReference != null);
          try
          {
            new StringBuilder().append("Delete stacktrace ").append(arrayOfString[i]).append(".").toString();
            a(paramWeakReference, arrayOfString[i]);
            Context localContext = (Context)paramWeakReference.get();
            if (localContext != null)
              localContext.deleteFile(arrayOfString[i]);
            i++;
          }
          catch (Exception localException)
          {
            while (true)
              localException.printStackTrace();
          }
        }
    }
  }

  private static void a(WeakReference<Context> paramWeakReference, String paramString)
  {
    if (paramWeakReference != null)
    {
      Context localContext = (Context)paramWeakReference.get();
      if (localContext != null)
      {
        localContext.deleteFile(paramString);
        localContext.deleteFile(paramString.replace(".stacktrace", ".user"));
        localContext.deleteFile(paramString.replace(".stacktrace", ".contact"));
        localContext.deleteFile(paramString.replace(".stacktrace", ".description"));
      }
    }
  }

  public static void a(WeakReference<Context> paramWeakReference, c paramc)
  {
    int i = 0;
    String[] arrayOfString = a();
    Object localObject1 = Boolean.valueOf(false);
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      new StringBuilder().append("Found ").append(arrayOfString.length).append(" stacktrace(s).").toString();
      while (i < arrayOfString.length)
        try
        {
          String str1 = arrayOfString[i];
          String str2 = b(paramWeakReference, str1);
          if (str2.length() > 0)
          {
            new StringBuilder().append("Transmitting crash data: \n").append(str2).toString();
            DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
            HttpPost localHttpPost = new HttpPost(b + "api/2/apps/" + a + "/crashes/");
            ArrayList localArrayList = new ArrayList();
            localArrayList.add(new BasicNameValuePair("raw", str2));
            localArrayList.add(new BasicNameValuePair("userID", b(paramWeakReference, str1.replace(".stacktrace", ".user"))));
            localArrayList.add(new BasicNameValuePair("contact", b(paramWeakReference, str1.replace(".stacktrace", ".contact"))));
            localArrayList.add(new BasicNameValuePair("description", b(paramWeakReference, str1.replace(".stacktrace", ".description"))));
            localArrayList.add(new BasicNameValuePair("sdk", "HockeySDK"));
            localArrayList.add(new BasicNameValuePair("sdk_version", "3.0.0"));
            localHttpPost.setEntity(new UrlEncodedFormEntity(localArrayList, "UTF-8"));
            localDefaultHttpClient.execute(localHttpPost);
            Boolean localBoolean = Boolean.valueOf(true);
            localObject1 = localBoolean;
          }
          if (((Boolean)localObject1).booleanValue())
          {
            a(paramWeakReference, arrayOfString[i]);
            if (paramc == null);
          }
          while (true)
          {
            i++;
            break;
            if (paramc == null);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            localException.printStackTrace();
            if (((Boolean)localObject1).booleanValue())
            {
              a(paramWeakReference, arrayOfString[i]);
              if (paramc == null);
            }
            else if (paramc == null);
          }
        }
        finally
        {
          if (((Boolean)localObject1).booleanValue())
            a(paramWeakReference, arrayOfString[i]);
        }
    }
  }

  private static void a(c paramc, boolean paramBoolean)
  {
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler;
    if ((a.b != null) && (a.d != null))
    {
      localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
      if (localUncaughtExceptionHandler != null)
        new StringBuilder().append("Current handler class = ").append(localUncaughtExceptionHandler.getClass().getName()).toString();
      if ((localUncaughtExceptionHandler instanceof d))
        ((d)localUncaughtExceptionHandler).a(paramc);
    }
    else
    {
      return;
    }
    Thread.setDefaultUncaughtExceptionHandler(new d(localUncaughtExceptionHandler, paramc, paramBoolean));
  }

  private static String[] a()
  {
    if (a.a != null)
    {
      new StringBuilder().append("Looking for exceptions in: ").append(a.a).toString();
      File localFile = new File(a.a + "/");
      if ((!localFile.mkdir()) && (!localFile.exists()))
        return new String[0];
      return localFile.list(new FilenameFilter()
      {
        public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
        {
          return paramAnonymousString.endsWith(".stacktrace");
        }
      });
    }
    return null;
  }

  private static int b(WeakReference<Context> paramWeakReference)
  {
    int i = 0;
    String[] arrayOfString = a();
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      if (paramWeakReference != null);
      while (true)
      {
        try
        {
          Context localContext = (Context)paramWeakReference.get();
          if (localContext != null)
          {
            List localList3 = Arrays.asList(localContext.getSharedPreferences("HockeySDK", 0).getString("ConfirmedFilenames", "").split("\\|"));
            localList1 = localList3;
            localList2 = localList1;
            if (localList2 != null)
            {
              int j = 2;
              int k = arrayOfString.length;
              if (i < k)
              {
                if (!localList2.contains(arrayOfString[i]))
                  j = 1;
              }
              else
                return j;
              i++;
              continue;
            }
            return 1;
          }
        }
        catch (Exception localException)
        {
          List localList2 = null;
          continue;
        }
        List localList1 = null;
      }
    }
    return 0;
  }

  // ERROR //
  private static String b(WeakReference<Context> paramWeakReference, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +157 -> 158
    //   4: aload_0
    //   5: invokevirtual 47	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   8: checkcast 49	android/content/Context
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull +145 -> 158
    //   16: new 105	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 107	java/lang/StringBuilder:<init>	()V
    //   23: astore_3
    //   24: new 303	java/io/BufferedReader
    //   27: dup
    //   28: new 305	java/io/InputStreamReader
    //   31: dup
    //   32: aload_2
    //   33: aload_1
    //   34: invokevirtual 309	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   37: invokespecial 312	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   40: invokespecial 315	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   43: astore 4
    //   45: aload 4
    //   47: invokevirtual 318	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   50: astore 12
    //   52: aload 12
    //   54: ifnull +45 -> 99
    //   57: aload_3
    //   58: aload 12
    //   60: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload_3
    //   65: ldc_w 320
    //   68: invokestatic 326	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   71: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: pop
    //   75: goto -30 -> 45
    //   78: astore 9
    //   80: aload 4
    //   82: astore 10
    //   84: aload 10
    //   86: ifnull +8 -> 94
    //   89: aload 10
    //   91: invokevirtual 329	java/io/BufferedReader:close	()V
    //   94: aload_3
    //   95: invokevirtual 122	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: areturn
    //   99: aload 4
    //   101: invokevirtual 329	java/io/BufferedReader:close	()V
    //   104: goto -10 -> 94
    //   107: astore 15
    //   109: goto -15 -> 94
    //   112: astore 5
    //   114: aconst_null
    //   115: astore 4
    //   117: aload 5
    //   119: invokevirtual 330	java/io/IOException:printStackTrace	()V
    //   122: aload 4
    //   124: ifnull -30 -> 94
    //   127: aload 4
    //   129: invokevirtual 329	java/io/BufferedReader:close	()V
    //   132: goto -38 -> 94
    //   135: astore 8
    //   137: goto -43 -> 94
    //   140: astore 6
    //   142: aconst_null
    //   143: astore 4
    //   145: aload 4
    //   147: ifnull +8 -> 155
    //   150: aload 4
    //   152: invokevirtual 329	java/io/BufferedReader:close	()V
    //   155: aload 6
    //   157: athrow
    //   158: aconst_null
    //   159: areturn
    //   160: astore 11
    //   162: goto -68 -> 94
    //   165: astore 7
    //   167: goto -12 -> 155
    //   170: astore 6
    //   172: goto -27 -> 145
    //   175: astore 5
    //   177: goto -60 -> 117
    //   180: astore 16
    //   182: aconst_null
    //   183: astore 10
    //   185: goto -101 -> 84
    //
    // Exception table:
    //   from	to	target	type
    //   45	52	78	java/io/FileNotFoundException
    //   57	75	78	java/io/FileNotFoundException
    //   99	104	107	java/io/IOException
    //   24	45	112	java/io/IOException
    //   127	132	135	java/io/IOException
    //   24	45	140	finally
    //   89	94	160	java/io/IOException
    //   150	155	165	java/io/IOException
    //   45	52	170	finally
    //   57	75	170	finally
    //   117	122	170	finally
    //   45	52	175	java/io/IOException
    //   57	75	175	java/io/IOException
    //   24	45	180	java/io/FileNotFoundException
  }

  private static void c(WeakReference<Context> paramWeakReference, final c paramc, final boolean paramBoolean)
  {
    Context localContext;
    if (paramWeakReference != null)
    {
      localContext = (Context)paramWeakReference.get();
      if (localContext == null);
    }
    try
    {
      String[] arrayOfString = a();
      SharedPreferences.Editor localEditor = localContext.getSharedPreferences("HockeySDK", 0).edit();
      StringBuffer localStringBuffer = new StringBuffer();
      i = 0;
      if (i < arrayOfString.length)
      {
        localStringBuffer.append(arrayOfString[i]);
        if (i < -1 + arrayOfString.length)
          localStringBuffer.append("|");
      }
      else
      {
        localEditor.putString("ConfirmedFilenames", localStringBuffer.toString());
        e.a(localEditor);
        new Thread()
        {
          public final void run()
          {
            b.a(b.this, paramc);
            b.a(b.this, paramc, paramBoolean);
          }
        }
        .start();
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i;
        continue;
        i++;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     net.hockeyapp.android.b
 * JD-Core Version:    0.6.2
 */