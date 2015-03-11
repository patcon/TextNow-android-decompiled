package textnow.f;

import android.view.accessibility.AccessibilityNodeInfo;

class e extends c
{
  public final void b(Object paramObject, int paramInt)
  {
    ((AccessibilityNodeInfo)paramObject).setMovementGranularities(paramInt);
  }

  public final void h(Object paramObject, boolean paramBoolean)
  {
    ((AccessibilityNodeInfo)paramObject).setVisibleToUser(paramBoolean);
  }

  public final void i(Object paramObject, boolean paramBoolean)
  {
    ((AccessibilityNodeInfo)paramObject).setAccessibilityFocused(paramBoolean);
  }

  public final int r(Object paramObject)
  {
    return ((AccessibilityNodeInfo)paramObject).getMovementGranularities();
  }

  public final boolean s(Object paramObject)
  {
    return ((AccessibilityNodeInfo)paramObject).isVisibleToUser();
  }

  public final boolean t(Object paramObject)
  {
    return ((AccessibilityNodeInfo)paramObject).isAccessibilityFocused();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.f.e
 * JD-Core Version:    0.6.2
 */