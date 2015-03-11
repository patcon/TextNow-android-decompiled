package textnow.t;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER})
public @interface a
{
  public abstract String a();

  public abstract String b();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.t.a
 * JD-Core Version:    0.6.2
 */