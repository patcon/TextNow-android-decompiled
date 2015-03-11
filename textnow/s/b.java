package textnow.s;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.tasks.c;

public class b extends av
{
  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  protected final String l()
  {
    return "/No_Wifi_Fragment";
  }

  protected final String m()
  {
    return "";
  }

  protected final boolean o()
  {
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.d.D();
    this.d.f(false);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130903176, null);
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    this.d.E();
    this.d.f(true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.s.b
 * JD-Core Version:    0.6.2
 */