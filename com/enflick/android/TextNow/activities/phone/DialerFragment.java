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
import com.enflick.android.TextNow.activities.ah;
import com.enflick.android.TextNow.activities.ao;
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
import textnow.q.ad;
import textnow.q.b;

public class DialerFragment extends ao
  implements View.OnClickListener, f
{
  public static boolean a = false;
  private static final HashMap<String, String> b = new HashMap();
  private static final HashMap<Character, Integer> g = new HashMap();
  private static final HashMap<Integer, Character> h = new HashMap();
  private View A;
  private View B;
  private View C;
  private View D;
  private View E;
  private View F;
  private TextView G;
  private TextView H;
  private ToggleButton I;
  private ToggleButton J;
  private ToggleButton K;
  private ToggleButton L;
  private Button M;
  private ImageButton N;
  private ImageButton O;
  private Button P;
  private Button Q;
  private Button R;
  private Dialog S;
  private Dialog T;
  private View U;
  private View V;
  private View W;
  private View X;
  private View Y;
  private View Z;
  private boolean aA = false;
  private boolean aB = false;
  private boolean aC = false;
  private textnow.u.d aD;
  private textnow.u.f aE;
  private d aF = d.a();
  private textnow.u.r aG;
  private ah aH = null;
  private TextView aa;
  private ImageView ab;
  private ImageView ac;
  private RelativeLayout ad;
  private ImageView ae;
  private ImageView af;
  private ImageView ag;
  private View ah;
  private View ai;
  private View aj;
  private View ak;
  private View al;
  private View am;
  private MenuItem an;
  private TextView ao;
  private TextView ap;
  private o aq;
  private m ar = new m(this, (byte)0);
  private n as = new n(this, (byte)0);
  private PhoneNumberFormattingTextWatcher at = new PhoneNumberFormattingTextWatcher();
  private p au = new p(this, (byte)0);
  private AnimationSet av = new AnimationSet(true);
  private boolean aw = false;
  private boolean ax = false;
  private boolean ay = false;
  private boolean az = false;
  private l i;
  private BroadcastReceiver j;
  private boolean k;
  private boolean l;
  private ToneGenerator m;
  private Object n = new Object();
  private boolean o;
  private textnow.y.a p;
  private AlertDialog q;
  private EditText r;
  private TextView s;
  private EditText t;
  private ImageButton u;
  private ImageButton v;
  private ImageButton w;
  private ImageButton x;
  private View y;
  private View z;

  static
  {
    g.put(Character.valueOf('1'), Integer.valueOf(1));
    g.put(Character.valueOf('2'), Integer.valueOf(2));
    g.put(Character.valueOf('3'), Integer.valueOf(3));
    g.put(Character.valueOf('4'), Integer.valueOf(4));
    g.put(Character.valueOf('5'), Integer.valueOf(5));
    g.put(Character.valueOf('6'), Integer.valueOf(6));
    g.put(Character.valueOf('7'), Integer.valueOf(7));
    g.put(Character.valueOf('8'), Integer.valueOf(8));
    g.put(Character.valueOf('9'), Integer.valueOf(9));
    g.put(Character.valueOf('0'), Integer.valueOf(0));
    g.put(Character.valueOf('#'), Integer.valueOf(11));
    g.put(Character.valueOf('*'), Integer.valueOf(10));
    h.put(Integer.valueOf(2131165415), Character.valueOf('1'));
    h.put(Integer.valueOf(2131165416), Character.valueOf('2'));
    h.put(Integer.valueOf(2131165417), Character.valueOf('3'));
    h.put(Integer.valueOf(2131165418), Character.valueOf('4'));
    h.put(Integer.valueOf(2131165419), Character.valueOf('5'));
    h.put(Integer.valueOf(2131165420), Character.valueOf('6'));
    h.put(Integer.valueOf(2131165421), Character.valueOf('7'));
    h.put(Integer.valueOf(2131165422), Character.valueOf('8'));
    h.put(Integer.valueOf(2131165423), Character.valueOf('9'));
    h.put(Integer.valueOf(2131165425), Character.valueOf('0'));
    h.put(Integer.valueOf(2131165426), Character.valueOf('#'));
    h.put(Integer.valueOf(2131165424), Character.valueOf('*'));
    b.put("##72786#", "android_secret_code://SCRTN");
    b.put("##786#", "android_secret_code://RTN");
    b.put("##3282#", "android_secret_code://DATA");
    b.put("##3424#", "android_secret_code://PUTIL");
    b.put("##33284#", "android_secret_code://DEBUG");
  }

  private void A()
  {
    s locals = this.aF.p();
    if ((locals != null) && (locals.c()) && (this.aw != locals.d()))
    {
      locals.a(this.aw);
      if (locals.n() != null)
      {
        AsyncTask local6 = new AsyncTask()
        {
        };
        Uri[] arrayOfUri = new Uri[1];
        arrayOfUri[0] = locals.n();
        local6.execute(arrayOfUri);
      }
    }
  }

  private void D()
  {
    final EditText localEditText = new EditText(this.aH);
    new AlertDialog.Builder(this.aH).setTitle("Notes On the Call").setView(localEditText).setPositiveButton("Send", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        b.a(DialerFragment.a(DialerFragment.this), "wei@enflick.com", "CDMA feedback", "", localEditText.getText().toString(), true);
      }
    }).setNegativeButton("Cancel", null).create().show();
  }

  private boolean E()
  {
    return (!this.aF.J()) || (!this.aF.K());
  }

  public static DialerFragment a(textnow.u.d paramd, DialerFragment.DialerState paramDialerState, boolean paramBoolean1, boolean paramBoolean2, l paraml)
  {
    DialerFragment localDialerFragment = new DialerFragment();
    Bundle localBundle = new Bundle();
    localBundle.putSerializable("param_contact", paramd);
    localBundle.putBoolean("param_answer", paramBoolean1);
    localBundle.putBoolean("param_call", paramBoolean2);
    localBundle.putParcelable("dialer_state", paramDialerState);
    localDialerFragment.setArguments(localBundle);
    localDialerFragment.i = paraml;
    return localDialerFragment;
  }

  private void a(int paramInt)
  {
    View localView1 = this.U;
    int i1;
    int i2;
    label35: int i3;
    label58: View localView4;
    int i4;
    if (paramInt == 2131165404)
    {
      i1 = 0;
      localView1.setVisibility(i1);
      View localView2 = this.V;
      if (paramInt != 2131165405)
        break label95;
      i2 = 0;
      localView2.setVisibility(i2);
      View localView3 = this.W;
      if (paramInt != 2131165406)
        break label102;
      i3 = 0;
      localView3.setVisibility(i3);
      localView4 = this.X;
      i4 = 0;
      if (paramInt != 2131165407)
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
    Iterator localIterator = h.keySet().iterator();
    while (localIterator.hasNext())
    {
      View localView = paramView.findViewById(((Integer)localIterator.next()).intValue());
      localView.setOnTouchListener(this.as);
      localView.setClickable(true);
      localView.setOnKeyListener(this.ar);
    }
  }

  private void a(String paramString)
  {
    new GetContactInfoTask(paramString).b(this.aH);
  }

  private void a(textnow.u.d paramd)
  {
    if (paramd.b() == 2)
    {
      a(true);
      this.r.getEditableText().replace(0, this.r.length(), paramd.a());
    }
    do
    {
      return;
      a(false);
      this.s.setText(paramd.c());
    }
    while (!paramd.f());
    this.aw = true;
    r();
  }

  private void a(boolean paramBoolean)
  {
    this.s.setText("");
    this.r.setText("");
    if (paramBoolean)
    {
      this.s.setVisibility(8);
      this.r.setVisibility(0);
      return;
    }
    this.r.setVisibility(8);
    this.s.setVisibility(0);
  }

  private void b(final textnow.u.d paramd)
  {
    if (paramd.b() == 2)
    {
      str = getString(2131493373, new Object[] { b.f(paramd.a()) });
      new AlertDialog.Builder(this.aH).setTitle(2131493348).setMessage(str).setPositiveButton(2131493017, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          new SendMessageTask(DialerFragment.a(DialerFragment.this), paramd.b(), paramd.a(), paramd.c(), paramd.d(), 1, 2, true, DialerFragment.a(DialerFragment.this).getString(2131493383), null).b(DialerFragment.a(DialerFragment.this));
        }
      }).setNegativeButton(2131493019, null).setCancelable(true).create().show();
    }
    while (paramd.b() != 3)
    {
      String str;
      return;
    }
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("text/html");
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramd.a();
    localIntent.putExtra("android.intent.extra.EMAIL", arrayOfString);
    localIntent.putExtra("android.intent.extra.SUBJECT", getString(2131493384));
    localIntent.putExtra("android.intent.extra.TEXT", getString(2131493385));
    startActivity(localIntent);
  }

  private void b(boolean paramBoolean)
  {
    String str;
    if (paramBoolean)
      str = getString(2131493363);
    while (true)
    {
      this.t.getEditableText().replace(0, this.t.length(), str);
      return;
      if (this.aD != null)
      {
        str = this.aD.g();
        int i1 = str.indexOf("@textnow.me");
        if (i1 > 0)
          str = str.substring(0, i1);
      }
      else
      {
        str = getString(2131493368);
      }
    }
  }

  private void c(textnow.u.d paramd)
  {
    if ((!this.aw) && (this.aG.C() <= 1))
    {
      this.ax = true;
      this.aH.a(2131493021, true);
      a(paramd.a());
    }
    do
    {
      return;
      this.aH.r();
      if (this.aD.a().equals(this.aG.c()))
      {
        this.aH.c(2131493382);
        return;
      }
      boolean bool = this.aC;
      this.aC = false;
      if (!this.aF.a(this.aD, true, bool))
      {
        this.aH.c(2131493026);
        return;
      }
    }
    while (this.aw);
    a(this.aD.a());
  }

  private void c(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if ((this.aF.J()) && (this.aF.q().c(this.aF.p())))
      {
        this.ac.setVisibility(0);
        this.ab.setVisibility(8);
        this.B.setVisibility(0);
        return;
      }
      this.ac.setVisibility(8);
      this.ab.setVisibility(0);
      this.B.setVisibility(8);
      return;
    }
    this.ac.setVisibility(8);
    this.ab.setVisibility(8);
    this.B.setVisibility(8);
  }

  private void o()
  {
    if (this.an != null)
    {
      View localView = android.support.v4.view.v.a(this.an);
      this.ao = ((TextView)localView.findViewById(2131165282));
      this.ap = ((TextView)localView.findViewById(2131165283));
    }
  }

  private void p()
  {
    s locals;
    c localc;
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
          boolean bool1 = this.k;
          if (!bool1)
            return;
          new StringBuilder().append("update UI for state: ").append(Call.State.getLabel(this.aF.y())).toString();
          localState1 = this.aF.y();
          locals = this.aF.p();
          localc = this.aF.q();
          if (this.az)
          {
            this.ah.startAnimation(this.av);
            if (!this.az)
              break;
            a(2131165406);
            s();
            r();
            if ((locals == null) || (!locals.i()))
              continue;
            t();
            continue;
          }
        }
        finally
        {
        }
        this.av.cancel();
        this.av.reset();
      }
      if ((!d.c(localState1)) || (locals == null) || (locals.i()))
        break label1121;
      if (!this.aC)
        a(2131165405);
      this.aD = locals.b();
      if (this.aD != null)
      {
        if ((!this.aF.J()) || (!localc.c(locals)))
          break label1333;
        bool3 = true;
        b(bool3);
      }
      String str;
      if ((locals != null) && (locals.m() != null) && (this.ab.getVisibility() == 0))
      {
        str = locals.m().h();
        new StringBuilder().append("Loading photo: ").append(str).append(" for ").append(locals.m().c()).toString();
        new StringBuilder().append("Call: ").append(locals.toString()).toString();
        if (!textnow.u.f.c(str))
          break label450;
        this.ab.setImageResource(2130837596);
      }
      while (true)
      {
        if (!this.aF.J())
          break label1320;
        i1 = localc.e();
        if (this.aF.H() - i1 <= 0)
          break label1002;
        localObject2 = null;
        if (!this.aF.J())
          break label925;
        if (!localc.c(locals))
          break;
        Iterator localIterator2 = this.aF.G().iterator();
        if (!localIterator2.hasNext())
          break label1339;
        localObject5 = (s)localIterator2.next();
        if (localc.c((s)localObject5))
          break label1313;
        break label1326;
        Uri localUri = Uri.parse(str);
        if (Build.VERSION.SDK_INT >= 14)
        {
          new textnow.q.j();
          textnow.q.j.a(this.aH.getContentResolver(), localUri, this.ab, 2130837596);
        }
        else
        {
          textnow.q.q.a(this.aH).a(this.ab, localUri, this.au);
        }
      }
      new StringBuilder().append("notCurrentCall is ").append(((s)localObject3).b().a()).toString();
      if (!((s)localObject3).a(locals))
        break label1293;
      i2 = 1;
      if (i2 == 0)
        break label977;
      localView1 = this.ak;
      localTextView = (TextView)localView1.findViewById(2131165414);
      ad.a(localView1.findViewById(2131165413), this.aH);
      if ((!this.aF.J()) || (!localc.c((s)localObject3)))
        break label986;
      localTextView.setText(getString(2131493363));
      View localView2 = this.ak;
      if (i2 == 0)
        break label1353;
      i3 = 0;
      localView2.setVisibility(i3);
      View localView3 = this.aj;
      if (i2 == 0)
        break label1360;
      i4 = 0;
      localView3.setVisibility(i4);
      View localView4 = this.al;
      if (i2 == 0)
        break label1367;
      i5 = 8;
      localView4.setVisibility(i5);
      View localView5 = this.am;
      if (i2 == 0)
        break label1373;
      i6 = 8;
      localView5.setVisibility(i6);
      if (this.aA)
        break label1379;
      bool2 = true;
      c(bool2);
      localState2 = this.aF.y();
    }
    while (!d.c(localState2));
    View localView6;
    if (d.b(localState2))
    {
      this.I.setEnabled(true);
      this.L.setEnabled(true);
      this.K.setEnabled(true);
      this.L.setChecked(this.aF.z());
      this.I.setChecked(this.aA);
      localView6 = this.Z;
      if (!this.aA)
        break label1385;
    }
    label848: label977: label986: label1121: label1379: label1385: for (int i8 = 0; ; i8 = 8)
    {
      localView6.setVisibility(i8);
      ToggleButton localToggleButton = this.K;
      localToggleButton.setChecked(d.x());
      z();
      int i7;
      label874: Iterator localIterator1;
      if (this.aF.J())
      {
        i7 = this.aF.q().e();
        if (this.aF.H() - i7 > 0)
        {
          this.M.setVisibility(0);
          this.N.setVisibility(8);
          this.O.setVisibility(0);
          break;
          localObject3 = localc.b();
          break label518;
          localIterator1 = this.aF.G().iterator();
        }
      }
      while (true)
      {
        Object localObject4;
        if (localIterator1.hasNext())
        {
          localObject4 = (s)localIterator1.next();
          if (((s)localObject4).a() != locals.a())
          {
            break label1346;
            localView1 = this.al;
            break label570;
            localTextView.setText(((s)localObject3).b().g());
            break label630;
            label1002: this.al.setVisibility(8);
            this.am.setVisibility(8);
            this.ak.setVisibility(8);
            this.aj.setVisibility(8);
            break label716;
            this.I.setChecked(false);
            this.I.setEnabled(false);
            this.Z.setVisibility(8);
            this.L.setEnabled(false);
            this.K.setEnabled(false);
            break label848;
            this.M.setVisibility(8);
            if (this.e != null)
              this.N.setVisibility(0);
            this.O.setVisibility(8);
            break;
            if ((locals != null) && (locals.i()))
            {
              a(2131165407);
              break;
            }
            a(2131165404);
            if (this.aD == null)
              break;
            if (this.aD.b() == 2)
            {
              a(true);
              this.r.getEditableText().replace(0, this.r.length(), this.aD.a());
              break;
            }
            if (this.aD.b() == 3)
            {
              a(false);
              this.s.setText(this.aD.a().substring(0, this.aD.a().indexOf("@")));
              this.aw = true;
              break;
            }
            a(false);
            this.s.setText(this.aD.a());
            this.aw = true;
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

  private void q()
  {
    if (this.aD == null);
    while ((!TextUtils.isEmpty(this.aD.c())) || (this.aD.b() != 2))
      return;
    try
    {
      this.aD.b(textnow.q.k.a(TextNowApp.a().getApplicationContext().getContentResolver(), this.aD.a()));
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private void r()
  {
    int i1 = 8;
    Call.State localState = this.aF.y();
    s locals = this.aF.p();
    int i3;
    if (d.a(localState))
    {
      View localView3 = this.E;
      if (!this.aw)
      {
        i3 = i1;
        localView3.setVisibility(i3);
        View localView4 = this.F;
        if (!this.aw)
          break label96;
        label62: localView4.setVisibility(i1);
        if (localState != Call.State.IncomingTrying)
          break label101;
        this.G.setText(2131493357);
      }
    }
    label96: label101: View localView2;
    label144: 
    do
      while (true)
      {
        s();
        return;
        i3 = 0;
        break;
        i1 = 0;
        break label62;
        this.G.setText(2131493355);
        continue;
        if (!d.b(localState))
          break label144;
        this.E.setVisibility(i1);
        localView2 = this.F;
        localView2.setVisibility(i1);
      }
    while ((locals != null) && (!locals.i()));
    View localView1 = this.C;
    if (this.aw);
    for (int i2 = 0; ; i2 = i1)
    {
      localView1.setVisibility(i2);
      localView2 = this.D;
      if (this.aw)
        break;
      i1 = 0;
      break;
    }
  }

  private void s()
  {
    if (this.ao == null)
      o();
    s locals;
    int i1;
    TextView localTextView2;
    int i2;
    if ((this.ao != null) && (this.ap != null))
    {
      locals = this.aF.p();
      if ((locals == null) || (!locals.c()))
        break label104;
      TextView localTextView1 = this.ao;
      if (!this.aw)
        break label92;
      i1 = 8;
      localTextView1.setVisibility(i1);
      localTextView2 = this.ap;
      boolean bool = this.aw;
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
    label104: if ((this.az) || (locals != null))
    {
      this.ao.setVisibility(8);
      this.ap.setVisibility(0);
      return;
    }
    this.ao.setVisibility(0);
    this.ap.setVisibility(8);
  }

  private void t()
  {
    int i1 = this.aG.C();
    if (this.ao != null)
    {
      TextView localTextView = this.ao;
      Resources localResources = getActivity().getResources();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i1);
      localTextView.setText(localResources.getQuantityString(2131689478, i1, arrayOfObject));
    }
  }

  private void u()
  {
    synchronized (this.n)
    {
      if (this.m != null)
      {
        this.m.release();
        this.aH.setVolumeControlStream(2);
        this.m = null;
      }
      return;
    }
  }

  private void v()
  {
    if (this.aF.y() == Call.State.Established)
      this.aF.u();
  }

  private void w()
  {
    y();
    if ((this.aD == null) && (TextUtils.isEmpty(this.r.getEditableText())))
    {
      String str2 = this.aG.ad();
      textnow.u.d locald;
      if (!str2.isEmpty())
      {
        new StringBuilder().append("populating dialer with number = ").append(str2).toString();
        if (!str2.contains("@"))
          break label114;
        locald = new textnow.u.d(str2, 3, str2.substring(0, str2.indexOf("@")), null);
      }
      while (true)
      {
        a(locald);
        this.aD = locald;
        return;
        label114: if (TextUtils.isDigitsOnly(str2))
          locald = new textnow.u.d(str2, 2, null, null);
        else
          locald = new textnow.u.d(str2, 1, str2, null);
      }
    }
    if (this.aD.a().equals("911"))
    {
      if (this.l)
      {
        Intent localIntent = new Intent();
        localIntent.setAction("android.intent.action.CALL_EMERGENCY");
        localIntent.setData(Uri.parse("tel:911"));
        this.aH.startActivity(localIntent);
        return;
      }
      this.aH.c(2131493378);
      return;
    }
    String str1 = this.aD.a();
    if (this.aD.b() == 2)
    {
      str1 = b.b(str1);
      if (str1 == null)
      {
        Toast.makeText(this.aH, 2131493376, 0).show();
        return;
      }
      Set localSet = textnow.u.f.b(this.aH);
      textnow.u.e locale = textnow.u.d.a(this.aH, localSet, this.aD.a(), this.aD.b());
      if (locale != null)
      {
        this.aD.a(locale.b);
        this.aD.a(locale.a);
      }
    }
    if ((this.aG.aa()) && ("ACTIVE".equalsIgnoreCase(new textnow.u.q(this.aH).d())) && (!b.e(this.aH)) && ((!b.d(this.aH)) || (textnow.q.a.a)) && (this.aF.l()))
    {
      this.aH.a(2131493021, true);
      new SpeedTestTask(new textnow.u.n(this.aH), this.aD, null).b(this.aH);
    }
    while (true)
    {
      this.aG.F(str1);
      this.aG.n();
      return;
      c(this.aD);
    }
  }

  private void y()
  {
    String str2;
    String str3;
    if (this.r.getVisibility() == 0)
    {
      String str1 = this.r.getEditableText().toString();
      if (!TextUtils.isEmpty(str1))
      {
        str2 = b.e(str1);
        str3 = b.b(str2);
        if (str3 == null)
          break label80;
      }
    }
    while (true)
    {
      if ((this.aD == null) || (!this.aD.a().equals(str3)))
        this.aD = new textnow.u.d(str3, 2, null, null, true);
      return;
      label80: str3 = str2;
    }
  }

  private void z()
  {
    int i1 = 255;
    AudioRoute localAudioRoute = this.aF.o();
    int i3;
    int i2;
    int i4;
    int i5;
    int i6;
    label94: int i7;
    label119: int i8;
    label143: Drawable localDrawable4;
    if (d.h())
    {
      this.J.setEnabled(true);
      this.J.setChecked(false);
      if (localAudioRoute == AudioRoute.BluetoothSCO)
      {
        i3 = 1;
        i2 = 0;
        i4 = 0;
        i5 = 1;
        LayerDrawable localLayerDrawable = (LayerDrawable)this.J.getBackground();
        localLayerDrawable.findDrawableByLayerId(2131165748).setAlpha(0);
        Drawable localDrawable1 = localLayerDrawable.findDrawableByLayerId(2131165749);
        if (i5 == 0)
          break label266;
        i6 = i1;
        localDrawable1.setAlpha(i6);
        Drawable localDrawable2 = localLayerDrawable.findDrawableByLayerId(2131165750);
        if (i3 == 0)
          break label272;
        i7 = i1;
        localDrawable2.setAlpha(i7);
        Drawable localDrawable3 = localLayerDrawable.findDrawableByLayerId(2131165752);
        if (i2 == 0)
          break label278;
        i8 = i1;
        localDrawable3.setAlpha(i8);
        localDrawable4 = localLayerDrawable.findDrawableByLayerId(2131165751);
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
      this.J.setEnabled(true);
      if (localAudioRoute == AudioRoute.Speaker)
      {
        this.J.setChecked(true);
        i4 = 1;
        i3 = 0;
        i2 = 0;
        i5 = 0;
        break;
      }
      this.J.setChecked(false);
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

  public final boolean B()
  {
    if (this.aC)
    {
      d();
      return true;
    }
    if ((this.aD != null) && (this.az) && (this.aF.H() > 0))
    {
      this.aF.B();
      return true;
    }
    return super.B();
  }

  public final void a()
  {
    p();
  }

  public final void a(long paramLong)
  {
    if (this.H == null)
      return;
    if (paramLong == 0L)
    {
      this.H.setText("00:00");
      return;
    }
    s locals = this.aF.p();
    if ((locals != null) && (locals.c()) && (!locals.d()))
    {
      int i1 = (int)(paramLong / 60L);
      int i2 = this.aG.C() - i1;
      if (this.ao != null)
      {
        TextView localTextView = this.ao;
        Resources localResources = this.aH.getResources();
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i2);
        localTextView.setText(localResources.getQuantityString(2131689478, i2, arrayOfObject));
      }
    }
    String str = DateUtils.formatElapsedTime(paramLong);
    this.H.setText(str);
  }

  public final void a(String paramString, e parame)
  {
    int i1 = 1;
    new StringBuilder().append("Call hold state changed for id: ").append(paramString).append(" to ").append(parame.name()).toString();
    if (!this.k)
      label43: return;
    if (this.aF.z())
      this.L.setChecked(i1);
    s locals;
    while (true)
    {
      locals = this.aF.f(paramString);
      if (locals == null)
        break;
      switch (8.a[parame.ordinal()])
      {
      default:
        this.az = false;
        p();
        if (this.i == null)
          break label43;
        this.i.t();
        return;
        this.L.setChecked(false);
      case 1:
      }
    }
    if (this.aF.H() <= i1)
    {
      this.ak.setVisibility(8);
      this.al.setVisibility(8);
    }
    this.aD = locals.b();
    q();
    if ((this.aF.J()) && (this.aF.q().c(locals)));
    while (true)
    {
      b(i1);
      break;
      int i2 = 0;
    }
  }

  public final void a(String paramString, textnow.u.f paramf, boolean paramBoolean)
  {
    this.az = false;
    this.aF.I();
    if (this.aF.H() > 0)
      new StringBuilder().append("Call finished for callId: ").append(paramString).append(" Waiting for other calls to finish").toString();
    while (true)
    {
      if (this.aB)
      {
        this.aB = false;
        this.p.a(paramString, paramf, paramBoolean);
        String str = this.p.c();
        b.a(this.aH, "enflick.support@enflick.com", "Call feedback for " + this.aG.b(), str, "", false);
      }
      if (a)
        D();
      return;
      if (paramBoolean)
      {
        a(2131165407);
        this.aE = paramf;
      }
      else if (this.i != null)
      {
        new StringBuilder().append("Call finished for callId: ").append(paramString).append(" Opening conversation screen").toString();
        this.i.b(paramf);
      }
      else if (this.e != null)
      {
        new StringBuilder().append("Call finished for callId: ").append(paramString).append(" Opening home").toString();
        this.e.h();
      }
    }
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    if (paramc.getClass() == GetContactInfoTask.class)
    {
      GetContactInfoTask localGetContactInfoTask = (GetContactInfoTask)paramc;
      String str2 = localGetContactInfoTask.b();
      if (((this.aD != null) && (this.aD.a().equals(str2))) || (str2.equals(b.b(this.r.getEditableText().toString()))))
      {
        if ((!localGetContactInfoTask.h()) && (localGetContactInfoTask.a()))
          break label139;
        this.aw = false;
        r();
        this.aH.r();
        if (!this.ax)
          break label179;
        this.ax = false;
        if ((this.aw) || (this.aG.C() > 0))
          break label147;
        this.aH.showDialog(5, null);
      }
      while (true)
      {
        return true;
        label139: this.aw = true;
        break;
        label147: boolean bool = this.aC;
        this.aC = false;
        this.aF.a(this.aD, this.aw, bool);
        continue;
        label179: A();
      }
    }
    if (paramc.getClass() == SpeedTestTask.class)
    {
      if (((SpeedTestTask)paramc).b() != null)
      {
        SpeedTestTask localSpeedTestTask = (SpeedTestTask)paramc;
        textnow.u.l locall;
        if (this.aF.a(localSpeedTestTask.a()))
        {
          locall = textnow.u.l.a(this.aH.getContentResolver(), localSpeedTestTask.b().a());
          if ((locall == null) || (TextUtils.isEmpty(locall.a())) || (locall.b()))
            new GetContactProxyTask(this.aG.b(), localSpeedTestTask.b()).b(this.aH);
        }
        while (true)
        {
          return true;
          this.aH.r();
          if (this.aF.a(this.aH, this.aD, locall.a()))
          {
            this.aH.onBackPressed();
            if (a)
              D();
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
      this.aH.r();
      String str1 = localGetContactProxyTask.a();
      if ((!TextUtils.isEmpty(str1)) && (this.aF.a(this.aH, localGetContactProxyTask.b(), str1)))
      {
        this.aH.onBackPressed();
        if (a)
          D();
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
    p();
    A();
  }

  public final boolean c()
  {
    return this.aC;
  }

  public final void d()
  {
    this.aC = false;
    a(2131165405);
  }

  public final textnow.u.d e()
  {
    return this.aD;
  }

  public final void f()
  {
    if (this.o);
    synchronized (this.n)
    {
      if (this.m != null)
        this.m.stopTone();
      Instance.Audio.dtmfOff();
      return;
    }
  }

  public final void g()
  {
    if ((this.aD != null) && (this.az) && (this.aF.H() > 0))
      this.aF.B();
  }

  public final DialerFragment.DialerState h()
  {
    if (this.k)
      return new DialerFragment.DialerState(d.n());
    return DialerFragment.DialerState.a;
  }

  public final String k()
  {
    return "/Dialer";
  }

  public final String l()
  {
    return null;
  }

  public final int m()
  {
    return 2131165537;
  }

  public final boolean n()
  {
    return true;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.aH.setTitle("");
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
          a((textnow.u.d)paramIntent.getSerializableExtra("extra_contact"));
          return;
        }
      }
      while (paramInt1 != 4);
      b((textnow.u.d)paramIntent.getSerializableExtra("extra_contact"));
      return;
    }
    startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 1);
  }

  public void onClick(View paramView)
  {
    boolean bool1 = true;
    switch (paramView.getId())
    {
    case 2131165498:
    default:
    case 2131165375:
    case 2131165429:
    case 2131165430:
    case 2131165428:
    case 2131165410:
    case 2131165411:
    case 2131165508:
    case 2131165321:
    case 2131165322:
    case 2131165323:
    case 2131165324:
    case 2131165325:
    case 2131165496:
    case 2131165510:
    case 2131165592:
    case 2131165593:
    case 2131165594:
    case 2131165326:
    case 2131165327:
    case 2131165507:
    }
    while (true)
    {
      return;
      if (this.r.getVisibility() == 0)
      {
        Editable localEditable = this.r.getText();
        if (localEditable.length() > 0)
        {
          localEditable.delete(-1 + localEditable.length(), localEditable.length());
          if (localEditable.length() == 0)
            this.aD = null;
        }
      }
      else
      {
        a(bool1);
        this.aD = null;
        this.aw = false;
        r();
        return;
        w();
        return;
        y();
        if (this.aD != null)
        {
          ah localah2 = this.aH;
          String str = this.aD.a();
          if (this.aD.b() == 2);
          while (true)
          {
            textnow.q.k.a(localah2, str, bool1);
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
          com.enflick.android.TextNow.ads.a.b("tap_get_more_credits");
          if (this.e != null)
          {
            this.e.i();
            this.e.f(2131165539);
            return;
            com.enflick.android.TextNow.ads.a.b("tap_invite_button");
            y();
            if (this.aD == null)
              try
              {
                startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 3);
                return;
              }
              catch (ActivityNotFoundException localActivityNotFoundException1)
              {
                return;
              }
            if ((this.aD.b() == 2) && (b.b(this.aD.a()) == null))
            {
              Toast.makeText(this.aH, 2131493135, 0).show();
              return;
            }
            b(this.aD);
            return;
            this.aF.b(false);
            return;
            if (this.aF.y() != Call.State.Established)
            {
              this.Z.setVisibility(8);
              this.I.setChecked(false);
              c(bool1);
              this.aA = false;
              return;
            }
            if (this.Z.getVisibility() == 0)
            {
              this.Z.setVisibility(8);
              this.I.setChecked(false);
              c(bool1);
              this.aA = false;
              r();
              return;
            }
            this.Z.setVisibility(0);
            this.I.setChecked(bool1);
            c(false);
            this.F.setVisibility(8);
            this.E.setVisibility(8);
            this.aA = bool1;
            return;
            if (d.h())
            {
              ah localah1;
              int i1;
              String[] arrayOfString;
              if (this.S == null)
              {
                localah1 = this.aH;
                i1 = this.aG.ac().intValue();
                arrayOfString = getResources().getStringArray(2131623948);
                if ((this.aG.ac().intValue() >= 100) || (Build.VERSION.SDK_INT < 11))
                  break label754;
              }
              label754: for (TypedArray localTypedArray = getResources().obtainTypedArray(2131623936); ; localTypedArray = getResources().obtainTypedArray(2131623937))
              {
                this.S = ad.a(localah1, i1, 2131493365, arrayOfString, localTypedArray, new DialogInterface.OnClickListener()
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
                      DialerFragment.q(DialerFragment.this);
                      return;
                      DialerFragment.b(DialerFragment.this).a(AudioRoute.Receiver);
                      DialerFragment.q(DialerFragment.this);
                      return;
                    }
                    while (!d.h());
                    DialerFragment.b(DialerFragment.this).a(AudioRoute.BluetoothSCO);
                    DialerFragment.q(DialerFragment.this);
                  }
                });
                if ((this.T != null) && (this.T.isShowing()))
                  this.T.dismiss();
                if (this.S.isShowing())
                  break;
                this.S.show();
                return;
              }
            }
            this.aF.v();
            z();
            return;
            if (this.aF.y() == Call.State.Established)
            {
              boolean bool2 = d.w();
              this.K.setChecked(bool2);
              return;
              v();
              return;
              this.aF.r();
              return;
              if (this.e != null)
              {
                this.e.i();
                return;
                b(this.aD);
                return;
                a("", this.aE, false);
                return;
                if (E())
                {
                  this.aC = bool1;
                  if (!this.aF.z())
                    v();
                  this.r.setText("");
                  a(2131165404);
                  return;
                }
                this.aH.c(2131493381);
                return;
                if (E())
                {
                  this.aF.s();
                  p();
                  return;
                }
                this.aH.c(2131493381);
                return;
                try
                {
                  if (this.e != null)
                  {
                    this.e.a(new r());
                    return;
                  }
                }
                catch (j localj)
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
    this.aH = ((ah)getActivity());
    setHasOptionsMenu(true);
    Bundle localBundle = getArguments();
    this.aD = ((textnow.u.d)localBundle.getSerializable("param_contact"));
    this.ay = localBundle.getBoolean("param_call");
    this.az = localBundle.getBoolean("param_answer");
    if ((!this.az) && (!this.ay) && (this.aD == null))
      com.enflick.android.TextNow.ads.a.b("press_dialer_button");
    if (this.aD != null)
    {
      Set localSet = textnow.u.f.b(this.aH);
      textnow.u.e locale = textnow.u.d.a(this.aH, localSet, this.aD.a(), this.aD.b());
      if (locale != null)
      {
        this.aD.a(locale.b);
        this.aD.a(locale.a);
      }
    }
    q();
    if (!ad.c(this.aH))
    {
      this.aH.y();
      this.aH.f(true);
    }
    this.aF.a(this);
    if (this.aG == null)
      this.aG = new textnow.u.r(getActivity());
    this.l = b.i(this.aH);
    new StringBuilder().append("Has system permissions: ").append(this.l).toString();
    if ((localBundle != null) && (localBundle.containsKey("dialer_state")))
    {
      DialerFragment.DialerState localDialerState = (DialerFragment.DialerState)localBundle.getParcelable("dialer_state");
      if (localDialerState != null)
        this.aF.a(localDialerState.a());
    }
    while (true)
    {
      this.j = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          DialerFragment.q(DialerFragment.this);
        }
      };
      getActivity().registerReceiver(this.j, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
      return;
      this.aF.m();
      continue;
      this.aF.m();
    }
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(2131755012, paramMenu);
    this.an = paramMenu.findItem(2131165779);
    o();
    s();
    if (this.aG == null)
      this.aG = new textnow.u.r(getActivity());
    t();
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    View localView = paramLayoutInflater.inflate(2130903106, null);
    this.U = localView.findViewById(2131165404);
    this.V = localView.findViewById(2131165405);
    this.W = localView.findViewById(2131165406);
    this.X = localView.findViewById(2131165407);
    this.Y = localView.findViewById(2131165412);
    this.Z = localView.findViewById(2131165503);
    this.aq = new o(this, (byte)0);
    this.r = ((EditText)localView.findViewById(2131165431));
    this.r.setKeyListener(this.aq);
    this.r.addTextChangedListener(this.at);
    this.r.addTextChangedListener(new q(this, (byte)0));
    this.r.setLongClickable(false);
    this.s = ((TextView)localView.findViewById(2131165432));
    this.s.setVisibility(8);
    this.t = ((EditText)localView.findViewById(2131165499));
    this.t.addTextChangedListener(this.at);
    this.t.setLongClickable(false);
    this.aa = ((TextView)localView.findViewById(2131165512));
    TextView localTextView = this.aa;
    String str1;
    if (this.aD != null)
      str1 = this.aD.g();
    while (true)
    {
      localTextView.setText(str1);
      this.u = ((ImageButton)localView.findViewById(2131165375));
      this.u.setOnClickListener(this);
      this.v = ((ImageButton)localView.findViewById(2131165429));
      this.v.setOnClickListener(this);
      this.w = ((ImageButton)localView.findViewById(2131165430));
      this.w.setOnClickListener(this);
      this.x = ((ImageButton)localView.findViewById(2131165428));
      this.x.setOnClickListener(this);
      this.y = localView.findViewById(2131165410);
      this.y.setOnClickListener(this);
      this.z = localView.findViewById(2131165411);
      this.z.setOnClickListener(this);
      this.A = localView.findViewById(2131165508);
      this.A.setOnClickListener(this);
      this.B = localView.findViewById(2131165507);
      this.B.setOnClickListener(this);
      this.C = localView.findViewById(2131165408);
      this.D = localView.findViewById(2131165409);
      this.F = localView.findViewById(2131165504);
      this.G = ((TextView)localView.findViewById(2131165505));
      this.E = localView.findViewById(2131165506);
      this.H = ((TextView)localView.findViewById(2131165500));
      this.ab = ((ImageView)localView.findViewById(2131165501));
      this.ac = ((ImageView)localView.findViewById(2131165502));
      this.ak = localView.findViewById(2131165496);
      this.ak.setOnClickListener(this);
      this.aj = localView.findViewById(2131165497);
      this.al = localView.findViewById(2131165510);
      this.al.setOnClickListener(this);
      this.am = localView.findViewById(2131165509);
      this.I = ((ToggleButton)localView.findViewById(2131165321));
      this.I.setOnClickListener(this);
      this.J = ((ToggleButton)localView.findViewById(2131165322));
      this.J.setOnClickListener(this);
      this.K = ((ToggleButton)localView.findViewById(2131165323));
      this.K.setOnClickListener(this);
      this.L = ((ToggleButton)localView.findViewById(2131165324));
      this.L.setOnClickListener(this);
      this.M = ((Button)localView.findViewById(2131165325));
      this.M.setOnClickListener(this);
      this.N = ((ImageButton)localView.findViewById(2131165326));
      this.N.setOnClickListener(this);
      this.O = ((ImageButton)localView.findViewById(2131165327));
      this.O.setOnClickListener(this);
      this.P = ((Button)this.X.findViewById(2131165592));
      this.P.setOnClickListener(this);
      this.Q = ((Button)this.X.findViewById(2131165593));
      this.Q.setOnClickListener(this);
      this.R = ((Button)this.X.findViewById(2131165594));
      this.R.setOnClickListener(this);
      this.ae = ((ImageView)this.W.findViewById(2131165516));
      ScaleAnimation localScaleAnimation1 = new ScaleAnimation(1.0F, 2.0F, 1.0F, 2.0F, 1, 0.5F, 1, 0.5F);
      ScaleAnimation localScaleAnimation2 = new ScaleAnimation(1.0F, 2.0F, 1.0F, 2.0F, 1, 0.5F, 1, 0.5F);
      AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(1.0F, 0.0F);
      AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(1.0F, 0.0F);
      localScaleAnimation2.setRepeatCount(-1);
      localScaleAnimation1.setRepeatCount(-1);
      localAlphaAnimation1.setRepeatCount(-1);
      localAlphaAnimation2.setRepeatCount(-1);
      this.av.setInterpolator(new DecelerateInterpolator());
      final AnimationSet localAnimationSet = new AnimationSet(true);
      localAnimationSet.setInterpolator(new DecelerateInterpolator());
      this.av.addAnimation(localAlphaAnimation1);
      this.av.addAnimation(localScaleAnimation1);
      this.av.setDuration(1500L);
      localAnimationSet.addAnimation(localAlphaAnimation2);
      localAnimationSet.addAnimation(localScaleAnimation2);
      localAnimationSet.setDuration(1500L);
      this.av.setAnimationListener(new Animation.AnimationListener()
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
      this.ah = this.W.findViewById(2131165515);
      this.ah.setVisibility(0);
      this.ai = this.W.findViewById(2131165514);
      this.af = ((ImageView)this.W.findViewById(2131165517));
      this.ag = ((ImageView)this.W.findViewById(2131165508));
      this.af.setVisibility(4);
      this.ag.setVisibility(4);
      this.ad = ((RelativeLayout)this.W.findViewById(2131165513));
      this.ad.setOnTouchListener(new k(this, (byte)0));
      if (this.e == null)
      {
        this.w.setEnabled(false);
        this.N.setVisibility(8);
        this.N.setEnabled(false);
        this.B.setVisibility(8);
        this.y.setEnabled(false);
        this.x.setEnabled(false);
      }
      a(this.Y);
      a(this.Z);
      this.k = true;
      if ((this.az) && (this.aD != null));
      try
      {
        ContentResolver localContentResolver = this.aH.getContentResolver();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = this.aD.a();
        textnow.u.f localf2 = textnow.u.f.a(localContentResolver, arrayOfString);
        localf1 = localf2;
        label1317: if (localf1 != null)
        {
          str2 = localf1.h();
          if (str2 != null)
            localImageView = (ImageView)this.W.findViewById(2131165511);
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException1)
      {
        try
        {
          textnow.u.f localf1;
          String str2;
          ImageView localImageView;
          if (Build.VERSION.SDK_INT >= 14)
          {
            new textnow.q.j();
            textnow.q.j.a(this.aH.getContentResolver(), Uri.parse(str2), localImageView, 2130837596);
          }
          while (true)
          {
            label1385: if (this.ay)
            {
              w();
              this.ay = false;
            }
            return localView;
            str1 = "";
            break;
            localIllegalArgumentException1 = localIllegalArgumentException1;
            new StringBuilder().append("Couldn't load avatar for contact: ").append(this.aD.a()).toString();
            localf1 = null;
            break label1317;
            textnow.q.q.a(this.aH).a(localImageView, Uri.parse(str2), this.au);
          }
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          break label1385;
        }
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.aF.b(this);
    getActivity().unregisterReceiver(this.j);
  }

  public void onDestroyView()
  {
    this.k = false;
    if ((!ad.c(this.aH)) && (getActivity() != null))
    {
      this.aH.z();
      this.aH.f(false);
    }
    super.onDestroyView();
  }

  public void onPause()
  {
    super.onPause();
    u();
    if (!ad.c(this.aH))
      this.aH.setRequestedOrientation(-1);
  }

  public void onResume()
  {
    super.onResume();
    boolean bool;
    if (Settings.System.getInt(this.aH.getContentResolver(), "dtmf_tone", 1) == 1)
      bool = true;
    while (true)
    {
      this.o = bool;
      if (this.o);
      synchronized (this.n)
      {
        ToneGenerator localToneGenerator = this.m;
        if (localToneGenerator == null);
        try
        {
          this.m = new ToneGenerator(3, 80);
          this.aH.setVolumeControlStream(3);
          if (!ad.c(this.aH))
            this.aH.setRequestedOrientation(1);
          p();
          if (this.aD != null)
            a(this.aD.a());
          return;
          bool = false;
        }
        catch (RuntimeException localRuntimeException)
        {
          while (true)
          {
            new StringBuilder().append("Exception caught while creating local tone generator: ").append(localRuntimeException).toString();
            this.m = null;
          }
        }
      }
    }
  }

  public void onStart()
  {
    super.onStart();
    if ((!this.l) && (!this.aG.T()))
    {
      if (this.q == null)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
        localBuilder.setTitle(2131493377).setMessage(2131493378).setPositiveButton(2131493379, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            DialerFragment.r(DialerFragment.this).g(true);
            DialerFragment.r(DialerFragment.this).n();
          }
        }).setCancelable(false);
        this.q = localBuilder.create();
      }
      if (!this.q.isShowing())
        this.q.show();
    }
  }

  public void onStop()
  {
    super.onStop();
    if ((this.q != null) && (this.q.isShowing()))
      this.q.dismiss();
    u();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.DialerFragment
 * JD-Core Version:    0.6.2
 */