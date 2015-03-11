package com.stripe.model;

import java.lang.reflect.Field;
import textnow.z.d;
import textnow.z.f;
import textnow.z.h;

public abstract class StripeObject
{
  public static final f PRETTY_PRINT_GSON = new h().b().a().a(d.d).a(EventData.class, new EventDataDeserializer()).c();

  private Object getIdString()
  {
    try
    {
      Object localObject = getClass().getDeclaredField("id").get(this);
      return localObject;
    }
    catch (SecurityException localSecurityException)
    {
      return "";
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      return "";
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      return "";
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    return "";
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = getClass().getName();
    arrayOfObject[1] = Integer.valueOf(System.identityHashCode(this));
    arrayOfObject[2] = getIdString();
    arrayOfObject[3] = PRETTY_PRINT_GSON.a(this);
    return String.format("<%s@%s id=%s> JSON: %s", arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.StripeObject
 * JD-Core Version:    0.6.2
 */