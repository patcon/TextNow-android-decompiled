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
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.provider.ContactsContract.Contacts;
import android.support.v4.app.ag;
import android.support.v4.app.ah;
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
import android.view.View.OnLongClickListener;
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
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.enflick.android.TextNow.TextNowApp;
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
import textnow.bd.aq;
import textnow.k.w;
import textnow.q.ad;

public class MessageViewFragment extends ao
  implements ah<Cursor>, View.OnClickListener, AbsListView.OnScrollListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, c, com.enflick.android.TextNow.views.b, com.enflick.android.TextNow.views.d, com.enflick.android.TextNow.views.h, textnow.k.s, textnow.r.b
{
  private AttachmentsPanel A;
  private View B;
  private View C;
  private ImageButton D;
  private boolean E = false;
  private boolean F = false;
  private boolean G = false;
  private boolean H = false;
  private View I;
  private MultiAutoCompleteTextView.Tokenizer J;
  private textnow.k.r K;
  private textnow.k.g L;
  private b M;
  private ArrayList<Long> N = new ArrayList();
  private int O = -1;
  private q P;
  private boolean Q = false;
  private String R;
  private String S = null;
  private aq T;
  private int U = 0;
  private int V;
  private View W;
  private View X;
  private ImageView Y;
  private List<com.enflick.android.TextNow.tasks.c> Z = new ArrayList();
  private boolean a;
  private boolean aa = false;
  private boolean ab = false;
  private int ac = -1;
  private int ad;
  private int ae;
  private com.handmark.pulltorefresh.library.e af;
  private TextView.OnEditorActionListener ag = new TextView.OnEditorActionListener()
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
  private boolean b;
  private boolean g = false;
  private boolean h = false;
  private MainActivity i;
  private textnow.u.f j = null;
  private textnow.u.g k = null;
  private textnow.u.d l = null;
  private PullToRefreshListView m;
  private ListView n;
  private LinearLayout o;
  private View p;
  private ExtendedEditText q;
  private ExtendedEditText r;
  private ImageButton s;
  private Button t;
  private RelativeLayout u;
  private View v;
  private View w;
  private LinearLayout x;
  private ListView y;
  private RecipientField z;

  private boolean D()
  {
    if (this.ab)
      return true;
    if (this.l != null)
      this.ab = textnow.w.b.d(getActivity().getContentResolver(), this.l.a());
    return this.ab;
  }

  private void E()
  {
    if (textnow.q.a.a)
      ag.a(true);
    if (this.l != null)
    {
      getLoaderManager().a(1, null, this);
      return;
    }
    getLoaderManager().a(1);
    this.K.b(null);
  }

  private void F()
  {
    synchronized (this.Z)
    {
      if (!this.Z.isEmpty())
      {
        this.O = new MessageViewFragment.BatchMessageSenderTask(this.Z).b(this.i);
        this.Z.clear();
      }
      return;
    }
  }

  private boolean G()
  {
    return (this.c.Q()) && (((this.l != null) && (this.l.b() == 2)) || (this.l == null));
  }

  private void H()
  {
    new s(this, (byte)0).execute(new Void[0]);
  }

  private String I()
  {
    if (this.r != null)
      return this.r.getText().toString();
    return "";
  }

  public static MessageViewFragment a(int paramInt, textnow.u.f paramf, MessageViewFragment.MessageViewState paramMessageViewState, q paramq, w paramw, String paramString)
  {
    MessageViewFragment localMessageViewFragment = new MessageViewFragment();
    Bundle localBundle = new Bundle();
    localBundle.putInt("type", paramInt);
    if (paramf != null)
      localBundle.putSerializable("conversation", paramf);
    if (paramw != null)
    {
      localBundle.putString("search_message_text", paramw.d());
      if (paramw.c() != -1)
        localBundle.putInt("search_message_position", paramw.c());
    }
    localBundle.putString("message", paramString);
    localBundle.putParcelable("message_view_state", paramMessageViewState);
    localMessageViewFragment.setArguments(localBundle);
    localMessageViewFragment.P = paramq;
    return localMessageViewFragment;
  }

  public static MessageViewFragment a(String paramString1, String paramString2, q paramq)
  {
    MessageViewFragment localMessageViewFragment = new MessageViewFragment();
    Bundle localBundle = new Bundle();
    localBundle.putInt("type", 1);
    localBundle.putString("number", paramString1);
    localBundle.putString("message", paramString2);
    localMessageViewFragment.setArguments(localBundle);
    localMessageViewFragment.P = paramq;
    return localMessageViewFragment;
  }

  private void a(com.enflick.android.TextNow.tasks.c paramc)
  {
    synchronized (this.Z)
    {
      this.Z.add(paramc);
      return;
    }
  }

  private void a(String paramString, r paramr, int paramInt)
  {
    if ((TextUtils.isEmpty(paramString)) && (paramr == null))
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
      com.enflick.android.TextNow.ads.a.a("send_message", localHashMap1);
      if (!this.g)
        break label1337;
      v localv = u.a(this.z.getText());
      localList1 = localv.a();
      List localList2 = localv.b();
      if ((localList1 != null) && ((!localList1.isEmpty()) || (localList2.isEmpty())))
        break label222;
      this.i.c(2131493137);
      return;
      if (paramr.a == 3);
      for (str2 = "photo_capture"; ; str2 = "photo_saved")
      {
        str1 = paramr.b;
        break;
      }
      str2 = "location";
      str1 = null;
      break;
    }
    label222: if (localList1.isEmpty())
    {
      this.i.c(2131493134);
      return;
    }
    this.i.setRequestedOrientation(-1);
    label551: label571: label891: int i3;
    textnow.u.d locald2;
    int i4;
    label1064: label1111: label1126: label1138: String str7;
    String str8;
    if (localList1.size() > 1)
    {
      com.enflick.android.TextNow.ads.a.a("start_new_chat", "chat_type", "group");
      HashMap localHashMap2 = new HashMap();
      Iterator localIterator3 = localList1.iterator();
      int i7 = 0;
      while (localIterator3.hasNext())
      {
        textnow.u.d locald4 = (textnow.u.d)localIterator3.next();
        if (locald4.b() == 3)
        {
          if (locald4.a().toLowerCase(Locale.US).endsWith("@textnow.me"))
            localHashMap2.put(locald4.a().substring(0, locald4.a().indexOf("@")), Integer.valueOf(1));
          else
            i7++;
        }
        else if ((locald4.b() == 2) && (!"911".equals(locald4.a())))
          localHashMap2.put(locald4.a(), Integer.valueOf(2));
        else
          localHashMap2.put(locald4.a(), Integer.valueOf(1));
      }
      if (i7 != 0)
      {
        if (i7 == 1)
        {
          this.i.d(2131493430);
          return;
        }
        MainActivity localMainActivity3 = this.i;
        String str13 = this.i.getString(2131493429);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i7);
        localMainActivity3.b(String.format(str13, arrayOfObject));
        return;
      }
      new CreateGroupWithMessageInfoTask(null, localHashMap2, paramString, paramInt, str1).b(this.i);
      this.i.a(2131493416, false);
      c(true);
      a(null, true);
      this.x.setVisibility(8);
      if (this.r != null)
        this.r.setText("");
    }
    else
    {
      com.enflick.android.TextNow.ads.a.a("start_new_chat", "chat_type", "1:1");
      if (this.U == 1)
      {
        Iterator localIterator2 = localList1.iterator();
        while (localIterator2.hasNext())
          if (((textnow.u.d)localIterator2.next()).b() != 2)
          {
            this.i.c(2131493167);
            return;
          }
      }
      this.l = ((textnow.u.d)localList1.get(0));
      Set localSet = textnow.u.f.b(this.i);
      textnow.u.e locale = textnow.u.d.a(this.i, localSet, this.l.a(), this.l.b());
      String str12;
      if (locale != null)
      {
        this.l.a(locale.b);
        this.l.a(locale.a);
        ContentResolver localContentResolver2 = this.i.getContentResolver();
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = locale.a;
        this.j = textnow.u.f.a(localContentResolver2, arrayOfString2);
        if (this.j == null)
          break label1138;
        this.S = this.j.m();
        str12 = this.j.e();
        if (TextUtils.isEmpty(str12))
        {
          if (this.j.d() != 2)
            break label1126;
          if (!textnow.q.k.a(this.j.c()))
            break label1111;
          str12 = "Unknown Number";
        }
      }
      while (true)
      {
        this.i.setTitle(str12);
        if (!this.Q)
        {
          textnow.u.d locald3 = textnow.q.k.a(this.i.getContentResolver(), this.j, this.l);
          if (locald3 != null)
            this.i.setTitle(locald3.g());
          this.Q = true;
        }
        i3 = 0;
        Iterator localIterator1 = localList1.iterator();
        while (true)
        {
          if (!localIterator1.hasNext())
            break label1308;
          locald2 = (textnow.u.d)localIterator1.next();
          if ((this.U != 1) && ((!"911".equals(locald2.a())) || (!textnow.q.b.i(this.i)) || (str1 != null)))
            break;
          a(new SendSMSTask(locald2.a(), locald2.c(), paramString));
          if ((locald2.b() == 2) || (i3 != 0) || (!this.c.Q()))
            break label1565;
          this.s.setVisibility(8);
          this.s = ((ImageButton)this.i.findViewById(2131165579));
          this.s.setVisibility(0);
          this.s.setAlpha(155);
          this.Y.setVisibility(8);
          i4 = 1;
          i3 = i4;
        }
        ContentResolver localContentResolver1 = this.i.getContentResolver();
        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = this.l.a();
        this.j = textnow.u.f.a(localContentResolver1, arrayOfString1);
        break;
        str12 = textnow.q.b.f(this.j.c());
        continue;
        str12 = this.j.c();
      }
      str7 = this.l.g();
      if (!this.l.e())
        break label1572;
      Uri localUri = textnow.q.k.a(this.i.getContentResolver(), this.l.a(), this.l.b());
      if (localUri == null)
        break label1572;
      str8 = textnow.q.k.b(this.i.getContentResolver(), localUri);
      if (str8 == null)
        break label1572;
    }
    while (true)
    {
      this.i.setTitle(str8);
      break label891;
      MainActivity localMainActivity2 = this.i;
      int i5 = locald2.b();
      String str9 = locald2.a();
      String str10 = locald2.c();
      String str11 = locald2.d();
      if (str1 == null);
      for (int i6 = 1; ; i6 = 2)
      {
        a(new SendMessageTask(localMainActivity2, i5, str9, str10, str11, i6, 2, true, paramString, textnow.u.c.a(this.i.getBaseContext(), str1)));
        break;
      }
      label1308: this.i.supportInvalidateOptionsMenu();
      this.g = false;
      this.m.a(com.handmark.pulltorefresh.library.e.d);
      E();
      break label551;
      label1337: if (this.l == null)
        break label571;
      if (!this.Q)
      {
        textnow.u.d locald1 = textnow.q.k.a(this.i.getContentResolver(), this.j, this.l);
        if (locald1 != null)
        {
          this.i.setTitle(locald1.g());
          this.i.supportInvalidateOptionsMenu();
        }
        this.Q = true;
      }
      if ((this.U == 1) || (("911".equals(this.l.a())) && (textnow.q.b.i(this.i)) && (str1 == null)))
      {
        a(new SendSMSTask(this.l.a(), this.l.c(), paramString));
        break label571;
      }
      MainActivity localMainActivity1 = this.i;
      int i1 = this.l.b();
      String str4 = this.l.a();
      String str5 = this.l.c();
      String str6 = this.l.d();
      if (str1 == null);
      for (int i2 = 1; ; i2 = 2)
      {
        a(new SendMessageTask(localMainActivity1, i1, str4, str5, str6, i2, 2, true, paramString, textnow.u.c.a(this.i.getBaseContext(), str1)));
        break label571;
        break;
      }
      label1565: i4 = i3;
      break label1064;
      label1572: str8 = str7;
    }
  }

  private boolean a(View paramView, boolean paramBoolean)
  {
    paramView.invalidate();
    return this.K.a(paramView, paramBoolean);
  }

  private void b(String paramString)
  {
    android.support.v4.app.v localv;
    if (!TextUtils.isEmpty(paramString))
    {
      localv = getActivity();
      if (this.l == null)
        break label41;
    }
    label41: for (String str = this.l.g(); ; str = null)
    {
      new textnow.o.a(localv, paramString, str).show();
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
    this.i.c(2131493011);
  }

  private void c(boolean paramBoolean)
  {
    if ((this.y == null) || (this.m == null))
      return;
    if (paramBoolean)
    {
      this.y.setVisibility(8);
      this.o.setVisibility(0);
      return;
    }
    this.o.setVisibility(8);
  }

  public final void A()
  {
    H();
  }

  public final boolean B()
  {
    if (this.G)
    {
      i();
      return true;
    }
    if (this.E)
    {
      a(true);
      return true;
    }
    C();
    return super.B();
  }

  public final void a()
  {
    this.ae = this.n.getChoiceMode();
    this.ad = this.n.getTranscriptMode();
    this.af = this.m.h();
    this.n.setChoiceMode(2);
    this.n.setTranscriptMode(0);
    this.m.a(com.handmark.pulltorefresh.library.e.a);
  }

  public final void a(int paramInt)
  {
    if (paramInt == 0);
    while (true)
    {
      try
      {
        Intent localIntent2 = new Intent("android.media.action.IMAGE_CAPTURE");
        File localFile = textnow.q.g.a(this.i, textnow.q.h.a, System.currentTimeMillis());
        if (localFile == null)
        {
          this.i.c(2131493399);
          return;
        }
        this.R = localFile.getAbsolutePath();
        localIntent2.putExtra("output", Uri.fromFile(localFile));
        startActivityForResult(localIntent2, 3);
        if (!this.E)
          break;
        a(false);
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        this.i.c(2131493162);
        continue;
      }
      if (paramInt == 1)
      {
        Intent localIntent1 = new Intent("android.intent.action.PICK");
        localIntent1.setType("image/*");
        startActivityForResult(localIntent1, 4);
      }
    }
  }

  public final void a(com.enflick.android.TextNow.views.emoticons.a parama)
  {
    this.r.getEditableText().insert(this.r.getSelectionStart(), parama.b());
  }

  public final void a(String paramString)
  {
    this.S = paramString;
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    View localView;
    LinearLayout localLinearLayout;
    ImageView localImageView;
    if (!TextUtils.isEmpty(paramString))
    {
      this.F = bool;
      if (TextUtils.isEmpty(paramString))
        paramString = new textnow.u.r(this.i).x();
      localView = getView();
      localLinearLayout = (LinearLayout)localView.findViewById(2131165575);
      localImageView = (ImageView)localView.findViewById(2131165566);
      if ((this.m == null) || (localLinearLayout == null));
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
          TypedArray localTypedArray = this.i.obtainStyledAttributes(new int[] { 2130772198 });
          if (Build.VERSION.SDK_INT < 11)
            break label347;
          i2 = localTypedArray.getColor(0, 17170435);
          ((EditText)localView.findViewById(2131165488)).setTextColor(i2);
          ((EditText)localView.findViewById(2131165578)).setTextColor(i2);
          this.x.setBackgroundColor(0);
          this.y.setBackgroundColor(0);
          if ((this.K == null) || (this.m == null))
            break label341;
          this.K.i();
          this.n.invalidateViews();
          return;
        }
        Drawable localDrawable = Drawable.createFromPath(paramString);
        localLinearLayout.setBackgroundColor(-1728053248);
        localImageView.setImageDrawable(localDrawable);
        localImageView.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11)
        {
          i1 = -1;
          ((EditText)localView.findViewById(2131165488)).setTextColor(i1);
          ((EditText)localView.findViewById(2131165578)).setTextColor(i1);
          this.x.setBackgroundColor(-1728053248);
          this.y.setBackgroundColor(-1728053248);
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

  public final void a(boolean paramBoolean)
  {
    this.E = false;
    if (paramBoolean)
      this.A.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
      {
        int a = 0;

        public final boolean onPreDraw()
        {
          new StringBuilder().append("panel top: ").append(MessageViewFragment.i(MessageViewFragment.this).getTop()).toString();
          int i = MessageViewFragment.i(MessageViewFragment.this).getTop();
          if (i == this.a)
          {
            MessageViewFragment.i(MessageViewFragment.this).getViewTreeObserver().removeOnPreDrawListener(this);
            TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, -MessageViewFragment.i(MessageViewFragment.this).getHeight(), 0.0F);
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
    this.A.setVisibility(8);
    this.w.setVisibility(8);
    this.v.setVisibility(0);
    this.i.e(17170445);
  }

  public final boolean a(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 2131165786:
      this.N.clear();
      if (this.M.a() == 1)
        this.N.add(Long.valueOf(this.K.f()));
      while (true)
      {
        this.i.showDialog(3);
        return true;
        this.N.addAll(this.K.c());
      }
    case 2131165785:
    }
    ClipboardManager localClipboardManager = (ClipboardManager)this.i.getSystemService("clipboard");
    if (this.M.a() == 1)
      localClipboardManager.setText(this.K.g());
    while (true)
    {
      d();
      return true;
      localClipboardManager.setText(this.K.e());
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
      if (this.m != null)
        this.m.o();
    label268: label279: String str2;
    textnow.q.h localh;
    do
    {
      do
      {
        while (true)
        {
          return true;
          if (localClass == GetNewMessagesTask.class)
          {
            if ((this.l != null) && (this.b))
              new MarkMessagesReadTask(this.l.a()).b(this.i);
            return false;
          }
          if ((localClass != SendMessageTask.class) && (localClass != MessageViewFragment.BatchMessageSenderTask.class))
            break;
          this.i.r();
          if (bool)
          {
            if ((i1 != 400) || (!"USER_NOT_FOUND".equals(str1)))
              break label268;
            this.i.c(2131493138);
          }
          while (true)
          {
            if (i2 != this.O)
              break label279;
            this.O = -1;
            if (bool)
              break;
            if ((this.j == null) && (this.l != null))
            {
              ContentResolver localContentResolver = this.i.getContentResolver();
              String[] arrayOfString = new String[1];
              arrayOfString[0] = this.l.a();
              this.j = textnow.u.f.a(localContentResolver, arrayOfString);
            }
            if (this.j == null)
              break;
            this.S = this.j.m();
            this.P.a(this.j);
            return true;
            this.i.c(2131493025);
          }
        }
        if (localClass == CreateGroupWithMessageInfoTask.class)
        {
          this.i.r();
          if (bool)
          {
            this.i.c(2131493025);
            this.i.h();
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
                String str3 = localCreateGroupWithMessageInfoTask.a();
                String str4 = localCreateGroupWithMessageInfoTask.d();
                String str5 = localCreateGroupWithMessageInfoTask.c();
                String str6 = localCreateGroupWithMessageInfoTask.b();
                new t(this, str3).execute(new Void[0]);
                this.l = new textnow.u.d(str3, 5, str4, null);
                this.p.setVisibility(0);
                android.support.v4.app.v localv = getActivity();
                if (str5 == null);
                for (int i3 = 1; ; i3 = 2)
                {
                  a(new SendMessageTask(localv, 5, str3, str4, null, i3, 2, true, str6, textnow.u.c.a(this.i.getBaseContext(), str5)));
                  F();
                  this.t.setVisibility(8);
                  this.s.setVisibility(0);
                  if ((this.u != null) && (G()))
                    this.u.setVisibility(0);
                  this.g = false;
                  this.m.a(com.handmark.pulltorefresh.library.e.d);
                  this.K.a(true);
                  E();
                  this.i.supportInvalidateOptionsMenu();
                  break;
                }
              }
              this.i.c(2131493025);
              continue;
              if (localClass == UpdateGroupInfoTask.class)
              {
                this.i.r();
                if (bool)
                {
                  this.i.c(2131493025);
                }
                else
                {
                  new s(this, (byte)0).execute(new Void[0]);
                  getActivity().runOnUiThread(new Runnable()
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
                  textnow.w.b.c(getActivity().getContentResolver(), this.l.a());
                  this.i.h();
                  this.i.c(2131493428);
                }
              }
            }
          }
        while (localClass != DownloadToFileTask.class);
        DownloadToFileTask localDownloadToFileTask = (DownloadToFileTask)paramc;
        this.i.r();
        if (bool)
        {
          this.i.c(2131493401);
          return true;
        }
        str2 = localDownloadToFileTask.a();
        localh = localDownloadToFileTask.b();
        if (TextUtils.isEmpty(str2))
        {
          c(localDownloadToFileTask.c());
          return true;
        }
        if (localh == textnow.q.h.d)
        {
          b(str2);
          return true;
        }
        if (localh != textnow.q.h.b)
          break;
      }
      while (TextUtils.isEmpty(str2));
      new textnow.o.a(getActivity(), str2).show();
      return true;
    }
    while ((localh != textnow.q.h.c) || (TextUtils.isEmpty(str2)));
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(new File(str2)), "video/*");
    startActivity(localIntent);
    return true;
  }

  public final void b()
  {
    this.n.setChoiceMode(this.ae);
    this.n.setTranscriptMode(this.ad);
    this.m.a(this.af);
    int i1 = this.n.getFirstVisiblePosition();
    View localView = this.n.getChildAt(0);
    int i2;
    if (localView == null)
    {
      i2 = 0;
      if (!(this.n.getAdapter() instanceof HeaderViewListAdapter))
        break label107;
      this.n.setAdapter(((HeaderViewListAdapter)this.n.getAdapter()).getWrappedAdapter());
    }
    while (true)
    {
      this.n.setSelectionFromTop(i1, i2);
      return;
      i2 = localView.getTop();
      break;
      label107: this.n.setAdapter(this.n.getAdapter());
    }
  }

  public final void b(int paramInt)
  {
    if (paramInt > 1)
    {
      this.t.setVisibility(0);
      if (this.u != null)
        this.u.setVisibility(8);
      this.s.setVisibility(8);
    }
    do
    {
      return;
      this.t.setVisibility(8);
      this.s.setVisibility(0);
    }
    while ((this.u == null) || (!G()));
    this.u.setVisibility(0);
  }

  public final void b(boolean paramBoolean)
  {
    this.i.r();
    if (!paramBoolean)
      this.i.b(getResources().getString(2131493555));
  }

  public final int c()
  {
    return this.K.c().size();
  }

  public final void d()
  {
    this.K.h();
    this.n.clearChoices();
    this.m.requestLayout();
    if (this.M.a() == 2)
      this.M.b();
  }

  public final textnow.u.f e()
  {
    return this.j;
  }

  public final textnow.u.d f()
  {
    return this.l;
  }

  public final boolean g()
  {
    return this.E;
  }

  public final boolean h()
  {
    return this.G;
  }

  public final void i()
  {
    this.u.setVisibility(0);
    this.X.setVisibility(8);
    this.W.setVisibility(8);
    this.G = false;
  }

  public final void j()
  {
    this.E = true;
    final boolean bool = this.i.p();
    this.A.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      int a = 0;

      public final boolean onPreDraw()
      {
        new StringBuilder().append("panel top: ").append(MessageViewFragment.i(MessageViewFragment.this).getTop()).toString();
        int i = MessageViewFragment.i(MessageViewFragment.this).getTop();
        TranslateAnimation localTranslateAnimation;
        if (i == this.a)
        {
          MessageViewFragment.i(MessageViewFragment.this).getViewTreeObserver().removeOnPreDrawListener(this);
          localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, MessageViewFragment.i(MessageViewFragment.this).getHeight(), 0.0F);
          localTranslateAnimation.setDuration(MessageViewFragment.this.getResources().getInteger(17694720));
          if (bool)
            MessageViewFragment.i(MessageViewFragment.this).startAnimation(localTranslateAnimation);
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
    if ((bool) && (!this.i.g()))
    {
      C();
      this.A.postDelayed(new Runnable()
      {
        public final void run()
        {
          MessageViewFragment.i(MessageViewFragment.this).setVisibility(0);
          MessageViewFragment.q(MessageViewFragment.this).setVisibility(0);
          MessageViewFragment.r(MessageViewFragment.this).setVisibility(8);
        }
      }
      , 50L);
    }
    while (true)
    {
      if (!this.i.g())
        this.i.e(2131296330);
      return;
      this.A.setVisibility(0);
      this.w.setVisibility(0);
      this.v.setVisibility(8);
    }
  }

  public final String k()
  {
    if (!this.h)
    {
      if (this.g)
        return "/New_Message";
      return "/Existing_Chat";
    }
    return null;
  }

  public final String l()
  {
    if (this.l != null)
      return this.l.g();
    if (this.V == 1)
      return this.i.getString(2131493133);
    return this.i.getString(2131493012);
  }

  public final int m()
  {
    return 2131165537;
  }

  public final boolean n()
  {
    return true;
  }

  public final void o()
  {
    if (this.A != null)
      this.A.a();
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (!this.h)
    {
      if (this.V != 1)
        break label208;
      this.m.a(com.handmark.pulltorefresh.library.e.a);
    }
    while (true)
    {
      this.m.a(false);
      this.m.d(true);
      this.m.a(new com.handmark.pulltorefresh.library.h()
      {
        public final void a(PullToRefreshBase<ListView> paramAnonymousPullToRefreshBase)
        {
          if ((!MessageViewFragment.this.u()) && (!MessageViewFragment.this.v()))
          {
            if (paramAnonymousPullToRefreshBase.g() == com.handmark.pulltorefresh.library.e.c)
              MessageViewFragment.this.s();
          }
          else
            return;
          MessageViewFragment.this.t();
        }
      });
      com.handmark.pulltorefresh.library.a locala = this.m.a(true, false);
      if (locala != null)
      {
        locala.a(this.i.getString(2131492983));
        locala.c(this.i.getString(2131492984));
        locala.b(this.i.getString(2131492985));
      }
      this.m.setVisibility(4);
      this.m.a(this.K);
      this.m.a(this);
      this.n.setOnItemLongClickListener(this);
      this.n.setChoiceMode(0);
      this.m.a(this);
      this.M = new b(this.i, 2131755016, 2131689473, this);
      if (this.l != null)
        E();
      return;
      label208: this.m.a(com.handmark.pulltorefresh.library.e.d);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1)
      if (paramInt1 == 11)
      {
        Uri localUri2 = paramIntent.getData();
        Intent localIntent = new Intent(getActivity(), ContactDetailsActivity.class);
        localIntent.putExtra("contact_uri", localUri2);
        localIntent.putExtra("phone_only", false);
        startActivityForResult(localIntent, 2);
      }
    while (true)
    {
      return;
      if (paramInt1 == 2)
      {
        textnow.u.d locald = (textnow.u.d)paramIntent.getSerializableExtra("extra_contact");
        if (this.z == null)
          continue;
        this.z.a(locald, this.J);
        this.z.requestFocus();
        return;
      }
      if (paramInt1 == 3);
      try
      {
        textnow.q.g.a(this.i, new File(this.R), textnow.q.h.a);
        label135: a("", new r(this, paramInt1, this.R), 2);
        F();
        return;
        if ((paramInt1 != 4) || (paramIntent == null) || (paramIntent.getData() == null))
          continue;
        Uri localUri1 = paramIntent.getData();
        if (localUri1 != null)
        {
          String str1 = localUri1.toString();
          if (str1.startsWith("content://"))
          {
            String str2 = textnow.q.g.a(this.i, str1);
            if ((!TextUtils.isEmpty(str2)) && (!textnow.q.g.a(str2)))
            {
              this.i.c(2131493163);
              return;
            }
            a("", new r(this, paramInt1, str1), 2);
            F();
            return;
          }
        }
        this.i.c(2131493163);
        return;
        if ((paramInt2 != 0) || (paramInt1 != 3) || (this.R == null))
          continue;
        new File(this.R).delete();
        return;
      }
      catch (Throwable localThrowable)
      {
        break label135;
      }
    }
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131165569:
    case 2131165570:
    default:
      return;
    case 2131165572:
      String str = this.q.getText().toString();
      if (TextUtils.isEmpty(str))
      {
        this.i.c(2131493427);
        return;
      }
      new UpdateGroupInfoTask(this.l.a(), str).b(getActivity());
      this.i.setTitle(str);
      this.i.a(2131493417, true);
      return;
    case 2131165571:
      this.p.setVisibility(8);
      return;
    case 2131165568:
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
    this.i = ((MainActivity)getActivity());
    Bundle localBundle = getArguments();
    this.V = localBundle.getInt("type", 2);
    if (((this.V == 2) || (this.V == 3)) && (localBundle.containsKey("conversation")))
    {
      this.j = ((textnow.u.f)localBundle.getSerializable("conversation"));
      this.k = new textnow.u.g(this.i, this.j.c());
      this.l = new textnow.u.d(this.j.c(), this.j.d(), this.j.e(), Uri.parse(this.j.h()).toString());
      this.S = this.j.m();
      if (this.V == 3)
        this.H = true;
    }
    while (true)
    {
      setHasOptionsMenu(true);
      return;
      if (this.V == 1)
      {
        com.enflick.android.TextNow.ads.a.b("press_compose_button");
        this.g = true;
        this.j = null;
        this.l = null;
      }
      else
      {
        this.h = true;
      }
    }
  }

  public android.support.v4.content.j<Cursor> onCreateLoader(int paramInt, Bundle paramBundle)
  {
    return textnow.u.k.a(this.i, this.l.a());
  }

  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
    if (ad.b(this.i))
    {
      paramMenuInflater.inflate(2131755010, paramMenu);
      return;
    }
    paramMenuInflater.inflate(2131755017, paramMenu);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    new StringBuilder().append(this).append(" onCreateView").toString();
    if (this.h)
      return paramLayoutInflater.inflate(2130903156, null);
    if ((this.g) && (!ad.c(this.i)))
      this.i.setRequestedOrientation(1);
    while (true)
    {
      if (paramViewGroup != null)
        this.f = paramViewGroup.getApplicationWindowToken();
      View localView = paramLayoutInflater.inflate(2130903157, null);
      this.I = localView.findViewById(2131165567);
      if ((this.l != null) && (this.l.b() == 2) && (textnow.q.k.a(this.l.a())))
        localView.findViewById(2131165575).setVisibility(8);
      com.enflick.android.TextNow.views.emoticons.d locald = com.enflick.android.TextNow.views.emoticons.d.a(this.i);
      this.r = ((ExtendedEditText)localView.findViewById(2131165578));
      this.r.addTextChangedListener(new com.enflick.android.TextNow.views.emoticons.f(locald, this.r));
      this.r.a(this);
      this.r.setImeOptions(4);
      this.r.setOnEditorActionListener(this.ag);
      this.r.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          if (MessageViewFragment.b(MessageViewFragment.this));
          for (Object localObject = MessageViewFragment.c(MessageViewFragment.this); paramAnonymousEditable.length() > 0; localObject = MessageViewFragment.d(MessageViewFragment.this))
          {
            ((ImageView)localObject).setAlpha(255);
            return;
          }
          ((ImageView)localObject).setAlpha(155);
        }

        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }

        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }
      });
      this.q = ((ExtendedEditText)localView.findViewById(2131165570));
      this.q.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          if (paramAnonymousEditable.length() > 0)
          {
            MessageViewFragment.e(MessageViewFragment.this).setVisibility(8);
            MessageViewFragment.f(MessageViewFragment.this).setVisibility(0);
            return;
          }
          MessageViewFragment.e(MessageViewFragment.this).setVisibility(0);
          MessageViewFragment.f(MessageViewFragment.this).setVisibility(8);
        }

        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }

        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
        }
      });
      this.q.a(this);
      this.p = localView.findViewById(2131165569);
      this.C = localView.findViewById(2131165572);
      this.C.setOnClickListener(this);
      this.B = localView.findViewById(2131165571);
      this.B.setOnClickListener(this);
      if ((this.l != null) && (D()))
        H();
      this.D = ((ImageButton)localView.findViewById(2131165568));
      this.D.setOnClickListener(this);
      if (G())
      {
        this.s = ((ImageButton)localView.findViewById(2131165582));
        this.Y = ((ImageView)localView.findViewById(2131165583));
        this.Y.setAlpha(155);
        this.u = ((RelativeLayout)localView.findViewById(2131165581));
        this.u.setVisibility(0);
        this.s.setLongClickable(true);
        this.s.setOnLongClickListener(new View.OnLongClickListener()
        {
          public final boolean onLongClick(View paramAnonymousView)
          {
            MessageViewFragment.a(MessageViewFragment.this, MessageViewFragment.g(MessageViewFragment.this).findViewById(2131165586));
            MessageViewFragment.b(MessageViewFragment.this, MessageViewFragment.g(MessageViewFragment.this).findViewById(2131165585));
            RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(MessageViewFragment.h(MessageViewFragment.this).getLayoutParams());
            localLayoutParams.addRule(12);
            localLayoutParams.addRule(11);
            if (MessageViewFragment.this.g())
            {
              localLayoutParams.setMargins(0, 0, 45, 12 + MessageViewFragment.i(MessageViewFragment.this).getHeight());
              MessageViewFragment.h(MessageViewFragment.this).setLayoutParams(localLayoutParams);
            }
            while (true)
            {
              MessageViewFragment.h(MessageViewFragment.this).requestLayout();
              MessageViewFragment.h(MessageViewFragment.this).setVisibility(0);
              MessageViewFragment.a(MessageViewFragment.this, true);
              MessageViewFragment.j(MessageViewFragment.this).setVisibility(4);
              MessageViewFragment.k(MessageViewFragment.this).setVisibility(0);
              MessageViewFragment.k(MessageViewFragment.this).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  MessageViewFragment.this.i();
                }
              });
              ((Button)MessageViewFragment.g(MessageViewFragment.this).findViewById(2131165588)).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  MessageViewFragment.a(MessageViewFragment.this, 0);
                  MessageViewFragment.c(MessageViewFragment.this).setImageResource(2130837961);
                  if (MessageViewFragment.l(MessageViewFragment.this) != null)
                  {
                    MessageViewFragment.l(MessageViewFragment.this).a(0);
                    MessageViewFragment.l(MessageViewFragment.this).n();
                  }
                  MessageViewFragment.this.i();
                }
              });
              ((Button)MessageViewFragment.g(MessageViewFragment.this).findViewById(2131165587)).setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymous2View)
                {
                  if (MessageViewFragment.this.c.Q())
                  {
                    MessageViewFragment.a(MessageViewFragment.this, 1);
                    MessageViewFragment.c(MessageViewFragment.this).setImageResource(2130837963);
                    if (MessageViewFragment.l(MessageViewFragment.this) != null)
                    {
                      MessageViewFragment.l(MessageViewFragment.this).a(1);
                      MessageViewFragment.l(MessageViewFragment.this).n();
                    }
                    MessageViewFragment.this.i();
                  }
                }
              });
              return true;
              localLayoutParams.setMargins(0, 0, 45, 12);
              MessageViewFragment.h(MessageViewFragment.this).setLayoutParams(localLayoutParams);
            }
          }
        });
        if ((this.k != null) && (this.k.c() == 1))
        {
          this.U = 1;
          this.Y.setImageResource(2130837963);
          label483: this.s.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              MessageViewFragment.m(MessageViewFragment.this);
            }
          });
          this.t = ((Button)localView.findViewById(2131165580));
          this.t.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              MessageViewFragment.m(MessageViewFragment.this);
            }
          });
          this.t.setVisibility(8);
          this.A = ((AttachmentsPanel)localView.findViewById(2131165584));
          this.A.a(this);
          this.v = localView.findViewById(2131165577);
          this.v.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              MessageViewFragment.this.j();
            }
          });
          this.w = localView.findViewById(2131165576);
          this.w.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              MessageViewFragment.this.a(true);
            }
          });
          this.m = ((PullToRefreshListView)localView.findViewById(2131165574));
          this.n = ((ListView)this.m.i());
        }
      }
      try
      {
        this.T = aq.a(this);
        label651: this.o = ((LinearLayout)localView.findViewById(2131165573));
        MainActivity localMainActivity = this.i;
        aq localaq = this.T;
        boolean bool1 = D();
        boolean bool2;
        label697: Bundle localBundle1;
        if (!this.i.v())
        {
          bool2 = true;
          this.K = new textnow.k.r(localMainActivity, null, 0, this, localaq, bool1, bool2, this.j);
          localBundle1 = getArguments();
          if ((localBundle1 != null) && (localBundle1.containsKey("search_message_text")))
          {
            this.K.a(localBundle1.getString("search_message_text"));
            if (localBundle1.containsKey("search_message_position"))
              this.ac = localBundle1.getInt("search_message_position");
          }
          this.x = ((LinearLayout)localView.findViewById(2131165487));
          this.y = ((ListView)localView.findViewById(2131165490));
          if (this.j == null)
            break label1034;
          this.x.setVisibility(8);
          c(true);
          getLoaderManager().a(2);
        }
        label1034: 
        while (true)
          label842: if ((localBundle1 != null) && (localBundle1.containsKey("message_view_state")))
          {
            MessageViewFragment.MessageViewState localMessageViewState = (MessageViewFragment.MessageViewState)localBundle1.getParcelable("message_view_state");
            if (localMessageViewState != null)
            {
              if (!TextUtils.isEmpty(localMessageViewState.a()))
                this.r.setText(localMessageViewState.a());
              locald.a(this.r);
              if (this.z != null)
              {
                textnow.u.d[] arrayOfd = localMessageViewState.b();
                int i1 = arrayOfd.length;
                int i2 = 0;
                while (true)
                  if (i2 < i1)
                  {
                    textnow.u.d locald1 = arrayOfd[i2];
                    this.z.a(locald1, this.J);
                    i2++;
                    continue;
                    this.i.setRequestedOrientation(-1);
                    break;
                    this.U = 0;
                    this.Y.setImageResource(2130837961);
                    break label483;
                    this.s = ((ImageButton)localView.findViewById(2131165579));
                    this.s.setVisibility(0);
                    this.s.setAlpha(155);
                    break label483;
                    bool2 = false;
                    break label697;
                    this.L = new textnow.k.g(getActivity(), null);
                    getLoaderManager().a(2, null, new textnow.m.b(getActivity(), this.L));
                    this.z = ((RecipientField)localView.findViewById(2131165488));
                    this.J = new com.enflick.android.TextNow.views.k();
                    this.y.setOnItemClickListener(new a(this.y, this.z, this.J));
                    this.y.setAdapter(this.L);
                    this.z.a(new z(this.y, this.z, this.J, this.L));
                    this.z.a(this);
                    this.z.setImeOptions(5);
                    this.z.a(this);
                    this.z.setOnEditorActionListener(new TextView.OnEditorActionListener()
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
                    Bundle localBundle2 = getArguments();
                    if ((localBundle2 != null) && (localBundle2.containsKey("number")))
                    {
                      String str2 = localBundle2.getString("number");
                      if (!TextUtils.isEmpty(str2))
                        this.z.getEditableText().append(str2);
                    }
                    c(false);
                    break label842;
                  }
                for (String str1 : localMessageViewState.c())
                  this.z.getEditableText().append(str1);
              }
            }
          }
        if ((localBundle1 != null) && (localBundle1.containsKey("message")) && (!TextUtils.isEmpty(localBundle1.getString("message"))))
          this.r.getEditableText().append(localBundle1.getString("message"));
        while (true)
        {
          this.a = true;
          return localView;
          if (this.j != null)
          {
            this.r.getEditableText().append(textnow.q.z.a().a(this.j.c()));
            textnow.q.z.a().b(this.j.c());
          }
        }
      }
      catch (Exception localException)
      {
        break label651;
      }
    }
  }

  public void onDestroyView()
  {
    if (this.j != null)
    {
      String str = this.r.getText().toString();
      if (!TextUtils.isEmpty(str))
        textnow.q.z.a().a(this.j.c(), str);
    }
    if ((!this.h) && (this.K != null))
    {
      Set localSet = this.K.d();
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
              MessageViewFragment.g(MessageViewFragment.this).getContentResolver().applyBatch("com.enflick.android.TextNow.TNContentProvider", localArrayList);
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
    this.F = false;
    this.i.e(17170445);
    this.a = false;
    if (this.T != null)
      this.T.a();
    this.i.setRequestedOrientation(-1);
    super.onDestroyView();
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.M.a() == 2)
      this.n.setItemChecked(paramInt, a(paramView, true));
    textnow.k.t localt;
    String str1;
    String str2;
    textnow.q.h localh;
    do
    {
      int i1;
      do
      {
        do
        {
          return;
          localt = (textnow.k.t)paramView.getTag();
        }
        while ((localt == null) || (localt.a == null));
        i1 = localt.a.g();
        if (localt.a.j() == 1)
        {
          new SendMessageTask(this.i, localt.a).b(this.i);
          return;
        }
        if (i1 == 2)
        {
          if (TextUtils.isEmpty(localt.a.e()))
          {
            this.i.c(2131493160);
            return;
          }
          this.i.a(j.a(localt.a));
          return;
        }
      }
      while (i1 != 8);
      if (textnow.q.g.b(this.i, localt.a.k()))
        break;
      str1 = localt.a.e();
      str2 = localt.a.a();
      localh = textnow.q.h.d;
    }
    while (TextUtils.isEmpty(str1));
    this.i.a(2131493022, true);
    new DownloadToFileTask(str2, str1, localh).b(this.i);
    return;
    b(localt.a.k());
  }

  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i1 = 1;
    if (this.M.a() == i1)
    {
      a(paramView, false);
      return false;
    }
    if (this.M.a() == 3)
      this.n.clearChoices();
    if (!this.K.a(paramView))
    {
      a(paramView, i1);
      this.n.setItemChecked(paramInt, i1);
    }
    while (true)
    {
      return i1;
      int i2 = 0;
    }
  }

  public void onLoaderReset(android.support.v4.content.j<Cursor> paramj)
  {
    this.K.b(null);
  }

  public void onLowMemory()
  {
    if (this.T != null)
      this.T.b();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    boolean bool1 = true;
    switch (paramMenuItem.getItemId())
    {
    default:
      bool1 = super.onOptionsItemSelected(paramMenuItem);
    case 2131165758:
    case 2131165787:
    case 2131165788:
    case 2131165762:
    case 2131165761:
    case 2131165763:
    case 2131165759:
    case 2131165760:
      textnow.u.d locald1;
      do
      {
        textnow.u.d locald2;
        do
        {
          return bool1;
          this.i.a(this.l.a(), this.l.g());
          return bool1;
          textnow.u.d locald3 = this.l;
          if ((locald3 != null) && (locald3.j()))
          {
            this.i.a(locald3, false, bool1);
            return bool1;
          }
          this.i.a(null);
          return bool1;
          if ((this.h) || (this.g))
            break;
          s();
          return bool1;
          textnow.u.f localf = this.j;
          if (localf == null)
            break;
          new com.enflick.android.TextNow.tasks.a(this.i, localf, "", null, localf.a()).execute(new Void[0]);
          a(null, bool1);
          this.i.supportInvalidateOptionsMenu();
          return bool1;
          if (this.j == null)
            break;
          Intent localIntent3 = new Intent("android.intent.action.PICK");
          localIntent3.setType("image/*");
          this.i.startActivityForResult(localIntent3, 10);
          return bool1;
          String str3 = this.j.m();
          if (!TextUtils.isEmpty(str3));
          for (Uri localUri2 = Uri.parse(str3); ; localUri2 = Uri.EMPTY)
          {
            Intent localIntent2 = new Intent("android.intent.action.RINGTONE_PICKER");
            String str4 = new textnow.u.r(this.i).w();
            ad.a(localIntent2, localUri2, this.i, ad.a(this.i, str4));
            try
            {
              this.i.startActivityForResult(localIntent2, 12);
              return bool1;
            }
            catch (Exception localException)
            {
              this.i.c(2131493519);
              return bool1;
            }
          }
          locald2 = this.l;
        }
        while (locald2 == null);
        MainActivity localMainActivity2 = this.i;
        String str2 = locald2.a();
        if (locald2.b() == 2);
        for (boolean bool3 = bool1; ; bool3 = false)
        {
          textnow.q.k.a(localMainActivity2, str2, bool3);
          return bool1;
        }
        locald1 = this.l;
      }
      while (locald1 == null);
      MainActivity localMainActivity1 = this.i;
      Intent localIntent1 = new Intent("android.intent.action.VIEW");
      localIntent1.putExtra("finishActivityOnSaveCompleted", bool1);
      ContentResolver localContentResolver = localMainActivity1.getContentResolver();
      Uri localUri1 = textnow.q.k.a(localContentResolver, locald1.a(), locald1.b());
      if (localUri1 != null)
      {
        localIntent1.setDataAndType(ContactsContract.Contacts.getLookupUri(localContentResolver, localUri1), "vnd.android.cursor.item/contact");
        localMainActivity1.startActivity(localIntent1);
        return bool1;
      }
      String str1 = locald1.a();
      int i1 = locald1.b();
      boolean bool2 = false;
      if (i1 == 2)
        bool2 = bool1;
      textnow.q.k.a(localMainActivity1, str1, bool2);
      return bool1;
    case 2131165764:
      new AsyncTask()
      {
        private Void a()
        {
          textnow.u.f localf = MessageViewFragment.this.e();
          Intent localIntent1 = new Intent(MessageViewFragment.g(MessageViewFragment.this).getApplicationContext(), MainActivity.class);
          localIntent1.putExtra("extra_msg_view_type", 2);
          localIntent1.putExtra("extra_selected_cv", localf.c());
          localIntent1.putExtra("extra_selected_ct", localf.d());
          localIntent1.setAction("android.intent.action.MAIN");
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("android.intent.extra.shortcut.INTENT", localIntent1);
          String str;
          if ((localf.d() == 2) && (TextUtils.isEmpty(localf.e())))
            str = textnow.q.b.g(localf.c());
          while (true)
          {
            if (str.length() > 12)
              str = str.substring(0, 12);
            localIntent2.putExtra("android.intent.extra.shortcut.NAME", str);
            textnow.q.q localq = textnow.q.q.a(MessageViewFragment.g(MessageViewFragment.this));
            Uri localUri;
            label171: Object localObject;
            if (!textnow.u.f.c(localf.h()))
            {
              localUri = Uri.parse(localf.h());
              localObject = localq.a(localUri, 0);
              if (localObject != null)
                break label277;
            }
            try
            {
              Resources localResources = MessageViewFragment.g(MessageViewFragment.this).getResources();
              int j;
              label210: Bitmap localBitmap2;
              if (localf.d() == 5)
              {
                j = 2130837898;
                localBitmap2 = BitmapFactory.decodeResource(localResources, j);
              }
              label223: Bitmap localBitmap1;
              for (localObject = localBitmap2; ; localObject = localBitmap1)
              {
                localIntent2.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)localObject);
                localIntent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                MessageViewFragment.g(MessageViewFragment.this).sendBroadcast(localIntent2);
                return null;
                str = localf.o();
                break;
                localUri = null;
                break label171;
                j = 2130837897;
                break label210;
                label277: int i = Math.min(((Bitmap)localObject).getWidth(), ad.a(MessageViewFragment.g(MessageViewFragment.this), 48));
                localBitmap1 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Canvas localCanvas = new Canvas(localBitmap1);
                if ((((Bitmap)localObject).getWidth() != i) || (((Bitmap)localObject).getHeight() != i))
                  localObject = Bitmap.createScaledBitmap((Bitmap)localObject, i, i, false);
                Paint localPaint = new Paint();
                Rect localRect = new Rect(0, 0, i, i);
                localPaint.setAntiAlias(true);
                localPaint.setFilterBitmap(true);
                localPaint.setDither(true);
                localCanvas.drawARGB(0, 0, 0, 0);
                localPaint.setColor(Color.parseColor("#ffffff"));
                localCanvas.drawCircle(i / 2.0F, i / 2.0F, i / 2.0F, localPaint);
                localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                localCanvas.drawBitmap((Bitmap)localObject, localRect, localRect, localPaint);
                localPaint.setStyle(Paint.Style.STROKE);
                localPaint.setStrokeWidth(ad.a(TextNowApp.a().getApplicationContext(), 1));
                localCanvas.drawCircle(i / 2.0F, i / 2.0F, i / 2.0F, localPaint);
              }
            }
            catch (Exception localException)
            {
              break label223;
            }
          }
        }
      }
      .execute(new Void[0]);
      return bool1;
    case 2131165765:
    }
    new textnow.r.a(getActivity(), this).a(this.l);
    return bool1;
  }

  public void onPause()
  {
    super.onPause();
    this.b = false;
    this.ac = -1;
    C();
    if (this.r != null)
      this.r.clearFocus();
  }

  public void onPrepareOptionsMenu(Menu paramMenu)
  {
    p localp = new p(paramMenu);
    localp.a();
    MenuItem localMenuItem = paramMenu.findItem(2131165754);
    if (localMenuItem != null)
      localMenuItem.getIcon().setAlpha(255);
    textnow.u.d locald = this.l;
    textnow.u.f localf = this.j;
    textnow.u.r localr = new textnow.u.r(getActivity());
    if (locald == null)
    {
      localp.a(2131165759);
      localp.a(2131165787);
      localp.a(2131165760);
      if (localf != null)
        break label332;
      localp.a(2131165763);
      localp.a(2131165761);
      localp.a(2131165762);
      localp.a(2131165764);
      localp.a(2131165765);
    }
    while (true)
    {
      if (!D())
        break label360;
      localp.a(2131165787);
      localp.a(2131165763);
      localp.a(2131165759);
      localp.a(2131165760);
      return;
      if (((locald.b() != 2) && (locald.b() != 1) && ((locald.b() != 3) || (!locald.a().endsWith("@textnow.me")))) || (locald.a().equalsIgnoreCase(localr.c())) || (locald.a().equalsIgnoreCase(localr.b() + "@textnow.me")))
      {
        localp.a(2131165787);
        localp.a(2131165763);
      }
      while (true)
      {
        if (locald.i())
          break label330;
        localp.a(2131165759);
        break;
        if (textnow.q.k.a(locald.a()))
        {
          localp.a(2131165787);
          localp.a(2131165763);
          localp.a(2131165759);
          localp.a(2131165760);
        }
      }
      label330: break;
      label332: if ((!this.F) && (TextUtils.isEmpty(localf.l())))
        localp.a(2131165762);
    }
    label360: localp.a(2131165758);
  }

  public void onResume()
  {
    super.onResume();
    if (!this.F)
    {
      if (this.j != null)
        a(this.j.l(), false);
    }
    else if (this.l != null)
    {
      textnow.u.d locald = textnow.q.k.a(this.i.getContentResolver(), this.j, this.l);
      if (locald == null)
        break label240;
      this.i.setTitle(locald.g());
    }
    while (true)
    {
      this.i.supportInvalidateOptionsMenu();
      this.x.setVisibility(8);
      c(true);
      E();
      new MarkMessagesReadTask(this.l.a()).b(this.i);
      this.b = true;
      if (this.z != null)
      {
        this.z.requestFocus();
        ((InputMethodManager)this.i.getSystemService("input_method")).showSoftInput(this.z, 1);
      }
      if (this.H)
      {
        this.r.postDelayed(new Runnable()
        {
          public final void run()
          {
            MessageViewFragment.n(MessageViewFragment.this).requestFocus();
            ((InputMethodManager)MessageViewFragment.g(MessageViewFragment.this).getSystemService("input_method")).showSoftInput(MessageViewFragment.n(MessageViewFragment.this), 1);
          }
        }
        , 300L);
        this.H = false;
      }
      if ((D()) && (this.l != null))
        new GetGroupTask(this.l.a()).b(getActivity());
      return;
      a(null, true);
      break;
      label240: this.i.setTitle(this.l.g());
    }
  }

  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 2)
    {
      textnow.q.q.a(this.i).c();
      return;
    }
    textnow.q.q.a(this.i).d();
  }

  public final void p()
  {
    if ((c() == 0) || (!this.a))
    {
      this.M.b();
      return;
    }
    if (this.M.a() == 2)
    {
      this.M.c();
      return;
    }
    this.M.d();
  }

  public final void q()
  {
    textnow.u.r localr = new textnow.u.r(this.i);
    String str = localr.g() + " " + localr.h();
    if (str.length() <= 1)
      str = localr.b();
    a(getString(2131493383, new Object[] { str }), null, 1);
    F();
  }

  public final void r()
  {
    d();
    if (this.N.size() > 0)
    {
      ContentResolver localContentResolver = getActivity().getContentResolver();
      String str1 = this.N.toString().replaceAll("\\s", "");
      String str2 = str1.substring(1, -1 + str1.length());
      int i1 = localContentResolver.delete(com.enflick.android.TextNow.persistence.contentproviders.f.d, "messages.message_id IN (" + str2 + ")", null);
      new StringBuilder().append(i1).append(" messages are deleted locally").toString();
      Uri localUri1 = com.enflick.android.TextNow.persistence.contentproviders.f.d;
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
        Uri localUri2 = com.enflick.android.TextNow.persistence.contentproviders.c.d;
        String[] arrayOfString3 = new String[1];
        arrayOfString3[0] = this.l.a();
        int i3 = localContentResolver.delete(localUri2, "conversations.contact_value=?", arrayOfString3);
        if (this.P != null)
          this.P.s();
        new StringBuilder().append(i3).append("conversation is deleted locally").toString();
      }
      new DeleteMessagesTask(str1).b(this.i);
      this.N.clear();
    }
  }

  public final void s()
  {
    if (this.l != null)
    {
      int i1 = new GetMessagesForConversationTask(this.l.a(), this.l.b(), this.c.k(), true).b(getActivity());
      this.aa = false;
      new StringBuilder().append("MessagesActivity started task with id:").append(i1).toString();
    }
  }

  public final void t()
  {
    if (this.l != null)
    {
      if (this.c.Q())
        new ImportSMSForConversationTask(this.l.a()).b(this.i);
      new GetHistoryForConversationTask(this.l.a(), this.l.b()).b(this.i);
      this.aa = true;
    }
  }

  public final boolean u()
  {
    return this.h;
  }

  public final boolean v()
  {
    return this.g;
  }

  public final void w()
  {
    this.i.a(2131493554, false);
  }

  protected final IBinder x()
  {
    if (this.a)
      return this.r.getApplicationWindowToken();
    return super.x();
  }

  public final void y()
  {
    this.i.a(true);
  }

  public final MessageViewFragment.MessageViewState z()
  {
    if (this.z != null)
    {
      v localv = u.a(this.z.getEditableText());
      List localList1 = localv.a();
      textnow.u.d[] arrayOfd = new textnow.u.d[localList1.size()];
      localList1.toArray(arrayOfd);
      List localList2 = localv.b();
      String[] arrayOfString = new String[localList2.size()];
      localList2.toArray(arrayOfString);
      return new MessageViewFragment.MessageViewState(I(), arrayOfd, arrayOfString);
    }
    if (this.r != null)
      return new MessageViewFragment.MessageViewState(I(), new textnow.u.d[0], new String[0]);
    return MessageViewFragment.MessageViewState.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.MessageViewFragment
 * JD-Core Version:    0.6.2
 */