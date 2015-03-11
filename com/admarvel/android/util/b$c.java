package com.admarvel.android.util;

class b$c extends b.a
{
  private static final byte[] h;
  private static final byte[] i;
  int c;
  public final boolean d;
  public final boolean e;
  public final boolean f;
  private final byte[] j;
  private int k;
  private final byte[] l;

  static
  {
    if (!b.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      g = bool;
      h = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
      i = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
      return;
    }
  }

  public b$c(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
    boolean bool2;
    boolean bool3;
    label35: label47: byte[] arrayOfByte;
    if ((paramInt & 0x1) == 0)
    {
      bool2 = bool1;
      this.d = bool2;
      if ((paramInt & 0x2) != 0)
        break label106;
      bool3 = bool1;
      this.e = bool3;
      if ((paramInt & 0x4) == 0)
        break label112;
      this.f = bool1;
      if ((paramInt & 0x8) != 0)
        break label117;
      arrayOfByte = h;
      label64: this.l = arrayOfByte;
      this.j = new byte[2];
      this.c = 0;
      if (!this.e)
        break label125;
    }
    label106: label112: label117: label125: for (int m = 19; ; m = -1)
    {
      this.k = m;
      return;
      bool2 = false;
      break;
      bool3 = false;
      break label35;
      bool1 = false;
      break label47;
      arrayOfByte = i;
      break label64;
    }
  }

