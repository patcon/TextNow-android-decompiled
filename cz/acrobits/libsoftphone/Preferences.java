package cz.acrobits.libsoftphone;

public class Preferences
{
  public final Preferences.ROKey<Boolean> audioFastPathWorkaround = new Preferences.Key(this, "audioFastPathWorkaround");
  public final Preferences.Key<Boolean> checkForVoiceMail = new Preferences.Key(this, "vmcheck");
  public final Preferences.Key<Boolean> forwardingAdhoc = new Preferences.Key(this, "adhocForwarding");
  public final Preferences.Key<Boolean> forwardingEnabled = new Preferences.Key(this, "forwardingEnabled");
  public final Preferences.Key<String> forwardingNumber = new Preferences.Key(this, "forwardingNumber");
  public final Preferences.Key<String> incomingCallsMode = new Preferences.Key(this, "icm");
  public final Preferences.Key<String> keepAwake = new Preferences.Key(this, "keepAwake2");
  public final Preferences.Key<Integer> keypadVolume = new Preferences.Key(this, "keypadVolume");
  public final Preferences.Key<Boolean> legacyAudio = new Preferences.Key(this, "genericRecPreset");
  private long mContext;
  public final Preferences.ROKey<Integer> maxNumberOfConcurrentCalls = new Preferences.ROKey(this, "maxNumberOfConcurrentCalls");
  public final Preferences.Key<String> networkUse = new Preferences.Key(this, "wo");
  public final Preferences.Key<Boolean> proximitySensorLock = new Preferences.Key(this, "proximitySensor");
  public final Preferences.ROKey<Integer> samplingRateOverride = new Preferences.Key(this, "samplingRateOverride");
  public final Preferences.Key<Boolean> sipisDisabled = new Preferences.Key(this, "sipisDisabled");
  public final Preferences.Key<Boolean> speakerOnDisplayDown = new Preferences.Key(this, "speakerOnDisplayDown");
  public final Preferences.Key<Boolean> trafficLogging = new Preferences.Key(this, "sipTrafficLogging");
  public final Preferences.ROKey<String> userAgent = new Preferences.ROKey(this, "sipUserAgent");
  public final Preferences.Key<Integer> volumeBoostMicrophone = new Preferences.Key(this, "volumeBoostMicrophone");
  public final Preferences.Key<Integer> volumeBoostPlayback = new Preferences.Key(this, "volumeBoostPlayback");

  public native Class<?> getKeyType(String paramString);

  public boolean keyExists(String paramString)
  {
    return getKeyType(paramString) != null;
  }

  protected void overrideDefaults()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Preferences
 * JD-Core Version:    0.6.2
 */