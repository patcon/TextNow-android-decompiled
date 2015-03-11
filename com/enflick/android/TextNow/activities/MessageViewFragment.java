package com.enflick.android.TextNow.activities;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentProviderOperation;
import android.content.ContentProviderOperation.Builder;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.ContactsContract.Contacts;
import android.support.v4.content.j;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HeaderViewListAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView.Tokenizer;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.enflick.android.TextNow.chatheads.ChatHeadIntentService;
import com.enflick.android.TextNow.tasks.CreateGroupWithMessageInfoTask;
import com.enflick.android.TextNow.tasks.DeleteMessagesTask;
import com.enflick.android.TextNow.tasks.DownloadToFileTask;
import com.enflick.android.TextNow.tasks.GetGroupTask;
import com.enflick.android.TextNow.tasks.GetHistoryForConversationTask;
import com.enflick.android.TextNow.tasks.GetMessagesForConversationTask;
import com.enflick.android.TextNow.tasks.GetNewMessagesTask;
import com.enflick.android.TextNow.tasks.ImportSMSForConversationTask;
import com.enflick.android.TextNow.tasks.MarkMessagesReadTask;
import com.enflick.android.TextNow.tasks.SendMessageTask;
import com.enflick.android.TextNow.tasks.SendSMSTask;
import com.enflick.android.TextNow.tasks.UpdateGroupInfoTask;
import com.enflick.android.TextNow.views.AttachmentsPanel;
import com.enflick.android.TextNow.views.ExtendedEditText;
import com.enflick.android.TextNow.views.RecipientField;
import com.enflick.android.TextNow.views.TintedFrameLayout;
import com.enflick.android.TextNow.views.TintedImageView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import textnow.bk.ar;
import textnow.v.o;
import textnow.z.m;

