package android.support.v4.app;

import android.os.Build.VERSION;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.io.PrintWriter;
import java.util.ArrayList;
import textnow.e.a;
import textnow.e.d;

final class q extends ac
  implements Runnable
{
  final z a;
  r b;
  r c;
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  boolean k;
  boolean l = true;
  String m;
  boolean n;
  int o = -1;
  int p;
  CharSequence q;
  int r;
  CharSequence s;
  ArrayList<String> t;
  ArrayList<String> u;

  public q(z paramz)
  {
    this.a = paramz;
  }

  private int a(boolean paramBoolean)
  {
    if (this.n)
      throw new IllegalStateException("commit already called");
    if (z.a)
    {
      new StringBuilder().append("Commit: ").append(this).toString();
      a("  ", new PrintWriter(new d("FragmentManager")));
    }
    this.n = true;
    if (this.k);
    for (this.o = this.a.a(this); ; this.o = -1)
    {
      this.a.a(this, paramBoolean);
      return this.o;
    }
  }

  private s a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2, boolean paramBoolean)
  {
    s locals = new s(this);
    locals.d = new View(this.a.o);
    int i1 = 0;
    int i2 = 0;
    int i3 = paramSparseArray1.size();
    int i4 = 0;
    if (i1 < i3)
      if (!a(paramSparseArray1.keyAt(i1), locals, paramBoolean, paramSparseArray1, paramSparseArray2))
        break label142;
    label142: for (int i6 = 1; ; i6 = i2)
    {
      i1++;
      i2 = i6;
      break;
      while (i4 < paramSparseArray2.size())
      {
        int i5 = paramSparseArray2.keyAt(i4);
        if ((paramSparseArray1.get(i5) == null) && (a(i5, locals, paramBoolean, paramSparseArray1, paramSparseArray2)))
          i2 = 1;
        i4++;
      }
      if (i2 == 0)
        locals = null;
      return locals;
    }
  }

  private a<String, View> a(s params, Fragment paramFragment, boolean paramBoolean)
  {
    a locala = new a();
    if (this.t != null)
    {
      ad.a(locala, paramFragment.getView());
      if (!paramBoolean)
        break label71;
      locala.a(this.u);
    }
    while (paramBoolean)
    {
      if (paramFragment.mEnterTransitionCallback != null);
      a(params, locala, false);
      return locala;
      label71: locala = a(this.t, this.u, locala);
    }
    if (paramFragment.mExitTransitionCallback != null);
    b(params, locala, false);
    return locala;
  }

  private static a<String, View> a(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, a<String, View> parama)
  {
    if (parama.isEmpty())
      return parama;
    a locala = new a();
    int i1 = paramArrayList1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = (View)parama.get(paramArrayList1.get(i2));
      if (localView != null)
        locala.put(paramArrayList2.get(i2), localView);
    }
    return locala;
  }

  private void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    paramFragment.mFragmentManager = this.a;
    if (paramString != null)
    {
      if ((paramFragment.mTag != null) && (!paramString.equals(paramFragment.mTag)))
        throw new IllegalStateException("Can't change tag of fragment " + paramFragment + ": was " + paramFragment.mTag + " now " + paramString);
      paramFragment.mTag = paramString;
    }
    if (paramInt1 != 0)
    {
      if ((paramFragment.mFragmentId != 0) && (paramFragment.mFragmentId != paramInt1))
        throw new IllegalStateException("Can't change container ID of fragment " + paramFragment + ": was " + paramFragment.mFragmentId + " now " + paramInt1);
      paramFragment.mFragmentId = paramInt1;
      paramFragment.mContainerId = paramInt1;
    }
    r localr = new r();
    localr.c = paramInt2;
    localr.d = paramFragment;
    a(localr);
  }

  private void a(s params, int paramInt, Object paramObject)
  {
    if (this.a.g != null)
    {
      int i1 = 0;
      if (i1 < this.a.g.size())
      {
        Fragment localFragment = (Fragment)this.a.g.get(i1);
        if ((localFragment.mView != null) && (localFragment.mContainer != null) && (localFragment.mContainerId == paramInt))
        {
          if (!localFragment.mHidden)
            break label122;
          if (!params.b.contains(localFragment.mView))
          {
            ad.a(paramObject, localFragment.mView, true);
            params.b.add(localFragment.mView);
          }
        }
        while (true)
        {
          i1++;
          break;
          label122: ad.a(paramObject, localFragment.mView, false);
          params.b.remove(localFragment.mView);
        }
      }
    }
  }

  private static void a(s params, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    if (paramArrayList1 != null)
      for (int i1 = 0; i1 < paramArrayList1.size(); i1++)
      {
        String str1 = (String)paramArrayList1.get(i1);
        String str2 = (String)paramArrayList2.get(i1);
        a(params.a, str1, str2);
      }
  }

  private void a(s params, a<String, View> parama, boolean paramBoolean)
  {
    int i1;
    int i2;
    label13: String str1;
    String str2;
    if (this.u == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1)
        return;
      str1 = (String)this.t.get(i2);
      View localView = (View)parama.get((String)this.u.get(i2));
      if (localView != null)
      {
        str2 = localView.getTransitionName();
        if (!paramBoolean)
          break label100;
        a(params.a, str1, str2);
      }
    }
    while (true)
    {
      i2++;
      break label13;
      i1 = this.u.size();
      break;
      label100: a(params.a, str2, str1);
    }
  }

  private static void a(SparseArray<Fragment> paramSparseArray, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i1 = paramFragment.mContainerId;
      if ((i1 != 0) && (!paramFragment.isHidden()) && (paramFragment.isAdded()) && (paramFragment.getView() != null) && (paramSparseArray.get(i1) == null))
        paramSparseArray.put(i1, paramFragment);
    }
  }

  private static void a(a<String, String> parama, String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null) && (!paramString1.equals(paramString2)));
    for (int i1 = 0; i1 < parama.size(); i1++)
      if (paramString1.equals(parama.c(i1)))
      {
        parama.a(i1, paramString2);
        return;
      }
    parama.put(paramString1, paramString2);
  }

  private boolean a(final int paramInt, final s params, final boolean paramBoolean, SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    final ViewGroup localViewGroup = (ViewGroup)this.a.p.a(paramInt);
    if (localViewGroup == null)
      return false;
    final Fragment localFragment1 = (Fragment)paramSparseArray2.get(paramInt);
    final Fragment localFragment2 = (Fragment)paramSparseArray1.get(paramInt);
    Object localObject2;
    final Object localObject3;
    Object localObject5;
    if (localFragment1 == null)
    {
      localObject2 = null;
      if ((localFragment1 == null) || (localFragment2 == null))
      {
        localObject3 = null;
        if (localFragment2 != null)
          break label155;
        localObject5 = null;
        if ((localObject2 != null) || (localObject3 != null) || (localObject5 != null))
          break label186;
        return false;
      }
    }
    else
    {
      if (paramBoolean);
      for (Object localObject1 = localFragment1.getReenterTransition(); ; localObject1 = localFragment1.getEnterTransition())
      {
        localObject2 = ad.a(localObject1);
        break;
      }
    }
    if (paramBoolean);
    for (Object localObject8 = localFragment2.getSharedElementReturnTransition(); ; localObject8 = localFragment1.getSharedElementEnterTransition())
    {
      localObject3 = ad.a(localObject8);
      break;
    }
    label155: if (paramBoolean);
    for (Object localObject4 = localFragment2.getReturnTransition(); ; localObject4 = localFragment2.getExitTransition())
    {
      localObject5 = ad.a(localObject4);
      break;
    }
    label186: final ArrayList localArrayList1 = new ArrayList();
    a locala1 = null;
    cc localcc;
    if (localObject3 != null)
    {
      locala1 = a(params, localFragment2, paramBoolean);
      if (!locala1.isEmpty())
        break label713;
      localArrayList1.add(params.d);
      if (!paramBoolean)
        break label727;
      localcc = localFragment2.mEnterTransitionCallback;
      label242: if (localcc != null)
      {
        new ArrayList(locala1.keySet());
        new ArrayList(locala1.values());
      }
    }
    ArrayList localArrayList2 = new ArrayList();
    if (localObject5 != null)
    {
      View localView4 = localFragment2.getView();
      localObject5 = ad.a(localObject5, localView4, localArrayList2, locala1);
    }
    if ((this.u != null) && (locala1 != null))
    {
      View localView3 = (View)locala1.get(this.u.get(0));
      if (localView3 != null)
      {
        if (localObject5 != null)
          ad.a(localObject5, localView3);
        if (localObject3 != null)
          ad.a(localObject3, localView3);
      }
    }
    af local1 = new af()
    {
      public final View a()
      {
        return localFragment1.getView();
      }
    };
    if (localObject3 != null)
      localViewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        public final boolean onPreDraw()
        {
          localViewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
          a locala;
          if (localObject3 != null)
          {
            ad.a(localObject3, localArrayList1);
            localArrayList1.clear();
            locala = q.a(q.this, params, paramBoolean, localFragment1);
            if (!locala.isEmpty())
              break label127;
            localArrayList1.add(params.d);
          }
          while (true)
          {
            ad.b(localObject3, localArrayList1);
            q.a(q.this, locala, params);
            q.a(q.this, params, localFragment1, localFragment2, paramBoolean, locala);
            return true;
            label127: localArrayList1.addAll(locala.values());
          }
        }
      });
    ArrayList localArrayList3 = new ArrayList();
    a locala2 = new a();
    boolean bool;
    label440: Object localObject6;
    Transition localTransition1;
    Transition localTransition2;
    if (paramBoolean)
    {
      bool = localFragment1.getAllowReturnTransitionOverlap();
      localObject6 = (Transition)localObject2;
      localTransition1 = (Transition)localObject5;
      localTransition2 = (Transition)localObject3;
      if ((localObject6 == null) || (localTransition1 == null))
        break label850;
    }
    while (true)
    {
      final Object localObject7;
      if (bool)
      {
        TransitionSet localTransitionSet = new TransitionSet();
        if (localObject6 != null)
          localTransitionSet.addTransition((Transition)localObject6);
        if (localTransition1 != null)
          localTransitionSet.addTransition(localTransition1);
        if (localTransition2 != null)
          localTransitionSet.addTransition(localTransition2);
        localObject7 = localTransitionSet;
      }
      while (true)
      {
        if (localObject7 != null)
        {
          View localView1 = params.d;
          ae localae = params.c;
          a locala3 = params.a;
          ad.a(localObject2, localObject3, localViewGroup, local1, localView1, localae, locala3, localArrayList3, locala2, localArrayList1);
          localViewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              localViewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
              q.a(q.this, params, paramInt, localObject7);
              return true;
            }
          });
          ad.a(localObject7, params.d, true);
          a(params, paramInt, localObject7);
          TransitionManager.beginDelayedTransition(localViewGroup, (Transition)localObject7);
          View localView2 = params.d;
          ArrayList localArrayList4 = params.b;
          Transition localTransition3 = (Transition)localObject2;
          Transition localTransition4 = (Transition)localObject5;
          Transition localTransition5 = (Transition)localObject3;
          Transition localTransition6 = (Transition)localObject7;
          if (localTransition6 != null)
            localViewGroup.getViewTreeObserver().addOnPreDrawListener(new ad.4(localViewGroup, localTransition3, localView2, localArrayList3, localTransition4, localArrayList2, localTransition5, localArrayList1, locala2, localArrayList4, localTransition6));
        }
        if (localObject7 == null)
          break label848;
        return true;
        label713: localArrayList1.addAll(locala1.values());
        break;
        label727: localcc = localFragment1.mEnterTransitionCallback;
        break label242;
        bool = localFragment1.getAllowEnterTransitionOverlap();
        break label440;
        if ((localTransition1 != null) && (localObject6 != null))
          localObject6 = new TransitionSet().addTransition(localTransition1).addTransition((Transition)localObject6).setOrdering(1);
        while (true)
        {
          if (localTransition2 == null)
            break label841;
          localObject7 = new TransitionSet();
          if (localObject6 != null)
            ((TransitionSet)localObject7).addTransition((Transition)localObject6);
          ((TransitionSet)localObject7).addTransition(localTransition2);
          break;
          if (localTransition1 != null)
            localObject6 = localTransition1;
          else if (localObject6 == null)
            localObject6 = null;
        }
        label841: localObject7 = localObject6;
      }
      label848: return false;
      label850: bool = true;
    }
  }

  private static void b(s params, a<String, View> parama, boolean paramBoolean)
  {
    int i1 = parama.size();
    int i2 = 0;
    if (i2 < i1)
    {
      String str1 = (String)parama.b(i2);
      String str2 = ((View)parama.c(i2)).getTransitionName();
      if (paramBoolean)
        a(params.a, str1, str2);
      while (true)
      {
        i2++;
        break;
        a(params.a, str2, str1);
      }
    }
  }

  private static void b(SparseArray<Fragment> paramSparseArray, Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      int i1 = paramFragment.mContainerId;
      if (i1 != 0)
        paramSparseArray.put(i1, paramFragment);
    }
  }

  private void b(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.a.p.a());
    r localr;
    do
    {
      return;
      localr = this.b;
    }
    while (localr == null);
    switch (localr.c)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      localr = localr.a;
      break;
      b(paramSparseArray2, localr.d);
      continue;
      Fragment localFragment1 = localr.d;
      Fragment localFragment2;
      if (this.a.g != null)
      {
        localFragment2 = localFragment1;
        int i1 = 0;
        if (i1 < this.a.g.size())
        {
          Fragment localFragment3 = (Fragment)this.a.g.get(i1);
          if ((localFragment2 == null) || (localFragment3.mContainerId == localFragment2.mContainerId))
          {
            if (localFragment3 != localFragment2)
              break label180;
            localFragment2 = null;
          }
          while (true)
          {
            i1++;
            break;
            label180: a(paramSparseArray1, localFragment3);
          }
        }
      }
      else
      {
        localFragment2 = localFragment1;
      }
      b(paramSparseArray2, localFragment2);
      continue;
      a(paramSparseArray1, localr.d);
      continue;
      a(paramSparseArray1, localr.d);
      continue;
      b(paramSparseArray2, localr.d);
      continue;
      a(paramSparseArray1, localr.d);
      continue;
      b(paramSparseArray2, localr.d);
    }
  }

  public final int a()
  {
    return a(false);
  }

  public final ac a(int paramInt)
  {
    this.i = 4099;
    return this;
  }

  public final ac a(int paramInt1, int paramInt2)
  {
    this.e = 17432576;
    this.f = 17432577;
    this.g = 0;
    this.h = 0;
    return this;
  }

  public final ac a(int paramInt, Fragment paramFragment)
  {
    return b(paramInt, paramFragment, null);
  }

  public final ac a(int paramInt, Fragment paramFragment, String paramString)
  {
    a(paramInt, paramFragment, paramString, 1);
    return this;
  }

  public final ac a(Fragment paramFragment)
  {
    r localr = new r();
    localr.c = 3;
    localr.d = paramFragment;
    a(localr);
    return this;
  }

  public final ac a(Fragment paramFragment, String paramString)
  {
    a(0, paramFragment, paramString, 1);
    return this;
  }

  public final s a(boolean paramBoolean, s params, SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (z.a)
    {
      new StringBuilder().append("popFromBackStack: ").append(this).toString();
      a("  ", new PrintWriter(new d("FragmentManager")));
    }
    label77: int i1;
    label89: int i2;
    label96: r localr;
    int i3;
    if (params == null)
    {
      if ((paramSparseArray1.size() != 0) || (paramSparseArray2.size() != 0))
        params = a(paramSparseArray1, paramSparseArray2, true);
      b(-1);
      if (params == null)
        break label219;
      i1 = 0;
      if (params == null)
        break label228;
      i2 = 0;
      localr = this.c;
      if (localr == null)
        break label553;
      if (params == null)
        break label237;
      i3 = 0;
      label114: if (params == null)
        break label247;
    }
    label219: label228: label237: label247: for (int i4 = 0; ; i4 = localr.h)
      switch (localr.c)
      {
      default:
        throw new IllegalArgumentException("Unknown cmd: " + localr.c);
        if (paramBoolean)
          break label77;
        a(params, this.u, this.t);
        break label77;
        i1 = this.j;
        break label89;
        i2 = this.i;
        break label96;
        i3 = localr.g;
        break label114;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    Fragment localFragment8 = localr.d;
    localFragment8.mNextAnim = i4;
    this.a.a(localFragment8, z.b(i2), i1);
    while (true)
    {
      localr = localr.b;
      break;
      Fragment localFragment6 = localr.d;
      if (localFragment6 != null)
      {
        localFragment6.mNextAnim = i4;
        this.a.a(localFragment6, z.b(i2), i1);
      }
      if (localr.i != null)
      {
        for (int i5 = 0; i5 < localr.i.size(); i5++)
        {
          Fragment localFragment7 = (Fragment)localr.i.get(i5);
          localFragment7.mNextAnim = i3;
          this.a.a(localFragment7, false);
        }
        Fragment localFragment5 = localr.d;
        localFragment5.mNextAnim = i3;
        this.a.a(localFragment5, false);
        continue;
        Fragment localFragment4 = localr.d;
        localFragment4.mNextAnim = i3;
        this.a.c(localFragment4, z.b(i2), i1);
        continue;
        Fragment localFragment3 = localr.d;
        localFragment3.mNextAnim = i4;
        this.a.b(localFragment3, z.b(i2), i1);
        continue;
        Fragment localFragment2 = localr.d;
        localFragment2.mNextAnim = i3;
        this.a.e(localFragment2, z.b(i2), i1);
        continue;
        Fragment localFragment1 = localr.d;
        localFragment1.mNextAnim = i3;
        this.a.d(localFragment1, z.b(i2), i1);
      }
    }
    label553: if (paramBoolean)
    {
      this.a.a(this.a.n, z.b(i2), i1, true);
      params = null;
    }
    if (this.o >= 0)
    {
      this.a.a(this.o);
      this.o = -1;
    }
    return params;
  }

  final void a(r paramr)
  {
    if (this.b == null)
    {
      this.c = paramr;
      this.b = paramr;
    }
    while (true)
    {
      paramr.e = this.e;
      paramr.f = this.f;
      paramr.g = this.g;
      paramr.h = this.h;
      this.d = (1 + this.d);
      return;
      paramr.b = this.c;
      this.c.a = paramr;
      this.c = paramr;
    }
  }

  public final void a(SparseArray<Fragment> paramSparseArray1, SparseArray<Fragment> paramSparseArray2)
  {
    if (!this.a.p.a());
    r localr;
    do
    {
      return;
      localr = this.b;
    }
    while (localr == null);
    switch (localr.c)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      localr = localr.a;
      break;
      a(paramSparseArray1, localr.d);
      continue;
      if (localr.i != null)
        for (int i1 = -1 + localr.i.size(); i1 >= 0; i1--)
          b(paramSparseArray2, (Fragment)localr.i.get(i1));
      a(paramSparseArray1, localr.d);
      continue;
      b(paramSparseArray2, localr.d);
      continue;
      b(paramSparseArray2, localr.d);
      continue;
      a(paramSparseArray1, localr.d);
      continue;
      b(paramSparseArray2, localr.d);
      continue;
      a(paramSparseArray1, localr.d);
    }
  }

  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    a(paramString, paramPrintWriter, true);
  }

  public final void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.m);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.o);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.n);
      if (this.i != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.i));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.j));
      }
      if ((this.e != 0) || (this.f != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.e));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.f));
      }
      if ((this.g != 0) || (this.h != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.g));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.h));
      }
      if ((this.p != 0) || (this.q != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.p));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.q);
      }
      if ((this.r != 0) || (this.s != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.r));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.s);
      }
    }
    if (this.b != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str1 = paramString + "    ";
      r localr1 = this.b;
      int i1 = 0;
      r localr2 = localr1;
      while (localr2 != null)
      {
        String str2;
        int i2;
        switch (localr2.c)
        {
        default:
          str2 = "cmd=" + localr2.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str2);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localr2.d);
          if (paramBoolean)
          {
            if ((localr2.e != 0) || (localr2.f != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localr2.e));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localr2.f));
            }
            if ((localr2.g != 0) || (localr2.h != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(localr2.g));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(localr2.h));
            }
          }
          if ((localr2.i == null) || (localr2.i.size() <= 0))
            break label808;
          i2 = 0;
          label645: if (i2 >= localr2.i.size())
            break label808;
          paramPrintWriter.print(str1);
          if (localr2.i.size() == 1)
            paramPrintWriter.print("Removed: ");
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
        while (true)
        {
          paramPrintWriter.println(localr2.i.get(i2));
          i2++;
          break label645;
          str2 = "NULL";
          break;
          str2 = "ADD";
          break;
          str2 = "REPLACE";
          break;
          str2 = "REMOVE";
          break;
          str2 = "HIDE";
          break;
          str2 = "SHOW";
          break;
          str2 = "DETACH";
          break;
          str2 = "ATTACH";
          break;
          if (i2 == 0)
            paramPrintWriter.println("Removed:");
          paramPrintWriter.print(str1);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
        }
        label808: localr2 = localr2.a;
        i1++;
      }
    }
  }

  public final int b()
  {
    return a(true);
  }

  public final ac b(int paramInt, Fragment paramFragment, String paramString)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("Must use non-zero containerViewId");
    a(paramInt, paramFragment, paramString, 2);
    return this;
  }

  public final ac b(Fragment paramFragment)
  {
    r localr = new r();
    localr.c = 6;
    localr.d = paramFragment;
    a(localr);
    return this;
  }

  final void b(int paramInt)
  {
    if (!this.k);
    while (true)
    {
      return;
      if (z.a)
        new StringBuilder().append("Bump nesting in ").append(this).append(" by ").append(paramInt).toString();
      for (r localr = this.b; localr != null; localr = localr.a)
      {
        if (localr.d != null)
        {
          Fragment localFragment2 = localr.d;
          localFragment2.mBackStackNesting = (paramInt + localFragment2.mBackStackNesting);
          if (z.a)
            new StringBuilder().append("Bump nesting of ").append(localr.d).append(" to ").append(localr.d.mBackStackNesting).toString();
        }
        if (localr.i != null)
          for (int i1 = -1 + localr.i.size(); i1 >= 0; i1--)
          {
            Fragment localFragment1 = (Fragment)localr.i.get(i1);
            localFragment1.mBackStackNesting = (paramInt + localFragment1.mBackStackNesting);
            if (z.a)
              new StringBuilder().append("Bump nesting of ").append(localFragment1).append(" to ").append(localFragment1.mBackStackNesting).toString();
          }
      }
    }
  }

  public final ac c(Fragment paramFragment)
  {
    r localr = new r();
    localr.c = 7;
    localr.d = paramFragment;
    a(localr);
    return this;
  }

  public final boolean c()
  {
    return this.d == 0;
  }

  public final void run()
  {
    if (z.a)
      new StringBuilder().append("Run: ").append(this).toString();
    if ((this.k) && (this.o < 0))
      throw new IllegalStateException("addToBackStack() called after commit()");
    b(1);
    SparseArray localSparseArray1;
    SparseArray localSparseArray2;
    if (Build.VERSION.SDK_INT >= 21)
    {
      localSparseArray1 = new SparseArray();
      localSparseArray2 = new SparseArray();
      b(localSparseArray1, localSparseArray2);
    }
    for (s locals = a(localSparseArray1, localSparseArray2, false); ; locals = null)
    {
      int i1;
      label102: int i2;
      label109: r localr;
      int i3;
      if (locals != null)
      {
        i1 = 0;
        if (locals == null)
          break label221;
        i2 = 0;
        localr = this.b;
        if (localr == null)
          break label713;
        if (locals == null)
          break label230;
        i3 = 0;
        label127: if (locals == null)
          break label240;
      }
      label221: label230: label240: for (int i4 = 0; ; i4 = localr.f)
        switch (localr.c)
        {
        default:
          throw new IllegalArgumentException("Unknown cmd: " + localr.c);
          i1 = this.j;
          break label102;
          i2 = this.i;
          break label109;
          i3 = localr.e;
          break label127;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        }
      Fragment localFragment9 = localr.d;
      localFragment9.mNextAnim = i3;
      this.a.a(localFragment9, false);
      while (true)
      {
        localr = localr.a;
        break;
        Fragment localFragment6 = localr.d;
        Fragment localFragment7;
        if (this.a.g != null)
        {
          int i5 = 0;
          localFragment7 = localFragment6;
          if (i5 < this.a.g.size())
          {
            Fragment localFragment8 = (Fragment)this.a.g.get(i5);
            if (z.a)
              new StringBuilder().append("OP_REPLACE: adding=").append(localFragment7).append(" old=").append(localFragment8).toString();
            if ((localFragment7 == null) || (localFragment8.mContainerId == localFragment7.mContainerId))
            {
              if (localFragment8 != localFragment7)
                break label419;
              localr.d = null;
              localFragment7 = null;
            }
            while (true)
            {
              i5++;
              break;
              label419: if (localr.i == null)
                localr.i = new ArrayList();
              localr.i.add(localFragment8);
              localFragment8.mNextAnim = i4;
              if (this.k)
              {
                localFragment8.mBackStackNesting = (1 + localFragment8.mBackStackNesting);
                if (z.a)
                  new StringBuilder().append("Bump nesting of ").append(localFragment8).append(" to ").append(localFragment8.mBackStackNesting).toString();
              }
              this.a.a(localFragment8, i2, i1);
            }
          }
        }
        else
        {
          localFragment7 = localFragment6;
        }
        if (localFragment7 != null)
        {
          localFragment7.mNextAnim = i3;
          this.a.a(localFragment7, false);
          continue;
          Fragment localFragment5 = localr.d;
          localFragment5.mNextAnim = i4;
          this.a.a(localFragment5, i2, i1);
          continue;
          Fragment localFragment4 = localr.d;
          localFragment4.mNextAnim = i4;
          this.a.b(localFragment4, i2, i1);
          continue;
          Fragment localFragment3 = localr.d;
          localFragment3.mNextAnim = i3;
          this.a.c(localFragment3, i2, i1);
          continue;
          Fragment localFragment2 = localr.d;
          localFragment2.mNextAnim = i4;
          this.a.d(localFragment2, i2, i1);
          continue;
          Fragment localFragment1 = localr.d;
          localFragment1.mNextAnim = i3;
          this.a.e(localFragment1, i2, i1);
        }
      }
      label713: this.a.a(this.a.n, i2, i1, true);
      if (this.k)
        this.a.b(this);
      return;
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.o >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.o);
    }
    if (this.m != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.m);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.q
 * JD-Core Version:    0.6.2
 */