package com.google.android.gms.cast;

import com.google.android.gms.internal.ik;
import org.json.JSONArray;
import org.json.JSONObject;

public final class MediaStatus
{
  public static final long COMMAND_PAUSE = 1L;
  public static final long COMMAND_SEEK = 2L;
  public static final long COMMAND_SET_VOLUME = 4L;
  public static final long COMMAND_SKIP_BACKWARD = 32L;
  public static final long COMMAND_SKIP_FORWARD = 16L;
  public static final long COMMAND_TOGGLE_MUTE = 8L;
  public static final int IDLE_REASON_CANCELED = 2;
  public static final int IDLE_REASON_ERROR = 4;
  public static final int IDLE_REASON_FINISHED = 1;
  public static final int IDLE_REASON_INTERRUPTED = 3;
  public static final int IDLE_REASON_NONE = 0;
  public static final int PLAYER_STATE_BUFFERING = 4;
  public static final int PLAYER_STATE_IDLE = 1;
  public static final int PLAYER_STATE_PAUSED = 3;
  public static final int PLAYER_STATE_PLAYING = 2;
  public static final int PLAYER_STATE_UNKNOWN;
  private double FA;
  private boolean FB;
  private long[] FC;
  private JSONObject Fl;
  private MediaInfo Fm;
  private long Fu;
  private double Fv;
  private int Fw;
  private int Fx;
  private long Fy;
  private long Fz;

  public MediaStatus(JSONObject paramJSONObject)
  {
    a(paramJSONObject, 0);
  }

  public final int a(JSONObject paramJSONObject, int paramInt)
  {
    int i = 2;
    int j = 1;
    long l1 = paramJSONObject.getLong("mediaSessionId");
    if (l1 != this.Fu)
      this.Fu = l1;
    for (int k = j; ; k = 0)
    {
      String str1;
      int i3;
      if (paramJSONObject.has("playerState"))
      {
        str1 = paramJSONObject.getString("playerState");
        if (!str1.equals("IDLE"))
          break label406;
        i3 = j;
      }
      while (true)
      {
        if (i3 != this.Fw)
        {
          this.Fw = i3;
          k |= 2;
        }
        String str2;
        if ((i3 == j) && (paramJSONObject.has("idleReason")))
        {
          str2 = paramJSONObject.getString("idleReason");
          if (!str2.equals("CANCELLED"))
            break label454;
        }
        while (true)
        {
          label119: if (i != this.Fx)
          {
            this.Fx = i;
            k |= 2;
          }
          if (paramJSONObject.has("playbackRate"))
          {
            double d2 = paramJSONObject.getDouble("playbackRate");
            if (this.Fv != d2)
            {
              this.Fv = d2;
              k |= 2;
            }
          }
          if ((paramJSONObject.has("currentTime")) && ((paramInt & 0x2) == 0))
          {
            long l3 = ik.b(paramJSONObject.getDouble("currentTime"));
            if (l3 != this.Fy)
            {
              this.Fy = l3;
              k |= 2;
            }
          }
          if (paramJSONObject.has("supportedMediaCommands"))
          {
            long l2 = paramJSONObject.getLong("supportedMediaCommands");
            if (l2 != this.Fz)
            {
              this.Fz = l2;
              k |= 2;
            }
          }
          if ((paramJSONObject.has("volume")) && ((paramInt & 0x1) == 0))
          {
            JSONObject localJSONObject2 = paramJSONObject.getJSONObject("volume");
            double d1 = localJSONObject2.getDouble("level");
            if (d1 != this.FA)
            {
              this.FA = d1;
              k |= 2;
            }
            boolean bool = localJSONObject2.getBoolean("muted");
            if (bool != this.FB)
            {
              this.FB = bool;
              k |= 2;
            }
          }
          int n;
          long[] arrayOfLong2;
          if (paramJSONObject.has("activeTrackIds"))
          {
            JSONArray localJSONArray = paramJSONObject.getJSONArray("activeTrackIds");
            n = localJSONArray.length();
            arrayOfLong2 = new long[n];
            int i1 = 0;
            while (true)
              if (i1 < n)
              {
                arrayOfLong2[i1] = localJSONArray.getLong(i1);
                i1++;
                continue;
                label406: if (str1.equals("PLAYING"))
                {
                  i3 = i;
                  break;
                }
                if (str1.equals("PAUSED"))
                {
                  i3 = 3;
                  break;
                }
                if (!str1.equals("BUFFERING"))
                  break label702;
                i3 = 4;
                break;
                label454: if (str2.equals("INTERRUPTED"))
                {
                  i = 3;
                  break label119;
                }
                if (str2.equals("FINISHED"))
                {
                  i = j;
                  break label119;
                }
                if (!str2.equals("ERROR"))
                  break label697;
                i = 4;
                break label119;
              }
            if (this.FC != null);
          }
          while (true)
          {
            if (j != 0)
              this.FC = arrayOfLong2;
            int m = j;
            long[] arrayOfLong1 = arrayOfLong2;
            while (true)
            {
              if (m != 0)
              {
                this.FC = arrayOfLong1;
                k |= 2;
              }
              if (paramJSONObject.has("customData"))
              {
                this.Fl = paramJSONObject.getJSONObject("customData");
                k |= 2;
              }
              if (paramJSONObject.has("media"))
              {
                JSONObject localJSONObject1 = paramJSONObject.getJSONObject("media");
                this.Fm = new MediaInfo(localJSONObject1);
                k |= 2;
                if (localJSONObject1.has("metadata"))
                  k |= 4;
              }
              return k;
              if (this.FC.length != n)
                break;
              for (int i2 = 0; ; i2++)
              {
                if (i2 >= n)
                  break label691;
                if (this.FC[i2] != arrayOfLong2[i2])
                  break;
              }
              if (this.FC != null)
              {
                m = j;
                arrayOfLong1 = null;
              }
              else
              {
                arrayOfLong1 = null;
                m = 0;
              }
            }
            label691: j = 0;
          }
          label697: i = 0;
        }
        label702: i3 = 0;
      }
    }
  }

  public final long fw()
  {
    return this.Fu;
  }

  public final long[] getActiveTrackIds()
  {
    return this.FC;
  }

  public final JSONObject getCustomData()
  {
    return this.Fl;
  }

  public final int getIdleReason()
  {
    return this.Fx;
  }

  public final MediaInfo getMediaInfo()
  {
    return this.Fm;
  }

  public final double getPlaybackRate()
  {
    return this.Fv;
  }

  public final int getPlayerState()
  {
    return this.Fw;
  }

  public final long getStreamPosition()
  {
    return this.Fy;
  }

  public final double getStreamVolume()
  {
    return this.FA;
  }

  public final boolean isMediaCommandSupported(long paramLong)
  {
    return (paramLong & this.Fz) != 0L;
  }

  public final boolean isMute()
  {
    return this.FB;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.MediaStatus
 * JD-Core Version:    0.6.2
 */