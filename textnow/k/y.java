package textnow.k;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import textnow.q.ab;
import textnow.u.r;

public final class y extends ArrayAdapter<Integer>
{
  private Context a;
  private int b;
  private int[] c;

  public y(Context paramContext, int paramInt, int[] paramArrayOfInt)
  {
    super(paramContext, 2130903198, arrayOfInteger);
    this.a = paramContext;
    this.b = 2130903198;
    this.c = paramArrayOfInt;
  }

  public final int getCount()
  {
    return this.c.length;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = LayoutInflater.from(this.a).inflate(this.b, paramViewGroup, false);
    paramView.setTag(Integer.valueOf(this.c[paramInt]));
    Integer localInteger = Integer.valueOf(this.c[paramInt]);
    paramView.setBackgroundResource(ab.a(this.a, localInteger.intValue()));
    ImageView localImageView = (ImageView)paramView.findViewById(2131165708);
    if (this.c[paramInt] == new r(this.a).ac().intValue())
      localImageView.setVisibility(0);
    while (true)
    {
      ((TextView)paramView.findViewById(2131165707)).setText(ab.b(this.a, localInteger.intValue()));
      return paramView;
      localImageView.setVisibility(4);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.y
 * JD-Core Version:    0.6.2
 */