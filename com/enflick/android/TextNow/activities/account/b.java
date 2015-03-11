package com.enflick.android.TextNow.activities.account;

import android.text.Editable;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

final class b
  implements View.OnFocusChangeListener
{
  private b(BillingAddressDialogView paramBillingAddressDialogView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if ((paramBoolean) && ((paramView instanceof EditText)))
    {
      EditText localEditText = (EditText)paramView;
      localEditText.setSelection(localEditText.getText().length());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.account.b
 * JD-Core Version:    0.6.2
 */