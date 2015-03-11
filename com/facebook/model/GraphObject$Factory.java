package com.facebook.model;

import com.facebook.FacebookGraphObjectException;
import com.facebook.internal.Utility;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class GraphObject$Factory
{
  private static final SimpleDateFormat[] dateFormats = arrayOfSimpleDateFormat;
  private static final HashSet<Class<?>> verifiedGraphObjectClasses = new HashSet();

  static
  {
    SimpleDateFormat[] arrayOfSimpleDateFormat = new SimpleDateFormat[3];
    arrayOfSimpleDateFormat[0] = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
    arrayOfSimpleDateFormat[1] = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    arrayOfSimpleDateFormat[2] = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
  }

  static <U> U coerceValueToExpectedType(Object paramObject, Class<U> paramClass, ParameterizedType paramParameterizedType)
  {
    if (paramObject == null)
      if (Boolean.TYPE.equals(paramClass))
        paramObject = Boolean.valueOf(false);
    Class localClass1;
    do
    {
      return paramObject;
      if (Character.TYPE.equals(paramClass))
        return Character.valueOf('\000');
      if (paramClass.isPrimitive())
        return Integer.valueOf(0);
      return null;
      localClass1 = paramObject.getClass();
    }
    while ((paramClass.isAssignableFrom(localClass1)) || (paramClass.isPrimitive()));
    if (GraphObject.class.isAssignableFrom(paramClass))
    {
      if (JSONObject.class.isAssignableFrom(localClass1))
        return createGraphObjectProxy(paramClass, (JSONObject)paramObject);
      if (GraphObject.class.isAssignableFrom(localClass1))
        return ((GraphObject)paramObject).cast(paramClass);
      throw new FacebookGraphObjectException("Can't create GraphObject from " + localClass1.getName());
    }
    if ((Iterable.class.equals(paramClass)) || (Collection.class.equals(paramClass)) || (List.class.equals(paramClass)) || (GraphObjectList.class.equals(paramClass)))
    {
      if (paramParameterizedType == null)
        throw new FacebookGraphObjectException("can't infer generic type of: " + paramClass.toString());
      Type[] arrayOfType = paramParameterizedType.getActualTypeArguments();
      if ((arrayOfType == null) || (arrayOfType.length != 1) || (!(arrayOfType[0] instanceof Class)))
        throw new FacebookGraphObjectException("Expect collection properties to be of a type with exactly one generic parameter.");
      Class localClass2 = (Class)arrayOfType[0];
      if (JSONArray.class.isAssignableFrom(localClass1))
        return createList((JSONArray)paramObject, localClass2);
      throw new FacebookGraphObjectException("Can't create Collection from " + localClass1.getName());
    }
    if (String.class.equals(paramClass))
    {
      if ((Double.class.isAssignableFrom(localClass1)) || (Float.class.isAssignableFrom(localClass1)))
        return String.format("%f", new Object[] { paramObject });
      if (Number.class.isAssignableFrom(localClass1))
        return String.format("%d", new Object[] { paramObject });
    }
    else if ((Date.class.equals(paramClass)) && (String.class.isAssignableFrom(localClass1)))
    {
      SimpleDateFormat[] arrayOfSimpleDateFormat = dateFormats;
      int i = arrayOfSimpleDateFormat.length;
      int j = 0;
      while (j < i)
      {
        SimpleDateFormat localSimpleDateFormat = arrayOfSimpleDateFormat[j];
        try
        {
          Date localDate = localSimpleDateFormat.parse((String)paramObject);
          if (localDate != null)
            return localDate;
        }
        catch (ParseException localParseException)
        {
          j++;
        }
      }
    }
    throw new FacebookGraphObjectException("Can't convert type" + localClass1.getName() + " to " + paramClass.getName());
  }

  static String convertCamelCaseToLowercaseWithUnderscores(String paramString)
  {
    return paramString.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase(Locale.US);
  }

  public static GraphObject create()
  {
    return create(GraphObject.class);
  }

  public static <T extends GraphObject> T create(Class<T> paramClass)
  {
    return createGraphObjectProxy(paramClass, new JSONObject());
  }

  public static GraphObject create(JSONObject paramJSONObject)
  {
    return create(paramJSONObject, GraphObject.class);
  }

  public static <T extends GraphObject> T create(JSONObject paramJSONObject, Class<T> paramClass)
  {
    return createGraphObjectProxy(paramClass, paramJSONObject);
  }

  private static <T extends GraphObject> T createGraphObjectProxy(Class<T> paramClass, JSONObject paramJSONObject)
  {
    verifyCanProxyClass(paramClass);
    Class[] arrayOfClass = { paramClass };
    GraphObject.Factory.GraphObjectProxy localGraphObjectProxy = new GraphObject.Factory.GraphObjectProxy(paramJSONObject, paramClass);
    return (GraphObject)Proxy.newProxyInstance(GraphObject.class.getClassLoader(), arrayOfClass, localGraphObjectProxy);
  }

  private static Map<String, Object> createGraphObjectProxyForMap(JSONObject paramJSONObject)
  {
    Class[] arrayOfClass = { Map.class };
    GraphObject.Factory.GraphObjectProxy localGraphObjectProxy = new GraphObject.Factory.GraphObjectProxy(paramJSONObject, Map.class);
    return (Map)Proxy.newProxyInstance(GraphObject.class.getClassLoader(), arrayOfClass, localGraphObjectProxy);
  }

  public static <T> GraphObjectList<T> createList(Class<T> paramClass)
  {
    return createList(new JSONArray(), paramClass);
  }

  public static <T> GraphObjectList<T> createList(JSONArray paramJSONArray, Class<T> paramClass)
  {
    return new GraphObject.Factory.GraphObjectListImpl(paramJSONArray, paramClass);
  }

  private static Object getUnderlyingJSONObject(Object paramObject)
  {
    if (paramObject == null)
      paramObject = null;
    Class localClass;
    do
    {
      return paramObject;
      localClass = paramObject.getClass();
      if (GraphObject.class.isAssignableFrom(localClass))
        return ((GraphObject)paramObject).getInnerJSONObject();
      if (GraphObjectList.class.isAssignableFrom(localClass))
        return ((GraphObjectList)paramObject).getInnerJSONArray();
    }
    while (!Iterable.class.isAssignableFrom(localClass));
    JSONArray localJSONArray = new JSONArray();
    Iterator localIterator = ((Iterable)paramObject).iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (GraphObject.class.isAssignableFrom(localObject.getClass()))
        localJSONArray.put(((GraphObject)localObject).getInnerJSONObject());
      else
        localJSONArray.put(localObject);
    }
    return localJSONArray;
  }

  private static <T extends GraphObject> boolean hasClassBeenVerified(Class<T> paramClass)
  {
    try
    {
      boolean bool = verifiedGraphObjectClasses.contains(paramClass);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static boolean hasSameId(GraphObject paramGraphObject1, GraphObject paramGraphObject2)
  {
    if ((paramGraphObject1 == null) || (paramGraphObject2 == null) || (!paramGraphObject1.asMap().containsKey("id")) || (!paramGraphObject2.asMap().containsKey("id")));
    Object localObject1;
    Object localObject2;
    do
    {
      return false;
      if (paramGraphObject1.equals(paramGraphObject2))
        return true;
      localObject1 = paramGraphObject1.getProperty("id");
      localObject2 = paramGraphObject2.getProperty("id");
    }
    while ((localObject1 == null) || (localObject2 == null) || (!(localObject1 instanceof String)) || (!(localObject2 instanceof String)));
    return localObject1.equals(localObject2);
  }

  private static <T extends GraphObject> void recordClassHasBeenVerified(Class<T> paramClass)
  {
    try
    {
      verifiedGraphObjectClasses.add(paramClass);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static <T extends GraphObject> void verifyCanProxyClass(Class<T> paramClass)
  {
    if (hasClassBeenVerified(paramClass))
      return;
    if (!paramClass.isInterface())
      throw new FacebookGraphObjectException("Factory can only wrap interfaces, not class: " + paramClass.getName());
    Method[] arrayOfMethod = paramClass.getMethods();
    int i = arrayOfMethod.length;
    int j = 0;
    if (j < i)
    {
      Method localMethod = arrayOfMethod[j];
      String str = localMethod.getName();
      int k = localMethod.getParameterTypes().length;
      Class localClass = localMethod.getReturnType();
      boolean bool = localMethod.isAnnotationPresent(PropertyName.class);
      if (!localMethod.getDeclaringClass().isAssignableFrom(GraphObject.class))
      {
        if ((k != 1) || (localClass != Void.TYPE))
          break label210;
        if (!bool)
          break label158;
        if (Utility.isNullOrEmpty(((PropertyName)localMethod.getAnnotation(PropertyName.class)).value()))
          break label178;
      }
      label158: 
      while ((str.startsWith("set")) && (str.length() > 3))
      {
        j++;
        break;
      }
      while (true)
      {
        label178: throw new FacebookGraphObjectException("Factory can't proxy method: " + localMethod.toString());
        label210: if ((k == 0) && (localClass != Void.TYPE))
        {
          if (bool)
          {
            if (Utility.isNullOrEmpty(((PropertyName)localMethod.getAnnotation(PropertyName.class)).value()))
              continue;
            break;
          }
          if (str.startsWith("get"))
            if (str.length() > 3)
              break;
        }
      }
    }
    recordClassHasBeenVerified(paramClass);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.model.GraphObject.Factory
 * JD-Core Version:    0.6.2
 */