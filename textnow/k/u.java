package textnow.k;

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
import textnow.q.b;
import textnow.u.m;

public final class u extends ArrayAdapter<m>
{
  private d a;

  public u(Context paramContext)
  {
    super(paramContext, 2130903174, 2131165639);
    this.a = d.a(paramContext);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
      paramView = LayoutInflater.from(getContext()).inflate(2130903174, paramViewGroup, false);
    ImageView localImageView = (ImageView)paramView.findViewById(2131165556);
    TextView localTextView1 = (TextView)paramView.findViewById(2131165639);
    TextView localTextView2 = (TextView)paramView.findViewById(2131165552);
    m localm = (m)getItem(paramInt);
    localTextView1.setText(localm.a(), TextView.BufferType.EDITABLE);
    if (localm.c() == 1)
      localImageView.setImageResource(2130838025);
    while (true)
    {
      Linkify.addLinks(localTextView1, 15);
      this.a.a(localTextView1);
      localTextView1.setMovementMethod(null);
      localTextView2.setText(b.a(localm.b()));
      return paramView;
      localImageView.setImageResource(2130837916);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.k.u
 * JD-Core Version:    0.6.2
 */