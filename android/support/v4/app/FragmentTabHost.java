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
  private final ArrayList<ab> a = new ArrayList();
  private Context b;
  private y c;
  private int d;
  private TabHost.OnTabChangeListener e;
  private ab f;
  private boolean g;

  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.d = localTypedArray.getResourceId(0, 0);
    localTypedArray.recycle();
    super.setOnTabChangedListener(this);
  }

  private ac a(String paramString, ac paramac)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    if (i < this.a.size())
    {
      localObject2 = (ab)this.a.get(i);
      if (!ab.b((ab)localObject2).equals(paramString))
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
        if (paramac == null)
          paramac = this.c.a();
        if ((this.f != null) && (ab.a(this.f) != null))
          paramac.b(ab.a(this.f));
        if (localObject1 != null)
        {
          if (ab.a(localObject1) != null)
            break label190;
          ab.a(localObject1, Fragment.instantiate(this.b, ab.c(localObject1).getName(), ab.d(localObject1)));
          paramac.a(this.d, ab.a(localObject1), ab.b(localObject1));
        }
      }
      while (true)
      {
        this.f = localObject1;
        return paramac;
        label190: paramac.c(ab.a(localObject1));
      }
      label202: localObject2 = localObject1;
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    ac localac1 = null;
    int i = 0;
    if (i < this.a.size())
    {
      ab localab = (ab)this.a.get(i);
      ab.a(localab, this.c.a(ab.b(localab)));
      if ((ab.a(localab) != null) && (!ab.a(localab).isDetached()))
      {
        if (!ab.b(localab).equals(str))
          break label98;
        this.f = localab;
      }
      while (true)
      {
        i++;
        break;
        label98: if (localac1 == null)
          localac1 = this.c.a();
        localac1.b(ab.a(localab));
      }
    }
    this.g = true;
    ac localac2 = a(str, localac1);
    if (localac2 != null)
    {
      localac2.a();
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
      ac localac = a(paramString, null);
      if (localac != null)
        localac.a();
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentTabHost
 * JD-Core Version:    0.6.2
 */