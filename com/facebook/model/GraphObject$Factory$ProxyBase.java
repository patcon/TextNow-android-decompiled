package com.facebook.model;

import com.facebook.FacebookGraphObjectException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

abstract class GraphObject$Factory$ProxyBase<STATE>
  implements InvocationHandler
{
  private static final String EQUALS_METHOD = "equals";
  private static final String TOSTRING_METHOD = "toString";
  protected final STATE state;

  protected GraphObject$Factory$ProxyBase(STATE paramSTATE)
  {
    this.state = paramSTATE;
  }

  protected final Object proxyObjectMethods(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    String str = paramMethod.getName();
    if (str.equals("equals"))
    {
      Object localObject = paramArrayOfObject[0];
      if (localObject == null)
        return Boolean.valueOf(false);
      InvocationHandler localInvocationHandler = Proxy.getInvocationHandler(localObject);
      if (!(localInvocationHandler instanceof GraphObject.Factory.GraphObjectProxy))
        return Boolean.valueOf(false);
      GraphObject.Factory.GraphObjectProxy localGraphObjectProxy = (GraphObject.Factory.GraphObjectProxy)localInvocationHandler;
      return Boolean.valueOf(this.state.equals(localGraphObjectProxy.state));
    }
    if (str.equals("toString"))
      return toString();
    return paramMethod.invoke(this.state, paramArrayOfObject);
  }

  protected final Object throwUnexpectedMethodSignature(Method paramMethod)
  {
    throw new FacebookGraphObjectException(getClass().getName() + " got an unexpected method signature: " + paramMethod.toString());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.model.GraphObject.Factory.ProxyBase
 * JD-Core Version:    0.6.2
 */