package com.flurry.sdk;

import java.util.Iterator;
import java.util.LinkedList;

public class jh extends hk
{
  protected LinkedList<jh.a> b;

  public jh(String paramString)
  {
    super(paramString);
  }

  public jh(String paramString, hg paramhg)
  {
    super(paramString, paramhg);
  }

  public jh(String paramString, hg paramhg, Throwable paramThrowable)
  {
    super(paramString, paramhg, paramThrowable);
  }

  public jh(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }

  public static jh a(hj paramhj, String paramString)
  {
    return new jh(paramString, paramhj.h());
  }

  public static jh a(hj paramhj, String paramString, Throwable paramThrowable)
  {
    return new jh(paramString, paramhj.h(), paramThrowable);
  }

  public static jh a(Throwable paramThrowable, jh.a parama)
  {
    if ((paramThrowable instanceof jh));
    String str;
    for (jh localjh = (jh)paramThrowable; ; localjh = new jh(str, null, paramThrowable))
    {
      localjh.a(parama);
      return localjh;
      str = paramThrowable.getMessage();
      if ((str == null) || (str.length() == 0))
        str = "(was " + paramThrowable.getClass().getName() + ")";
    }
  }

  public static jh a(Throwable paramThrowable, Object paramObject, int paramInt)
  {
    return a(paramThrowable, new jh.a(paramObject, paramInt));
  }

  public static jh a(Throwable paramThrowable, Object paramObject, String paramString)
  {
    return a(paramThrowable, new jh.a(paramObject, paramString));
  }

  public void a(jh.a parama)
  {
    if (this.b == null)
      this.b = new LinkedList();
    if (this.b.size() < 1000)
      this.b.addFirst(parama);
  }

  public void a(Object paramObject, String paramString)
  {
    a(new jh.a(paramObject, paramString));
  }

  protected void a(StringBuilder paramStringBuilder)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      paramStringBuilder.append(((jh.a)localIterator.next()).toString());
      if (localIterator.hasNext())
        paramStringBuilder.append("->");
    }
  }

  public String getMessage()
  {
    String str = super.getMessage();
    if (this.b == null)
      return str;
    if (str == null);
    for (StringBuilder localStringBuilder = new StringBuilder(); ; localStringBuilder = new StringBuilder(str))
    {
      localStringBuilder.append(" (through reference chain: ");
      a(localStringBuilder);
      localStringBuilder.append(')');
      return localStringBuilder.toString();
    }
  }

  public String toString()
  {
    return getClass().getName() + ": " + getMessage();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.jh
 * JD-Core Version:    0.6.2
 */