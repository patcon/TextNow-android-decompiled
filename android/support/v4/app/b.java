package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

final class b extends d
{
  private ck a;

  public b(ck paramck)
  {
    this.a = paramck;
  }

  public final Parcelable a(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    return this.a.a(paramView, paramMatrix, paramRectF);
  }

  public final View a(Context paramContext, Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof Bitmap;
    ImageView localImageView = null;
    if (bool)
    {
      Bitmap localBitmap = (Bitmap)paramParcelable;
      localImageView = new ImageView(paramContext);
      localImageView.setImageBitmap(localBitmap);
    }
    return localImageView;
  }

  public final void a(List<View> paramList)
  {
  }

  public final void a(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
  }

  public final void a(List<String> paramList, Map<String, View> paramMap)
  {
  }

  public final void b(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.b
 * JD-Core Version:    0.6.2
 */