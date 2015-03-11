package android.support.v4.app;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

final class ah extends FrameLayout
{
  private ah(Context paramContext)
  {
    super(paramContext);
  }

  static ViewGroup a(View paramView)
  {
    ah localah = new ah(paramView.getContext());
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams != null)
      localah.setLayoutParams(localLayoutParams);
    paramView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    localah.addView(paramView);
    return localah;
  }

  protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }

  protected final void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ah
 * JD-Core Version:    0.6.2
 */