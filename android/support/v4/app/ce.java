package android.support.v4.app;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;

final class ce
  implements cb
{
  public final Bundle a(Intent paramIntent)
  {
    ClipData localClipData = paramIntent.getClipData();
    if (localClipData != null)
    {
      ClipDescription localClipDescription = localClipData.getDescription();
      if ((localClipDescription.hasMimeType("text/vnd.android.intent")) && (localClipDescription.getLabel().equals("android.remoteinput.results")))
        return (Bundle)localClipData.getItemAt(0).getIntent().getExtras().getParcelable("android.remoteinput.resultsData");
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ce
 * JD-Core Version:    0.6.2
 */