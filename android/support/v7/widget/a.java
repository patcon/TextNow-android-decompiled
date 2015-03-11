package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

final class a
{
  private Method a;
  private Method b;
  private Method c;
  private Method d;

  a()
  {
    try
    {
      this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
      this.a.setAccessible(true);
      try
      {
        label27: this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.b.setAccessible(true);
        try
        {
          label50: Class[] arrayOfClass2 = new Class[1];
          arrayOfClass2[0] = Boolean.TYPE;
          this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", arrayOfClass2);
          this.c.setAccessible(true);
          try
          {
            label84: Class[] arrayOfClass1 = new Class[2];
            arrayOfClass1[0] = Integer.TYPE;
            arrayOfClass1[1] = ResultReceiver.class;
            this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", arrayOfClass1);
            this.d.setAccessible(true);
            return;
          }
          catch (NoSuchMethodException localNoSuchMethodException4)
          {
          }
        }
        catch (NoSuchMethodException localNoSuchMethodException3)
        {
          break label84;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        break label50;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException1)
    {
      break label27;
    }
  }

  final void a(InputMethodManager paramInputMethodManager, View paramView, int paramInt)
  {
    if (this.d != null)
      try
      {
        Method localMethod = this.d;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(0);
        arrayOfObject[1] = null;
        localMethod.invoke(paramInputMethodManager, arrayOfObject);
        return;
      }
      catch (Exception localException)
      {
      }
    paramInputMethodManager.showSoftInput(paramView, 0);
  }

  final void a(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.a != null);
    try
    {
      this.a.invoke(paramAutoCompleteTextView, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  final void a(AutoCompleteTextView paramAutoCompleteTextView, boolean paramBoolean)
  {
    if (this.c != null);
    try
    {
      Method localMethod = this.c;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(true);
      localMethod.invoke(paramAutoCompleteTextView, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  final void b(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.b != null);
    try
    {
      this.b.invoke(paramAutoCompleteTextView, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a
 * JD-Core Version:    0.6.2
 */