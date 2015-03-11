package textnow.ae;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.enflick.android.TextNow.activities.phone.i;
import com.enflick.android.TextNow.activities.phone.j;
import com.enflick.android.TextNow.activities.phone.w;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.location.LocationClient;
import cz.acrobits.libsoftphone.data.Call.Statistics;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class a
  implements j, GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener
{
  private Context a;
  private TelephonyManager b;
  private ConnectivityManager c;
  private WifiManager d;
  private LocationClient e;
  private com.enflick.android.TextNow.activities.phone.h f;
  private StringBuilder g;
  private int h;
  private boolean i;
  private SignalStrength j;
  private b k;

  public a(Context paramContext, com.enflick.android.TextNow.activities.phone.h paramh)
  {
    this(paramContext, paramh, 5);
  }

  private a(Context paramContext, com.enflick.android.TextNow.activities.phone.h paramh, int paramInt)
  {
    this.a = paramContext;
    this.b = ((TelephonyManager)this.a.getSystemService("phone"));
    this.c = ((ConnectivityManager)this.a.getSystemService("connectivity"));
    this.d = ((WifiManager)this.a.getSystemService("wifi"));
    this.h = 5;
    this.g = new StringBuilder();
    this.e = new LocationClient(this.a, this, this);
    this.i = false;
    this.f = paramh;
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = textnow.v.b.e(this.a);
    a(arrayOfString1);
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = "Phone type: ";
    int m = this.b.getPhoneType();
    String str1;
    String[] arrayOfString4;
    String str2;
    switch (m)
    {
    default:
      str1 = Integer.toString(m);
      arrayOfString2[1] = str1;
      a(arrayOfString2);
      String[] arrayOfString3 = new String[2];
      arrayOfString3[0] = "Carrier: ";
      arrayOfString3[1] = this.b.getNetworkOperatorName();
      a(arrayOfString3);
      arrayOfString4 = new String[2];
      arrayOfString4[0] = "Network type: ";
      int n = this.b.getNetworkType();
      switch (n)
      {
      default:
        str2 = Integer.toString(n);
      case 7:
      case 4:
      case 2:
      case 14:
      case 5:
      case 6:
      case 12:
      case 1:
      case 8:
      case 10:
      case 15:
      case 9:
      case 11:
      case 13:
      case 3:
      case 0:
      }
      break;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfString4[1] = str2;
      a(arrayOfString4);
      a(new String[] { "" });
      this.e.connect();
      this.f.a(this);
      com.enflick.android.TextNow.activities.phone.h.a(true);
      if (Build.VERSION.SDK_INT < 17)
      {
        this.k = new b(this, (byte)0);
        this.b.listen(this.k, 256);
      }
      return;
      str1 = "NONE";
      break;
      str1 = "GSM";
      break;
      str1 = "CDMA";
      break;
      str1 = "SIP";
      break;
      str2 = "1xRTT";
      continue;
      str2 = "CDMA";
      continue;
      str2 = "EDGE";
      continue;
      str2 = "eHRPD";
      continue;
      str2 = "EVDO revision 0";
      continue;
      str2 = "EVDO revision A";
      continue;
      str2 = "EVDO revision B";
      continue;
      str2 = "GPRS";
      continue;
      str2 = "HSDPA";
      continue;
      str2 = "HSPA";
      continue;
      str2 = "HSPA+";
      continue;
      str2 = "HSUPA";
      continue;
      str2 = "iDen";
      continue;
      str2 = "LTE";
      continue;
      str2 = "UMTS";
      continue;
      str2 = "unknown";
    }
  }

  private void a(String[] paramArrayOfString)
  {
    int m = paramArrayOfString.length;
    for (int n = 0; n < m; n++)
    {
      String str = paramArrayOfString[n];
      this.g.append(str);
    }
    this.g.append("\n");
  }

  public final void a()
  {
  }

  @SuppressLint({"NewApi"})
  public final void a(long paramLong)
  {
    int m;
    label459: CellInfo localCellInfo;
    String[] arrayOfString10;
    StringBuilder localStringBuilder;
    Object localObject;
    if (paramLong % this.h == 0L)
    {
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = Calendar.getInstance().getTime().toString();
      a(arrayOfString1);
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = Long.toString(paramLong);
      arrayOfString2[1] = "s into call";
      a(arrayOfString2);
      if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.a) == 0)
      {
        m = 1;
        if ((m != 0) && (this.i))
        {
          Location localLocation = this.e.getLastLocation();
          if (localLocation != null)
          {
            String[] arrayOfString17 = new String[4];
            arrayOfString17[0] = "Location: ";
            arrayOfString17[1] = Double.toString(localLocation.getLatitude());
            arrayOfString17[2] = ", ";
            arrayOfString17[3] = Double.toString(localLocation.getLongitude());
            a(arrayOfString17);
            String[] arrayOfString18 = new String[1];
            arrayOfString18[0] = ("https://maps.google.com/maps?q=" + Double.toString(localLocation.getLatitude()) + "+" + Double.toString(localLocation.getLongitude()));
            a(arrayOfString18);
          }
        }
        NetworkInfo localNetworkInfo = this.c.getActiveNetworkInfo();
        if (localNetworkInfo != null)
        {
          String[] arrayOfString13 = new String[2];
          arrayOfString13[0] = "Network type: ";
          arrayOfString13[1] = localNetworkInfo.getTypeName();
          a(arrayOfString13);
          String[] arrayOfString14 = new String[2];
          arrayOfString14[0] = "Network sub-type: ";
          arrayOfString14[1] = localNetworkInfo.getSubtypeName();
          a(arrayOfString14);
          String[] arrayOfString15 = new String[2];
          arrayOfString15[0] = "Network state: ";
          arrayOfString15[1] = localNetworkInfo.getState().name();
          a(arrayOfString15);
          String[] arrayOfString16 = new String[2];
          arrayOfString16[0] = "Network detailed state: ";
          arrayOfString16[1] = localNetworkInfo.getDetailedState().name();
          a(arrayOfString16);
        }
        if (localNetworkInfo.getType() == 1)
        {
          WifiInfo localWifiInfo = this.d.getConnectionInfo();
          if (localWifiInfo != null)
          {
            String[] arrayOfString11 = new String[3];
            arrayOfString11[0] = "WiFi link speed: ";
            arrayOfString11[1] = Integer.toString(localWifiInfo.getLinkSpeed());
            arrayOfString11[2] = "Mbps";
            a(arrayOfString11);
            String[] arrayOfString12 = new String[2];
            arrayOfString12[0] = "RSSI: ";
            arrayOfString12[1] = Integer.toString(localWifiInfo.getRssi());
            a(arrayOfString12);
          }
        }
        if (Build.VERSION.SDK_INT < 17)
          break label689;
        List localList = this.b.getAllCellInfo();
        if (localList == null)
          break label739;
        Iterator localIterator = localList.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            localCellInfo = (CellInfo)localIterator.next();
            if (localCellInfo.isRegistered())
            {
              arrayOfString10 = new String[1];
              localStringBuilder = new StringBuilder();
              if ((localCellInfo instanceof CellInfoLte))
              {
                localStringBuilder.append("LTE");
                localObject = ((CellInfoLte)localCellInfo).getCellSignalStrength();
              }
            }
          }
      }
    }
    while (true)
    {
      label530: if (localObject != null)
        localStringBuilder.append(" signal strength: ").append(((CellSignalStrength)localObject).getDbm()).append(" dBm");
      for (String str = localStringBuilder.toString(); ; str = "")
      {
        arrayOfString10[0] = str;
        a(arrayOfString10);
        break label459;
        m = 0;
        break;
        if ((localCellInfo instanceof CellInfoGsm))
        {
          localStringBuilder.append("GSM");
          localObject = ((CellInfoGsm)localCellInfo).getCellSignalStrength();
          break label530;
        }
        if ((localCellInfo instanceof CellInfoCdma))
        {
          localStringBuilder.append("CDMA");
          localObject = ((CellInfoCdma)localCellInfo).getCellSignalStrength();
          break label530;
        }
        if ((Build.VERSION.SDK_INT < 18) || (!(localCellInfo instanceof CellInfoWcdma)))
          break label972;
        localStringBuilder.append("WCDMA");
        localObject = ((CellInfoWcdma)localCellInfo).getCellSignalStrength();
        break label530;
      }
      label689: if (this.j != null)
      {
        if (!this.j.isGsm())
          break label889;
        String[] arrayOfString9 = new String[2];
        arrayOfString9[0] = "GSM signal strength (0-31): ";
        arrayOfString9[1] = Integer.toString(this.j.getGsmSignalStrength());
        a(arrayOfString9);
      }
      while (true)
      {
        label739: Call.Statistics localStatistics = this.f.p().m();
        String[] arrayOfString3 = new String[2];
        arrayOfString3[0] = Integer.toString(localStatistics.networkPacketLossPercentage);
        arrayOfString3[1] = "% network packet loss";
        a(arrayOfString3);
        String[] arrayOfString4 = new String[2];
        arrayOfString4[0] = Integer.toString(localStatistics.jitterBufferPacketLossPercentage);
        arrayOfString4[1] = "% jitter buffer packet loss";
        a(arrayOfString4);
        String[] arrayOfString5 = new String[2];
        arrayOfString5[0] = Double.toString(localStatistics.avgJitter);
        arrayOfString5[1] = "ms average jitter";
        a(arrayOfString5);
        String[] arrayOfString6 = new String[2];
        arrayOfString6[0] = Double.toString(localStatistics.maxJitter);
        arrayOfString6[1] = "ms max jitter";
        a(arrayOfString6);
        a(new String[] { "" });
        return;
        label889: String[] arrayOfString7 = new String[3];
        arrayOfString7[0] = "CDMA signal strength: ";
        arrayOfString7[1] = Integer.toString(this.j.getCdmaDbm());
        arrayOfString7[2] = " dBm";
        a(arrayOfString7);
        String[] arrayOfString8 = new String[3];
        arrayOfString8[0] = "EVDO signal strength: ";
        arrayOfString8[1] = Integer.toString(this.j.getEvdoDbm());
        arrayOfString8[2] = " dBm";
        a(arrayOfString8);
      }
      label972: localObject = null;
    }
  }

  public final void a(String paramString, i parami)
  {
  }

  public final void a(String paramString, textnow.z.h paramh, boolean paramBoolean)
  {
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = Calendar.getInstance().getTime().toString();
    a(arrayOfString1);
    a(new String[] { "Call Completed" });
    a(new String[] { "" });
    a(new String[] { "SIP Log" });
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = com.enflick.android.TextNow.activities.phone.h.E();
    a(arrayOfString2);
    this.e.disconnect();
    this.f.b(this);
    if (!textnow.v.a.a)
      com.enflick.android.TextNow.activities.phone.h.a(false);
    if (Build.VERSION.SDK_INT < 17)
      this.b.listen(this.k, 0);
  }

  public final void b()
  {
  }

  public final String c()
  {
    return this.g.toString();
  }

  public final void onConnected(Bundle paramBundle)
  {
    this.i = true;
  }

  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
  }

  public final void onDisconnected()
  {
    this.i = false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ae.a
 * JD-Core Version:    0.6.2
 */