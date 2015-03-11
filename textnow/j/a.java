package textnow.j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class a
  implements TransformationMethod
{
  private Locale a;

  public a(Context paramContext)
  {
    this.a = paramContext.getResources().getConfiguration().locale;
  }

  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    if (paramCharSequence != null)
      return paramCharSequence.toString().toUpperCase(this.a);
    return null;
  }

  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.j.a
 * JD-Core Version:    0.6.2
 */