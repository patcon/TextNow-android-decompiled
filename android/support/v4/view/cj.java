package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

class cj extends cg
{
  public final void a(cd paramcd, View paramView, cp paramcp)
  {
    if (paramcp != null)
    {
      paramView.animate().setListener(new cn.1(paramcp, paramView));
      return;
    }
    paramView.animate().setListener(null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.view.cj
 * JD-Core Version:    0.6.2
 */