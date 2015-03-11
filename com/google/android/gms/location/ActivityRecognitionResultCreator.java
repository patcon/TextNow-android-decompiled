package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class ActivityRecognitionResultCreator
  implements Parcelable.Creator<ActivityRecognitionResult>
{
  public static final int CONTENT_DESCRIPTION;

  static void a(ActivityRecognitionResult paramActivityRecognitionResult, Parcel paramParcel, int paramInt)
  {
    int i = b.C(paramParcel);
    b.b(paramParcel, 1, paramActivityRecognitionResult.UV, false);
    b.c(paramParcel, 1000, paramActivityRecognitionResult.getVersionCode());
    b.a(paramParcel, 2, paramActivityRecognitionResult.UW);
    b.a(paramParcel, 3, paramActivityRecognitionResult.UX);
    b.G(paramParcel, i);
  }

  public ActivityRecognitionResult createFromParcel(Parcel paramParcel)
  {
    long l1 = 0L;
    int i = a.B(paramParcel);
    int j = 0;
    ArrayList localArrayList = null;
    long l2 = l1;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.A(paramParcel);
      switch (a.ar(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localArrayList = a.c(paramParcel, k, DetectedActivity.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        l2 = a.i(paramParcel, k);
        break;
      case 3:
        l1 = a.i(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new ActivityRecognitionResult(j, localArrayList, l2, l1);
  }

  public ActivityRecognitionResult[] newArray(int paramInt)
  {
    return new ActivityRecognitionResult[paramInt];
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.ActivityRecognitionResultCreator
 * JD-Core Version:    0.6.2
 */