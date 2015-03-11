package textnow.p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import textnow.v.y;
import textnow.z.u;

public final class af extends ArrayAdapter<Integer>
{
  private Context a;
  private int b;
  private int[] c;

  public af(Context paramContext, int paramInt, int[] paramArrayOfInt)
  {
    super(paramContext, 2130903216, arrayOfInteger);
    this.a = paramContext;
    this.b = 2130903216;
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
    Context localContext = this.a;
    int i = localInteger.intValue();
    int k;
    ImageView localImageView;
    if (i == 0)
    {
      k = 2131230878;
      paramView.setBackgroundResource(k);
      localImageView = (ImageView)paramView.findViewById(2131559011);
      if (this.c[paramInt] != new u(this.a).ab().intValue())
        break label194;
      localImageView.setVisibility(0);
    }
    while (true)
    {
      ((TextView)paramView.findViewById(2131559010)).setText(y.c(this.a, localInteger.intValue()));
      return paramView;
      TypedArray localTypedArray = localContext.getResources().obtainTypedArray(2131623942);
      if (y.a(i));
      for (int j = 1; ; j = 101)
      {
        k = localTypedArray.getResourceId(i - j, 2131230878);
        localTypedArray.recycle();
        break;
      }
      label194: localImageView.setVisibility(4);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.af
 * JD-Core Version:    0.6.2
 */