  public boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte1 = this.l;
    byte[] arrayOfByte2 = this.a;
    int m = this.k;
    int n = paramInt2 + paramInt1;
    int i4;
    int i2;
    label58: int i39;
    int i40;
    int i6;
    int i5;
    switch (this.c)
    {
    default:
      i4 = -1;
      i2 = paramInt1;
      if (i4 != -1)
      {
        arrayOfByte2[0] = arrayOfByte1[(0x3F & i4 >> 18)];
        arrayOfByte2[1] = arrayOfByte1[(0x3F & i4 >> 12)];
        arrayOfByte2[2] = arrayOfByte1[(0x3F & i4 >> 6)];
        i39 = 4;
        arrayOfByte2[3] = arrayOfByte1[(i4 & 0x3F)];
        i40 = m - 1;
        if (i40 == 0)
        {
          if (this.f)
          {
            i39 = 5;
            arrayOfByte2[4] = 13;
          }
          i6 = i39 + 1;
          arrayOfByte2[i39] = 10;
          i5 = 19;
        }
      }
      break;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      label168: int i35;
      int i36;
      int i37;
      int i38;
      if (i2 + 3 <= n)
      {
        int i34 = (0xFF & paramArrayOfByte[i2]) << 16 | (0xFF & paramArrayOfByte[(i2 + 1)]) << 8 | 0xFF & paramArrayOfByte[(i2 + 2)];
        arrayOfByte2[i6] = arrayOfByte1[(0x3F & i34 >> 18)];
        arrayOfByte2[(i6 + 1)] = arrayOfByte1[(0x3F & i34 >> 12)];
        arrayOfByte2[(i6 + 2)] = arrayOfByte1[(0x3F & i34 >> 6)];
        arrayOfByte2[(i6 + 3)] = arrayOfByte1[(i34 & 0x3F)];
        i35 = i2 + 3;
        i36 = i6 + 4;
        i37 = i5 - 1;
        if (i37 != 0)
          break label1235;
        if (!this.f)
          break label1228;
        i38 = i36 + 1;
        arrayOfByte2[i36] = 13;
      }
      while (true)
      {
        i6 = i38 + 1;
        arrayOfByte2[i38] = 10;
        i2 = i35;
        i5 = 19;
        break label168;
        i4 = -1;
        i2 = paramInt1;
        break label58;
        if (paramInt1 + 2 > n)
          break;
        int i41 = (0xFF & this.j[0]) << 16;
        int i42 = paramInt1 + 1;
        int i43 = i41 | (0xFF & paramArrayOfByte[paramInt1]) << 8;
        int i44 = i42 + 1;
        int i45 = i43 | 0xFF & paramArrayOfByte[i42];
        this.c = 0;
        i4 = i45;
        i2 = i44;
        break label58;
        if (paramInt1 + 1 > n)
          break;
        int i1 = (0xFF & this.j[0]) << 16 | (0xFF & this.j[1]) << 8;
        i2 = paramInt1 + 1;
        int i3 = i1 | 0xFF & paramArrayOfByte[paramInt1];
        this.c = 0;
        i4 = i3;
        break label58;
        int i13;
        int i12;
        label770: int i16;
        label811: int i20;
        int i21;
        if (paramBoolean)
        {
          if (i2 - this.c == n - 1)
          {
            int i27;
            int i26;
            if (this.c > 0)
            {
              byte[] arrayOfByte8 = this.j;
              i27 = 1;
              i26 = arrayOfByte8[0];
            }
            while (true)
            {
              int i28 = (i26 & 0xFF) << 4;
              this.c -= i27;
              int i29 = i6 + 1;
              arrayOfByte2[i6] = arrayOfByte1[(0x3F & i28 >> 6)];
              int i30 = i29 + 1;
              arrayOfByte2[i29] = arrayOfByte1[(i28 & 0x3F)];
              if (this.d)
              {
                int i33 = i30 + 1;
                arrayOfByte2[i30] = 61;
                i30 = i33 + 1;
                arrayOfByte2[i33] = 61;
              }
              if (this.e)
              {
                if (this.f)
                {
                  int i32 = i30 + 1;
                  arrayOfByte2[i30] = 13;
                  i30 = i32;
                }
                int i31 = i30 + 1;
                arrayOfByte2[i30] = 10;
                i30 = i31;
              }
              i6 = i30;
              if ((g) || (this.c == 0))
                break;
              throw new AssertionError();
              int i25 = i2 + 1;
              i26 = paramArrayOfByte[i2];
              i2 = i25;
              i27 = 0;
            }
          }
          if (i2 - this.c == n - 2)
            if (this.c > 1)
            {
              byte[] arrayOfByte7 = this.j;
              i13 = 1;
              i12 = arrayOfByte7[0];
              int i14 = (i12 & 0xFF) << 10;
              if (this.c <= 0)
                break label995;
              byte[] arrayOfByte6 = this.j;
              int i24 = i13 + 1;
              i16 = arrayOfByte6[i13];
              i13 = i24;
              int i17 = i14 | (i16 & 0xFF) << 2;
              this.c -= i13;
              int i18 = i6 + 1;
              arrayOfByte2[i6] = arrayOfByte1[(0x3F & i17 >> 12)];
              int i19 = i18 + 1;
              arrayOfByte2[i18] = arrayOfByte1[(0x3F & i17 >> 6)];
              i20 = i19 + 1;
              arrayOfByte2[i19] = arrayOfByte1[(i17 & 0x3F)];
              if (!this.d)
                break label1221;
              i21 = i20 + 1;
              arrayOfByte2[i20] = 61;
            }
        }
        while (true)
        {
          if (this.e)
          {
            if (this.f)
            {
              int i23 = i21 + 1;
              arrayOfByte2[i21] = 13;
              i21 = i23;
            }
            int i22 = i21 + 1;
            arrayOfByte2[i21] = 10;
            i21 = i22;
          }
          i6 = i21;
          break;
          int i11 = i2 + 1;
          i12 = paramArrayOfByte[i2];
          i2 = i11;
          i13 = 0;
          break label770;
          label995: int i15 = i2 + 1;
          i16 = paramArrayOfByte[i2];
          i2 = i15;
          break label811;
          if ((!this.e) || (i6 <= 0) || (i5 == 19))
            break;
          int i10;
          if (this.f)
          {
            i10 = i6 + 1;
            arrayOfByte2[i6] = 13;
          }
          while (true)
          {
            i6 = i10 + 1;
            arrayOfByte2[i10] = 10;
            break;
            if ((!g) && (i2 != n))
            {
              throw new AssertionError();
              if (i2 != n - 1)
                break label1142;
              byte[] arrayOfByte5 = this.j;
              int i9 = this.c;
              this.c = (i9 + 1);
              arrayOfByte5[i9] = paramArrayOfByte[i2];
            }
            while (true)
            {
              this.b = i6;
              this.k = i5;
              return true;
              label1142: if (i2 == n - 2)
              {
                byte[] arrayOfByte3 = this.j;
                int i7 = this.c;
                this.c = (i7 + 1);
                arrayOfByte3[i7] = paramArrayOfByte[i2];
                byte[] arrayOfByte4 = this.j;
                int i8 = this.c;
                this.c = (i8 + 1);
                arrayOfByte4[i8] = paramArrayOfByte[(i2 + 1)];
              }
            }
            i10 = i6;
          }
          label1221: i21 = i20;
        }
        label1228: i38 = i36;
      }
      label1235: i5 = i37;
      i6 = i36;
      i2 = i35;
      continue;
      i5 = i40;
      i6 = i39;
      continue;
      i5 = m;
      i6 = 0;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.b.c
 * JD-Core Version:    0.6.2
 */