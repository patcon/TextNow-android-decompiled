package net.hockeyapp.android;

public final class f
{
  public static final String[] a = { "Crash Data", "The app found information about previous crashes. Would you like to send this data to the developer?", "Dismiss", "Send", "Download Failed", "The update could not be downloaded. Would you like to try again?", "Cancel", "Retry", "Please install the latest version to continue to use this app.", "Update Available", "Show information about the new update?", "Dismiss", "Show", "Build Expired", "This has build has expired. Please check HockeyApp for any updates.", "Feedback Failed", "Would you like to send your feedback again?" };

  public static String a(e parame, int paramInt)
  {
    String str = null;
    if (parame != null)
      str = parame.a(paramInt);
    if ((str == null) && (paramInt >= 0) && (paramInt <= a.length))
      str = a[paramInt];
    return str;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     net.hockeyapp.android.f
 * JD-Core Version:    0.6.2
 */