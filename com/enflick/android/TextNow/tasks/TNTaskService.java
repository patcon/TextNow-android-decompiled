package com.enflick.android.TextNow.tasks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TNTaskService extends Service
{
  private ExecutorService a;
  private ExecutorService b;
  private boolean c = false;

  private Runnable a(final c paramc)
  {
    return new Runnable()
    {
      public final void run()
      {
        new StringBuilder().append("Starting to run task (").append(paramc.e()).append("):").append(paramc.getClass().getSimpleName()).toString();
        paramc.run();
        new StringBuilder().append("Finished running task (").append(paramc.e()).append("):").append(paramc.getClass().getSimpleName()).toString();
        TNTaskService.a(TNTaskService.this, paramc);
      }
    };
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
    super.onCreate();
    this.a = Executors.newFixedThreadPool(10);
    this.b = Executors.newSingleThreadExecutor();
    this.c = true;
  }

  public void onDestroy()
  {
    this.a.shutdown();
    this.b.shutdown();
    this.c = false;
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    c localc;
    if (paramIntent != null)
    {
      Serializable localSerializable = paramIntent.getSerializableExtra("task");
      if ((localSerializable instanceof c))
      {
        localc = (c)localSerializable;
        localc.a(getApplicationContext());
        new StringBuilder().append("Queuing task (").append(localc.e()).append("):").append(localc.getClass().getSimpleName()).toString();
        if (!localc.e_())
          break label101;
        this.b.execute(a(localc));
      }
    }
    while (true)
    {
      return 2;
      label101: this.a.execute(a(localc));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.tasks.TNTaskService
 * JD-Core Version:    0.6.2
 */