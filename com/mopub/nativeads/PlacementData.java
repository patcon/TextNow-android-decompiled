package com.mopub.nativeads;

import com.mopub.common.logging.MoPubLog;
import java.util.Iterator;
import java.util.List;

class PlacementData
{
  private static final int MAX_ADS = 200;
  public static final int NOT_FOUND = -1;
  private final NativeAdData[] mAdDataObjects = new NativeAdData['È'];
  private final int[] mAdjustedAdPositions = new int['È'];
  private int mDesiredCount = 0;
  private final int[] mDesiredInsertionPositions = new int['È'];
  private final int[] mDesiredOriginalPositions = new int['È'];
  private final int[] mOriginalAdPositions = new int['È'];
  private int mPlacedCount = 0;

  private PlacementData(int[] paramArrayOfInt)
  {
    this.mDesiredCount = Math.min(paramArrayOfInt.length, 200);
    System.arraycopy(paramArrayOfInt, 0, this.mDesiredInsertionPositions, 0, this.mDesiredCount);
    System.arraycopy(paramArrayOfInt, 0, this.mDesiredOriginalPositions, 0, this.mDesiredCount);
  }

  private static int binarySearch(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - 1;
    while (paramInt1 <= i)
    {
      j = paramInt1 + i >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt3)
      {
        paramInt1 = j + 1;
      }
      else
      {
        if (k <= paramInt3)
          break label59;
        i = j - 1;
      }
    }
    int j = paramInt1 ^ 0xFFFFFFFF;
    label59: return j;
  }

  private static int binarySearchFirstEquals(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = binarySearch(paramArrayOfInt, 0, paramInt1, paramInt2);
    if (i < 0)
      return i ^ 0xFFFFFFFF;
    int j = paramArrayOfInt[i];
    while ((i >= 0) && (paramArrayOfInt[i] == j))
      i--;
    return i + 1;
  }

  private static int binarySearchGreaterThan(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = binarySearch(paramArrayOfInt, 0, paramInt1, paramInt2);
    if (i < 0)
      i ^= -1;
    while (true)
    {
      return i;
      int j = paramArrayOfInt[i];
      while ((i < paramInt1) && (paramArrayOfInt[i] == j))
        i++;
    }
  }

  static PlacementData empty()
  {
    return new PlacementData(new int[0]);
  }

  static PlacementData fromAdPositioning(MoPubNativeAdPositioning.MoPubClientPositioning paramMoPubClientPositioning)
  {
    int i = 0;
    List localList = paramMoPubClientPositioning.getFixedPositions();
    int j = paramMoPubClientPositioning.getRepeatingInterval();
    if (j == 2147483647);
    int[] arrayOfInt;
    int m;
    for (int k = localList.size(); ; k = 200)
    {
      arrayOfInt = new int[k];
      Iterator localIterator = localList.iterator();
      m = 0;
      while (localIterator.hasNext())
      {
        m = ((Integer)localIterator.next()).intValue() - i;
        int i1 = i + 1;
        arrayOfInt[i] = m;
        i = i1;
      }
    }
    while (i < k)
    {
      m = -1 + (m + j);
      int n = i + 1;
      arrayOfInt[i] = m;
      i = n;
    }
    return new PlacementData(arrayOfInt);
  }

  void clearAds()
  {
    if (this.mPlacedCount == 0)
      return;
    clearAdsInRange(0, 1 + this.mAdjustedAdPositions[(-1 + this.mPlacedCount)]);
  }

  int clearAdsInRange(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt1 = new int[this.mPlacedCount];
    int[] arrayOfInt2 = new int[this.mPlacedCount];
    int i = 0;
    int j = 0;
    if (i < this.mPlacedCount)
    {
      int i2 = this.mOriginalAdPositions[i];
      int i3 = this.mAdjustedAdPositions[i];
      if ((paramInt1 <= i3) && (i3 < paramInt2))
      {
        arrayOfInt1[j] = i2;
        arrayOfInt2[j] = (i3 - j);
        this.mAdDataObjects[i].getAd().destroy();
        this.mAdDataObjects[i] = null;
        j++;
      }
      while (true)
      {
        i++;
        break;
        if (j > 0)
        {
          int i4 = i - j;
          this.mOriginalAdPositions[i4] = i2;
          this.mAdjustedAdPositions[i4] = (i3 - j);
          this.mAdDataObjects[i4] = this.mAdDataObjects[i];
        }
      }
    }
    if (j == 0)
      return 0;
    int k = arrayOfInt2[0];
    int m = binarySearchFirstEquals(this.mDesiredInsertionPositions, this.mDesiredCount, k);
    int i1;
    for (int n = -1 + this.mDesiredCount; ; n--)
    {
      i1 = 0;
      if (n < m)
        break;
      this.mDesiredOriginalPositions[(n + j)] = this.mDesiredOriginalPositions[n];
      this.mDesiredInsertionPositions[(n + j)] = (this.mDesiredInsertionPositions[n] - j);
    }
    while (i1 < j)
    {
      this.mDesiredOriginalPositions[(m + i1)] = arrayOfInt1[i1];
      this.mDesiredInsertionPositions[(m + i1)] = arrayOfInt2[i1];
      i1++;
    }
    this.mDesiredCount = (j + this.mDesiredCount);
    this.mPlacedCount -= j;
    return j;
  }

  int getAdjustedCount(int paramInt)
  {
    if (paramInt == 0)
      return 0;
    return 1 + getAdjustedPosition(paramInt - 1);
  }

  int getAdjustedPosition(int paramInt)
  {
    return paramInt + binarySearchGreaterThan(this.mOriginalAdPositions, this.mPlacedCount, paramInt);
  }

  int getOriginalCount(int paramInt)
  {
    int i = -1;
    if (paramInt == 0)
      i = 0;
    int j;
    do
    {
      return i;
      j = getOriginalPosition(paramInt - 1);
    }
    while (j == i);
    return j + 1;
  }

  int getOriginalPosition(int paramInt)
  {
    int i = binarySearch(this.mAdjustedAdPositions, 0, this.mPlacedCount, paramInt);
    if (i < 0)
      return paramInt - (i ^ 0xFFFFFFFF);
    return -1;
  }

  NativeAdData getPlacedAd(int paramInt)
  {
    int i = binarySearch(this.mAdjustedAdPositions, 0, this.mPlacedCount, paramInt);
    if (i < 0)
      return null;
    return this.mAdDataObjects[i];
  }

  int[] getPlacedAdPositions()
  {
    int[] arrayOfInt = new int[this.mPlacedCount];
    System.arraycopy(this.mAdjustedAdPositions, 0, arrayOfInt, 0, this.mPlacedCount);
    return arrayOfInt;
  }

  void insertItem(int paramInt)
  {
    for (int i = binarySearchFirstEquals(this.mDesiredOriginalPositions, this.mDesiredCount, paramInt); i < this.mDesiredCount; i++)
    {
      int[] arrayOfInt3 = this.mDesiredOriginalPositions;
      arrayOfInt3[i] = (1 + arrayOfInt3[i]);
      int[] arrayOfInt4 = this.mDesiredInsertionPositions;
      arrayOfInt4[i] = (1 + arrayOfInt4[i]);
    }
    for (int j = binarySearchFirstEquals(this.mOriginalAdPositions, this.mPlacedCount, paramInt); j < this.mPlacedCount; j++)
    {
      int[] arrayOfInt1 = this.mOriginalAdPositions;
      arrayOfInt1[j] = (1 + arrayOfInt1[j]);
      int[] arrayOfInt2 = this.mAdjustedAdPositions;
      arrayOfInt2[j] = (1 + arrayOfInt2[j]);
    }
  }

  boolean isPlacedAd(int paramInt)
  {
    int i = binarySearch(this.mAdjustedAdPositions, 0, this.mPlacedCount, paramInt);
    boolean bool = false;
    if (i >= 0)
      bool = true;
    return bool;
  }

  void moveItem(int paramInt1, int paramInt2)
  {
    removeItem(paramInt1);
    insertItem(paramInt2);
  }

  int nextInsertionPosition(int paramInt)
  {
    int i = binarySearchGreaterThan(this.mDesiredInsertionPositions, this.mDesiredCount, paramInt);
    if (i == this.mDesiredCount)
      return -1;
    return this.mDesiredInsertionPositions[i];
  }

  void placeAd(int paramInt, NativeAdData paramNativeAdData)
  {
    int i = binarySearchFirstEquals(this.mDesiredInsertionPositions, this.mDesiredCount, paramInt);
    if ((i == this.mDesiredCount) || (this.mDesiredInsertionPositions[i] != paramInt))
      MoPubLog.w("Attempted to insert an ad at an invalid position");
    while (true)
    {
      return;
      int j = this.mDesiredOriginalPositions[i];
      int k = binarySearchGreaterThan(this.mOriginalAdPositions, this.mPlacedCount, j);
      if (k < this.mPlacedCount)
      {
        int i1 = this.mPlacedCount - k;
        System.arraycopy(this.mOriginalAdPositions, k, this.mOriginalAdPositions, k + 1, i1);
        System.arraycopy(this.mAdjustedAdPositions, k, this.mAdjustedAdPositions, k + 1, i1);
        System.arraycopy(this.mAdDataObjects, k, this.mAdDataObjects, k + 1, i1);
      }
      this.mOriginalAdPositions[k] = j;
      this.mAdjustedAdPositions[k] = paramInt;
      this.mAdDataObjects[k] = paramNativeAdData;
      this.mPlacedCount = (1 + this.mPlacedCount);
      int m = -1 + (this.mDesiredCount - i);
      System.arraycopy(this.mDesiredInsertionPositions, i + 1, this.mDesiredInsertionPositions, i, m);
      System.arraycopy(this.mDesiredOriginalPositions, i + 1, this.mDesiredOriginalPositions, i, m);
      this.mDesiredCount = (-1 + this.mDesiredCount);
      while (i < this.mDesiredCount)
      {
        int[] arrayOfInt2 = this.mDesiredInsertionPositions;
        arrayOfInt2[i] = (1 + arrayOfInt2[i]);
        i++;
      }
      for (int n = k + 1; n < this.mPlacedCount; n++)
      {
        int[] arrayOfInt1 = this.mAdjustedAdPositions;
        arrayOfInt1[n] = (1 + arrayOfInt1[n]);
      }
    }
  }

  int previousInsertionPosition(int paramInt)
  {
    int i = binarySearchFirstEquals(this.mDesiredInsertionPositions, this.mDesiredCount, paramInt);
    if (i == 0)
      return -1;
    return this.mDesiredInsertionPositions[(i - 1)];
  }

  void removeItem(int paramInt)
  {
    for (int i = binarySearchGreaterThan(this.mDesiredOriginalPositions, this.mDesiredCount, paramInt); i < this.mDesiredCount; i++)
    {
      int[] arrayOfInt3 = this.mDesiredOriginalPositions;
      arrayOfInt3[i] = (-1 + arrayOfInt3[i]);
      int[] arrayOfInt4 = this.mDesiredInsertionPositions;
      arrayOfInt4[i] = (-1 + arrayOfInt4[i]);
    }
    for (int j = binarySearchGreaterThan(this.mOriginalAdPositions, this.mPlacedCount, paramInt); j < this.mPlacedCount; j++)
    {
      int[] arrayOfInt1 = this.mOriginalAdPositions;
      arrayOfInt1[j] = (-1 + arrayOfInt1[j]);
      int[] arrayOfInt2 = this.mAdjustedAdPositions;
      arrayOfInt2[j] = (-1 + arrayOfInt2[j]);
    }
  }

  boolean shouldPlaceAd(int paramInt)
  {
    int i = binarySearch(this.mDesiredInsertionPositions, 0, this.mDesiredCount, paramInt);
    boolean bool = false;
    if (i >= 0)
      bool = true;
    return bool;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.PlacementData
 * JD-Core Version:    0.6.2
 */