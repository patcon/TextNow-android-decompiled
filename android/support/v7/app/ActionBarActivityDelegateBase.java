package android.support.v7.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.view.aj;
import android.support.v4.view.av;
import android.support.v4.view.bi;
import android.support.v4.view.cs;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.TintCheckBox;
import android.support.v7.internal.widget.TintCheckedTextView;
import android.support.v7.internal.widget.TintEditText;
import android.support.v7.internal.widget.TintRadioButton;
import android.support.v7.internal.widget.TintSpinner;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.widget.ar;
import android.support.v7.internal.widget.t;
import android.support.v7.internal.widget.w;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import textnow.g.k;
import textnow.g.l;

class ActionBarActivityDelegateBase extends c
  implements j
{
  private boolean A;
  private android.support.v7.internal.view.menu.g B;
  private Rect C;
  private Rect D;
  textnow.l.a g;
  ActionBarContextView h;
  PopupWindow i;
  Runnable j;
  private t k;
  private e l;
  private g m;
  private boolean n;
  private ViewGroup o;
  private ViewGroup p;
  private View q;
  private CharSequence r;
  private boolean s;
  private boolean t;
  private boolean u;
  private ActionBarActivityDelegateBase.PanelFeatureState[] v;
  private ActionBarActivityDelegateBase.PanelFeatureState w;
  private boolean x;
  private int y;
  private final Runnable z = new Runnable()
  {
    public final void run()
    {
      if ((0x1 & ActionBarActivityDelegateBase.a(ActionBarActivityDelegateBase.this)) != 0)
        ActionBarActivityDelegateBase.a(ActionBarActivityDelegateBase.this, 0);
      if ((0x100 & ActionBarActivityDelegateBase.a(ActionBarActivityDelegateBase.this)) != 0)
        ActionBarActivityDelegateBase.a(ActionBarActivityDelegateBase.this, 8);
      ActionBarActivityDelegateBase.a(ActionBarActivityDelegateBase.this, false);
      ActionBarActivityDelegateBase.b(ActionBarActivityDelegateBase.this, 0);
    }
  };

  ActionBarActivityDelegateBase(b paramb)
  {
    super(paramb);
  }

  private ActionBarActivityDelegateBase.PanelFeatureState a(Menu paramMenu)
  {
    ActionBarActivityDelegateBase.PanelFeatureState[] arrayOfPanelFeatureState = this.v;
    int i1;
    if (arrayOfPanelFeatureState != null)
      i1 = arrayOfPanelFeatureState.length;
    for (int i2 = 0; ; i2++)
    {
      if (i2 >= i1)
        break label55;
      ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[i2];
      if ((localPanelFeatureState != null) && (localPanelFeatureState.d == paramMenu))
      {
        return localPanelFeatureState;
        i1 = 0;
        break;
      }
    }
    label55: return null;
  }

  private void a(int paramInt, ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    if (paramMenu == null)
    {
      if ((paramPanelFeatureState == null) && (paramInt >= 0) && (paramInt < this.v.length))
        paramPanelFeatureState = this.v[paramInt];
      if (paramPanelFeatureState != null)
        paramMenu = paramPanelFeatureState.d;
    }
    if ((paramPanelFeatureState != null) && (!paramPanelFeatureState.i))
      return;
    j().b(paramInt, paramMenu);
  }

  private void a(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if ((paramPanelFeatureState.i) || (l()));
    label319: label338: label467: 
    while (true)
    {
      return;
      int i3;
      if (paramPanelFeatureState.a == 0)
      {
        b localb = this.a;
        if ((0xF & localb.getResources().getConfiguration().screenLayout) != 4)
          break label108;
        i3 = 1;
        if (localb.getApplicationInfo().targetSdkVersion < 11)
          break label114;
      }
      label108: label114: for (int i4 = 1; ; i4 = 0)
      {
        if ((i3 != 0) && (i4 != 0))
          break label118;
        textnow.i.a locala = j();
        if ((locala == null) || (locala.c(paramPanelFeatureState.a, paramPanelFeatureState.d)))
          break label120;
        a(paramPanelFeatureState, true);
        return;
        i3 = 0;
        break;
      }
      label118: continue;
      label120: if (b(paramPanelFeatureState, null))
      {
        Resources.Theme localTheme;
        label248: g localg;
        android.support.v7.internal.view.menu.x localx;
        int i1;
        if ((paramPanelFeatureState.b == null) || (paramPanelFeatureState.k))
        {
          paramPanelFeatureState.b = this.o;
          Context localContext = i();
          TypedValue localTypedValue = new TypedValue();
          localTheme = localContext.getResources().newTheme();
          localTheme.setTo(localContext.getTheme());
          localTheme.resolveAttribute(textnow.g.b.a, localTypedValue, true);
          if (localTypedValue.resourceId != 0)
            localTheme.applyStyle(localTypedValue.resourceId, true);
          localTheme.resolveAttribute(textnow.g.b.t, localTypedValue, true);
          if (localTypedValue.resourceId != 0)
          {
            localTheme.applyStyle(localTypedValue.resourceId, true);
            ContextThemeWrapper localContextThemeWrapper = new ContextThemeWrapper(localContext, 0);
            localContextThemeWrapper.getTheme().setTo(localTheme);
            paramPanelFeatureState.f = localContextThemeWrapper;
          }
        }
        else
        {
          if (paramPanelFeatureState.d == null)
            break label457;
          if (this.m == null)
            this.m = new g(this, (byte)0);
          localg = this.m;
          if (paramPanelFeatureState.d != null)
            break label396;
          localx = null;
          paramPanelFeatureState.c = ((View)localx);
          if (paramPanelFeatureState.c == null)
            break label457;
          i1 = 1;
          if (i1 == 0)
            break label461;
          if ((paramPanelFeatureState.c == null) || (paramPanelFeatureState.e.a().getCount() <= 0))
            break label463;
        }
        for (int i2 = 1; ; i2 = 0)
        {
          if (i2 == 0)
            break label467;
          paramPanelFeatureState.h = false;
          paramPanelFeatureState.i = true;
          return;
          localTheme.applyStyle(k.b, true);
          break label248;
          if (paramPanelFeatureState.e == null)
          {
            paramPanelFeatureState.e = new android.support.v7.internal.view.menu.g(paramPanelFeatureState.f, textnow.g.i.j);
            paramPanelFeatureState.e.a(localg);
            paramPanelFeatureState.d.a(paramPanelFeatureState.e);
          }
          localx = paramPanelFeatureState.e.a(paramPanelFeatureState.b);
          break label319;
          i1 = 0;
          break label338;
          break;
        }
      }
    }
  }

  private void a(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramPanelFeatureState.a == 0) && (this.k != null) && (this.k.d()))
      b(paramPanelFeatureState.d);
    do
    {
      return;
      if ((paramPanelFeatureState.i) && (paramBoolean))
        a(paramPanelFeatureState.a, paramPanelFeatureState, null);
      paramPanelFeatureState.g = false;
      paramPanelFeatureState.h = false;
      paramPanelFeatureState.i = false;
      paramPanelFeatureState.c = null;
      paramPanelFeatureState.k = true;
    }
    while (this.w != paramPanelFeatureState);
    this.w = null;
  }

  private boolean a(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    if (paramKeyEvent.isSystem());
    while (((!paramPanelFeatureState.g) && (!b(paramPanelFeatureState, paramKeyEvent))) || (paramPanelFeatureState.d == null))
      return false;
    return paramPanelFeatureState.d.performShortcut(paramInt1, paramKeyEvent, 1);
  }

  private void b(android.support.v7.internal.view.menu.i parami)
  {
    if (this.u)
      return;
    this.u = true;
    this.k.i();
    textnow.i.a locala = j();
    if ((locala != null) && (!l()))
      locala.b(8, parami);
    this.u = false;
  }

  private boolean b(ActionBarActivityDelegateBase.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (l())
      return false;
    if (paramPanelFeatureState.g)
      return true;
    if ((this.w != null) && (this.w != paramPanelFeatureState))
      a(this.w, false);
    int i1;
    label60: b localb;
    TypedValue localTypedValue;
    Resources.Theme localTheme1;
    Resources.Theme localTheme2;
    label206: Object localObject;
    if ((paramPanelFeatureState.a == 0) || (paramPanelFeatureState.a == 8))
    {
      i1 = 1;
      if ((i1 != 0) && (this.k != null))
        this.k.h();
      if ((paramPanelFeatureState.d != null) && (!paramPanelFeatureState.l))
        break label443;
      if (paramPanelFeatureState.d == null)
      {
        localb = this.a;
        if (((paramPanelFeatureState.a != 0) && (paramPanelFeatureState.a != 8)) || (this.k == null))
          break label603;
        localTypedValue = new TypedValue();
        localTheme1 = localb.getTheme();
        localTheme1.resolveAttribute(textnow.g.b.f, localTypedValue, true);
        if (localTypedValue.resourceId == 0)
          break label420;
        localTheme2 = localb.getResources().newTheme();
        localTheme2.setTo(localTheme1);
        localTheme2.applyStyle(localTypedValue.resourceId, true);
        localTheme2.resolveAttribute(textnow.g.b.g, localTypedValue, true);
        if (localTypedValue.resourceId != 0)
        {
          if (localTheme2 == null)
          {
            localTheme2 = localb.getResources().newTheme();
            localTheme2.setTo(localTheme1);
          }
          localTheme2.applyStyle(localTypedValue.resourceId, true);
        }
        Resources.Theme localTheme3 = localTheme2;
        if (localTheme3 == null)
          break label603;
        localObject = new ContextThemeWrapper(localb, 0);
        ((Context)localObject).getTheme().setTo(localTheme3);
      }
    }
    while (true)
    {
      android.support.v7.internal.view.menu.i locali = new android.support.v7.internal.view.menu.i((Context)localObject);
      locali.a(this);
      paramPanelFeatureState.a(locali);
      if (paramPanelFeatureState.d == null)
        break;
      if ((i1 != 0) && (this.k != null))
      {
        if (this.l == null)
          this.l = new e(this, (byte)0);
        this.k.a(paramPanelFeatureState.d, this.l);
      }
      paramPanelFeatureState.d.f();
      if (!j().a(paramPanelFeatureState.a, paramPanelFeatureState.d))
      {
        paramPanelFeatureState.a(null);
        if ((i1 == 0) || (this.k == null))
          break;
        this.k.a(null, this.l);
        return false;
        i1 = 0;
        break label60;
        label420: localTheme1.resolveAttribute(textnow.g.b.g, localTypedValue, true);
        localTheme2 = null;
        break label206;
      }
      paramPanelFeatureState.l = false;
      label443: paramPanelFeatureState.d.f();
      if (paramPanelFeatureState.m != null)
      {
        paramPanelFeatureState.d.b(paramPanelFeatureState.m);
        paramPanelFeatureState.m = null;
      }
      if (!j().a(0, null, paramPanelFeatureState.d))
      {
        if ((i1 != 0) && (this.k != null))
          this.k.a(null, this.l);
        paramPanelFeatureState.d.g();
        return false;
      }
      int i2;
      if (paramKeyEvent != null)
      {
        i2 = paramKeyEvent.getDeviceId();
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1)
          break label597;
      }
      label597: for (boolean bool = true; ; bool = false)
      {
        paramPanelFeatureState.j = bool;
        paramPanelFeatureState.d.setQwertyMode(paramPanelFeatureState.j);
        paramPanelFeatureState.d.g();
        paramPanelFeatureState.g = true;
        paramPanelFeatureState.h = false;
        this.w = paramPanelFeatureState;
        return true;
        i2 = -1;
        break;
      }
      label603: localObject = localb;
    }
  }

  private ActionBarActivityDelegateBase.PanelFeatureState c(int paramInt)
  {
    Object localObject = this.v;
    if ((localObject == null) || (localObject.length <= paramInt))
    {
      ActionBarActivityDelegateBase.PanelFeatureState[] arrayOfPanelFeatureState = new ActionBarActivityDelegateBase.PanelFeatureState[paramInt + 1];
      if (localObject != null)
        System.arraycopy(localObject, 0, arrayOfPanelFeatureState, 0, localObject.length);
      this.v = arrayOfPanelFeatureState;
      localObject = arrayOfPanelFeatureState;
    }
    ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState1 = localObject[paramInt];
    if (localPanelFeatureState1 == null)
    {
      ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState2 = new ActionBarActivityDelegateBase.PanelFeatureState(paramInt);
      localObject[paramInt] = localPanelFeatureState2;
      return localPanelFeatureState2;
    }
    return localPanelFeatureState1;
  }

  private void d(int paramInt)
  {
    this.y |= 1 << paramInt;
    if ((!this.x) && (this.o != null))
    {
      av.a(this.o, this.z);
      this.x = true;
    }
  }

  private void n()
  {
    Object localObject1;
    label161: TypedArray localTypedArray;
    TypedValue localTypedValue2;
    if (!this.n)
    {
      if (!this.b)
        break label589;
      TypedValue localTypedValue1 = new TypedValue();
      this.a.getTheme().resolveAttribute(textnow.g.b.f, localTypedValue1, true);
      if (localTypedValue1.resourceId == 0)
        break label581;
      localObject1 = new ContextThemeWrapper(this.a, localTypedValue1.resourceId);
      this.p = ((ViewGroup)LayoutInflater.from((Context)localObject1).inflate(textnow.g.i.o, null));
      this.k = ((t)this.p.findViewById(textnow.g.g.k));
      this.k.a(j());
      if (this.c)
        this.k.a(9);
      if (this.s)
        this.k.a(2);
      if (this.t)
        this.k.a(5);
      ar.b(this.p);
      this.a.a(this.p);
      View localView = this.a.findViewById(16908290);
      localView.setId(-1);
      this.a.findViewById(textnow.g.g.b).setId(16908290);
      if ((localView instanceof FrameLayout))
        ((FrameLayout)localView).setForeground(null);
      if ((this.r != null) && (this.k != null))
      {
        this.k.a(this.r);
        this.r = null;
      }
      localTypedArray = this.a.obtainStyledAttributes(l.bz);
      if (!localTypedArray.hasValue(l.bG))
        break label800;
      localTypedValue2 = new TypedValue();
      localTypedArray.getValue(l.bG, localTypedValue2);
    }
    while (true)
    {
      TypedValue localTypedValue3;
      if (localTypedArray.hasValue(l.bH))
      {
        localTypedValue3 = new TypedValue();
        localTypedArray.getValue(l.bH, localTypedValue3);
      }
      while (true)
      {
        Object localObject2;
        if (localTypedArray.hasValue(l.bE))
        {
          localObject2 = new TypedValue();
          localTypedArray.getValue(l.bE, (TypedValue)localObject2);
        }
        while (true)
        {
          boolean bool = localTypedArray.hasValue(l.bF);
          TypedValue localTypedValue4 = null;
          if (bool)
          {
            localTypedValue4 = new TypedValue();
            localTypedArray.getValue(l.bF, localTypedValue4);
          }
          DisplayMetrics localDisplayMetrics = this.a.getResources().getDisplayMetrics();
          int i1;
          label433: label438: int i2;
          if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
          {
            i1 = 1;
            if (i1 == 0)
              break label696;
            if ((localTypedValue3 == null) || (localTypedValue3.type == 0))
              break label782;
            if (localTypedValue3.type != 5)
              break label703;
            i2 = (int)localTypedValue3.getDimension(localDisplayMetrics);
          }
          while (true)
          {
            label470: label475: int i3;
            if (i1 != 0)
            {
              if ((localObject2 == null) || (((TypedValue)localObject2).type == 0))
                break label776;
              if (((TypedValue)localObject2).type != 5)
                break label743;
              i3 = (int)((TypedValue)localObject2).getDimension(localDisplayMetrics);
            }
            label776: 
            while (true)
            {
              if ((i2 != -1) || (i3 != -1))
                this.a.getWindow().setLayout(i2, i3);
              localTypedArray.recycle();
              m();
              this.n = true;
              ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = c(0);
              if ((!l()) && ((localPanelFeatureState == null) || (localPanelFeatureState.d == null)))
                d(8);
              return;
              label581: localObject1 = this.a;
              break;
              label589: if (this.d);
              for (this.p = ((ViewGroup)LayoutInflater.from(this.a).inflate(textnow.g.i.n, null)); ; this.p = ((ViewGroup)LayoutInflater.from(this.a).inflate(textnow.g.i.m, null)))
              {
                if (Build.VERSION.SDK_INT < 21)
                  break label667;
                av.a(this.p, new aj()
                {
                  public final cs a(cs paramAnonymouscs)
                  {
                    int i = paramAnonymouscs.b();
                    int j = ActionBarActivityDelegateBase.c(ActionBarActivityDelegateBase.this, i);
                    if (i != j)
                      paramAnonymouscs = paramAnonymouscs.a(paramAnonymouscs.a(), j, paramAnonymouscs.c(), paramAnonymouscs.d());
                    return paramAnonymouscs;
                  }
                });
                break;
              }
              label667: ((w)this.p).a(new android.support.v7.internal.widget.x()
              {
                public final void a(Rect paramAnonymousRect)
                {
                  paramAnonymousRect.top = ActionBarActivityDelegateBase.c(ActionBarActivityDelegateBase.this, paramAnonymousRect.top);
                }
              });
              break label161;
              i1 = 0;
              break label433;
              label696: localTypedValue3 = localTypedValue2;
              break label438;
              label703: if (localTypedValue3.type != 6)
                break label782;
              i2 = (int)localTypedValue3.getFraction(localDisplayMetrics.widthPixels, localDisplayMetrics.widthPixels);
              break label470;
              localObject2 = localTypedValue4;
              break label475;
              label743: if (((TypedValue)localObject2).type == 6)
                i3 = (int)((TypedValue)localObject2).getFraction(localDisplayMetrics.heightPixels, localDisplayMetrics.heightPixels);
              else
                i3 = -1;
            }
            label782: i2 = -1;
          }
          localObject2 = null;
        }
        localTypedValue3 = null;
      }
      label800: localTypedValue2 = null;
    }
  }

  public final ActionBar a()
  {
    n();
    textnow.i.b localb = new textnow.i.b(this.a, this.c);
    localb.d(this.A);
    return localb;
  }

  final View a(String paramString, AttributeSet paramAttributeSet)
  {
    int i1;
    if (Build.VERSION.SDK_INT < 21)
    {
      i1 = -1;
      switch (paramString.hashCode())
      {
      default:
      case 1666676343:
      case -339785223:
      case 1601505219:
      case 776382189:
      case -1455429095:
      }
    }
    while (true)
      switch (i1)
      {
      default:
        return null;
        if (paramString.equals("EditText"))
        {
          i1 = 0;
          continue;
          if (paramString.equals("Spinner"))
          {
            i1 = 1;
            continue;
            if (paramString.equals("CheckBox"))
            {
              i1 = 2;
              continue;
              if (paramString.equals("RadioButton"))
              {
                i1 = 3;
                continue;
                if (paramString.equals("CheckedTextView"))
                  i1 = 4;
              }
            }
          }
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    return new TintEditText(this.a, paramAttributeSet);
    return new TintSpinner(this.a, paramAttributeSet);
    return new TintCheckBox(this.a, paramAttributeSet);
    return new TintRadioButton(this.a, paramAttributeSet);
    return new TintCheckedTextView(this.a, paramAttributeSet);
  }

  public final textnow.l.a a(textnow.l.b paramb)
  {
    if (paramb == null)
      throw new IllegalArgumentException("ActionMode callback can not be null.");
    if (this.g != null)
      this.g.b();
    f localf1 = new f(this, paramb);
    ActionBar localActionBar = b();
    if (localActionBar != null)
    {
      this.g = localActionBar.a(localf1);
      if (this.g != null)
        b.c();
    }
    Context localContext;
    boolean bool;
    if (this.g == null)
    {
      if (this.g != null)
        this.g.b();
      f localf2 = new f(this, localf1);
      localContext = i();
      if (this.h == null)
      {
        if (!this.e)
          break label442;
        this.h = new ActionBarContextView(localContext);
        this.i = new PopupWindow(localContext, null, textnow.g.b.i);
        this.i.setContentView(this.h);
        this.i.setWidth(-1);
        TypedValue localTypedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(textnow.g.b.b, localTypedValue, true);
        int i1 = TypedValue.complexToDimensionPixelSize(localTypedValue.data, this.a.getResources().getDisplayMetrics());
        this.h.a(i1);
        this.i.setHeight(-2);
        this.j = new Runnable()
        {
          public final void run()
          {
            ActionBarActivityDelegateBase.this.i.showAtLocation(ActionBarActivityDelegateBase.this.h, 55, 0, 0);
          }
        };
      }
      if (this.h != null)
      {
        this.h.e();
        ActionBarContextView localActionBarContextView = this.h;
        if (this.i != null)
          break label487;
        bool = true;
        label284: textnow.k.b localb = new textnow.k.b(localContext, localActionBarContextView, localf2, bool);
        if (!localf1.a(localb, localb.a()))
          break label493;
        localb.c();
        this.h.a(localb);
        this.h.setVisibility(0);
        this.g = localb;
        if (this.i != null)
          this.a.getWindow().getDecorView().post(this.j);
        this.h.sendAccessibilityEvent(32);
        if (this.h.getParent() != null)
          av.t((View)this.h.getParent());
      }
    }
    while (true)
    {
      if ((this.g != null) && (this.a != null))
        b.c();
      this.g = this.g;
      return this.g;
      label442: ViewStubCompat localViewStubCompat = (ViewStubCompat)this.a.findViewById(textnow.g.g.h);
      if (localViewStubCompat == null)
        break;
      localViewStubCompat.a(LayoutInflater.from(localContext));
      this.h = ((ActionBarContextView)localViewStubCompat.a());
      break;
      label487: bool = false;
      break label284;
      label493: this.g = null;
    }
  }

  public final void a(int paramInt)
  {
    n();
    ViewGroup localViewGroup = (ViewGroup)this.a.findViewById(16908290);
    localViewGroup.removeAllViews();
    this.a.getLayoutInflater().inflate(paramInt, localViewGroup);
    b.f();
  }

  public final void a(int paramInt, Menu paramMenu)
  {
    ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = c(paramInt);
    if (localPanelFeatureState != null)
      a(localPanelFeatureState, false);
    if (paramInt == 8)
    {
      localActionBar = b();
      if (localActionBar != null)
        localActionBar.f(false);
    }
    while (l())
    {
      ActionBar localActionBar;
      return;
    }
    this.a.b(paramInt, paramMenu);
  }

  public final void a(Configuration paramConfiguration)
  {
    if ((this.b) && (this.n))
    {
      ActionBar localActionBar = b();
      if (localActionBar != null)
        localActionBar.d();
    }
  }

  final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.o = ((ViewGroup)this.a.getWindow().getDecorView());
    ActionBar localActionBar;
    if (ad.b(this.a) != null)
    {
      localActionBar = b();
      if (localActionBar == null)
        this.A = true;
    }
    else
    {
      return;
    }
    localActionBar.d(true);
  }

  public final void a(android.support.v7.internal.view.menu.i parami)
  {
    if ((this.k != null) && (this.k.c()) && ((!bi.b(ViewConfiguration.get(this.a))) || (this.k.e())))
    {
      textnow.i.a locala = j();
      if (!this.k.d())
        if ((locala != null) && (!l()))
        {
          if ((this.x) && ((0x1 & this.y) != 0))
          {
            this.o.removeCallbacks(this.z);
            this.z.run();
          }
          ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState3 = c(0);
          if ((localPanelFeatureState3.d != null) && (!localPanelFeatureState3.l) && (locala.a(0, null, localPanelFeatureState3.d)))
          {
            locala.c(8, localPanelFeatureState3.d);
            this.k.f();
          }
        }
      do
      {
        return;
        this.k.g();
      }
      while (l());
      ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState2 = c(0);
      this.a.onPanelClosed(8, localPanelFeatureState2.d);
      return;
    }
    ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState1 = c(0);
    localPanelFeatureState1.k = true;
    a(localPanelFeatureState1, false);
    a(localPanelFeatureState1, null);
  }

  public final void a(View paramView)
  {
    n();
    ViewGroup localViewGroup = (ViewGroup)this.a.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    b.f();
  }

  public final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    n();
    ViewGroup localViewGroup = (ViewGroup)this.a.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    b.f();
  }

  public final void a(CharSequence paramCharSequence)
  {
    if (this.k != null)
    {
      this.k.a(paramCharSequence);
      return;
    }
    if (b() != null)
    {
      b().c(paramCharSequence);
      return;
    }
    this.r = paramCharSequence;
  }

  boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramKeyEvent);
  }

  public final boolean a(int paramInt, View paramView, Menu paramMenu)
  {
    if (paramInt != 0)
      return j().a(paramInt, paramView, paramMenu);
    return false;
  }

  public final boolean a(android.support.v7.internal.view.menu.i parami, MenuItem paramMenuItem)
  {
    textnow.i.a locala = j();
    if ((locala != null) && (!l()))
    {
      ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = a(parami.q());
      if (localPanelFeatureState != null)
        return locala.a(localPanelFeatureState.a, paramMenuItem);
    }
    return false;
  }

  final boolean a(KeyEvent paramKeyEvent)
  {
    if ((this.w != null) && (a(this.w, paramKeyEvent.getKeyCode(), paramKeyEvent, 1)))
      if (this.w != null)
        this.w.h = true;
    boolean bool;
    do
    {
      return true;
      if (this.w != null)
        break;
      ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = c(0);
      b(localPanelFeatureState, paramKeyEvent);
      bool = a(localPanelFeatureState, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
      localPanelFeatureState.g = false;
    }
    while (bool);
    return false;
  }

  public final View b(int paramInt)
  {
    textnow.l.a locala = this.g;
    View localView = null;
    if (locala == null)
    {
      if (j() != null);
      android.support.v7.internal.view.menu.g localg = this.B;
      localView = null;
      if (localg == null)
      {
        ActionBarActivityDelegateBase.PanelFeatureState localPanelFeatureState = c(paramInt);
        a(localPanelFeatureState, null);
        boolean bool = localPanelFeatureState.i;
        localView = null;
        if (bool)
          localView = localPanelFeatureState.c;
      }
    }
    return localView;
  }

  public final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    n();
    ((ViewGroup)this.a.findViewById(16908290)).addView(paramView, paramLayoutParams);
    b.f();
  }

  final boolean b(int paramInt, Menu paramMenu)
  {
    if (paramInt == 8)
    {
      ActionBar localActionBar = b();
      if (localActionBar != null)
        localActionBar.f(true);
      return true;
    }
    return this.a.c(paramInt, paramMenu);
  }

  public final boolean c(int paramInt, Menu paramMenu)
  {
    if (paramInt != 0)
      return j().a(paramInt, paramMenu);
    return false;
  }

  public final void d()
  {
    ActionBar localActionBar = b();
    if (localActionBar != null)
      localActionBar.e(false);
  }

  public final void e()
  {
    ActionBar localActionBar = b();
    if (localActionBar != null)
      localActionBar.e(true);
  }

  public final void f()
  {
    b();
    d(0);
  }

  public final boolean g()
  {
    if (this.g != null)
      this.g.b();
    ActionBar localActionBar;
    do
    {
      return true;
      localActionBar = b();
    }
    while ((localActionBar != null) && (localActionBar.e()));
    return false;
  }

  final int h()
  {
    return textnow.g.b.r;
  }

  void m()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.app.ActionBarActivityDelegateBase
 * JD-Core Version:    0.6.2
 */