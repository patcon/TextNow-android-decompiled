package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

public abstract class d
{
  public abstract Parcelable a(View paramView, Matrix paramMatrix, RectF paramRectF);

  public abstract View a(Context paramContext, Parcelable paramParcelable);

  public abstract void a(List<View> paramList);

  public abstract void a(List<String> paramList, List<View> paramList1, List<View> paramList2);

  public abstract void a(List<String> paramList, Map<String, View> paramMap);

  public abstract void b(List<String> paramList, List<View> paramList1, List<View> paramList2);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.d
 * JD-Core Version:    0.6.2
 */