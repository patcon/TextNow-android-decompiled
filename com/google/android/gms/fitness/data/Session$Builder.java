package com.google.android.gms.fitness.data;

import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

public class Session$Builder
{
  private long KS = 0L;
  private int SC = 4;
  private a SP;
  private long Sr = 0L;
  private String Tq;
  private String Tr;
  private String mName = null;

  public Session build()
  {
    boolean bool1;
    StringBuilder localStringBuilder;
    if (this.KS > 0L)
    {
      bool1 = true;
      o.a(bool1, "Start time should be specified.");
      boolean bool2;
      if (this.Sr != 0L)
      {
        boolean bool3 = this.Sr < this.KS;
        bool2 = false;
        if (!bool3);
      }
      else
      {
        bool2 = true;
      }
      o.a(bool2, "End time should be later than start time.");
      if (this.Tq == null)
      {
        localStringBuilder = new StringBuilder();
        if (this.mName != null)
          break label113;
      }
    }
    label113: for (String str = ""; ; str = this.mName)
    {
      this.Tq = (str + this.KS);
      return new Session(this, null);
      bool1 = false;
      break;
    }
  }

  public Builder cK(int paramInt)
  {
    this.SC = paramInt;
    return this;
  }

  public Builder setActivity(String paramString)
  {
    return cK(FitnessActivities.bp(paramString));
  }

  public Builder setDescription(String paramString)
  {
    if (paramString.length() <= 1000);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1000);
      o.b(bool, "Session description cannot exceed %d characters", arrayOfObject);
      this.Tr = paramString;
      return this;
    }
  }

  public Builder setEndTime(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong >= 0L);
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "End time should be positive.");
      this.Sr = paramTimeUnit.toMillis(paramLong);
      return this;
    }
  }

  public Builder setIdentifier(String paramString)
  {
    if ((paramString != null) && (TextUtils.getTrimmedLength(paramString) > 0));
    for (boolean bool = true; ; bool = false)
    {
      o.K(bool);
      this.Tq = paramString;
      return this;
    }
  }

  public Builder setName(String paramString)
  {
    if (paramString.length() <= 100);
    for (boolean bool = true; ; bool = false)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(100);
      o.b(bool, "Session name cannot exceed %d characters", arrayOfObject);
      this.mName = paramString;
      return this;
    }
  }

  public Builder setStartTime(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong > 0L);
    for (boolean bool = true; ; bool = false)
    {
      o.a(bool, "Start time should be positive.");
      this.KS = paramTimeUnit.toMillis(paramLong);
      return this;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.Session.Builder
 * JD-Core Version:    0.6.2
 */