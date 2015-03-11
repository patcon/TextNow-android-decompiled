package net.hockeyapp.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public final class b extends LinearLayout
{
  private LinearLayout a;
  private ScrollView b;
  private LinearLayout c;
  private LinearLayout d;
  private LinearLayout e;
  private ListView f;

  public b(Context paramContext)
  {
    super(paramContext);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
    setBackgroundColor(-1);
    setLayoutParams(localLayoutParams1);
    this.a = new LinearLayout(paramContext);
    this.a.setId(131090);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -1);
    int i = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    localLayoutParams2.gravity = 49;
    this.a.setLayoutParams(localLayoutParams2);
    this.a.setPadding(0, i, 0, i);
    this.a.setOrientation(1);
    addView(this.a);
    this.b = new ScrollView(paramContext);
    this.b.setId(131095);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(-1, -1);
    int j = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    localLayoutParams3.gravity = 17;
    this.b.setLayoutParams(localLayoutParams3);
    this.b.setPadding(j, j, j, j);
    this.a.addView(this.b);
    this.c = new LinearLayout(paramContext);
    this.c.setId(131091);
    LinearLayout.LayoutParams localLayoutParams4 = new LinearLayout.LayoutParams(-1, -1);
    int k = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    localLayoutParams4.gravity = 3;
    this.c.setLayoutParams(localLayoutParams4);
    this.c.setPadding(k, k, k, k);
    this.c.setGravity(48);
    this.c.setOrientation(1);
    this.b.addView(this.c);
    this.d = new LinearLayout(paramContext);
    this.d.setId(131093);
    LinearLayout.LayoutParams localLayoutParams5 = new LinearLayout.LayoutParams(-1, -1);
    int m = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    localLayoutParams5.gravity = 17;
    this.d.setLayoutParams(localLayoutParams5);
    this.d.setPadding(m, m, m, m);
    this.d.setGravity(48);
    this.d.setOrientation(1);
    this.a.addView(this.d);
    EditText localEditText1 = new EditText(paramContext);
    localEditText1.setId(8194);
    LinearLayout.LayoutParams localLayoutParams6 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams6.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics()));
    localEditText1.setLayoutParams(localLayoutParams6);
    localEditText1.setImeOptions(5);
    localEditText1.setInputType(16385);
    localEditText1.setSingleLine(true);
    localEditText1.setTextColor(-7829368);
    localEditText1.setTextSize(2, 15.0F);
    localEditText1.setTypeface(null, 0);
    localEditText1.setHint("Name");
    localEditText1.setHintTextColor(-3355444);
    a(paramContext, localEditText1);
    this.c.addView(localEditText1);
    EditText localEditText2 = new EditText(paramContext);
    localEditText2.setId(8196);
    LinearLayout.LayoutParams localLayoutParams7 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams7.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics()));
    localEditText2.setLayoutParams(localLayoutParams7);
    localEditText2.setImeOptions(5);
    localEditText2.setInputType(33);
    localEditText2.setSingleLine(true);
    localEditText2.setTextColor(-7829368);
    localEditText2.setTextSize(2, 15.0F);
    localEditText2.setTypeface(null, 0);
    localEditText2.setHint("Email");
    localEditText2.setHintTextColor(-3355444);
    a(paramContext, localEditText2);
    this.c.addView(localEditText2);
    EditText localEditText3 = new EditText(paramContext);
    localEditText3.setId(8198);
    LinearLayout.LayoutParams localLayoutParams8 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams8.setMargins(0, 0, 0, (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics()));
    localEditText3.setLayoutParams(localLayoutParams8);
    localEditText3.setImeOptions(5);
    localEditText3.setInputType(16433);
    localEditText3.setSingleLine(true);
    localEditText3.setTextColor(-7829368);
    localEditText3.setTextSize(2, 15.0F);
    localEditText3.setTypeface(null, 0);
    localEditText3.setHint("Subject");
    localEditText3.setHintTextColor(-3355444);
    a(paramContext, localEditText3);
    this.c.addView(localEditText3);
    EditText localEditText4 = new EditText(paramContext);
    localEditText4.setId(8200);
    LinearLayout.LayoutParams localLayoutParams9 = new LinearLayout.LayoutParams(-1, -2);
    int n = (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics());
    int i1 = (int)TypedValue.applyDimension(1, 100.0F, getResources().getDisplayMetrics());
    localLayoutParams9.setMargins(0, 0, 0, n);
    localEditText4.setLayoutParams(localLayoutParams9);
    localEditText4.setImeOptions(5);
    localEditText4.setInputType(16385);
    localEditText4.setSingleLine(false);
    localEditText4.setTextColor(-7829368);
    localEditText4.setTextSize(2, 15.0F);
    localEditText4.setTypeface(null, 0);
    localEditText4.setMinimumHeight(i1);
    localEditText4.setHint("Message");
    localEditText4.setHintTextColor(-3355444);
    a(paramContext, localEditText4);
    this.c.addView(localEditText4);
    Button localButton1 = new Button(paramContext);
    localButton1.setId(8201);
    int i2 = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    int i3 = (int)TypedValue.applyDimension(1, 30.0F, getResources().getDisplayMetrics());
    int i4 = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    LinearLayout.LayoutParams localLayoutParams10 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams10.setMargins(0, 0, 0, i4);
    localLayoutParams10.gravity = 1;
    localButton1.setLayoutParams(localLayoutParams10);
    localButton1.setBackgroundDrawable(a());
    localButton1.setPadding(i3, i2, i3, i2);
    localButton1.setText("Send feedback");
    localButton1.setTextColor(-1);
    localButton1.setTextSize(2, 15.0F);
    this.c.addView(localButton1);
    TextView localTextView = new TextView(paramContext);
    localTextView.setId(8192);
    LinearLayout.LayoutParams localLayoutParams11 = new LinearLayout.LayoutParams(-2, -2);
    int i5 = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    localLayoutParams11.setMargins(0, 0, 0, 0);
    localTextView.setLayoutParams(localLayoutParams11);
    localTextView.setPadding(0, i5, 0, i5);
    localTextView.setEllipsize(TextUtils.TruncateAt.END);
    localTextView.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
    localTextView.setSingleLine(true);
    localTextView.setText("Last Updated: ");
    localTextView.setTextColor(-7829368);
    localTextView.setTextSize(2, 15.0F);
    localTextView.setTypeface(null, 0);
    this.d.addView(localTextView);
    this.e = new LinearLayout(paramContext);
    this.e.setId(131092);
    LinearLayout.LayoutParams localLayoutParams12 = new LinearLayout.LayoutParams(-1, -2);
    int i6 = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    localLayoutParams12.gravity = 3;
    this.e.setLayoutParams(localLayoutParams12);
    this.e.setPadding(0, i6, 0, i6);
    this.e.setGravity(48);
    this.e.setOrientation(0);
    this.d.addView(this.e);
    Button localButton2 = new Button(paramContext);
    localButton2.setId(131088);
    int i7 = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    int i8 = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    int i9 = (int)TypedValue.applyDimension(1, 5.0F, getResources().getDisplayMetrics());
    LinearLayout.LayoutParams localLayoutParams13 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams13.setMargins(0, 0, i9, i8);
    localLayoutParams13.gravity = 1;
    localLayoutParams13.weight = 1.0F;
    localButton2.setLayoutParams(localLayoutParams13);
    localButton2.setBackgroundDrawable(a());
    localButton2.setPadding(0, i7, 0, i7);
    localButton2.setGravity(17);
    localButton2.setText("Add a Response");
    localButton2.setTextColor(-1);
    localButton2.setTextSize(2, 15.0F);
    this.e.addView(localButton2);
    Button localButton3 = new Button(paramContext);
    localButton3.setId(131089);
    int i10 = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    int i11 = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    int i12 = (int)TypedValue.applyDimension(1, 5.0F, getResources().getDisplayMetrics());
    LinearLayout.LayoutParams localLayoutParams14 = new LinearLayout.LayoutParams(-1, -2);
    localLayoutParams14.setMargins(i12, 0, 0, i11);
    localLayoutParams14.gravity = 1;
    localButton3.setLayoutParams(localLayoutParams14);
    localButton3.setBackgroundDrawable(a());
    localButton3.setPadding(0, i10, 0, i10);
    localButton3.setGravity(17);
    localButton3.setText("Refresh");
    localButton3.setTextColor(-1);
    localButton3.setTextSize(2, 15.0F);
    localLayoutParams14.weight = 1.0F;
    this.e.addView(localButton3);
    this.f = new ListView(paramContext);
    this.f.setId(131094);
    LinearLayout.LayoutParams localLayoutParams15 = new LinearLayout.LayoutParams(-1, -1);
    int i13 = (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics());
    this.f.setLayoutParams(localLayoutParams15);
    this.f.setPadding(0, i13, 0, i13);
    this.d.addView(this.f);
  }

  private static Drawable a()
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { -16842919 }, new ColorDrawable(-16777216));
    localStateListDrawable.addState(new int[] { -16842919, 16842908 }, new ColorDrawable(-12303292));
    localStateListDrawable.addState(new int[] { 16842919 }, new ColorDrawable(-7829368));
    return localStateListDrawable;
  }

  private void a(Context paramContext, EditText paramEditText)
  {
    if (Build.VERSION.SDK_INT < 11)
    {
      int i = (int)(10.0F * paramContext.getResources().getDisplayMetrics().density);
      ShapeDrawable localShapeDrawable1 = new ShapeDrawable(new RectShape());
      Paint localPaint1 = localShapeDrawable1.getPaint();
      localPaint1.setColor(-1);
      localPaint1.setStyle(Paint.Style.FILL_AND_STROKE);
      localPaint1.setStrokeWidth(1.0F);
      localShapeDrawable1.setPadding(i, i, i, i);
      int j = (int)(1.5D * paramContext.getResources().getDisplayMetrics().density);
      ShapeDrawable localShapeDrawable2 = new ShapeDrawable(new RectShape());
      Paint localPaint2 = localShapeDrawable2.getPaint();
      localPaint2.setColor(-12303292);
      localPaint2.setStyle(Paint.Style.FILL_AND_STROKE);
      localPaint2.setStrokeWidth(1.0F);
      localShapeDrawable2.setPadding(0, 0, 0, j);
      paramEditText.setBackgroundDrawable(new LayerDrawable(new Drawable[] { localShapeDrawable2, localShapeDrawable1 }));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     net.hockeyapp.android.views.b
 * JD-Core Version:    0.6.2
 */