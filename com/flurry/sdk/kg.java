package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JacksonAnnotation;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.PARAMETER})
public @interface kg
{
  public abstract Class<? extends jk<?>> a();

  public abstract Class<? extends jk<?>> b();

  public abstract Class<? extends jk<?>> c();

  public abstract Class<?> d();

  public abstract Class<?> e();

  public abstract Class<?> f();

  public abstract kg.b g();

  public abstract kg.a h();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kg
 * JD-Core Version:    0.6.2
 */