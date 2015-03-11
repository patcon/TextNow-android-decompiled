package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.o;

public abstract class g<T>
{
  private final String Sl;
  private T Sm;

  protected g(String paramString)
  {
    this.Sl = paramString;
  }

  protected final T L(Context paramContext)
  {
    ClassLoader localClassLoader;
    if (this.Sm == null)
    {
      o.i(paramContext);
      Context localContext = GooglePlayServicesUtil.getRemoteContext(paramContext);
      if (localContext == null)
        throw new g.a("Could not get remote context.");
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.Sm = d((IBinder)localClassLoader.loadClass(this.Sl).newInstance());
      return this.Sm;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new g.a("Could not load creator class.", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new g.a("Could not instantiate creator.", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new g.a("Could not access creator.", localIllegalAccessException);
    }
  }

  protected abstract T d(IBinder paramIBinder);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.g
 * JD-Core Version:    0.6.2
 */