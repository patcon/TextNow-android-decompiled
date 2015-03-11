package textnow.p;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.phone.w;
import com.enflick.android.TextNow.views.AvatarView;
import java.util.ArrayList;
import textnow.v.k;
import textnow.v.o;
import textnow.z.f;

public final class a extends ArrayAdapter<w>
  implements View.OnClickListener
{
  private Context a;
  private d b;

  public a(Context paramContext, int paramInt, com.enflick.android.TextNow.activities.phone.h paramh, d paramd)
  {
    super(paramContext, 2130903082, new ArrayList(paramh.q().d()));
    this.b = paramd;
    this.a = paramContext;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject1;
    Object localObject3;
    Object localObject2;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(getContext()).inflate(2130903082, null);
      if (paramView == null)
        return null;
      c localc2 = new c(this, paramView);
      paramView.setTag(localc2);
      Button localButton2 = c.a(localc2);
      b localb2 = new b(this, (byte)0);
      localButton2.setOnClickListener(this);
      localObject1 = localc2;
      localObject3 = localb2;
      localObject2 = localButton2;
    }
    String str1;
    ContentResolver localContentResolver;
    Uri localUri;
    while (true)
    {
      b.a((b)localObject3, (w)getItem(paramInt));
      ((Button)localObject2).setTag(localObject3);
      str1 = b.a((b)localObject3).b().a();
      localContentResolver = getContext().getContentResolver();
      localUri = k.a(localContentResolver, str1, 2);
      c.b((c)localObject1).a(b.a((b)localObject3).b().g());
      if ((localUri != null) && (!textnow.z.h.c(localUri.toString())))
        break;
      c.c((c)localObject1).setText(textnow.v.b.f(str1));
      c.d((c)localObject1).setVisibility(8);
      return paramView;
      c localc1 = (c)paramView.getTag();
      Button localButton1 = c.a(localc1);
      b localb1 = (b)localButton1.getTag();
      localObject1 = localc1;
      localObject2 = localButton1;
      localObject3 = localb1;
    }
    o.a(this.a).a(c.b((c)localObject1), localUri);
    String str2 = k.a(localContentResolver, str1);
    if (TextUtils.isEmpty(str2))
    {
      c.c((c)localObject1).setText(textnow.v.b.f(str1));
      c.d((c)localObject1).setVisibility(8);
      return paramView;
    }
    c.c((c)localObject1).setText(textnow.v.b.f(str2));
    c.d((c)localObject1).setVisibility(0);
    c.d((c)localObject1).setText(textnow.v.b.f(str1));
    return paramView;
  }

  public final void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 2131558573:
    }
    w localw = b.a((b)paramView.getTag());
    this.b.a(localw);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.p.a
 * JD-Core Version:    0.6.2
 */