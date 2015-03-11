package com.enflick.android.TextNow.api.responsemodel;

import textnow.y.c;

public class User
{

  @c(a="area_code")
  public String areaCode;

  @c(a="credits")
  public int credits;

  @c(a="email")
  public String email;

  @c(a="email_verified")
  public int emailVerified;

  @c(a="expiry")
  public String expiry;

  @c(a="features")
  public User.Features features;

  @c(a="first_name")
  public String firstName;

  @c(a="forward_email")
  public String forwardEmail;

  @c(a="forward_messages")
  public int forwardMessages;

  @c(a="forwarding_expiry")
  public String forwardingExpiry;

  @c(a="forwarding_number")
  public String forwardingNumber;

  @c(a="forwarding_status")
  public String forwardingStatus;

  @c(a="has_password")
  public boolean hasPassword;

  @c(a="last_name")
  public String lastName;

  @c(a="last_update")
  public String lastUpdate;

  @c(a="phone_assigned_date")
  public String phoneAssignedDate;

  @c(a="phone_expiry")
  public String phoneExpiry;

  @c(a="phone_number")
  public String phoneNumber;

  @c(a="ringtone")
  public String ringtone;

  @c(a="signature")
  public String signature;

  @c(a="sip")
  public User.SIP sip;

  @c(a="timestamp")
  public String timestamp;

  @c(a="username")
  public String username;

  @c(a="voicemail")
  public String voicemail;

  @c(a="voicemail_timestamp")
  public String voicemailTimestamp;
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.responsemodel.User
 * JD-Core Version:    0.6.2
 */