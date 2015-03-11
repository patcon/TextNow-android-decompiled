package cz.acrobits.libsoftphone.data;

import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.R.string;

public enum Call$State
{
  static
  {
    Trying = new State("Trying", 1);
    Ringing = new State("Ringing", 2);
    Busy = new State("Busy", 3);
    IncomingTrying = new State("IncomingTrying", 4);
    IncomingRinging = new State("IncomingRinging", 5);
    IncomingIgnored = new State("IncomingIgnored", 6);
    IncomingRejected = new State("IncomingRejected", 7);
    IncomingMissed = new State("IncomingMissed", 8);
    Established = new State("Established", 9);
    Error = new State("Error", 10);
    Unauthorized = new State("Unauthorized", 11);
    Terminated = new State("Terminated", 12);
    IncomingForwarded = new State("IncomingForwarded", 13);
    IncomingAnsweredElsewhere = new State("IncomingAnsweredElsewhere", 14);
    State[] arrayOfState = new State[15];
    arrayOfState[0] = Unknown;
    arrayOfState[1] = Trying;
    arrayOfState[2] = Ringing;
    arrayOfState[3] = Busy;
    arrayOfState[4] = IncomingTrying;
    arrayOfState[5] = IncomingRinging;
    arrayOfState[6] = IncomingIgnored;
    arrayOfState[7] = IncomingRejected;
    arrayOfState[8] = IncomingMissed;
    arrayOfState[9] = Established;
    arrayOfState[10] = Error;
    arrayOfState[11] = Unauthorized;
    arrayOfState[12] = Terminated;
    arrayOfState[13] = IncomingForwarded;
    arrayOfState[14] = IncomingAnsweredElsewhere;
  }

  public static String getLabel(State paramState)
  {
    int i;
    switch (Call.1.$SwitchMap$cz$acrobits$libsoftphone$data$Call$State[paramState.ordinal()])
    {
    case 3:
    case 4:
    case 5:
    default:
      return null;
    case 9:
    case 10:
      i = R.string.call_state_trying;
    case 11:
    case 12:
    case 1:
    case 2:
    case 13:
    case 14:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      return AndroidUtil.getResourceString(i);
      i = R.string.call_state_ringing;
      continue;
      i = R.string.call_state_established;
      continue;
      i = R.string.call_state_busy;
      continue;
      i = R.string.call_state_terminated;
      continue;
      i = R.string.call_state_incoming;
      continue;
      i = R.string.call_state_missed;
      continue;
      i = R.string.call_state_unauthorized;
      continue;
      i = R.string.call_state_error;
    }
  }

  public static boolean isTerminal(State paramState)
  {
    switch (Call.1.$SwitchMap$cz$acrobits$libsoftphone$data$Call$State[paramState.ordinal()])
    {
    default:
      return false;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    return true;
  }

  public final String getLabel()
  {
    return getLabel(this);
  }

  public final boolean isTerminal()
  {
    return isTerminal(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Call.State
 * JD-Core Version:    0.6.2
 */