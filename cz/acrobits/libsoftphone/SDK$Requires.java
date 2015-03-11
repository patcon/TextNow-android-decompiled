package cz.acrobits.libsoftphone;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.TYPE})
public @interface SDK$Requires
{
  public abstract SDK.Feature[] value();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.SDK.Requires
 * JD-Core Version:    0.6.2
 */