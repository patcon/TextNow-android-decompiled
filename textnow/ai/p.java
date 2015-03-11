package textnow.ai;

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
import textnow.af.f;
import textnow.af.j;
import textnow.af.m;
import textnow.af.n;
import textnow.af.o;
import textnow.af.r;
import textnow.af.u;
import textnow.af.y;
import textnow.af.z;
import textnow.ah.i;
import textnow.ak.b;
import textnow.ak.c;

public final class p
{
  public static final y<StringBuffer> A = new y()
  {
  };
  public static final z B = a(StringBuffer.class, A);
  public static final y<URL> C = new y()
  {
  };
  public static final z D = a(URL.class, C);
  public static final y<URI> E = new y()
  {
    private static URI b(textnow.ak.a paramAnonymousa)
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
          throw new n(localURISyntaxException);
        }
      }
    }
  };
  public static final z F = a(URI.class, E);
  public static final y<InetAddress> G = new y()
  {
  };
  public static final z H = b(InetAddress.class, G);
  public static final y<UUID> I = new y()
  {
  };
  public static final z J = a(UUID.class, I);
  public static final z K = new z()
  {
    public final <T> y<T> a(f paramAnonymousf, textnow.aj.a<T> paramAnonymousa)
    {
      if (paramAnonymousa.a() != Timestamp.class)
        return null;
      return new y()
      {
      };
    }
  };
  public static final y<Calendar> L = new y()
  {
  };
  public static final z M = new z()
  {
    public final <T> y<T> a(f paramAnonymousf, textnow.aj.a<T> paramAnonymousa)
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
  public static final y<Locale> N = new y()
  {
  };
  public static final z O = a(Locale.class, N);
  public static final y<m> P = new y()
  {
    private void a(c paramAnonymousc, m paramAnonymousm)
    {
      if ((paramAnonymousm == null) || (paramAnonymousm.k()))
      {
        paramAnonymousc.f();
        return;
      }
      if (paramAnonymousm.j())
      {
        r localr = paramAnonymousm.n();
        if (localr.o())
        {
          paramAnonymousc.a(localr.b());
          return;
        }
        if (localr.a())
        {
          paramAnonymousc.a(localr.g());
          return;
        }
        paramAnonymousc.b(localr.c());
        return;
      }
      if (paramAnonymousm.h())
      {
        paramAnonymousc.b();
        Iterator localIterator2 = paramAnonymousm.m().iterator();
        while (localIterator2.hasNext())
          a(paramAnonymousc, (m)localIterator2.next());
        paramAnonymousc.c();
        return;
      }
      if (paramAnonymousm.i())
      {
        paramAnonymousc.d();
        Iterator localIterator1 = paramAnonymousm.l().a().iterator();
        while (localIterator1.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator1.next();
          paramAnonymousc.a((String)localEntry.getKey());
          a(paramAnonymousc, (m)localEntry.getValue());
        }
        paramAnonymousc.e();
        return;
      }
      throw new IllegalArgumentException("Couldn't write " + paramAnonymousm.getClass());
    }

    private m b(textnow.ak.a paramAnonymousa)
    {
      switch (p.26.a[paramAnonymousa.f().ordinal()])
      {
      default:
        throw new IllegalArgumentException();
      case 3:
        return new r(paramAnonymousa.h());
      case 1:
        return new r(new i(paramAnonymousa.h()));
      case 2:
        return new r(Boolean.valueOf(paramAnonymousa.i()));
      case 4:
        paramAnonymousa.j();
        return o.a;
      case 5:
        j localj = new j();
        paramAnonymousa.a();
        while (paramAnonymousa.e())
          localj.a(b(paramAnonymousa));
        paramAnonymousa.b();
        return localj;
      case 6:
      }
      textnow.af.p localp = new textnow.af.p();
      paramAnonymousa.c();
      while (paramAnonymousa.e())
        localp.a(paramAnonymousa.g(), b(paramAnonymousa));
      paramAnonymousa.d();
      return localp;
    }
  };
  public static final z Q = b(m.class, P);
  public static final z R = new z()
  {
    public final <T> y<T> a(f paramAnonymousf, textnow.aj.a<T> paramAnonymousa)
    {
      Class localClass = paramAnonymousa.a();
      if ((!Enum.class.isAssignableFrom(localClass)) || (localClass == Enum.class))
        return null;
      if (!localClass.isEnum())
        localClass = localClass.getSuperclass();
      return new q(localClass);
    }
  };
  public static final y<Class> a = new y()
  {
  };
  public static final z b = a(Class.class, a);
  public static final y<BitSet> c = new y()
  {
    private static BitSet b(textnow.ak.a paramAnonymousa)
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
        switch (p.26.a[localb.ordinal()])
        {
        default:
          throw new u("Invalid bitset value type: " + localb);
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
            throw new u("Error: Expecting: bitset number value (1, 0), Found: " + str);
          }
        }
      }
      paramAnonymousa.b();
      return localBitSet;
    }
  };
  public static final z d = a(BitSet.class, c);
  public static final y<Boolean> e = new y()
  {
  };
  public static final y<Boolean> f = new y()
  {
  };
  public static final z g = a(Boolean.TYPE, Boolean.class, e);
  public static final y<Number> h = new y()
  {
    private static Number b(textnow.ak.a paramAnonymousa)
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
        throw new u(localNumberFormatException);
      }
    }
  };
  public static final z i = a(Byte.TYPE, Byte.class, h);
  public static final y<Number> j = new y()
  {
    private static Number b(textnow.ak.a paramAnonymousa)
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
        throw new u(localNumberFormatException);
      }
    }
  };
  public static final z k = a(Short.TYPE, Short.class, j);
  public static final y<Number> l = new y()
  {
    private static Number b(textnow.ak.a paramAnonymousa)
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
        throw new u(localNumberFormatException);
      }
    }
  };
  public static final z m = a(Integer.TYPE, Integer.class, l);
  public static final y<Number> n = new y()
  {
    private static Number b(textnow.ak.a paramAnonymousa)
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
        throw new u(localNumberFormatException);
      }
    }
  };
  public static final y<Number> o = new y()
  {
  };
  public static final y<Number> p = new y()
  {
  };
  public static final y<Number> q = new y()
  {
  };
  public static final z r = a(Number.class, q);
  public static final y<Character> s = new y()
  {
  };
  public static final z t = a(Character.TYPE, Character.class, s);
  public static final y<String> u = new y()
  {
  };
  public static final y<BigDecimal> v = new y()
  {
    private static BigDecimal b(textnow.ak.a paramAnonymousa)
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
        throw new u(localNumberFormatException);
      }
    }
  };
  public static final y<BigInteger> w = new y()
  {
    private static BigInteger b(textnow.ak.a paramAnonymousa)
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
        throw new u(localNumberFormatException);
      }
    }
  };
  public static final z x = a(String.class, u);
  public static final y<StringBuilder> y = new y()
  {
  };
  public static final z z = a(StringBuilder.class, y);

  public static <TT> z a(Class<TT> paramClass1, final Class<TT> paramClass2, final y<? super TT> paramy)
  {
    return new z()
    {
      public final <T> y<T> a(f paramAnonymousf, textnow.aj.a<T> paramAnonymousa)
      {
        Class localClass = paramAnonymousa.a();
        if ((localClass == p.this) || (localClass == paramClass2))
          return paramy;
        return null;
      }

      public final String toString()
      {
        return "Factory[type=" + paramClass2.getName() + "+" + p.this.getName() + ",adapter=" + paramy + "]";
      }
    };
  }

  public static <TT> z a(Class<TT> paramClass, final y<TT> paramy)
  {
    return new z()
    {
      public final <T> y<T> a(f paramAnonymousf, textnow.aj.a<T> paramAnonymousa)
      {
        if (paramAnonymousa.a() == p.this)
          return paramy;
        return null;
      }

      public final String toString()
      {
        return "Factory[type=" + p.this.getName() + ",adapter=" + paramy + "]";
      }
    };
  }

  public static <TT> z a(textnow.aj.a<TT> parama, final y<TT> paramy)
  {
    return new z()
    {
      public final <T> y<T> a(f paramAnonymousf, textnow.aj.a<T> paramAnonymousa)
      {
        if (paramAnonymousa.equals(p.this))
          return paramy;
        return null;
      }
    };
  }

  private static <TT> z b(Class<TT> paramClass, final y<TT> paramy)
  {
    return new z()
    {
      public final <T> y<T> a(f paramAnonymousf, textnow.aj.a<T> paramAnonymousa)
      {
        if (p.this.isAssignableFrom(paramAnonymousa.a()))
          return paramy;
        return null;
      }

      public final String toString()
      {
        return "Factory[typeHierarchy=" + p.this.getName() + ",adapter=" + paramy + "]";
      }
    };
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ai.p
 * JD-Core Version:    0.6.2
 */