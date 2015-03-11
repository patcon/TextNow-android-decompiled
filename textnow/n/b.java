package textnow.n;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.ao;
import com.enflick.android.TextNow.tasks.c;

public class b extends ao
{
  protected final boolean a(c paramc, boolean paramBoolean)
  {
    return false;
  }

  protected final String k()
  {
    return "/No_Wifi_Fragment";
  }

  protected final String l()
  {
    return "";
  }

  protected final boolean n()
  {
    return true;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.e.y();
    this.e.c(false);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(2130903160, null);
  }

  public void onDestroyView()
  {
    super.onDestroyView();
    this.e.z();
    this.e.c(true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.n.b
 * JD-Core Version:    0.6.2
 */