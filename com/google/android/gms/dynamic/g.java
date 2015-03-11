package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.hm;

public abstract class g<T>
{
  private final String Ml;
  private T Mm;

  protected g(String paramString)
  {
    this.Ml = paramString;
  }

  protected final T G(Context paramContext)
  {
    ClassLoader localClassLoader;
    if (this.Mm == null)
    {
      hm.f(paramContext);
      Context localContext = GooglePlayServicesUtil.getRemoteContext(paramContext);
      if (localContext == null)
        throw new g.a("Could not get remote context.");
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.Mm = d((IBinder)localClassLoader.loadClass(this.Ml).newInstance());
      return this.Mm;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new g.a("Could not load creator class.");
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new g.a("Could not instantiate creator.");
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new g.a("Could not access creator.");
  }

  protected abstract T d(IBinder paramIBinder);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.g
 * JD-Core Version:    0.6.2
 */