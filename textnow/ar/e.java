package textnow.ar;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tremorvideo.sdk.android.videoad.ai;
import com.tremorvideo.sdk.android.videoad.cv;
import com.tremorvideo.sdk.android.videoad.r;
import textnow.av.ap;

public class e extends Dialog
{
  static final float[] a = { 20.0F, 60.0F };
  static final float[] b = { 40.0F, 60.0F };
  static final ViewGroup.LayoutParams c = new ViewGroup.LayoutParams(-2, -2);
  protected c d;
  private String e;
  private ProgressDialog f;
  private WebView g;
  private LinearLayout h;
  private TextView i;
  private boolean j;
  private boolean k;

  protected e(Context paramContext, String paramString, c paramc)
  {
    super(paramContext);
    this.e = paramString;
    this.d = paramc;
    this.j = true;
    this.k = false;
    this.f = ai.a(getContext());
    this.f.setMessage("Loading...");
    this.f.setCancelable(false);
    setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        e.this.d.a();
      }
    });
  }

  public static e a(Context paramContext, String paramString, c paramc)
  {
    int m = r.p();
    if (m < 5)
      return new e(paramContext, paramString, paramc);
    if (m < 7)
      return new g(paramContext, paramString, paramc);
    return new h(paramContext, paramString, paramc);
  }

  public final void a()
  {
    this.j = true;
    this.g = new WebView(getContext());
    this.g.setVerticalScrollBarEnabled(false);
    this.g.setHorizontalScrollBarEnabled(false);
    this.g.setWebViewClient(b());
    this.g.getSettings().setJavaScriptEnabled(true);
    this.g.setWebChromeClient(new WebChromeClient());
    this.g.loadUrl(this.e);
    this.g.setLayoutParams(c);
    this.g.getSettings().setSaveFormData(false);
    this.g.getSettings().setSavePassword(false);
    getWindow().setFlags(1024, 1024);
    show();
    this.f.show();
  }

  protected WebViewClient b()
  {
    return new f(this);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.h = new LinearLayout(getContext());
    this.h.setOrientation(1);
    requestWindowFeature(1);
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(cv.a(ap.a));
    this.i = new TextView(getContext());
    this.i.setText("Facebook");
    this.i.setTextColor(-1);
    this.i.setTypeface(Typeface.DEFAULT_BOLD);
    this.i.setBackgroundColor(-9599820);
    this.i.setPadding(6, 4, 4, 4);
    this.i.setCompoundDrawablePadding(6);
    this.i.setCompoundDrawablesWithIntrinsicBounds(localBitmapDrawable, null, null, null);
    this.h.addView(this.i);
    this.h.addView(this.g);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    addContentView(this.h, localLayoutParams);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84)
      return true;
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onStart()
  {
    super.onStart();
  }

  protected void onStop()
  {
    super.onStop();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.ar.e
 * JD-Core Version:    0.6.2
 */