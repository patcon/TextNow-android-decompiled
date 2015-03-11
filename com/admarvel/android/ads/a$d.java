package com.admarvel.android.ads;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

class a$d
  implements MediaPlayer.OnPreparedListener
{
  a$d(a parama)
  {
  }

  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    a.a(this.a, 2);
    a.a(this.a, a.b(this.a, a.c(this.a, true)));
    if (a.a(this.a) != null)
      a.a(this.a).onPrepared(a.b(this.a));
    if (this.a.e != null)
      this.a.e.d();
    int i = a.c(this.a);
    if (i != 0)
      this.a.seekTo(i);
    if ((this.a.c != 0) && (this.a.d != 0))
    {
      this.a.i();
      if (a.d(this.a) == 3)
        this.a.start();
    }
    while (a.d(this.a) != 3)
    {
      do
        return;
      while ((this.a.isPlaying()) || (i != 0) || (this.a.getCurrentPosition() <= 0));
      return;
    }
    this.a.start();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.a.d
 * JD-Core Version:    0.6.2
 */