package com.mopub.common.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Reflection$MethodBuilder
{
  private Class<?> mClass;
  private final Object mInstance;
  private boolean mIsAccessible;
  private boolean mIsStatic;
  private final String mMethodName;
  private List<Class<?>> mParameterClasses;
  private List<Object> mParameters;

  public Reflection$MethodBuilder(Object paramObject, String paramString)
  {
    this.mInstance = paramObject;
    this.mMethodName = paramString;
    this.mParameterClasses = new ArrayList();
    this.mParameters = new ArrayList();
    if (paramObject != null);
    for (Class localClass = paramObject.getClass(); ; localClass = null)
    {
      this.mClass = localClass;
      return;
    }
  }

  public <T> MethodBuilder addParam(Class<T> paramClass, T paramT)
  {
    this.mParameterClasses.add(paramClass);
    this.mParameters.add(paramT);
    return this;
  }

  public Object execute()
  {
    Class[] arrayOfClass1 = new Class[this.mParameterClasses.size()];
    Class[] arrayOfClass2 = (Class[])this.mParameterClasses.toArray(arrayOfClass1);
    Method localMethod = Reflection.getDeclaredMethodWithTraversal(this.mClass, this.mMethodName, arrayOfClass2);
    if (this.mIsAccessible)
      localMethod.setAccessible(true);
    Object[] arrayOfObject = this.mParameters.toArray();
    if (this.mIsStatic)
      return localMethod.invoke(null, arrayOfObject);
    return localMethod.invoke(this.mInstance, arrayOfObject);
  }

  public MethodBuilder setAccessible()
  {
    this.mIsAccessible = true;
    return this;
  }

  public MethodBuilder setStatic(Class<?> paramClass)
  {
    this.mIsStatic = true;
    this.mClass = paramClass;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.Reflection.MethodBuilder
 * JD-Core Version:    0.6.2
 */