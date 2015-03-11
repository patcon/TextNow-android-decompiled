package net.hockeyapp.android.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import textnow.bi.j;

public class UpdateView extends RelativeLayout
{
  protected RelativeLayout a = null;
  protected boolean b = false;
  protected boolean c = false;

  public UpdateView(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private UpdateView(Context paramContext, byte paramByte)
  {
    this(paramContext, true, false);
  }

  public UpdateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, true, false);
  }

  public UpdateView(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext);
    RelativeLayout.LayoutParams localLayoutParams2;
    label143: int m;
    label714: RelativeLayout.LayoutParams localLayoutParams6;
    label742: int n;
    ImageView localImageView1;
    RelativeLayout.LayoutParams localLayoutParams7;
    label842: ImageView localImageView2;
    RelativeLayout.LayoutParams localLayoutParams8;
    if (paramBoolean1)
      if (getResources().getConfiguration().orientation == 2)
      {
        this.b = true;
        this.c = paramBoolean2;
        RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
        setBackgroundColor(-1);
        setLayoutParams(localLayoutParams1);
        this.a = new RelativeLayout(paramContext);
        this.a.setId(4097);
        if (!this.b)
          break label931;
        localLayoutParams2 = new RelativeLayout.LayoutParams((int)TypedValue.applyDimension(1, 250.0F, getResources().getDisplayMetrics()), -1);
        localLayoutParams2.addRule(9, -1);
        this.a.setPadding(0, 0, 0, 0);
        this.a.setLayoutParams(localLayoutParams2);
        this.a.setBackgroundColor(Color.rgb(230, 236, 239));
        RelativeLayout localRelativeLayout1 = this.a;
        TextView localTextView1 = new TextView(paramContext);
        localTextView1.setId(4098);
        RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        int i = (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics());
        localLayoutParams3.setMargins(i, i, i, 0);
        localTextView1.setLayoutParams(localLayoutParams3);
        localTextView1.setEllipsize(TextUtils.TruncateAt.END);
        localTextView1.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        localTextView1.setSingleLine(true);
        localTextView1.setTextColor(-16777216);
        localTextView1.setTextSize(2, 20.0F);
        localTextView1.setTypeface(null, 1);
        localRelativeLayout1.addView(localTextView1);
        RelativeLayout localRelativeLayout2 = this.a;
        TextView localTextView2 = new TextView(paramContext);
        localTextView2.setId(4099);
        RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int j = (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics());
        localLayoutParams4.setMargins(j, (int)TypedValue.applyDimension(1, 10.0F, getResources().getDisplayMetrics()), j, 0);
        localLayoutParams4.addRule(3, 4098);
        localTextView2.setLayoutParams(localLayoutParams4);
        localTextView2.setEllipsize(TextUtils.TruncateAt.END);
        localTextView2.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        localTextView2.setLines(2);
        localTextView2.setLineSpacing(0.0F, 1.1F);
        localTextView2.setTextColor(-16777216);
        localTextView2.setTextSize(2, 16.0F);
        localTextView2.setTypeface(null, 1);
        localRelativeLayout2.addView(localTextView2);
        RelativeLayout localRelativeLayout3 = this.a;
        Button localButton = new Button(paramContext);
        localButton.setId(4100);
        int k = (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics());
        RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams((int)TypedValue.applyDimension(1, 120.0F, getResources().getDisplayMetrics()), -2);
        localLayoutParams5.setMargins(k, k, k, k);
        localLayoutParams5.addRule(9, -1);
        localLayoutParams5.addRule(3, 4099);
        localButton.setLayoutParams(localLayoutParams5);
        StateListDrawable localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(new int[] { -16842919 }, new ColorDrawable(-16777216));
        localStateListDrawable.addState(new int[] { -16842919, 16842908 }, new ColorDrawable(-12303292));
        localStateListDrawable.addState(new int[] { 16842919 }, new ColorDrawable(-7829368));
        localButton.setBackgroundDrawable(localStateListDrawable);
        localButton.setText("Update");
        localButton.setTextColor(-1);
        localButton.setTextSize(2, 16.0F);
        localRelativeLayout3.addView(localButton);
        addView(this.a);
        WebView localWebView = new WebView(paramContext);
        localWebView.setId(4101);
        m = (int)TypedValue.applyDimension(1, 400.0F, paramContext.getResources().getDisplayMetrics());
        if (!this.c)
          break label970;
        localLayoutParams6 = new RelativeLayout.LayoutParams(-1, m);
        if (!this.b)
          break label976;
        localLayoutParams6.addRule(1, 4097);
        localLayoutParams6.setMargins(0, 0, 0, 0);
        localWebView.setLayoutParams(localLayoutParams6);
        localWebView.setBackgroundColor(-1);
        addView(localWebView);
        RelativeLayout localRelativeLayout4 = this.a;
        n = (int)TypedValue.applyDimension(1, 3.0F, getResources().getDisplayMetrics());
        localImageView1 = new ImageView(paramContext);
        if (!this.b)
          break label988;
        localLayoutParams7 = new RelativeLayout.LayoutParams(1, -1);
        localLayoutParams7.addRule(11, -1);
        localImageView1.setBackgroundDrawable(new ColorDrawable(-16777216));
        localImageView1.setLayoutParams(localLayoutParams7);
        localRelativeLayout4.addView(localImageView1);
        localImageView2 = new ImageView(paramContext);
        localLayoutParams8 = new RelativeLayout.LayoutParams(-1, n);
        if (!this.b)
          break label1019;
        localLayoutParams8.addRule(10, -1);
      }
    while (true)
    {
      localImageView2.setLayoutParams(localLayoutParams8);
      localImageView2.setBackgroundDrawable(j.a());
      addView(localImageView2);
      return;
      this.b = false;
      break;
      this.b = false;
      break;
      label931: localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
      this.a.setPadding(0, 0, 0, (int)TypedValue.applyDimension(1, 20.0F, getResources().getDisplayMetrics()));
      break label143;
      label970: m = -1;
      break label714;
      label976: localLayoutParams6.addRule(3, 4097);
      break label742;
      label988: localLayoutParams7 = new RelativeLayout.LayoutParams(-1, n);
      localLayoutParams7.addRule(10, -1);
      localImageView1.setBackgroundDrawable(j.a());
      break label842;
      label1019: localLayoutParams8.addRule(3, 4097);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     net.hockeyapp.android.views.UpdateView
 * JD-Core Version:    0.6.2
 */