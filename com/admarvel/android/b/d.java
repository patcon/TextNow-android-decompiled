package com.admarvel.android.b;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class d
{
  public static ArrayList<String> a(String paramString1, String paramString2)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = "";
    while (true)
    {
      ZipInputStream localZipInputStream;
      ZipEntry localZipEntry;
      Object localObject4;
      try
      {
        File localFile1 = new File(paramString2);
        if (!localFile1.isDirectory())
          localFile1.mkdirs();
        localZipInputStream = new ZipInputStream(new FileInputStream(paramString1));
        try
        {
          localZipEntry = localZipInputStream.getNextEntry();
          if (localZipEntry == null)
            break label387;
          localObject4 = paramString2 + "/" + localZipEntry.getName();
          localArrayList.add(localObject4);
          if (!localZipEntry.isDirectory())
            break label227;
          File localFile2 = new File((String)localObject4);
          if (localFile2.isDirectory())
            continue;
          localFile2.mkdirs();
          continue;
        }
        finally
        {
        }
        if (((String)localObject1).length() > 0)
        {
          String str1 = "mv " + (String)localObject1 + ".tmp" + " " + (String)localObject1;
          Runtime.getRuntime().exec(str1);
        }
        if (new File(paramString1).delete())
          break label462;
        throw new Exception("Error in deleting Zip file ");
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        localArrayList = null;
        return localArrayList;
      }
      label227: String str2 = localZipEntry.getName().substring(1 + localZipEntry.getName().lastIndexOf("."), localZipEntry.getName().length());
      if (str2.length() > 0)
      {
        boolean bool = str2.equalsIgnoreCase("xml");
        if (!bool);
      }
      try
      {
        String str3 = (String)localObject4 + ".tmp";
        localObject1 = localObject4;
        localObject4 = str3;
        FileOutputStream localFileOutputStream = new FileOutputStream((String)localObject4, false);
        localFileOutputStream.toString().length();
        try
        {
          byte[] arrayOfByte = new byte[8192];
          while (true)
          {
            int i = localZipInputStream.read(arrayOfByte);
            if (i == -1)
              break;
            localFileOutputStream.write(arrayOfByte, 0, i);
          }
        }
        finally
        {
          localFileOutputStream.close();
        }
        localZipInputStream.closeEntry();
        localFileOutputStream.close();
        continue;
        label387: if (((String)localObject1).length() > 0)
        {
          String str4 = "mv " + (String)localObject1 + ".tmp" + " " + (String)localObject1;
          Runtime.getRuntime().exec(str4);
        }
        if (!new File(paramString1).delete())
        {
          throw new Exception("Error in deleting Zip file ");
          label462: throw localObject2;
        }
      }
      finally
      {
      }
    }
  }

  public static void a(File paramFile)
  {
    if (paramFile.isDirectory());
    while (true)
    {
      try
      {
        String[] arrayOfString = paramFile.list();
        if (arrayOfString != null)
          break label82;
        return;
        if (i < arrayOfString.length)
        {
          File localFile = new File(paramFile, arrayOfString[i]);
          if (localFile.isDirectory())
          {
            a(localFile);
            localFile.delete();
          }
          else
          {
            localFile.delete();
          }
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        Logging.log(localNullPointerException.getMessage());
        return;
      }
      paramFile.delete();
      return;
      label82: int i = 0;
      continue;
      i++;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.b.d
 * JD-Core Version:    0.6.2
 */