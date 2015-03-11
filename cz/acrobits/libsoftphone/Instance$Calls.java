package cz.acrobits.libsoftphone;

import cz.acrobits.ali.XMLTree;
import cz.acrobits.libsoftphone.data.Call.DesiredMedia;
import cz.acrobits.libsoftphone.data.Call.History.Record;
import cz.acrobits.libsoftphone.data.Call.HoldStates;
import cz.acrobits.libsoftphone.data.Call.OfferedTransferInfo;
import cz.acrobits.libsoftphone.data.Call.PayloadNumbers;
import cz.acrobits.libsoftphone.data.Call.Rate.Record;
import cz.acrobits.libsoftphone.data.Call.Record.State;
import cz.acrobits.libsoftphone.data.Call.State;
import cz.acrobits.libsoftphone.data.Call.Statistics;
import cz.acrobits.libsoftphone.data.Call.VideoAvailability;
import cz.acrobits.libsoftphone.data.Callee;
import cz.acrobits.libsoftphone.data.NatTraversalStatus;
import cz.acrobits.libsoftphone.data.ResponseStatusLine;

public final class Instance$Calls
{
  public static native String acceptOfferedTransfer(String paramString, Call.DesiredMedia paramDesiredMedia);

  public static native boolean answerIncomingCall(String paramString, Call.DesiredMedia paramDesiredMedia);

  public static native boolean attendedTransfer(String paramString1, String paramString2);

  public static native void beginForward(String paramString);

  public static native void beginTransfer(String paramString);

  public static native String call(String paramString, Call.History.Record paramRecord, Call.DesiredMedia paramDesiredMedia);

  public static native String call(String paramString, Callee paramCallee, Call.DesiredMedia paramDesiredMedia);

  public static String call(String paramString1, String paramString2, Call.DesiredMedia paramDesiredMedia)
  {
    return call(paramString1, new Callee(paramString2), paramDesiredMedia);
  }

  public static native boolean callThrough(String paramString, Callee paramCallee);

  public static native void cancelForward(String paramString);

  public static native void cancelTransfer(String paramString);

  public static native void clearDtmfDigits(String paramString);

  public static native void close(String paramString);

  public static native XMLTree findSipHeader(String paramString1, String paramString2);

  public static native void finishForward(String paramString, Callee paramCallee);

  public static native void finishTransfer(String paramString, Callee paramCallee);

  public static native String getAccount(String paramString);

  public static native String getActiveGroup();

  public static native String getCallFromGroup(String paramString, int paramInt);

  public static native Call.Rate.Record getCallRate(String paramString);

  public static native Call.State getCallState(String paramString);

  public static native Callee getCallee(String paramString);

  public static native String getCodecString(String paramString);

  public static native Call.DesiredMedia getDesiredMedia(String paramString);

  public static native String getDtmfDigits(String paramString);

  public static native String getGroup(int paramInt);

  public static native int getGroupCount();

  public static native String getGroupId(String paramString);

  public static native int getGroupSize(String paramString);

  public static native Call.History.Record getHistoryRecord(String paramString);

  public static native Call.HoldStates getHoldStates(String paramString);

  public static native ResponseStatusLine getInviteResponseStatusLine(String paramString);

  public static native NatTraversalStatus getNatTraversalStatus(String paramString);

  public static native int getNonTerminalCallCount();

  public static native Call.OfferedTransferInfo getOfferedTransferInfo(String paramString);

  public static native Call.PayloadNumbers getPayloadNumbers(String paramString);

  public static native double getRecordDuration(String paramString);

  public static native Call.Record.State getRecordState(String paramString);

  public static native Call.Record.State getRecordStateForGroup(String paramString);

  public static native Call.Statistics getStatistics(String paramString);

  public static native boolean hangup(String paramString);

  public static native boolean hold(String paramString, boolean paramBoolean);

  public static native boolean ignoreIncomingCall(String paramString);

  public static native boolean incomingCallOffersVideo(String paramString);

  public static native boolean isForwarding(String paramString);

  public static native boolean isSimulatedMicrophone();

  public static native boolean isTransferOffered(String paramString);

  public static native boolean isTransferring(String paramString);

  public static native boolean isValidCallId(String paramString);

  public static native Call.VideoAvailability isVideoAvailable(String paramString);

  public static native boolean moveCall(String paramString1, String paramString2);

  public static native boolean notifyIncomingRinging(String paramString);

  public static native boolean pauseRecording(String paramString);

  public static native boolean pauseRecordingForGroup(String paramString);

  public static native boolean rejectIncomingCall(String paramString);

  public static native boolean rejectOfferedTransfer(String paramString);

  public static native boolean setActiveGroup(String paramString);

  public static native boolean splitCall(String paramString);

  public static native boolean startRecording(String paramString);

  public static native boolean startRecordingForGroup(String paramString);

  public static native void startSimulatedMicrophone(int paramInt);

  public static native void stopSimulatedMicrophone();

  public static native boolean updateDesiredMedia(String paramString, Call.DesiredMedia paramDesiredMedia);

  public static native boolean webCallback(String paramString, Callee paramCallee);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.Instance.Calls
 * JD-Core Version:    0.6.2
 */