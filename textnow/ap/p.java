package textnow.ap;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import textnow.am.e;
import textnow.am.h;
import textnow.am.j;
import textnow.am.k;
import textnow.am.l;
import textnow.am.m;
import textnow.am.o;
import textnow.am.s;
import textnow.am.t;
import textnow.ao.i;
import textnow.ar.b;
import textnow.ar.c;

public final class p
{
  public static final s<StringBuffer> A = new s()
  {
  };
  public static final t B = a(StringBuffer.class, A);
  public static final s<URL> C = new s()
  {
  };
  public static final t D = a(URL.class, C);
  public static final s<URI> E = new s()
  {
    private static URI b(textnow.ar.a paramAnonymousa)
    {
      if (paramAnonymousa.f() == b.i)
        paramAnonymousa.j();
      while (true)
      {
        return null;
        try
        {
          String str = paramAnonymousa.h();
          if ("null".equals(str))
            continue;
          URI localURI = new URI(str);
          return localURI;
        }
        catch (URISyntaxException localURISyntaxException)
        {
          throw new k(localURISyntaxException);
        }
      }
    }
  };
  public static final t F = a(URI.class, E);
  public static final s<InetAddress> G = new s()
  {
  };
  public static final t H = b(InetAddress.class, G);
  public static final s<UUID> I = new s()
  {
  };
  public static final t J = a(UUID.class, I);
  public static final t K = new t()
  {
    public final <T> s<T> a(e paramAnonymouse, textnow.aq.a<T> paramAnonymousa)
    {
      if (paramAnonymousa.a() != Timestamp.class)
        return null;
      return new s()
      {
      };
    }
  };
  public static final s<Calendar> L = new s()
  {
  };
  public static final t M = new t()
  {
    public final <T> s<T> a(e paramAnonymouse, textnow.aq.a<T> paramAnonymousa)
    {
      Class localClass = paramAnonymousa.a();
      if ((localClass == p.this) || (localClass == this.b))
        return this.c;
      return null;
    }

    public final String toString()
    {
      return "Factory[type=" + p.this.getName() + "+" + this.b.getName() + ",adapter=" + this.c + "]";
    }
  };
  public static final s<Locale> N = new s()
  {
  };
  public static final t O = a(Locale.class, N);
  public static final s<j> P = new s()
  {
    private void a(c paramAnonymousc, j paramAnonymousj)
    {
      if ((paramAnonymousj == null) || (paramAnonymousj.j()))
      {
        paramAnonymousc.f();
        return;
      }
      if (paramAnonymousj.i())
      {
        o localo = paramAnonymousj.m();
        if (localo.o())
        {
          paramAnonymousc.a(localo.a());
          return;
        }
        if (localo.n())
        {
          paramAnonymousc.a(localo.f());
          return;
        }
        paramAnonymousc.b(localo.b());
        return;
      }
      if (paramAnonymousj.g())
      {
        paramAnonymousc.b();
        Iterator localIterator2 = paramAnonymousj.l().iterator();
        while (localIterator2.hasNext())
          a(paramAnonymousc, (j)localIterator2.next());
        paramAnonymousc.c();
        return;
      }
      if (paramAnonymousj.h())
      {
        paramAnonymousc.d();
        Iterator localIterator1 = paramAnonymousj.k().n().iterator();
        while (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          paramAnonymousc.a((String)localEntry.getKey());
          a(paramAnonymousc, (j)localEntry.getValue());
        }
        paramAnonymousc.e();
        return;
      }
      throw new IllegalArgumentException("Couldn't write " + paramAnonymousj.getClass());
    }

    private j b(textnow.ar.a paramAnonymousa)
    {
      switch (p.25.a[paramAnonymousa.f().ordinal()])
      {
      default:
        throw new IllegalArgumentException();
      case 3:
        return new o(paramAnonymousa.h());
      case 1:
        return new o(new i(paramAnonymousa.h()));
      case 2:
        return new o(Boolean.valueOf(paramAnonymousa.i()));
      case 4:
        paramAnonymousa.j();
        return l.a;
      case 5:
        h localh = new h();
        paramAnonymousa.a();
        while (paramAnonymousa.e())
          localh.a(b(paramAnonymousa));
        paramAnonymousa.b();
        return localh;
      case 6:
      }
      m localm = new m();
      paramAnonymousa.c();
      while (paramAnonymousa.e())
        localm.a(paramAnonymousa.g(), b(paramAnonymousa));
      paramAnonymousa.d();
      return localm;
    }
  };
  public static final t Q = b(j.class, P);
  public static final t R = new t()
  {
    public final <T> s<T> a(e paramAnonymouse, textnow.aq.a<T> paramAnonymousa)
    {
      Class localClass = paramAnonymousa.a();
      if ((!Enum.class.isAssignableFrom(localClass)) || (localClass == Enum.class))
        return null;
      if (!localClass.isEnum())
        localClass = localClass.getSuperclass();
      return new q(localClass);
    }
  };
  public static final s<Class> a = new s()
  {
  };
  public static final t b = a(Class.class, a);
  public static final s<BitSet> c = new s()
  {
    private static BitSet b(textnow.ar.a paramAnonymousa)
    {
      if (paramAnonymousa.f() == b.i)
      {
        paramAnonymousa.j();
        return null;
      }
      BitSet localBitSet = new BitSet();
      paramAnonymousa.a();
      b localb = paramAnonymousa.f();
      int i = 0;
      if (localb != b.b)
      {
        boolean bool;
        switch (p.25.a[localb.ordinal()])
        {
        default:
          throw new textnow.am.q("Invalid bitset value type: " + localb);
        case 1:
          if (paramAnonymousa.m() != 0)
            bool = true;
          break;
        case 2:
        case 3:
        }
        while (true)
        {
          if (bool)
            localBitSet.set(i);
          i++;
          localb = paramAnonymousa.f();
          break;
          bool = false;
          continue;
          bool = paramAnonymousa.i();
          continue;
          String str = paramAnonymousa.h();
          try
          {
            int j = Integer.parseInt(str);
            if (j != 0)
              bool = true;
            else
              bool = false;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            throw new textnow.am.q("Error: Expecting: bitset number value (1, 0), Found: " + str);
          }
        }
      }
      paramAnonymousa.b();
      return localBitSet;
    }
  };
  public static final t d = a(BitSet.class, c);
  public static final s<Boolean> e = new s()
  {
  };
  public static final s<Boolean> f = new s()
  {
  };
  public static final t g = a(Boolean.TYPE, Boolean.class, e);
  public static final s<Number> h = new s()
  {
    private static Number b(textnow.ar.a paramAnonymousa)
    {
      if (paramAnonymousa.f() == b.i)
      {
        paramAnonymousa.j();
        return null;
      }
      try
      {
        Byte localByte = Byte.valueOf((byte)paramAnonymousa.m());
        return localByte;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new textnow.am.q(localNumberFormatException);
      }
    }
  };
  public static final t i = a(Byte.TYPE, Byte.class, h);
  public static final s<Number> j = new s()
  {
    private static Number b(textnow.ar.a paramAnonymousa)
    {
      if (paramAnonymousa.f() == b.i)
      {
        paramAnonymousa.j();
        return null;
      }
      try
      {
        Short localShort = Short.valueOf((short)paramAnonymousa.m());
        return localShort;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new textnow.am.q(localNumberFormatException);
      }
    }
  };
  public static final t k = a(Short.TYPE, Short.class, j);
  public static final s<Number> l = new s()
  {
    private static Number b(textnow.ar.a paramAnonymousa)
    {
      if (paramAnonymousa.f() == b.i)
      {
        paramAnonymousa.j();
        return null;
      }
      try
      {
        Integer localInteger = Integer.valueOf(paramAnonymousa.m());
        return localInteger;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new textnow.am.q(localNumberFormatException);
      }
    }
  };
  public static final t m = a(Integer.TYPE, Integer.class, l);
  public static final s<Number> n = new s()
  {
    private static Number b(textnow.ar.a paramAnonymousa)
    {
      if (paramAnonymousa.f() == b.i)
      {
        paramAnonymousa.j();
        return null;
      }
      try
      {
        Long localLong = Long.valueOf(paramAnonymousa.l());
        return localLong;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new textnow.am.q(localNumberFormatException);
      }
    }
  };
  public static final s<Number> o = new s()
  {
  };
  public static final s<Number> p = new s()
  {
  };
  public static final s<Number> q = new s()
  {
  };
  public static final t r = a(Number.class, q);
  public static final s<Character> s = new s()
  {
  };
  public static final t t = a(Character.TYPE, Character.class, s);
  public static final s<String> u = new s()
  {
  };
  public static final s<BigDecimal> v = new s()
  {
    private static BigDecimal b(textnow.ar.a paramAnonymousa)
    {
      if (paramAnonymousa.f() == b.i)
      {
        paramAnonymousa.j();
        return null;
      }
      try
      {
        BigDecimal localBigDecimal = new BigDecimal(paramAnonymousa.h());
        return localBigDecimal;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new textnow.am.q(localNumberFormatException);
      }
    }
  };
  public static final s<BigInteger> w = new s()
  {
    private static BigInteger b(textnow.ar.a paramAnonymousa)
    {
      if (paramAnonymousa.f() == b.i)
      {
        paramAnonymousa.j();
        return null;
      }
      try
      {
        BigInteger localBigInteger = new BigInteger(paramAnonymousa.h());
        return localBigInteger;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new textnow.am.q(localNumberFormatException);
      }
    }
  };
  public static final t x = a(String.class, u);
  public static final s<StringBuilder> y = new s()
  {
  };
  public static final t z = a(StringBuilder.class, y);

