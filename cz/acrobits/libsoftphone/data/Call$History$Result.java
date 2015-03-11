package cz.acrobits.libsoftphone.data;

import cz.acrobits.ali.AndroidUtil;
import cz.acrobits.libsoftphone.R.string;

public enum Call$History$Result
{
  static
  {
    Accepted = new Result("Accepted", 1);
    Missed = new Result("Missed", 2);
    Rejected = new Result("Rejected", 3);
    Busy = new Result("Busy", 4);
    Answered = new Result("Answered", 5);
    Unanswered = new Result("Unanswered", 6);
    Canceled = new Result("Canceled", 7);
    Error = new Result("Error", 8);
    Forwarded = new Result("Forwarded", 9);
    Initiated = new Result("Initiated", 10);
    AnsweredElsewhere = new Result("AnsweredElsewhere", 11);
    Result[] arrayOfResult = new Result[12];
    arrayOfResult[0] = Unknown;
    arrayOfResult[1] = Accepted;
    arrayOfResult[2] = Missed;
    arrayOfResult[3] = Rejected;
    arrayOfResult[4] = Busy;
    arrayOfResult[5] = Answered;
    arrayOfResult[6] = Unanswered;
    arrayOfResult[7] = Canceled;
    arrayOfResult[8] = Error;
    arrayOfResult[9] = Forwarded;
    arrayOfResult[10] = Initiated;
    arrayOfResult[11] = AnsweredElsewhere;
  }

  public static CharSequence getLabel(Result paramResult)
  {
    int i = getLabelResource(paramResult);
    if (i > 0)
      return AndroidUtil.getResourceString(i);
    return "";
  }

  public static int getLabelResource(Result paramResult)
  {
    switch (Call.1.$SwitchMap$cz$acrobits$libsoftphone$data$Call$History$Result[paramResult.ordinal()])
    {
    default:
      return -1;
    case 1:
      return R.string.call_history_result_accepted;
    case 2:
      return R.string.call_history_result_missed;
    case 3:
      return R.string.call_history_result_rejected;
    case 4:
      return R.string.call_history_result_busy;
    case 5:
      return R.string.call_history_result_answered;
    case 6:
      return R.string.call_history_result_unanswered;
    case 7:
      return R.string.call_history_result_canceled;
    case 8:
      return R.string.call_history_result_error;
    case 9:
      return R.string.call_history_result_forwarded;
    case 10:
    }
    return R.string.call_history_result_initiated;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     cz.acrobits.libsoftphone.data.Call.History.Result
 * JD-Core Version:    0.6.2
 */