package com.admarvel.android.offlinesdk.model;

import java.io.Serializable;
import java.util.ArrayList;

public class BannerFolderName
  implements Serializable
{
  private static final long serialVersionUID = 12198219871927192L;
  private ArrayList<String> bannerFolderName;

  public ArrayList<String> getBannerFolderName()
  {
    return this.bannerFolderName;
  }

  public void setBannerFolderName(ArrayList<String> paramArrayList)
  {
    this.bannerFolderName = paramArrayList;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.offlinesdk.model.BannerFolderName
 * JD-Core Version:    0.6.2
 */