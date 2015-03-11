package com.admarvel.android.ads;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

class s$d extends RelativeLayout
{
  public String a = null;
  public String b = null;
  public String c = null;
  public s.c d = s.c.a;
  public List<String> e;

  public s$d(final s params, Context paramContext, AdMarvelXMLElement paramAdMarvelXMLElement, LinearLayout.LayoutParams paramLayoutParams)
  {
    super(paramContext);
    AdMarvelXMLElement localAdMarvelXMLElement1;
    String str1;
    String str2;
    if (paramAdMarvelXMLElement.getChildren().get("action") != null)
    {
      localAdMarvelXMLElement1 = (AdMarvelXMLElement)((ArrayList)paramAdMarvelXMLElement.getChildren().get("action")).get(0);
      if (localAdMarvelXMLElement1 != null)
      {
        str1 = (String)localAdMarvelXMLElement1.getAttributes().get("type");
        this.c = str1;
        if (!"open_url".equalsIgnoreCase(str1))
          break label352;
        this.a = localAdMarvelXMLElement1.getData();
        str2 = (String)localAdMarvelXMLElement1.getAttributes().get("videoOpenUrlBehavior");
        if (str2 != null)
        {
          if (!str2.equalsIgnoreCase("pauseVideo"))
            break label312;
          this.d = s.c.a;
        }
      }
      label147: if (paramAdMarvelXMLElement.getChildren().get("clickTracking") == null)
        break label393;
    }
    label393: for (AdMarvelXMLElement localAdMarvelXMLElement2 = (AdMarvelXMLElement)((ArrayList)paramAdMarvelXMLElement.getChildren().get("clickTracking")).get(0); ; localAdMarvelXMLElement2 = null)
    {
      if (localAdMarvelXMLElement2 == null)
        break label399;
      AdMarvelXMLElement localAdMarvelXMLElement3 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.getChildren().get("pixels")).get(0);
      if ((localAdMarvelXMLElement3 == null) || (!localAdMarvelXMLElement3.getChildren().containsKey("pixel")))
        break label399;
      ArrayList localArrayList = (ArrayList)localAdMarvelXMLElement3.getChildren().get("pixel");
      this.e = new ArrayList();
      this.e.clear();
      for (int i = 0; i < localArrayList.size(); i++)
      {
        AdMarvelXMLElement localAdMarvelXMLElement4 = (AdMarvelXMLElement)localArrayList.get(i);
        this.e.add(localAdMarvelXMLElement4.getData());
      }
      localAdMarvelXMLElement1 = null;
      break;
      label312: if (str2.equalsIgnoreCase("stopVideo"))
      {
        this.d = s.c.b;
        break label147;
      }
      if (!str2.equalsIgnoreCase("closeVideo"))
        break label147;
      this.d = s.c.c;
      break label147;
      label352: if ("done".equalsIgnoreCase(str1))
      {
        s.a(params, true);
        break label147;
      }
      if (!"play_movie".equalsIgnoreCase(str1))
        break label147;
      this.b = localAdMarvelXMLElement1.getData();
      break label147;
    }
    label399: setLayoutParams(paramLayoutParams);
    setClickable(true);
    addStatesFromChildren();
    setGravity(17);
    setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        s.a(s.d.this.f, paramAnonymousView);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.s.d
 * JD-Core Version:    0.6.2
 */