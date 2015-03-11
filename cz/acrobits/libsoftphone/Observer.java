package cz.acrobits.libsoftphone;

import cz.acrobits.libsoftphone.data.AudioRoute;
import cz.acrobits.libsoftphone.data.Callee;
import cz.acrobits.libsoftphone.data.DnsSrvRecord;
import cz.acrobits.libsoftphone.data.Network;
import cz.acrobits.libsoftphone.data.PushTestScheduleResult;

public abstract interface Observer
{
  public abstract void handleThrowable(Throwable paramThrowable);

  public abstract void onAudioRouteChanged(AudioRoute paramAudioRoute);

  public abstract void onBalance(String paramString);

  public abstract void onCallHoldStateChanged(String paramString);

  public abstract void onCallRate(String paramString);

  public abstract void onCallRepositoryChanged();

  public abstract void onCallStateChanged(String paramString);

  public abstract boolean onCallThroughResult(String paramString, Callee paramCallee);

  public abstract void onDnsSrvQueryDone(long paramLong, DnsSrvRecord[] paramArrayOfDnsSrvRecord);

  public abstract boolean onGsmDirectDial(String paramString1, String paramString2);

  public abstract void onIncomingCall(String paramString1, String paramString2);

  public abstract void onIncomingMessage(String paramString, long paramLong);

  public abstract void onMediaStatusChanged(String paramString);

  public abstract void onMessageStateChanged(long paramLong);

  public abstract void onNetworkChangeDetected(Network paramNetwork);

  public abstract void onPushTestArrived(String paramString);

  public abstract void onPushTestScheduled(String paramString, PushTestScheduleResult paramPushTestScheduleResult);

  public abstract void onRegistrationErrorMessage(String paramString1, String paramString2);

  public abstract void onRegistrationStateChanged(String paramString);

  public abstract void onSecurityStatusChanged(String paramString);

  public abstract void onTransferOffered(String paramString);

  public abstract void onTransferResult(String paramString, boolean paramBoolean);

  public abstract void onVoicemail(String paramString);

  public abstract String ringtoneForCall(String paramString, Callee paramCallee);

  public abstract String ringtoneForMessage(String paramString, Callee paramCallee);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Observer
 * JD-Core Version:    0.6.2
 */