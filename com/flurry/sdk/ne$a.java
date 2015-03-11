package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JsonAutoDetect;
import com.flurry.org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import com.flurry.org.codehaus.jackson.annotate.JsonMethod;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

@JsonAutoDetect(creatorVisibility=JsonAutoDetect.Visibility.ANY, fieldVisibility=JsonAutoDetect.Visibility.PUBLIC_ONLY, getterVisibility=JsonAutoDetect.Visibility.PUBLIC_ONLY, isGetterVisibility=JsonAutoDetect.Visibility.PUBLIC_ONLY, setterVisibility=JsonAutoDetect.Visibility.ANY)
public class ne$a
  implements ne<a>
{
  protected static final a a = new a((JsonAutoDetect)a.class.getAnnotation(JsonAutoDetect.class));
  protected final JsonAutoDetect.Visibility b;
  protected final JsonAutoDetect.Visibility c;
  protected final JsonAutoDetect.Visibility d;
  protected final JsonAutoDetect.Visibility e;
  protected final JsonAutoDetect.Visibility f;

  public ne$a(JsonAutoDetect.Visibility paramVisibility1, JsonAutoDetect.Visibility paramVisibility2, JsonAutoDetect.Visibility paramVisibility3, JsonAutoDetect.Visibility paramVisibility4, JsonAutoDetect.Visibility paramVisibility5)
  {
    this.b = paramVisibility1;
    this.c = paramVisibility2;
    this.d = paramVisibility3;
    this.e = paramVisibility4;
    this.f = paramVisibility5;
  }

  public ne$a(JsonAutoDetect paramJsonAutoDetect)
  {
    JsonMethod[] arrayOfJsonMethod = paramJsonAutoDetect.value();
    JsonAutoDetect.Visibility localVisibility1;
    JsonAutoDetect.Visibility localVisibility2;
    label51: JsonAutoDetect.Visibility localVisibility3;
    label75: JsonAutoDetect.Visibility localVisibility4;
    if (a(arrayOfJsonMethod, JsonMethod.GETTER))
    {
      localVisibility1 = paramJsonAutoDetect.getterVisibility();
      this.b = localVisibility1;
      if (!a(arrayOfJsonMethod, JsonMethod.IS_GETTER))
        break label137;
      localVisibility2 = paramJsonAutoDetect.isGetterVisibility();
      this.c = localVisibility2;
      if (!a(arrayOfJsonMethod, JsonMethod.SETTER))
        break label145;
      localVisibility3 = paramJsonAutoDetect.setterVisibility();
      this.d = localVisibility3;
      if (!a(arrayOfJsonMethod, JsonMethod.CREATOR))
        break label153;
      localVisibility4 = paramJsonAutoDetect.creatorVisibility();
      label99: this.e = localVisibility4;
      if (!a(arrayOfJsonMethod, JsonMethod.FIELD))
        break label161;
    }
    label137: label145: label153: label161: for (JsonAutoDetect.Visibility localVisibility5 = paramJsonAutoDetect.fieldVisibility(); ; localVisibility5 = JsonAutoDetect.Visibility.NONE)
    {
      this.f = localVisibility5;
      return;
      localVisibility1 = JsonAutoDetect.Visibility.NONE;
      break;
      localVisibility2 = JsonAutoDetect.Visibility.NONE;
      break label51;
      localVisibility3 = JsonAutoDetect.Visibility.NONE;
      break label75;
      localVisibility4 = JsonAutoDetect.Visibility.NONE;
      break label99;
    }
  }

  public static a a()
  {
    return a;
  }

  private static boolean a(JsonMethod[] paramArrayOfJsonMethod, JsonMethod paramJsonMethod)
  {
    int i = paramArrayOfJsonMethod.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        JsonMethod localJsonMethod = paramArrayOfJsonMethod[j];
        if ((localJsonMethod == paramJsonMethod) || (localJsonMethod == JsonMethod.ALL))
          bool = true;
      }
      else
      {
        return bool;
      }
    }
  }

  public boolean a(mp parammp)
  {
    return a(parammp.e());
  }

  public boolean a(mq parammq)
  {
    return a(parammq.i());
  }

  public boolean a(mr parammr)
  {
    return a(parammr.e());
  }

  public boolean a(Field paramField)
  {
    return this.f.isVisible(paramField);
  }

  public boolean a(Member paramMember)
  {
    return this.e.isVisible(paramMember);
  }

  public boolean a(Method paramMethod)
  {
    return this.b.isVisible(paramMethod);
  }

  public a b(JsonAutoDetect paramJsonAutoDetect)
  {
    if (paramJsonAutoDetect == null)
      return this;
    JsonMethod[] arrayOfJsonMethod = paramJsonAutoDetect.value();
    JsonAutoDetect.Visibility localVisibility1;
    JsonAutoDetect.Visibility localVisibility2;
    label55: JsonAutoDetect.Visibility localVisibility3;
    label82: JsonAutoDetect.Visibility localVisibility4;
    label109: a locala4;
    if (a(arrayOfJsonMethod, JsonMethod.GETTER))
    {
      localVisibility1 = paramJsonAutoDetect.getterVisibility();
      a locala1 = f(localVisibility1);
      if (!a(arrayOfJsonMethod, JsonMethod.IS_GETTER))
        break label151;
      localVisibility2 = paramJsonAutoDetect.isGetterVisibility();
      a locala2 = locala1.g(localVisibility2);
      if (!a(arrayOfJsonMethod, JsonMethod.SETTER))
        break label159;
      localVisibility3 = paramJsonAutoDetect.setterVisibility();
      a locala3 = locala2.h(localVisibility3);
      if (!a(arrayOfJsonMethod, JsonMethod.CREATOR))
        break label167;
      localVisibility4 = paramJsonAutoDetect.creatorVisibility();
      locala4 = locala3.i(localVisibility4);
      if (!a(arrayOfJsonMethod, JsonMethod.FIELD))
        break label175;
    }
    label151: label159: label167: label175: for (JsonAutoDetect.Visibility localVisibility5 = paramJsonAutoDetect.fieldVisibility(); ; localVisibility5 = JsonAutoDetect.Visibility.NONE)
    {
      return locala4.j(localVisibility5);
      localVisibility1 = JsonAutoDetect.Visibility.NONE;
      break;
      localVisibility2 = JsonAutoDetect.Visibility.NONE;
      break label55;
      localVisibility3 = JsonAutoDetect.Visibility.NONE;
      break label82;
      localVisibility4 = JsonAutoDetect.Visibility.NONE;
      break label109;
    }
  }

  public boolean b(mr parammr)
  {
    return b(parammr.e());
  }

  public boolean b(Method paramMethod)
  {
    return this.c.isVisible(paramMethod);
  }

  public boolean c(mr parammr)
  {
    return c(parammr.e());
  }

  public boolean c(Method paramMethod)
  {
    return this.d.isVisible(paramMethod);
  }

  public a f(JsonAutoDetect.Visibility paramVisibility)
  {
    if (paramVisibility == JsonAutoDetect.Visibility.DEFAULT);
    for (JsonAutoDetect.Visibility localVisibility = a.b; ; localVisibility = paramVisibility)
    {
      if (this.b == localVisibility)
        return this;
      return new a(localVisibility, this.c, this.d, this.e, this.f);
    }
  }

  public a g(JsonAutoDetect.Visibility paramVisibility)
  {
    if (paramVisibility == JsonAutoDetect.Visibility.DEFAULT);
    for (JsonAutoDetect.Visibility localVisibility = a.c; ; localVisibility = paramVisibility)
    {
      if (this.c == localVisibility)
        return this;
      return new a(this.b, localVisibility, this.d, this.e, this.f);
    }
  }

  public a h(JsonAutoDetect.Visibility paramVisibility)
  {
    if (paramVisibility == JsonAutoDetect.Visibility.DEFAULT);
    for (JsonAutoDetect.Visibility localVisibility = a.d; ; localVisibility = paramVisibility)
    {
      if (this.d == localVisibility)
        return this;
      return new a(this.b, this.c, localVisibility, this.e, this.f);
    }
  }

  public a i(JsonAutoDetect.Visibility paramVisibility)
  {
    if (paramVisibility == JsonAutoDetect.Visibility.DEFAULT);
    for (JsonAutoDetect.Visibility localVisibility = a.e; ; localVisibility = paramVisibility)
    {
      if (this.e == localVisibility)
        return this;
      return new a(this.b, this.c, this.d, localVisibility, this.f);
    }
  }

  public a j(JsonAutoDetect.Visibility paramVisibility)
  {
    if (paramVisibility == JsonAutoDetect.Visibility.DEFAULT);
    for (JsonAutoDetect.Visibility localVisibility = a.f; ; localVisibility = paramVisibility)
    {
      if (this.f == localVisibility)
        return this;
      return new a(this.b, this.c, this.d, this.e, localVisibility);
    }
  }

  public String toString()
  {
    return "[Visibility:" + " getter: " + this.b + ", isGetter: " + this.c + ", setter: " + this.d + ", creator: " + this.e + ", field: " + this.f + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ne.a
 * JD-Core Version:    0.6.2
 */