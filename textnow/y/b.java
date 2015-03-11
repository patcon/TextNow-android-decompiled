package textnow.y;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;

final class b extends PhoneStateListener
{
  private b(a parama)
  {
  }

  public final void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    a.a(this.a, paramSignalStrength);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.y.b
 * JD-Core Version:    0.6.2
 */