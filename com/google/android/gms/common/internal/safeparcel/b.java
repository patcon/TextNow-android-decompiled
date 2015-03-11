package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class b
{
  public static int C(Parcel paramParcel)
  {
    return E(paramParcel, 20293);
  }

  private static int E(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(0xFFFF0000 | paramInt);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }

  private static void F(Parcel paramParcel, int paramInt)
  {
    int i = paramParcel.dataPosition();
    int j = i - paramInt;
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(j);
    paramParcel.setDataPosition(i);
  }

  public static void G(Parcel paramParcel, int paramInt)
  {
    F(paramParcel, paramInt);
  }

  public static void a(Parcel paramParcel, int paramInt, byte paramByte)
  {
    b(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramByte);
  }

  public static void a(Parcel paramParcel, int paramInt, double paramDouble)
  {
    b(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble);
  }

  public static void a(Parcel paramParcel, int paramInt, float paramFloat)
  {
    b(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }

  public static void a(Parcel paramParcel, int paramInt, long paramLong)
  {
    b(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }

  public static void a(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBundle == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int i = E(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    F(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    if (paramIBinder == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int i = E(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    F(paramParcel, i);
  }

  public static void a(Parcel paramParcel1, int paramInt, Parcel paramParcel2, boolean paramBoolean)
  {
    if (paramParcel2 == null)
    {
      if (paramBoolean)
        b(paramParcel1, paramInt, 0);
      return;
    }
    int i = E(paramParcel1, paramInt);
    paramParcel1.appendFrom(paramParcel2, 0, paramParcel2.dataSize());
    F(paramParcel1, i);
  }

  public static void a(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramParcelable == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt1, 0);
      return;
    }
    int i = E(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    F(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null)
    {
      if (paramBoolean1)
        b(paramParcel, paramInt, 0);
      return;
    }
    b(paramParcel, paramInt, 4);
    boolean bool = paramBoolean.booleanValue();
    int i = 0;
    if (bool)
      i = 1;
    paramParcel.writeInt(i);
  }

  public static void a(Parcel paramParcel, int paramInt, Integer paramInteger, boolean paramBoolean)
  {
    if (paramInteger == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    b(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramInteger.intValue());
  }

  public static void a(Parcel paramParcel, int paramInt, Long paramLong, boolean paramBoolean)
  {
    if (paramLong == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    b(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong.longValue());
  }

  public static void a(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramString == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int i = E(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    F(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, List<String> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int i = E(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    F(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, short paramShort)
  {
    b(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramShort);
  }

  public static void a(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    b(paramParcel, paramInt, 4);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }

  public static void a(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int i = E(paramParcel, paramInt);
    paramParcel.writeByteArray(paramArrayOfByte);
    F(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    if (paramArrayOfInt == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int i = E(paramParcel, paramInt);
    paramParcel.writeIntArray(paramArrayOfInt);
    F(paramParcel, i);
  }

  public static <T extends Parcelable> void a(Parcel paramParcel, int paramInt1, T[] paramArrayOfT, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfT == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt1, 0);
      return;
    }
    int i = E(paramParcel, paramInt1);
    int j = paramArrayOfT.length;
    paramParcel.writeInt(j);
    int k = 0;
    if (k < j)
    {
      T ? = paramArrayOfT[k];
      if (? == null)
        paramParcel.writeInt(0);
      while (true)
      {
        k++;
        break;
        a(paramParcel, ?, paramInt2);
      }
    }
    F(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    if (paramArrayOfString == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int i = E(paramParcel, paramInt);
    paramParcel.writeStringArray(paramArrayOfString);
    F(paramParcel, i);
  }

  public static void a(Parcel paramParcel, int paramInt, byte[][] paramArrayOfByte, boolean paramBoolean)
  {
    int i = 0;
    if (paramArrayOfByte == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int j = E(paramParcel, paramInt);
    int k = paramArrayOfByte.length;
    paramParcel.writeInt(k);
    while (i < k)
    {
      paramParcel.writeByteArray(paramArrayOfByte[i]);
      i++;
    }
    F(paramParcel, j);
  }

  private static <T extends Parcelable> void a(Parcel paramParcel, T paramT, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    int k = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(k - j);
    paramParcel.setDataPosition(k);
  }

  private static void b(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 65535)
    {
      paramParcel.writeInt(0xFFFF0000 | paramInt1);
      paramParcel.writeInt(paramInt2);
      return;
    }
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }

  public static <T extends Parcelable> void b(Parcel paramParcel, int paramInt, List<T> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int i = E(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    int k = 0;
    if (k < j)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(k);
      if (localParcelable == null)
        paramParcel.writeInt(0);
      while (true)
      {
        k++;
        break;
        a(paramParcel, localParcelable, 0);
      }
    }
    F(paramParcel, i);
  }

  public static void c(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    b(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }

  public static void c(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean)
        b(paramParcel, paramInt, 0);
      return;
    }
    int i = E(paramParcel, paramInt);
    paramParcel.writeList(paramList);
    F(paramParcel, i);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.safeparcel.b
 * JD-Core Version:    0.6.2
 */