package com.mopub.mobileads;

public enum MoPubErrorCode
{
  private final String message;

  static
  {
    INTERNAL_ERROR = new MoPubErrorCode("INTERNAL_ERROR", 2, "Unable to serve ad due to invalid internal state.");
    CANCELLED = new MoPubErrorCode("CANCELLED", 3, "Ad request was cancelled.");
    ADAPTER_NOT_FOUND = new MoPubErrorCode("ADAPTER_NOT_FOUND", 4, "Unable to find Native Network or Custom Event adapter.");
    ADAPTER_CONFIGURATION_ERROR = new MoPubErrorCode("ADAPTER_CONFIGURATION_ERROR", 5, "Native Network or Custom Event adapter was configured incorrectly.");
    NETWORK_TIMEOUT = new MoPubErrorCode("NETWORK_TIMEOUT", 6, "Third-party network failed to respond in a timely manner.");
    NETWORK_NO_FILL = new MoPubErrorCode("NETWORK_NO_FILL", 7, "Third-party network failed to provide an ad.");
    NETWORK_INVALID_STATE = new MoPubErrorCode("NETWORK_INVALID_STATE", 8, "Third-party network failed due to invalid internal state.");
    MRAID_LOAD_ERROR = new MoPubErrorCode("MRAID_LOAD_ERROR", 9, "Error loading MRAID ad.");
    VIDEO_CACHE_ERROR = new MoPubErrorCode("VIDEO_CACHE_ERROR", 10, "Error creating a cache to store downloaded videos.");
    VIDEO_DOWNLOAD_ERROR = new MoPubErrorCode("VIDEO_DOWNLOAD_ERROR", 11, "Error downloading video.");
    UNSPECIFIED = new MoPubErrorCode("UNSPECIFIED", 12, "Unspecified error.");
    MoPubErrorCode[] arrayOfMoPubErrorCode = new MoPubErrorCode[13];
    arrayOfMoPubErrorCode[0] = NO_FILL;
    arrayOfMoPubErrorCode[1] = SERVER_ERROR;
    arrayOfMoPubErrorCode[2] = INTERNAL_ERROR;
    arrayOfMoPubErrorCode[3] = CANCELLED;
    arrayOfMoPubErrorCode[4] = ADAPTER_NOT_FOUND;
    arrayOfMoPubErrorCode[5] = ADAPTER_CONFIGURATION_ERROR;
    arrayOfMoPubErrorCode[6] = NETWORK_TIMEOUT;
    arrayOfMoPubErrorCode[7] = NETWORK_NO_FILL;
    arrayOfMoPubErrorCode[8] = NETWORK_INVALID_STATE;
    arrayOfMoPubErrorCode[9] = MRAID_LOAD_ERROR;
    arrayOfMoPubErrorCode[10] = VIDEO_CACHE_ERROR;
    arrayOfMoPubErrorCode[11] = VIDEO_DOWNLOAD_ERROR;
    arrayOfMoPubErrorCode[12] = UNSPECIFIED;
  }

  private MoPubErrorCode(String paramString)
  {
    this.message = paramString;
  }

  public final String toString()
  {
    return this.message;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MoPubErrorCode
 * JD-Core Version:    0.6.2
 */