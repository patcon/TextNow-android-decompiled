package textnow.o;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.i;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

public final class d extends i
{
  private DialogInterface.OnClickListener a;
  private DialogInterface.OnClickListener b;
  private String c;
  private String d;
  private String e;
  private String f;

  public d(String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, String paramString4, DialogInterface.OnClickListener paramOnClickListener2)
  {
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.a = paramOnClickListener1;
    this.b = null;
  }

  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    SpannableString localSpannableString = new SpannableString(this.d);
    Linkify.addLinks(localSpannableString, 15);
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity()).setTitle(this.c).setMessage(localSpannableString);
    if (this.e != null)
      localBuilder.setPositiveButton(this.e, this.a);
    if (this.f != null)
      localBuilder.setNegativeButton(this.f, this.b);
    return localBuilder.create();
  }

  public final void onStart()
  {
    super.onStart();
    if (getDialog() != null)
    {
      TextView localTextView = (TextView)getDialog().findViewById(16908299);
      if (localTextView != null)
        localTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.o.d
 * JD-Core Version:    0.6.2
 */