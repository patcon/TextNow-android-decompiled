package cz.acrobits.libsoftphone.data;

public final class Call$DesiredMedia
{
  public boolean incomingVideoEnabled;
  public boolean outgoingVideoEnabled;

  public Call$DesiredMedia(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.incomingVideoEnabled = paramBoolean1;
    this.outgoingVideoEnabled = paramBoolean2;
  }

  public static DesiredMedia videoBothWays()
  {
    return new DesiredMedia(true, true);
  }

  public static DesiredMedia voiceOnly()
  {
    return new DesiredMedia(false, false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Call.DesiredMedia
 * JD-Core Version:    0.6.2
 */