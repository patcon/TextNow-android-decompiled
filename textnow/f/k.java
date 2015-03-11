package textnow.f;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

class k extends j
{
  public Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1);
  }

  public Object a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean);
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    ((AccessibilityNodeInfo)paramObject1).setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject2);
  }

  public final void b(Object paramObject1, Object paramObject2)
  {
    ((AccessibilityNodeInfo)paramObject1).setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.f.k
 * JD-Core Version:    0.6.2
 */