package net.hockeyapp.android;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import net.hockeyapp.android.views.UpdateView;
import org.json.JSONArray;
import org.json.JSONException;
import textnow.bf.a;
import textnow.bh.b;

public class g extends DialogFragment
  implements View.OnClickListener, h
{
  private b downloadTask;
  private String urlString;
  private textnow.bi.i versionHelper;
  private JSONArray versionInfo;

  public static g newInstance(JSONArray paramJSONArray, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("url", paramString);
    localBundle.putString("versionInfo", paramJSONArray.toString());
    g localg = new g();
    localg.setArguments(localBundle);
    return localg;
  }

  private void startDownloadTask(final Activity paramActivity)
  {
    this.downloadTask = new b(paramActivity, this.urlString, new a()
    {
      public final String a(int paramAnonymousInt)
      {
        j localj = i.b();
        if (localj != null)
          return localj.a(paramAnonymousInt);
        return null;
      }

      public final void a()
      {
      }

      public final void a(Boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean.booleanValue())
          g.this.startDownloadTask(paramActivity);
      }
    });
    this.downloadTask.execute(new String[0]);
  }

  public String getAppName()
  {
    Activity localActivity = getActivity();
    try
    {
      PackageManager localPackageManager = localActivity.getPackageManager();
      String str = localPackageManager.getApplicationLabel(localPackageManager.getApplicationInfo(localActivity.getPackageName(), 0)).toString();
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return "";
  }

  public int getCurrentVersionCode()
  {
    try
    {
      int i = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 128).versionCode;
      return i;
    }
    catch (NullPointerException localNullPointerException)
    {
      return -1;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
    return -1;
  }

  public View getLayoutView()
  {
    return new UpdateView(getActivity(), false, true);
  }

  public void onClick(View paramView)
  {
    startDownloadTask(getActivity());
    dismiss();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    try
    {
      this.urlString = getArguments().getString("url");
      this.versionInfo = new JSONArray(getArguments().getString("versionInfo"));
      setStyle(1, 16973939);
      return;
    }
    catch (JSONException localJSONException)
    {
      dismiss();
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = getLayoutView();
    this.versionHelper = new textnow.bi.i(this.versionInfo.toString(), this);
    ((TextView)localView.findViewById(4098)).setText(getAppName());
    ((TextView)localView.findViewById(4099)).setText("Version " + this.versionHelper.a() + "\n" + this.versionHelper.b());
    ((Button)localView.findViewById(4100)).setOnClickListener(this);
    WebView localWebView = (WebView)localView.findViewById(4101);
    localWebView.clearCache(true);
    localWebView.destroyDrawingCache();
    localWebView.loadDataWithBaseURL("https://sdk.hockeyapp.net/", this.versionHelper.a(false), "text/html", "utf-8", null);
    return localView;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     net.hockeyapp.android.g
 * JD-Core Version:    0.6.2
 */