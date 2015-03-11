package textnow.o;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.enflick.android.TextNow.activities.ActivateDataActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.tasks.c;

public final class a extends av
{
  private ActivateDataActivity a;
  private String b;
  private TextView f;
  private Button g;

  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  public final String l()
  {
    return "/Activate_Instruction";
  }

  public final String m()
  {
    return getString(2131296966);
  }

  public final boolean o()
  {
    return false;
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    String str = getString(2131296966);
    if (str != null)
      this.a.setTitle(str);
    this.a.d(false);
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = ((ActivateDataActivity)getActivity());
    this.b = getArguments().getString("extra_msl");
  }

  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2130903066, null);
    this.f = ((TextView)localView.findViewById(2131558514));
    TextView localTextView = this.f;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.b;
    localTextView.setText(Html.fromHtml(getString(2131296964, arrayOfObject)));
    this.g = ((Button)localView.findViewById(2131558515));
    this.g.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        a.a(a.this);
      }
    });
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.o.a
 * JD-Core Version:    0.6.2
 */