package com.mopub.nativeads;

public enum NativeErrorCode
{
  private final String message;

  static
  {
    IMAGE_DOWNLOAD_FAILURE = new NativeErrorCode("IMAGE_DOWNLOAD_FAILURE", 2, "Unable to download images associated with ad.");
    INVALID_REQUEST_URL = new NativeErrorCode("INVALID_REQUEST_URL", 3, "Invalid request url.");
    UNEXPECTED_RESPONSE_CODE = new NativeErrorCode("UNEXPECTED_RESPONSE_CODE", 4, "Received unexpected response code from server.");
    SERVER_ERROR_RESPONSE_CODE = new NativeErrorCode("SERVER_ERROR_RESPONSE_CODE", 5, "Server returned erroneous response code.");
    CONNECTION_ERROR = new NativeErrorCode("CONNECTION_ERROR", 6, "Network is unavailable.");
    UNSPECIFIED = new NativeErrorCode("UNSPECIFIED", 7, "Unspecified error occurred.");
    NETWORK_INVALID_REQUEST = new NativeErrorCode("NETWORK_INVALID_REQUEST", 8, "Third-party network received invalid request.");
    NETWORK_TIMEOUT = new NativeErrorCode("NETWORK_TIMEOUT", 9, "Third-party network failed to respond in a timely manner.");
    NETWORK_NO_FILL = new NativeErrorCode("NETWORK_NO_FILL", 10, "Third-party network failed to provide an ad.");
    NETWORK_INVALID_STATE = new NativeErrorCode("NETWORK_INVALID_STATE", 11, "Third-party network failed due to invalid internal state.");
    NATIVE_ADAPTER_CONFIGURATION_ERROR = new NativeErrorCode("NATIVE_ADAPTER_CONFIGURATION_ERROR", 12, "Custom Event Native was configured incorrectly.");
    NATIVE_ADAPTER_NOT_FOUND = new NativeErrorCode("NATIVE_ADAPTER_NOT_FOUND", 13, "Unable to find Custom Event Native.");
    NativeErrorCode[] arrayOfNativeErrorCode = new NativeErrorCode[14];
    arrayOfNativeErrorCode[0] = EMPTY_AD_RESPONSE;
    arrayOfNativeErrorCode[1] = INVALID_JSON;
    arrayOfNativeErrorCode[2] = IMAGE_DOWNLOAD_FAILURE;
    arrayOfNativeErrorCode[3] = INVALID_REQUEST_URL;
    arrayOfNativeErrorCode[4] = UNEXPECTED_RESPONSE_CODE;
    arrayOfNativeErrorCode[5] = SERVER_ERROR_RESPONSE_CODE;
    arrayOfNativeErrorCode[6] = CONNECTION_ERROR;
    arrayOfNativeErrorCode[7] = UNSPECIFIED;
    arrayOfNativeErrorCode[8] = NETWORK_INVALID_REQUEST;
    arrayOfNativeErrorCode[9] = NETWORK_TIMEOUT;
    arrayOfNativeErrorCode[10] = NETWORK_NO_FILL;
    arrayOfNativeErrorCode[11] = NETWORK_INVALID_STATE;
    arrayOfNativeErrorCode[12] = NATIVE_ADAPTER_CONFIGURATION_ERROR;
    arrayOfNativeErrorCode[13] = NATIVE_ADAPTER_NOT_FOUND;
  }

  private NativeErrorCode(String paramString)
  {
    this.message = paramString;
  }

  public final String toString()
  {
    return this.message;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.NativeErrorCode
 * JD-Core Version:    0.6.2
 */