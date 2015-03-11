package twitter4j.json;

import twitter4j.internal.logging.Logger;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

public final class JSONObjectType
{
  private static final Logger logger = Logger.getLogger(JSONObjectType.class);

  public static JSONObjectType.Type determine(JSONObject paramJSONObject)
  {
    if (!paramJSONObject.isNull("sender"))
      return JSONObjectType.Type.SENDER;
    if (!paramJSONObject.isNull("text"))
      return JSONObjectType.Type.STATUS;
    if (!paramJSONObject.isNull("direct_message"))
      return JSONObjectType.Type.DIRECT_MESSAGE;
    if (!paramJSONObject.isNull("delete"))
      return JSONObjectType.Type.DELETE;
    if (!paramJSONObject.isNull("limit"))
      return JSONObjectType.Type.LIMIT;
    if (!paramJSONObject.isNull("warning"))
      return JSONObjectType.Type.STALL_WARNING;
    if (!paramJSONObject.isNull("scrub_geo"))
      return JSONObjectType.Type.SCRUB_GEO;
    if (!paramJSONObject.isNull("friends"))
      return JSONObjectType.Type.FRIENDS;
    if (!paramJSONObject.isNull("event"))
      try
      {
        String str = paramJSONObject.getString("event");
        if ("favorite".equals(str))
          return JSONObjectType.Type.FAVORITE;
        if ("unfavorite".equals(str))
          return JSONObjectType.Type.UNFAVORITE;
        if ("follow".equals(str))
          return JSONObjectType.Type.FOLLOW;
        if ("unfollow".equals(str))
          return JSONObjectType.Type.UNFOLLOW;
        if (str.startsWith("list"))
        {
          if ("list_member_added".equals(str))
            return JSONObjectType.Type.USER_LIST_MEMBER_ADDED;
          if ("list_member_removed".equals(str))
            return JSONObjectType.Type.USER_LIST_MEMBER_DELETED;
          if ("list_user_subscribed".equals(str))
            return JSONObjectType.Type.USER_LIST_SUBSCRIBED;
          if ("list_user_unsubscribed".equals(str))
            return JSONObjectType.Type.USER_LIST_UNSUBSCRIBED;
          if ("list_created".equals(str))
            return JSONObjectType.Type.USER_LIST_CREATED;
          if ("list_updated".equals(str))
            return JSONObjectType.Type.USER_LIST_UPDATED;
          if ("list_destroyed".equals(str))
            return JSONObjectType.Type.USER_LIST_DESTROYED;
        }
        else
        {
          if ("user_update".equals(str))
            return JSONObjectType.Type.USER_UPDATE;
          if ("block".equals(str))
            return JSONObjectType.Type.BLOCK;
          if ("unblock".equals(str))
          {
            JSONObjectType.Type localType = JSONObjectType.Type.UNBLOCK;
            return localType;
          }
        }
      }
      catch (JSONException localJSONException1)
      {
      }
    try
    {
      logger.warn("Failed to get event element: ", paramJSONObject.toString(2));
      label329: 
      do
        return JSONObjectType.Type.UNKNOWN;
      while (paramJSONObject.isNull("disconnect"));
      return JSONObjectType.Type.DISCONNECTION;
    }
    catch (JSONException localJSONException2)
    {
      break label329;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     twitter4j.json.JSONObjectType
 * JD-Core Version:    0.6.2
 */