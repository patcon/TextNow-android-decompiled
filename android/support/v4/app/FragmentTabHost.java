package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost
  implements TabHost.OnTabChangeListener
{
  private final ArrayList<r> a = new ArrayList();
  private Context b;
  private n c;
  private int d;
  private TabHost.OnTabChangeListener e;
  private r f;
  private boolean g;

  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.d = localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
    super.setOnTabChangedListener(this);
  }

  private s a(String paramString, s params)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    if (i < this.a.size())
    {
      localObject2 = (r)this.a.get(i);
      if (!r.b((r)localObject2).equals(paramString))
        break label202;
    }
    while (true)
    {
      i++;
      localObject1 = localObject2;
      break;
      if (localObject1 == null)
        throw new IllegalStateException("No tab known for tag " + paramString);
      if (this.f != localObject1)
      {
        if (params == null)
          params = this.c.a();
        if ((this.f != null) && (r.a(this.f) != null))
          params.b(r.a(this.f));
        if (localObject1 != null)
        {
          if (r.a(localObject1) != null)
            break label190;
          r.a(localObject1, Fragment.instantiate(this.b, r.c(localObject1).getName(), r.d(localObject1)));
          params.a(this.d, r.a(localObject1), r.b(localObject1));
        }
      }
      while (true)
      {
        this.f = localObject1;
        return params;
        label190: params.c(r.a(localObject1));
      }
      label202: localObject2 = localObject1;
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    s locals1 = null;
    int i = 0;
    if (i < this.a.size())
    {
      r localr = (r)this.a.get(i);
      r.a(localr, this.c.a(r.b(localr)));
      if ((r.a(localr) != null) && (!r.a(localr).isDetached()))
      {
        if (!r.b(localr).equals(str))
          break label98;
        this.f = localr;
      }
      while (true)
      {
        i++;
        break;
        label98: if (locals1 == null)
          locals1 = this.c.a();
        locals1.b(r.a(localr));
      }
    }
    this.g = true;
    s locals2 = a(str, locals1);
    if (locals2 != null)
    {
      locals2.a();
      this.c.b();
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.g = false;
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    FragmentTabHost.SavedState localSavedState = (FragmentTabHost.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setCurrentTabByTag(localSavedState.a);
  }

  protected Parcelable onSaveInstanceState()
  {
    FragmentTabHost.SavedState localSavedState = new FragmentTabHost.SavedState(super.onSaveInstanceState());
    localSavedState.a = getCurrentTabTag();
    return localSavedState;
  }

  public void onTabChanged(String paramString)
  {
    if (this.g)
    {
      s locals = a(paramString, null);
      if (locals != null)
        locals.a();
    }
    if (this.e != null)
      this.e.onTabChanged(paramString);
  }

  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.e = paramOnTabChangeListener;
  }

  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentTabHost
 * JD-Core Version:    0.6.2
 */