package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import textnow.g.g;
import textnow.g.i;
import textnow.g.l;

public class ListMenuItemView extends LinearLayout
  implements y
{
  private m a;
  private ImageView b;
  private RadioButton c;
  private TextView d;
  private CheckBox e;
  private TextView f;
  private Drawable g;
  private int h;
  private Context i;
  private boolean j;
  private int k;
  private Context l;
  private LayoutInflater m;
  private boolean n;

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.l = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, l.aI, paramInt, 0);
    this.g = localTypedArray.getDrawable(l.aJ);
    this.h = localTypedArray.getResourceId(l.aK, -1);
    this.j = localTypedArray.getBoolean(l.aL, false);
    this.i = paramContext;
    localTypedArray.recycle();
  }

  private LayoutInflater c()
  {
    if (this.m == null)
      this.m = LayoutInflater.from(this.l);
    return this.m;
  }

  public final m a()
  {
    return this.a;
  }

  public final void a(m paramm, int paramInt)
  {
    this.a = paramm;
    this.k = 0;
    int i1;
    label63: Object localObject1;
    Object localObject2;
    label152: int i4;
    label177: label216: int i2;
    label245: int i3;
    label311: Drawable localDrawable2;
    if (paramm.isVisible())
    {
      i1 = 0;
      setVisibility(i1);
      CharSequence localCharSequence = paramm.a(this);
      if (localCharSequence == null)
        break label444;
      this.d.setText(localCharSequence);
      if (this.d.getVisibility() != 0)
        this.d.setVisibility(0);
      boolean bool1 = paramm.isCheckable();
      if ((bool1) || (this.c != null) || (this.e != null))
      {
        if (!this.a.f())
          break label468;
        if (this.c == null)
        {
          this.c = ((RadioButton)c().inflate(i.k, this, false));
          addView(this.c);
        }
        RadioButton localRadioButton2 = this.c;
        CheckBox localCheckBox2 = this.e;
        localObject1 = localRadioButton2;
        localObject2 = localCheckBox2;
        if (!bool1)
          break label532;
        ((CompoundButton)localObject1).setChecked(this.a.isChecked());
        if (!bool1)
          break label525;
        i4 = 0;
        if (((CompoundButton)localObject1).getVisibility() != i4)
          ((CompoundButton)localObject1).setVisibility(i4);
        if ((localObject2 != null) && (((CompoundButton)localObject2).getVisibility() != 8))
          ((CompoundButton)localObject2).setVisibility(8);
      }
      boolean bool2 = paramm.e();
      paramm.c();
      if ((!bool2) || (!this.a.e()))
        break label567;
      i2 = 0;
      if (i2 == 0)
        this.f.setText(this.a.d());
      if (this.f.getVisibility() != i2)
        this.f.setVisibility(i2);
      Drawable localDrawable1 = paramm.getIcon();
      if ((!this.a.g()) && (!this.n))
        break label574;
      i3 = 1;
      if (((i3 != 0) || (this.j)) && ((this.b != null) || (localDrawable1 != null) || (this.j)))
      {
        if (this.b == null)
        {
          this.b = ((ImageView)c().inflate(i.i, this, false));
          addView(this.b, 0);
        }
        if ((localDrawable1 == null) && (!this.j))
          break label586;
        ImageView localImageView = this.b;
        if (i3 == 0)
          break label580;
        localDrawable2 = localDrawable1;
        label404: localImageView.setImageDrawable(localDrawable2);
        if (this.b.getVisibility() != 0)
          this.b.setVisibility(0);
      }
    }
    while (true)
    {
      setEnabled(paramm.isEnabled());
      return;
      i1 = 8;
      break;
      label444: if (this.d.getVisibility() == 8)
        break label63;
      this.d.setVisibility(8);
      break label63;
      label468: if (this.e == null)
      {
        this.e = ((CheckBox)c().inflate(i.h, this, false));
        addView(this.e);
      }
      CheckBox localCheckBox1 = this.e;
      RadioButton localRadioButton1 = this.c;
      localObject1 = localCheckBox1;
      localObject2 = localRadioButton1;
      break label152;
      label525: i4 = 8;
      break label177;
      label532: if (this.e != null)
        this.e.setVisibility(8);
      if (this.c == null)
        break label216;
      this.c.setVisibility(8);
      break label216;
      label567: i2 = 8;
      break label245;
      label574: i3 = 0;
      break label311;
      label580: localDrawable2 = null;
      break label404;
      label586: this.b.setVisibility(8);
    }
  }

  public final void a(boolean paramBoolean)
  {
    this.n = true;
    this.j = true;
  }

  public final boolean b()
  {
    return false;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setBackgroundDrawable(this.g);
    this.d = ((TextView)findViewById(g.C));
    if (this.h != -1)
      this.d.setTextAppearance(this.i, this.h);
    this.f = ((TextView)findViewById(g.z));
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.b != null) && (this.j))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0))
        localLayoutParams1.width = localLayoutParams.height;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.ListMenuItemView
 * JD-Core Version:    0.6.2
 */