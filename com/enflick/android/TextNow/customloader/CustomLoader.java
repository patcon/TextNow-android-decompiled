package com.enflick.android.TextNow.customloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class CustomLoader
{
  private static final String BANNER_SDK_DEX = "banner_dex.jar";
  private static final String BANNER_SDK_DEX_PREFIX = "banner_dex_";
  private static final int BUF_SIZE = 8192;
  private static final String OUT_DEX_DIR_PREFIX = "outdex_";
  private static final String SECONDARY_DEX_SUFFIX = ".jar";
  private static final String TAG = "CustomLoader";
  private static final String VIDEO_SDK_DEX = "video_dex.jar";
  private static final String VIDEO_SDK_DEX_PREFIX = "video_dex_";
  private static Long mCachedAppBuildTime;
  protected Context mAppContext;
  protected DexClassLoader mClassLoader;
  private final String mDexAssetName;
  protected File mDexInternalStoragePath;
  private final String mOpDexPrefix;

  private CustomLoader(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.mAppContext = paramContext.getApplicationContext();
    this.mDexAssetName = paramString1;
    this.mOpDexPrefix = paramString2;
    String str = getSecondaryDexFileName();
    this.mDexInternalStoragePath = new File(this.mAppContext.getDir("dex", 0), str);
    new StringBuilder().append("dex internal storage path: ").append(this.mDexInternalStoragePath.getAbsolutePath()).toString();
    if ((!this.mDexInternalStoragePath.exists()) || (!isLocked(str)))
    {
      if (prepareDex())
        addCreatedLock(str);
    }
    else
    {
      createClassLoader(paramString3);
      return;
    }
    cleanCreatedLock(getSecondaryDexFileName());
    throw new RuntimeException("could not prepare dex file!!!");
  }

  private void addCreatedLock(String paramString)
  {
    new StringBuilder().append("locking file ").append(paramString).toString();
    File localFile = toLockFile(paramString);
    try
    {
      localFile.createNewFile();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  private void addToArray(Object paramObject1, Field paramField, Object paramObject2)
  {
    paramField.setAccessible(true);
    Object localObject1 = paramField.get(paramObject1);
    int i = Array.getLength(localObject1);
    Class localClass = paramField.getType().getComponentType();
    if (localClass != paramObject2.getClass())
      throw new IllegalArgumentException("array type mismatch! " + localClass + " vs " + paramObject2.getClass());
    Object localObject2 = Array.newInstance(localClass, i + 1);
    for (int j = 0; j < i; j++)
      Array.set(localObject2, j, Array.get(localObject1, j));
    new StringBuilder().append("adding ").append(paramObject2).toString();
    Array.set(localObject2, i, paramObject2);
    paramField.set(paramObject1, localObject2);
    paramField.setAccessible(false);
  }

  private void cleanCreatedLock(String paramString)
  {
    new StringBuilder().append("cleaning lock for file ").append(paramString).toString();
    toLockFile(paramString).delete();
  }

  private void cleanPreviousDexFiles(String paramString)
  {
    int i = 0;
    File localFile1 = this.mAppContext.getDir("dex", 0);
    File[] arrayOfFile;
    if (localFile1.isDirectory())
    {
      arrayOfFile = localFile1.listFiles();
      if (arrayOfFile != null)
        break label32;
    }
    while (true)
    {
      return;
      label32: int j = arrayOfFile.length;
      while (i < j)
      {
        File localFile2 = arrayOfFile[i];
        if ((localFile2.isFile()) && (!paramString.equals(localFile2.getName())) && (localFile2.getName().startsWith(this.mOpDexPrefix)) && (localFile2.getName().endsWith(".jar")))
        {
          cleanCreatedLock(localFile2.getName());
          localFile2.delete();
          new StringBuilder().append("cleaned dex file ").append(localFile2.getName()).toString();
        }
        i++;
      }
    }
  }

  private void cleanPreviousOptimizedDexFolders(File paramFile, String paramString)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null);
    while (true)
    {
      return;
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
      {
        File localFile = arrayOfFile[j];
        if ((localFile.isDirectory()) && (!paramString.equals(localFile.getName())) && (localFile.getName().startsWith("outdex_")))
        {
          deleteRecursive(localFile);
          new StringBuilder().append("cleaned dex output folder ").append(localFile.getName()).toString();
        }
      }
    }
  }

  private void createClassLoader(String paramString)
  {
    File localFile1 = this.mAppContext.getDir("outdex", 0);
    File localFile2 = new File(localFile1, getOutDexDir());
    cleanPreviousOptimizedDexFolders(localFile1, getOutDexDir());
    localFile2.mkdir();
    new StringBuilder().append("optimized output dir ").append(localFile2.getAbsolutePath()).toString();
    ClassLoader localClassLoader = this.mAppContext.getClassLoader();
    this.mClassLoader = new DexClassLoader(this.mDexInternalStoragePath.getAbsolutePath(), localFile2.getAbsolutePath(), null, localClassLoader);
    try
    {
      if (localClassLoader.loadClass(paramString) != null)
      {
        new StringBuilder().append(paramString).append(" already in system path, skipping").toString();
        return;
      }
    }
    catch (Throwable localThrowable1)
    {
      new StringBuilder().append(paramString).append(" not loaded in system path, adding to system path...").toString();
      try
      {
        if (Build.VERSION.SDK_INT >= 14)
        {
          mergeDexPathICS();
          return;
        }
        mergeDexPath();
        return;
      }
      catch (Throwable localThrowable2)
      {
      }
    }
  }

  private long getAppBuildTime()
  {
    if (mCachedAppBuildTime == null);
    try
    {
      mCachedAppBuildTime = Long.valueOf(new ZipFile(this.mAppContext.getPackageManager().getApplicationInfo(this.mAppContext.getPackageName(), 0).sourceDir).getEntry("classes.dex").getTime());
      new StringBuilder().append("app build time ").append(mCachedAppBuildTime).toString();
      return mCachedAppBuildTime.longValue();
    }
    catch (Throwable localThrowable)
    {
    }
    return 1L;
  }

  private String getOutDexDir()
  {
    return "outdex_" + getAppBuildTime();
  }

  private String getSecondaryDexFileName()
  {
    return this.mOpDexPrefix + getAppBuildTime() + ".jar";
  }

  private boolean isLocked(String paramString)
  {
    return toLockFile(paramString).exists();
  }

  private void mergeArray(Object paramObject1, Field paramField1, Object paramObject2, Field paramField2)
  {
    paramField1.setAccessible(true);
    paramField2.setAccessible(true);
    Object localObject1 = paramField1.get(paramObject1);
    Object localObject2 = paramField2.get(paramObject2);
    int i = Array.getLength(localObject1);
    int j = Array.getLength(localObject2);
    Class localClass1 = paramField1.getType().getComponentType();
    Class localClass2 = paramField2.getType().getComponentType();
    if (localClass1 != localClass2)
      throw new IllegalArgumentException("array type mismatch! " + localClass1 + " vs " + localClass2);
    Object localObject3 = Array.newInstance(localClass1, i + j);
    for (int k = 0; k < i; k++)
    {
      Object localObject5 = Array.get(localObject1, k);
      new StringBuilder().append("merging ").append(localObject5).toString();
      Array.set(localObject3, k, localObject5);
    }
    for (int m = 0; m < j; m++)
    {
      Object localObject4 = Array.get(localObject2, m);
      new StringBuilder().append("merging ").append(localObject4).toString();
      Array.set(localObject3, m + i, localObject4);
    }
    paramField1.set(paramObject1, localObject3);
    paramField1.setAccessible(false);
    paramField2.setAccessible(false);
  }

  private void mergeDexPath()
  {
    ClassLoader localClassLoader = this.mAppContext.getClassLoader();
    Field localField1 = localClassLoader.getClass().getDeclaredField("mFiles");
    Field localField2 = localClassLoader.getClass().getDeclaredField("mZips");
    Field localField3 = localClassLoader.getClass().getDeclaredField("mDexs");
    Field localField4 = localClassLoader.getClass().getDeclaredField("mPaths");
    Field localField5 = this.mClassLoader.getClass().getDeclaredField("mFiles");
    Field localField6 = this.mClassLoader.getClass().getDeclaredField("mZips");
    Field localField7 = this.mClassLoader.getClass().getDeclaredField("mDexs");
    Field localField8 = this.mClassLoader.getClass().getDeclaredField("mRawDexPath");
    localField8.setAccessible(true);
    Object localObject = localField8.get(this.mClassLoader);
    mergeArray(localClassLoader, localField1, this.mClassLoader, localField5);
    mergeArray(localClassLoader, localField2, this.mClassLoader, localField6);
    mergeArray(localClassLoader, localField3, this.mClassLoader, localField7);
    addToArray(localClassLoader, localField4, localObject);
    localField8.setAccessible(false);
  }

  private void mergeDexPathICS()
  {
    Field localField1 = BaseDexClassLoader.class.getDeclaredField("pathList");
    localField1.setAccessible(true);
    Object localObject1 = localField1.get(this.mAppContext.getClassLoader());
    Object localObject2 = localField1.get(this.mClassLoader);
    Field localField2 = Class.forName("dalvik.system.DexPathList").getDeclaredField("dexElements");
    mergeArray(localObject1, localField2, localObject2, localField2);
    localField1.setAccessible(false);
  }

  public static CustomLoader newBannerLoader(Context paramContext, String paramString)
  {
    return new CustomLoader(paramContext, "banner_dex.jar", "banner_dex_", paramString);
  }

  public static CustomLoader newVideoLoader(Context paramContext, String paramString)
  {
    return new CustomLoader(paramContext, "video_dex.jar", "video_dex_", paramString);
  }

  private boolean prepareDex()
  {
    String str = getSecondaryDexFileName();
    new StringBuilder().append("target filename ").append(str).toString();
    cleanPreviousDexFiles(str);
    try
    {
      localBufferedInputStream1 = new BufferedInputStream(this.mAppContext.getAssets().open(this.mDexAssetName));
    }
    catch (IOException localIOException5)
    {
      try
      {
        localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.mDexInternalStoragePath));
        try
        {
          byte[] arrayOfByte = new byte[8192];
          while (true)
          {
            int i = localBufferedInputStream1.read(arrayOfByte, 0, 8192);
            if (i <= 0)
              break;
            localBufferedOutputStream.write(arrayOfByte, 0, i);
          }
        }
        catch (IOException localIOException1)
        {
          localBufferedInputStream2 = localBufferedInputStream1;
        }
        while (true)
        {
          if (localBufferedOutputStream != null);
          try
          {
            localBufferedOutputStream.close();
            if (localBufferedInputStream2 == null);
          }
          catch (IOException localIOException3)
          {
            try
            {
              localBufferedInputStream2.close();
              return false;
              localBufferedOutputStream.close();
              localBufferedInputStream1.close();
              return true;
              localIOException3 = localIOException3;
              localIOException3.printStackTrace();
            }
            catch (IOException localIOException2)
            {
              localIOException2.printStackTrace();
              return false;
            }
          }
          localIOException5 = localIOException5;
          localBufferedOutputStream = null;
          localBufferedInputStream2 = null;
        }
      }
      catch (IOException localIOException4)
      {
        while (true)
        {
          BufferedInputStream localBufferedInputStream1;
          BufferedInputStream localBufferedInputStream2 = localBufferedInputStream1;
          BufferedOutputStream localBufferedOutputStream = null;
        }
      }
    }
  }

  private File toLockFile(String paramString)
  {
    return new File(this.mAppContext.getDir("locks", 0), "lock_" + paramString);
  }

  void deleteRecursive(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      File[] arrayOfFile = paramFile.listFiles();
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
        deleteRecursive(arrayOfFile[j]);
    }
    paramFile.delete();
  }

  public Class<?> loadClass(String paramString)
  {
    return this.mAppContext.getClassLoader().loadClass(paramString);
  }

  public <T> T loadWrapper(Class<T> paramClass, String paramString)
  {
    return paramClass.cast(loadClass(paramString).newInstance());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.CustomLoader
 * JD-Core Version:    0.6.2
 */