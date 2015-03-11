package textnow.f;

import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

final class f extends k
{
  public final Object a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2);
  }

  public final Object a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean, paramInt3);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.f.f
 * JD-Core Version:    0.6.2
 */