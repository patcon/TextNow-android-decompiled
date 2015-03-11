package textnow.p;

import android.content.Context;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.enflick.android.TextNow.views.emoticons.d;
import textnow.v.b;
import textnow.z.o;

public final class ab extends ArrayAdapter<o>
{
  private d a;

  public ab(Context paramContext)
  {
    super(paramContext, 2130903192, 2131558941);
    this.a = d.a(paramContext);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = LayoutInflater.from(getContext()).inflate(2130903192, paramViewGroup, false);
    ImageView localImageView = (ImageView)paramView.findViewById(2131558854);
    TextView localTextView1 = (TextView)paramView.findViewById(2131558941);
    TextView localTextView2 = (TextView)paramView.findViewById(2131558848);
    o localo = (o)getItem(paramInt);
    localTextView1.setText(localo.a(), TextView.BufferType.EDITABLE);
    if (localo.c() == 1)
      localImageView.setImageResource(2130837987);
    while (true)
    {
      Linkify.addLinks(localTextView1, 15);
      this.a.a(localTextView1);
      localTextView1.setMovementMethod(null);
      localTextView2.setText(b.a(localo.b(), false));
      return paramView;
      localImageView.setImageResource(2130837880);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.ab
 * JD-Core Version:    0.6.2
 */