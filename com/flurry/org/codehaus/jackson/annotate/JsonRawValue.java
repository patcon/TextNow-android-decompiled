package com.flurry.org.codehaus.jackson.annotate;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD})
public @interface JsonRawValue
{
  public abstract boolean value();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.org.codehaus.jackson.annotate.JsonRawValue
 * JD-Core Version:    0.6.2
 */