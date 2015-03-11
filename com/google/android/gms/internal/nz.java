package com.google.android.gms.internal;

import android.os.Parcel;
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

public final class nz extends jj
  implements Person
{
  public static final oa CREATOR = new oa();
  private static final HashMap<String, ji.a<?, ?>> amb;
  String BL;
  final int BR;
  String Fc;
  String NH;
  final Set<Integer> amc;
  String ana;
  nz.a anb;
  String anc;
  String and;
  int ane;
  nz.b anf;
  String ang;
  nz.c anh;
  boolean ani;
  nz.d anj;
  String ank;
  int anl;
  List<nz.f> anm;
  List<nz.g> ann;
  int ano;
  int anp;
  String anq;
  List<nz.h> anr;
  boolean ans;
  int om;
  String uR;

  static
  {
    HashMap localHashMap = new HashMap();
    amb = localHashMap;
    localHashMap.put("aboutMe", ji.a.l("aboutMe", 2));
    amb.put("ageRange", ji.a.a("ageRange", 3, nz.a.class));
    amb.put("birthday", ji.a.l("birthday", 4));
    amb.put("braggingRights", ji.a.l("braggingRights", 5));
    amb.put("circledByCount", ji.a.i("circledByCount", 6));
    amb.put("cover", ji.a.a("cover", 7, nz.b.class));
    amb.put("currentLocation", ji.a.l("currentLocation", 8));
    amb.put("displayName", ji.a.l("displayName", 9));
    amb.put("gender", ji.a.a("gender", 12, new jf().h("male", 0).h("female", 1).h("other", 2), false));
    amb.put("id", ji.a.l("id", 14));
    amb.put("image", ji.a.a("image", 15, nz.c.class));
    amb.put("isPlusUser", ji.a.k("isPlusUser", 16));
    amb.put("language", ji.a.l("language", 18));
    amb.put("name", ji.a.a("name", 19, nz.d.class));
    amb.put("nickname", ji.a.l("nickname", 20));
    amb.put("objectType", ji.a.a("objectType", 21, new jf().h("person", 0).h("page", 1), false));
    amb.put("organizations", ji.a.b("organizations", 22, nz.f.class));
    amb.put("placesLived", ji.a.b("placesLived", 23, nz.g.class));
    amb.put("plusOneCount", ji.a.i("plusOneCount", 24));
    amb.put("relationshipStatus", ji.a.a("relationshipStatus", 25, new jf().h("single", 0).h("in_a_relationship", 1).h("engaged", 2).h("married", 3).h("its_complicated", 4).h("open_relationship", 5).h("widowed", 6).h("in_domestic_partnership", 7).h("in_civil_union", 8), false));
    amb.put("tagline", ji.a.l("tagline", 26));
    amb.put("url", ji.a.l("url", 27));
    amb.put("urls", ji.a.b("urls", 28, nz.h.class));
    amb.put("verified", ji.a.k("verified", 29));
  }

  public nz()
  {
    this.BR = 1;
    this.amc = new HashSet();
  }

  public nz(String paramString1, String paramString2, nz.c paramc, int paramInt, String paramString3)
  {
    this.BR = 1;
    this.amc = new HashSet();
    this.NH = paramString1;
    this.amc.add(Integer.valueOf(9));
    this.BL = paramString2;
    this.amc.add(Integer.valueOf(14));
    this.anh = paramc;
    this.amc.add(Integer.valueOf(15));
    this.anl = paramInt;
    this.amc.add(Integer.valueOf(21));
    this.uR = paramString3;
    this.amc.add(Integer.valueOf(27));
  }

  nz(Set<Integer> paramSet, int paramInt1, String paramString1, nz.a parama, String paramString2, String paramString3, int paramInt2, nz.b paramb, String paramString4, String paramString5, int paramInt3, String paramString6, nz.c paramc, boolean paramBoolean1, String paramString7, nz.d paramd, String paramString8, int paramInt4, List<nz.f> paramList, List<nz.g> paramList1, int paramInt5, int paramInt6, String paramString9, String paramString10, List<nz.h> paramList2, boolean paramBoolean2)
  {
    this.amc = paramSet;
    this.BR = paramInt1;
    this.ana = paramString1;
    this.anb = parama;
    this.anc = paramString2;
    this.and = paramString3;
    this.ane = paramInt2;
    this.anf = paramb;
    this.ang = paramString4;
    this.NH = paramString5;
    this.om = paramInt3;
    this.BL = paramString6;
    this.anh = paramc;
    this.ani = paramBoolean1;
    this.Fc = paramString7;
    this.anj = paramd;
    this.ank = paramString8;
    this.anl = paramInt4;
    this.anm = paramList;
    this.ann = paramList1;
    this.ano = paramInt5;
    this.anp = paramInt6;
    this.anq = paramString9;
    this.uR = paramString10;
    this.anr = paramList2;
    this.ans = paramBoolean2;
  }

  public static nz i(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.unmarshall(paramArrayOfByte, 0, paramArrayOfByte.length);
    localParcel.setDataPosition(0);
    nz localnz = CREATOR.dd(localParcel);
    localParcel.recycle();
    return localnz;
  }

  protected final boolean a(ji.a parama)
  {
    return this.amc.contains(Integer.valueOf(parama.hm()));
  }

  protected final Object b(ji.a parama)
  {
    switch (parama.hm())
    {
    case 10:
    case 11:
    case 13:
    case 17:
    default:
      throw new IllegalStateException("Unknown safe parcelable id=" + parama.hm());
    case 2:
      return this.ana;
    case 3:
      return this.anb;
    case 4:
      return this.anc;
    case 5:
      return this.and;
    case 6:
      return Integer.valueOf(this.ane);
    case 7:
      return this.anf;
    case 8:
      return this.ang;
    case 9:
      return this.NH;
    case 12:
      return Integer.valueOf(this.om);
    case 14:
      return this.BL;
    case 15:
      return this.anh;
    case 16:
      return Boolean.valueOf(this.ani);
    case 18:
      return this.Fc;
    case 19:
      return this.anj;
    case 20:
      return this.ank;
    case 21:
      return Integer.valueOf(this.anl);
    case 22:
      return this.anm;
    case 23:
      return this.ann;
    case 24:
      return Integer.valueOf(this.ano);
    case 25:
      return Integer.valueOf(this.anp);
    case 26:
      return this.anq;
    case 27:
      return this.uR;
    case 28:
      return this.anr;
    case 29:
    }
    return Boolean.valueOf(this.ans);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof nz))
      return false;
    if (this == paramObject)
      return true;
    nz localnz = (nz)paramObject;
    Iterator localIterator = amb.values().iterator();
    while (localIterator.hasNext())
    {
      ji.a locala = (ji.a)localIterator.next();
      if (a(locala))
      {
        if (localnz.a(locala))
        {
          if (!b(locala).equals(localnz.b(locala)))
            return false;
        }
        else
          return false;
      }
      else if (localnz.a(locala))
        return false;
    }
    return true;
  }

  public final String getAboutMe()
  {
    return this.ana;
  }

  public final Person.AgeRange getAgeRange()
  {
    return this.anb;
  }

  public final String getBirthday()
  {
    return this.anc;
  }

  public final String getBraggingRights()
  {
    return this.and;
  }

  public final int getCircledByCount()
  {
    return this.ane;
  }

  public final Person.Cover getCover()
  {
    return this.anf;
  }

  public final String getCurrentLocation()
  {
    return this.ang;
  }

  public final String getDisplayName()
  {
    return this.NH;
  }

  public final int getGender()
  {
    return this.om;
  }

  public final String getId()
  {
    return this.BL;
  }

  public final Person.Image getImage()
  {
    return this.anh;
  }

  public final String getLanguage()
  {
    return this.Fc;
  }

  public final Person.Name getName()
  {
    return this.anj;
  }

  public final String getNickname()
  {
    return this.ank;
  }

  public final int getObjectType()
  {
    return this.anl;
  }

  public final List<Person.Organizations> getOrganizations()
  {
    return (ArrayList)this.anm;
  }

  public final List<Person.PlacesLived> getPlacesLived()
  {
    return (ArrayList)this.ann;
  }

  public final int getPlusOneCount()
  {
    return this.ano;
  }

  public final int getRelationshipStatus()
  {
    return this.anp;
  }

  public final String getTagline()
  {
    return this.anq;
  }

  public final String getUrl()
  {
    return this.uR;
  }

  public final List<Person.Urls> getUrls()
  {
    return (ArrayList)this.anr;
  }

  public final boolean hasAboutMe()
  {
    return this.amc.contains(Integer.valueOf(2));
  }

  public final boolean hasAgeRange()
  {
    return this.amc.contains(Integer.valueOf(3));
  }

  public final boolean hasBirthday()
  {
    return this.amc.contains(Integer.valueOf(4));
  }

  public final boolean hasBraggingRights()
  {
    return this.amc.contains(Integer.valueOf(5));
  }

  public final boolean hasCircledByCount()
  {
    return this.amc.contains(Integer.valueOf(6));
  }

  public final boolean hasCover()
  {
    return this.amc.contains(Integer.valueOf(7));
  }

  public final boolean hasCurrentLocation()
  {
    return this.amc.contains(Integer.valueOf(8));
  }

  public final boolean hasDisplayName()
  {
    return this.amc.contains(Integer.valueOf(9));
  }

  public final boolean hasGender()
  {
    return this.amc.contains(Integer.valueOf(12));
  }

  public final boolean hasId()
  {
    return this.amc.contains(Integer.valueOf(14));
  }

  public final boolean hasImage()
  {
    return this.amc.contains(Integer.valueOf(15));
  }

  public final boolean hasIsPlusUser()
  {
    return this.amc.contains(Integer.valueOf(16));
  }

  public final boolean hasLanguage()
  {
    return this.amc.contains(Integer.valueOf(18));
  }

  public final boolean hasName()
  {
    return this.amc.contains(Integer.valueOf(19));
  }

  public final boolean hasNickname()
  {
    return this.amc.contains(Integer.valueOf(20));
  }

  public final boolean hasObjectType()
  {
    return this.amc.contains(Integer.valueOf(21));
  }

  public final boolean hasOrganizations()
  {
    return this.amc.contains(Integer.valueOf(22));
  }

  public final boolean hasPlacesLived()
  {
    return this.amc.contains(Integer.valueOf(23));
  }

  public final boolean hasPlusOneCount()
  {
    return this.amc.contains(Integer.valueOf(24));
  }

  public final boolean hasRelationshipStatus()
  {
    return this.amc.contains(Integer.valueOf(25));
  }

  public final boolean hasTagline()
  {
    return this.amc.contains(Integer.valueOf(26));
  }

  public final boolean hasUrl()
  {
    return this.amc.contains(Integer.valueOf(27));
  }

  public final boolean hasUrls()
  {
    return this.amc.contains(Integer.valueOf(28));
  }

  public final boolean hasVerified()
  {
    return this.amc.contains(Integer.valueOf(29));
  }

  public final int hashCode()
  {
    Iterator localIterator = amb.values().iterator();
    int i = 0;
    ji.a locala;
    if (localIterator.hasNext())
    {
      locala = (ji.a)localIterator.next();
      if (!a(locala))
        break label66;
    }
    label66: for (int j = i + locala.hm() + b(locala).hashCode(); ; j = i)
    {
      i = j;
      break;
      return i;
    }
  }

  public final HashMap<String, ji.a<?, ?>> hf()
  {
    return amb;
  }

  public final boolean isDataValid()
  {
    return true;
  }

  public final boolean isPlusUser()
  {
    return this.ani;
  }

  public final boolean isVerified()
  {
    return this.ans;
  }

  public final nz nu()
  {
    return this;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oa.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nz
 * JD-Core Version:    0.6.2
 */