package textnow.u;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Base64;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class p
{
  private static HashMap<String, Object> e;
  private static String f;
  private static HashSet<String> g = new HashSet()
  {
  };
  protected Context a;
  private SharedPreferences b;
  private SharedPreferences.Editor c;
  private byte[] d;

  public p(Context paramContext)
  {
    this.a = paramContext;
    this.b = PreferenceManager.getDefaultSharedPreferences(paramContext);
    this.c = this.b.edit();
    b(paramContext);
    if (e == null)
      e = new HashMap();
  }

  public p(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramContext.getSharedPreferences(paramString, 0);
    this.c = this.b.edit();
    b(paramContext);
    if (e == null)
      e = new HashMap();
  }

  private static String a()
  {
    SecureRandom localSecureRandom = new SecureRandom();
    KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES");
    try
    {
      localKeyGenerator.init(256, localSecureRandom);
      return Base64.encodeToString(localKeyGenerator.generateKey().getEncoded(), 3);
    }
    catch (Exception localException1)
    {
      while (true)
        try
        {
          localKeyGenerator.init(192, localSecureRandom);
        }
        catch (Exception localException2)
        {
          localKeyGenerator.init(128, localSecureRandom);
        }
    }
  }

  private String a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return paramString;
    try
    {
      Cipher localCipher = Cipher.getInstance("AES");
      localCipher.init(1, new SecretKeySpec(this.d, "AES"));
      String str = Base64.encodeToString(localCipher.doFinal(paramString.getBytes("UTF-8")), 3);
      return str;
    }
    catch (Exception localException)
    {
      p.class.getName();
    }
    return paramString;
  }

  public static void a(Context paramContext)
  {
    SharedPreferences localSharedPreferences1 = paramContext.getSharedPreferences("migration", 0);
    if (localSharedPreferences1.getBoolean("migrated", false))
      return;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new r(paramContext));
    localArrayList.add(new q(paramContext));
    localArrayList.add(new n(paramContext));
    localArrayList.add(new s(paramContext));
    localArrayList.add(new j(paramContext));
    Iterator localIterator1 = localArrayList.iterator();
    while (localIterator1.hasNext())
    {
      p localp = (p)localIterator1.next();
      SharedPreferences localSharedPreferences2 = localp.b;
      SharedPreferences.Editor localEditor = localp.c;
      Map localMap = localSharedPreferences2.getAll();
      Iterator localIterator2 = localMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        if (g.contains(str))
        {
          Object localObject = localMap.get(str);
          if (localObject != null)
            if (localObject.getClass().equals(Integer.class))
            {
              localp.a(str, localSharedPreferences2.getInt(str, 0));
              localEditor.remove(str);
            }
            else if (localObject.getClass().equals(Long.class))
            {
              localp.a(str, localSharedPreferences2.getLong(str, 0L));
              localEditor.remove(str);
            }
            else if (localObject.getClass().equals(Boolean.class))
            {
              localp.a(str, localSharedPreferences2.getBoolean(str, false));
              localEditor.remove(str);
            }
            else if (localObject.getClass().equals(String.class))
            {
              localp.c(str, localSharedPreferences2.getString(str, ""));
              localEditor.remove(str);
            }
            else
            {
              new StringBuilder().append("Class type could not be found for preference with key ").append(str).toString();
            }
        }
      }
      localEditor.commit();
    }
    localSharedPreferences1.edit().putBoolean("migrated", true).apply();
  }

  private String b(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      return paramString;
    try
    {
      Cipher localCipher = Cipher.getInstance("AES");
      localCipher.init(2, new SecretKeySpec(this.d, "AES"));
      String str = new String(localCipher.doFinal(Base64.decode(paramString, 3)), "UTF-8");
      return str;
    }
    catch (Exception localException)
    {
      p.class.getName();
    }
    return paramString;
  }

  private void b(Context paramContext)
  {
    try
    {
      if (f == null)
      {
        PBEKeySpec localPBEKeySpec = new PBEKeySpec(paramContext.getPackageName().toCharArray(), Settings.Secure.getString(paramContext.getContentResolver(), "android_id").getBytes(), 1000, 256);
        f = Base64.encodeToString(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(localPBEKeySpec).getEncoded(), 3);
      }
      String str = this.b.getString(f, null);
      if (str == null)
      {
        str = a();
        this.b.edit().putString(f, str).commit();
      }
      this.d = Base64.decode(str, 3);
      return;
    }
    catch (Throwable localThrowable)
    {
      this.d = Settings.Secure.getString(paramContext.getContentResolver(), "android_id").getBytes();
    }
  }

  public final void a(String paramString, int paramInt)
  {
    e.put(paramString, Integer.valueOf(paramInt));
    if (g.contains(paramString))
    {
      String str1 = a(paramString);
      String str2 = a(Integer.toString(paramInt));
      this.c.putString(str1, str2);
      return;
    }
    this.c.putInt(paramString, paramInt);
  }

  public final void a(String paramString, long paramLong)
  {
    e.put(paramString, Long.valueOf(paramLong));
    if (g.contains(paramString))
    {
      String str1 = a(paramString);
      String str2 = a(Long.toString(paramLong));
      this.c.putString(str1, str2);
      return;
    }
    this.c.putLong(paramString, paramLong);
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    e.put(paramString, Boolean.valueOf(paramBoolean));
    if (g.contains(paramString))
    {
      String str1 = a(paramString);
      String str2 = a(Boolean.toString(paramBoolean));
      this.c.putString(str1, str2);
      return;
    }
    this.c.putBoolean(paramString, paramBoolean);
  }

  public final void a(HashMap<String, Object> paramHashMap)
  {
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      Object localObject = localEntry.getValue();
      if ((localObject instanceof String))
        c(str, (String)localObject);
      else if ((localObject instanceof Boolean))
        a(str, ((Boolean)localObject).booleanValue());
      else if ((localObject instanceof Integer))
        a(str, ((Integer)localObject).intValue());
      else if ((localObject instanceof Long))
        a(str, ((Long)localObject).longValue());
      else
        new StringBuilder().append("Bad value in changesCache - value:").append(localObject).toString();
    }
  }

  public final int b(String paramString, int paramInt)
  {
    if (e.containsKey(paramString))
      return ((Integer)e.get(paramString)).intValue();
    String str2;
    if (g.contains(paramString))
    {
      String str1 = a(paramString);
      str2 = this.b.getString(str1, null);
    }
    try
    {
      Integer localInteger = Integer.valueOf(Integer.parseInt(b(str2)));
      e.put(paramString, localInteger);
      int i = localInteger.intValue();
      return i;
      return this.b.getInt(paramString, paramInt);
    }
    catch (Exception localException)
    {
    }
    return paramInt;
  }

  public final long b(String paramString, long paramLong)
  {
    if (e.containsKey(paramString))
      return ((Long)e.get(paramString)).longValue();
    String str2;
    if (g.contains(paramString))
    {
      String str1 = a(paramString);
      str2 = this.b.getString(str1, null);
    }
    try
    {
      Long localLong = Long.valueOf(Long.parseLong(b(str2)));
      e.put(paramString, localLong);
      long l = localLong.longValue();
      return l;
      return this.b.getLong(paramString, paramLong);
    }
    catch (Exception localException)
    {
    }
    return paramLong;
  }

  public final Boolean b(String paramString, boolean paramBoolean)
  {
    if (e.containsKey(paramString))
      return (Boolean)e.get(paramString);
    if (g.contains(paramString))
    {
      String str1 = a(paramString);
      String str2 = this.b.getString(str1, null);
      try
      {
        Boolean localBoolean = Boolean.valueOf(Boolean.parseBoolean(b(str2)));
        e.put(paramString, localBoolean);
        return localBoolean;
      }
      catch (Exception localException)
      {
        return Boolean.valueOf(paramBoolean);
      }
    }
    return Boolean.valueOf(this.b.getBoolean(paramString, paramBoolean));
  }

  public final void c(String paramString1, String paramString2)
  {
    e.put(paramString1, paramString2);
    if (g.contains(paramString1))
    {
      String str1 = a(paramString1);
      String str2 = a(paramString2);
      this.c.putString(str1, str2);
      return;
    }
    this.c.putString(paramString1, paramString2);
  }

  public final String d(String paramString1, String paramString2)
  {
    Object localObject;
    if (e.containsKey(paramString1))
    {
      localObject = e.get(paramString1);
      if (localObject != null);
    }
    String str2;
    do
    {
      return paramString2;
      return (String)localObject;
      if (!g.contains(paramString1))
        break;
      String str1 = a(paramString1);
      str2 = this.b.getString(str1, null);
    }
    while (TextUtils.isEmpty(str2));
    String str3 = b(str2);
    e.put(paramString1, str3);
    return str3;
    return this.b.getString(paramString1, paramString2);
  }

  public final String h(String paramString)
  {
    return d(paramString, "");
  }

  public final Boolean i(String paramString)
  {
    return b(paramString, false);
  }

  @SuppressLint({"NewApi"})
  public final void n()
  {
    this.c.apply();
  }

  public final void o()
  {
    this.c.clear();
    e.clear();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.p
 * JD-Core Version:    0.6.2
 */