package com.mopub.mobileads;

 enum AdFetcher$FetchStatus
{
  static
  {
    FETCH_CANCELLED = new FetchStatus("FETCH_CANCELLED", 1);
    INVALID_SERVER_RESPONSE_BACKOFF = new FetchStatus("INVALID_SERVER_RESPONSE_BACKOFF", 2);
    INVALID_SERVER_RESPONSE_NOBACKOFF = new FetchStatus("INVALID_SERVER_RESPONSE_NOBACKOFF", 3);
    CLEAR_AD_TYPE = new FetchStatus("CLEAR_AD_TYPE", 4);
    AD_WARMING_UP = new FetchStatus("AD_WARMING_UP", 5);
    FetchStatus[] arrayOfFetchStatus = new FetchStatus[6];
    arrayOfFetchStatus[0] = NOT_SET;
    arrayOfFetchStatus[1] = FETCH_CANCELLED;
    arrayOfFetchStatus[2] = INVALID_SERVER_RESPONSE_BACKOFF;
    arrayOfFetchStatus[3] = INVALID_SERVER_RESPONSE_NOBACKOFF;
    arrayOfFetchStatus[4] = CLEAR_AD_TYPE;
    arrayOfFetchStatus[5] = AD_WARMING_UP;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.AdFetcher.FetchStatus
 * JD-Core Version:    0.6.2
 */