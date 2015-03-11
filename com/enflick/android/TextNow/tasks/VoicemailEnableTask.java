package com.enflick.android.TextNow.tasks;

import android.content.Context;
import android.net.Uri;
import com.enflick.android.TextNow.api.users.UsersPhoneVoiceVoicemailPut;
import com.enflick.android.TextNow.api.users.ae;
import java.io.File;
import textnow.q.g;
import textnow.u.r;

public class VoicemailEnableTask extends c
{
  private File d;
  private String e;
  private int f;

  public VoicemailEnableTask()
  {
    this.f = 1;
  }

  public VoicemailEnableTask(Uri paramUri, Context paramContext)
  {
    if (paramUri == null)
      throw new NullPointerException("filename cannot be null");
    this.f = 2;
    this.e = paramUri.toString();
    this.d = new File(g.a(paramContext, paramUri.toString()));
    if (!this.d.exists())
      throw new RuntimeException("File does not exist for upload: " + this.d.getAbsolutePath());
  }

  public void run()
  {
    r localr = new r(this.a);
    if (this.f == 2);
    for (ae localae = new ae(localr.b(), this.f, this.d); a(new UsersPhoneVoiceVoicemailPut(this.a).runSync(localae)); localae = new ae(localr.b(), this.f))
      return;
    localr.x(String.valueOf(this.f));
    new StringBuilder().append("Saving to user info object uri: ").append(this.e).toString();
    localr.y(this.e);
    localr.n();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.VoicemailEnableTask
 * JD-Core Version:    0.6.2
 */