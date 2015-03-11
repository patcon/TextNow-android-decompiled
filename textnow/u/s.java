package textnow.u;

import android.content.Context;

public final class s extends p
{
  public s(Context paramContext)
  {
    super(paramContext);
  }

  public final void a(boolean paramBoolean)
  {
    a("new_user_dialog_scheduled", false);
  }

  public final boolean a()
  {
    return b("welcome_screen_text_signed_in", false).booleanValue();
  }

  public final boolean b()
  {
    return b("new_user_tap_create_new_account", false).booleanValue();
  }

  public final boolean c()
  {
    return b("new_user_created_account", false).booleanValue();
  }

  public final boolean d()
  {
    return b("new_user_number_assigned", false).booleanValue();
  }

  public final boolean e()
  {
    return b("new_user_sent_first_message", false).booleanValue();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.u.s
 * JD-Core Version:    0.6.2
 */