package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JacksonAnnotation;
import com.flurry.org.codehaus.jackson.annotate.JsonAnyGetter;
import com.flurry.org.codehaus.jackson.annotate.JsonAnySetter;
import com.flurry.org.codehaus.jackson.annotate.JsonAutoDetect;
import com.flurry.org.codehaus.jackson.annotate.JsonBackReference;
import com.flurry.org.codehaus.jackson.annotate.JsonCreator;
import com.flurry.org.codehaus.jackson.annotate.JsonGetter;
import com.flurry.org.codehaus.jackson.annotate.JsonIgnore;
import com.flurry.org.codehaus.jackson.annotate.JsonIgnoreProperties;
import com.flurry.org.codehaus.jackson.annotate.JsonIgnoreType;
import com.flurry.org.codehaus.jackson.annotate.JsonManagedReference;
import com.flurry.org.codehaus.jackson.annotate.JsonProperty;
import com.flurry.org.codehaus.jackson.annotate.JsonPropertyOrder;
import com.flurry.org.codehaus.jackson.annotate.JsonRawValue;
import com.flurry.org.codehaus.jackson.annotate.JsonSetter;
import com.flurry.org.codehaus.jackson.annotate.JsonSubTypes;
import com.flurry.org.codehaus.jackson.annotate.JsonSubTypes.Type;
import com.flurry.org.codehaus.jackson.annotate.JsonTypeInfo;
import com.flurry.org.codehaus.jackson.annotate.JsonTypeInfo.As;
import com.flurry.org.codehaus.jackson.annotate.JsonTypeInfo.Id;
import com.flurry.org.codehaus.jackson.annotate.JsonTypeInfo.None;
import com.flurry.org.codehaus.jackson.annotate.JsonTypeName;
import com.flurry.org.codehaus.jackson.annotate.JsonUnwrapped;
import com.flurry.org.codehaus.jackson.annotate.JsonValue;
import com.flurry.org.codehaus.jackson.annotate.JsonWriteNullProperties;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public class my extends iq
{
  public iq.a a(mq parammq)
  {
    JsonManagedReference localJsonManagedReference = (JsonManagedReference)parammq.a(JsonManagedReference.class);
    if (localJsonManagedReference != null)
      return iq.a.a(localJsonManagedReference.value());
    JsonBackReference localJsonBackReference = (JsonBackReference)parammq.a(JsonBackReference.class);
    if (localJsonBackReference != null)
      return iq.a.b(localJsonBackReference.value());
    return null;
  }

  public kg.a a(mm parammm, kg.a parama)
  {
    kg localkg = (kg)parammm.a(kg.class);
    if (localkg != null)
      parama = localkg.h();
    JsonWriteNullProperties localJsonWriteNullProperties;
    do
    {
      return parama;
      localJsonWriteNullProperties = (JsonWriteNullProperties)parammm.a(JsonWriteNullProperties.class);
    }
    while (localJsonWriteNullProperties == null);
    if (localJsonWriteNullProperties.value())
      return kg.a.a;
    return kg.a.b;
  }

  public ne<?> a(mn parammn, ne<?> paramne)
  {
    JsonAutoDetect localJsonAutoDetect = (JsonAutoDetect)parammn.a(JsonAutoDetect.class);
    if (localJsonAutoDetect == null)
      return paramne;
    return paramne.a(localJsonAutoDetect);
  }

  protected ni<?> a(jn<?> paramjn, mm parammm, sh paramsh)
  {
    JsonTypeInfo localJsonTypeInfo = (JsonTypeInfo)parammm.a(JsonTypeInfo.class);
    ki localki = (ki)parammm.a(ki.class);
    Object localObject;
    kh localkh;
    nh localnh;
    if (localki != null)
    {
      if (localJsonTypeInfo == null)
        return null;
      localObject = paramjn.d(parammm, localki.a());
      localkh = (kh)parammm.a(kh.class);
      localnh = null;
      if (localkh != null)
        break label210;
    }
    ni localni2;
    while (true)
    {
      if (localnh != null)
        localnh.a(paramsh);
      ni localni1 = ((ni)localObject).a(localJsonTypeInfo.use(), localnh);
      JsonTypeInfo.As localAs = localJsonTypeInfo.include();
      if ((localAs == JsonTypeInfo.As.EXTERNAL_PROPERTY) && ((parammm instanceof mn)))
        localAs = JsonTypeInfo.As.PROPERTY;
      localni2 = localni1.a(localAs).a(localJsonTypeInfo.property());
      Class localClass = localJsonTypeInfo.defaultImpl();
      if (localClass == JsonTypeInfo.None.class)
        break label227;
      return localni2.a(localClass);
      if (localJsonTypeInfo == null)
        return null;
      if (localJsonTypeInfo.use() == JsonTypeInfo.Id.NONE)
        return c();
      localObject = b();
      break;
      label210: localnh = paramjn.e(parammm, localkh.a());
    }
    label227: return localni2;
  }

  public ni<?> a(jn<?> paramjn, mn parammn, sh paramsh)
  {
    return a(paramjn, parammn, paramsh);
  }

  public ni<?> a(jn<?> paramjn, mq parammq, sh paramsh)
  {
    if (paramsh.f())
      return null;
    return a(paramjn, parammq, paramsh);
  }

  public Boolean a(mn parammn)
  {
    kc localkc = (kc)parammn.a(kc.class);
    if (localkc == null)
      return null;
    if (localkc.a())
      return Boolean.TRUE;
    return Boolean.FALSE;
  }

  public Class<?> a(mm parammm, sh paramsh)
  {
    kg localkg = (kg)parammm.a(kg.class);
    if (localkg != null)
    {
      Class localClass = localkg.e();
      if (localClass != kl.class)
        return localClass;
    }
    return null;
  }

  public Class<?> a(mm parammm, sh paramsh, String paramString)
  {
    kd localkd = (kd)parammm.a(kd.class);
    if (localkd != null)
    {
      Class localClass = localkd.d();
      if (localClass != kl.class)
        return localClass;
    }
    return null;
  }

  public String a(mt parammt)
  {
    if (parammt != null)
    {
      JsonProperty localJsonProperty = (JsonProperty)parammt.a(JsonProperty.class);
      if (localJsonProperty != null)
        return localJsonProperty.value();
    }
    return null;
  }

  public String a(Enum<?> paramEnum)
  {
    return paramEnum.name();
  }

  public List<nf> a(mm parammm)
  {
    JsonSubTypes localJsonSubTypes = (JsonSubTypes)parammm.a(JsonSubTypes.class);
    Object localObject;
    if (localJsonSubTypes == null)
      localObject = null;
    while (true)
    {
      return localObject;
      JsonSubTypes.Type[] arrayOfType = localJsonSubTypes.value();
      localObject = new ArrayList(arrayOfType.length);
      int i = arrayOfType.length;
      for (int j = 0; j < i; j++)
      {
        JsonSubTypes.Type localType = arrayOfType[j];
        ((ArrayList)localObject).add(new nf(localType.value(), localType.name()));
      }
    }
  }

  public boolean a(mo parammo)
  {
    return m(parammo);
  }

  public boolean a(mp parammp)
  {
    return m(parammp);
  }

  public boolean a(mr parammr)
  {
    return m(parammr);
  }

  public boolean a(Annotation paramAnnotation)
  {
    return paramAnnotation.annotationType().getAnnotation(JacksonAnnotation.class) != null;
  }

  public ni<?> b(jn<?> paramjn, mq parammq, sh paramsh)
  {
    if (!paramsh.f())
      throw new IllegalArgumentException("Must call method with a container type (got " + paramsh + ")");
    return a(paramjn, parammq, paramsh);
  }

  protected nu b()
  {
    return new nu();
  }

  public Boolean b(mq parammq)
  {
    JsonUnwrapped localJsonUnwrapped = (JsonUnwrapped)parammq.a(JsonUnwrapped.class);
    if ((localJsonUnwrapped != null) && (localJsonUnwrapped.enabled()))
      return Boolean.TRUE;
    return null;
  }

  public Class<?> b(mm parammm, sh paramsh)
  {
    kg localkg = (kg)parammm.a(kg.class);
    if (localkg != null)
    {
      Class localClass = localkg.f();
      if (localClass != kl.class)
        return localClass;
    }
    return null;
  }

  public Class<?> b(mm parammm, sh paramsh, String paramString)
  {
    kd localkd = (kd)parammm.a(kd.class);
    if (localkd != null)
    {
      Class localClass = localkd.e();
      if (localClass != kl.class)
        return localClass;
    }
    return null;
  }

  public Object b(mm parammm)
  {
    kg localkg = (kg)parammm.a(kg.class);
    if (localkg != null)
    {
      Class localClass = localkg.a();
      if (localClass != jk.a.class)
        return localClass;
    }
    JsonRawValue localJsonRawValue = (JsonRawValue)parammm.a(JsonRawValue.class);
    if ((localJsonRawValue != null) && (localJsonRawValue.value()))
      return new ps(parammm.d());
    return null;
  }

  public String b(mn parammn)
  {
    kf localkf = (kf)parammn.a(kf.class);
    if (localkf == null)
      return null;
    return localkf.a();
  }

  public String b(mp parammp)
  {
    JsonProperty localJsonProperty = (JsonProperty)parammp.a(JsonProperty.class);
    if (localJsonProperty != null)
      return localJsonProperty.value();
    if ((parammp.b(kg.class)) || (parammp.b(kk.class)))
      return "";
    return null;
  }

  public String b(mr parammr)
  {
    JsonProperty localJsonProperty = (JsonProperty)parammr.a(JsonProperty.class);
    if (localJsonProperty != null)
      return localJsonProperty.value();
    JsonGetter localJsonGetter = (JsonGetter)parammr.a(JsonGetter.class);
    if (localJsonGetter != null)
      return localJsonGetter.value();
    if ((parammr.b(kg.class)) || (parammr.b(kk.class)))
      return "";
    return null;
  }

  protected nu c()
  {
    return nu.b();
  }

  public Class<? extends jk<?>> c(mm parammm)
  {
    kg localkg = (kg)parammm.a(kg.class);
    if (localkg != null)
    {
      Class localClass = localkg.c();
      if (localClass != jk.a.class)
        return localClass;
    }
    return null;
  }

  public Class<?> c(mm parammm, sh paramsh, String paramString)
  {
    kd localkd = (kd)parammm.a(kd.class);
    if (localkd != null)
    {
      Class localClass = localkd.f();
      if (localClass != kl.class)
        return localClass;
    }
    return null;
  }

  public String c(mp parammp)
  {
    JsonProperty localJsonProperty = (JsonProperty)parammp.a(JsonProperty.class);
    if (localJsonProperty != null)
      return localJsonProperty.value();
    if ((parammp.b(kd.class)) || (parammp.b(kk.class)) || (parammp.b(JsonBackReference.class)) || (parammp.b(JsonManagedReference.class)))
      return "";
    return null;
  }

  public boolean c(mq parammq)
  {
    return m(parammq);
  }

  public boolean c(mr parammr)
  {
    JsonValue localJsonValue = (JsonValue)parammr.a(JsonValue.class);
    return (localJsonValue != null) && (localJsonValue.value());
  }

  public String[] c(mn parammn)
  {
    JsonIgnoreProperties localJsonIgnoreProperties = (JsonIgnoreProperties)parammn.a(JsonIgnoreProperties.class);
    if (localJsonIgnoreProperties == null)
      return null;
    return localJsonIgnoreProperties.value();
  }

  public Boolean d(mn parammn)
  {
    JsonIgnoreProperties localJsonIgnoreProperties = (JsonIgnoreProperties)parammn.a(JsonIgnoreProperties.class);
    if (localJsonIgnoreProperties == null)
      return null;
    return Boolean.valueOf(localJsonIgnoreProperties.ignoreUnknown());
  }

  public Class<? extends jk<?>> d(mm parammm)
  {
    kg localkg = (kg)parammm.a(kg.class);
    if (localkg != null)
    {
      Class localClass = localkg.b();
      if (localClass != jk.a.class)
        return localClass;
    }
    return null;
  }

  public Object d(mq parammq)
  {
    ka localka = (ka)parammq.a(ka.class);
    Object localObject;
    if (localka == null)
      localObject = null;
    do
    {
      return localObject;
      localObject = localka.a();
    }
    while (((String)localObject).length() != 0);
    if (!(parammq instanceof mr))
      return parammq.d().getName();
    mr localmr = (mr)parammq;
    if (localmr.f() == 0)
      return parammq.d().getName();
    return localmr.a(0).getName();
  }

  public String d(mr parammr)
  {
    JsonProperty localJsonProperty = (JsonProperty)parammr.a(JsonProperty.class);
    if (localJsonProperty != null)
      return localJsonProperty.value();
    JsonSetter localJsonSetter = (JsonSetter)parammr.a(JsonSetter.class);
    if (localJsonSetter != null)
      return localJsonSetter.value();
    if ((parammr.b(kd.class)) || (parammr.b(kk.class)) || (parammr.b(JsonBackReference.class)) || (parammr.b(JsonManagedReference.class)))
      return "";
    return null;
  }

  public Boolean e(mn parammn)
  {
    JsonIgnoreType localJsonIgnoreType = (JsonIgnoreType)parammn.a(JsonIgnoreType.class);
    if (localJsonIgnoreType == null)
      return null;
    return Boolean.valueOf(localJsonIgnoreType.value());
  }

  public Class<?> e(mm parammm)
  {
    kg localkg = (kg)parammm.a(kg.class);
    if (localkg != null)
    {
      Class localClass = localkg.d();
      if (localClass != kl.class)
        return localClass;
    }
    return null;
  }

  public boolean e(mr parammr)
  {
    return parammr.b(JsonAnySetter.class);
  }

  public kg.b f(mm parammm)
  {
    kg localkg = (kg)parammm.a(kg.class);
    if (localkg == null)
      return null;
    return localkg.g();
  }

  public Object f(mn parammn)
  {
    ke localke = (ke)parammn.a(ke.class);
    if (localke != null)
    {
      String str = localke.a();
      if (str.length() > 0)
        return str;
    }
    return null;
  }

  public boolean f(mr parammr)
  {
    return parammr.b(JsonAnyGetter.class);
  }

  public String g(mn parammn)
  {
    JsonTypeName localJsonTypeName = (JsonTypeName)parammn.a(JsonTypeName.class);
    if (localJsonTypeName == null)
      return null;
    return localJsonTypeName.value();
  }

  public Class<?>[] g(mm parammm)
  {
    kk localkk = (kk)parammm.a(kk.class);
    if (localkk == null)
      return null;
    return localkk.a();
  }

  public String[] h(mn parammn)
  {
    JsonPropertyOrder localJsonPropertyOrder = (JsonPropertyOrder)parammn.a(JsonPropertyOrder.class);
    if (localJsonPropertyOrder == null)
      return null;
    return localJsonPropertyOrder.value();
  }

  public Boolean i(mn parammn)
  {
    JsonPropertyOrder localJsonPropertyOrder = (JsonPropertyOrder)parammn.a(JsonPropertyOrder.class);
    if (localJsonPropertyOrder == null)
      return null;
    return Boolean.valueOf(localJsonPropertyOrder.alphabetic());
  }

  public Class<? extends jl> i(mm parammm)
  {
    kd localkd = (kd)parammm.a(kd.class);
    if (localkd != null)
    {
      Class localClass = localkd.c();
      if (localClass != jl.a.class)
        return localClass;
    }
    return null;
  }

  public Class<? extends jg<?>> j(mm parammm)
  {
    kd localkd = (kd)parammm.a(kd.class);
    if (localkd != null)
    {
      Class localClass = localkd.b();
      if (localClass != jg.a.class)
        return localClass;
    }
    return null;
  }

  public Object j(mn parammn)
  {
    kj localkj = (kj)parammn.a(kj.class);
    if (localkj == null)
      return null;
    return localkj.a();
  }

  public boolean k(mm parammm)
  {
    return parammm.b(JsonCreator.class);
  }

  public Class<? extends jg<?>> l(mm parammm)
  {
    kd localkd = (kd)parammm.a(kd.class);
    if (localkd != null)
    {
      Class localClass = localkd.a();
      if (localClass != jg.a.class)
        return localClass;
    }
    return null;
  }

  protected boolean m(mm parammm)
  {
    JsonIgnore localJsonIgnore = (JsonIgnore)parammm.a(JsonIgnore.class);
    return (localJsonIgnore != null) && (localJsonIgnore.value());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.my
 * JD-Core Version:    0.6.2
 */