  public static <TT> t a(Class<TT> paramClass1, final Class<TT> paramClass2, final s<? super TT> params)
  {
    return new t()
    {
      public final <T> s<T> a(e paramAnonymouse, textnow.aq.a<T> paramAnonymousa)
      {
        Class localClass = paramAnonymousa.a();
        if ((localClass == p.this) || (localClass == paramClass2))
          return params;
        return null;
      }

      public final String toString()
      {
        return "Factory[type=" + paramClass2.getName() + "+" + p.this.getName() + ",adapter=" + params + "]";
      }
    };
  }

  public static <TT> t a(Class<TT> paramClass, final s<TT> params)
  {
    return new t()
    {
      public final <T> s<T> a(e paramAnonymouse, textnow.aq.a<T> paramAnonymousa)
      {
        if (paramAnonymousa.a() == p.this)
          return params;
        return null;
      }

      public final String toString()
      {
        return "Factory[type=" + p.this.getName() + ",adapter=" + params + "]";
      }
    };
  }

  private static <TT> t b(Class<TT> paramClass, final s<TT> params)
  {
    return new t()
    {
      public final <T> s<T> a(e paramAnonymouse, textnow.aq.a<T> paramAnonymousa)
      {
        if (p.this.isAssignableFrom(paramAnonymousa.a()))
          return params;
        return null;
      }

      public final String toString()
      {
        return "Factory[typeHierarchy=" + p.this.getName() + ",adapter=" + params + "]";
      }
    };
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ap.p
 * JD-Core Version:    0.6.2
 */