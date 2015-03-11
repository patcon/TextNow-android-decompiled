package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.q;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.util.WeakHashMap;
import textnow.g.f;
import textnow.g.h;
import textnow.g.k;

public class SearchView extends LinearLayout
  implements textnow.i.c
{
  static final a a = new a();
  private CharSequence A;
  private boolean B;
  private int C;
  private SearchableInfo D;
  private Bundle E;
  private Runnable F = new Runnable()
  {
    public final void run()
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)SearchView.this.getContext().getSystemService("input_method");
      if (localInputMethodManager != null)
        SearchView.a.a(localInputMethodManager, SearchView.this, 0);
    }
  };
  private Runnable G = new Runnable()
  {
    public final void run()
    {
      SearchView.a(SearchView.this);
    }
  };
  private Runnable H = new Runnable()
  {
    public final void run()
    {
      if ((SearchView.b(SearchView.this) != null) && ((SearchView.b(SearchView.this) instanceof e)))
        SearchView.b(SearchView.this).a(null);
    }
  };
  private final Intent I;
  private final Intent J;
  private final WeakHashMap<String, Drawable.ConstantState> K = new WeakHashMap();
  private final View.OnClickListener L = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView == SearchView.e(SearchView.this))
        SearchView.f(SearchView.this);
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
        if (paramAnonymousView == SearchView.k(SearchView.this))
        {
          SearchView.l(SearchView.this);
          return;
        }
      }
      while (paramAnonymousView != SearchView.m(SearchView.this));
      SearchView.n(SearchView.this);
    }
  };
  private final TextView.OnEditorActionListener M = new TextView.OnEditorActionListener()
  {
    public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
    {
      SearchView.j(SearchView.this);
      return true;
    }
  };
  private final AdapterView.OnItemClickListener N = new AdapterView.OnItemClickListener()
  {
    public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      SearchView.a(SearchView.this, paramAnonymousInt, 0, null);
    }
  };
  private final AdapterView.OnItemSelectedListener O = new AdapterView.OnItemSelectedListener()
  {
    public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      SearchView.a(SearchView.this, paramAnonymousInt);
    }

    public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
    {
    }
  };
  private TextWatcher P = new TextWatcher()
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
  private c c;
  private b d;
  private View.OnFocusChangeListener e;
  private d f;
  private View.OnClickListener g;
  private boolean h;
  private boolean i;
  private android.support.v4.widget.c j;
  private View k;
  private View l;
  private View m;
  private View n;
  private ImageView o;
  private View p;
  private View q;
  private SearchView.SearchAutoComplete r;
  private View s;
  private ImageView t;
  private boolean u;
  private CharSequence v;
  private boolean w;
  private int x;
  private boolean y;
  private CharSequence z;

  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(h.q, this, true);
    this.k = findViewById(f.u);
    this.r = ((SearchView.SearchAutoComplete)findViewById(f.A));
    this.r.a(this);
    this.p = findViewById(f.w);
    this.m = findViewById(f.z);
    this.n = findViewById(f.E);
    this.l = findViewById(f.x);
    this.o = ((ImageView)findViewById(f.v));
    this.q = findViewById(f.B);
    this.t = ((ImageView)findViewById(f.y));
    this.k.setOnClickListener(this.L);
    this.o.setOnClickListener(this.L);
    this.l.setOnClickListener(this.L);
    this.q.setOnClickListener(this.L);
    this.r.setOnClickListener(this.L);
    this.r.addTextChangedListener(this.P);
    this.r.setOnEditorActionListener(this.M);
    this.r.setOnItemClickListener(this.N);
    this.r.setOnItemSelectedListener(this.O);
    this.r.setOnKeyListener(this.b);
    this.r.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (SearchView.c(SearchView.this) != null)
          SearchView.c(SearchView.this).onFocusChange(SearchView.this, paramAnonymousBoolean);
      }
    });
    TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, k.m, 0, 0);
    boolean bool1 = localTypedArray1.getBoolean(3, true);
    if (this.h != bool1)
    {
      this.h = bool1;
      a(bool1);
      i();
    }
    int i1 = localTypedArray1.getDimensionPixelSize(0, -1);
    if (i1 != -1)
    {
      this.x = i1;
      requestLayout();
    }
    CharSequence localCharSequence = localTypedArray1.getText(4);
    if (!TextUtils.isEmpty(localCharSequence))
    {
      this.v = localCharSequence;
      i();
    }
    int i2 = localTypedArray1.getInt(2, -1);
    if (i2 != -1)
      this.r.setImeOptions(i2);
    int i3 = localTypedArray1.getInt(1, -1);
    if (i3 != -1)
      this.r.setInputType(i3);
    localTypedArray1.recycle();
    TypedArray localTypedArray2 = paramContext.obtainStyledAttributes(paramAttributeSet, k.p, 0, 0);
    boolean bool2 = localTypedArray2.getBoolean(0, true);
    localTypedArray2.recycle();
    setFocusable(bool2);
    this.I = new Intent("android.speech.action.WEB_SEARCH");
    this.I.addFlags(268435456);
    this.I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.J = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.J.addFlags(268435456);
    this.s = findViewById(this.r.getDropDownAnchor());
    if (this.s != null)
    {
      if (Build.VERSION.SDK_INT < 11)
        break label688;
      this.s.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
      {
        public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
        {
          SearchView.d(SearchView.this);
        }
      });
    }
    while (true)
    {
      a(this.h);
      i();
      return;
      label688: this.s.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
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
      str1 = e.a(paramCursor, "suggest_intent_action");
      if (str1 == null)
      {
        str1 = this.D.getSuggestIntentAction();
        break label197;
        str2 = e.a(paramCursor, "suggest_intent_data");
        if (str2 == null)
          str2 = this.D.getSuggestIntentData();
        if (str2 == null)
          break label210;
        String str3 = e.a(paramCursor, "suggest_intent_data_id");
        if (str3 == null)
          break label210;
        str2 = str2 + "/" + Uri.encode(str3);
        break label210;
        while (true)
        {
          String str4 = e.a(paramCursor, "suggest_intent_query");
          return a(str1, (Uri)localObject, e.a(paramCursor, "suggest_intent_extra_data"), str4, paramInt, paramString);
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
        label197: if (str1 == null)
        {
          str1 = "android.intent.action.SEARCH";
          continue;
          label210: if (str2 == null)
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
    localIntent.putExtra("user_query", this.A);
    if (paramString3 != null)
      localIntent.putExtra("query", paramString3);
    if (paramString2 != null)
      localIntent.putExtra("intent_extra_data_key", paramString2);
    if (this.E != null)
      localIntent.putExtra("app_data", this.E);
    if (paramInt != 0)
    {
      localIntent.putExtra("action_key", paramInt);
      localIntent.putExtra("action_msg", paramString4);
    }
    localIntent.setComponent(this.D.getSearchActivity());
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
    this.i = paramBoolean;
    int i2;
    boolean bool2;
    label33: int i3;
    if (paramBoolean)
    {
      i2 = 0;
      if (TextUtils.isEmpty(this.r.getText()))
        break label112;
      bool2 = bool1;
      this.k.setVisibility(i2);
      b(bool2);
      View localView = this.p;
      if (!paramBoolean)
        break label118;
      i3 = i1;
      label61: localView.setVisibility(i3);
      ImageView localImageView = this.t;
      if (!this.h)
        break label124;
      label81: localImageView.setVisibility(i1);
      g();
      if (bool2)
        break label129;
    }
    while (true)
    {
      d(bool1);
      f();
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
    if (this.f != null)
    {
      boolean bool2 = this.f.b();
      bool1 = false;
      if (bool2);
    }
    else
    {
      Cursor localCursor = this.j.a();
      if ((localCursor != null) && (localCursor.moveToPosition(paramInt)))
        a(a(localCursor, 0, null));
      c(false);
      this.r.dismissDropDown();
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
    if (!this.h)
      return paramCharSequence;
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
    localSpannableStringBuilder.append(paramCharSequence);
    Resources localResources = getContext().getResources();
    TypedValue localTypedValue = new TypedValue();
    getContext().getTheme().resolveAttribute(textnow.g.c.l, localTypedValue, true);
    Drawable localDrawable = localResources.getDrawable(localTypedValue.resourceId);
    int i1 = (int)(1.25D * this.r.getTextSize());
    localDrawable.setBounds(0, 0, i1, i1);
    localSpannableStringBuilder.setSpan(new ImageSpan(localDrawable), 1, 2, 33);
    return localSpannableStringBuilder;
  }

  private void b(boolean paramBoolean)
  {
    int i1 = 8;
    if ((this.u) && (e()) && (hasFocus()) && ((paramBoolean) || (!this.y)))
      i1 = 0;
    this.l.setVisibility(i1);
  }

  private void c(CharSequence paramCharSequence)
  {
    this.r.setText(paramCharSequence);
    SearchView.SearchAutoComplete localSearchAutoComplete = this.r;
    if (TextUtils.isEmpty(paramCharSequence));
    for (int i1 = 0; ; i1 = paramCharSequence.length())
    {
      localSearchAutoComplete.setSelection(i1);
      return;
    }
  }

  private void c(boolean paramBoolean)
  {
    if (paramBoolean)
      post(this.F);
    InputMethodManager localInputMethodManager;
    do
    {
      return;
      removeCallbacks(this.F);
      localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    }
    while (localInputMethodManager == null);
    localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
  }

  private int d()
  {
    return getContext().getResources().getDimensionPixelSize(textnow.g.e.f);
  }

  private void d(boolean paramBoolean)
  {
    int i1;
    if ((this.y) && (!this.i) && (paramBoolean))
    {
      i1 = 0;
      this.l.setVisibility(8);
    }
    while (true)
    {
      this.q.setVisibility(i1);
      return;
      i1 = 8;
    }
  }

  private boolean e()
  {
    return ((this.u) || (this.y)) && (!this.i);
  }

  private void f()
  {
    int i1 = 8;
    if ((e()) && ((this.l.getVisibility() == 0) || (this.q.getVisibility() == 0)))
      i1 = 0;
    this.n.setVisibility(i1);
  }

  private void g()
  {
    int i1 = 1;
    int i2;
    label35: int i3;
    label47: Drawable localDrawable;
    if (!TextUtils.isEmpty(this.r.getText()))
    {
      i2 = i1;
      if ((i2 == 0) && ((!this.h) || (this.B)))
        break label85;
      ImageView localImageView = this.o;
      i3 = 0;
      if (i1 == 0)
        break label90;
      localImageView.setVisibility(i3);
      localDrawable = this.o.getDrawable();
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

  private void h()
  {
    post(this.G);
  }

  private void i()
  {
    if (this.v != null)
      this.r.setHint(b(this.v));
    String str;
    do
    {
      return;
      if (this.D == null)
        break;
      int i1 = this.D.getHintId();
      str = null;
      if (i1 != 0)
        str = getContext().getString(i1);
    }
    while (str == null);
    this.r.setHint(b(str));
    return;
    this.r.setHint(b(""));
  }

  private void j()
  {
    a(false);
    this.r.requestFocus();
    c(true);
    if (this.g != null)
      this.g.onClick(this);
  }

  private void k()
  {
    a.a(this.r);
    a.b(this.r);
  }

  public final void a()
  {
    if (this.B)
      return;
    this.B = true;
    this.C = this.r.getImeOptions();
    this.r.setImeOptions(0x2000000 | this.C);
    this.r.setText("");
    j();
  }

  final void a(CharSequence paramCharSequence)
  {
    c(paramCharSequence);
  }

  public final void b()
  {
    clearFocus();
    a(true);
    this.r.setImeOptions(this.C);
    this.B = false;
  }

  final void c()
  {
    a(this.i);
    h();
    if (this.r.hasFocus())
      k();
  }

  public void clearFocus()
  {
    this.w = true;
    c(false);
    super.clearFocus();
    this.r.clearFocus();
    this.w = false;
  }

  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.G);
    post(this.H);
    super.onDetachedFromWindow();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.D == null)
      return false;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.i)
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
      if (this.x > 0)
      {
        i2 = Math.min(this.x, i2);
      }
      else
      {
        i2 = Math.min(d(), i2);
        continue;
        if (this.x > 0)
        {
          i2 = Math.min(this.x, i2);
          continue;
          if (this.x > 0)
            i2 = this.x;
          else
            i2 = d();
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    h();
  }

  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (this.w);
    while (!isFocusable())
      return false;
    if (!this.i)
    {
      boolean bool = this.r.requestFocus(paramInt, paramRect);
      if (bool)
        a(false);
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView
 * JD-Core Version:    0.6.2
 */