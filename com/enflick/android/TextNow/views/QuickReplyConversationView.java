package com.enflick.android.TextNow.views;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.enflick.android.TextNow.activities.MainActivity;
import com.enflick.android.TextNow.tasks.SendMessageTask;
import com.enflick.android.TextNow.tasks.SendSMSTask;
import com.enflick.android.TextNow.views.emoticons.d;
import java.util.Set;
import textnow.p.ab;
import textnow.z.g;
import textnow.z.i;

public class QuickReplyConversationView extends LinearLayout
  implements View.OnClickListener
{
  private ListView a;
  private EditText b;
  private ImageButton c;
  private ImageButton d;
  private ImageView e;
  private TextView f;
  private textnow.z.f g;
  private ab h;
  private h i;
  private i j;

  public QuickReplyConversationView(Context paramContext)
  {
    super(paramContext);
  }

  public QuickReplyConversationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void d()
  {
    String str1 = this.b.getText().toString().trim();
    g localg;
    int k;
    if (!TextUtils.isEmpty(str1))
    {
      Set localSet = textnow.z.h.b(getContext());
      localg = textnow.z.f.a(getContext(), localSet, this.g.a(), this.g.b());
      if (localg == null)
        break label138;
      k = localg.b;
      if (localg == null)
        break label150;
    }
    label138: label150: for (String str2 = localg.a; ; str2 = this.g.a())
    {
      new SendMessageTask(getContext(), k, str2, this.g.c(), this.g.d(), 1, 2, true, str1, null).b(getContext());
      if (this.i != null)
        this.i.a(this.g.a());
      return;
      k = this.g.b();
      break;
    }
  }

  public final textnow.z.f a()
  {
    return this.g;
  }

  public final void a(h paramh)
  {
    this.i = paramh;
  }

  public final void a(textnow.z.f paramf)
  {
    this.g = paramf;
    if (textnow.z.h.c(this.g.d()))
    {
      this.e.setImageResource(2130837558);
      this.j = new i(getContext(), this.g.a());
      if (this.j.c() != 1)
        break label161;
      this.c.setImageResource(2130837924);
      label69: this.c.setAlpha(155);
      KeyguardManager localKeyguardManager = (KeyguardManager)getContext().getSystemService("keyguard");
      if ((!this.g.j()) || (localKeyguardManager.inKeyguardRestrictedInputMode()))
        break label173;
      this.d.setVisibility(0);
    }
    while (true)
    {
      this.f.setText(this.g.c());
      return;
      Uri localUri = Uri.parse(this.g.d());
      textnow.v.o.a(getContext()).a(this.e, localUri);
      break;
      label161: this.c.setImageResource(2130837922);
      break label69;
      label173: this.d.setVisibility(8);
    }
  }

  public final void a(textnow.z.o paramo)
  {
    if (paramo == null);
    do
    {
      do
        return;
      while (this.h == null);
      if (this.h.getCount() >= 10)
      {
        textnow.z.o localo = (textnow.z.o)this.h.getItem(0);
        this.h.remove(localo);
      }
      this.h.add(paramo);
    }
    while (this.h.getCount() < 3);
    View localView = this.h.getView(0, null, this.a);
    localView.measure(0, 0);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.a.getLayoutParams();
    localLayoutParams.width = -1;
    localLayoutParams.height = (3 * localView.getMeasuredHeight());
    this.a.setLayoutParams(localLayoutParams);
  }

  public final void b()
  {
    if (this.a != null)
      this.a.setSelection(this.a.getCount());
  }

  public final int c()
  {
    if (this.h == null)
      return 0;
    return this.h.getCount();
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
    case 2131558878:
    case 2131558938:
    }
    do
    {
      do
      {
        String str;
        do
        {
          return;
          if (this.j.c() != 1)
            break;
          str = this.b.getText().toString().trim();
        }
        while (TextUtils.isEmpty(str));
        new SendSMSTask(this.g.a(), this.g.c(), str).b(getContext());
      }
      while (this.i == null);
      this.i.a(this.g.a());
      return;
      d();
      return;
      Intent localIntent = new Intent(getContext(), MainActivity.class);
      localIntent.putExtra("extra_show_dialer", true);
      localIntent.putExtra("extra_dialer_contact", this.g);
      localIntent.putExtra("extra_launched_from_widget", "QuickReply");
      localIntent.addFlags(268435456);
      getContext().startActivity(localIntent);
    }
    while (this.i == null);
    this.i.b();
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.e = ((ImageView)findViewById(2131558557));
    this.f = ((TextView)findViewById(2131558628));
    this.a = ((ListView)findViewById(2131558939));
    this.b = ((EditText)findViewById(2131558940));
    this.b.setImeOptions(4);
    this.b.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        if (paramAnonymousInt == 4)
        {
          QuickReplyConversationView.a(QuickReplyConversationView.this);
          return true;
        }
        return false;
      }
    });
    this.b.addTextChangedListener(new com.enflick.android.TextNow.views.emoticons.f(d.a(getContext()), this.b));
    this.b.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        if (paramAnonymousEditable.length() > 0)
        {
          QuickReplyConversationView.b(QuickReplyConversationView.this).setAlpha(255);
          return;
        }
        QuickReplyConversationView.b(QuickReplyConversationView.this).setAlpha(155);
      }

      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }
    });
    this.c = ((ImageButton)findViewById(2131558878));
    this.c.setOnClickListener(this);
    this.d = ((ImageButton)findViewById(2131558938));
    this.d.setOnClickListener(this);
    this.h = new ab(getContext());
    this.a.setAdapter(this.h);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.views.QuickReplyConversationView
 * JD-Core Version:    0.6.2
 */