public class MessageViewFragment extends av
  implements android.support.v4.app.aa<Cursor>, View.OnClickListener, AbsListView.OnScrollListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, d, com.enflick.android.TextNow.views.b, com.enflick.android.TextNow.views.e, com.enflick.android.TextNow.views.i, textnow.p.z, textnow.w.b
{
  public static String a = "";
  private ListView A;
  private RecipientField B;
  private AttachmentsPanel C;
  private View D;
  private View E;
  private TextView F;
  private ImageButton G;
  private boolean H = false;
  private boolean I = false;
  private boolean J = false;
  private boolean K = false;
  private View L;
  private MultiAutoCompleteTextView.Tokenizer M;
  private textnow.p.y N;
  private textnow.p.l O;
  private c P;
  private ArrayList<Long> Q = new ArrayList();
  private int R = -1;
  private v S;
  private boolean T = false;
  private String U;
  private String V = null;
  private ar W;
  private int X = 0;
  private int Y;
  private View Z;
  private View aa;
  private TextView ab;
  private AsyncTask<Void, Void, Void> ac;
  private List<com.enflick.android.TextNow.tasks.c> ad = new ArrayList();
  private boolean ae = false;
  private boolean af = false;
  private int ag = -1;
  private int ah;
  private int ai;
  private com.handmark.pulltorefresh.library.e aj;
  private TextView.OnEditorActionListener ak = new TextView.OnEditorActionListener()
  {
    public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
    {
      if (paramAnonymousInt == 4)
      {
        String str = paramAnonymousTextView.getText().toString().trim();
        if (str.length() > 1000)
          while (str.length() > 1000)
          {
            MessageViewFragment.a(MessageViewFragment.this, str.substring(0, 1000), null, 1);
            str = str.substring(1000, str.length());
          }
        MessageViewFragment.a(MessageViewFragment.this, str, null, 1);
        MessageViewFragment.o(MessageViewFragment.this);
        return true;
      }
      return false;
    }
  };
  private an b;
  private boolean f;
  private boolean g;
  private boolean h = false;
  private boolean i = false;
  private textnow.z.h j = null;
  private textnow.z.i k = null;
  private textnow.z.f l = null;
  private u m;
  private PullToRefreshListView n;
  private ListView o;
  private LinearLayout p;
  private View q;
  private ExtendedEditText r;
  private ExtendedEditText s;
  private ImageView t;
  private TintedImageView u;
  private Button v;
  private TintedFrameLayout w;
  private View x;
  private View y;
  private LinearLayout z;

  private boolean D()
  {
    if (this.af)
      return true;
    if ((this.l != null) && (getActivity() != null))
      this.af = textnow.ac.b.d(getActivity().getContentResolver(), this.l.a());
    return this.af;
  }

  private void E()
  {
    if (textnow.v.a.a)
      android.support.v4.app.z.a(true);
    if (this.l != null)
    {
      getLoaderManager().a(1, null, this);
      return;
    }
    getLoaderManager().a(1);
    this.N.b(null);
  }

  private void F()
  {
    synchronized (this.ad)
    {
      if (!this.ad.isEmpty())
      {
        this.R = new MessageViewFragment.BatchMessageSenderTask(this.ad).b(this.b);
        this.ad.clear();
      }
      return;
    }
  }

  private boolean G()
  {
    return (this.c.S()) && (((this.l != null) && (this.l.b() == 2)) || (this.l == null));
  }

  private void H()
  {
    new y(this, (byte)0).execute(new Void[0]);
  }

  public static MessageViewFragment a(int paramInt, textnow.z.h paramh, MessageViewFragment.MessageViewState paramMessageViewState, v paramv)
  {
    MessageViewFragment localMessageViewFragment = new MessageViewFragment();
    Bundle localBundle = new Bundle();
    localBundle.putInt("type", paramInt);
    if (paramh != null)
      localBundle.putSerializable("conversation", paramh);
    localBundle.putParcelable("message_view_state", paramMessageViewState);
    localMessageViewFragment.setArguments(localBundle);
    localMessageViewFragment.S = paramv;
    return localMessageViewFragment;
  }

  private void a(u paramu)
  {
    if (paramu == null)
      return;
    if (this.j == null)
    {
      paramu.a(2131559050);
      paramu.a(2131559052);
      paramu.a(2131559051);
      return;
    }
    if (!this.j.n())
    {
      paramu.a(2131559050);
      paramu.a(2131559052);
      paramu.b(2131559051);
      return;
    }
    paramu.b(2131559050);
    paramu.b(2131559052);
    paramu.a(2131559051);
  }

  private void a(com.enflick.android.TextNow.tasks.c paramc)
  {
    synchronized (this.ad)
    {
      this.ad.add(paramc);
      return;
    }
  }

  private void a(String paramString, w paramw, int paramInt)
  {
    if ((TextUtils.isEmpty(paramString)) && (paramw == null))
      return;
    String str1 = null;
    String str2;
    switch (paramInt)
    {
    default:
      str2 = "text";
      if (!D())
        break;
    case 2:
    case 10:
    }
    List localList1;
    for (String str3 = "group"; ; str3 = "1:1")
    {
      HashMap localHashMap1 = new HashMap();
      localHashMap1.put("message_type", str2);
      localHashMap1.put("chat_type", str3);
      com.enflick.android.TextNow.ads.b.a("send_message", localHashMap1);
      if (!this.h)
        break label1354;
      ab localab = aa.a(this.B.getText());
      localList1 = localab.a();
      List localList2 = localab.b();
      if ((localList1 != null) && ((!localList1.isEmpty()) || (localList2.isEmpty())))
        break label222;
      this.b.b(2131296549);
      return;
      if (paramw.a == 3);
      for (str2 = "photo_capture"; ; str2 = "photo_saved")
      {
        str1 = paramw.b;
        break;
      }
      str2 = "location";
      str1 = null;
      break;
    }
    label222: if (localList1.isEmpty())
    {
      this.b.b(2131296546);
      return;
    }
    this.b.setRequestedOrientation(-1);
    label551: label580: int i3;
    label904: textnow.z.f localf2;
    int i4;
    label1084: label1131: label1146: String str7;
    label1158: String str8;
    if (localList1.size() > 1)
    {
      com.enflick.android.TextNow.ads.b.a("start_new_chat", "chat_type", "group");
      HashMap localHashMap2 = new HashMap();
      Iterator localIterator3 = localList1.iterator();
      int i7 = 0;
      while (localIterator3.hasNext())
      {
        textnow.z.f localf4 = (textnow.z.f)localIterator3.next();
        if (localf4.b() == 3)
        {
          if (localf4.a().toLowerCase(Locale.US).endsWith("@textnow.me"))
            localHashMap2.put(localf4.a().substring(0, localf4.a().indexOf("@")), Integer.valueOf(1));
          else
            i7++;
        }
        else if ((localf4.b() == 2) && (!"911".equals(localf4.a())))
          localHashMap2.put(localf4.a(), Integer.valueOf(2));
        else
          localHashMap2.put(localf4.a(), Integer.valueOf(1));
      }
      if (i7 != 0)
      {
        if (i7 == 1)
        {
          this.b.c(2131296822);
          return;
        }
        an localan3 = this.b;
        String str13 = this.b.getString(2131296821);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i7);
        localan3.b(String.format(str13, arrayOfObject));
        return;
      }
      new CreateGroupWithMessageInfoTask(null, localHashMap2, paramString, paramInt, str1).b(this.b);
      this.b.a(2131296813, false);
      c(true);
      a(null, true);
      this.z.setVisibility(8);
      this.F.setVisibility(8);
      if (this.s != null)
        this.s.setText("");
    }
    else
    {
      com.enflick.android.TextNow.ads.b.a("start_new_chat", "chat_type", "1:1");
      if (this.X == 1)
      {
        Iterator localIterator2 = localList1.iterator();
        while (localIterator2.hasNext())
          if (((textnow.z.f)localIterator2.next()).b() != 2)
          {
            this.b.b(2131296582);
            return;
          }
      }
      this.l = ((textnow.z.f)localList1.get(0));
      Set localSet = textnow.z.h.b(this.b);
      textnow.z.g localg = textnow.z.f.a(this.b, localSet, this.l.a(), this.l.b());
      String str12;
      if (localg != null)
      {
        this.l.a(localg.b);
        this.l.a(localg.a);
        ContentResolver localContentResolver2 = this.b.getContentResolver();
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = localg.a;
        this.j = textnow.z.h.a(localContentResolver2, arrayOfString2);
        if (this.j == null)
          break label1158;
        this.V = this.j.m();
        str12 = this.j.e();
        if (TextUtils.isEmpty(str12))
        {
          if (this.j.d() != 2)
            break label1146;
          if (!textnow.v.k.a(this.j.c()))
            break label1131;
          str12 = "Unknown Number";
        }
      }
      while (true)
      {
        d(str12);
        if (!this.T)
        {
          textnow.z.f localf3 = textnow.v.k.a(this.b.getContentResolver(), this.j, this.l);
          if (localf3 != null)
            d(localf3.g());
          this.T = true;
        }
        this.N.a(this.j);
        i3 = 0;
        Iterator localIterator1 = localList1.iterator();
        while (true)
        {
          if (!localIterator1.hasNext())
            break label1325;
          localf2 = (textnow.z.f)localIterator1.next();
          if ((this.X != 1) && ((!"911".equals(localf2.a())) || (!textnow.v.b.h(this.b)) || (str1 != null)))
            break;
          a(new SendSMSTask(localf2.a(), localf2.c(), paramString));
          if ((localf2.b() == 2) || (i3 != 0) || (!this.c.S()))
            break label1579;
          if (this.u != null)
            this.u.setVisibility(8);
          this.t = ((ImageView)this.b.findViewById(2131558878));
          this.t.setVisibility(0);
          this.t.setAlpha(155);
          this.ab.setVisibility(8);
          i4 = 1;
          i3 = i4;
        }
        ContentResolver localContentResolver1 = this.b.getContentResolver();
        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = this.l.a();
        this.j = textnow.z.h.a(localContentResolver1, arrayOfString1);
        break;
        str12 = textnow.v.b.f(this.j.c());
        continue;
        str12 = this.j.c();
      }
      str7 = this.l.g();
      if (!this.l.e())
        break label1586;
      Uri localUri = textnow.v.k.a(this.b.getContentResolver(), this.l.a(), this.l.b());
      if (localUri == null)
        break label1586;
      str8 = textnow.v.k.b(this.b.getContentResolver(), localUri);
      if (str8 == null)
        break label1586;
    }
    while (true)
    {
      d(str8);
      break label904;
      an localan2 = this.b;
      int i5 = localf2.b();
      String str9 = localf2.a();
      String str10 = localf2.c();
      String str11 = localf2.d();
      if (str1 == null);
      for (int i6 = 1; ; i6 = 2)
      {
        a(new SendMessageTask(localan2, i5, str9, str10, str11, i6, 2, true, paramString, textnow.z.c.a(this.b.getBaseContext(), str1)));
        break;
      }
      label1325: this.b.supportInvalidateOptionsMenu();
      this.h = false;
      this.n.a(com.handmark.pulltorefresh.library.e.d);
      E();
      break label551;
      label1354: if (this.l == null)
        break label580;
      if (!this.T)
      {
        textnow.z.f localf1 = textnow.v.k.a(this.b.getContentResolver(), this.j, this.l);
        if (localf1 != null)
        {
          d(localf1.g());
          this.b.supportInvalidateOptionsMenu();
        }
        this.T = true;
      }
      if ((this.X == 1) || (("911".equals(this.l.a())) && (textnow.v.b.h(this.b)) && (str1 == null)))
      {
        a(new SendSMSTask(this.l.a(), this.l.c(), paramString));
        break label580;
      }
      an localan1 = this.b;
      int i1 = this.l.b();
      String str4 = this.l.a();
      String str5 = this.l.c();
      String str6 = this.l.d();
      if (str1 == null);
      for (int i2 = 1; ; i2 = 2)
      {
        a(new SendMessageTask(localan1, i1, str4, str5, str6, i2, 2, true, paramString, textnow.z.c.a(this.b.getBaseContext(), str1)));
        break label580;
        break;
      }
      label1579: i4 = i3;
      break label1084;
      label1586: str8 = str7;
    }
  }

  private boolean a(View paramView, boolean paramBoolean)
  {
    paramView.invalidate();
    return this.N.a(paramView, paramBoolean);
  }

  private void b(u paramu)
  {
    if (paramu == null)
      return;
    if ((this.j == null) || (!textnow.v.b.f()))
    {
      this.m.a(2131559066);
      this.m.a(2131559067);
      return;
    }
    if (!com.enflick.android.TextNow.chatheads.g.f())
    {
      this.m.a(2131559067);
      return;
    }
    com.enflick.android.TextNow.chatheads.g localg = com.enflick.android.TextNow.chatheads.g.a(this.b);
    if ((localg != null) && (localg.a(this.j)))
    {
      this.m.a(2131559066);
      this.m.b(2131559067);
      return;
    }
    this.m.b(2131559066);
    this.m.a(2131559067);
  }

  private void b(String paramString)
  {
    if ((getActivity() != null) && (getActivity().isFinishing()));
    while (TextUtils.isEmpty(paramString))
      return;
    android.support.v4.app.k localk = getActivity();
    if (this.l != null);
    for (String str = this.l.g(); ; str = null)
    {
      new textnow.t.a(localk, paramString, str).show();
      return;
    }
  }

  private void c(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      try
      {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
        return;
      }
      catch (Throwable localThrowable)
      {
      }
    this.b.b(2131296417);
  }

  private void c(boolean paramBoolean)
  {
    if ((this.A == null) || (this.n == null))
      return;
    if (paramBoolean)
    {
      this.A.setVisibility(8);
      this.p.setVisibility(0);
      return;
    }
    this.p.setVisibility(8);
  }

  private void d(String paramString)
  {
    if (this.b != null)
    {
      this.b.setTitle(paramString);
      String str = A();
      if ((paramString != null) && (!paramString.equals(str)))
        this.b.a(str);
    }
    else
    {
      return;
    }
    this.b.a("");
  }

  public final String A()
  {
    if ((this.j != null) || (this.l != null))
    {
      int i1;
      String str;
      if (this.j != null)
      {
        i1 = this.j.d();
        if (this.j == null)
          break label71;
        str = this.j.c();
      }
      while (true)
        if (i1 == 2)
        {
          if (textnow.v.k.a(str))
          {
            return "Unknown Number";
            i1 = this.l.b();
            break;
            label71: str = this.l.a();
            continue;
          }
          return textnow.v.b.f(str);
        }
      if (i1 == 1)
        return str + "@textnow.me";
      if (i1 != 5)
        return str;
    }
    return null;
  }

  public final MessageViewFragment.MessageViewState B()
  {
    MessageViewFragment.MessageViewState localMessageViewState = new MessageViewFragment.MessageViewState();
    if (this.s != null);
    for (String str = this.s.getText().toString(); ; str = "")
    {
      localMessageViewState.b = str;
      if (this.B != null)
      {
        ab localab = aa.a(this.B.getEditableText());
        List localList1 = localab.a();
        textnow.z.f[] arrayOff = new textnow.z.f[localList1.size()];
        localList1.toArray(arrayOff);
        List localList2 = localab.b();
        String[] arrayOfString = new String[localList2.size()];
        localList2.toArray(arrayOfString);
        localMessageViewState.c = arrayOff;
        localMessageViewState.d = arrayOfString;
      }
      if (this.N != null)
      {
        localMessageViewState.e = this.N.k();
        localMessageViewState.f = this.ag;
      }
      return localMessageViewState;
    }
  }

  public final boolean C()
  {
    if (this.J)
    {
      j();
      return true;
    }
    if (this.H)
    {
      a(true);
      return true;
    }
    if ((this.P != null) && (this.P.a() == 2))
    {
      this.P.b();
      return true;
    }
    e();
    return super.C();
  }

  public final void a()
  {
    this.ai = this.o.getChoiceMode();
    this.ah = this.o.getTranscriptMode();
    this.aj = this.n.h();
    this.o.setChoiceMode(2);
    this.o.setTranscriptMode(0);
    this.n.a(com.handmark.pulltorefresh.library.e.a);
  }

  public final void a(int paramInt)
  {
    if (paramInt == 0);
    while (true)
    {
      try
      {
        Intent localIntent2 = new Intent("android.media.action.IMAGE_CAPTURE");
        File localFile = textnow.v.g.a(this.b, textnow.v.h.a, System.currentTimeMillis());
        if (localFile == null)
        {
          this.b.b(2131296796);
          return;
        }
        this.U = localFile.getAbsolutePath();
        localIntent2.putExtra("output", Uri.fromFile(localFile));
        this.b.h = true;
        startActivityForResult(localIntent2, 3);
        if (!this.H)
          break;
        a(false);
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        this.b.b(2131296574);
        continue;
      }
      if (paramInt == 1)
      {
        Intent localIntent1 = new Intent("android.intent.action.PICK");
        localIntent1.setType("image/*");
        this.b.h = true;
        startActivityForResult(localIntent1, 4);
      }
    }
  }

  public final void a(int paramInt, boolean paramBoolean)
  {
    int i1 = 8;
    if ((paramInt > 1) || ((paramInt == 1) && (paramBoolean)))
    {
      this.v.setVisibility(0);
      this.F.setVisibility(0);
      if (this.w != null)
        this.w.setVisibility(i1);
      this.t.setVisibility(i1);
    }
    do
    {
      return;
      this.v.setVisibility(i1);
      TextView localTextView = this.F;
      if (paramInt > 0)
        i1 = 0;
      localTextView.setVisibility(i1);
      this.t.setVisibility(0);
    }
    while ((this.w == null) || (!G()));
    this.w.setVisibility(0);
  }

  public final void a(com.enflick.android.TextNow.views.emoticons.a parama)
  {
    this.s.getEditableText().insert(this.s.getSelectionStart(), parama.b());
  }

  public final void a(String paramString)
  {
    this.V = paramString;
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    View localView;
    LinearLayout localLinearLayout;
    ImageView localImageView;
    if (!TextUtils.isEmpty(paramString))
    {
      this.I = bool;
      if (TextUtils.isEmpty(paramString))
        paramString = new textnow.z.u(this.b).v();
      localView = getView();
      localLinearLayout = (LinearLayout)localView.findViewById(2131558871);
      localImageView = (ImageView)localView.findViewById(2131558861);
      if ((this.n == null) || (localLinearLayout == null));
    }
    while (true)
    {
      try
      {
        if (TextUtils.isEmpty(paramString))
        {
          localImageView.setImageDrawable(null);
          localImageView.setVisibility(8);
          localLinearLayout.setBackgroundResource(17170445);
          TypedArray localTypedArray = this.b.obtainStyledAttributes(new int[] { 2130772278 });
          if (Build.VERSION.SDK_INT < 11)
            break label347;
          i2 = localTypedArray.getColor(0, 17170435);
          ((EditText)localView.findViewById(2131558759)).setTextColor(i2);
          ((EditText)localView.findViewById(2131558877)).setTextColor(i2);
          this.z.setBackgroundColor(0);
          this.A.setBackgroundColor(0);
          if ((this.N == null) || (this.n == null))
            break label341;
          this.N.l();
          this.o.invalidateViews();
          return;
        }
        Drawable localDrawable = Drawable.createFromPath(paramString);
        localLinearLayout.setBackgroundColor(-1728053248);
        localImageView.setImageDrawable(localDrawable);
        localImageView.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11)
        {
          i1 = -1;
          ((EditText)localView.findViewById(2131558759)).setTextColor(i1);
          ((EditText)localView.findViewById(2131558877)).setTextColor(i1);
          this.z.setBackgroundColor(-1728053248);
          this.A.setBackgroundColor(-1728053248);
          continue;
        }
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        localImageView.setImageDrawable(null);
        localLinearLayout.setBackgroundColor(0);
        System.gc();
        return;
      }
      int i1 = -16777216;
      continue;
      label341: return;
      bool = false;
      break;
      label347: int i2 = -16777216;
    }
  }

  public final void a(textnow.z.f paramf)
  {
    this.l = paramf;
  }

  public final void a(boolean paramBoolean)
  {
    this.H = false;
    if (paramBoolean)
      this.C.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        int a = 0;

        public final boolean onPreDraw()
        {
          new StringBuilder().append("panel top: ").append(MessageViewFragment.g(MessageViewFragment.this).getTop()).toString();
          int i = MessageViewFragment.g(MessageViewFragment.this).getTop();
          if (i == this.a)
          {
            MessageViewFragment.g(MessageViewFragment.this).getViewTreeObserver().removeOnPreDrawListener(this);
            TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, -MessageViewFragment.g(MessageViewFragment.this).getHeight(), 0.0F);
            localTranslateAnimation.setDuration(MessageViewFragment.this.getResources().getInteger(17694720));
            MessageViewFragment.p(MessageViewFragment.this).startAnimation(localTranslateAnimation);
          }
          while (true)
          {
            return false;
            this.a = i;
          }
        }
      });
    this.C.setVisibility(8);
    this.y.setVisibility(8);
    this.x.setVisibility(0);
    this.b.d(17170445);
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 2131559091:
      this.Q.clear();
      if (this.P.a() == 1)
        this.Q.add(Long.valueOf(this.N.h()));
      while (true)
      {
        this.b.showDialog(3);
        return true;
        this.Q.addAll(this.N.e());
      }
    case 2131559090:
    }
    ClipboardManager localClipboardManager = (ClipboardManager)this.b.getSystemService("clipboard");
    if (this.P.a() == 1)
      localClipboardManager.setText(this.N.i());
    while (true)
    {
      d();
      return true;
      localClipboardManager.setText(this.N.g());
    }
  }

  protected final boolean a(com.enflick.android.TextNow.tasks.c paramc, boolean paramBoolean)
  {
    Class localClass = paramc.getClass();
    boolean bool = paramc.h();
    int i1 = paramc.i();
    String str1 = paramc.j();
    int i2 = paramc.e();
    if ((localClass == GetMessagesForConversationTask.class) || (localClass == ImportSMSForConversationTask.class) || (localClass == GetHistoryForConversationTask.class))
      if (this.n != null)
        this.n.o();
    label189: label324: label333: String str3;
    textnow.v.h localh;
    do
    {
      do
      {
        do
        {
          return true;
          if (localClass == GetNewMessagesTask.class)
          {
            if ((this.l != null) && (this.g))
            {
              new MarkMessagesReadTask(this.l.a()).b(this.b);
              if (this.l.b() == 5)
                H();
            }
            return false;
          }
          if ((localClass != SendMessageTask.class) && (localClass != MessageViewFragment.BatchMessageSenderTask.class))
            break label333;
          if (this.b == null)
            return false;
          this.b.v();
          if (bool)
          {
            if ((i1 != 400) || (!"USER_NOT_FOUND".equals(str1)))
              break;
            this.b.b(2131296550);
          }
          if (i2 != this.R)
            break label324;
          this.R = -1;
        }
        while (bool);
        if ((this.j == null) && (this.l != null))
        {
          ContentResolver localContentResolver1 = this.b.getContentResolver();
          String[] arrayOfString1 = new String[1];
          arrayOfString1[0] = this.l.a();
          this.j = textnow.z.h.a(localContentResolver1, arrayOfString1);
        }
        if (this.j != null)
        {
          this.V = this.j.m();
          this.S.a(this.j);
        }
        if (this.j != null);
        for (String str2 = this.j.c(); ; str2 = "")
        {
          a = str2;
          return true;
          this.b.b(2131296432);
          break label189;
          break;
        }
        if (localClass == CreateGroupWithMessageInfoTask.class)
        {
          this.b.v();
          if (bool)
          {
            this.b.b(2131296432);
            if (this.d != null)
              this.d.j();
          }
        }
        do
          while (true)
          {
            return false;
            if ((paramc instanceof CreateGroupWithMessageInfoTask))
            {
              CreateGroupWithMessageInfoTask localCreateGroupWithMessageInfoTask = (CreateGroupWithMessageInfoTask)paramc;
              if (localCreateGroupWithMessageInfoTask != null)
              {
                String str4 = localCreateGroupWithMessageInfoTask.a();
                String str5 = localCreateGroupWithMessageInfoTask.d();
                String str6 = localCreateGroupWithMessageInfoTask.c();
                String str7 = localCreateGroupWithMessageInfoTask.b();
                new z(this, str4).execute(new Void[0]);
                this.l = new textnow.z.f(str4, 5, str5, null);
                this.q.setVisibility(0);
                android.support.v4.app.k localk = getActivity();
                if (str6 == null);
                for (int i3 = 1; ; i3 = 2)
                {
                  a(new SendMessageTask(localk, 5, str4, str5, null, i3, 2, true, str7, textnow.z.c.a(this.b.getBaseContext(), str6)));
                  F();
                  this.v.setVisibility(8);
                  this.t.setVisibility(0);
                  if ((this.w != null) && (G()))
                    this.w.setVisibility(0);
                  this.h = false;
                  this.n.a(com.handmark.pulltorefresh.library.e.d);
                  this.N.a(true);
                  E();
                  ContentResolver localContentResolver2 = this.b.getContentResolver();
                  String[] arrayOfString2 = new String[1];
                  arrayOfString2[0] = this.l.a();
                  this.j = textnow.z.h.a(localContentResolver2, arrayOfString2);
                  this.b.supportInvalidateOptionsMenu();
                  break;
                }
              }
              this.b.b(2131296432);
              continue;
              if (localClass == UpdateGroupInfoTask.class)
              {
                this.b.v();
                if (bool)
                {
                  this.b.b(2131296432);
                }
                else if (this.b != null)
                {
                  new y(this, (byte)0).execute(new Void[0]);
                  this.b.runOnUiThread(new Runnable()
                  {
                    public final void run()
                    {
                      MessageViewFragment.a(MessageViewFragment.this).setVisibility(8);
                    }
                  });
                }
              }
              else
              {
                if (localClass != GetGroupTask.class)
                  break;
                if (("NOT_FOUND".equals(str1)) && (i1 == 404))
                {
                  textnow.ac.b.c(getActivity().getContentResolver(), this.l.a());
                  if (this.d != null)
                    this.d.j();
                  this.b.b(2131296820);
                }
              }
            }
          }
        while (localClass != DownloadToFileTask.class);
        DownloadToFileTask localDownloadToFileTask = (DownloadToFileTask)paramc;
        this.b.v();
        if (bool)
        {
          this.b.b(2131296798);
          return true;
        }
        str3 = localDownloadToFileTask.b();
        localh = localDownloadToFileTask.c();
        if (TextUtils.isEmpty(str3))
        {
          c(localDownloadToFileTask.d());
          return true;
        }
        if (localh == textnow.v.h.d)
        {
          b(str3);
          return true;
        }
        if (localh != textnow.v.h.b)
          break;
      }
      while (((getActivity() != null) && (getActivity().isFinishing())) || (TextUtils.isEmpty(str3)));
      new textnow.t.a(getActivity(), str3).show();
      return true;
    }
    while ((localh != textnow.v.h.c) || (TextUtils.isEmpty(str3)));
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(new File(str3)), "video/*");
    startActivity(localIntent);
    return true;
  }

  public final void b()
  {
    this.o.setChoiceMode(this.ai);
    this.o.setTranscriptMode(this.ah);
    this.n.a(this.aj);
    int i1 = this.o.getFirstVisiblePosition();
    View localView = this.o.getChildAt(0);
    int i2;
    if (localView == null)
    {
      i2 = 0;
      if (!(this.o.getAdapter() instanceof HeaderViewListAdapter))
        break label107;
      this.o.setAdapter(((HeaderViewListAdapter)this.o.getAdapter()).getWrappedAdapter());
    }
    while (true)
    {
      this.o.setSelectionFromTop(i1, i2);
      return;
      i2 = localView.getTop();
      break;
      label107: this.o.setAdapter(this.o.getAdapter());
    }
  }

  public final void b(boolean paramBoolean)
  {
    this.b.v();
    if (!paramBoolean)
      this.b.b(getResources().getString(2131296924));
  }

  public final int c()
  {
    return this.N.e().size();
  }

  public final void d()
  {
    this.N.j();
    this.o.clearChoices();
    this.n.requestLayout();
    if (this.P.a() == 2)
      this.P.b();
  }

  public final void e()
  {
    if (this.e == null)
      this.e = y();
    if (this.e != null)
    {
      if (this.b == null)
        break label60;
      ((InputMethodManager)this.b.getSystemService("input_method")).hideSoftInputFromWindow(this.e, 0);
      this.b.e(true);
    }
    label60: 
    while (this.b == null)
      return;
    ((InputMethodManager)this.b.getSystemService("input_method")).hideSoftInputFromWindow(this.e, 0);
    this.b.e(true);
  }

  public final textnow.z.h f()
  {
    return this.j;
  }

  public final textnow.z.f g()
  {
    return this.l;
  }

  public final boolean h()
  {
    return this.H;
  }

  public final boolean i()
  {
    return this.J;
  }

  public final void j()
  {
    this.w.setVisibility(0);
    this.aa.setVisibility(8);
    this.Z.setVisibility(8);
    this.J = false;
  }

  public final void k()
  {
    this.H = true;
    final boolean bool;
    if (this.d != null)
    {
      bool = this.d.q();
      final int i1 = getResources().getInteger(17694720);
      this.C.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        int a = 0;

        public final boolean onPreDraw()
        {
          new StringBuilder().append("panel top: ").append(MessageViewFragment.g(MessageViewFragment.this).getTop()).toString();
          int i = MessageViewFragment.g(MessageViewFragment.this).getTop();
          TranslateAnimation localTranslateAnimation;
          if (i == this.a)
          {
            MessageViewFragment.g(MessageViewFragment.this).getViewTreeObserver().removeOnPreDrawListener(this);
            localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, MessageViewFragment.g(MessageViewFragment.this).getHeight(), 0.0F);
            localTranslateAnimation.setDuration(i1);
            if (bool)
              MessageViewFragment.g(MessageViewFragment.this).startAnimation(localTranslateAnimation);
          }
          while (true)
          {
            return false;
            MessageViewFragment.p(MessageViewFragment.this).startAnimation(localTranslateAnimation);
            continue;
            this.a = i;
          }
        }
      });
      if (((!bool) || (this.d == null) || (this.d.i())) && ((!bool) || (this.b == null)))
        break label162;
      e();
      this.C.postDelayed(new Runnable()
      {
        public final void run()
        {
          MessageViewFragment.g(MessageViewFragment.this).setVisibility(0);
          MessageViewFragment.q(MessageViewFragment.this).setVisibility(0);
          MessageViewFragment.r(MessageViewFragment.this).setVisibility(8);
        }
      }
      , 50L);
    }
    while (true)
    {
      if (((this.d != null) && (!this.d.i())) || ((this.d == null) && (this.b != null)))
        this.b.d(2131230855);
      return;
      bool = ((ChatHeadMessageActivity)this.b).h();
      break;
      label162: this.C.setVisibility(0);
      this.y.setVisibility(0);
      this.x.setVisibility(8);
    }
  }

  public final String l()
  {
    if (!this.i)
    {
      if (this.h)
        return "/New_Message";
      return "/Existing_Chat";
    }
    return null;
  }

  public final String m()
  {
    if (this.l != null)
      return this.l.g();
    if (this.Y == 1)
      return this.b.getString(2131296545);
    return this.b.getString(2131296418);
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
    if (!this.i)
    {
      if (this.Y != 1)
        break label208;
      this.n.a(com.handmark.pulltorefresh.library.e.a);
    }
    while (true)
    {
      this.n.a(false);
      this.n.d(true);
      this.n.a(new com.handmark.pulltorefresh.library.h()
      {
        public final void a(PullToRefreshBase<ListView> paramAnonymousPullToRefreshBase)
        {
          if ((!MessageViewFragment.this.v()) && (!MessageViewFragment.this.w()))
          {
            if (paramAnonymousPullToRefreshBase.g() == com.handmark.pulltorefresh.library.e.c)
              MessageViewFragment.this.t();
          }
          else
            return;
          MessageViewFragment.this.u();
        }
      });
      com.handmark.pulltorefresh.library.a locala = this.n.a(true, false);
      if (locala != null)
      {
        locala.a(this.b.getString(2131296390));
        locala.c(this.b.getString(2131296391));
        locala.b(this.b.getString(2131296392));
      }
      this.n.setVisibility(4);
      this.n.a(this.N);
      this.n.a(this);
      this.o.setOnItemLongClickListener(this);
      this.o.setChoiceMode(0);
      this.n.a(this);
      this.P = new c(this.b, 2131755018, 2131689473, this);
      if (this.l != null)
        E();
      return;
      label208: this.n.a(com.handmark.pulltorefresh.library.e.d);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1)
      if (paramInt1 == 11)
      {
        Uri localUri2 = paramIntent.getData();
        Intent localIntent = new Intent(this.b, ContactDetailsActivity.class);
        localIntent.putExtra("contact_uri", localUri2);
        localIntent.putExtra("phone_only", false);
        startActivityForResult(localIntent, 2);
      }
    while (true)
    {
      return;
      if (paramInt1 == 2)
      {
        textnow.z.f localf = (textnow.z.f)paramIntent.getSerializableExtra("extra_contact");
        if (this.B == null)
          continue;
        this.B.a(localf, this.M);
        this.B.requestFocus();
        return;
      }
      if (paramInt1 == 3)
        this.b.h = false;
      try
      {
        textnow.v.g.a(this.b, new File(this.U), textnow.v.h.a);
        label143: x localx2 = new x(this, (byte)0);
        w[] arrayOfw2 = new w[1];
        arrayOfw2[0] = new w(this, paramInt1, this.U);
        localx2.execute(arrayOfw2);
        return;
        if (paramInt1 != 4)
          continue;
        this.b.h = false;
        if ((paramIntent == null) || (paramIntent.getData() == null))
          continue;
        Uri localUri1 = paramIntent.getData();
        if (localUri1 != null)
        {
          String str1 = localUri1.toString();
          if (str1.startsWith("content://"))
          {
            String str2 = textnow.v.g.a(this.b, str1);
            if ((!TextUtils.isEmpty(str2)) && (!textnow.v.g.a(str2)))
            {
              this.b.b(2131296575);
              return;
            }
            x localx1 = new x(this, (byte)0);
            w[] arrayOfw1 = new w[1];
            arrayOfw1[0] = new w(this, paramInt1, str1);
            localx1.execute(arrayOfw1);
            return;
          }
        }
        this.b.b(2131296575);
        return;
        if (paramInt2 != 0)
          continue;
        if (paramInt1 == 3)
        {
          this.b.h = false;
          if (this.U != null)
            new File(this.U).delete();
        }
        if (paramInt1 != 4)
          continue;
        this.b.h = false;
        return;
      }
      catch (Throwable localThrowable)
      {
        break label143;
      }
    }
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131558864:
    case 2131558865:
    default:
      return;
    case 2131558867:
      String str = this.r.getText().toString();
      if (TextUtils.isEmpty(str))
      {
        this.b.b(2131296819);
        return;
      }
      new UpdateGroupInfoTask(this.l.a(), str).b(getActivity());
      d(str);
      this.b.a(2131296814, true);
      return;
    case 2131558866:
      this.q.setVisibility(8);
      return;
    case 2131558863:
    }
    try
    {
      startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI), 11);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    boolean bool = a(paramMenuItem);
    if (!bool)
      bool = super.onContextItemSelected(paramMenuItem);
    return bool;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.b = ((an)getActivity());
    Bundle localBundle = getArguments();
    this.Y = localBundle.getInt("type", 2);
    if (((this.Y == 2) || (this.Y == 3)) && (localBundle.containsKey("conversation")))
    {
      this.j = ((textnow.z.h)localBundle.getSerializable("conversation"));
      this.k = new textnow.z.i(this.b, this.j.c());
      this.l = new textnow.z.f(this.j.c(), this.j.d(), this.j.e(), Uri.parse(this.j.h()).toString());
      this.V = this.j.m();
      if (this.Y == 3)
        this.K = true;
    }
    while (true)
    {
      setHasOptionsMenu(true);
      return;
      if (this.Y == 1)
      {
        com.enflick.android.TextNow.ads.b.b("press_compose_button");
        this.h = true;
        this.j = null;
        this.l = null;
      }
      else
      {
        this.i = true;
      }
    }
  }

  public j<Cursor> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return m.a(this.b, this.l.a());
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    if (textnow.v.z.d(this.b))
    {
      paramMenuInflater.inflate(2131755012, paramMenu);
      return;
    }
    paramMenuInflater.inflate(2131755019, paramMenu);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    if (this.i)
      return paramLayoutInflater.inflate(2130903172, null);
    this.W = ar.a(this);
    if (this.l != null)
    {
      final String str2 = this.l.a();
      if (this.ac == null)
      {
        this.ac = new AsyncTask()
        {
        };
        this.ac.execute(new Void[0]);
      }
    }
    View localView;
    label547: boolean bool2;
    if ((this.h) && (!textnow.v.z.e(this.b)))
    {
      this.b.setRequestedOrientation(1);
      if (paramViewGroup != null)
        this.e = paramViewGroup.getApplicationWindowToken();
      localView = paramLayoutInflater.inflate(2130903173, null);
      this.L = localView.findViewById(2131558862);
      if ((this.l != null) && (this.l.b() == 2) && (textnow.v.k.a(this.l.a())))
        localView.findViewById(2131558871).setVisibility(8);
      com.enflick.android.TextNow.views.emoticons.d locald = com.enflick.android.TextNow.views.emoticons.d.a(this.b);
      this.s = ((ExtendedEditText)localView.findViewById(2131558877));
      this.s.addTextChangedListener(new com.enflick.android.TextNow.views.emoticons.f(locald, this.s));
      this.s.a(this);
      this.s.setImeOptions(4);
      this.s.setOnEditorActionListener(this.ak);
      this.s.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          ImageView localImageView = MessageViewFragment.b(MessageViewFragment.this);
          if (paramAnonymousEditable.length() > 0)
          {
            localImageView.setAlpha(255);
            return;
          }
          localImageView.setAlpha(155);
        }

        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }

        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }
      });
      this.r = ((ExtendedEditText)localView.findViewById(2131558865));
      this.r.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          if (paramAnonymousEditable.length() > 0)
          {
            MessageViewFragment.c(MessageViewFragment.this).setVisibility(8);
            MessageViewFragment.d(MessageViewFragment.this).setVisibility(0);
            return;
          }
          MessageViewFragment.c(MessageViewFragment.this).setVisibility(0);
          MessageViewFragment.d(MessageViewFragment.this).setVisibility(8);
        }

        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }

        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }
      });
      this.r.a(this);
      this.q = localView.findViewById(2131558864);
      this.E = localView.findViewById(2131558867);
      this.E.setOnClickListener(this);
      this.D = localView.findViewById(2131558866);
      this.D.setOnClickListener(this);
      this.F = ((TextView)localView.findViewById(2131558870));
      if ((this.l != null) && (D()))
        H();
      this.G = ((ImageButton)localView.findViewById(2131558863));
      this.G.setOnClickListener(this);
      if (G())
      {
        this.u = ((TintedImageView)localView.findViewById(2131558873));
        this.ab = ((TextView)localView.findViewById(2131558874));
        textnow.av.a.a(this.ab, 0.6F);
        this.w = ((TintedFrameLayout)localView.findViewById(2131558872));
        this.w.setVisibility(0);
        this.w.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            MessageViewFragment.a(MessageViewFragment.this, MessageViewFragment.e(MessageViewFragment.this).findViewById(2131558882));
            MessageViewFragment.b(MessageViewFragment.this, MessageViewFragment.e(MessageViewFragment.this).findViewById(2131558881));
            RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(MessageViewFragment.f(MessageViewFragment.this).getLayoutParams());
            localLayoutParams.addRule(12);
            localLayoutParams.addRule(9);
            if (MessageViewFragment.this.h())
            {
              localLayoutParams.setMargins(12, 0, 0, 12 + MessageViewFragment.g(MessageViewFragment.this).getHeight());
              MessageViewFragment.f(MessageViewFragment.this).setLayoutParams(localLayoutParams);
            }
            while (true)
            {
              MessageViewFragment.f(MessageViewFragment.this).requestLayout();
              MessageViewFragment.f(MessageViewFragment.this).setVisibility(0);
              MessageViewFragment.a(MessageViewFragment.this, true);
              MessageViewFragment.h(MessageViewFragment.this).setVisibility(4);
              MessageViewFragment.i(MessageViewFragment.this).setVisibility(0);
              MessageViewFragment.i(MessageViewFragment.this).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  MessageViewFragment.this.j();
                }
              });
              ((Button)MessageViewFragment.e(MessageViewFragment.this).findViewById(2131558884)).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  MessageViewFragment.a(MessageViewFragment.this, 0);
                  MessageViewFragment.j(MessageViewFragment.this).setText(2131296580);
                  if (MessageViewFragment.k(MessageViewFragment.this) != null)
                  {
                    MessageViewFragment.k(MessageViewFragment.this).a(0);
                    MessageViewFragment.k(MessageViewFragment.this).B();
                  }
                  MessageViewFragment.this.j();
                }
              });
              ((Button)MessageViewFragment.e(MessageViewFragment.this).findViewById(2131558883)).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  if (MessageViewFragment.this.c.S())
                  {
                    MessageViewFragment.a(MessageViewFragment.this, 1);
                    MessageViewFragment.j(MessageViewFragment.this).setText(2131296579);
                    if (MessageViewFragment.k(MessageViewFragment.this) != null)
                    {
                      MessageViewFragment.k(MessageViewFragment.this).a(1);
                      MessageViewFragment.k(MessageViewFragment.this).B();
                    }
                    MessageViewFragment.this.j();
                  }
                }
              });
              return;
              localLayoutParams.setMargins(12, 0, 0, 12);
              MessageViewFragment.f(MessageViewFragment.this).setLayoutParams(localLayoutParams);
            }
          }
        });
        if ((this.k == null) || (this.k.c() != 1))
          break label1020;
        this.X = 1;
        this.ab.setText(2131296579);
      }
      this.t = ((ImageView)localView.findViewById(2131558878));
      this.t.setVisibility(0);
      this.t.setAlpha(155);
      this.t.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          MessageViewFragment.l(MessageViewFragment.this);
        }
      });
      this.v = ((Button)localView.findViewById(2131558879));
      this.v.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          MessageViewFragment.l(MessageViewFragment.this);
        }
      });
      this.v.setVisibility(8);
      this.C = ((AttachmentsPanel)localView.findViewById(2131558880));
      this.C.a(this);
      this.x = localView.findViewById(2131558876);
      this.x.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          MessageViewFragment.this.k();
        }
      });
      this.y = localView.findViewById(2131558875);
      this.y.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          MessageViewFragment.this.a(true);
        }
      });
      this.n = ((PullToRefreshListView)localView.findViewById(2131558869));
      this.o = ((ListView)this.n.i());
      this.p = ((LinearLayout)localView.findViewById(2131558868));
      an localan = this.b;
      ar localar = this.W;
      boolean bool1 = D();
      if (this.b.A())
        break label1038;
      bool2 = true;
      label786: this.N = new textnow.p.y(localan, null, 0, this, localar, bool1, bool2, this.j);
      this.z = ((LinearLayout)localView.findViewById(2131558758));
      this.A = ((ListView)localView.findViewById(2131558761));
      if (this.j == null)
        break label1044;
      this.z.setVisibility(8);
      c(true);
      getLoaderManager().a(2);
    }
    int i1;
    MessageViewFragment.MessageViewState localMessageViewState;
    while (true)
    {
      Bundle localBundle = getArguments();
      i1 = 1;
      if ((localBundle == null) || (!localBundle.containsKey("message_view_state")))
        break label1315;
      localMessageViewState = (MessageViewFragment.MessageViewState)localBundle.getParcelable("message_view_state");
      if (localMessageViewState == null)
        break label1315;
      if (!TextUtils.isEmpty(localMessageViewState.b))
      {
        this.s.getEditableText().append(localMessageViewState.b);
        i1 = 0;
      }
      if (this.B == null)
        break label1283;
      if (localMessageViewState.c == null)
        break label1225;
      for (textnow.z.f localf : localMessageViewState.c)
        this.B.a(localf, this.M);
      this.b.setRequestedOrientation(-1);
      break;
      label1020: this.X = 0;
      this.ab.setText(2131296580);
      break label547;
      label1038: bool2 = false;
      break label786;
      label1044: this.O = new textnow.p.l(getActivity(), null);
      getLoaderManager().a(2, null, new textnow.r.b(getActivity(), this.O));
      this.B = ((RecipientField)localView.findViewById(2131558759));
      this.M = new com.enflick.android.TextNow.views.l();
      this.A.setOnItemClickListener(new b(this.A, this.B, this.M));
      this.A.setAdapter(this.O);
      this.B.a(new af(this.A, this.B, this.M, this.O));
      this.B.a(this);
      this.B.setImeOptions(5);
      this.B.a(this);
      this.B.setOnEditorActionListener(new TextView.OnEditorActionListener()
      {
        public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          if (paramAnonymousInt == 5)
          {
            MessageViewFragment.n(MessageViewFragment.this).requestFocus();
            return true;
          }
          return false;
        }
      });
      c(false);
    }
    label1225: if (localMessageViewState.d != null)
      for (String str1 : localMessageViewState.d)
        this.B.getEditableText().append(str1);
    label1283: if (!TextUtils.isEmpty(localMessageViewState.e))
    {
      this.N.a(localMessageViewState.e);
      this.ag = localMessageViewState.f;
    }
    label1315: if ((i1 != 0) && (this.j != null))
    {
      this.s.getEditableText().append(textnow.z.d.a().a(this.j.c()));
      textnow.z.d.a().b(this.j.c());
    }
    this.f = true;
    return localView;
  }

  public void onDestroyView()
  {
    if (this.j != null)
    {
      String str = this.s.getText().toString();
      if (!TextUtils.isEmpty(str))
        textnow.z.d.a().a(this.j.c(), str);
    }
    if ((!this.i) && (this.N != null))
    {
      Set localSet = this.N.f();
      if (localSet.size() > 0)
        new AsyncTask()
        {
          private Void a(Set<String>[] paramAnonymousArrayOfSet)
          {
            Set<String> localSet = paramAnonymousArrayOfSet[0];
            ArrayList localArrayList = new ArrayList();
            Iterator localIterator = localSet.iterator();
            while (localIterator.hasNext())
            {
              ContentProviderOperation.Builder localBuilder = ContentProviderOperation.newUpdate(Uri.parse((String)localIterator.next()));
              localBuilder.withValue("message_text", "-1");
              localArrayList.add(localBuilder.build());
            }
            try
            {
              MessageViewFragment.e(MessageViewFragment.this).getContentResolver().applyBatch("com.enflick.android.TextNow.TNContentProvider", localArrayList);
              return null;
            }
            catch (RemoteException localRemoteException)
            {
              while (true)
              {
                Object[] arrayOfObject2 = new Object[2];
                arrayOfObject2[0] = localRemoteException.toString();
                arrayOfObject2[1] = localRemoteException.getMessage();
                String.format("%s: %s", arrayOfObject2);
              }
            }
            catch (OperationApplicationException localOperationApplicationException)
            {
              while (true)
              {
                Object[] arrayOfObject1 = new Object[2];
                arrayOfObject1[0] = localOperationApplicationException.toString();
                arrayOfObject1[1] = localOperationApplicationException.getMessage();
                String.format("%s: %s", arrayOfObject1);
              }
            }
          }
        }
        .execute(new Set[] { localSet });
    }
    this.I = false;
    this.b.d(17170445);
    this.f = false;
    if (this.ac != null)
      this.ac.cancel(true);
    if (this.W != null)
      this.W.a();
    this.b.setRequestedOrientation(-1);
    super.onDestroyView();
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.P.a() == 2)
      this.o.setItemChecked(paramInt, a(paramView, true));
    textnow.p.aa localaa;
    while (true)
    {
      return;
      localaa = (textnow.p.aa)paramView.getTag();
      if ((localaa != null) && (localaa.a != null))
      {
        int i1 = localaa.a.g();
        if (localaa.a.j() == 1)
          new SendMessageTask(this.b, localaa.a).b(this.b);
        while ((i1 == 1) && (this.c.D()))
        {
          if (localaa.a.f() != this.N.c())
            break label350;
          localaa.e.setVisibility(8);
          this.N.a(0L);
          this.N.a(null);
          return;
          if (i1 == 2)
          {
            if (TextUtils.isEmpty(localaa.a.e()))
              this.b.b(2131296572);
            else if (this.d != null)
              this.d.a(l.a(localaa.a));
            else if (this.b != null)
              com.enflick.android.TextNow.chatheads.g.a(this.b).a(localaa.a.f());
          }
          else if (i1 == 8)
            if (!textnow.v.g.b(this.b, localaa.a.k()))
            {
              String str1 = localaa.a.e();
              String str2 = localaa.a.a();
              textnow.v.h localh = textnow.v.h.d;
              if (!TextUtils.isEmpty(str1))
              {
                this.b.a(2131296429, true);
                new DownloadToFileTask(str2, str1, localh).b(this.b);
              }
            }
            else
            {
              b(localaa.a.k());
            }
        }
      }
    }
    label350: View localView = this.N.d();
    if (localView != null)
      localView.setVisibility(8);
    localaa.e.setVisibility(0);
    this.N.a(localaa.a.f());
    this.N.a(localaa.e);
  }

  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.d == null)
      return true;
    if (this.P.a() == 1)
    {
      a(paramView, false);
      return false;
    }
    if (this.P.a() == 3)
      this.o.clearChoices();
    if (!this.N.b(paramView))
    {
      a(paramView, true);
      this.o.setItemChecked(paramInt, true);
      return true;
    }
    return false;
  }

  public void onLoaderReset(j<Cursor> paramj)
  {
    this.N.b(null);
  }

  public void onLowMemory()
  {
    if (this.W != null)
      this.W.b();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int i1 = 1;
    switch (paramMenuItem.getItemId())
    {
    default:
      i1 = super.onOptionsItemSelected(paramMenuItem);
    case 2131559051:
    case 2131559052:
    case 2131559050:
    case 2131559062:
    case 2131559049:
    case 2131559092:
    case 2131559057:
    case 2131559065:
    case 2131559055:
    case 2131559063:
    case 2131559064:
      textnow.z.f localf1;
      do
      {
        textnow.z.f localf2;
        do
        {
          do
          {
            textnow.z.f localf3;
            do
            {
              do
              {
                return i1;
                com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "muting notifications from TextNow MessageViewFragment");
                this.j.a(i1);
                aa.a(getActivity(), this.j, i1);
                a(this.m);
                return i1;
                com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "unmuting notifications from TextNow MessageViewFragment");
                this.j.a(false);
                aa.a(getActivity(), this.j, false);
                a(this.m);
                return i1;
                this.j.a(false);
                aa.a(getActivity(), this.j, false);
                a(this.m);
                return i1;
              }
              while (this.d == null);
              this.d.a(this.l.a(), this.l.g());
              return i1;
              localf3 = this.l;
              if ((localf3 == null) || (!localf3.j()))
                break;
            }
            while (this.d == null);
            this.d.a(localf3, false, i1);
            return i1;
          }
          while (this.d == null);
          this.d.a(null);
          return i1;
          if ((this.i) || (this.h))
            break;
          t();
          return i1;
          textnow.z.h localh = this.j;
          if (localh == null)
            break;
          new com.enflick.android.TextNow.tasks.a(this.b, localh, "", null, null, localh.a()).execute(new Void[0]);
          a(null, i1);
          this.b.supportInvalidateOptionsMenu();
          return i1;
          if (this.j == null)
            break;
          Intent localIntent3 = new Intent("android.intent.action.PICK");
          localIntent3.setType("image/*");
          this.b.startActivityForResult(localIntent3, 10);
          return i1;
          aa.a(this.b, this.j);
          return i1;
          localf2 = this.l;
        }
        while (localf2 == null);
        an localan2 = this.b;
        String str2;
        if (localf2.b() == i1)
        {
          str2 = localf2.a() + "@textnow.me";
          if (localf2.b() != 2)
            break label563;
        }
        int i4;
        for (int i3 = i1; ; i4 = 0)
        {
          textnow.v.k.a(localan2, str2, i3);
          return i1;
          str2 = localf2.a();
          break;
        }
        localf1 = this.l;
      }
      while (localf1 == null);
      an localan1 = this.b;
      Intent localIntent2 = new Intent("android.intent.action.VIEW");
      localIntent2.putExtra("finishActivityOnSaveCompleted", i1);
      ContentResolver localContentResolver = localan1.getContentResolver();
      Uri localUri = textnow.v.k.a(localContentResolver, localf1.a(), localf1.b());
      if (localUri != null)
      {
        localIntent2.setDataAndType(ContactsContract.Contacts.getLookupUri(localContentResolver, localUri), "vnd.android.cursor.item/contact");
        localan1.startActivity(localIntent2);
        return i1;
      }
      String str1 = localf1.a();
      int i2 = localf1.b();
      boolean bool = false;
      if (i2 == 2)
        bool = i1;
      textnow.v.k.a(localan1, str1, bool);
      return i1;
    case 2131559054:
      aa.a(this.b, this.j);
      return i1;
    case 2131559066:
      com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "create Floating Chat from MessageViewFragment");
      Intent localIntent1 = new Intent(this.b, ChatHeadIntentService.class);
      localIntent1.putExtra("extra_contact", this.l);
      this.b.startService(localIntent1);
      b(this.m);
      this.b.b(2131296939);
      return i1;
    case 2131559067:
      label563: if (com.enflick.android.TextNow.chatheads.g.f())
      {
        com.enflick.android.TextNow.ads.b.a("Floating_Chat_metrics", "action", "closed Floating Chat from MessageViewFragment");
        com.enflick.android.TextNow.chatheads.g localg = com.enflick.android.TextNow.chatheads.g.a(this.b);
        if ((localg != null) && (this.j != null))
          localg.a(this.j.c());
      }
      b(this.m);
      this.b.b(2131296940);
      return i1;
    case 2131559068:
    }
    new textnow.w.a(getActivity(), this).a(this.l);
    return i1;
  }

  public void onPause()
  {
    super.onPause();
    a = "";
    this.g = false;
    this.ag = -1;
    e();
    if (this.s != null)
      this.s.clearFocus();
  }

  public void onPrepareOptionsMenu(Menu paramMenu)
  {
    this.m = new u(paramMenu);
    this.m.a();
    MenuItem localMenuItem1 = paramMenu.findItem(2131559059);
    MenuItem localMenuItem2 = paramMenu.findItem(2131559050);
    if (localMenuItem2 != null)
      localMenuItem2.getIcon().setAlpha(255);
    if (localMenuItem1 != null)
      localMenuItem1.getIcon().setAlpha(255);
    textnow.z.f localf = this.l;
    textnow.z.h localh = this.j;
    textnow.z.u localu = new textnow.z.u(getActivity());
    if (localf == null)
    {
      this.m.a(2131559063);
      this.m.a(2131559049);
      this.m.a(2131559064);
      if (localh != null)
        break label457;
      this.m.a(2131559055);
      this.m.a(2131559065);
      this.m.a(2131559057);
      this.m.a(2131559054);
      this.m.a(2131559067);
      this.m.a(2131559068);
      this.m.a(2131559092);
      label206: if (!D())
        break label488;
      this.m.a(2131559049);
      this.m.a(2131559055);
      this.m.a(2131559063);
      this.m.a(2131559064);
    }
    while (true)
    {
      a(this.m);
      b(this.m);
      return;
      if (((localf.b() != 2) && (localf.b() != 1) && ((localf.b() != 3) || (!localf.a().endsWith("@textnow.me")))) || (localf.a().equalsIgnoreCase(localu.c())) || (localf.a().equalsIgnoreCase(localu.b() + "@textnow.me")))
      {
        this.m.a(2131559049);
        this.m.a(2131559055);
      }
      while (true)
      {
        if (localf.i())
          break label455;
        this.m.a(2131559063);
        break;
        if (textnow.v.k.a(localf.a()))
        {
          this.m.a(2131559049);
          this.m.a(2131559055);
          this.m.a(2131559063);
          this.m.a(2131559064);
        }
      }
      label455: break;
      label457: if ((this.I) || (!TextUtils.isEmpty(localh.l())))
        break label206;
      this.m.a(2131559057);
      break label206;
      label488: this.m.a(2131559062);
    }
  }

  public void onResume()
  {
    super.onResume();
    String str;
    if (this.j != null)
    {
      str = this.j.c();
      a = str;
      if (!this.I)
      {
        if (this.j == null)
          break label218;
        a(this.j.l(), false);
      }
      label49: if (this.l != null)
      {
        textnow.z.f localf = textnow.v.k.a(this.b.getContentResolver(), this.j, this.l);
        if (localf == null)
          break label227;
        d(localf.g());
        label90: this.b.supportInvalidateOptionsMenu();
        this.z.setVisibility(8);
        c(true);
        E();
        new MarkMessagesReadTask(this.l.a()).b(this.b);
      }
      this.g = true;
      if ((this.B == null) || (this.K))
        break label241;
      this.B.postDelayed(new Runnable()
      {
        public final void run()
        {
          MessageViewFragment.m(MessageViewFragment.this).requestFocus();
          ((InputMethodManager)MessageViewFragment.e(MessageViewFragment.this).getSystemService("input_method")).showSoftInput(MessageViewFragment.m(MessageViewFragment.this), 1);
        }
      }
      , 300L);
    }
    while (true)
    {
      if ((D()) && (this.l != null))
        new GetGroupTask(this.l.a()).b(getActivity());
      return;
      str = "";
      break;
      label218: a(null, true);
      break label49;
      label227: d(this.l.g());
      break label90;
      label241: if (this.K)
      {
        this.s.postDelayed(new Runnable()
        {
          public final void run()
          {
            MessageViewFragment.n(MessageViewFragment.this).requestFocus();
            ((InputMethodManager)MessageViewFragment.e(MessageViewFragment.this).getSystemService("input_method")).showSoftInput(MessageViewFragment.n(MessageViewFragment.this), 1);
          }
        }
        , 300L);
        this.K = false;
      }
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 2)
    {
      o.a(this.b).c();
      return;
    }
    o.a(this.b).d();
  }

  public final void p()
  {
    if (this.C != null)
      this.C.a();
  }

  public final void q()
  {
    if ((c() == 0) || (!this.f))
    {
      this.P.b();
      return;
    }
    if (this.P.a() == 2)
    {
      this.P.c();
      return;
    }
    this.P.d();
  }

  public final void r()
  {
    textnow.z.u localu = new textnow.z.u(this.b);
    String str = localu.g() + " " + localu.h();
    if (str.length() <= 1)
      str = localu.b();
    a(getString(2131296786, new Object[] { str }), null, 1);
    F();
  }

  public final void s()
  {
    d();
    if (this.Q.size() > 0)
    {
      ContentResolver localContentResolver = getActivity().getContentResolver();
      String str1 = this.Q.toString().replaceAll("\\s", "");
      String str2 = str1.substring(1, -1 + str1.length());
      int i1 = localContentResolver.delete(com.enflick.android.TextNow.persistence.contentproviders.g.d, "messages.message_id IN (" + str2 + ")", null);
      new StringBuilder().append(i1).append(" messages are deleted locally").toString();
      Uri localUri1 = com.enflick.android.TextNow.persistence.contentproviders.g.d;
      String[] arrayOfString1 = { "count (*)" };
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.l.a();
      Cursor localCursor = localContentResolver.query(localUri1, arrayOfString1, "messages.contact_value=?", arrayOfString2, null);
      int i2 = -1;
      while ((localCursor != null) && (localCursor.moveToNext()))
      {
        i2 = localCursor.getInt(0);
        if (localCursor != null)
          localCursor.close();
      }
      if (localCursor != null)
        localCursor.close();
      if (i2 == 0)
      {
        Uri localUri2 = com.enflick.android.TextNow.persistence.contentproviders.d.d;
        String[] arrayOfString3 = new String[1];
        arrayOfString3[0] = this.l.a();
        int i3 = localContentResolver.delete(localUri2, "conversations.contact_value=?", arrayOfString3);
        if (this.S != null)
          this.S.k();
        new StringBuilder().append(i3).append("conversation is deleted locally").toString();
      }
      new DeleteMessagesTask(str1).b(this.b);
      this.Q.clear();
    }
  }

  public final void t()
  {
    if (this.l != null)
    {
      int i1 = new GetMessagesForConversationTask(this.l.a(), this.l.b(), this.c.k(), true).b(this.b);
      this.ae = false;
      new StringBuilder().append("MessagesActivity started task with id:").append(i1).toString();
    }
  }

  public final void u()
  {
    if (this.l != null)
    {
      if (this.c.S())
        new ImportSMSForConversationTask(this.l.a()).b(this.b);
      new GetHistoryForConversationTask(this.l.a(), this.l.b()).b(this.b);
      this.ae = true;
    }
  }

  public final boolean v()
  {
    return this.i;
  }

  public final boolean w()
  {
    return this.h;
  }

  public final void x()
  {
    this.b.a(2131296923, false);
  }

  protected final IBinder y()
  {
    if (this.f)
      return this.s.getApplicationWindowToken();
    return super.y();
  }

  public final void z()
  {
    if (this.b != null)
      this.b.e(true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.MessageViewFragment
 * JD-Core Version:    0.6.2
 */