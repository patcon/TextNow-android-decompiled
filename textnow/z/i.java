package textnow.z;

import android.content.Context;
import java.util.Date;

public final class i extends r
{
  public i(Context paramContext, String paramString)
  {
    super(paramContext, "convo_" + paramString);
  }

  public final long a()
  {
    return b("eariest_sms", new Date().getTime());
  }

  public final void a(int paramInt)
  {
    a("default_outbound", paramInt);
  }

  public final void a(long paramLong)
  {
    a("eariest_sms", paramLong);
  }

  public final long b()
  {
    return b("earliest_message_id", -1L);
  }

  public final void b(long paramLong)
  {
    a("earliest_message_id", paramLong);
  }

  public final int c()
  {
    return b("default_outbound", 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.z.i
 * JD-Core Version:    0.6.2
 */