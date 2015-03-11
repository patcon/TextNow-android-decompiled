package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class eh
{
  private static final eh rP = localeh;
  public static final String rQ = localeh.rR;
  private final Object ls = new Object();
  public final String rR = eo.bT();
  private final ei rS = new ei(this.rR);
  private BigInteger rT = BigInteger.ONE;
  private final HashSet<eg> rU = new HashSet();
  private final HashMap<String, ek> rV = new HashMap();
  private boolean rW = false;

  static
  {
    eh localeh = new eh();
  }

  public static Bundle a(Context paramContext, ej paramej, String paramString)
  {
    return rP.b(paramContext, paramej, paramString);
  }

  public static void b(HashSet<eg> paramHashSet)
  {
    rP.c(paramHashSet);
  }

  public static eh bH()
  {
    return rP;
  }

  public static String bI()
  {
    return rP.bJ();
  }

  public static ei bK()
  {
    return rP.bL();
  }

  public static boolean bM()
  {
    return rP.bN();
  }

  public void a(eg parameg)
  {
    synchronized (this.ls)
    {
      this.rU.add(parameg);
      return;
    }
  }

  public void a(String paramString, ek paramek)
  {
    synchronized (this.ls)
    {
      this.rV.put(paramString, paramek);
      return;
    }
  }

  public Bundle b(Context paramContext, ej paramej, String paramString)
  {
    Bundle localBundle1;
    Bundle localBundle2;
    synchronized (this.ls)
    {
      localBundle1 = new Bundle();
      localBundle1.putBundle("app", this.rS.b(paramContext, paramString));
      localBundle2 = new Bundle();
      Iterator localIterator1 = this.rV.keySet().iterator();
      if (localIterator1.hasNext())
      {
        String str = (String)localIterator1.next();
        localBundle2.putBundle(str, ((ek)this.rV.get(str)).toBundle());
      }
    }
    localBundle1.putBundle("slots", localBundle2);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator2 = this.rU.iterator();
    while (localIterator2.hasNext())
      localArrayList.add(((eg)localIterator2.next()).toBundle());
    localBundle1.putParcelableArrayList("ads", localArrayList);
    paramej.a(this.rU);
    this.rU.clear();
    return localBundle1;
  }

  public String bJ()
  {
    synchronized (this.ls)
    {
      String str = this.rT.toString();
      this.rT = this.rT.add(BigInteger.ONE);
      return str;
    }
  }

  public ei bL()
  {
    synchronized (this.ls)
    {
      ei localei = this.rS;
      return localei;
    }
  }

  public boolean bN()
  {
    synchronized (this.ls)
    {
      boolean bool = this.rW;
      this.rW = true;
      return bool;
    }
  }

  public void c(HashSet<eg> paramHashSet)
  {
    synchronized (this.ls)
    {
      this.rU.addAll(paramHashSet);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eh
 * JD-Core Version:    0.6.2
 */