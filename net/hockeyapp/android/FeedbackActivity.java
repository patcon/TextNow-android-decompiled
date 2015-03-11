package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import textnow.bi.e;

public class FeedbackActivity extends Activity
  implements View.OnClickListener
{
  private final int a = 0;
  private Context b;
  private TextView c;
  private EditText d;
  private EditText e;
  private EditText f;
  private EditText g;
  private Button h;
  private Button i;
  private Button j;
  private ScrollView k;
  private LinearLayout l;
  private ListView m;
  private textnow.bh.d n;
  private Handler o;
  private textnow.bh.c p;
  private Handler q;
  private String r;
  private textnow.bg.a s;
  private textnow.be.a t;
  private ArrayList<textnow.bg.c> u;
  private boolean v;
  private String w;

  private void a()
  {
    this.w = e.a().a(this);
    if (this.w == null)
    {
      a(false);
      return;
    }
    a(true);
    a(this.r, null, null, null, null, this.w, this.o, true);
  }

  private void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Handler paramHandler, boolean paramBoolean)
  {
    this.n = new textnow.bh.d(this.b, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramHandler, paramBoolean);
    this.n.execute(new Void[0]);
  }

  protected final void a(boolean paramBoolean)
  {
    this.k = ((ScrollView)findViewById(131095));
    this.l = ((LinearLayout)findViewById(131093));
    this.m = ((ListView)findViewById(131094));
    if (paramBoolean)
    {
      this.l.setVisibility(0);
      this.k.setVisibility(8);
      this.c = ((TextView)findViewById(8192));
      this.i = ((Button)findViewById(131088));
      this.i.setOnClickListener(this);
      this.j = ((Button)findViewById(131089));
      this.j.setOnClickListener(this);
      return;
    }
    this.l.setVisibility(8);
    this.k.setVisibility(0);
    this.d = ((EditText)findViewById(8194));
    this.e = ((EditText)findViewById(8196));
    this.f = ((EditText)findViewById(8198));
    this.g = ((EditText)findViewById(8200));
    String str = e.a().b(this.b);
    if (str != null)
    {
      String[] arrayOfString = str.split("\\|");
      if ((arrayOfString != null) && (arrayOfString.length == 3))
      {
        this.d.setText(arrayOfString[0]);
        this.e.setText(arrayOfString[1]);
        this.f.setText(arrayOfString[2]);
      }
      this.g.setText("");
      if (e.a().a(this.b) == null)
        break label336;
      this.f.setVisibility(8);
    }
    while (true)
    {
      this.h = ((Button)findViewById(8201));
      this.h.setOnClickListener(this);
      return;
      this.d.setText("");
      this.e.setText("");
      this.f.setText("");
      break;
      label336: this.f.setVisibility(0);
    }
  }

  public final void b(boolean paramBoolean)
  {
    if (this.h != null)
      this.h.setEnabled(paramBoolean);
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default:
      return;
    case 8201:
      b(false);
      if ((this.d.getText().toString().trim().length() <= 0) || (this.e.getText().toString().trim().length() <= 0) || (this.f.getText().toString().trim().length() <= 0) || (this.g.getText().toString().trim().length() <= 0))
      {
        this.s = new textnow.bg.a();
        this.s.a("Please provide all details");
        showDialog(0);
        b(true);
        return;
      }
      e.a().a(this.b, this.d.getText().toString(), this.e.getText().toString(), this.f.getText().toString());
      a(this.r, this.d.getText().toString(), this.e.getText().toString(), this.f.getText().toString(), this.g.getText().toString(), e.a().a(this.b), this.o, false);
      return;
    case 131088:
      a(false);
      this.v = true;
      return;
    case 131089:
    }
    a(this.r, null, null, null, null, e.a().a(this.b), this.o, true);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(new net.hockeyapp.android.views.b(this));
    setTitle("Feedback");
    this.b = this;
    this.v = false;
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
      this.r = localBundle.getString("url");
    this.o = new Handler()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        int i = 0;
        FeedbackActivity.a(FeedbackActivity.this, new textnow.bg.a());
        String str1;
        String str2;
        String str3;
        if ((paramAnonymousMessage != null) && (paramAnonymousMessage.getData() != null))
        {
          Bundle localBundle = paramAnonymousMessage.getData();
          str1 = localBundle.getString("feedback_response");
          str2 = localBundle.getString("feedback_status");
          str3 = localBundle.getString("request_type");
          if ((str3.equals("send")) && ((str1 == null) || (Integer.parseInt(str2) != 201)))
            FeedbackActivity.a(FeedbackActivity.this).a("Message couldn't be posted. Please check your input values and try again.");
        }
        while (true)
        {
          if (i == 0)
            FeedbackActivity.this.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                FeedbackActivity.this.b(true);
                FeedbackActivity.this.showDialog(0);
              }
            });
          return;
          if ((str3.equals("fetch")) && ((Integer.parseInt(str2) == 404) || (Integer.parseInt(str2) == 422)))
          {
            FeedbackActivity.b(FeedbackActivity.this);
            i = 1;
          }
          else
          {
            FeedbackActivity.a(FeedbackActivity.this, str1);
            i = 1;
            continue;
            FeedbackActivity.a(FeedbackActivity.this).a("Message couldn't be posted. Please check your input values and try again.");
            i = 0;
          }
        }
      }
    };
    this.q = new Handler()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        FeedbackActivity.a(FeedbackActivity.this, new textnow.bg.a());
        int i;
        if ((paramAnonymousMessage != null) && (paramAnonymousMessage.getData() != null))
        {
          textnow.bg.d locald = (textnow.bg.d)paramAnonymousMessage.getData().getSerializable("parse_feedback_response");
          if (locald != null)
            if (locald.a().equalsIgnoreCase("success"))
            {
              if (locald.c() == null)
                break label137;
              e.a().a(FeedbackActivity.c(FeedbackActivity.this), locald.c());
              FeedbackActivity.a(FeedbackActivity.this, locald);
              FeedbackActivity.a(FeedbackActivity.this, false);
              i = 1;
            }
        }
        while (true)
        {
          if (i == 0)
            FeedbackActivity.this.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                FeedbackActivity.this.showDialog(0);
              }
            });
          FeedbackActivity.this.b(true);
          return;
          i = 0;
          continue;
          label137: i = 1;
          continue;
          i = 0;
        }
      }
    };
    a();
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 0:
    }
    return new AlertDialog.Builder(this).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(17301543).setPositiveButton("OK", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        FeedbackActivity.a(FeedbackActivity.this, null);
        paramAnonymousDialogInterface.cancel();
      }
    }).create();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.v)
      {
        this.v = false;
        a();
      }
      while (true)
      {
        return true;
        finish();
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
    }
    AlertDialog localAlertDialog = (AlertDialog)paramDialog;
    if (this.s != null)
    {
      localAlertDialog.setMessage(this.s.a());
      return;
    }
    localAlertDialog.setMessage("An error has occured");
  }

  public Object onRetainNonConfigurationInstance()
  {
    if (this.n != null)
      this.n.a();
    return this.n;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     net.hockeyapp.android.FeedbackActivity
 * JD-Core Version:    0.6.2
 */