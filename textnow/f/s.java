package textnow.f;

import android.view.accessibility.AccessibilityRecord;

class s extends w
{
  public final Object a()
  {
    return AccessibilityRecord.obtain();
  }

  public final void a(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setFromIndex(paramInt);
  }

  public final void a(Object paramObject, boolean paramBoolean)
  {
    ((AccessibilityRecord)paramObject).setScrollable(paramBoolean);
  }

  public final void b(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setItemCount(paramInt);
  }

  public final void c(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setToIndex(paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.f.s
 * JD-Core Version:    0.6.2
 */