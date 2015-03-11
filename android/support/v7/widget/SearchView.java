package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.q;
import android.support.v4.widget.f;
import android.support.v7.internal.widget.al;
import android.support.v7.internal.widget.ao;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.util.WeakHashMap;
import textnow.g.b;
import textnow.g.e;
import textnow.g.g;
import textnow.g.l;
import textnow.l.c;

public class SearchView extends LinearLayoutCompat
  implements c
{
  static final bh a;
  private static final boolean c;
  private boolean A;
  private CharSequence B;
  private boolean C;
  private int D;
  private boolean E;
  private CharSequence F;
  private CharSequence G;
  private boolean H;
  private int I;
  private SearchableInfo J;
  private Bundle K;
  private final al L;
  private Runnable M = new Runnable()
  {
    public final void run()
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)SearchView.this.getContext().getSystemService("input_method");
      if (localInputMethodManager != null)
        SearchView.a.a(localInputMethodManager, SearchView.this, 0);
    }
  };
  private final Runnable N = new Runnable()
  {
    public final void run()
    {
      SearchView.a(SearchView.this);
    }
  };
  private Runnable O = new Runnable()
  {
    public final void run()
    {
      if ((SearchView.b(SearchView.this) != null) && ((SearchView.b(SearchView.this) instanceof bn)))
        SearchView.b(SearchView.this).a(null);
    }
  };
  private final WeakHashMap<String, Drawable.ConstantState> P = new WeakHashMap();
  private final View.OnClickListener Q = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == SearchView.e(SearchView.this))
        SearchView.f(SearchView.this);
      do
      {
        do
        {
          return;
          if (paramAnonymousView == SearchView.g(SearchView.this))
          {
            SearchView.h(SearchView.this);
            return;
          }
          if (paramAnonymousView == SearchView.i(SearchView.this))
          {
            SearchView.j(SearchView.this);
            return;
          }
          if (paramAnonymousView != SearchView.k(SearchView.this))
            break;
        }
        while (!SearchView.d());
        SearchView.l(SearchView.this);
        return;
      }
      while (paramAnonymousView != SearchView.m(SearchView.this));
      SearchView.n(SearchView.this);
    }
  };
  private final TextView.OnEditorActionListener R = new TextView.OnEditorActionListener()
  {
    public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
    {
      SearchView.j(SearchView.this);
      return true;
    }
  };
  private final AdapterView.OnItemClickListener S = new AdapterView.OnItemClickListener()
  {
    public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      SearchView.a(SearchView.this, paramAnonymousInt, 0, null);
    }
  };
  private final AdapterView.OnItemSelectedListener T = new AdapterView.OnItemSelectedListener()
  {
    public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      SearchView.a(SearchView.this, paramAnonymousInt);
    }

    public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
    {
    }
  };
  private TextWatcher U = new TextWatcher()
  {
    public final void afterTextChanged(Editable paramAnonymousEditable)
    {
    }

    public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
    }

    public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      SearchView.a(SearchView.this, paramAnonymousCharSequence);
    }
  };
  View.OnKeyListener b = new View.OnKeyListener()
  {
    public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
    {
      if (SearchView.o(SearchView.this) == null);
      do
      {
        return false;
        if ((SearchView.m(SearchView.this).isPopupShowing()) && (SearchView.m(SearchView.this).getListSelection() != -1))
          return SearchView.a(SearchView.this, paramAnonymousView, paramAnonymousInt, paramAnonymousKeyEvent);
      }
      while ((SearchView.SearchAutoComplete.a(SearchView.m(SearchView.this))) || (!q.a(paramAnonymousKeyEvent)) || (paramAnonymousKeyEvent.getAction() != 1) || (paramAnonymousInt != 66));
      paramAnonymousView.cancelLongPress();
      SearchView.a(SearchView.this, 0, null, SearchView.m(SearchView.this).getText().toString());
      return true;
    }
  };
  private final SearchView.SearchAutoComplete d;
  private final View e;
  private final View f;
  private final View g;
  private final ImageView h;
  private final ImageView i;
  private final ImageView j;
  private final ImageView k;
  private final ImageView l;
  private final View m;
  private final int n;
  private final int o;
  private final int p;
  private final Intent q;
  private final Intent r;
  private bj s;
  private bi t;
  private View.OnFocusChangeListener u;
  private bk v;
  private View.OnClickListener w;
  private boolean x;
  private boolean y;
  private f z;

  static
  {
    if (Build.VERSION.SDK_INT >= 8);
    for (boolean bool = true; ; bool = false)
    {
      c = bool;
      a = new bh();
      return;
    }
  }

  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.v);
  }

  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ao localao = ao.a(paramContext, paramAttributeSet, l.aQ, paramInt, 0);
    this.L = localao.c();
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(localao.f(l.aZ, 0), this, true);
    this.d = ((SearchView.SearchAutoComplete)findViewById(g.x));
    this.d.a(this);
    this.e = findViewById(g.t);
    this.f = findViewById(g.w);
    this.g = findViewById(g.B);
    this.h = ((ImageView)findViewById(g.r));
    this.i = ((ImageView)findViewById(g.u));
    this.j = ((ImageView)findViewById(g.s));
    this.k = ((ImageView)findViewById(g.y));
    this.l = ((ImageView)findViewById(g.v));
    this.f.setBackgroundDrawable(localao.a(l.ba));
    this.g.setBackgroundDrawable(localao.a(l.bd));
    this.n = localao.f(l.bc, 0);
    this.h.setImageResource(this.n);
    this.i.setImageDrawable(localao.a(l.aX));
    this.j.setImageDrawable(localao.a(l.aV));
    this.k.setImageDrawable(localao.a(l.bf));
    this.l.setImageDrawable(localao.a(l.bc));
    this.o = localao.f(l.be, 0);
    this.p = localao.f(l.aW, 0);
    this.h.setOnClickListener(this.Q);
    this.j.setOnClickListener(this.Q);
    this.i.setOnClickListener(this.Q);
    this.k.setOnClickListener(this.Q);
    this.d.setOnClickListener(this.Q);
    this.d.addTextChangedListener(this.U);
    this.d.setOnEditorActionListener(this.R);
    this.d.setOnItemClickListener(this.S);
    this.d.setOnItemSelectedListener(this.T);
    this.d.setOnKeyListener(this.b);
    this.d.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (SearchView.c(SearchView.this) != null)
          SearchView.c(SearchView.this).onFocusChange(SearchView.this, paramAnonymousBoolean);
      }
    });
    boolean bool = localao.a(l.aY, true);
    if (this.x != bool)
    {
      this.x = bool;
      a(bool);
      l();
    }
    int i1 = localao.d(l.aU, -1);
    if (i1 != -1)
    {
      this.D = i1;
      requestLayout();
    }
    CharSequence localCharSequence = localao.b(l.bb);
    if (!TextUtils.isEmpty(localCharSequence))
    {
      this.B = localCharSequence;
      l();
    }
    int i2 = localao.a(l.aS, -1);
    if (i2 != -1)
      this.d.setImeOptions(i2);
    int i3 = localao.a(l.aT, -1);
    if (i3 != -1)
      this.d.setInputType(i3);
    setFocusable(localao.a(l.aR, true));
    localao.b();
    this.q = new Intent("android.speech.action.WEB_SEARCH");
    this.q.addFlags(268435456);
    this.q.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.r = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.r.addFlags(268435456);
    this.m = findViewById(this.d.getDropDownAnchor());
    if (this.m != null)
    {
      if (Build.VERSION.SDK_INT < 11)
        break label844;
      this.m.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
      {
        public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
        {
          SearchView.d(SearchView.this);
        }
      });
    }
    while (true)
    {
      a(this.x);
      l();
      return;
      label844: this.m.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public final void onGlobalLayout()
        {
          SearchView.d(SearchView.this);
        }
      });
    }
  }

  private Intent a(Cursor paramCursor, int paramInt, String paramString)
  {
    try
    {
      str1 = bn.a(paramCursor, "suggest_intent_action");
      if ((str1 == null) && (Build.VERSION.SDK_INT >= 8))
      {
        str1 = this.J.getSuggestIntentAction();
        break label211;
        str2 = bn.a(paramCursor, "suggest_intent_data");
        if ((c) && (str2 == null))
          str2 = this.J.getSuggestIntentData();
        if (str2 == null)
          break label224;
        String str3 = bn.a(paramCursor, "suggest_intent_data_id");
        if (str3 == null)
          break label224;
        str2 = str2 + "/" + Uri.encode(str3);
        break label224;
        while (true)
        {
          String str4 = bn.a(paramCursor, "suggest_intent_query");
          return a(str1, (Uri)localObject, bn.a(paramCursor, "suggest_intent_extra_data"), str4, paramInt, paramString);
          Uri localUri = Uri.parse(str2);
          localObject = localUri;
        }
      }
    }
    catch (RuntimeException localRuntimeException1)
    {
      while (true)
      {
        String str1;
        String str2;
        Object localObject;
        try
        {
          int i2 = paramCursor.getPosition();
          i1 = i2;
          new StringBuilder().append("Search suggestions cursor at row ").append(i1).append(" returned exception.").toString();
          return null;
        }
        catch (RuntimeException localRuntimeException2)
        {
          int i1 = -1;
          continue;
        }
        label211: if (str1 == null)
        {
          str1 = "android.intent.action.SEARCH";
          continue;
          label224: if (str2 == null)
            localObject = null;
        }
      }
    }
  }

  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    Intent localIntent = new Intent(paramString1);
    localIntent.addFlags(268435456);
    if (paramUri != null)
      localIntent.setData(paramUri);
    localIntent.putExtra("user_query", this.G);
    if (paramString3 != null)
      localIntent.putExtra("query", paramString3);
    if (paramString2 != null)
      localIntent.putExtra("intent_extra_data_key", paramString2);
    if (this.K != null)
      localIntent.putExtra("app_data", this.K);
    if (paramInt != 0)
    {
      localIntent.putExtra("action_key", paramInt);
      localIntent.putExtra("action_msg", paramString4);
    }
    if (c)
      localIntent.setComponent(this.J.getSearchActivity());
    return localIntent;
  }

  private void a(int paramInt, String paramString1, String paramString2)
  {
    Intent localIntent = a("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(localIntent);
  }

  private void a(Intent paramIntent)
  {
    if (paramIntent == null)
      return;
    try
    {
      getContext().startActivity(paramIntent);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      new StringBuilder().append("Failed launch activity: ").append(paramIntent).toString();
    }
  }

  private void a(boolean paramBoolean)
  {
    boolean bool1 = true;
    int i1 = 8;
    this.y = paramBoolean;
    int i2;
    boolean bool2;
    label33: int i3;
    if (paramBoolean)
    {
      i2 = 0;
      if (TextUtils.isEmpty(this.d.getText()))
        break label112;
      bool2 = bool1;
      this.h.setVisibility(i2);
      b(bool2);
      View localView = this.e;
      if (!paramBoolean)
        break label118;
      i3 = i1;
      label61: localView.setVisibility(i3);
      ImageView localImageView = this.l;
      if (!this.x)
        break label124;
      label81: localImageView.setVisibility(i1);
      h();
      if (bool2)
        break label129;
    }
    while (true)
    {
      e(bool1);
      g();
      return;
      i2 = i1;
      break;
      label112: bool2 = false;
      break label33;
      label118: i3 = 0;
      break label61;
      label124: i1 = 0;
      break label81;
      label129: bool1 = false;
    }
  }

  private boolean a(int paramInt)
  {
    boolean bool1;
    if (this.v != null)
    {
      boolean bool2 = this.v.b();
      bool1 = false;
      if (bool2);
    }
    else
    {
      Cursor localCursor = this.z.a();
      if ((localCursor != null) && (localCursor.moveToPosition(paramInt)))
        a(a(localCursor, 0, null));
      d(false);
      this.d.dismissDropDown();
      bool1 = true;
    }
    return bool1;
  }

  static boolean a(Context paramContext)
  {
    return paramContext.getResources().getConfiguration().orientation == 2;
  }

  private CharSequence b(CharSequence paramCharSequence)
  {
    if (!this.x)
      return paramCharSequence;
    Drawable localDrawable = this.L.a(this.n);
    int i1 = (int)(1.25D * this.d.getTextSize());
    localDrawable.setBounds(0, 0, i1, i1);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
    localSpannableStringBuilder.append(paramCharSequence);
    localSpannableStringBuilder.setSpan(new ImageSpan(localDrawable), 1, 2, 33);
    return localSpannableStringBuilder;
  }

  private void b(boolean paramBoolean)
  {
    int i1 = 8;
    if ((this.A) && (f()) && (hasFocus()) && ((paramBoolean) || (!this.E)))
      i1 = 0;
    this.i.setVisibility(i1);
  }

  private void c(CharSequence paramCharSequence)
  {
    this.d.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.d;
    if (TextUtils.isEmpty(paramCharSequence));
    for (int i1 = 0; ; i1 = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i1);
      return;
    }
  }

  private void d(boolean paramBoolean)
  {
    if (paramBoolean)
      post(this.M);
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      removeCallbacks(this.M);
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    }
    while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
  }

  private int e()
  {
    return getContext().getResources().getDimensionPixelSize(e.f);
  }

  private void e(boolean paramBoolean)
  {
    int i1;
    if ((this.E) && (!this.y) && (paramBoolean))
    {
      i1 = 0;
      this.i.setVisibility(8);
    }
    while (true)
    {
      this.k.setVisibility(i1);
      return;
      i1 = 8;
    }
  }

  private boolean f()
  {
    return ((this.A) || (this.E)) && (!this.y);
  }

  private void g()
  {
    int i1 = 8;
    if ((f()) && ((this.i.getVisibility() == 0) || (this.k.getVisibility() == 0)))
      i1 = 0;
    this.g.setVisibility(i1);
  }

  private void h()
  {
    int i1 = 1;
    int i2;
    label35: int i3;
    label47: Drawable localDrawable;
    if (!TextUtils.isEmpty(this.d.getText()))
    {
      i2 = i1;
      if ((i2 == 0) && ((!this.x) || (this.H)))
        break label85;
      ImageView localImageView = this.j;
      i3 = 0;
      if (i1 == 0)
        break label90;
      localImageView.setVisibility(i3);
      localDrawable = this.j.getDrawable();
      if (i2 == 0)
        break label97;
    }
    label85: label90: label97: for (int[] arrayOfInt = ENABLED_STATE_SET; ; arrayOfInt = EMPTY_STATE_SET)
    {
      localDrawable.setState(arrayOfInt);
      return;
      i2 = 0;
      break;
      i1 = 0;
      break label35;
      i3 = 8;
      break label47;
    }
  }

  private void i()
  {
    post(this.N);
  }

  private void l()
  {
    if (this.B != null)
      this.d.setHint(b(this.B));
    String str;
    do
    {
      return;
      if ((!c) || (this.J == null))
        break;
      int i1 = this.J.getHintId();
      str = null;
      if (i1 != 0)
        str = getContext().getString(i1);
    }
    while (str == null);
    this.d.setHint(b(str));
    return;
    this.d.setHint(b(""));
  }

  private void m()
  {
    a(false);
    this.d.requestFocus();
    d(true);
    if (this.w != null)
      this.w.onClick(this);
  }

  private void n()
  {
    a.a(this.d);
    a.b(this.d);
  }

  public final void a()
  {
    if (this.H)
      return;
    this.H = true;
    this.I = this.d.getImeOptions();
    this.d.setImeOptions(0x2000000 | this.I);
    this.d.setText("");
    m();
  }

  final void a(CharSequence paramCharSequence)
  {
    c(paramCharSequence);
  }

  public final void b()
  {
    this.d.setText("");
    if ("" != null)
    {
      this.d.setSelection(this.d.length());
      this.G = "";
    }
    clearFocus();
    a(true);
    this.d.setImeOptions(this.I);
    this.H = false;
  }

  final void c()
  {
    a(this.y);
    i();
    if (this.d.hasFocus())
      n();
  }

  public void clearFocus()
  {
    this.C = true;
    d(false);
    super.clearFocus();
    this.d.clearFocus();
    this.C = false;
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.N);
    post(this.O);
    super.onDetachedFromWindow();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.y)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    switch (i1)
    {
    default:
    case -2147483648:
    case 1073741824:
    case 0:
    }
    while (true)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), paramInt2);
      return;
      if (this.D > 0)
      {
        i2 = Math.min(this.D, i2);
      }
      else
      {
        i2 = Math.min(e(), i2);
        continue;
        if (this.D > 0)
        {
          i2 = Math.min(this.D, i2);
          continue;
          if (this.D > 0)
            i2 = this.D;
          else
            i2 = e();
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    i();
  }

  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (this.C);
    while (!isFocusable())
      return false;
    if (!this.y)
    {
      boolean bool = this.d.requestFocus(paramInt, paramRect);
      if (bool)
        a(false);
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView
 * JD-Core Version:    0.6.2
 */