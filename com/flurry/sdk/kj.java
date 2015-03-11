package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JacksonAnnotation;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface kj
{
  public abstract Class<? extends kx> a();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kj
 * JD-Core Version:    0.6.2
 */