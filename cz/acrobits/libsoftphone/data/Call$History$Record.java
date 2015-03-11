package cz.acrobits.libsoftphone.data;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.RawContacts;
import android.text.format.DateUtils;
import android.text.format.Time;
import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.Instance.NumberRewriting;
import cz.acrobits.libsoftphone.R.string;
import cz.acrobits.libsoftphone.SDK;
import cz.acrobits.libsoftphone.SDK.Feature;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class Call$History$Record
  implements Serializable
{
  private static final String[] CONTACT_MATCH_PROJECTION = { "raw_contact_id", "data1", "display_name", "data2", "data3" };
  private static final int[] RESOURCE_WEEK_DAYS;
  private static final long serialVersionUID = -428070330518975880L;
  public Map<String, String> attributes = new HashMap();
  public Callee callee;
  public long contactId;
  public long date;
  public Call.History.Direction direction;
  public long duration;
  public long elapsed;
  public long id;
  public String label;
  public String recording;
  public Call.History.Result result;
  public String title;

  static
  {
    int[] arrayOfInt = new int[7];
    arrayOfInt[0] = R.string.sunday;
    arrayOfInt[1] = R.string.monday;
    arrayOfInt[2] = R.string.tuesday;
    arrayOfInt[3] = R.string.wednesday;
    arrayOfInt[4] = R.string.thursday;
    arrayOfInt[5] = R.string.friday;
    arrayOfInt[6] = R.string.saturday;
    RESOURCE_WEEK_DAYS = arrayOfInt;
  }

  public static Record createFromAddressBook(long paramLong)
  {
    String[] arrayOfString1 = { "_id", "display_name" };
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = Long.valueOf(paramLong).toString();
    Context localContext = AndroidUtil.getApplicationContext();
    Cursor localCursor1 = localContext.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, arrayOfString1, "contact_id=?", arrayOfString2, null);
    if (localCursor1 == null)
      return null;
    if (!localCursor1.moveToFirst())
    {
      localCursor1.close();
      return null;
    }
    Record localRecord = new Record();
    localRecord.contactId = localCursor1.getLong(0);
    localRecord.title = localCursor1.getString(1);
    localCursor1.close();
    String[] arrayOfString3 = { "data1", "data2" };
    String[] arrayOfString4 = new String[1];
    arrayOfString4[0] = Long.valueOf(localRecord.contactId).toString();
    Cursor localCursor2 = localContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, arrayOfString3, "raw_contact_id=?", arrayOfString4, "ABS (is_primary) DESC");
    if (localCursor2 == null)
      return localRecord;
    if (!localCursor2.moveToFirst())
    {
      localCursor2.close();
      return localRecord;
    }
    localRecord.callee = new Callee(localCursor2.getString(0));
    localRecord.label = localContext.getResources().getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(localCursor2.getInt(1))).toString();
    localCursor2.close();
    return localRecord;
  }

  public static Record createFromCallee(Callee paramCallee)
  {
    Context localContext = AndroidUtil.getApplicationContext();
    Record localRecord = new Record();
    localRecord.callee = paramCallee;
    Cursor localCursor;
    int j;
    int m;
    if (!paramCallee.isEmpty())
    {
      localCursor = getContactMatchCursor(localContext, paramCallee.canonical());
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        j = 1;
        if (j == 0)
        {
          if (localCursor != null)
          {
            localCursor.close();
            localCursor = null;
          }
          if (AndroidUtil.contains(SDK.features, SDK.Feature.NumberRewriting))
          {
            String[] arrayOfString = Instance.NumberRewriting.getABMatchingNumbers(localRecord.callee.canonical());
            int k = arrayOfString.length;
            m = 0;
            label98: if (m < k)
            {
              String str2 = arrayOfString[m];
              localCursor = getContactMatchCursor(localContext, paramCallee.canonical());
              if ((localCursor == null) || (!localCursor.moveToFirst()))
                break label239;
              localRecord.callee = new Callee(str2);
            }
          }
        }
      }
    }
    while (true)
    {
      if (localCursor != null)
      {
        if (localCursor.getCount() > 0)
        {
          localCursor.moveToFirst();
          int i = localCursor.getInt(3);
          String str1 = localCursor.getString(4);
          localRecord.label = ContactsContract.CommonDataKinds.Phone.getTypeLabel(localContext.getResources(), i, str1).toString();
          localRecord.title = localCursor.getString(2);
          localRecord.contactId = localCursor.getLong(0);
        }
        localCursor.close();
      }
      return localRecord;
      j = 0;
      break;
      label239: if (localCursor != null)
      {
        localCursor.close();
        localCursor = null;
      }
      m++;
      break label98;
      localCursor = null;
    }
  }

  public static Record createFromNumber(String paramString)
  {
    return createFromCallee(new Callee(paramString));
  }

  private static Cursor getContactMatchCursor(Context paramContext, String paramString)
  {
    String[] arrayOfString = { paramString };
    return paramContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, CONTACT_MATCH_PROJECTION, "replace(replace(data1, '-',''), ' ', '') = ?", arrayOfString, null);
  }

  public final String getDateLabel(Context paramContext)
  {
    Time localTime = new Time();
    localTime.setToNow();
    localTime.hour = 0;
    localTime.minute = 0;
    localTime.second = 0;
    if (this.date >= localTime.toMillis(false))
      return DateUtils.formatDateTime(paramContext, this.date, 2817);
    localTime.monthDay = (-1 + localTime.monthDay);
    if (this.date >= localTime.toMillis(true))
      return paramContext.getString(R.string.yesterday);
    localTime.monthDay = (-6 + localTime.monthDay);
    if (this.date >= localTime.toMillis(true))
    {
      localTime.set(this.date);
      localTime.normalize(true);
      return paramContext.getString(RESOURCE_WEEK_DAYS[localTime.weekDay]);
    }
    return DateUtils.formatDateTime(paramContext, this.date, 16);
  }

  public final String getDurationLabel()
  {
    return DateUtils.formatElapsedTime(this.duration);
  }

  public final String getElapsedLabel()
  {
    return DateUtils.formatElapsedTime(this.elapsed);
  }

  public final CharSequence getResultLabel()
  {
    return Call.History.Result.getLabel(this.result);
  }

  public final String getTimeLabel(Context paramContext)
  {
    return DateUtils.formatDateTime(paramContext, this.date, 2837);
  }

  public final boolean group(Record paramRecord)
  {
    return (paramRecord != null) && (paramRecord.callee.equals(this.callee));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Call.History.Record
 * JD-Core Version:    0.6.2
 */