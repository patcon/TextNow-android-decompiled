package cz.acrobits.libsoftphone.data;

import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.R.string;

public enum RegistrationState
{
  static
  {
    Discovering = new RegistrationState("Discovering", 1);
    NotRegistered = new RegistrationState("NotRegistered", 2);
    PushHandshake = new RegistrationState("PushHandshake", 3);
    Registering = new RegistrationState("Registering", 4);
    Registered = new RegistrationState("Registered", 5);
    Unregistering = new RegistrationState("Unregistering", 6);
    Unauthorized = new RegistrationState("Unauthorized", 7);
    Error = new RegistrationState("Error", 8);
    Forwarding = new RegistrationState("Forwarding", 9);
    RegistrationState[] arrayOfRegistrationState = new RegistrationState[10];
    arrayOfRegistrationState[0] = None;
    arrayOfRegistrationState[1] = Discovering;
    arrayOfRegistrationState[2] = NotRegistered;
    arrayOfRegistrationState[3] = PushHandshake;
    arrayOfRegistrationState[4] = Registering;
    arrayOfRegistrationState[5] = Registered;
    arrayOfRegistrationState[6] = Unregistering;
    arrayOfRegistrationState[7] = Unauthorized;
    arrayOfRegistrationState[8] = Error;
    arrayOfRegistrationState[9] = Forwarding;
  }

  public static String getLabel(RegistrationState paramRegistrationState)
  {
    int i;
    switch (1.$SwitchMap$cz$acrobits$libsoftphone$data$RegistrationState[paramRegistrationState.ordinal()])
    {
    default:
      return null;
    case 1:
      i = R.string.registration_state_discovering;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      return AndroidUtil.getResourceString(i);
      i = R.string.registration_state_not_registered;
      continue;
      i = R.string.registration_state_registering;
      continue;
      i = R.string.registration_state_unregistering;
      continue;
      i = R.string.registration_state_unauthorized;
      continue;
      i = R.string.registration_state_error;
      continue;
      i = R.string.registration_state_registered;
      continue;
      i = R.string.registration_state_forwarding;
      continue;
      i = R.string.registration_state_push_handshake;
    }
  }

  public final String getLabel()
  {
    return getLabel(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.RegistrationState
 * JD-Core Version:    0.6.2
 */