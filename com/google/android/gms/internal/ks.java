package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person.Organizations;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ks extends hy
  implements SafeParcelable, Person
{
  public static final kt CREATOR = new kt();
  private static final HashMap<String, hy.a<?, ?>> acr;
  private String Ar;
  private String Ln;
  private final Set<Integer> acs;
  private String adA;
  private int adB;
  private List<ks.f> adC;
  private List<ks.g> adD;
  private int adE;
  private int adF;
  private String adG;
  private List<ks.h> adH;
  private boolean adI;
  private String adq;
  private ks.a adr;
  private String ads;
  private String adt;
  private int adu;
  private ks.b adv;
  private String adw;
  private ks.c adx;
  private boolean ady;
  private ks.d adz;
  private int ml;
  private String qY;
  private String xG;
  private final int xM;

  static
  {
    HashMap localHashMap = new HashMap();
    acr = localHashMap;
    localHashMap.put("aboutMe", hy.a.j("aboutMe", 2));
    acr.put("ageRange", hy.a.a("ageRange", 3, ks.a.class));
    acr.put("birthday", hy.a.j("birthday", 4));
    acr.put("braggingRights", hy.a.j("braggingRights", 5));
    acr.put("circledByCount", hy.a.g("circledByCount", 6));
    acr.put("cover", hy.a.a("cover", 7, ks.b.class));
    acr.put("currentLocation", hy.a.j("currentLocation", 8));
    acr.put("displayName", hy.a.j("displayName", 9));
    acr.put("gender", hy.a.a("gender", 12, new hv().f("male", 0).f("female", 1).f("other", 2), false));
    acr.put("id", hy.a.j("id", 14));
    acr.put("image", hy.a.a("image", 15, ks.c.class));
    acr.put("isPlusUser", hy.a.i("isPlusUser", 16));
    acr.put("language", hy.a.j("language", 18));
    acr.put("name", hy.a.a("name", 19, ks.d.class));
    acr.put("nickname", hy.a.j("nickname", 20));
    acr.put("objectType", hy.a.a("objectType", 21, new hv().f("person", 0).f("page", 1), false));
    acr.put("organizations", hy.a.b("organizations", 22, ks.f.class));
    acr.put("placesLived", hy.a.b("placesLived", 23, ks.g.class));
    acr.put("plusOneCount", hy.a.g("plusOneCount", 24));
    acr.put("relationshipStatus", hy.a.a("relationshipStatus", 25, new hv().f("single", 0).f("in_a_relationship", 1).f("engaged", 2).f("married", 3).f("its_complicated", 4).f("open_relationship", 5).f("widowed", 6).f("in_domestic_partnership", 7).f("in_civil_union", 8), false));
    acr.put("tagline", hy.a.j("tagline", 26));
    acr.put("url", hy.a.j("url", 27));
    acr.put("urls", hy.a.b("urls", 28, ks.h.class));
    acr.put("verified", hy.a.i("verified", 29));
  }

  public ks()
  {
    this.xM = 2;
    this.acs = new HashSet();
  }

  public ks(String paramString1, String paramString2, ks.c paramc, int paramInt, String paramString3)
  {
    this.xM = 2;
    this.acs = new HashSet();
    this.Ln = paramString1;
    this.acs.add(Integer.valueOf(9));
    this.xG = paramString2;
    this.acs.add(Integer.valueOf(14));
    this.adx = paramc;
    this.acs.add(Integer.valueOf(15));
    this.adB = paramInt;
    this.acs.add(Integer.valueOf(21));
    this.qY = paramString3;
    this.acs.add(Integer.valueOf(27));
  }

  ks(Set<Integer> paramSet, int paramInt1, String paramString1, ks.a parama, String paramString2, String paramString3, int paramInt2, ks.b paramb, String paramString4, String paramString5, int paramInt3, String paramString6, ks.c paramc, boolean paramBoolean1, String paramString7, ks.d paramd, String paramString8, int paramInt4, List<ks.f> paramList, List<ks.g> paramList1, int paramInt5, int paramInt6, String paramString9, String paramString10, List<ks.h> paramList2, boolean paramBoolean2)
  {
    this.acs = paramSet;
    this.xM = paramInt1;
    this.adq = paramString1;
    this.adr = parama;
    this.ads = paramString2;
    this.adt = paramString3;
    this.adu = paramInt2;
    this.adv = paramb;
    this.adw = paramString4;
    this.Ln = paramString5;
    this.ml = paramInt3;
    this.xG = paramString6;
    this.adx = paramc;
    this.ady = paramBoolean1;
    this.Ar = paramString7;
    this.adz = paramd;
    this.adA = paramString8;
    this.adB = paramInt4;
    this.adC = paramList;
    this.adD = paramList1;
    this.adE = paramInt5;
    this.adF = paramInt6;
    this.adG = paramString9;
    this.qY = paramString10;
    this.adH = paramList2;
    this.adI = paramBoolean2;
  }

  public static ks i(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    ks localks = CREATOR.bG(localParcel);
    localParcel.recycle();
    return localks;
  }

  protected final boolean a(hy.a parama)
  {
    return this.acs.contains(Integer.valueOf(parama.fN()));
  }

  protected final Object aF(String paramString)
  {
    return null;
  }

  protected final boolean aG(String paramString)
  {
    return false;
  }

  protected final Object b(hy.a parama)
  {
    switch (parama.fN())
    {
    case 10:
    case 11:
    case 13:
    case 17:
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.fN());
    case 2:
      return this.adq;
    case 3:
      return this.adr;
    case 4:
      return this.ads;
    case 5:
      return this.adt;
    case 6:
      return Integer.valueOf(this.adu);
    case 7:
      return this.adv;
    case 8:
      return this.adw;
    case 9:
      return this.Ln;
    case 12:
      return Integer.valueOf(this.ml);
    case 14:
      return this.xG;
    case 15:
      return this.adx;
    case 16:
      return Boolean.valueOf(this.ady);
    case 18:
      return this.Ar;
    case 19:
      return this.adz;
    case 20:
      return this.adA;
    case 21:
      return Integer.valueOf(this.adB);
    case 22:
      return this.adC;
    case 23:
      return this.adD;
    case 24:
      return Integer.valueOf(this.adE);
    case 25:
      return Integer.valueOf(this.adF);
    case 26:
      return this.adG;
    case 27:
      return this.qY;
    case 28:
      return this.adH;
    case 29:
    }
    return Boolean.valueOf(this.adI);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ks))
      return false;
    if (this == paramObject)
      return true;
    ks localks = (ks)paramObject;
    Iterator localIterator = acr.values().iterator();
    while (localIterator.hasNext())
    {
      hy.a locala = (hy.a)localIterator.next();
      if (a(locala))
      {
        if (localks.a(locala))
        {
          if (!b(locala).equals(localks.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localks.a(locala))
        return false;
    }
    return true;
  }

  public final HashMap<String, hy.a<?, ?>> fG()
  {
    return acr;
  }

  public final String getAboutMe()
  {
    return this.adq;
  }

  public final Person.AgeRange getAgeRange()
  {
    return this.adr;
  }

  public final String getBirthday()
  {
    return this.ads;
  }

  public final String getBraggingRights()
  {
    return this.adt;
  }

  public final int getCircledByCount()
  {
    return this.adu;
  }

  public final Person.Cover getCover()
  {
    return this.adv;
  }

  public final String getCurrentLocation()
  {
    return this.adw;
  }

  public final String getDisplayName()
  {
    return this.Ln;
  }

  public final int getGender()
  {
    return this.ml;
  }

  public final String getId()
  {
    return this.xG;
  }

  public final Person.Image getImage()
  {
    return this.adx;
  }

  public final String getLanguage()
  {
    return this.Ar;
  }

  public final Person.Name getName()
  {
    return this.adz;
  }

  public final String getNickname()
  {
    return this.adA;
  }

  public final int getObjectType()
  {
    return this.adB;
  }

  public final List<Person.Organizations> getOrganizations()
  {
    return (ArrayList)this.adC;
  }

  public final List<Person.PlacesLived> getPlacesLived()
  {
    return (ArrayList)this.adD;
  }

  public final int getPlusOneCount()
  {
    return this.adE;
  }

  public final int getRelationshipStatus()
  {
    return this.adF;
  }

  public final String getTagline()
  {
    return this.adG;
  }

  public final String getUrl()
  {
    return this.qY;
  }

  public final List<Person.Urls> getUrls()
  {
    return (ArrayList)this.adH;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean hasAboutMe()
  {
    return this.acs.contains(Integer.valueOf(2));
  }

  public final boolean hasAgeRange()
  {
    return this.acs.contains(Integer.valueOf(3));
  }

  public final boolean hasBirthday()
  {
    return this.acs.contains(Integer.valueOf(4));
  }

  public final boolean hasBraggingRights()
  {
    return this.acs.contains(Integer.valueOf(5));
  }

  public final boolean hasCircledByCount()
  {
    return this.acs.contains(Integer.valueOf(6));
  }

  public final boolean hasCover()
  {
    return this.acs.contains(Integer.valueOf(7));
  }

  public final boolean hasCurrentLocation()
  {
    return this.acs.contains(Integer.valueOf(8));
  }

  public final boolean hasDisplayName()
  {
    return this.acs.contains(Integer.valueOf(9));
  }

  public final boolean hasGender()
  {
    return this.acs.contains(Integer.valueOf(12));
  }

  public final boolean hasId()
  {
    return this.acs.contains(Integer.valueOf(14));
  }

  public final boolean hasImage()
  {
    return this.acs.contains(Integer.valueOf(15));
  }

  public final boolean hasIsPlusUser()
  {
    return this.acs.contains(Integer.valueOf(16));
  }

  public final boolean hasLanguage()
  {
    return this.acs.contains(Integer.valueOf(18));
  }

  public final boolean hasName()
  {
    return this.acs.contains(Integer.valueOf(19));
  }

  public final boolean hasNickname()
  {
    return this.acs.contains(Integer.valueOf(20));
  }

  public final boolean hasObjectType()
  {
    return this.acs.contains(Integer.valueOf(21));
  }

  public final boolean hasOrganizations()
  {
    return this.acs.contains(Integer.valueOf(22));
  }

  public final boolean hasPlacesLived()
  {
    return this.acs.contains(Integer.valueOf(23));
  }

  public final boolean hasPlusOneCount()
  {
    return this.acs.contains(Integer.valueOf(24));
  }

  public final boolean hasRelationshipStatus()
  {
    return this.acs.contains(Integer.valueOf(25));
  }

  public final boolean hasTagline()
  {
    return this.acs.contains(Integer.valueOf(26));
  }

  public final boolean hasUrl()
  {
    return this.acs.contains(Integer.valueOf(27));
  }

  public final boolean hasUrls()
  {
    return this.acs.contains(Integer.valueOf(28));
  }

  public final boolean hasVerified()
  {
    return this.acs.contains(Integer.valueOf(29));
  }

  public final int hashCode()
  {
    Iterator localIterator = acr.values().iterator();
    int i = 0;
    hy.a locala;
    if (localIterator.hasNext())
    {
      locala = (hy.a)localIterator.next();
      if (!a(locala))
        break label66;
    }
    label66: for (int j = i + locala.fN() + b(locala).hashCode(); ; j = i)
    {
      i = j;
      break;
      return i;
    }
  }

  public final boolean isDataValid()
  {
    return true;
  }

  public final boolean isPlusUser()
  {
    return this.ady;
  }

  public final boolean isVerified()
  {
    return this.adI;
  }

  final ks.a kF()
  {
    return this.adr;
  }

  final ks.b kG()
  {
    return this.adv;
  }

  final ks.c kH()
  {
    return this.adx;
  }

  final ks.d kI()
  {
    return this.adz;
  }

  final List<ks.f> kJ()
  {
    return this.adC;
  }

  final List<ks.g> kK()
  {
    return this.adD;
  }

  final List<ks.h> kL()
  {
    return this.adH;
  }

  public final ks kM()
  {
    return this;
  }

  final Set<Integer> kk()
  {
    return this.acs;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kt.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ks
 * JD-Core Version:    0.6.2
 */