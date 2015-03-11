package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class kn extends hy
  implements SafeParcelable, ItemScope
{
  public static final ko CREATOR = new ko();
  private static final HashMap<String, hy.a<?, ?>> acr;
  private String Mp;
  private double Vd;
  private double Ve;
  private int acA;
  private List<kn> acB;
  private kn acC;
  private List<kn> acD;
  private String acE;
  private String acF;
  private kn acG;
  private String acH;
  private String acI;
  private List<kn> acJ;
  private String acK;
  private String acL;
  private String acM;
  private String acN;
  private String acO;
  private String acP;
  private String acQ;
  private String acR;
  private kn acS;
  private String acT;
  private String acU;
  private String acV;
  private kn acW;
  private kn acX;
  private kn acY;
  private List<kn> acZ;
  private final Set<Integer> acs;
  private kn act;
  private List<String> acu;
  private kn acv;
  private String acw;
  private String acx;
  private String acy;
  private List<kn> acz;
  private String ada;
  private String adb;
  private String adc;
  private String add;
  private kn ade;
  private String adf;
  private String adg;
  private String adh;
  private kn adi;
  private String adj;
  private String adk;
  private String adl;
  private String adm;
  private String mName;
  private String mk;
  private String qX;
  private String qY;
  private String xG;
  private final int xM;

  static
  {
    HashMap localHashMap = new HashMap();
    acr = localHashMap;
    localHashMap.put("about", hy.a.a("about", 2, kn.class));
    acr.put("additionalName", hy.a.k("additionalName", 3));
    acr.put("address", hy.a.a("address", 4, kn.class));
    acr.put("addressCountry", hy.a.j("addressCountry", 5));
    acr.put("addressLocality", hy.a.j("addressLocality", 6));
    acr.put("addressRegion", hy.a.j("addressRegion", 7));
    acr.put("associated_media", hy.a.b("associated_media", 8, kn.class));
    acr.put("attendeeCount", hy.a.g("attendeeCount", 9));
    acr.put("attendees", hy.a.b("attendees", 10, kn.class));
    acr.put("audio", hy.a.a("audio", 11, kn.class));
    acr.put("author", hy.a.b("author", 12, kn.class));
    acr.put("bestRating", hy.a.j("bestRating", 13));
    acr.put("birthDate", hy.a.j("birthDate", 14));
    acr.put("byArtist", hy.a.a("byArtist", 15, kn.class));
    acr.put("caption", hy.a.j("caption", 16));
    acr.put("contentSize", hy.a.j("contentSize", 17));
    acr.put("contentUrl", hy.a.j("contentUrl", 18));
    acr.put("contributor", hy.a.b("contributor", 19, kn.class));
    acr.put("dateCreated", hy.a.j("dateCreated", 20));
    acr.put("dateModified", hy.a.j("dateModified", 21));
    acr.put("datePublished", hy.a.j("datePublished", 22));
    acr.put("description", hy.a.j("description", 23));
    acr.put("duration", hy.a.j("duration", 24));
    acr.put("embedUrl", hy.a.j("embedUrl", 25));
    acr.put("endDate", hy.a.j("endDate", 26));
    acr.put("familyName", hy.a.j("familyName", 27));
    acr.put("gender", hy.a.j("gender", 28));
    acr.put("geo", hy.a.a("geo", 29, kn.class));
    acr.put("givenName", hy.a.j("givenName", 30));
    acr.put("height", hy.a.j("height", 31));
    acr.put("id", hy.a.j("id", 32));
    acr.put("image", hy.a.j("image", 33));
    acr.put("inAlbum", hy.a.a("inAlbum", 34, kn.class));
    acr.put("latitude", hy.a.h("latitude", 36));
    acr.put("location", hy.a.a("location", 37, kn.class));
    acr.put("longitude", hy.a.h("longitude", 38));
    acr.put("name", hy.a.j("name", 39));
    acr.put("partOfTVSeries", hy.a.a("partOfTVSeries", 40, kn.class));
    acr.put("performers", hy.a.b("performers", 41, kn.class));
    acr.put("playerType", hy.a.j("playerType", 42));
    acr.put("postOfficeBoxNumber", hy.a.j("postOfficeBoxNumber", 43));
    acr.put("postalCode", hy.a.j("postalCode", 44));
    acr.put("ratingValue", hy.a.j("ratingValue", 45));
    acr.put("reviewRating", hy.a.a("reviewRating", 46, kn.class));
    acr.put("startDate", hy.a.j("startDate", 47));
    acr.put("streetAddress", hy.a.j("streetAddress", 48));
    acr.put("text", hy.a.j("text", 49));
    acr.put("thumbnail", hy.a.a("thumbnail", 50, kn.class));
    acr.put("thumbnailUrl", hy.a.j("thumbnailUrl", 51));
    acr.put("tickerSymbol", hy.a.j("tickerSymbol", 52));
    acr.put("type", hy.a.j("type", 53));
    acr.put("url", hy.a.j("url", 54));
    acr.put("width", hy.a.j("width", 55));
    acr.put("worstRating", hy.a.j("worstRating", 56));
  }

  public kn()
  {
    this.xM = 1;
    this.acs = new HashSet();
  }

  kn(Set<Integer> paramSet, int paramInt1, kn paramkn1, List<String> paramList, kn paramkn2, String paramString1, String paramString2, String paramString3, List<kn> paramList1, int paramInt2, List<kn> paramList2, kn paramkn3, List<kn> paramList3, String paramString4, String paramString5, kn paramkn4, String paramString6, String paramString7, String paramString8, List<kn> paramList4, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, kn paramkn5, String paramString18, String paramString19, String paramString20, String paramString21, kn paramkn6, double paramDouble1, kn paramkn7, double paramDouble2, String paramString22, kn paramkn8, List<kn> paramList5, String paramString23, String paramString24, String paramString25, String paramString26, kn paramkn9, String paramString27, String paramString28, String paramString29, kn paramkn10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    this.acs = paramSet;
    this.xM = paramInt1;
    this.act = paramkn1;
    this.acu = paramList;
    this.acv = paramkn2;
    this.acw = paramString1;
    this.acx = paramString2;
    this.acy = paramString3;
    this.acz = paramList1;
    this.acA = paramInt2;
    this.acB = paramList2;
    this.acC = paramkn3;
    this.acD = paramList3;
    this.acE = paramString4;
    this.acF = paramString5;
    this.acG = paramkn4;
    this.acH = paramString6;
    this.acI = paramString7;
    this.mk = paramString8;
    this.acJ = paramList4;
    this.acK = paramString9;
    this.acL = paramString10;
    this.acM = paramString11;
    this.Mp = paramString12;
    this.acN = paramString13;
    this.acO = paramString14;
    this.acP = paramString15;
    this.acQ = paramString16;
    this.acR = paramString17;
    this.acS = paramkn5;
    this.acT = paramString18;
    this.acU = paramString19;
    this.xG = paramString20;
    this.acV = paramString21;
    this.acW = paramkn6;
    this.Vd = paramDouble1;
    this.acX = paramkn7;
    this.Ve = paramDouble2;
    this.mName = paramString22;
    this.acY = paramkn8;
    this.acZ = paramList5;
    this.ada = paramString23;
    this.adb = paramString24;
    this.adc = paramString25;
    this.add = paramString26;
    this.ade = paramkn9;
    this.adf = paramString27;
    this.adg = paramString28;
    this.adh = paramString29;
    this.adi = paramkn10;
    this.adj = paramString30;
    this.adk = paramString31;
    this.qX = paramString32;
    this.qY = paramString33;
    this.adl = paramString34;
    this.adm = paramString35;
  }

  public kn(Set<Integer> paramSet, kn paramkn1, List<String> paramList, kn paramkn2, String paramString1, String paramString2, String paramString3, List<kn> paramList1, int paramInt, List<kn> paramList2, kn paramkn3, List<kn> paramList3, String paramString4, String paramString5, kn paramkn4, String paramString6, String paramString7, String paramString8, List<kn> paramList4, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, kn paramkn5, String paramString18, String paramString19, String paramString20, String paramString21, kn paramkn6, double paramDouble1, kn paramkn7, double paramDouble2, String paramString22, kn paramkn8, List<kn> paramList5, String paramString23, String paramString24, String paramString25, String paramString26, kn paramkn9, String paramString27, String paramString28, String paramString29, kn paramkn10, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35)
  {
    this.acs = paramSet;
    this.xM = 1;
    this.act = paramkn1;
    this.acu = paramList;
    this.acv = paramkn2;
    this.acw = paramString1;
    this.acx = paramString2;
    this.acy = paramString3;
    this.acz = paramList1;
    this.acA = paramInt;
    this.acB = paramList2;
    this.acC = paramkn3;
    this.acD = paramList3;
    this.acE = paramString4;
    this.acF = paramString5;
    this.acG = paramkn4;
    this.acH = paramString6;
    this.acI = paramString7;
    this.mk = paramString8;
    this.acJ = paramList4;
    this.acK = paramString9;
    this.acL = paramString10;
    this.acM = paramString11;
    this.Mp = paramString12;
    this.acN = paramString13;
    this.acO = paramString14;
    this.acP = paramString15;
    this.acQ = paramString16;
    this.acR = paramString17;
    this.acS = paramkn5;
    this.acT = paramString18;
    this.acU = paramString19;
    this.xG = paramString20;
    this.acV = paramString21;
    this.acW = paramkn6;
    this.Vd = paramDouble1;
    this.acX = paramkn7;
    this.Ve = paramDouble2;
    this.mName = paramString22;
    this.acY = paramkn8;
    this.acZ = paramList5;
    this.ada = paramString23;
    this.adb = paramString24;
    this.adc = paramString25;
    this.add = paramString26;
    this.ade = paramkn9;
    this.adf = paramString27;
    this.adg = paramString28;
    this.adh = paramString29;
    this.adi = paramkn10;
    this.adj = paramString30;
    this.adk = paramString31;
    this.qX = paramString32;
    this.qY = paramString33;
    this.adl = paramString34;
    this.adm = paramString35;
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
    case 35:
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.fN());
    case 2:
      return this.act;
    case 3:
      return this.acu;
    case 4:
      return this.acv;
    case 5:
      return this.acw;
    case 6:
      return this.acx;
    case 7:
      return this.acy;
    case 8:
      return this.acz;
    case 9:
      return Integer.valueOf(this.acA);
    case 10:
      return this.acB;
    case 11:
      return this.acC;
    case 12:
      return this.acD;
    case 13:
      return this.acE;
    case 14:
      return this.acF;
    case 15:
      return this.acG;
    case 16:
      return this.acH;
    case 17:
      return this.acI;
    case 18:
      return this.mk;
    case 19:
      return this.acJ;
    case 20:
      return this.acK;
    case 21:
      return this.acL;
    case 22:
      return this.acM;
    case 23:
      return this.Mp;
    case 24:
      return this.acN;
    case 25:
      return this.acO;
    case 26:
      return this.acP;
    case 27:
      return this.acQ;
    case 28:
      return this.acR;
    case 29:
      return this.acS;
    case 30:
      return this.acT;
    case 31:
      return this.acU;
    case 32:
      return this.xG;
    case 33:
      return this.acV;
    case 34:
      return this.acW;
    case 36:
      return Double.valueOf(this.Vd);
    case 37:
      return this.acX;
    case 38:
      return Double.valueOf(this.Ve);
    case 39:
      return this.mName;
    case 40:
      return this.acY;
    case 41:
      return this.acZ;
    case 42:
      return this.ada;
    case 43:
      return this.adb;
    case 44:
      return this.adc;
    case 45:
      return this.add;
    case 46:
      return this.ade;
    case 47:
      return this.adf;
    case 48:
      return this.adg;
    case 49:
      return this.adh;
    case 50:
      return this.adi;
    case 51:
      return this.adj;
    case 52:
      return this.adk;
    case 53:
      return this.qX;
    case 54:
      return this.qY;
    case 55:
      return this.adl;
    case 56:
    }
    return this.adm;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof kn))
      return false;
    if (this == paramObject)
      return true;
    kn localkn = (kn)paramObject;
    Iterator localIterator = acr.values().iterator();
    while (localIterator.hasNext())
    {
      hy.a locala = (hy.a)localIterator.next();
      if (a(locala))
      {
        if (localkn.a(locala))
        {
          if (!b(locala).equals(localkn.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localkn.a(locala))
        return false;
    }
    return true;
  }

  public final HashMap<String, hy.a<?, ?>> fG()
  {
    return acr;
  }

  public final ItemScope getAbout()
  {
    return this.act;
  }

  public final List<String> getAdditionalName()
  {
    return this.acu;
  }

  public final ItemScope getAddress()
  {
    return this.acv;
  }

  public final String getAddressCountry()
  {
    return this.acw;
  }

  public final String getAddressLocality()
  {
    return this.acx;
  }

  public final String getAddressRegion()
  {
    return this.acy;
  }

  public final List<ItemScope> getAssociated_media()
  {
    return (ArrayList)this.acz;
  }

  public final int getAttendeeCount()
  {
    return this.acA;
  }

  public final List<ItemScope> getAttendees()
  {
    return (ArrayList)this.acB;
  }

  public final ItemScope getAudio()
  {
    return this.acC;
  }

  public final List<ItemScope> getAuthor()
  {
    return (ArrayList)this.acD;
  }

  public final String getBestRating()
  {
    return this.acE;
  }

  public final String getBirthDate()
  {
    return this.acF;
  }

  public final ItemScope getByArtist()
  {
    return this.acG;
  }

  public final String getCaption()
  {
    return this.acH;
  }

  public final String getContentSize()
  {
    return this.acI;
  }

  public final String getContentUrl()
  {
    return this.mk;
  }

  public final List<ItemScope> getContributor()
  {
    return (ArrayList)this.acJ;
  }

  public final String getDateCreated()
  {
    return this.acK;
  }

  public final String getDateModified()
  {
    return this.acL;
  }

  public final String getDatePublished()
  {
    return this.acM;
  }

  public final String getDescription()
  {
    return this.Mp;
  }

  public final String getDuration()
  {
    return this.acN;
  }

  public final String getEmbedUrl()
  {
    return this.acO;
  }

  public final String getEndDate()
  {
    return this.acP;
  }

  public final String getFamilyName()
  {
    return this.acQ;
  }

  public final String getGender()
  {
    return this.acR;
  }

  public final ItemScope getGeo()
  {
    return this.acS;
  }

  public final String getGivenName()
  {
    return this.acT;
  }

  public final String getHeight()
  {
    return this.acU;
  }

  public final String getId()
  {
    return this.xG;
  }

  public final String getImage()
  {
    return this.acV;
  }

  public final ItemScope getInAlbum()
  {
    return this.acW;
  }

  public final double getLatitude()
  {
    return this.Vd;
  }

  public final ItemScope getLocation()
  {
    return this.acX;
  }

  public final double getLongitude()
  {
    return this.Ve;
  }

  public final String getName()
  {
    return this.mName;
  }

  public final ItemScope getPartOfTVSeries()
  {
    return this.acY;
  }

  public final List<ItemScope> getPerformers()
  {
    return (ArrayList)this.acZ;
  }

  public final String getPlayerType()
  {
    return this.ada;
  }

  public final String getPostOfficeBoxNumber()
  {
    return this.adb;
  }

  public final String getPostalCode()
  {
    return this.adc;
  }

  public final String getRatingValue()
  {
    return this.add;
  }

  public final ItemScope getReviewRating()
  {
    return this.ade;
  }

  public final String getStartDate()
  {
    return this.adf;
  }

  public final String getStreetAddress()
  {
    return this.adg;
  }

  public final String getText()
  {
    return this.adh;
  }

  public final ItemScope getThumbnail()
  {
    return this.adi;
  }

  public final String getThumbnailUrl()
  {
    return this.adj;
  }

  public final String getTickerSymbol()
  {
    return this.adk;
  }

  public final String getType()
  {
    return this.qX;
  }

  public final String getUrl()
  {
    return this.qY;
  }

  final int getVersionCode()
  {
    return this.xM;
  }

  public final String getWidth()
  {
    return this.adl;
  }

  public final String getWorstRating()
  {
    return this.adm;
  }

  public final boolean hasAbout()
  {
    return this.acs.contains(Integer.valueOf(2));
  }

  public final boolean hasAdditionalName()
  {
    return this.acs.contains(Integer.valueOf(3));
  }

  public final boolean hasAddress()
  {
    return this.acs.contains(Integer.valueOf(4));
  }

  public final boolean hasAddressCountry()
  {
    return this.acs.contains(Integer.valueOf(5));
  }

  public final boolean hasAddressLocality()
  {
    return this.acs.contains(Integer.valueOf(6));
  }

  public final boolean hasAddressRegion()
  {
    return this.acs.contains(Integer.valueOf(7));
  }

  public final boolean hasAssociated_media()
  {
    return this.acs.contains(Integer.valueOf(8));
  }

  public final boolean hasAttendeeCount()
  {
    return this.acs.contains(Integer.valueOf(9));
  }

  public final boolean hasAttendees()
  {
    return this.acs.contains(Integer.valueOf(10));
  }

  public final boolean hasAudio()
  {
    return this.acs.contains(Integer.valueOf(11));
  }

  public final boolean hasAuthor()
  {
    return this.acs.contains(Integer.valueOf(12));
  }

  public final boolean hasBestRating()
  {
    return this.acs.contains(Integer.valueOf(13));
  }

  public final boolean hasBirthDate()
  {
    return this.acs.contains(Integer.valueOf(14));
  }

  public final boolean hasByArtist()
  {
    return this.acs.contains(Integer.valueOf(15));
  }

  public final boolean hasCaption()
  {
    return this.acs.contains(Integer.valueOf(16));
  }

  public final boolean hasContentSize()
  {
    return this.acs.contains(Integer.valueOf(17));
  }

  public final boolean hasContentUrl()
  {
    return this.acs.contains(Integer.valueOf(18));
  }

  public final boolean hasContributor()
  {
    return this.acs.contains(Integer.valueOf(19));
  }

  public final boolean hasDateCreated()
  {
    return this.acs.contains(Integer.valueOf(20));
  }

  public final boolean hasDateModified()
  {
    return this.acs.contains(Integer.valueOf(21));
  }

  public final boolean hasDatePublished()
  {
    return this.acs.contains(Integer.valueOf(22));
  }

  public final boolean hasDescription()
  {
    return this.acs.contains(Integer.valueOf(23));
  }

  public final boolean hasDuration()
  {
    return this.acs.contains(Integer.valueOf(24));
  }

  public final boolean hasEmbedUrl()
  {
    return this.acs.contains(Integer.valueOf(25));
  }

  public final boolean hasEndDate()
  {
    return this.acs.contains(Integer.valueOf(26));
  }

  public final boolean hasFamilyName()
  {
    return this.acs.contains(Integer.valueOf(27));
  }

  public final boolean hasGender()
  {
    return this.acs.contains(Integer.valueOf(28));
  }

  public final boolean hasGeo()
  {
    return this.acs.contains(Integer.valueOf(29));
  }

  public final boolean hasGivenName()
  {
    return this.acs.contains(Integer.valueOf(30));
  }

  public final boolean hasHeight()
  {
    return this.acs.contains(Integer.valueOf(31));
  }

  public final boolean hasId()
  {
    return this.acs.contains(Integer.valueOf(32));
  }

  public final boolean hasImage()
  {
    return this.acs.contains(Integer.valueOf(33));
  }

  public final boolean hasInAlbum()
  {
    return this.acs.contains(Integer.valueOf(34));
  }

  public final boolean hasLatitude()
  {
    return this.acs.contains(Integer.valueOf(36));
  }

  public final boolean hasLocation()
  {
    return this.acs.contains(Integer.valueOf(37));
  }

  public final boolean hasLongitude()
  {
    return this.acs.contains(Integer.valueOf(38));
  }

  public final boolean hasName()
  {
    return this.acs.contains(Integer.valueOf(39));
  }

  public final boolean hasPartOfTVSeries()
  {
    return this.acs.contains(Integer.valueOf(40));
  }

  public final boolean hasPerformers()
  {
    return this.acs.contains(Integer.valueOf(41));
  }

  public final boolean hasPlayerType()
  {
    return this.acs.contains(Integer.valueOf(42));
  }

  public final boolean hasPostOfficeBoxNumber()
  {
    return this.acs.contains(Integer.valueOf(43));
  }

  public final boolean hasPostalCode()
  {
    return this.acs.contains(Integer.valueOf(44));
  }

  public final boolean hasRatingValue()
  {
    return this.acs.contains(Integer.valueOf(45));
  }

  public final boolean hasReviewRating()
  {
    return this.acs.contains(Integer.valueOf(46));
  }

  public final boolean hasStartDate()
  {
    return this.acs.contains(Integer.valueOf(47));
  }

  public final boolean hasStreetAddress()
  {
    return this.acs.contains(Integer.valueOf(48));
  }

  public final boolean hasText()
  {
    return this.acs.contains(Integer.valueOf(49));
  }

  public final boolean hasThumbnail()
  {
    return this.acs.contains(Integer.valueOf(50));
  }

  public final boolean hasThumbnailUrl()
  {
    return this.acs.contains(Integer.valueOf(51));
  }

  public final boolean hasTickerSymbol()
  {
    return this.acs.contains(Integer.valueOf(52));
  }

  public final boolean hasType()
  {
    return this.acs.contains(Integer.valueOf(53));
  }

  public final boolean hasUrl()
  {
    return this.acs.contains(Integer.valueOf(54));
  }

  public final boolean hasWidth()
  {
    return this.acs.contains(Integer.valueOf(55));
  }

  public final boolean hasWorstRating()
  {
    return this.acs.contains(Integer.valueOf(56));
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

  public final kn kA()
  {
    return this;
  }

  final Set<Integer> kk()
  {
    return this.acs;
  }

  final kn kl()
  {
    return this.act;
  }

  final kn km()
  {
    return this.acv;
  }

  final List<kn> kn()
  {
    return this.acz;
  }

  final List<kn> ko()
  {
    return this.acB;
  }

  final kn kp()
  {
    return this.acC;
  }

  final List<kn> kq()
  {
    return this.acD;
  }

  final kn kr()
  {
    return this.acG;
  }

  final List<kn> ks()
  {
    return this.acJ;
  }

  final kn kt()
  {
    return this.acS;
  }

  final kn ku()
  {
    return this.acW;
  }

  final kn kv()
  {
    return this.acX;
  }

  final kn kw()
  {
    return this.acY;
  }

  final List<kn> kx()
  {
    return this.acZ;
  }

  final kn ky()
  {
    return this.ade;
  }

  final kn kz()
  {
    return this.adi;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ko.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kn
 * JD-Core Version:    0.6.2
 */