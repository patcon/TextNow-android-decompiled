package textnow.v;

import android.widget.ImageView;
import com.enflick.android.TextNow.views.AvatarView;

final class p extends q
{
  public final void a(ImageView paramImageView)
  {
    if ((paramImageView instanceof AvatarView))
    {
      paramImageView.setImageDrawable(null);
      return;
    }
    paramImageView.setImageResource(o.a());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.v.p
 * JD-Core Version:    0.6.2
 */