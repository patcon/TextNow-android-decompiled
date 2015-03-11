package android.support.v4.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

final class e extends SharedElementCallback
{
  private d a;

  public e(d paramd)
  {
    this.a = paramd;
  }

  public final Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    return this.a.a(paramView, paramMatrix, paramRectF);
  }

  public final View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
  {
    return this.a.a(paramContext, paramParcelable);
  }

  public final void onMapSharedElements(List<String> paramList, Map<String, View> paramMap)
  {
    this.a.a(paramList, paramMap);
  }

  public final void onRejectSharedElements(List<View> paramList)
  {
    this.a.a(paramList);
  }

  public final void onSharedElementEnd(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    this.a.b(paramList, paramList1, paramList2);
  }

  public final void onSharedElementStart(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    this.a.a(paramList, paramList1, paramList2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.e
 * JD-Core Version:    0.6.2
 */