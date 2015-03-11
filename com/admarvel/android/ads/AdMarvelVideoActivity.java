package com.admarvel.android.ads;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AdMarvelVideoActivity extends Activity
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, p.a
{
  static int a = 103444;
  static int b = 123124;
  static int c = 23232;
  private static Activity l;
  private boolean A = false;
  private boolean B = false;
  private boolean C = false;
  private RelativeLayout D = null;
  private long E;
  private boolean F = false;
  private boolean G = false;
  private boolean H = false;
  private boolean I = false;
  private String J;
  private ImageView K;
  private p L;
  private WeakReference<ad> M;
  private Handler N;
  private ab O;
  private String P;
  private Map<AdMarvelVideoActivity.l, List<String>> Q;
  private List<AdMarvelVideoActivity.g> R;
  private List<AdMarvelVideoActivity.k> S;
  private TextView T = null;
  private LinearLayout U = null;
  private AdMarvelVideoActivity.i V;
  private AdMarvelVideoActivity.i W;
  private AdMarvelVideoActivity.i X;
  private AdMarvelVideoActivity.i Y;
  private AdMarvelVideoActivity.i Z;
  private long aa;
  private boolean ab = false;
  private BroadcastReceiver ac;
  private int ad = 0;
  private Runnable ae = new Runnable()
  {
    public void run()
    {
      if ((AdMarvelVideoActivity.a(AdMarvelVideoActivity.this) == null) || (AdMarvelVideoActivity.b(AdMarvelVideoActivity.this)))
        return;
      if (AdMarvelVideoActivity.a(AdMarvelVideoActivity.this).getCurrentPosition() == 0);
      for (int i = AdMarvelVideoActivity.a(AdMarvelVideoActivity.this).f(); ; i = AdMarvelVideoActivity.a(AdMarvelVideoActivity.this).getCurrentPosition())
      {
        AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, AdMarvelVideoActivity.this.k - AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, i), AdMarvelVideoActivity.c(AdMarvelVideoActivity.this));
        AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, AdMarvelVideoActivity.a(AdMarvelVideoActivity.this).getCurrentPosition()));
        if (AdMarvelVideoActivity.d(AdMarvelVideoActivity.this))
          break;
        AdMarvelVideoActivity.this.g();
        AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, true);
        return;
      }
    }
  };
  private Runnable af = new Runnable()
  {
    public void run()
    {
      while (true)
      {
        int i;
        try
        {
          if (AdMarvelVideoActivity.f(AdMarvelVideoActivity.this) != null)
          {
            ad localad = (ad)AdMarvelVideoActivity.f(AdMarvelVideoActivity.this).get();
            if ((localad != null) && ((localad instanceof LinearLayout)))
            {
              if ((localad != null) && (AdMarvelVideoActivity.g(AdMarvelVideoActivity.this)))
              {
                i = 0;
                if (i < localad.getChildCount())
                {
                  if (!(localad.getChildAt(i) instanceof ad.d))
                    break label260;
                  ad.d locald = (ad.d)localad.getChildAt(i);
                  if ((locald == null) || (!locald.c.equalsIgnoreCase("done")))
                    break label260;
                  locald.setClickable(true);
                  locald.setEnabled(true);
                  if (!(locald.getChildAt(0) instanceof ImageView))
                    break label260;
                  if ((AdMarvelVideoActivity.e(AdMarvelVideoActivity.this) != null) && (AdMarvelVideoActivity.e(AdMarvelVideoActivity.this).c()))
                    AdMarvelVideoActivity.e(AdMarvelVideoActivity.this).b();
                  ImageView localImageView = (ImageView)locald.getChildAt(0);
                  if (localImageView.getDrawable() == null)
                    break label260;
                  localImageView.getDrawable().setAlpha(255);
                  localImageView.invalidate();
                  break label260;
                }
              }
              AdMarvelVideoActivity.b(AdMarvelVideoActivity.this, false);
              if (AdMarvelVideoActivity.h(AdMarvelVideoActivity.this) != null)
              {
                AdMarvelVideoActivity.h(AdMarvelVideoActivity.this).b();
                AdMarvelVideoActivity.c(AdMarvelVideoActivity.this, false);
                AdMarvelVideoActivity.i(AdMarvelVideoActivity.this).setVisibility(8);
                AdMarvelVideoActivity.j(AdMarvelVideoActivity.this);
              }
            }
          }
          return;
        }
        catch (Exception localException)
        {
          Logging.log(Log.getStackTraceString(localException));
          return;
        }
        label260: i++;
      }
    }
  };
  private Runnable ag = new Runnable()
  {
    public void run()
    {
      try
      {
        AdMarvelVideoActivity.b localb = (AdMarvelVideoActivity.b)AdMarvelVideoActivity.this.h.get();
        if (localb != null)
          localb.d();
        return;
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
      }
    }
  };
  private Runnable ah = new Runnable()
  {
    public void run()
    {
      if ((!AdMarvelVideoActivity.k(AdMarvelVideoActivity.this)) || (AdMarvelVideoActivity.i(AdMarvelVideoActivity.this) == null))
        return;
      while (true)
      {
        int i;
        try
        {
          AdMarvelVideoActivity.i(AdMarvelVideoActivity.this).setVisibility(0);
          i = AdMarvelVideoActivity.l(AdMarvelVideoActivity.this) - AdMarvelVideoActivity.a(AdMarvelVideoActivity.this, System.currentTimeMillis() - AdMarvelVideoActivity.m(AdMarvelVideoActivity.this));
          if ((AdMarvelVideoActivity.n(AdMarvelVideoActivity.this) != null) && (AdMarvelVideoActivity.n(AdMarvelVideoActivity.this).length() > 0) && (AdMarvelVideoActivity.n(AdMarvelVideoActivity.this).contains("@seconds")))
          {
            localObject = AdMarvelVideoActivity.n(AdMarvelVideoActivity.this).replace("@seconds", String.valueOf(i));
            ((TextView)AdMarvelVideoActivity.i(AdMarvelVideoActivity.this).getChildAt(0)).setText((CharSequence)localObject);
            return;
          }
        }
        catch (Exception localException)
        {
          Logging.log(Log.getStackTraceString(localException));
          return;
        }
        String str = "You Can Skip Ad in " + i + " seconds";
        Object localObject = str;
      }
    }
  };
  private Runnable ai = new Runnable()
  {
    public void run()
    {
      LinearLayout localLinearLayout = (LinearLayout)AdMarvelVideoActivity.this.findViewById(AdMarvelVideoActivity.b);
      if ((AdMarvelVideoActivity.g(AdMarvelVideoActivity.this)) && (localLinearLayout != null) && (localLinearLayout.getVisibility() == 0) && (System.currentTimeMillis() - AdMarvelVideoActivity.o(AdMarvelVideoActivity.this) >= 3000L))
        AdMarvelVideoActivity.this.b(false);
      AdMarvelVideoActivity.p(AdMarvelVideoActivity.this).b();
    }
  };
  private View.OnTouchListener aj = new View.OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      if (paramAnonymousMotionEvent.getAction() == 0)
        AdMarvelVideoActivity.this.onUserInteraction();
      return false;
    }
  };
  private View.OnTouchListener ak = new View.OnTouchListener()
  {
    public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
    {
      if (paramAnonymousMotionEvent.getAction() == 0)
      {
        LinearLayout localLinearLayout = (LinearLayout)AdMarvelVideoActivity.this.findViewById(AdMarvelVideoActivity.b);
        if ((AdMarvelVideoActivity.g(AdMarvelVideoActivity.this)) && (localLinearLayout != null) && (AdMarvelVideoActivity.q(AdMarvelVideoActivity.this)) && (AdMarvelVideoActivity.this.i != AdMarvelVideoActivity.k.d) && (AdMarvelVideoActivity.this.i != AdMarvelVideoActivity.k.e))
          AdMarvelVideoActivity.this.onUserInteraction();
      }
      return false;
    }
  };
  public boolean d = false;
  AdMarvelXMLReader e;
  AdMarvelXMLElement f;
  LinearLayout g;
  WeakReference<AdMarvelVideoActivity.b> h;
  public AdMarvelVideoActivity.k i;
  public AdMarvelVideoActivity.m j = AdMarvelVideoActivity.m.c;
  public int k = -1;
  private WeakReference<AdMarvelAd> m;
  private AdMarvelAd n;
  private RelativeLayout o;
  private String p;
  private boolean q = false;
  private boolean r;
  private boolean s = false;
  private boolean t = false;
  private boolean u = true;
  private boolean v = false;
  private int w = -1;
  private String x;
  private String y;
  private boolean z = false;

  private int a(long paramLong)
  {
    return (int)paramLong / 1000;
  }

  private void a(int paramInt)
  {
    label7: if (this.R == null)
      break label7;
    label129: 
    while (true)
    {
      return;
      if (this.O != null)
        while (true)
        {
          if (this.R.size() <= 0)
            break label129;
          int i1 = ((AdMarvelVideoActivity.g)this.R.get(0)).a;
          if (paramInt != i1)
            break;
          if (paramInt == i1)
          {
            List localList = ((AdMarvelVideoActivity.g)this.R.get(0)).b;
            if (localList == null)
              break;
            Iterator localIterator = localList.iterator();
            while (localIterator.hasNext())
            {
              String str = (String)localIterator.next();
              this.O.a(str);
            }
            this.R.remove(0);
          }
        }
    }
  }

  private void a(int paramInt, TextView paramTextView)
  {
    new String();
    int i1 = paramInt / 60;
    int i2 = paramInt % 60;
    String str;
    if (paramInt == 0)
    {
      str = " 00:00";
      if (paramTextView != null)
      {
        if ((paramTextView.getVisibility() != 0) || (this.U.getVisibility() != 0))
        {
          paramTextView.setVisibility(0);
          this.U.setVisibility(0);
        }
        paramTextView.setText(str);
      }
      return;
    }
    StringBuilder localStringBuilder1 = new StringBuilder().append("-");
    Object localObject1;
    label114: StringBuilder localStringBuilder2;
    if (i1 < 10)
    {
      localObject1 = "0" + i1;
      localStringBuilder2 = localStringBuilder1.append(localObject1).append(":");
      if (i2 >= 10)
        break label184;
    }
    label184: for (Object localObject2 = "0" + i2; ; localObject2 = Integer.valueOf(i2))
    {
      str = localObject2;
      break;
      localObject1 = Integer.valueOf(i1);
      break label114;
    }
  }

  private void a(LinearLayout paramLinearLayout, boolean paramBoolean)
  {
    AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation1.setInterpolator(new DecelerateInterpolator());
    localAlphaAnimation1.setDuration(800L);
    AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation2.setInterpolator(new AccelerateInterpolator());
    localAlphaAnimation2.setDuration(500L);
    if (paramBoolean)
    {
      paramLinearLayout.setAnimation(localAlphaAnimation1);
      return;
    }
    paramLinearLayout.setAnimation(localAlphaAnimation2);
  }

  private void a(RelativeLayout paramRelativeLayout)
  {
    this.D = new RelativeLayout(this);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams1.addRule(10);
    localLayoutParams1.addRule(11);
    this.D.setLayoutParams(localLayoutParams1);
    this.D.setBackgroundColor(0);
    TextView localTextView = new TextView(this);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localTextView.setLayoutParams(localLayoutParams2);
    localTextView.setTypeface(Typeface.DEFAULT_BOLD);
    this.D.addView(localTextView);
    this.D.setVisibility(4);
    paramRelativeLayout.addView(this.D);
  }

  private void a(AdMarvelXMLElement paramAdMarvelXMLElement, AdMarvelVideoActivity.l paraml)
  {
    if (this.Q == null);
    while ((paramAdMarvelXMLElement == null) || (!paramAdMarvelXMLElement.c().containsKey("pixel")))
      return;
    ArrayList localArrayList1 = (ArrayList)paramAdMarvelXMLElement.c().get("pixel");
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.clear();
    for (int i1 = 0; i1 < localArrayList1.size(); i1++)
      localArrayList2.add(((AdMarvelXMLElement)localArrayList1.get(i1)).b());
    this.Q.put(paraml, localArrayList2);
  }

  private void b(RelativeLayout paramRelativeLayout)
  {
    this.K = new ImageView(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(13);
    this.K.setLayoutParams(localLayoutParams);
    if (ac.a() >= 11)
    {
      this.N.post(new AdMarvelVideoActivity.d(this, this.K, this.y));
      if ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.k.a)))
        break label156;
      this.K.setVisibility(4);
    }
    while (true)
    {
      paramRelativeLayout.addView(this.K);
      return;
      AdMarvelVideoActivity.c localc = new AdMarvelVideoActivity.c(this, this.K);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.y;
      localc.execute(arrayOfString);
      break;
      label156: this.K.setVisibility(0);
    }
  }

  private LinearLayout e(String paramString)
  {
    LinearLayout localLinearLayout = new LinearLayout(this);
    localLinearLayout.setId(b);
    localLinearLayout.setGravity(80);
    ad localad = new ad(this.L, this, this, paramString, this.P);
    this.M = new WeakReference(localad);
    localLinearLayout.addView(localad);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(12);
    localLinearLayout.setLayoutParams(localLayoutParams);
    return localLinearLayout;
  }

  private String f(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return null;
    AdMarvelVideoActivity.j localj = new AdMarvelVideoActivity.j(this);
    StringBuffer localStringBuffer1 = new StringBuffer();
    localStringBuffer1.append("<videoTrackingEvents>");
    localj.a(paramString);
    Iterator localIterator1 = localj.a().iterator();
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    List localList = null;
    while (localIterator1.hasNext())
    {
      AdMarvelVideoActivity.j.a locala = (AdMarvelVideoActivity.j.a)localIterator1.next();
      if ("xml".equalsIgnoreCase(locala.a))
        return (String)locala.b.get(0);
      if ("video".equalsIgnoreCase(locala.a))
        str1 = d((String)locala.b.get(0));
      else if ("duration".equalsIgnoreCase(locala.a))
        str2 = (String)locala.b.get(0);
      else if ("poster".equalsIgnoreCase(locala.a))
        str4 = (String)locala.b.get(0);
      else if ("force_quit".equalsIgnoreCase(locala.a))
        str3 = (String)locala.b.get(0);
      else if ("open_url".equalsIgnoreCase(locala.a))
        str5 = (String)locala.b.get(0);
      else if (locala.a.startsWith("track_"))
        if (locala.a.startsWith("track_pr_"))
        {
          String str11 = locala.a.replaceFirst("track_pr_", "");
          localStringBuffer1.append("<videoTracking event=\"progress\" offset=\"" + str11 + "\"><pixels>");
          Iterator localIterator4 = locala.b.iterator();
          while (localIterator4.hasNext())
          {
            String str12 = (String)localIterator4.next();
            if ((str12 != null) && (str12.length() > 0))
              localStringBuffer1.append("<pixel>" + str12 + "</pixel>");
          }
          localStringBuffer1.append("</pixels></videoTracking>");
        }
        else if ("track_open_url".equalsIgnoreCase(locala.a))
        {
          new ArrayList();
          localList = locala.b;
        }
        else
        {
          String str9 = locala.a.replaceFirst("track_", "");
          localStringBuffer1.append("<videoTracking event=\"" + str9 + "\" ><pixels>");
          Iterator localIterator3 = locala.b.iterator();
          while (localIterator3.hasNext())
          {
            String str10 = (String)localIterator3.next();
            if ((str10 != null) && (str10.length() > 0))
              localStringBuffer1.append("<pixel>" + str10 + "</pixel>");
          }
          localStringBuffer1.append("</pixels></videoTracking>");
        }
    }
    localStringBuffer1.append("</videoTrackingEvents>");
    String str6;
    if ((str4 != null) && (str4.length() > 0))
      str6 = "<loadingimage>" + str4 + "</loadingimage>";
    while (true)
      if ((str5 != null) && (str5.length() > 0))
      {
        StringBuffer localStringBuffer2 = new StringBuffer();
        if ((localList != null) && (localList.size() > 0))
        {
          localStringBuffer2.append("<clickTracking><pixels>");
          Iterator localIterator2 = localList.iterator();
          while (true)
          {
            Object[] arrayOfObject2;
            String str7;
            Object[] arrayOfObject1;
            if (localIterator2.hasNext())
            {
              String str8 = (String)localIterator2.next();
              if ((str8 != null) && (str8.length() > 0))
              {
                localStringBuffer2.append("<pixel>" + str8 + "</pixel>");
                continue;
                str6 = "";
                break;
              }
            }
          }
          localStringBuffer2.append("</pixels></clickTracking>");
        }
        if (localStringBuffer2.length() > 0)
        {
          arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = localStringBuffer2.toString();
          arrayOfObject2[1] = str5;
          str7 = String.format("<toolbar > <item type=\"SystemItem\" ><action type=\"done\"/></item> <item type=\"Toggle\"> <subitem type=\"SystemItem\" > <action type=\"pause\"/> </subitem> <subitem type=\"SystemItem\" > <action type=\"resume\"/> </subitem> </item> <item type=\"SystemItem\" >%s<action type=\"open_url\">%s</action></item> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"Timer\"/> </toolbar>", arrayOfObject2);
          arrayOfObject1 = new Object[6];
          if (str2 == null)
            break label969;
          label878: arrayOfObject1[0] = str2;
          if (str3 == null)
            break label977;
          label889: arrayOfObject1[1] = str3;
          if (str1 == null)
            break label985;
        }
      }
    while (true)
    {
      arrayOfObject1[2] = str1;
      arrayOfObject1[3] = str6;
      arrayOfObject1[4] = str7;
      arrayOfObject1[5] = localStringBuffer1.toString();
      return String.format("<customad type=\"video\"><video duration=\"%s\" forcequit=\"%s\">%s</video>%s%s%s</customad>", arrayOfObject1);
      str7 = String.format("<toolbar > <item type=\"SystemItem\" ><action type=\"done\"/></item> <item type=\"Toggle\"> <subitem type=\"SystemItem\" > <action type=\"pause\"/> </subitem> <subitem type=\"SystemItem\" > <action type=\"resume\"/> </subitem> </item> <item type=\"SystemItem\" >%s<action type=\"open_url\">%s</action></item> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"Timer\"/> </toolbar>", new Object[] { "", str5 });
      break;
      str7 = "<toolbar > <item type=\"SystemItem\" ><action type=\"done\"/></item> <item type=\"Toggle\"> <subitem type=\"SystemItem\" > <action type=\"pause\"/> </subitem> <subitem type=\"SystemItem\" > <action type=\"resume\"/> </subitem> </item> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"SystemItem\" subtype=\"UIBarButtonSystemItemFlexibleSpace\"  /> <item type=\"Timer\"/> </toolbar>";
      break;
      label969: str2 = "";
      break label878;
      label977: str3 = "NO";
      break label889;
      label985: str1 = "";
    }
  }

  private void o()
  {
    if (this.o != null)
      this.o.setVisibility(0);
  }

  private void p()
  {
    if (this.o != null)
      this.o.setVisibility(8);
  }

  private boolean q()
  {
    WeakReference localWeakReference = this.M;
    boolean bool1 = false;
    ad localad;
    if (localWeakReference != null)
    {
      localad = (ad)this.M.get();
      bool1 = false;
      if (localad != null)
      {
        boolean bool2 = localad instanceof LinearLayout;
        bool1 = false;
        if (!bool2);
      }
    }
    for (int i1 = 0; ; i1++)
    {
      int i2 = localad.getChildCount();
      bool1 = false;
      if (i1 < i2)
      {
        if ((localad.getChildAt(i1) instanceof ViewSwitcher))
        {
          ViewSwitcher localViewSwitcher = (ViewSwitcher)localad.getChildAt(i1);
          ad.d locald2 = (ad.d)localViewSwitcher.getCurrentView();
          ad.d locald3 = (ad.d)localViewSwitcher.getNextView();
          if (((locald2 == null) || (!locald2.c.equalsIgnoreCase("unmute"))) && ((locald3 == null) || (!locald3.c.equalsIgnoreCase("unmute"))))
            continue;
          bool1 = true;
        }
      }
      else
        return bool1;
      if ((localad.getChildAt(i1) instanceof ad.d))
      {
        ad.d locald1 = (ad.d)localad.getChildAt(i1);
        if ((locald1 != null) && (locald1.c.equalsIgnoreCase("unmute")))
          return true;
      }
    }
  }

  private void r()
  {
    if (this.M != null)
    {
      ad localad = (ad)this.M.get();
      if ((localad != null) && ((localad instanceof LinearLayout)))
        for (int i1 = 0; i1 < localad.getChildCount(); i1++)
          if ((localad.getChildAt(i1) instanceof ViewSwitcher))
          {
            ViewSwitcher localViewSwitcher = (ViewSwitcher)localad.getChildAt(i1);
            ad.d locald1 = (ad.d)localViewSwitcher.getCurrentView();
            ad.d locald2 = (ad.d)localViewSwitcher.getNextView();
            if ((locald1 != null) && (locald1.c.equalsIgnoreCase("mute")) && (locald2 != null) && (locald2.c.equalsIgnoreCase("unmute")))
              localViewSwitcher.showNext();
          }
    }
  }

  private void s()
  {
    if (this.W != null)
      this.W.b();
    if (this.V != null)
      this.V.b();
    if (this.Y != null)
      this.Y.b();
    if (this.X != null)
      this.X.b();
  }

  public Handler a()
  {
    return this.N;
  }

  public void a(AdMarvelVideoActivity.l paraml)
  {
    if (this.Q == null);
    do
    {
      List localList;
      do
      {
        return;
        localList = (List)this.Q.get(paraml);
      }
      while ((localList == null) || (this.O == null));
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.O.a(str);
      }
    }
    while ((paraml != AdMarvelVideoActivity.l.a) && (paraml != AdMarvelVideoActivity.l.b));
    this.Q.remove(paraml);
  }

  public void a(p paramp)
  {
    if (paramp.getVisibility() != 0)
      paramp.setVisibility(0);
    if ((this.z) && (this.K != null) && (this.K.getVisibility() == 0))
      this.K.setVisibility(4);
    if ((this.k > 0) && (!this.A))
    {
      LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
      if ((localLinearLayout != null) && (this.s) && (this.T == null))
      {
        this.U = ((LinearLayout)localLinearLayout.findViewWithTag(this.P + "TIMER_BUTTON_LAYOUT"));
        if (this.U != null)
          this.T = ((TextView)this.U.getChildAt(0));
      }
      if ((this.R != null) && (this.R.size() > 0))
        Collections.sort(this.R, new Comparator()
        {
          public int a(AdMarvelVideoActivity.g paramAnonymousg1, AdMarvelVideoActivity.g paramAnonymousg2)
          {
            return paramAnonymousg1.a - paramAnonymousg2.a;
          }
        });
      if (this.W != null)
        break label225;
      this.W = new AdMarvelVideoActivity.i(this.N, this.ae, 500);
      this.W.a();
    }
    while (true)
    {
      paramp.start();
      this.i = AdMarvelVideoActivity.k.b;
      return;
      label225: if (!this.W.c())
        this.W.a();
    }
  }

  public void a(String paramString)
  {
    if (this.h == null)
    {
      AdMarvelVideoActivity.b localb1 = new AdMarvelVideoActivity.b(this, this);
      localb1.setMessage(paramString);
      localb1.b();
      this.h = new WeakReference(localb1);
      localb1.setTag("ADM__VIDEO_DIALOG");
      addContentView(localb1, localb1.getLayoutParams());
      return;
    }
    AdMarvelVideoActivity.b localb2 = (AdMarvelVideoActivity.b)this.h.get();
    if (localb2 != null)
    {
      localb2.setMessage(paramString);
      localb2.b();
      return;
    }
    AdMarvelVideoActivity.b localb3 = new AdMarvelVideoActivity.b(this, this);
    localb3.setMessage(paramString);
    localb3.b();
    this.h.clear();
    this.h = new WeakReference(localb3);
  }

  public void a(List<String> paramList)
  {
    if (paramList == null);
    while (true)
    {
      return;
      if (this.O != null)
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          this.O.a(str);
        }
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    if (this.L == null);
    while (this.i != AdMarvelVideoActivity.k.b)
      return;
    this.L.pause();
    if (paramBoolean)
    {
      this.i = AdMarvelVideoActivity.k.f;
      return;
    }
    this.i = AdMarvelVideoActivity.k.c;
  }

  public void b(String paramString)
  {
    this.e = new AdMarvelXMLReader();
    this.e.parseXMLString(paramString);
    this.f = this.e.getParsedXMLData();
    String str12;
    if (this.f.c().containsKey("video"))
    {
      AdMarvelXMLElement localAdMarvelXMLElement9 = (AdMarvelXMLElement)((ArrayList)this.f.c().get("video")).get(0);
      if (localAdMarvelXMLElement9 != null)
      {
        this.x = d(localAdMarvelXMLElement9.b());
        String str10 = (String)localAdMarvelXMLElement9.getAttributes().get("forcequit");
        if ((str10 != null) && (str10.equalsIgnoreCase("YES")))
          this.B = true;
        String str11 = (String)localAdMarvelXMLElement9.getAttributes().get("duration");
        if ((str11 != null) && (Integer.parseInt(str11) > 0))
          this.k = Integer.parseInt(str11);
        str12 = (String)localAdMarvelXMLElement9.getAttributes().get("lockOrientation");
        if (str12 != null)
        {
          if (!str12.equalsIgnoreCase("LandscapeLeft"))
            break label469;
          setRequestedOrientation(0);
        }
        String str13 = (String)localAdMarvelXMLElement9.getAttributes().get("initialMute");
        if ((str13 != null) && (str13.equalsIgnoreCase("YES")))
          this.ab = true;
        String str14 = (String)localAdMarvelXMLElement9.getAttributes().get("enableVideoPlayOnScreenLock");
        if ((str14 != null) && (str14.equalsIgnoreCase("YES")))
          this.H = true;
        String str15 = (String)localAdMarvelXMLElement9.getAttributes().get("quitVideoInBackground");
        if ((str15 != null) && (str15.equalsIgnoreCase("YES")))
          this.I = true;
      }
    }
    if (this.f.c().containsKey("loadingimage"))
    {
      AdMarvelXMLElement localAdMarvelXMLElement8 = (AdMarvelXMLElement)((ArrayList)this.f.c().get("loadingimage")).get(0);
      if (localAdMarvelXMLElement8 != null)
      {
        this.y = localAdMarvelXMLElement8.b();
        this.z = true;
        String str9 = (String)localAdMarvelXMLElement8.getAttributes().get("displayEvent");
        if (str9 != null)
        {
          String[] arrayOfString = str9.split(",");
          if ((arrayOfString != null) && (arrayOfString.length > 0))
          {
            this.S = new ArrayList();
            int i10 = 0;
            label428: if (i10 < arrayOfString.length)
            {
              if (arrayOfString[i10].equalsIgnoreCase("loading"))
                this.S.add(AdMarvelVideoActivity.k.a);
              while (true)
              {
                i10++;
                break label428;
                label469: if (str12.equalsIgnoreCase("Portrait"))
                {
                  setRequestedOrientation(1);
                  break;
                }
                if (ac.a() < 11)
                  break;
                y.a(this, str12);
                break;
                if (arrayOfString[i10].equalsIgnoreCase("complete"))
                {
                  this.S.add(AdMarvelVideoActivity.k.d);
                  this.S.add(AdMarvelVideoActivity.k.e);
                }
              }
            }
          }
        }
      }
    }
    AdMarvelXMLElement localAdMarvelXMLElement7;
    String str4;
    String str5;
    label626: String str6;
    if (this.f.c().containsKey("toolbar"))
    {
      localAdMarvelXMLElement7 = (AdMarvelXMLElement)((ArrayList)this.f.c().get("toolbar")).get(0);
      if (localAdMarvelXMLElement7 != null)
        break label1123;
      str4 = null;
      if ((str4 != null) && (str4.equalsIgnoreCase("YES")))
        this.t = true;
      if (localAdMarvelXMLElement7 != null)
        break label1142;
      str5 = null;
      if ((str5 != null) && (str5.equalsIgnoreCase("NO")))
        this.u = false;
      if (localAdMarvelXMLElement7 != null)
        break label1161;
      str6 = null;
      label655: if (str6 != null)
      {
        this.v = true;
        this.C = true;
        this.w = Integer.parseInt(str6);
        String str7 = (String)localAdMarvelXMLElement7.getAttributes().get("showSkipMessage");
        if ((str7 != null) && (str7.equalsIgnoreCase("NO")))
          this.C = false;
        String str8 = (String)localAdMarvelXMLElement7.getAttributes().get("skipText");
        if ((str8 != null) && (str8.length() > 0) && (str8.contains("@seconds")))
          this.J = str8;
      }
      if ((localAdMarvelXMLElement7 != null) && (localAdMarvelXMLElement7.c().containsKey("item")) && (((ArrayList)localAdMarvelXMLElement7.c().get("item")).size() > 0))
        this.s = true;
    }
    if (this.f.c().containsKey("videoTrackingEvents"))
    {
      this.R = new ArrayList();
      this.Q = new HashMap();
      AdMarvelXMLElement localAdMarvelXMLElement1 = (AdMarvelXMLElement)((ArrayList)this.f.c().get("videoTrackingEvents")).get(0);
      if ((localAdMarvelXMLElement1 != null) && (localAdMarvelXMLElement1.c().containsKey("videoTracking")))
      {
        ArrayList localArrayList1 = (ArrayList)localAdMarvelXMLElement1.c().get("videoTracking");
        int i1 = 0;
        if (i1 < localArrayList1.size())
        {
          AdMarvelXMLElement localAdMarvelXMLElement2 = (AdMarvelXMLElement)localArrayList1.get(i1);
          String str1 = (String)localAdMarvelXMLElement2.getAttributes().get("event");
          if ("progress".equalsIgnoreCase(str1))
          {
            String str2 = (String)localAdMarvelXMLElement2.getAttributes().get("offset");
            if (str2 != null)
            {
              String str3;
              if (str2.endsWith("%"))
                str3 = str2.replace("%", "");
              ArrayList localArrayList9;
              for (int i8 = this.k * Integer.parseInt(str3) / 100; ; i8 = Integer.parseInt(str2))
              {
                AdMarvelXMLElement localAdMarvelXMLElement6 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0);
                if ((localAdMarvelXMLElement6 == null) || (!localAdMarvelXMLElement6.c().containsKey("pixel")))
                  break label1212;
                ArrayList localArrayList8 = (ArrayList)localAdMarvelXMLElement6.c().get("pixel");
                localArrayList9 = new ArrayList();
                localArrayList9.clear();
                for (int i9 = 0; i9 < localArrayList8.size(); i9++)
                  localArrayList9.add(((AdMarvelXMLElement)localArrayList8.get(i9)).b());
                label1123: str4 = (String)localAdMarvelXMLElement7.getAttributes().get("initiallyVisible");
                break;
                label1142: str5 = (String)localAdMarvelXMLElement7.getAttributes().get("toggleToolbar");
                break label626;
                label1161: str6 = (String)localAdMarvelXMLElement7.getAttributes().get("delayDisplayDoneButton");
                break label655;
              }
              this.R.add(new AdMarvelVideoActivity.g(this, i8, localArrayList9));
            }
          }
          while (true)
          {
            label1212: i1++;
            break;
            if (("firstQuartile".equalsIgnoreCase(str1)) && (this.k > 0))
            {
              int i6 = this.k / 4;
              if (i6 > 0)
              {
                AdMarvelXMLElement localAdMarvelXMLElement5 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0);
                if ((localAdMarvelXMLElement5 != null) && (localAdMarvelXMLElement5.c().containsKey("pixel")))
                {
                  ArrayList localArrayList6 = (ArrayList)localAdMarvelXMLElement5.c().get("pixel");
                  ArrayList localArrayList7 = new ArrayList();
                  localArrayList7.clear();
                  for (int i7 = 0; i7 < localArrayList6.size(); i7++)
                    localArrayList7.add(((AdMarvelXMLElement)localArrayList6.get(i7)).b());
                  this.R.add(new AdMarvelVideoActivity.g(this, i6, localArrayList7));
                }
              }
            }
            else if (("midpoint".equalsIgnoreCase(str1)) && (this.k > 0))
            {
              int i4 = this.k / 2;
              if (i4 > 0)
              {
                AdMarvelXMLElement localAdMarvelXMLElement4 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0);
                if ((localAdMarvelXMLElement4 != null) && (localAdMarvelXMLElement4.c().containsKey("pixel")))
                {
                  ArrayList localArrayList4 = (ArrayList)localAdMarvelXMLElement4.c().get("pixel");
                  ArrayList localArrayList5 = new ArrayList();
                  localArrayList5.clear();
                  for (int i5 = 0; i5 < localArrayList4.size(); i5++)
                    localArrayList5.add(((AdMarvelXMLElement)localArrayList4.get(i5)).b());
                  this.R.add(new AdMarvelVideoActivity.g(this, i4, localArrayList5));
                }
              }
            }
            else if (("thirdQuartile".equalsIgnoreCase(str1)) && (this.k > 0))
            {
              int i2 = 3 * (this.k / 4);
              if (i2 > 0)
              {
                AdMarvelXMLElement localAdMarvelXMLElement3 = (AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0);
                if ((localAdMarvelXMLElement3 != null) && (localAdMarvelXMLElement3.c().containsKey("pixel")))
                {
                  ArrayList localArrayList2 = (ArrayList)localAdMarvelXMLElement3.c().get("pixel");
                  ArrayList localArrayList3 = new ArrayList();
                  localArrayList3.clear();
                  for (int i3 = 0; i3 < localArrayList2.size(); i3++)
                    localArrayList3.add(((AdMarvelXMLElement)localArrayList2.get(i3)).b());
                  this.R.add(new AdMarvelVideoActivity.g(this, i2, localArrayList3));
                }
              }
            }
            else if ("start".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0), AdMarvelVideoActivity.l.a);
            }
            else if ("complete".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0), AdMarvelVideoActivity.l.b);
            }
            else if ("pause".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0), AdMarvelVideoActivity.l.c);
            }
            else if ("resume".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0), AdMarvelVideoActivity.l.d);
            }
            else if ("close".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0), AdMarvelVideoActivity.l.e);
            }
            else if ("stop".equalsIgnoreCase(str1))
            {
              a((AdMarvelXMLElement)((ArrayList)localAdMarvelXMLElement2.c().get("pixels")).get(0), AdMarvelVideoActivity.l.f);
            }
          }
        }
      }
    }
  }

  public void b(boolean paramBoolean)
  {
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    if ((this.s) && (localLinearLayout != null))
    {
      if (localLinearLayout.getVisibility() == 0)
        break label91;
      if (paramBoolean)
      {
        a(localLinearLayout, paramBoolean);
        localLinearLayout.setVisibility(0);
        localLinearLayout.bringToFront();
        localLinearLayout.requestLayout();
        if ((this.Y != null) && (!this.Y.c()))
        {
          this.aa = System.currentTimeMillis();
          this.Y.b();
          this.Y.a();
        }
      }
    }
    label91: 
    while (paramBoolean)
      return;
    a(localLinearLayout, paramBoolean);
    localLinearLayout.setVisibility(4);
  }

  boolean b()
  {
    return this.r;
  }

  public void c()
  {
    s();
    a(AdMarvelVideoActivity.l.e);
    if ((this.R != null) && (this.R.size() > 0))
      this.R.clear();
    if ((this.Q != null) && (this.Q.size() > 0))
      this.Q.clear();
    if (b() == true)
    {
      if (AdMarvelInterstitialAds.getListener() != null)
      {
        AdMarvelInterstitialAds.getListener().b();
        this.ad = (1 + this.ad);
      }
      if (this.ad <= 2)
      {
        finish();
        return;
      }
    }
    finish();
  }

  public void c(String paramString)
  {
    if (this.L == null)
      return;
    if (this.L.isPlaying())
    {
      this.L.a();
      this.i = AdMarvelVideoActivity.k.d;
    }
    if (this.L.getVisibility() != 0)
    {
      this.L.setVisibility(0);
      this.L.requestFocus();
    }
    if ((this.z) && (this.K != null) && ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.k.a))))
      this.K.setVisibility(0);
    if ((this.R != null) && (this.R.size() > 0))
      this.R.clear();
    if ((this.Q != null) && (this.Q.size() > 0))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.putAll(this.Q);
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        AdMarvelVideoActivity.l locall = (AdMarvelVideoActivity.l)localIterator.next();
        if (locall != AdMarvelVideoActivity.l.e)
          this.Q.remove(locall);
      }
    }
    a("Loading Next Video...");
    if (this.B)
      this.B = false;
    this.A = true;
    if (this.T != null)
      this.T.setVisibility(4);
    this.L.a(Uri.parse(paramString));
    this.L.requestFocus();
    this.i = AdMarvelVideoActivity.k.a;
  }

  public void c(boolean paramBoolean)
  {
    if (this.M != null)
    {
      ad localad = (ad)this.M.get();
      if ((localad != null) && ((localad instanceof LinearLayout)))
      {
        int i1 = 0;
        if (i1 < localad.getChildCount())
        {
          ViewSwitcher localViewSwitcher;
          ad.d locald;
          if ((localad.getChildAt(i1) instanceof ViewSwitcher))
          {
            localViewSwitcher = (ViewSwitcher)localad.getChildAt(i1);
            locald = (ad.d)localViewSwitcher.getCurrentView();
            if ((paramBoolean) || (locald == null) || (!locald.c.equalsIgnoreCase("pause")))
              break label120;
            if (localViewSwitcher.getDisplayedChild() != 0)
              break label112;
            localViewSwitcher.showNext();
          }
          while (true)
          {
            i1++;
            break;
            label112: localViewSwitcher.showPrevious();
            continue;
            label120: if ((!paramBoolean) && (locald != null) && (locald.c.equalsIgnoreCase("stop")))
            {
              if (localViewSwitcher.getDisplayedChild() == 0)
                localViewSwitcher.showNext();
              else
                localViewSwitcher.showPrevious();
            }
            else if ((paramBoolean) && (locald != null) && (locald.c.equalsIgnoreCase("replay")))
            {
              if (localViewSwitcher.getDisplayedChild() == 0)
                localViewSwitcher.showNext();
              else
                localViewSwitcher.showPrevious();
            }
            else if ((paramBoolean) && (locald != null) && (locald.c.equalsIgnoreCase("resume")))
              if (localViewSwitcher.getDisplayedChild() == 0)
                localViewSwitcher.showNext();
              else
                localViewSwitcher.showPrevious();
          }
        }
      }
    }
  }

  String d(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      Object localObject = paramString;
      try
      {
        while (true)
        {
          ab localab = new ab(this, this.N);
          HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL((String)localObject).openConnection();
          localHttpURLConnection.setRequestMethod("GET");
          localHttpURLConnection.setDoInput(true);
          localHttpURLConnection.setUseCaches(false);
          localHttpURLConnection.setRequestProperty("User-Agent", localab.a());
          localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
          localHttpURLConnection.setRequestProperty("Content-Length", "0");
          localHttpURLConnection.setConnectTimeout(4000);
          localHttpURLConnection.setReadTimeout(5000);
          localHttpURLConnection.setInstanceFollowRedirects(false);
          localHttpURLConnection.connect();
          int i1 = localHttpURLConnection.getResponseCode();
          if ((i1 != 301) && (i1 != 302))
            break;
          String str = localHttpURLConnection.getHeaderField("Location");
          localObject = str;
        }
      }
      catch (Exception localException)
      {
        if ((localObject != null) && (((String)localObject).length() > 0))
          paramString = (String)localObject;
      }
    }
    return paramString;
  }

  public void d()
  {
    if (this.L == null)
      return;
    this.L.a();
    this.i = AdMarvelVideoActivity.k.d;
  }

  public void e()
  {
    if (this.L == null);
    do
    {
      return;
      if ((this.i == AdMarvelVideoActivity.k.f) || (this.i == AdMarvelVideoActivity.k.c))
      {
        a("Resuming Video...");
        this.L.e();
        this.i = AdMarvelVideoActivity.k.b;
        return;
      }
    }
    while ((this.i != AdMarvelVideoActivity.k.d) && (this.i != AdMarvelVideoActivity.k.e));
    f();
  }

  public void f()
  {
    if (this.L == null);
    while ((this.i != AdMarvelVideoActivity.k.e) && (this.i != AdMarvelVideoActivity.k.d) && (this.i != AdMarvelVideoActivity.k.c) && (this.i != AdMarvelVideoActivity.k.f))
      return;
    if ((this.i == AdMarvelVideoActivity.k.c) || (this.i == AdMarvelVideoActivity.k.f))
    {
      this.L.a();
      this.i = AdMarvelVideoActivity.k.d;
    }
    if (this.L.getVisibility() != 0)
      this.L.setVisibility(0);
    if ((this.z) && (this.K != null) && ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.k.a))))
      this.K.setVisibility(0);
    if ((this.R != null) && (this.R.size() > 0))
      this.R.clear();
    if ((this.Q != null) && (this.Q.size() > 0))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.putAll(this.Q);
      Iterator localIterator = localHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        AdMarvelVideoActivity.l locall = (AdMarvelVideoActivity.l)localIterator.next();
        if (locall != AdMarvelVideoActivity.l.e)
          this.Q.remove(locall);
      }
    }
    if (this.B)
      this.B = false;
    a("Replaying Video...");
    if ((this.x != null) && (this.x.length() > 0))
    {
      this.L.a(Uri.parse(this.x));
      this.i = AdMarvelVideoActivity.k.a;
    }
    this.A = false;
    this.L.requestFocus();
  }

  public void g()
  {
    this.N.postDelayed(new AdMarvelVideoActivity.e(this.n, this), 3000L);
  }

  public void h()
  {
    a(AdMarvelVideoActivity.l.c);
  }

  public void i()
  {
    a(AdMarvelVideoActivity.l.f);
    if (this.W != null)
      this.W.b();
    if (this.Y != null)
      this.Y.b();
    if ((this.z) && (this.K != null) && ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.k.d))))
      this.K.setVisibility(0);
    if (this.L != null)
      this.L.setVisibility(4);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    if ((this.s) && (localLinearLayout != null) && (localLinearLayout.getVisibility() != 0))
    {
      a(localLinearLayout, true);
      localLinearLayout.setVisibility(0);
      localLinearLayout.bringToFront();
      localLinearLayout.requestLayout();
    }
    if ((this.k > 0) && (this.T != null) && (this.T.getVisibility() == 0))
      a(0, this.T);
    c(false);
  }

  public void j()
  {
    a(AdMarvelVideoActivity.l.d);
    this.i = AdMarvelVideoActivity.k.b;
  }

  public void k()
  {
    if (this.N != null)
      this.N.post(this.ag);
    if ((this.W != null) && (!this.A) && (this.i != AdMarvelVideoActivity.k.e) && (this.i != AdMarvelVideoActivity.k.d))
      this.W.a();
    if ((this.z) && (this.K != null) && (this.K.getVisibility() == 0))
      this.K.setVisibility(4);
  }

  public void l()
  {
    if (this.N != null)
      this.N.post(this.ag);
    Toast.makeText(this, "Network Connection Unavailable", 0).show();
  }

  public void m()
  {
    c();
  }

  public void n()
  {
  }

  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    this.i = AdMarvelVideoActivity.k.e;
    a(AdMarvelVideoActivity.l.b);
    s();
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    Logging.log("Video onCompletion is called");
    if ((this.z) && (this.K != null) && ((this.S == null) || (this.S.size() <= 0) || (this.S.contains(AdMarvelVideoActivity.k.d))))
      this.K.setVisibility(0);
    if (this.L != null)
      this.L.setVisibility(4);
    if ((this.s) && (localLinearLayout != null) && (localLinearLayout.getVisibility() != 0))
    {
      a(localLinearLayout, true);
      localLinearLayout.setVisibility(0);
      localLinearLayout.bringToFront();
      localLinearLayout.requestLayout();
    }
    if ((this.k > 0) && (this.T != null) && (this.T.getVisibility() == 0))
      a(0, this.T);
    c(false);
    ad localad;
    if (this.M != null)
    {
      localad = (ad)this.M.get();
      if (localad == null);
    }
    for (boolean bool = localad.b(); ; bool = false)
    {
      if ((!this.s) || (!bool) || (this.B))
      {
        if (this.L != null)
          this.L.a(true);
        c();
      }
      return;
    }
  }

  // ERROR //
  protected void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 1050	android/app/Activity:onCreate	(Landroid/os/Bundle;)V
    //   5: getstatic 1052	com/admarvel/android/ads/AdMarvelVideoActivity:l	Landroid/app/Activity;
    //   8: ifnonnull +948 -> 956
    //   11: aload_0
    //   12: putstatic 1052	com/admarvel/android/ads/AdMarvelVideoActivity:l	Landroid/app/Activity;
    //   15: getstatic 1057	android/os/Build:MODEL	Ljava/lang/String;
    //   18: ldc_w 1059
    //   21: invokevirtual 799	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   24: ifne +15 -> 39
    //   27: getstatic 1062	android/os/Build:PRODUCT	Ljava/lang/String;
    //   30: ldc_w 1059
    //   33: invokevirtual 799	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   36: ifeq +933 -> 969
    //   39: aload_0
    //   40: invokevirtual 1066	com/admarvel/android/ads/AdMarvelVideoActivity:getWindow	()Landroid/view/Window;
    //   43: sipush 256
    //   46: invokevirtual 1071	android/view/Window:addFlags	(I)V
    //   49: aload_0
    //   50: invokevirtual 1066	com/admarvel/android/ads/AdMarvelVideoActivity:getWindow	()Landroid/view/Window;
    //   53: sipush 1024
    //   56: invokevirtual 1074	android/view/Window:clearFlags	(I)V
    //   59: invokestatic 423	com/admarvel/android/ads/ac:a	()I
    //   62: bipush 11
    //   64: if_icmplt +7 -> 71
    //   67: aload_0
    //   68: invokestatic 1079	com/admarvel/android/ads/AdMarvelVideoActivity$f:a	(Landroid/app/Activity;)V
    //   71: aload_0
    //   72: invokevirtual 1083	com/admarvel/android/ads/AdMarvelVideoActivity:getIntent	()Landroid/content/Intent;
    //   75: invokevirtual 1089	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   78: astore_2
    //   79: aload_2
    //   80: ifnull +106 -> 186
    //   83: aload_2
    //   84: ldc_w 1091
    //   87: invokevirtual 1097	android/os/Bundle:getByteArray	(Ljava/lang/String;)[B
    //   90: astore 26
    //   92: aload 26
    //   94: ifnull +51 -> 145
    //   97: aload_0
    //   98: new 1099	java/io/ObjectInputStream
    //   101: dup
    //   102: new 1101	java/io/ByteArrayInputStream
    //   105: dup
    //   106: aload 26
    //   108: invokespecial 1104	java/io/ByteArrayInputStream:<init>	([B)V
    //   111: invokespecial 1107	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   114: invokevirtual 1110	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   117: checkcast 1112	com/admarvel/android/ads/AdMarvelAd
    //   120: putfield 1004	com/admarvel/android/ads/AdMarvelVideoActivity:n	Lcom/admarvel/android/ads/AdMarvelAd;
    //   123: aload_0
    //   124: getfield 1004	com/admarvel/android/ads/AdMarvelVideoActivity:n	Lcom/admarvel/android/ads/AdMarvelAd;
    //   127: ifnull +18 -> 145
    //   130: aload_0
    //   131: new 476	java/lang/ref/WeakReference
    //   134: dup
    //   135: aload_0
    //   136: getfield 1004	com/admarvel/android/ads/AdMarvelVideoActivity:n	Lcom/admarvel/android/ads/AdMarvelAd;
    //   139: invokespecial 479	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   142: putfield 1114	com/admarvel/android/ads/AdMarvelVideoActivity:m	Ljava/lang/ref/WeakReference;
    //   145: aload_2
    //   146: ldc_w 1116
    //   149: invokevirtual 1119	android/os/Bundle:getBoolean	(Ljava/lang/String;)Z
    //   152: ifeq +846 -> 998
    //   155: aload_0
    //   156: aload_0
    //   157: aload_2
    //   158: ldc_w 1121
    //   161: invokevirtual 1124	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   164: invokespecial 1126	com/admarvel/android/ads/AdMarvelVideoActivity:f	(Ljava/lang/String;)Ljava/lang/String;
    //   167: putfield 1128	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   170: aload_0
    //   171: aload_2
    //   172: ldc_w 1130
    //   175: invokevirtual 1124	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   178: putfield 471	com/admarvel/android/ads/AdMarvelVideoActivity:P	Ljava/lang/String;
    //   181: aload_0
    //   182: iconst_0
    //   183: putfield 874	com/admarvel/android/ads/AdMarvelVideoActivity:r	Z
    //   186: aload_0
    //   187: getstatic 444	com/admarvel/android/ads/AdMarvelVideoActivity$k:a	Lcom/admarvel/android/ads/AdMarvelVideoActivity$k;
    //   190: putfield 687	com/admarvel/android/ads/AdMarvelVideoActivity:i	Lcom/admarvel/android/ads/AdMarvelVideoActivity$k;
    //   193: new 333	android/widget/RelativeLayout
    //   196: dup
    //   197: aload_0
    //   198: invokespecial 336	android/widget/RelativeLayout:<init>	(Landroid/content/Context;)V
    //   201: astore_3
    //   202: aload_3
    //   203: getstatic 107	com/admarvel/android/ads/AdMarvelVideoActivity:a	I
    //   206: invokevirtual 1131	android/widget/RelativeLayout:setId	(I)V
    //   209: aload_3
    //   210: new 1133	android/view/ViewGroup$LayoutParams
    //   213: dup
    //   214: iconst_m1
    //   215: iconst_m1
    //   216: invokespecial 1134	android/view/ViewGroup$LayoutParams:<init>	(II)V
    //   219: invokevirtual 348	android/widget/RelativeLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   222: aload_0
    //   223: aload_3
    //   224: invokevirtual 1137	com/admarvel/android/ads/AdMarvelVideoActivity:setContentView	(Landroid/view/View;)V
    //   227: new 262	android/widget/LinearLayout
    //   230: dup
    //   231: aload_0
    //   232: invokespecial 461	android/widget/LinearLayout:<init>	(Landroid/content/Context;)V
    //   235: astore 4
    //   237: aload 4
    //   239: getstatic 112	com/admarvel/android/ads/AdMarvelVideoActivity:c	I
    //   242: invokevirtual 464	android/widget/LinearLayout:setId	(I)V
    //   245: new 1139	android/widget/LinearLayout$LayoutParams
    //   248: dup
    //   249: iconst_m1
    //   250: iconst_m1
    //   251: invokespecial 1140	android/widget/LinearLayout$LayoutParams:<init>	(II)V
    //   254: astore 5
    //   256: aload 5
    //   258: ldc_w 1141
    //   261: putfield 1144	android/widget/LinearLayout$LayoutParams:weight	F
    //   264: aload 4
    //   266: aload 5
    //   268: invokevirtual 483	android/widget/LinearLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   271: aload 4
    //   273: aload_0
    //   274: getfield 200	com/admarvel/android/ads/AdMarvelVideoActivity:ak	Landroid/view/View$OnTouchListener;
    //   277: invokevirtual 1148	android/widget/LinearLayout:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   280: aload 4
    //   282: ldc_w 1149
    //   285: invokevirtual 1150	android/widget/LinearLayout:setBackgroundColor	(I)V
    //   288: new 333	android/widget/RelativeLayout
    //   291: dup
    //   292: aload_0
    //   293: invokespecial 336	android/widget/RelativeLayout:<init>	(Landroid/content/Context;)V
    //   296: astore 6
    //   298: aload 6
    //   300: new 338	android/widget/RelativeLayout$LayoutParams
    //   303: dup
    //   304: iconst_m1
    //   305: iconst_m1
    //   306: invokespecial 341	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   309: invokevirtual 348	android/widget/RelativeLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   312: aload 4
    //   314: aload 6
    //   316: invokevirtual 482	android/widget/LinearLayout:addView	(Landroid/view/View;)V
    //   319: new 338	android/widget/RelativeLayout$LayoutParams
    //   322: dup
    //   323: iconst_m1
    //   324: iconst_m1
    //   325: invokespecial 341	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   328: astore 7
    //   330: aload 7
    //   332: bipush 13
    //   334: invokevirtual 344	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   337: aload_0
    //   338: new 654	com/admarvel/android/ads/p
    //   341: dup
    //   342: aload_0
    //   343: aload_0
    //   344: invokespecial 1153	com/admarvel/android/ads/p:<init>	(Lcom/admarvel/android/ads/AdMarvelVideoActivity;Landroid/content/Context;)V
    //   347: putfield 207	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/p;
    //   350: aload_0
    //   351: getfield 207	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/p;
    //   354: aload 7
    //   356: invokevirtual 1154	com/admarvel/android/ads/p:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   359: aload_0
    //   360: getfield 207	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/p;
    //   363: aload_0
    //   364: invokevirtual 1157	com/admarvel/android/ads/p:a	(Lcom/admarvel/android/ads/p$a;)V
    //   367: aload 6
    //   369: aload_0
    //   370: getfield 207	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/p;
    //   373: invokevirtual 367	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   376: aload_0
    //   377: new 434	android/os/Handler
    //   380: dup
    //   381: invokespecial 1158	android/os/Handler:<init>	()V
    //   384: putfield 425	com/admarvel/android/ads/AdMarvelVideoActivity:N	Landroid/os/Handler;
    //   387: aload_0
    //   388: new 245	com/admarvel/android/ads/ab
    //   391: dup
    //   392: aload_0
    //   393: aload_0
    //   394: getfield 425	com/admarvel/android/ads/AdMarvelVideoActivity:N	Landroid/os/Handler;
    //   397: invokespecial 937	com/admarvel/android/ads/ab:<init>	(Landroid/content/Context;Landroid/os/Handler;)V
    //   400: putfield 212	com/admarvel/android/ads/AdMarvelVideoActivity:O	Lcom/admarvel/android/ads/ab;
    //   403: aload_0
    //   404: aload_0
    //   405: getfield 1128	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   408: invokevirtual 1160	com/admarvel/android/ads/AdMarvelVideoActivity:b	(Ljava/lang/String;)V
    //   411: aload_0
    //   412: getfield 119	com/admarvel/android/ads/AdMarvelVideoActivity:s	Z
    //   415: ifeq +24 -> 439
    //   418: aload_0
    //   419: aload_0
    //   420: aload_0
    //   421: getfield 1128	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   424: invokespecial 1162	com/admarvel/android/ads/AdMarvelVideoActivity:e	(Ljava/lang/String;)Landroid/widget/LinearLayout;
    //   427: putfield 1164	com/admarvel/android/ads/AdMarvelVideoActivity:g	Landroid/widget/LinearLayout;
    //   430: aload_0
    //   431: getfield 1164	com/admarvel/android/ads/AdMarvelVideoActivity:g	Landroid/widget/LinearLayout;
    //   434: bipush 8
    //   436: invokevirtual 267	android/widget/LinearLayout:setVisibility	(I)V
    //   439: aload_3
    //   440: aload 4
    //   442: invokevirtual 367	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   445: aload_0
    //   446: getfield 739	com/admarvel/android/ads/AdMarvelVideoActivity:x	Ljava/lang/String;
    //   449: ifnull +671 -> 1120
    //   452: aload_0
    //   453: getfield 739	com/admarvel/android/ads/AdMarvelVideoActivity:x	Ljava/lang/String;
    //   456: invokevirtual 490	java/lang/String:length	()I
    //   459: istore 24
    //   461: iload 24
    //   463: ifle +657 -> 1120
    //   466: aload_0
    //   467: getfield 207	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/p;
    //   470: aload_0
    //   471: getfield 739	com/admarvel/android/ads/AdMarvelVideoActivity:x	Ljava/lang/String;
    //   474: invokestatic 921	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   477: invokevirtual 924	com/admarvel/android/ads/p:a	(Landroid/net/Uri;)V
    //   480: aload_0
    //   481: getfield 207	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/p;
    //   484: aload_0
    //   485: invokevirtual 1167	com/admarvel/android/ads/p:a	(Landroid/media/MediaPlayer$OnCompletionListener;)V
    //   488: aload_0
    //   489: getfield 207	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/p;
    //   492: aload_0
    //   493: invokevirtual 1170	com/admarvel/android/ads/p:a	(Landroid/media/MediaPlayer$OnPreparedListener;)V
    //   496: aload_0
    //   497: getfield 207	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/p;
    //   500: aload_0
    //   501: invokevirtual 1173	com/admarvel/android/ads/p:a	(Landroid/media/MediaPlayer$OnErrorListener;)V
    //   504: aload_0
    //   505: getfield 207	com/admarvel/android/ads/AdMarvelVideoActivity:L	Lcom/admarvel/android/ads/p;
    //   508: invokevirtual 901	com/admarvel/android/ads/p:requestFocus	()Z
    //   511: pop
    //   512: aload_0
    //   513: getfield 874	com/admarvel/android/ads/AdMarvelVideoActivity:r	Z
    //   516: iconst_1
    //   517: if_icmpne +16 -> 533
    //   520: invokestatic 888	com/admarvel/android/ads/AdMarvelInterstitialAds:getListener	()Lcom/admarvel/android/ads/i;
    //   523: ifnull +10 -> 533
    //   526: invokestatic 888	com/admarvel/android/ads/AdMarvelInterstitialAds:getListener	()Lcom/admarvel/android/ads/i;
    //   529: aload_0
    //   530: invokevirtual 1175	com/admarvel/android/ads/i:a	(Lcom/admarvel/android/ads/AdMarvelVideoActivity;)V
    //   533: aload_0
    //   534: getfield 129	com/admarvel/android/ads/AdMarvelVideoActivity:z	Z
    //   537: ifeq +25 -> 562
    //   540: aload_0
    //   541: getfield 429	com/admarvel/android/ads/AdMarvelVideoActivity:y	Ljava/lang/String;
    //   544: ifnull +18 -> 562
    //   547: aload_0
    //   548: getfield 429	com/admarvel/android/ads/AdMarvelVideoActivity:y	Ljava/lang/String;
    //   551: invokevirtual 490	java/lang/String:length	()I
    //   554: ifle +8 -> 562
    //   557: aload_0
    //   558: aload_3
    //   559: invokespecial 1177	com/admarvel/android/ads/AdMarvelVideoActivity:b	(Landroid/widget/RelativeLayout;)V
    //   562: aload_0
    //   563: getfield 119	com/admarvel/android/ads/AdMarvelVideoActivity:s	Z
    //   566: ifeq +18 -> 584
    //   569: aload_0
    //   570: getfield 1164	com/admarvel/android/ads/AdMarvelVideoActivity:g	Landroid/widget/LinearLayout;
    //   573: ifnull +11 -> 584
    //   576: aload_3
    //   577: aload_0
    //   578: getfield 1164	com/admarvel/android/ads/AdMarvelVideoActivity:g	Landroid/widget/LinearLayout;
    //   581: invokevirtual 367	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   584: aload_0
    //   585: getfield 481	com/admarvel/android/ads/AdMarvelVideoActivity:M	Ljava/lang/ref/WeakReference;
    //   588: ifnull +173 -> 761
    //   591: aload_0
    //   592: getfield 481	com/admarvel/android/ads/AdMarvelVideoActivity:M	Ljava/lang/ref/WeakReference;
    //   595: invokevirtual 604	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   598: checkcast 469	com/admarvel/android/ads/ad
    //   601: astore 20
    //   603: aload 20
    //   605: ifnull +156 -> 761
    //   608: aload_0
    //   609: new 333	android/widget/RelativeLayout
    //   612: dup
    //   613: aload_0
    //   614: invokespecial 336	android/widget/RelativeLayout:<init>	(Landroid/content/Context;)V
    //   617: putfield 600	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   620: new 338	android/widget/RelativeLayout$LayoutParams
    //   623: dup
    //   624: bipush 254
    //   626: bipush 254
    //   628: invokespecial 341	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   631: astore 21
    //   633: aload 21
    //   635: bipush 10
    //   637: invokevirtual 344	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   640: aload 21
    //   642: bipush 11
    //   644: invokevirtual 344	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   647: aload_0
    //   648: getfield 600	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   651: aload 21
    //   653: invokevirtual 348	android/widget/RelativeLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   656: aload_0
    //   657: getfield 600	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   660: iconst_0
    //   661: invokevirtual 351	android/widget/RelativeLayout:setBackgroundColor	(I)V
    //   664: new 338	android/widget/RelativeLayout$LayoutParams
    //   667: dup
    //   668: bipush 254
    //   670: bipush 254
    //   672: invokespecial 341	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   675: astore 22
    //   677: aload 22
    //   679: bipush 20
    //   681: bipush 20
    //   683: bipush 20
    //   685: bipush 20
    //   687: invokevirtual 1181	android/widget/RelativeLayout$LayoutParams:setMargins	(IIII)V
    //   690: aload 22
    //   692: bipush 11
    //   694: invokevirtual 344	android/widget/RelativeLayout$LayoutParams:addRule	(I)V
    //   697: aload 20
    //   699: invokevirtual 1184	com/admarvel/android/ads/ad:a	()Landroid/widget/LinearLayout;
    //   702: ifnull +59 -> 761
    //   705: aload_0
    //   706: getfield 600	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   709: aload 20
    //   711: invokevirtual 1184	com/admarvel/android/ads/ad:a	()Landroid/widget/LinearLayout;
    //   714: aload 22
    //   716: invokevirtual 1186	android/widget/RelativeLayout:addView	(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   719: aload_0
    //   720: getfield 600	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   723: ldc_w 1188
    //   726: invokevirtual 1189	android/widget/RelativeLayout:findViewWithTag	(Ljava/lang/Object;)Landroid/view/View;
    //   729: pop
    //   730: aload_0
    //   731: getfield 600	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   734: new 1191	com/admarvel/android/ads/AdMarvelVideoActivity$1
    //   737: dup
    //   738: aload_0
    //   739: invokespecial 1192	com/admarvel/android/ads/AdMarvelVideoActivity$1:<init>	(Lcom/admarvel/android/ads/AdMarvelVideoActivity;)V
    //   742: invokevirtual 1196	android/widget/RelativeLayout:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   745: aload_0
    //   746: getfield 600	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   749: iconst_1
    //   750: invokevirtual 1199	android/widget/RelativeLayout:setClickable	(Z)V
    //   753: aload_3
    //   754: aload_0
    //   755: getfield 600	com/admarvel/android/ads/AdMarvelVideoActivity:o	Landroid/widget/RelativeLayout;
    //   758: invokevirtual 367	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   761: aload_0
    //   762: getfield 135	com/admarvel/android/ads/AdMarvelVideoActivity:C	Z
    //   765: ifeq +12 -> 777
    //   768: aload_0
    //   769: aload_3
    //   770: invokespecial 1201	com/admarvel/android/ads/AdMarvelVideoActivity:a	(Landroid/widget/RelativeLayout;)V
    //   773: aload_0
    //   774: invokespecial 1203	com/admarvel/android/ads/AdMarvelVideoActivity:p	()V
    //   777: aload_0
    //   778: getfield 125	com/admarvel/android/ads/AdMarvelVideoActivity:v	Z
    //   781: ifeq +507 -> 1288
    //   784: aload_0
    //   785: getfield 127	com/admarvel/android/ads/AdMarvelVideoActivity:w	I
    //   788: ifle +500 -> 1288
    //   791: aload_0
    //   792: getfield 481	com/admarvel/android/ads/AdMarvelVideoActivity:M	Ljava/lang/ref/WeakReference;
    //   795: ifnull +493 -> 1288
    //   798: aload_0
    //   799: getfield 481	com/admarvel/android/ads/AdMarvelVideoActivity:M	Ljava/lang/ref/WeakReference;
    //   802: invokevirtual 604	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   805: checkcast 469	com/admarvel/android/ads/ad
    //   808: astore 15
    //   810: aload 15
    //   812: ifnull +476 -> 1288
    //   815: aload 15
    //   817: instanceof 262
    //   820: ifeq +468 -> 1288
    //   823: aload 15
    //   825: ifnull +463 -> 1288
    //   828: aload_0
    //   829: getfield 119	com/admarvel/android/ads/AdMarvelVideoActivity:s	Z
    //   832: ifeq +456 -> 1288
    //   835: iconst_0
    //   836: istore 16
    //   838: iload 16
    //   840: aload 15
    //   842: invokevirtual 607	android/widget/LinearLayout:getChildCount	()I
    //   845: if_icmpge +358 -> 1203
    //   848: aload 15
    //   850: iload 16
    //   852: invokevirtual 611	android/widget/LinearLayout:getChildAt	(I)Landroid/view/View;
    //   855: instanceof 619
    //   858: ifeq +92 -> 950
    //   861: aload 15
    //   863: iload 16
    //   865: invokevirtual 611	android/widget/LinearLayout:getChildAt	(I)Landroid/view/View;
    //   868: checkcast 619	com/admarvel/android/ads/ad$d
    //   871: astore 17
    //   873: aload 17
    //   875: ifnull +75 -> 950
    //   878: aload 17
    //   880: getfield 624	com/admarvel/android/ads/ad$d:c	Ljava/lang/String;
    //   883: ldc_w 1205
    //   886: invokevirtual 515	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   889: ifeq +61 -> 950
    //   892: aload 17
    //   894: iconst_0
    //   895: invokevirtual 1206	com/admarvel/android/ads/ad$d:setClickable	(Z)V
    //   898: aload 17
    //   900: iconst_0
    //   901: invokevirtual 1209	com/admarvel/android/ads/ad$d:setEnabled	(Z)V
    //   904: aload 17
    //   906: iconst_0
    //   907: invokevirtual 1210	com/admarvel/android/ads/ad$d:getChildAt	(I)Landroid/view/View;
    //   910: instanceof 415
    //   913: ifeq +37 -> 950
    //   916: aload 17
    //   918: iconst_0
    //   919: invokevirtual 1210	com/admarvel/android/ads/ad$d:getChildAt	(I)Landroid/view/View;
    //   922: checkcast 415	android/widget/ImageView
    //   925: astore 18
    //   927: aload 18
    //   929: ifnull +209 -> 1138
    //   932: aload 18
    //   934: invokevirtual 1214	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   937: ifnull +201 -> 1138
    //   940: aload 18
    //   942: invokevirtual 1214	android/widget/ImageView:getDrawable	()Landroid/graphics/drawable/Drawable;
    //   945: bipush 25
    //   947: invokevirtual 1219	android/graphics/drawable/Drawable:setAlpha	(I)V
    //   950: iinc 16 1
    //   953: goto -115 -> 838
    //   956: getstatic 1052	com/admarvel/android/ads/AdMarvelVideoActivity:l	Landroid/app/Activity;
    //   959: invokevirtual 1220	android/app/Activity:finish	()V
    //   962: aload_0
    //   963: putstatic 1052	com/admarvel/android/ads/AdMarvelVideoActivity:l	Landroid/app/Activity;
    //   966: goto -951 -> 15
    //   969: aload_0
    //   970: invokevirtual 1066	com/admarvel/android/ads/AdMarvelVideoActivity:getWindow	()Landroid/view/Window;
    //   973: sipush 512
    //   976: sipush 512
    //   979: invokevirtual 1223	android/view/Window:setFlags	(II)V
    //   982: goto -923 -> 59
    //   985: astore 27
    //   987: aload 27
    //   989: invokestatic 1229	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   992: invokestatic 1037	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   995: goto -850 -> 145
    //   998: aload_2
    //   999: ldc_w 1231
    //   1002: invokevirtual 1233	android/os/Bundle:containsKey	(Ljava/lang/String;)Z
    //   1005: ifeq +58 -> 1063
    //   1008: aload_0
    //   1009: aload_2
    //   1010: ldc_w 1231
    //   1013: invokevirtual 1124	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1016: putfield 1128	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   1019: aload_0
    //   1020: aload_2
    //   1021: ldc_w 1130
    //   1024: invokevirtual 1124	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1027: putfield 471	com/admarvel/android/ads/AdMarvelVideoActivity:P	Ljava/lang/String;
    //   1030: aload_0
    //   1031: getfield 1128	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   1034: ifnull +21 -> 1055
    //   1037: aload_0
    //   1038: getfield 1128	com/admarvel/android/ads/AdMarvelVideoActivity:p	Ljava/lang/String;
    //   1041: invokevirtual 490	java/lang/String:length	()I
    //   1044: ifle +11 -> 1055
    //   1047: aload_0
    //   1048: iconst_1
    //   1049: putfield 874	com/admarvel/android/ads/AdMarvelVideoActivity:r	Z
    //   1052: goto -866 -> 186
    //   1055: aload_0
    //   1056: iconst_0
    //   1057: putfield 874	com/admarvel/android/ads/AdMarvelVideoActivity:r	Z
    //   1060: goto -874 -> 186
    //   1063: aload_0
    //   1064: invokevirtual 894	com/admarvel/android/ads/AdMarvelVideoActivity:finish	()V
    //   1067: goto -881 -> 186
    //   1070: astore 11
    //   1072: aload 11
    //   1074: invokevirtual 1236	java/lang/Exception:printStackTrace	()V
    //   1077: goto -666 -> 411
    //   1080: astore 10
    //   1082: aload 10
    //   1084: invokevirtual 1239	javax/xml/parsers/ParserConfigurationException:getMessage	()Ljava/lang/String;
    //   1087: invokestatic 1037	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1090: return
    //   1091: astore 25
    //   1093: new 273	java/lang/StringBuilder
    //   1096: dup
    //   1097: invokespecial 274	java/lang/StringBuilder:<init>	()V
    //   1100: ldc_w 1241
    //   1103: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1106: aload 25
    //   1108: invokevirtual 1242	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1111: invokevirtual 280	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1114: invokevirtual 289	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1117: invokestatic 1037	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1120: aload_0
    //   1121: invokevirtual 894	com/admarvel/android/ads/AdMarvelVideoActivity:finish	()V
    //   1124: goto -644 -> 480
    //   1127: astore 9
    //   1129: aload 9
    //   1131: invokevirtual 1243	org/xml/sax/SAXException:getMessage	()Ljava/lang/String;
    //   1134: invokestatic 1037	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1137: return
    //   1138: aload 18
    //   1140: ifnull -190 -> 950
    //   1143: aload_0
    //   1144: getfield 486	com/admarvel/android/ads/AdMarvelVideoActivity:Z	Lcom/admarvel/android/ads/AdMarvelVideoActivity$i;
    //   1147: ifnonnull -197 -> 950
    //   1150: new 1245	com/admarvel/android/ads/AdMarvelVideoActivity$a
    //   1153: dup
    //   1154: aload_0
    //   1155: aload 18
    //   1157: invokespecial 1246	com/admarvel/android/ads/AdMarvelVideoActivity$a:<init>	(Lcom/admarvel/android/ads/AdMarvelVideoActivity;Landroid/widget/ImageView;)V
    //   1160: astore 19
    //   1162: aload_0
    //   1163: new 635	com/admarvel/android/ads/AdMarvelVideoActivity$i
    //   1166: dup
    //   1167: aload_0
    //   1168: getfield 425	com/admarvel/android/ads/AdMarvelVideoActivity:N	Landroid/os/Handler;
    //   1171: aload 19
    //   1173: sipush 1000
    //   1176: invokespecial 678	com/admarvel/android/ads/AdMarvelVideoActivity$i:<init>	(Landroid/os/Handler;Ljava/lang/Runnable;I)V
    //   1179: putfield 486	com/admarvel/android/ads/AdMarvelVideoActivity:Z	Lcom/admarvel/android/ads/AdMarvelVideoActivity$i;
    //   1182: aload_0
    //   1183: getfield 486	com/admarvel/android/ads/AdMarvelVideoActivity:Z	Lcom/admarvel/android/ads/AdMarvelVideoActivity$i;
    //   1186: invokevirtual 680	com/admarvel/android/ads/AdMarvelVideoActivity$i:a	()V
    //   1189: goto -239 -> 950
    //   1192: astore 8
    //   1194: aload 8
    //   1196: invokevirtual 1247	java/io/IOException:getMessage	()Ljava/lang/String;
    //   1199: invokestatic 1037	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   1202: return
    //   1203: aload_0
    //   1204: new 635	com/admarvel/android/ads/AdMarvelVideoActivity$i
    //   1207: dup
    //   1208: aload_0
    //   1209: getfield 425	com/admarvel/android/ads/AdMarvelVideoActivity:N	Landroid/os/Handler;
    //   1212: aload_0
    //   1213: getfield 175	com/admarvel/android/ads/AdMarvelVideoActivity:af	Ljava/lang/Runnable;
    //   1216: sipush 1000
    //   1219: aload_0
    //   1220: getfield 127	com/admarvel/android/ads/AdMarvelVideoActivity:w	I
    //   1223: imul
    //   1224: invokespecial 678	com/admarvel/android/ads/AdMarvelVideoActivity$i:<init>	(Landroid/os/Handler;Ljava/lang/Runnable;I)V
    //   1227: putfield 639	com/admarvel/android/ads/AdMarvelVideoActivity:V	Lcom/admarvel/android/ads/AdMarvelVideoActivity$i;
    //   1230: aload_0
    //   1231: getfield 639	com/admarvel/android/ads/AdMarvelVideoActivity:V	Lcom/admarvel/android/ads/AdMarvelVideoActivity$i;
    //   1234: invokevirtual 680	com/admarvel/android/ads/AdMarvelVideoActivity$i:a	()V
    //   1237: aload_0
    //   1238: getfield 135	com/admarvel/android/ads/AdMarvelVideoActivity:C	Z
    //   1241: ifeq +47 -> 1288
    //   1244: aload_0
    //   1245: getfield 586	com/admarvel/android/ads/AdMarvelVideoActivity:X	Lcom/admarvel/android/ads/AdMarvelVideoActivity$i;
    //   1248: ifnonnull +40 -> 1288
    //   1251: aload_0
    //   1252: invokestatic 872	java/lang/System:currentTimeMillis	()J
    //   1255: putfield 593	com/admarvel/android/ads/AdMarvelVideoActivity:E	J
    //   1258: aload_0
    //   1259: new 635	com/admarvel/android/ads/AdMarvelVideoActivity$i
    //   1262: dup
    //   1263: aload_0
    //   1264: getfield 425	com/admarvel/android/ads/AdMarvelVideoActivity:N	Landroid/os/Handler;
    //   1267: aload_0
    //   1268: getfield 185	com/admarvel/android/ads/AdMarvelVideoActivity:ah	Ljava/lang/Runnable;
    //   1271: sipush 500
    //   1274: iconst_0
    //   1275: invokespecial 1250	com/admarvel/android/ads/AdMarvelVideoActivity$i:<init>	(Landroid/os/Handler;Ljava/lang/Runnable;IZ)V
    //   1278: putfield 586	com/admarvel/android/ads/AdMarvelVideoActivity:X	Lcom/admarvel/android/ads/AdMarvelVideoActivity$i;
    //   1281: aload_0
    //   1282: getfield 586	com/admarvel/android/ads/AdMarvelVideoActivity:X	Lcom/admarvel/android/ads/AdMarvelVideoActivity$i;
    //   1285: invokevirtual 680	com/admarvel/android/ads/AdMarvelVideoActivity$i:a	()V
    //   1288: aload_3
    //   1289: aload_0
    //   1290: getfield 195	com/admarvel/android/ads/AdMarvelVideoActivity:aj	Landroid/view/View$OnTouchListener;
    //   1293: invokevirtual 1251	android/widget/RelativeLayout:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   1296: aload_0
    //   1297: ldc_w 1253
    //   1300: invokevirtual 915	com/admarvel/android/ads/AdMarvelVideoActivity:a	(Ljava/lang/String;)V
    //   1303: new 1255	android/content/IntentFilter
    //   1306: dup
    //   1307: ldc_w 1257
    //   1310: invokespecial 1258	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   1313: astore 13
    //   1315: aload 13
    //   1317: ldc_w 1260
    //   1320: invokevirtual 1263	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   1323: aload_0
    //   1324: new 1265	com/admarvel/android/ads/AdMarvelVideoActivity$h
    //   1327: dup
    //   1328: aload_0
    //   1329: invokespecial 1266	com/admarvel/android/ads/AdMarvelVideoActivity$h:<init>	(Lcom/admarvel/android/ads/AdMarvelVideoActivity;)V
    //   1332: putfield 1268	com/admarvel/android/ads/AdMarvelVideoActivity:ac	Landroid/content/BroadcastReceiver;
    //   1335: aload_0
    //   1336: aload_0
    //   1337: getfield 1268	com/admarvel/android/ads/AdMarvelVideoActivity:ac	Landroid/content/BroadcastReceiver;
    //   1340: aload 13
    //   1342: invokevirtual 1272	com/admarvel/android/ads/AdMarvelVideoActivity:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   1345: pop
    //   1346: return
    //
    // Exception table:
    //   from	to	target	type
    //   97	145	985	java/lang/Exception
    //   403	411	1070	java/lang/Exception
    //   403	411	1080	javax/xml/parsers/ParserConfigurationException
    //   411	439	1080	javax/xml/parsers/ParserConfigurationException
    //   439	461	1080	javax/xml/parsers/ParserConfigurationException
    //   466	480	1080	javax/xml/parsers/ParserConfigurationException
    //   480	533	1080	javax/xml/parsers/ParserConfigurationException
    //   533	562	1080	javax/xml/parsers/ParserConfigurationException
    //   562	584	1080	javax/xml/parsers/ParserConfigurationException
    //   584	603	1080	javax/xml/parsers/ParserConfigurationException
    //   608	761	1080	javax/xml/parsers/ParserConfigurationException
    //   761	777	1080	javax/xml/parsers/ParserConfigurationException
    //   777	810	1080	javax/xml/parsers/ParserConfigurationException
    //   815	823	1080	javax/xml/parsers/ParserConfigurationException
    //   828	835	1080	javax/xml/parsers/ParserConfigurationException
    //   838	873	1080	javax/xml/parsers/ParserConfigurationException
    //   878	927	1080	javax/xml/parsers/ParserConfigurationException
    //   932	950	1080	javax/xml/parsers/ParserConfigurationException
    //   1072	1077	1080	javax/xml/parsers/ParserConfigurationException
    //   1093	1120	1080	javax/xml/parsers/ParserConfigurationException
    //   1120	1124	1080	javax/xml/parsers/ParserConfigurationException
    //   1143	1189	1080	javax/xml/parsers/ParserConfigurationException
    //   1203	1288	1080	javax/xml/parsers/ParserConfigurationException
    //   1288	1346	1080	javax/xml/parsers/ParserConfigurationException
    //   466	480	1091	java/lang/Exception
    //   403	411	1127	org/xml/sax/SAXException
    //   411	439	1127	org/xml/sax/SAXException
    //   439	461	1127	org/xml/sax/SAXException
    //   466	480	1127	org/xml/sax/SAXException
    //   480	533	1127	org/xml/sax/SAXException
    //   533	562	1127	org/xml/sax/SAXException
    //   562	584	1127	org/xml/sax/SAXException
    //   584	603	1127	org/xml/sax/SAXException
    //   608	761	1127	org/xml/sax/SAXException
    //   761	777	1127	org/xml/sax/SAXException
    //   777	810	1127	org/xml/sax/SAXException
    //   815	823	1127	org/xml/sax/SAXException
    //   828	835	1127	org/xml/sax/SAXException
    //   838	873	1127	org/xml/sax/SAXException
    //   878	927	1127	org/xml/sax/SAXException
    //   932	950	1127	org/xml/sax/SAXException
    //   1072	1077	1127	org/xml/sax/SAXException
    //   1093	1120	1127	org/xml/sax/SAXException
    //   1120	1124	1127	org/xml/sax/SAXException
    //   1143	1189	1127	org/xml/sax/SAXException
    //   1203	1288	1127	org/xml/sax/SAXException
    //   1288	1346	1127	org/xml/sax/SAXException
    //   403	411	1192	java/io/IOException
    //   411	439	1192	java/io/IOException
    //   439	461	1192	java/io/IOException
    //   466	480	1192	java/io/IOException
    //   480	533	1192	java/io/IOException
    //   533	562	1192	java/io/IOException
    //   562	584	1192	java/io/IOException
    //   584	603	1192	java/io/IOException
    //   608	761	1192	java/io/IOException
    //   761	777	1192	java/io/IOException
    //   777	810	1192	java/io/IOException
    //   815	823	1192	java/io/IOException
    //   828	835	1192	java/io/IOException
    //   838	873	1192	java/io/IOException
    //   878	927	1192	java/io/IOException
    //   932	950	1192	java/io/IOException
    //   1072	1077	1192	java/io/IOException
    //   1093	1120	1192	java/io/IOException
    //   1120	1124	1192	java/io/IOException
    //   1143	1189	1192	java/io/IOException
    //   1203	1288	1192	java/io/IOException
    //   1288	1346	1192	java/io/IOException
  }

  protected void onDestroy()
  {
    super.onDestroy();
    s();
    if (this.ac != null)
    {
      unregisterReceiver(this.ac);
      this.ac = null;
    }
  }

  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    c(false);
    this.i = AdMarvelVideoActivity.k.e;
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    if ((this.s) && (localLinearLayout != null) && (localLinearLayout.getVisibility() != 0))
    {
      a(localLinearLayout, true);
      localLinearLayout.setVisibility(0);
    }
    if (paramMediaPlayer != null)
    {
      paramMediaPlayer.reset();
      paramMediaPlayer.release();
    }
    return false;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0);
    switch (paramInt)
    {
    default:
      return super.onKeyDown(paramInt, paramKeyEvent);
    case 4:
    }
    ad localad;
    if (this.M != null)
    {
      localad = (ad)this.M.get();
      if (localad == null);
    }
    for (boolean bool = localad.b(); ; bool = false)
    {
      if ((!this.s) || (!bool) || (!this.v))
        c();
      return true;
    }
  }

  protected void onPause()
  {
    super.onPause();
    if (!isFinishing());
    try
    {
      c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
      label21: Logging.log("Video Activity onPause is called");
      if (this.i == AdMarvelVideoActivity.k.b)
        if (this.L != null)
        {
          if (!this.H)
            break label95;
          this.L.d();
          this.F = true;
          this.i = AdMarvelVideoActivity.k.g;
        }
      while (true)
      {
        if ((this.Y != null) && (this.Y.c()))
          this.Y.b();
        return;
        label95: if (this.I)
        {
          this.L.d();
          this.G = true;
          this.i = AdMarvelVideoActivity.k.g;
        }
        else
        {
          this.L.pause();
          this.i = AdMarvelVideoActivity.k.c;
          continue;
          if (((this.i == AdMarvelVideoActivity.k.d) || (this.i == AdMarvelVideoActivity.k.e)) && (this.L != null) && (!this.L.isPlaying()))
            this.L.a(true);
        }
      }
    }
    catch (Exception localException)
    {
      break label21;
    }
  }

  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    try
    {
      if (this.h != null)
      {
        AdMarvelVideoActivity.b localb = (AdMarvelVideoActivity.b)this.h.get();
        if ((localb != null) && (localb.a()))
        {
          localb.d();
          AdMarvelVideoActivity.b.a(localb);
        }
      }
      if (this.u)
      {
        if (this.Y == null)
          this.Y = new AdMarvelVideoActivity.i(this.N, this.ai, 3100, true);
        LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
        if ((this.s) && (localLinearLayout != null) && (localLinearLayout.getVisibility() == 0))
        {
          this.Y.a();
          this.aa = System.currentTimeMillis();
        }
      }
      if (this.j == AdMarvelVideoActivity.m.a)
        this.L.b();
      if (this.ab)
      {
        if (q())
        {
          this.L.b();
          this.j = AdMarvelVideoActivity.m.a;
          r();
        }
        this.ab = false;
      }
      c(true);
      if (this.L != null)
      {
        a(this.L);
        a(AdMarvelVideoActivity.l.a);
      }
      return;
    }
    catch (Exception localException)
    {
      while (true)
        Logging.log(Log.getStackTraceString(localException));
    }
  }

  protected void onResume()
  {
    super.onResume();
    try
    {
      c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
      label14: if ((this.L != null) && ((this.i == AdMarvelVideoActivity.k.c) || ((!this.L.isPlaying()) && (this.i == AdMarvelVideoActivity.k.g))))
      {
        a("Resuming Video...");
        this.L.e();
        if (this.Y != null)
          this.Y.a();
      }
      this.F = false;
      this.d = false;
      return;
    }
    catch (Exception localException)
    {
      break label14;
    }
  }

  protected void onStart()
  {
    super.onStart();
    try
    {
      c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  protected void onStop()
  {
    super.onStop();
    try
    {
      c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
      label14: Logging.log("Video Activity onStop is called");
      if ((this.L != null) && (!this.L.isPlaying()) && (this.i == AdMarvelVideoActivity.k.g) && (!this.I))
        a(AdMarvelVideoActivity.l.c);
      PowerManager localPowerManager = (PowerManager)getSystemService("power");
      StringBuilder localStringBuilder = new StringBuilder().append("Video Activity onStop isScreenOn: ");
      Object localObject;
      if (localPowerManager != null)
      {
        localObject = Boolean.valueOf(localPowerManager.isScreenOn());
        Logging.log(localObject);
        if ((isFinishing()) || (!this.F) || (this.i != AdMarvelVideoActivity.k.g) || (this.L == null) || (!this.L.isPlaying()) || (localPowerManager == null) || (localPowerManager.isScreenOn()))
          break label256;
        this.i = AdMarvelVideoActivity.k.b;
        this.F = false;
        label175: if ((this.W != null) && ((!this.H) || (!this.L.isPlaying()) || (localPowerManager.isScreenOn())))
          this.W.b();
        if (this.h == null)
          break label284;
      }
      label256: label284: for (AdMarvelVideoActivity.b localb = (AdMarvelVideoActivity.b)this.h.get(); ; localb = null)
      {
        if (localb != null)
        {
          localb.c();
          AdMarvelVideoActivity.b.a(localb);
        }
        return;
        localObject = "powermanager null";
        break;
        if ((isFinishing()) || (!this.I) || (this.d))
          break label175;
        c();
        break label175;
      }
    }
    catch (Exception localException)
    {
      break label14;
    }
  }

  public void onUserInteraction()
  {
    LinearLayout localLinearLayout = (LinearLayout)findViewById(b);
    if ((this.s) && (localLinearLayout != null))
    {
      if (localLinearLayout.getVisibility() != 0)
        break label68;
      this.aa = System.currentTimeMillis();
      if ((this.Y != null) && (this.Y.c()))
      {
        this.Y.b();
        this.Y.a();
      }
    }
    return;
    label68: b(true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity
 * JD-Core Version:    0.6.2
 */