package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class ak
{
  public static final ak md = new ak();

  public static ak aF()
  {
    return md;
  }

  public ai a(Context paramContext, at paramat)
  {
    Date localDate = paramat.getBirthday();
    long l;
    String str1;
    int i;
    List localList;
    label57: boolean bool1;
    int j;
    Location localLocation;
    Bundle localBundle;
    boolean bool2;
    String str2;
    SearchAdRequest localSearchAdRequest;
    if (localDate != null)
    {
      l = localDate.getTime();
      str1 = paramat.getContentUrl();
      i = paramat.getGender();
      Set localSet = paramat.getKeywords();
      if (localSet.isEmpty())
        break label161;
      localList = Collections.unmodifiableList(new ArrayList(localSet));
      bool1 = paramat.isTestDevice(paramContext);
      j = paramat.aK();
      localLocation = paramat.getLocation();
      localBundle = paramat.getNetworkExtrasBundle(AdMobAdapter.class);
      bool2 = paramat.getManualImpressionsEnabled();
      str2 = paramat.getPublisherProvidedId();
      localSearchAdRequest = paramat.aH();
      if (localSearchAdRequest == null)
        break label167;
    }
    label161: label167: for (aw localaw = new aw(localSearchAdRequest); ; localaw = null)
    {
      return new ai(4, l, localBundle, i, localList, bool1, j, bool2, str2, localaw, localLocation, str1, paramat.aJ());
      l = -1L;
      break;
      localList = null;
      break label57;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ak
 * JD-Core Version:    0.6.2
 */