package com.flurry.org.codehaus.jackson.annotate;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface JsonAutoDetect
{
  public abstract JsonAutoDetect.Visibility creatorVisibility();

  public abstract JsonAutoDetect.Visibility fieldVisibility();

  public abstract JsonAutoDetect.Visibility getterVisibility();

  public abstract JsonAutoDetect.Visibility isGetterVisibility();

  public abstract JsonAutoDetect.Visibility setterVisibility();

  public abstract JsonMethod[] value();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.org.codehaus.jackson.annotate.JsonAutoDetect
 * JD-Core Version:    0.6.2
 */