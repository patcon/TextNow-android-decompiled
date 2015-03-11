package com.google.android.gms.plus.model.moments;

import com.google.android.gms.internal.nu;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemScope$Builder
{
  private String BL;
  private String Tr;
  private double aek;
  private double ael;
  private String amA;
  private String amB;
  private nu amC;
  private String amD;
  private String amE;
  private String amF;
  private nu amG;
  private nu amH;
  private nu amI;
  private List<nu> amJ;
  private String amK;
  private String amL;
  private String amM;
  private String amN;
  private nu amO;
  private String amP;
  private String amQ;
  private String amR;
  private nu amS;
  private String amT;
  private String amU;
  private String amV;
  private String amW;
  private final Set<Integer> amc = new HashSet();
  private nu amd;
  private List<String> ame;
  private nu amf;
  private String amg;
  private String amh;
  private String ami;
  private List<nu> amj;
  private int amk;
  private List<nu> aml;
  private nu amm;
  private List<nu> amn;
  private String amo;
  private String amp;
  private nu amq;
  private String amr;
  private String ams;
  private List<nu> amt;
  private String amu;
  private String amv;
  private String amw;
  private String amx;
  private String amy;
  private String amz;
  private String mName;
  private String ol;
  private String uO;
  private String uR;

  public ItemScope build()
  {
    return new nu(this.amc, this.amd, this.ame, this.amf, this.amg, this.amh, this.ami, this.amj, this.amk, this.aml, this.amm, this.amn, this.amo, this.amp, this.amq, this.amr, this.ams, this.ol, this.amt, this.amu, this.amv, this.amw, this.Tr, this.amx, this.amy, this.amz, this.amA, this.amB, this.amC, this.amD, this.amE, this.BL, this.amF, this.amG, this.aek, this.amH, this.ael, this.mName, this.amI, this.amJ, this.amK, this.amL, this.amM, this.amN, this.amO, this.amP, this.amQ, this.amR, this.amS, this.amT, this.amU, this.uO, this.uR, this.amV, this.amW);
  }

  public Builder setAbout(ItemScope paramItemScope)
  {
    this.amd = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(2));
    return this;
  }

  public Builder setAdditionalName(List<String> paramList)
  {
    this.ame = paramList;
    this.amc.add(Integer.valueOf(3));
    return this;
  }

  public Builder setAddress(ItemScope paramItemScope)
  {
    this.amf = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(4));
    return this;
  }

  public Builder setAddressCountry(String paramString)
  {
    this.amg = paramString;
    this.amc.add(Integer.valueOf(5));
    return this;
  }

  public Builder setAddressLocality(String paramString)
  {
    this.amh = paramString;
    this.amc.add(Integer.valueOf(6));
    return this;
  }

  public Builder setAddressRegion(String paramString)
  {
    this.ami = paramString;
    this.amc.add(Integer.valueOf(7));
    return this;
  }

  public Builder setAssociated_media(List<ItemScope> paramList)
  {
    this.amj = paramList;
    this.amc.add(Integer.valueOf(8));
    return this;
  }

  public Builder setAttendeeCount(int paramInt)
  {
    this.amk = paramInt;
    this.amc.add(Integer.valueOf(9));
    return this;
  }

  public Builder setAttendees(List<ItemScope> paramList)
  {
    this.aml = paramList;
    this.amc.add(Integer.valueOf(10));
    return this;
  }

  public Builder setAudio(ItemScope paramItemScope)
  {
    this.amm = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(11));
    return this;
  }

  public Builder setAuthor(List<ItemScope> paramList)
  {
    this.amn = paramList;
    this.amc.add(Integer.valueOf(12));
    return this;
  }

  public Builder setBestRating(String paramString)
  {
    this.amo = paramString;
    this.amc.add(Integer.valueOf(13));
    return this;
  }

  public Builder setBirthDate(String paramString)
  {
    this.amp = paramString;
    this.amc.add(Integer.valueOf(14));
    return this;
  }

  public Builder setByArtist(ItemScope paramItemScope)
  {
    this.amq = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(15));
    return this;
  }

  public Builder setCaption(String paramString)
  {
    this.amr = paramString;
    this.amc.add(Integer.valueOf(16));
    return this;
  }

  public Builder setContentSize(String paramString)
  {
    this.ams = paramString;
    this.amc.add(Integer.valueOf(17));
    return this;
  }

  public Builder setContentUrl(String paramString)
  {
    this.ol = paramString;
    this.amc.add(Integer.valueOf(18));
    return this;
  }

  public Builder setContributor(List<ItemScope> paramList)
  {
    this.amt = paramList;
    this.amc.add(Integer.valueOf(19));
    return this;
  }

  public Builder setDateCreated(String paramString)
  {
    this.amu = paramString;
    this.amc.add(Integer.valueOf(20));
    return this;
  }

  public Builder setDateModified(String paramString)
  {
    this.amv = paramString;
    this.amc.add(Integer.valueOf(21));
    return this;
  }

  public Builder setDatePublished(String paramString)
  {
    this.amw = paramString;
    this.amc.add(Integer.valueOf(22));
    return this;
  }

  public Builder setDescription(String paramString)
  {
    this.Tr = paramString;
    this.amc.add(Integer.valueOf(23));
    return this;
  }

  public Builder setDuration(String paramString)
  {
    this.amx = paramString;
    this.amc.add(Integer.valueOf(24));
    return this;
  }

  public Builder setEmbedUrl(String paramString)
  {
    this.amy = paramString;
    this.amc.add(Integer.valueOf(25));
    return this;
  }

  public Builder setEndDate(String paramString)
  {
    this.amz = paramString;
    this.amc.add(Integer.valueOf(26));
    return this;
  }

  public Builder setFamilyName(String paramString)
  {
    this.amA = paramString;
    this.amc.add(Integer.valueOf(27));
    return this;
  }

  public Builder setGender(String paramString)
  {
    this.amB = paramString;
    this.amc.add(Integer.valueOf(28));
    return this;
  }

  public Builder setGeo(ItemScope paramItemScope)
  {
    this.amC = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(29));
    return this;
  }

  public Builder setGivenName(String paramString)
  {
    this.amD = paramString;
    this.amc.add(Integer.valueOf(30));
    return this;
  }

  public Builder setHeight(String paramString)
  {
    this.amE = paramString;
    this.amc.add(Integer.valueOf(31));
    return this;
  }

  public Builder setId(String paramString)
  {
    this.BL = paramString;
    this.amc.add(Integer.valueOf(32));
    return this;
  }

  public Builder setImage(String paramString)
  {
    this.amF = paramString;
    this.amc.add(Integer.valueOf(33));
    return this;
  }

  public Builder setInAlbum(ItemScope paramItemScope)
  {
    this.amG = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(34));
    return this;
  }

  public Builder setLatitude(double paramDouble)
  {
    this.aek = paramDouble;
    this.amc.add(Integer.valueOf(36));
    return this;
  }

  public Builder setLocation(ItemScope paramItemScope)
  {
    this.amH = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(37));
    return this;
  }

  public Builder setLongitude(double paramDouble)
  {
    this.ael = paramDouble;
    this.amc.add(Integer.valueOf(38));
    return this;
  }

  public Builder setName(String paramString)
  {
    this.mName = paramString;
    this.amc.add(Integer.valueOf(39));
    return this;
  }

  public Builder setPartOfTVSeries(ItemScope paramItemScope)
  {
    this.amI = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(40));
    return this;
  }

  public Builder setPerformers(List<ItemScope> paramList)
  {
    this.amJ = paramList;
    this.amc.add(Integer.valueOf(41));
    return this;
  }

  public Builder setPlayerType(String paramString)
  {
    this.amK = paramString;
    this.amc.add(Integer.valueOf(42));
    return this;
  }

  public Builder setPostOfficeBoxNumber(String paramString)
  {
    this.amL = paramString;
    this.amc.add(Integer.valueOf(43));
    return this;
  }

  public Builder setPostalCode(String paramString)
  {
    this.amM = paramString;
    this.amc.add(Integer.valueOf(44));
    return this;
  }

  public Builder setRatingValue(String paramString)
  {
    this.amN = paramString;
    this.amc.add(Integer.valueOf(45));
    return this;
  }

  public Builder setReviewRating(ItemScope paramItemScope)
  {
    this.amO = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(46));
    return this;
  }

  public Builder setStartDate(String paramString)
  {
    this.amP = paramString;
    this.amc.add(Integer.valueOf(47));
    return this;
  }

  public Builder setStreetAddress(String paramString)
  {
    this.amQ = paramString;
    this.amc.add(Integer.valueOf(48));
    return this;
  }

  public Builder setText(String paramString)
  {
    this.amR = paramString;
    this.amc.add(Integer.valueOf(49));
    return this;
  }

  public Builder setThumbnail(ItemScope paramItemScope)
  {
    this.amS = ((nu)paramItemScope);
    this.amc.add(Integer.valueOf(50));
    return this;
  }

  public Builder setThumbnailUrl(String paramString)
  {
    this.amT = paramString;
    this.amc.add(Integer.valueOf(51));
    return this;
  }

  public Builder setTickerSymbol(String paramString)
  {
    this.amU = paramString;
    this.amc.add(Integer.valueOf(52));
    return this;
  }

  public Builder setType(String paramString)
  {
    this.uO = paramString;
    this.amc.add(Integer.valueOf(53));
    return this;
  }

  public Builder setUrl(String paramString)
  {
    this.uR = paramString;
    this.amc.add(Integer.valueOf(54));
    return this;
  }

  public Builder setWidth(String paramString)
  {
    this.amV = paramString;
    this.amc.add(Integer.valueOf(55));
    return this;
  }

  public Builder setWorstRating(String paramString)
  {
    this.amW = paramString;
    this.amc.add(Integer.valueOf(56));
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.model.moments.ItemScope.Builder
 * JD-Core Version:    0.6.2
 */