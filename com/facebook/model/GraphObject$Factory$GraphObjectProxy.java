package com.facebook.model;

import com.facebook.internal.Utility;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class GraphObject$Factory$GraphObjectProxy extends GraphObject.Factory.ProxyBase<JSONObject>
{
  private static final String CASTTOMAP_METHOD = "asMap";
  private static final String CAST_METHOD = "cast";
  private static final String CLEAR_METHOD = "clear";
  private static final String CONTAINSKEY_METHOD = "containsKey";
  private static final String CONTAINSVALUE_METHOD = "containsValue";
  private static final String ENTRYSET_METHOD = "entrySet";
  private static final String GETINNERJSONOBJECT_METHOD = "getInnerJSONObject";
  private static final String GETPROPERTYASLIST_METHOD = "getPropertyAsList";
  private static final String GETPROPERTYAS_METHOD = "getPropertyAs";
  private static final String GETPROPERTY_METHOD = "getProperty";
  private static final String GET_METHOD = "get";
  private static final String ISEMPTY_METHOD = "isEmpty";
  private static final String KEYSET_METHOD = "keySet";
  private static final String PUTALL_METHOD = "putAll";
  private static final String PUT_METHOD = "put";
  private static final String REMOVEPROPERTY_METHOD = "removeProperty";
  private static final String REMOVE_METHOD = "remove";
  private static final String SETPROPERTY_METHOD = "setProperty";
  private static final String SIZE_METHOD = "size";
  private static final String VALUES_METHOD = "values";
  private final Class<?> graphObjectClass;

  public GraphObject$Factory$GraphObjectProxy(JSONObject paramJSONObject, Class<?> paramClass)
  {
    super(paramJSONObject);
    this.graphObjectClass = paramClass;
  }

  private Object createGraphObjectsFromParameters(CreateGraphObject paramCreateGraphObject, Object paramObject)
  {
    String str;
    if ((paramCreateGraphObject != null) && (!Utility.isNullOrEmpty(paramCreateGraphObject.value())))
    {
      str = paramCreateGraphObject.value();
      if (List.class.isAssignableFrom(paramObject.getClass()))
      {
        GraphObjectList localGraphObjectList = GraphObject.Factory.createList(GraphObject.class);
        Iterator localIterator = ((List)paramObject).iterator();
        while (localIterator.hasNext())
        {
          Object localObject = localIterator.next();
          GraphObject localGraphObject2 = GraphObject.Factory.create();
          localGraphObject2.setProperty(str, localObject);
          localGraphObjectList.add(localGraphObject2);
        }
        paramObject = localGraphObjectList;
      }
    }
    else
    {
      return paramObject;
    }
    GraphObject localGraphObject1 = GraphObject.Factory.create();
    localGraphObject1.setProperty(str, paramObject);
    return localGraphObject1;
  }

  private final Object proxyGraphObjectGettersAndSetters(Method paramMethod, Object[] paramArrayOfObject)
  {
    String str1 = paramMethod.getName();
    int i = paramMethod.getParameterTypes().length;
    PropertyName localPropertyName = (PropertyName)paramMethod.getAnnotation(PropertyName.class);
    String str2;
    Object localObject2;
    Class localClass;
    Type localType;
    if (localPropertyName != null)
    {
      str2 = localPropertyName.value();
      if (i != 0)
        break label106;
      localObject2 = ((JSONObject)this.state).opt(str2);
      localClass = paramMethod.getReturnType();
      localType = paramMethod.getGenericReturnType();
      if (!(localType instanceof ParameterizedType))
        break label156;
    }
    label156: for (ParameterizedType localParameterizedType = (ParameterizedType)localType; ; localParameterizedType = null)
    {
      return GraphObject.Factory.coerceValueToExpectedType(localObject2, localClass, localParameterizedType);
      str2 = GraphObject.Factory.convertCamelCaseToLowercaseWithUnderscores(str1.substring(3));
      break;
      label106: if (i == 1)
      {
        Object localObject1 = GraphObject.Factory.access$200(createGraphObjectsFromParameters((CreateGraphObject)paramMethod.getAnnotation(CreateGraphObject.class), paramArrayOfObject[0]));
        ((JSONObject)this.state).putOpt(str2, localObject1);
        return null;
      }
      return throwUnexpectedMethodSignature(paramMethod);
    }
  }

  private final Object proxyGraphObjectMethods(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    String str = paramMethod.getName();
    if (str.equals("cast"))
    {
      Class localClass = (Class)paramArrayOfObject[0];
      if ((localClass != null) && (localClass.isAssignableFrom(this.graphObjectClass)))
        return paramObject;
      return GraphObject.Factory.access$000(localClass, (JSONObject)this.state);
    }
    if (str.equals("getInnerJSONObject"))
      return ((GraphObjectProxy)Proxy.getInvocationHandler(paramObject)).state;
    if (str.equals("asMap"))
      return GraphObject.Factory.access$100((JSONObject)this.state);
    if (str.equals("getProperty"))
      return ((JSONObject)this.state).opt((String)paramArrayOfObject[0]);
    if (str.equals("getPropertyAs"))
      return GraphObject.Factory.coerceValueToExpectedType(((JSONObject)this.state).opt((String)paramArrayOfObject[0]), (Class)paramArrayOfObject[1], null);
    if (str.equals("getPropertyAsList"))
      return GraphObject.Factory.coerceValueToExpectedType(((JSONObject)this.state).opt((String)paramArrayOfObject[0]), GraphObjectList.class, new ParameterizedType()
      {
        public Type[] getActualTypeArguments()
        {
          Type[] arrayOfType = new Type[1];
          arrayOfType[0] = this.val$expectedType;
          return arrayOfType;
        }

        public Type getOwnerType()
        {
          return null;
        }

        public Type getRawType()
        {
          return GraphObjectList.class;
        }
      });
    if (str.equals("setProperty"))
      return setJSONProperty(paramArrayOfObject);
    if (str.equals("removeProperty"))
    {
      ((JSONObject)this.state).remove((String)paramArrayOfObject[0]);
      return null;
    }
    return throwUnexpectedMethodSignature(paramMethod);
  }

  private final Object proxyMapMethods(Method paramMethod, Object[] paramArrayOfObject)
  {
    String str = paramMethod.getName();
    if (str.equals("clear"))
    {
      JsonUtil.jsonObjectClear((JSONObject)this.state);
      return null;
    }
    if (str.equals("containsKey"))
      return Boolean.valueOf(((JSONObject)this.state).has((String)paramArrayOfObject[0]));
    if (str.equals("containsValue"))
      return Boolean.valueOf(JsonUtil.jsonObjectContainsValue((JSONObject)this.state, paramArrayOfObject[0]));
    if (str.equals("entrySet"))
      return JsonUtil.jsonObjectEntrySet((JSONObject)this.state);
    if (str.equals("get"))
      return ((JSONObject)this.state).opt((String)paramArrayOfObject[0]);
    if (str.equals("isEmpty"))
    {
      if (((JSONObject)this.state).length() == 0);
      for (boolean bool = true; ; bool = false)
        return Boolean.valueOf(bool);
    }
    if (str.equals("keySet"))
      return JsonUtil.jsonObjectKeySet((JSONObject)this.state);
    if (str.equals("put"))
      return setJSONProperty(paramArrayOfObject);
    if (str.equals("putAll"))
    {
      if ((paramArrayOfObject[0] instanceof Map));
      for (Map localMap = (Map)paramArrayOfObject[0]; ; localMap = ((GraphObject)paramArrayOfObject[0]).asMap())
      {
        JsonUtil.jsonObjectPutAll((JSONObject)this.state, localMap);
        return null;
        if (!(paramArrayOfObject[0] instanceof GraphObject))
          break;
      }
      return null;
    }
    if (str.equals("remove"))
    {
      ((JSONObject)this.state).remove((String)paramArrayOfObject[0]);
      return null;
    }
    if (str.equals("size"))
      return Integer.valueOf(((JSONObject)this.state).length());
    if (str.equals("values"))
      return JsonUtil.jsonObjectValues((JSONObject)this.state);
    return throwUnexpectedMethodSignature(paramMethod);
  }

  private Object setJSONProperty(Object[] paramArrayOfObject)
  {
    String str = (String)paramArrayOfObject[0];
    Object localObject = GraphObject.Factory.access$200(paramArrayOfObject[1]);
    try
    {
      ((JSONObject)this.state).putOpt(str, localObject);
      return null;
    }
    catch (JSONException localJSONException)
    {
      throw new IllegalArgumentException(localJSONException);
    }
  }

  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    Class localClass = paramMethod.getDeclaringClass();
    if (localClass == Object.class)
      return proxyObjectMethods(paramObject, paramMethod, paramArrayOfObject);
    if (localClass == Map.class)
      return proxyMapMethods(paramMethod, paramArrayOfObject);
    if (localClass == GraphObject.class)
      return proxyGraphObjectMethods(paramObject, paramMethod, paramArrayOfObject);
    if (GraphObject.class.isAssignableFrom(localClass))
      return proxyGraphObjectGettersAndSetters(paramMethod, paramArrayOfObject);
    return throwUnexpectedMethodSignature(paramMethod);
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.graphObjectClass.getSimpleName();
    arrayOfObject[1] = this.state;
    return String.format("GraphObject{graphObjectClass=%s, state=%s}", arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.model.GraphObject.Factory.GraphObjectProxy
 * JD-Core Version:    0.6.2
 */