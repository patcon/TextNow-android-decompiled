package com.enflick.android.TextNow.activities.phone;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.ToneGenerator;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.provider.Settings.System;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import com.enflick.android.TextNow.TextNowApp;
import com.enflick.android.TextNow.activities.ContactDetailsActivity;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.activities.an;
import com.enflick.android.TextNow.activities.av;
import com.enflick.android.TextNow.tasks.GetContactInfoTask;
import com.enflick.android.TextNow.tasks.GetContactProxyTask;
import com.enflick.android.TextNow.tasks.SendMessageTask;
import com.enflick.android.TextNow.tasks.SpeedTestTask;
import cz.acrobits.libsoftphone.Instance.Audio;
import cz.acrobits.libsoftphone.data.AudioRoute;
import cz.acrobits.libsoftphone.data.Call.State;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import textnow.z.f;
import textnow.z.g;

public class DialerFragment extends av
  implements View.OnClickListener, View.OnLongClickListener, j
{
  public static boolean a = false;
  private static final HashMap<String, String> b = new HashMap();
  private static final HashMap<Character, Integer> f = new HashMap();
  private static final HashMap<Integer, Character> g = new HashMap();
  private View A;
  private View B;
  private View C;
  private View D;
  private View E;
  private TextView F;
  private TextView G;
  private ToggleButton H;
  private ToggleButton I;
  private ToggleButton J;
  private ToggleButton K;
  private Button L;
  private ImageButton M;
  private ImageButton N;
  private Button O;
  private Button P;
  private Button Q;
  private Dialog R;
  private Dialog S;
  private View T;
  private View U;
  private View V;
  private View W;
  private View X;
  private View Y;
  private TextView Z;
  private boolean aA = false;
  private boolean aB = false;
  private f aC;
  private textnow.z.h aD;
  private h aE = h.a();
  private textnow.z.u aF;
  private an aG = null;
  private ImageView aa;
  private ImageView ab;
  private RelativeLayout ac;
  private ImageView ad;
  private ImageView ae;
  private ImageView af;
  private View ag;
  private View ah;
  private View ai;
  private View aj;
  private View ak;
  private View al;
  private MenuItem am;
  private TextView an;
  private TextView ao;
  private s ap;
  private q aq = new q(this, (byte)0);
  private r ar = new r(this, (byte)0);
  private PhoneNumberFormattingTextWatcher as = new PhoneNumberFormattingTextWatcher();
  private t at = new t(this, (byte)0);
  private AnimationSet au = new AnimationSet(true);
  private boolean av = false;
  private boolean aw = false;
  private boolean ax = false;
  private boolean ay = false;
  private boolean az = false;
  private p h;
  private BroadcastReceiver i;
  private boolean j;
  private boolean k;
  private ToneGenerator l;
  private Object m = new Object();
  private boolean n;
  private textnow.ae.a o;
  private AlertDialog p;
  private EditText q;
  private TextView r;
  private EditText s;
  private ImageButton t;
  private ImageButton u;
  private ImageButton v;
  private ImageButton w;
  private View x;
  private View y;
  private View z;

  static
  {
    f.put(Character.valueOf('1'), Integer.valueOf(1));
    f.put(Character.valueOf('2'), Integer.valueOf(2));
    f.put(Character.valueOf('3'), Integer.valueOf(3));
    f.put(Character.valueOf('4'), Integer.valueOf(4));
    f.put(Character.valueOf('5'), Integer.valueOf(5));
    f.put(Character.valueOf('6'), Integer.valueOf(6));
    f.put(Character.valueOf('7'), Integer.valueOf(7));
    f.put(Character.valueOf('8'), Integer.valueOf(8));
    f.put(Character.valueOf('9'), Integer.valueOf(9));
    f.put(Character.valueOf('0'), Integer.valueOf(0));
    f.put(Character.valueOf('#'), Integer.valueOf(11));
    f.put(Character.valueOf('*'), Integer.valueOf(10));
    g.put(Integer.valueOf(2131558686), Character.valueOf('1'));
    g.put(Integer.valueOf(2131558687), Character.valueOf('2'));
    g.put(Integer.valueOf(2131558688), Character.valueOf('3'));
    g.put(Integer.valueOf(2131558689), Character.valueOf('4'));
    g.put(Integer.valueOf(2131558690), Character.valueOf('5'));
    g.put(Integer.valueOf(2131558691), Character.valueOf('6'));
    g.put(Integer.valueOf(2131558692), Character.valueOf('7'));
    g.put(Integer.valueOf(2131558693), Character.valueOf('8'));
    g.put(Integer.valueOf(2131558694), Character.valueOf('9'));
    g.put(Integer.valueOf(2131558696), Character.valueOf('0'));
    g.put(Integer.valueOf(2131558697), Character.valueOf('#'));
    g.put(Integer.valueOf(2131558695), Character.valueOf('*'));
    b.put("##72786#", "android_secret_code://SCRTN");
    b.put("##786#", "android_secret_code://RTN");
    b.put("##3282#", "android_secret_code://DATA");
    b.put("##3424#", "android_secret_code://PUTIL");
    b.put("##33284#", "android_secret_code://DEBUG");
  }

  private void B()
  {
    F();
    if ((this.aC == null) && (TextUtils.isEmpty(this.q.getEditableText())))
    {
      String str2 = this.aF.ac();
      f localf;
      if (!str2.isEmpty())
      {
        new StringBuilder().append("populating dialer with number = ").append(str2).toString();
        if (!str2.contains("@"))
          break label114;
        localf = new f(str2, 3, str2.substring(0, str2.indexOf("@")), null);
      }
      while (true)
      {
        a(localf);
        this.aC = localf;
        return;
        label114: if (TextUtils.isDigitsOnly(str2))
          localf = new f(str2, 2, null, null);
        else
          localf = new f(str2, 1, str2, null);
      }
    }
    if (this.aC.a().equals("911"))
    {
      if (this.k)
      {
        Intent localIntent = new Intent();
        localIntent.setAction("android.intent.action.CALL_EMERGENCY");
        localIntent.setData(Uri.parse("tel:911"));
        this.aG.startActivity(localIntent);
        return;
      }
      this.aG.b(2131296781);
      return;
    }
    String str1 = this.aC.a();
    if (this.aC.b() == 2)
    {
      str1 = textnow.v.b.b(str1);
      if (str1 == null)
      {
        Toast.makeText(this.aG, 2131296779, 0).show();
        return;
      }
      Set localSet = textnow.z.h.b(this.aG);
      g localg = f.a(this.aG, localSet, this.aC.a(), this.aC.b());
      if (localg != null)
      {
        this.aC.a(localg.b);
        this.aC.a(localg.a);
      }
    }
    if ((this.aF.Z()) && ("ACTIVE".equalsIgnoreCase(new textnow.z.s(this.aG).f())) && (!textnow.v.b.d(this.aG)) && ((textnow.v.b.n(this.aG)) || (textnow.v.a.a)) && (this.aE.l()))
    {
      this.aG.a(2131296428, true);
      new SpeedTestTask(new textnow.z.p(this.aG), this.aC, null).b(this.aG);
    }
    while (true)
    {
      this.aF.C(str1);
      this.aF.B();
      return;
      c(this.aC);
    }
  }

  private void D()
  {
    this.ay = false;
    if (this.aC != null)
    {
      new StringBuilder().append("Accepting call for number: ").append(this.aC.a()).toString();
      this.aE.a(this);
      this.aE.a(this.aE.e(this.aC.a()));
    }
  }

  private void E()
  {
    this.aE.b(this.aE.e(this.aC.a()));
    new StringBuilder().append("Hung up call, new number of calls: ").append(this.aE.H()).toString();
    if (this.aE.H() == 0)
    {
      if (this.d != null)
        this.d.onBackPressed();
    }
    else
      return;
    this.aG.finish();
  }

  private void F()
  {
    String str2;
    String str3;
    if (this.q.getVisibility() == 0)
    {
      String str1 = this.q.getEditableText().toString();
      if (!TextUtils.isEmpty(str1))
      {
        str2 = textnow.v.b.e(str1);
        str3 = textnow.v.b.b(str2);
        if (str3 == null)
          break label80;
      }
    }
    while (true)
    {
      if ((this.aC == null) || (!this.aC.a().equals(str3)))
        this.aC = new f(str3, 2, null, null, true);
      return;
      label80: str3 = str2;
    }
  }

  private void G()
  {
    int i1 = 255;
    AudioRoute localAudioRoute = this.aE.o();
    int i3;
    int i2;
    int i4;
    int i5;
    int i6;
    label94: int i7;
    label119: int i8;
    label143: Drawable localDrawable4;
    if (h.h())
    {
      this.I.setEnabled(true);
      this.I.setChecked(false);
      if (localAudioRoute == AudioRoute.BluetoothSCO)
      {
        i3 = 1;
        i2 = 0;
        i4 = 0;
        i5 = 1;
        LayerDrawable localLayerDrawable = (LayerDrawable)this.I.getBackground();
        localLayerDrawable.findDrawableByLayerId(2131559043).setAlpha(0);
        Drawable localDrawable1 = localLayerDrawable.findDrawableByLayerId(2131559044);
        if (i5 == 0)
          break label266;
        i6 = i1;
        localDrawable1.setAlpha(i6);
        Drawable localDrawable2 = localLayerDrawable.findDrawableByLayerId(2131559045);
        if (i3 == 0)
          break label272;
        i7 = i1;
        localDrawable2.setAlpha(i7);
        Drawable localDrawable3 = localLayerDrawable.findDrawableByLayerId(2131559047);
        if (i2 == 0)
          break label278;
        i8 = i1;
        localDrawable3.setAlpha(i8);
        localDrawable4 = localLayerDrawable.findDrawableByLayerId(2131559046);
        if (i4 == 0)
          break label284;
      }
    }
    while (true)
    {
      localDrawable4.setAlpha(i1);
      return;
      if (localAudioRoute == AudioRoute.Speaker)
      {
        i4 = 1;
        i5 = 1;
        i3 = 0;
        i2 = 0;
        break;
      }
      i2 = 1;
      i5 = 1;
      i3 = 0;
      i4 = 0;
      break;
      this.I.setEnabled(true);
      if (localAudioRoute == AudioRoute.Speaker)
      {
        this.I.setChecked(true);
        i4 = 1;
        i3 = 0;
        i2 = 0;
        i5 = 0;
        break;
      }
      this.I.setChecked(false);
      i2 = 1;
      i3 = 0;
      i4 = 0;
      i5 = 0;
      break;
      label266: i6 = 0;
      break label94;
      label272: i7 = 0;
      break label119;
      label278: i8 = 0;
      break label143;
      label284: i1 = 0;
    }
  }

  private void H()
  {
    w localw = this.aE.p();
    if ((localw != null) && (localw.c()) && (this.av != localw.d()))
    {
      localw.a(this.av);
      if (localw.o() != null)
      {
        AsyncTask local6 = new AsyncTask()
        {
        };
        Uri[] arrayOfUri = new Uri[1];
        arrayOfUri[0] = localw.o();
        local6.execute(arrayOfUri);
      }
    }
  }

  private void I()
  {
    final EditText localEditText = new EditText(this.aG);
    new AlertDialog.Builder(this.aG).setTitle("Notes On the Call").setView(localEditText).setPositiveButton("Send", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        textnow.v.b.a(DialerFragment.a(DialerFragment.this), "wei@enflick.com", "CDMA feedback", "", localEditText.getText().toString(), true);
      }
    }).setNegativeButton("Cancel", null).create().show();
  }

  private boolean J()
  {
    return (!this.aE.K()) || (!this.aE.L());
  }

  public static DialerFragment a(f paramf, DialerFragment.DialerState paramDialerState, boolean paramBoolean1, boolean paramBoolean2, p paramp)
  {
    DialerFragment localDialerFragment = new DialerFragment();
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("param_contact", paramf);
    localBundle.putBoolean("param_answer", paramBoolean1);
    localBundle.putBoolean("param_call", paramBoolean2);
    localBundle.putParcelable("dialer_state", paramDialerState);
    localDialerFragment.setArguments(localBundle);
    localDialerFragment.h = paramp;
    return localDialerFragment;
  }

  private void a(int paramInt)
  {
    View localView1 = this.T;
    int i1;
    int i2;
    label35: int i3;
    label58: View localView4;
    int i4;
    if (paramInt == 2131558675)
    {
      i1 = 0;
      localView1.setVisibility(i1);
      View localView2 = this.U;
      if (paramInt != 2131558676)
        break label95;
      i2 = 0;
      localView2.setVisibility(i2);
      View localView3 = this.V;
      if (paramInt != 2131558677)
        break label102;
      i3 = 0;
      localView3.setVisibility(i3);
      localView4 = this.W;
      i4 = 0;
      if (paramInt != 2131558678)
        break label109;
    }
    while (true)
    {
      localView4.setVisibility(i4);
      return;
      i1 = 8;
      break;
      label95: i2 = 8;
      break label35;
      label102: i3 = 8;
      break label58;
      label109: i4 = 8;
    }
  }

  private void a(View paramView)
  {
    Iterator localIterator = g.keySet().iterator();
    while (localIterator.hasNext())
    {
      View localView = paramView.findViewById(((Integer)localIterator.next()).intValue());
      localView.setOnTouchListener(this.ar);
      localView.setClickable(true);
      localView.setOnKeyListener(this.aq);
    }
  }

  private void a(String paramString)
  {
    new GetContactInfoTask(paramString).b(this.aG);
  }

  private void a(f paramf)
  {
    if (!this.j);
    do
    {
      return;
      if (paramf.b() == 2)
      {
        a(true);
        this.q.getEditableText().replace(0, this.q.length(), paramf.a());
        return;
      }
      a(false);
      this.r.setText(paramf.c());
    }
    while (!paramf.f());
    this.av = true;
    u();
  }

  private void a(boolean paramBoolean)
  {
    if (!this.j)
      return;
    this.r.setText("");
    this.q.setText("");
    if (paramBoolean)
    {
      this.r.setVisibility(8);
      this.q.setVisibility(0);
      return;
    }
    this.q.setVisibility(8);
    this.r.setVisibility(0);
  }

  private void b(final f paramf)
  {
    if (paramf.b() == 2)
    {
      str = getString(2131296776, new Object[] { textnow.v.b.f(paramf.a()) });
      new AlertDialog.Builder(this.aG).setTitle(2131296751).setMessage(str).setPositiveButton(2131296423, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          new SendMessageTask(DialerFragment.a(DialerFragment.this), paramf.b(), paramf.a(), paramf.c(), paramf.d(), 1, 2, true, DialerFragment.a(DialerFragment.this).getString(2131296786), null).b(DialerFragment.a(DialerFragment.this));
        }
      }).setNegativeButton(2131296425, null).setCancelable(true).create().show();
    }
    while (paramf.b() != 3)
    {
      String str;
      return;
    }
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("text/html");
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramf.a();
    localIntent.putExtra("android.intent.extra.EMAIL", arrayOfString);
    localIntent.putExtra("android.intent.extra.SUBJECT", getString(2131296787));
    localIntent.putExtra("android.intent.extra.TEXT", getString(2131296788));
    startActivity(localIntent);
  }

  private void b(boolean paramBoolean)
  {
    String str;
    if (paramBoolean)
      str = getString(2131296766);
    while (true)
    {
      this.s.getEditableText().replace(0, this.s.length(), str);
      return;
      if (this.aC != null)
      {
        str = this.aC.g();
        int i1 = str.indexOf("@textnow.me");
        if (i1 > 0)
          str = str.substring(0, i1);
      }
      else
      {
        str = getString(2131296771);
      }
    }
  }

  private void c(f paramf)
  {
    if ((!this.av) && (this.aF.E() <= 1))
    {
      this.aw = true;
      this.aG.a(2131296428, true);
      a(paramf.a());
    }
    do
    {
      return;
      this.aG.v();
      if (this.aC.a().equals(this.aF.c()))
      {
        this.aG.b(2131296785);
        return;
      }
      boolean bool = this.aB;
      this.aB = false;
      if (!this.aE.a(this.aC, true, bool))
      {
        this.aG.b(2131296433);
        return;
      }
    }
    while (this.av);
    a(this.aC.a());
  }

  private void c(boolean paramBoolean)
  {
    int i1 = 8;
    if (paramBoolean)
    {
      if ((this.aE.K()) && (this.aE.q().c(this.aE.p())))
      {
        this.ab.setVisibility(0);
        this.aa.setVisibility(i1);
        View localView = this.A;
        if (this.d == null);
        while (true)
        {
          localView.setVisibility(i1);
          return;
          i1 = 0;
        }
      }
      this.ab.setVisibility(i1);
      this.aa.setVisibility(0);
      this.A.setVisibility(i1);
      return;
    }
    this.ab.setVisibility(i1);
    this.aa.setVisibility(i1);
    this.A.setVisibility(i1);
  }

  private void r()
  {
    if (this.am != null)
    {
      View localView = android.support.v4.view.z.a(this.am);
      this.an = ((TextView)localView.findViewById(2131558510));
      this.ao = ((TextView)localView.findViewById(2131558511));
    }
  }

  private void s()
  {
    w localw;
    d locald;
    boolean bool3;
    label227: int i1;
    label365: Object localObject2;
    label415: Object localObject5;
    label450: Object localObject3;
    label518: int i2;
    label559: View localView1;
    label570: TextView localTextView;
    label630: int i3;
    label644: int i4;
    label665: int i5;
    label687: int i6;
    label709: label716: boolean bool2;
    label726: Call.State localState2;
    do
    {
      Call.State localState1;
      while (true)
      {
        try
        {
          boolean bool1 = this.j;
          if (!bool1)
            return;
          new StringBuilder().append("update UI for state: ").append(Call.State.getLabel(this.aE.y())).toString();
          localState1 = this.aE.y();
          localw = this.aE.p();
          locald = this.aE.q();
          if (this.ay)
          {
            this.ag.startAnimation(this.au);
            if (!this.ay)
              break;
            a(2131558677);
            v();
            u();
            if ((localw == null) || (!localw.i()))
              continue;
            w();
            continue;
          }
        }
        finally
        {
        }
        this.au.cancel();
        this.au.reset();
      }
      if ((!h.c(localState1)) || (localw == null) || (localw.i()))
        break label1121;
      if (!this.aB)
        a(2131558676);
      this.aC = localw.b();
      if (this.aC != null)
      {
        if ((!this.aE.K()) || (!locald.c(localw)))
          break label1333;
        bool3 = true;
        b(bool3);
      }
      String str;
      if ((localw != null) && (localw.n() != null) && (this.aa.getVisibility() == 0))
      {
        str = localw.n().h();
        new StringBuilder().append("Loading photo: ").append(str).append(" for ").append(localw.n().c()).toString();
        new StringBuilder().append("Call: ").append(localw.toString()).toString();
        if (!textnow.z.h.c(str))
          break label450;
        this.aa.setImageResource(2130837560);
      }
      while (true)
      {
        if (!this.aE.K())
          break label1320;
        i1 = locald.e();
        if (this.aE.H() - i1 <= 0)
          break label1002;
        localObject2 = null;
        if (!this.aE.K())
          break label925;
        if (!locald.c(localw))
          break;
        Iterator localIterator2 = this.aE.G().iterator();
        if (!localIterator2.hasNext())
          break label1339;
        localObject5 = (w)localIterator2.next();
        if (locald.c((w)localObject5))
          break label1313;
        break label1326;
        Uri localUri = Uri.parse(str);
        if (Build.VERSION.SDK_INT >= 14)
        {
          new textnow.v.j();
          textnow.v.j.a(this.aG.getContentResolver(), localUri, this.aa, 2130837560);
        }
        else
        {
          textnow.v.o.a(this.aG).a(this.aa, localUri, this.at);
        }
      }
      new StringBuilder().append("notCurrentCall is ").append(((w)localObject3).b().a()).toString();
      if (!((w)localObject3).a(localw))
        break label1293;
      i2 = 1;
      if (i2 == 0)
        break label977;
      localView1 = this.aj;
      localTextView = (TextView)localView1.findViewById(2131558685);
      textnow.v.z.a(localView1.findViewById(2131558684), this.aG);
      if ((!this.aE.K()) || (!locald.c((w)localObject3)))
        break label986;
      localTextView.setText(getString(2131296766));
      View localView2 = this.aj;
      if (i2 == 0)
        break label1353;
      i3 = 0;
      localView2.setVisibility(i3);
      View localView3 = this.ai;
      if (i2 == 0)
        break label1360;
      i4 = 0;
      localView3.setVisibility(i4);
      View localView4 = this.ak;
      if (i2 == 0)
        break label1367;
      i5 = 8;
      localView4.setVisibility(i5);
      View localView5 = this.al;
      if (i2 == 0)
        break label1373;
      i6 = 8;
      localView5.setVisibility(i6);
      if (this.az)
        break label1379;
      bool2 = true;
      c(bool2);
      localState2 = this.aE.y();
    }
    while (!h.c(localState2));
    View localView6;
    if (h.b(localState2))
    {
      this.H.setEnabled(true);
      this.K.setEnabled(true);
      this.J.setEnabled(true);
      this.K.setChecked(this.aE.z());
      this.H.setChecked(this.az);
      localView6 = this.Y;
      if (!this.az)
        break label1385;
    }
    label848: label977: label986: label1121: label1379: label1385: for (int i8 = 0; ; i8 = 8)
    {
      localView6.setVisibility(i8);
      ToggleButton localToggleButton = this.J;
      localToggleButton.setChecked(h.x());
      G();
      int i7;
      label874: Iterator localIterator1;
      if (this.aE.K())
      {
        i7 = this.aE.q().e();
        if (this.aE.H() - i7 > 0)
        {
          this.L.setVisibility(0);
          this.M.setVisibility(8);
          this.N.setVisibility(0);
          break;
          localObject3 = locald.b();
          break label518;
          localIterator1 = this.aE.G().iterator();
        }
      }
      while (true)
      {
        Object localObject4;
        if (localIterator1.hasNext())
        {
          localObject4 = (w)localIterator1.next();
          if (((w)localObject4).a() != localw.a())
          {
            break label1346;
            localView1 = this.ak;
            break label570;
            localTextView.setText(((w)localObject3).b().g());
            break label630;
            label1002: this.ak.setVisibility(8);
            this.al.setVisibility(8);
            this.aj.setVisibility(8);
            this.ai.setVisibility(8);
            break label716;
            this.H.setChecked(false);
            this.H.setEnabled(false);
            this.Y.setVisibility(8);
            this.K.setEnabled(false);
            this.J.setEnabled(false);
            break label848;
            this.L.setVisibility(8);
            if (this.d != null)
              this.M.setVisibility(0);
            this.N.setVisibility(8);
            break;
            if ((localw != null) && (localw.i()))
            {
              a(2131558678);
              break;
            }
            a(2131558675);
            if (this.aC == null)
              break;
            if (this.aC.b() == 2)
            {
              a(true);
              this.q.getEditableText().replace(0, this.q.length(), this.aC.a());
              break;
            }
            if (this.aC.b() == 3)
            {
              a(false);
              this.r.setText(this.aC.a().substring(0, this.aC.a().indexOf("@")));
              this.av = true;
              break;
            }
            a(false);
            this.r.setText(this.aC.a());
            this.av = true;
            break;
            i7 = 1;
            break label874;
            i2 = 0;
            break label559;
          }
          localObject4 = localObject2;
          break label1346;
        }
        localObject3 = localObject2;
        break label518;
        localObject5 = localObject2;
        break label1326;
        i1 = 1;
        break label365;
        localObject2 = localObject5;
        break label415;
        bool3 = false;
        break label227;
        localObject3 = localObject2;
        break label518;
        localObject2 = localObject4;
      }
      i3 = 8;
      break label644;
      i4 = 8;
      break label665;
      i5 = 0;
      break label687;
      i6 = 0;
      break label709;
      bool2 = false;
      break label726;
    }
  }

  private void t()
  {
    if (this.aC == null);
    while ((!TextUtils.isEmpty(this.aC.c())) || (this.aC.b() != 2))
      return;
    try
    {
      this.aC.b(textnow.v.k.a(TextNowApp.a().getApplicationContext().getContentResolver(), this.aC.a()));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private void u()
  {
    int i1 = 8;
    Call.State localState = this.aE.y();
    w localw = this.aE.p();
    int i3;
    if (h.a(localState))
    {
      View localView3 = this.D;
      if (!this.av)
      {
        i3 = i1;
        localView3.setVisibility(i3);
        View localView4 = this.E;
        if (!this.av)
          break label96;
        label62: localView4.setVisibility(i1);
        if (localState != Call.State.IncomingTrying)
          break label101;
        this.F.setText(2131296760);
      }
    }
    label96: label101: View localView2;
    label144: 
    do
      while (true)
      {
        v();
        return;
        i3 = 0;
        break;
        i1 = 0;
        break label62;
        this.F.setText(2131296758);
        continue;
        if (!h.b(localState))
          break label144;
        this.D.setVisibility(i1);
        localView2 = this.E;
        localView2.setVisibility(i1);
      }
    while ((localw != null) && (!localw.i()));
    View localView1 = this.B;
    if (this.av);
    for (int i2 = 0; ; i2 = i1)
    {
      localView1.setVisibility(i2);
      localView2 = this.C;
      if (this.av)
        break;
      i1 = 0;
      break;
    }
  }

  private void v()
  {
    if (this.an == null)
      r();
    w localw;
    int i1;
    TextView localTextView2;
    int i2;
    if ((this.an != null) && (this.ao != null))
    {
      localw = this.aE.p();
      if ((localw == null) || (!localw.c()))
        break label104;
      TextView localTextView1 = this.an;
      if (!this.av)
        break label92;
      i1 = 8;
      localTextView1.setVisibility(i1);
      localTextView2 = this.ao;
      boolean bool = this.av;
      i2 = 0;
      if (!bool)
        break label97;
    }
    while (true)
    {
      localTextView2.setVisibility(i2);
      return;
      label92: i1 = 0;
      break;
      label97: i2 = 8;
    }
    label104: if ((this.ay) || (localw != null))
    {
      this.an.setVisibility(8);
      this.ao.setVisibility(0);
      return;
    }
    this.an.setVisibility(0);
    this.ao.setVisibility(8);
  }

  private void w()
  {
    int i1 = this.aF.E();
    if (this.an != null)
    {
      TextView localTextView = this.an;
      Resources localResources = getActivity().getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i1);
      localTextView.setText(localResources.getQuantityString(2131689478, i1, arrayOfObject));
    }
  }

  private void x()
  {
    synchronized (this.m)
    {
      if (this.l != null)
      {
        this.l.release();
        this.l = null;
      }
      return;
    }
  }

  private void z()
  {
    if (this.aE.y() == Call.State.Established)
      this.aE.u();
  }

  public final boolean C()
  {
    if (this.aB)
    {
      d();
      return true;
    }
    if ((this.aC != null) && (this.ay) && (this.aE.H() > 0))
    {
      this.aE.B();
      return true;
    }
    return super.C();
  }

  public final void a()
  {
    s();
  }

  public final void a(long paramLong)
  {
    if (this.G == null)
      return;
    if (paramLong == 0L)
    {
      this.G.setText("00:00");
      return;
    }
    w localw = this.aE.p();
    if ((localw != null) && (localw.c()) && (!localw.d()))
    {
      int i1 = (int)(paramLong / 60L);
      int i2 = this.aF.E() - i1;
      if (this.an != null)
      {
        TextView localTextView = this.an;
        Resources localResources = this.aG.getResources();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i2);
        localTextView.setText(localResources.getQuantityString(2131689478, i2, arrayOfObject));
      }
    }
    String str = DateUtils.formatElapsedTime(paramLong);
    this.G.setText(str);
  }

  public final void a(String paramString, i parami)
  {
    int i1 = 1;
    new StringBuilder().append("Call hold state changed for id: ").append(paramString).append(" to ").append(parami.name()).toString();
    if (!this.j)
      label43: return;
    if (this.aE.z())
      this.K.setChecked(i1);
    w localw;
    while (true)
    {
      localw = this.aE.f(paramString);
      if (localw == null)
        break;
      switch (8.a[parami.ordinal()])
      {
      default:
        this.ay = false;
        s();
        if (this.h == null)
          break label43;
        this.h.s();
        return;
        this.K.setChecked(false);
      case 1:
      }
    }
    if (this.aE.H() <= i1)
    {
      this.aj.setVisibility(8);
      this.ak.setVisibility(8);
    }
    this.aC = localw.b();
    t();
    if ((this.aE.K()) && (this.aE.q().c(localw)));
    while (true)
    {
      b(i1);
      break;
      int i2 = 0;
    }
  }

  public final void a(String paramString, textnow.z.h paramh, boolean paramBoolean)
  {
    this.ay = false;
    this.aE.J();
    if (this.aE.H() > 0)
      new StringBuilder().append("Call finished for callId: ").append(paramString).append(" Waiting for other calls to finish").toString();
    while (true)
    {
      if (this.aA)
      {
        this.aA = false;
        this.o.a(paramString, paramh, paramBoolean);
        String str = this.o.c();
        textnow.v.b.a(this.aG, "enflick.support@enflick.com", "Call feedback for " + this.aF.b(), str, "", false);
      }
      if (a)
        I();
      return;
      if (paramBoolean)
      {
        a(2131558678);
        this.aD = paramh;
      }
      else
      {
        if ((this.d != null) && (!this.d.isFinishing()) && (com.enflick.android.TextNow.views.c.a(getActivity())))
          new com.enflick.android.TextNow.views.c(getActivity()).a();
        if (this.h != null)
        {
          new StringBuilder().append("Call finished for callId: ").append(paramString).append(" Opening conversation screen").toString();
          this.h.b(paramh);
        }
        else if (this.d != null)
        {
          new StringBuilder().append("Call finished for callId: ").append(paramString).append(" Opening home").toString();
          this.d.j();
        }
      }
    }
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == GetContactInfoTask.class)
    {
      GetContactInfoTask localGetContactInfoTask = (GetContactInfoTask)paramc;
      if ((this.aG == null) || (!this.j));
      while (true)
      {
        return true;
        String str2 = localGetContactInfoTask.b();
        if (((this.aC != null) && (this.aC.a().equals(str2))) || (str2.equals(textnow.v.b.b(this.q.getEditableText().toString()))))
        {
          if ((localGetContactInfoTask.h()) || (!localGetContactInfoTask.a()));
          for (this.av = false; ; this.av = true)
          {
            u();
            this.aG.v();
            if (!this.aw)
              break label196;
            this.aw = false;
            if ((this.av) || (this.aF.E() > 0))
              break label164;
            this.aG.showDialog(5, null);
            break;
          }
          label164: boolean bool = this.aB;
          this.aB = false;
          this.aE.a(this.aC, this.av, bool);
          continue;
          label196: H();
        }
      }
    }
    if (paramc.getClass() == SpeedTestTask.class)
    {
      if (((SpeedTestTask)paramc).b() != null)
      {
        SpeedTestTask localSpeedTestTask = (SpeedTestTask)paramc;
        textnow.z.n localn;
        if (this.aE.a(localSpeedTestTask.a()))
        {
          localn = textnow.z.n.a(this.aG.getContentResolver(), localSpeedTestTask.b().a());
          if ((localn == null) || (TextUtils.isEmpty(localn.a())) || (localn.b()))
            new GetContactProxyTask(this.aF.b(), localSpeedTestTask.b()).b(this.aG);
        }
        while (true)
        {
          return true;
          this.aG.v();
          if (this.aE.a(this.aG, this.aC, localn.a()))
          {
            this.aG.onBackPressed();
            if (a)
              I();
          }
          else
          {
            c(localSpeedTestTask.b());
            continue;
            c(localSpeedTestTask.b());
          }
        }
      }
    }
    else if (paramc.getClass() == GetContactProxyTask.class)
    {
      GetContactProxyTask localGetContactProxyTask = (GetContactProxyTask)paramc;
      this.aG.v();
      String str1 = localGetContactProxyTask.a();
      if ((!TextUtils.isEmpty(str1)) && (this.aE.a(this.aG, localGetContactProxyTask.b(), str1)))
      {
        this.aG.onBackPressed();
        if (a)
          I();
      }
      while (true)
      {
        return true;
        c(localGetContactProxyTask.b());
      }
    }
    return false;
  }

  public final void b()
  {
    s();
    H();
  }

  public final boolean c()
  {
    return this.aB;
  }

  public final void d()
  {
    this.aB = false;
    a(2131558676);
  }

  public final f f()
  {
    return this.aC;
  }

  public final void g()
  {
    if (this.n);
    synchronized (this.m)
    {
      if (this.l != null)
        this.l.stopTone();
      Instance.Audio.dtmfOff();
      return;
    }
  }

  public final void h()
  {
    if ((this.aC != null) && (this.ay) && (this.aE.H() > 0))
      this.aE.B();
  }

  public final void i()
  {
    D();
  }

  public final void j()
  {
    E();
  }

  public final DialerFragment.DialerState k()
  {
    if (this.j)
      return new DialerFragment.DialerState(h.n());
    return DialerFragment.DialerState.a;
  }

  public final String l()
  {
    return "/Dialer";
  }

  public final String m()
  {
    return null;
  }

  public final int n()
  {
    return 2131558814;
  }

  public final boolean o()
  {
    return true;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.aG.setTitle("");
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1)
      if (paramInt1 == 1)
      {
        localUri2 = paramIntent.getData();
        localIntent2 = new Intent(getActivity(), ContactDetailsActivity.class);
        localIntent2.putExtra("contact_uri", localUri2);
        localIntent2.putExtra("phone_only", true);
        startActivityForResult(localIntent2, 2);
      }
    while ((paramInt2 != 0) || (paramInt1 != 2))
    {
      do
      {
        Uri localUri2;
        Intent localIntent2;
        return;
        if (paramInt1 == 3)
        {
          Uri localUri1 = paramIntent.getData();
          Intent localIntent1 = new Intent(getActivity(), ContactDetailsActivity.class);
          localIntent1.putExtra("contact_uri", localUri1);
          startActivityForResult(localIntent1, 4);
          return;
        }
        if (paramInt1 == 2)
        {
          a((f)paramIntent.getSerializableExtra("extra_contact"));
          return;
        }
      }
      while (paramInt1 != 4);
      b((f)paramIntent.getSerializableExtra("extra_contact"));
      return;
    }
    startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 1);
  }

  public void onClick(View paramView)
  {
    boolean bool1 = true;
    switch (paramView.getId())
    {
    case 2131558770:
    default:
    case 2131558641:
    case 2131558700:
    case 2131558701:
    case 2131558699:
    case 2131558681:
    case 2131558682:
    case 2131558780:
    case 2131558574:
    case 2131558575:
    case 2131558576:
    case 2131558577:
    case 2131558578:
    case 2131558768:
    case 2131558782:
    case 2131558888:
    case 2131558889:
    case 2131558890:
    case 2131558579:
    case 2131558580:
    case 2131558779:
    }
    while (true)
    {
      return;
      if (this.q.getVisibility() == 0)
      {
        Editable localEditable = this.q.getText();
        if (localEditable.length() > 0)
        {
          localEditable.delete(-1 + localEditable.length(), localEditable.length());
          if (localEditable.length() == 0)
            this.aC = null;
        }
      }
      else
      {
        a(bool1);
        this.aC = null;
        this.av = false;
        u();
        return;
        B();
        return;
        F();
        if (this.aC != null)
        {
          an localan2 = this.aG;
          String str = this.aC.a();
          if (this.aC.b() == 2);
          while (true)
          {
            textnow.v.k.a(localan2, str, bool1);
            return;
            bool1 = false;
          }
          try
          {
            startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 1);
            return;
          }
          catch (ActivityNotFoundException localActivityNotFoundException2)
          {
            return;
          }
          com.enflick.android.TextNow.ads.b.b("tap_get_more_credits");
          if (this.d != null)
          {
            this.d.b(bool1);
            return;
            com.enflick.android.TextNow.ads.b.b("tap_invite_button");
            F();
            if (this.aC == null)
              try
              {
                startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 3);
                return;
              }
              catch (ActivityNotFoundException localActivityNotFoundException1)
              {
                return;
              }
            if ((this.aC.b() == 2) && (textnow.v.b.b(this.aC.a()) == null))
            {
              Toast.makeText(this.aG, 2131296547, 0).show();
              return;
            }
            b(this.aC);
            return;
            this.aE.b(false);
            return;
            if (this.aE.y() != Call.State.Established)
            {
              this.Y.setVisibility(8);
              this.H.setChecked(false);
              c(bool1);
              this.az = false;
              return;
            }
            if (this.Y.getVisibility() == 0)
            {
              this.Y.setVisibility(8);
              this.H.setChecked(false);
              c(bool1);
              this.az = false;
              u();
              return;
            }
            this.Y.setVisibility(0);
            this.H.setChecked(bool1);
            c(false);
            this.E.setVisibility(8);
            this.D.setVisibility(8);
            this.az = bool1;
            return;
            if (h.h())
            {
              an localan1;
              int i1;
              String[] arrayOfString;
              if (this.R == null)
              {
                localan1 = this.aG;
                i1 = this.aF.ab().intValue();
                arrayOfString = getResources().getStringArray(2131623948);
                if ((this.aF.ab().intValue() >= 100) || (Build.VERSION.SDK_INT < 11))
                  break label745;
              }
              label745: for (TypedArray localTypedArray = getResources().obtainTypedArray(2131623936); ; localTypedArray = getResources().obtainTypedArray(2131623937))
              {
                this.R = textnow.v.z.a(localan1, i1, 2131296768, arrayOfString, localTypedArray, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                    switch (paramAnonymousInt)
                    {
                    default:
                    case 0:
                    case 1:
                    case 2:
                    }
                    do
                    {
                      return;
                      DialerFragment.b(DialerFragment.this).a(AudioRoute.Speaker);
                      DialerFragment.o(DialerFragment.this);
                      return;
                      DialerFragment.b(DialerFragment.this).a(AudioRoute.Receiver);
                      DialerFragment.o(DialerFragment.this);
                      return;
                    }
                    while (!h.h());
                    DialerFragment.b(DialerFragment.this).a(AudioRoute.BluetoothSCO);
                    DialerFragment.o(DialerFragment.this);
                  }
                });
                if ((this.S != null) && (this.S.isShowing()))
                  this.S.dismiss();
                if (this.R.isShowing())
                  break;
                this.R.show();
                return;
              }
            }
            this.aE.v();
            G();
            return;
            if (this.aE.y() == Call.State.Established)
            {
              boolean bool2 = h.w();
              this.J.setChecked(bool2);
              return;
              z();
              return;
              this.aE.r();
              return;
              if (this.d != null)
              {
                this.d.b(bool1);
                return;
                b(this.aC);
                return;
                a("", this.aD, false);
                return;
                if (J())
                {
                  this.aB = bool1;
                  if (!this.aE.z())
                    z();
                  this.q.setText("");
                  a(2131558675);
                  return;
                }
                this.aG.b(2131296784);
                return;
                if (J())
                {
                  this.aE.s();
                  s();
                  return;
                }
                this.aG.b(2131296784);
                return;
                try
                {
                  if (this.d != null)
                  {
                    this.d.a(new v());
                    return;
                  }
                }
                catch (n localn)
                {
                }
              }
            }
          }
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.aG = ((an)getActivity());
    setHasOptionsMenu(true);
    Bundle localBundle = getArguments();
    this.aC = ((f)localBundle.getSerializable("param_contact"));
    this.ax = localBundle.getBoolean("param_call");
    this.ay = localBundle.getBoolean("param_answer");
    if ((!this.ay) && (!this.ax) && (this.aC == null))
      com.enflick.android.TextNow.ads.b.b("press_dialer_button");
    if (this.aC != null)
    {
      Set localSet = textnow.z.h.b(this.aG);
      g localg = f.a(this.aG, localSet, this.aC.a(), this.aC.b());
      if (localg != null)
      {
        this.aC.a(localg.b);
        this.aC.a(localg.a);
      }
    }
    t();
    this.aE.a(this);
    if (this.aF == null)
      this.aF = new textnow.z.u(getActivity());
    this.k = textnow.v.b.h(this.aG);
    new StringBuilder().append("Has system permissions: ").append(this.k).toString();
    if ((localBundle != null) && (localBundle.containsKey("dialer_state")))
    {
      DialerFragment.DialerState localDialerState = (DialerFragment.DialerState)localBundle.getParcelable("dialer_state");
      if (localDialerState != null)
        this.aE.a(localDialerState.a());
    }
    while (true)
    {
      this.i = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          DialerFragment.o(DialerFragment.this);
        }
      };
      getActivity().registerReceiver(this.i, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
      return;
      this.aE.m();
      continue;
      this.aE.m();
    }
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131755014, paramMenu);
    this.am = paramMenu.findItem(2131559083);
    if (this.d == null)
      paramMenu.removeItem(2131559084);
    r();
    v();
    if (this.aF == null)
      this.aF = new textnow.z.u(getActivity());
    w();
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    View localView = paramLayoutInflater.inflate(2130903118, null);
    this.T = localView.findViewById(2131558675);
    this.U = localView.findViewById(2131558676);
    this.V = localView.findViewById(2131558677);
    this.W = localView.findViewById(2131558678);
    this.X = localView.findViewById(2131558683);
    this.Y = localView.findViewById(2131558775);
    this.ap = new s(this, (byte)0);
    this.q = ((EditText)localView.findViewById(2131558702));
    this.q.setKeyListener(this.ap);
    this.q.addTextChangedListener(this.as);
    this.q.addTextChangedListener(new u(this, (byte)0));
    this.q.setLongClickable(false);
    this.r = ((TextView)localView.findViewById(2131558703));
    this.r.setVisibility(8);
    this.s = ((EditText)localView.findViewById(2131558771));
    this.s.addTextChangedListener(this.as);
    this.s.setLongClickable(false);
    this.Z = ((TextView)localView.findViewById(2131558784));
    TextView localTextView = this.Z;
    String str1;
    if (this.aC != null)
      str1 = this.aC.g();
    while (true)
    {
      localTextView.setText(str1);
      this.t = ((ImageButton)localView.findViewById(2131558641));
      this.t.setOnClickListener(this);
      this.t.setOnLongClickListener(this);
      this.u = ((ImageButton)localView.findViewById(2131558700));
      this.u.setOnClickListener(this);
      this.v = ((ImageButton)localView.findViewById(2131558701));
      this.v.setOnClickListener(this);
      this.w = ((ImageButton)localView.findViewById(2131558699));
      this.w.setOnClickListener(this);
      this.x = localView.findViewById(2131558681);
      this.x.setOnClickListener(this);
      this.y = localView.findViewById(2131558682);
      this.y.setOnClickListener(this);
      this.z = localView.findViewById(2131558780);
      this.z.setOnClickListener(this);
      this.A = localView.findViewById(2131558779);
      this.A.setOnClickListener(this);
      this.B = localView.findViewById(2131558679);
      this.C = localView.findViewById(2131558680);
      this.E = localView.findViewById(2131558776);
      this.F = ((TextView)localView.findViewById(2131558777));
      this.D = localView.findViewById(2131558778);
      this.G = ((TextView)localView.findViewById(2131558772));
      this.aa = ((ImageView)localView.findViewById(2131558773));
      this.ab = ((ImageView)localView.findViewById(2131558774));
      this.aj = localView.findViewById(2131558768);
      this.aj.setOnClickListener(this);
      this.ai = localView.findViewById(2131558769);
      this.ak = localView.findViewById(2131558782);
      this.ak.setOnClickListener(this);
      this.al = localView.findViewById(2131558781);
      this.H = ((ToggleButton)localView.findViewById(2131558574));
      this.H.setOnClickListener(this);
      this.I = ((ToggleButton)localView.findViewById(2131558575));
      this.I.setOnClickListener(this);
      this.J = ((ToggleButton)localView.findViewById(2131558576));
      this.J.setOnClickListener(this);
      this.K = ((ToggleButton)localView.findViewById(2131558577));
      this.K.setOnClickListener(this);
      this.L = ((Button)localView.findViewById(2131558578));
      this.L.setOnClickListener(this);
      this.M = ((ImageButton)localView.findViewById(2131558579));
      this.M.setOnClickListener(this);
      this.N = ((ImageButton)localView.findViewById(2131558580));
      this.N.setOnClickListener(this);
      this.O = ((Button)this.W.findViewById(2131558888));
      this.O.setOnClickListener(this);
      this.P = ((Button)this.W.findViewById(2131558889));
      this.P.setOnClickListener(this);
      this.Q = ((Button)this.W.findViewById(2131558890));
      this.Q.setOnClickListener(this);
      this.ad = ((ImageView)this.V.findViewById(2131558788));
      ScaleAnimation localScaleAnimation1 = new ScaleAnimation(1.0F, 2.0F, 1.0F, 2.0F, 1, 0.5F, 1, 0.5F);
      ScaleAnimation localScaleAnimation2 = new ScaleAnimation(1.0F, 2.0F, 1.0F, 2.0F, 1, 0.5F, 1, 0.5F);
      AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(1.0F, 0.0F);
      AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(1.0F, 0.0F);
      localScaleAnimation2.setRepeatCount(-1);
      localScaleAnimation1.setRepeatCount(-1);
      localAlphaAnimation1.setRepeatCount(-1);
      localAlphaAnimation2.setRepeatCount(-1);
      this.au.setInterpolator(new DecelerateInterpolator());
      final AnimationSet localAnimationSet = new AnimationSet(true);
      localAnimationSet.setInterpolator(new DecelerateInterpolator());
      this.au.addAnimation(localAlphaAnimation1);
      this.au.addAnimation(localScaleAnimation1);
      this.au.setDuration(1500L);
      localAnimationSet.addAnimation(localAlphaAnimation2);
      localAnimationSet.addAnimation(localScaleAnimation2);
      localAnimationSet.setDuration(1500L);
      this.au.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
        }

        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          DialerFragment.i(DialerFragment.this).postDelayed(new Runnable()
          {
            public final void run()
            {
              if (DialerFragment.h(DialerFragment.this).getAnimation() != null)
              {
                DialerFragment.i(DialerFragment.this).setVisibility(0);
                DialerFragment.i(DialerFragment.this).startAnimation(DialerFragment.2.this.a);
              }
            }
          }
          , 500L);
        }
      });
      this.ag = this.V.findViewById(2131558787);
      this.ag.setVisibility(0);
      this.ah = this.V.findViewById(2131558786);
      this.ae = ((ImageView)this.V.findViewById(2131558789));
      this.af = ((ImageView)this.V.findViewById(2131558780));
      this.ae.setVisibility(4);
      this.af.setVisibility(4);
      this.ac = ((RelativeLayout)this.V.findViewById(2131558785));
      this.ac.setOnTouchListener(new o(this, (byte)0));
      if (this.d == null)
      {
        this.v.setEnabled(false);
        this.M.setVisibility(8);
        this.M.setEnabled(false);
        this.A.setVisibility(8);
        this.x.setEnabled(false);
        this.w.setEnabled(false);
      }
      a(this.X);
      a(this.Y);
      this.j = true;
      if ((this.ay) && (this.aC != null));
      try
      {
        ContentResolver localContentResolver = this.aG.getContentResolver();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = this.aC.a();
        textnow.z.h localh2 = textnow.z.h.a(localContentResolver, arrayOfString);
        localh1 = localh2;
        label1325: if (localh1 != null)
        {
          str2 = localh1.h();
          if (str2 != null)
            localImageView = (ImageView)this.V.findViewById(2131558783);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException1)
      {
        try
        {
          textnow.z.h localh1;
          String str2;
          ImageView localImageView;
          if (Build.VERSION.SDK_INT >= 14)
          {
            new textnow.v.j();
            textnow.v.j.a(this.aG.getContentResolver(), Uri.parse(str2), localImageView, 2130837560);
          }
          while (true)
          {
            label1393: if (this.ax)
            {
              B();
              this.ax = false;
            }
            return localView;
            str1 = "";
            break;
            localIllegalArgumentException1 = localIllegalArgumentException1;
            new StringBuilder().append("Couldn't load avatar for contact: ").append(this.aC.a()).toString();
            localh1 = null;
            break label1325;
            textnow.v.o.a(this.aG).a(localImageView, Uri.parse(str2), this.at);
          }
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          break label1393;
        }
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.aE.b(this);
    getActivity().unregisterReceiver(this.i);
  }

  public void onDestroyView()
  {
    this.j = false;
    if ((!textnow.v.z.e(this.aG)) && (getActivity() != null))
    {
      this.aG.E();
      this.aG.i(false);
    }
    super.onDestroyView();
  }

  public boolean onLongClick(View paramView)
  {
    if ((paramView == this.t) && (this.q.getVisibility() == 0))
    {
      Editable localEditable = this.q.getText();
      if (localEditable.length() > 0)
      {
        localEditable.clear();
        this.aC = null;
        return true;
      }
    }
    return false;
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2131559084:
    }
    while (true)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      if (this.d != null)
        this.d.a(false);
    }
  }

  public void onPause()
  {
    super.onPause();
    x();
    if (!textnow.v.z.e(this.aG))
      this.aG.setRequestedOrientation(-1);
  }

  public void onResume()
  {
    super.onResume();
    boolean bool;
    if (Settings.System.getInt(this.aG.getContentResolver(), "dtmf_tone", 1) == 1)
      bool = true;
    while (true)
    {
      this.n = bool;
      if (this.n);
      synchronized (this.m)
      {
        ToneGenerator localToneGenerator = this.l;
        if (localToneGenerator == null);
        try
        {
          this.l = new ToneGenerator(3, 80);
          if (!textnow.v.z.e(this.aG))
          {
            this.aG.setRequestedOrientation(1);
            this.aG.D();
            this.aG.i(true);
          }
          s();
          if (this.aC != null)
            a(this.aC.a());
          return;
          bool = false;
        }
        catch (RuntimeException localRuntimeException)
        {
          while (true)
          {
            new StringBuilder().append("Exception caught while creating local tone generator: ").append(localRuntimeException).toString();
            this.l = null;
          }
        }
      }
    }
  }

  public void onStart()
  {
    super.onStart();
    if ((!this.k) && (!this.aF.V()))
    {
      if (this.p == null)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
        localBuilder.setTitle(2131296780).setMessage(2131296781).setPositiveButton(2131296782, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            DialerFragment.p(DialerFragment.this).g(true);
            DialerFragment.p(DialerFragment.this).B();
          }
        }).setCancelable(false);
        this.p = localBuilder.create();
      }
      if (!this.p.isShowing())
        this.p.show();
    }
  }

  public void onStop()
  {
    super.onStop();
    if ((this.p != null) && (this.p.isShowing()))
      this.p.dismiss();
    x();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.DialerFragment
 * JD-Core Version:    0.6.2
 */