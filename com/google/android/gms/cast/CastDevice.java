package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ik;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CastDevice
  implements SafeParcelable
{
  public static final Parcelable.Creator<CastDevice> CREATOR = new b();
  private final int BR;
  private String ER;
  String ES;
  private Inet4Address ET;
  private String EU;
  private String EV;
  private String EW;
  private int EX;
  private List<WebImage> EY;
  private int EZ;
  private int Fa;

  private CastDevice()
  {
    this(3, null, null, null, null, null, -1, new ArrayList(), 0, -1);
  }

  CastDevice(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, List<WebImage> paramList, int paramInt3, int paramInt4)
  {
    this.BR = paramInt1;
    this.ER = paramString1;
    this.ES = paramString2;
    if (this.ES != null);
    try
    {
      InetAddress localInetAddress = InetAddress.getByName(this.ES);
      if ((localInetAddress instanceof Inet4Address))
        this.ET = ((Inet4Address)localInetAddress);
      this.EU = paramString3;
      this.EV = paramString4;
      this.EW = paramString5;
      this.EX = paramInt2;
      this.EY = paramList;
      this.EZ = paramInt3;
      this.Fa = paramInt4;
      return;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      while (true)
        this.ET = null;
    }
  }

  public static CastDevice getFromBundle(Bundle paramBundle)
  {
    if (paramBundle == null)
      return null;
    paramBundle.setClassLoader(CastDevice.class.getClassLoader());
    return (CastDevice)paramBundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    CastDevice localCastDevice;
    do
    {
      do
      {
        return true;
        if (!(paramObject instanceof CastDevice))
          return false;
        localCastDevice = (CastDevice)paramObject;
        if (getDeviceId() != null)
          break;
      }
      while (localCastDevice.getDeviceId() == null);
      return false;
    }
    while ((ik.a(this.ER, localCastDevice.ER)) && (ik.a(this.ET, localCastDevice.ET)) && (ik.a(this.EV, localCastDevice.EV)) && (ik.a(this.EU, localCastDevice.EU)) && (ik.a(this.EW, localCastDevice.EW)) && (this.EX == localCastDevice.EX) && (ik.a(this.EY, localCastDevice.EY)) && (this.EZ == localCastDevice.EZ) && (this.Fa == localCastDevice.Fa));
    return false;
  }

  public int getCapabilities()
  {
    return this.EZ;
  }

  public String getDeviceId()
  {
    return this.ER;
  }

  public String getDeviceVersion()
  {
    return this.EW;
  }

  public String getFriendlyName()
  {
    return this.EU;
  }

  public WebImage getIcon(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    if (this.EY.isEmpty())
      return null;
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
      return (WebImage)this.EY.get(0);
    Iterator localIterator = this.EY.iterator();
    Object localObject2 = null;
    Object localObject3;
    while (localIterator.hasNext())
    {
      localObject3 = (WebImage)localIterator.next();
      int i = ((WebImage)localObject3).getWidth();
      int j = ((WebImage)localObject3).getHeight();
      if ((i >= paramInt1) && (j >= paramInt2))
      {
        if ((localObject2 != null) && ((((WebImage)localObject2).getWidth() <= i) || (((WebImage)localObject2).getHeight() <= j)))
          break label208;
        localObject2 = localObject3;
      }
      else
      {
        if ((i >= paramInt1) || (j >= paramInt2) || ((localObject1 != null) && ((localObject1.getWidth() >= i) || (localObject1.getHeight() >= j))))
          break label208;
      }
    }
    while (true)
    {
      localObject1 = localObject3;
      break;
      if (localObject2 != null);
      while (true)
      {
        return localObject2;
        if (localObject1 != null)
          localObject2 = localObject1;
        else
          localObject2 = (WebImage)this.EY.get(0);
      }
      label208: localObject3 = localObject1;
    }
  }

  public List<WebImage> getIcons()
  {
    return Collections.unmodifiableList(this.EY);
  }

  public Inet4Address getIpAddress()
  {
    return this.ET;
  }

  public String getModelName()
  {
    return this.EV;
  }

  public int getServicePort()
  {
    return this.EX;
  }

  public int getStatus()
  {
    return this.Fa;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public boolean hasIcons()
  {
    return !this.EY.isEmpty();
  }

  public int hashCode()
  {
    if (this.ER == null)
      return 0;
    return this.ER.hashCode();
  }

  public boolean isSameDevice(CastDevice paramCastDevice)
  {
    if (paramCastDevice == null);
    do
    {
      return false;
      if (getDeviceId() != null)
        break;
    }
    while (paramCastDevice.getDeviceId() != null);
    return true;
    return ik.a(getDeviceId(), paramCastDevice.getDeviceId());
  }

  public void putInBundle(Bundle paramBundle)
  {
    if (paramBundle == null)
      return;
    paramBundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.EU;
    arrayOfObject[1] = this.ER;
    return String.format("\"%s\" (%s)", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.CastDevice
 * JD-Core Version:    0.6.2
 */