package textnow.v;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.preference.PreferenceManager;

public final class a extends SQLiteOpenHelper
{
  StringBuilder a = new StringBuilder("SELECT * FROM (SELECT ").append("conversations").append(".").append("*, ").append("n.num_unread").append(" AS ").append("num_unread").append(", ").append("m.").append("message_text").append(" AS ").append("latest_message_text").append(", ").append("m.").append("date").append(" AS ").append("latest_message_date").append(", ").append("m.").append("message_type").append(" AS ").append("latest_message_type").append(", ").append("m.").append("message_direction").append(" AS ").append("latest_message_direction").append(" FROM ").append("conversations").append(" LEFT OUTER JOIN ").append(" (SELECT ").append("contact_value").append(", ").append("message_text").append(", ").append("message_direction").append(", ").append("date").append(", ").append("message_id").append(", ").append("message_type").append(" FROM ").append("messages").append(" ORDER BY ").append("date").append(" DESC ").append(") AS m").append(" ON (").append("conversations").append(".").append("contact_value").append(" = ").append("m.").append("contact_value").append(")").append(" LEFT OUTER JOIN ").append("(SELECT COUNT(*) AS num_unread, ").append("messages").append(".").append("contact_value").append(" FROM ").append("messages").append(" WHERE ").append("messages").append(".").append("read").append(" = 0 GROUP BY ").append("messages").append(".").append("contact_value").append(") AS n").append(" ON (").append("conversations").append(".").append("contact_value").append(" = ").append("n.").append("contact_value").append(")").append(" ORDER BY m.").append("date").append(", ").append("message_id").append(")").append(" GROUP BY ").append("_id");
  private Context b;
  private final String c = "create view view_conversations as " + this.a.toString() + ";";

  public a(Context paramContext)
  {
    super(paramContext, "textnow_data.db", null, 7);
    this.b = paramContext;
  }

  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table messages (_id integer primary key autoincrement, message_id integer unique, contact_value text not null, contact_type integer, contact_name text not null, message_direction integer, message_type integer, message_text text not null, read boolean, date numeric not null, state integer default 0, attach text default '', message_source integer default 0); ");
    paramSQLiteDatabase.execSQL("create table conversations (_id integer primary key autoincrement, contact_value text not null unique, contact_type integer, contact_name text default '', message_count integer, contact_uri text default '',custom_wallpaper text default '', custom_ringtone text default ''); ");
    paramSQLiteDatabase.execSQL(this.c);
    paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_conversation ON conversations (contact_value)");
    paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_message ON messages (contact_value,date)");
    paramSQLiteDatabase.execSQL("create table groups (_id integer primary key autoincrement, contact_value text not null unique, title text default ''); ");
    paramSQLiteDatabase.execSQL("create table group_members (_id integer primary key autoincrement, contact_value text not null, member_contact_value text not null, member_contact_type integer, member_display_name text not null,member_contact_uri text); ");
    paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_groups ON groups (contact_value)");
    paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_group_members ON group_members (contact_value)");
    paramSQLiteDatabase.execSQL("create table proxy (_id integer primary key autoincrement, contact_value text not null unique, proxy_number text default '', update_date numeric not null); ");
    paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_proxy ON proxy (contact_value)");
  }

  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
    {
      if (paramInt1 == 1)
      {
        new StringBuilder().append("Upgrading database from version ").append(paramInt1).append(" to ").append(paramInt2).append(" => add state column and modify conversation view").toString();
        StringBuilder localStringBuilder5 = new StringBuilder();
        localStringBuilder5.append("ALTER TABLE ").append("messages").append(" ADD COLUMN ").append("state").append(" INTEGER DEFAULT 0");
        paramSQLiteDatabase.execSQL(localStringBuilder5.toString());
        paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_conversation ON conversations (contact_value)");
        paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_message ON messages (contact_value,date)");
        paramSQLiteDatabase.execSQL("DROP VIEW  IF EXISTS view_conversations");
        paramSQLiteDatabase.execSQL(this.c);
        onUpgrade(paramSQLiteDatabase, paramInt1 + 1, paramInt2);
      }
    }
    else
      return;
    if (paramInt1 == 2)
    {
      new StringBuilder().append("Upgrading database from version ").append(paramInt1).append(" to ").append(paramInt2).append(" => add message attachment column").toString();
      StringBuilder localStringBuilder4 = new StringBuilder();
      localStringBuilder4.append("ALTER TABLE ").append("messages").append(" ADD COLUMN ").append("attach").append(" TEXT DEFAULT ''");
      paramSQLiteDatabase.execSQL(localStringBuilder4.toString());
      onUpgrade(paramSQLiteDatabase, paramInt1 + 1, paramInt2);
      return;
    }
    if (paramInt1 == 3)
    {
      new StringBuilder().append("Upgrading database from version ").append(paramInt1).append(" to ").append(paramInt2).append(" => add wallpaper and ringtone columns").toString();
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("ALTER TABLE ").append("conversations").append(" ADD COLUMN ").append("custom_wallpaper").append(" TEXT DEFAULT ''");
      paramSQLiteDatabase.execSQL(localStringBuilder2.toString());
      StringBuilder localStringBuilder3 = new StringBuilder();
      localStringBuilder3.append("ALTER TABLE ").append("conversations").append(" ADD COLUMN ").append("custom_ringtone").append(" TEXT DEFAULT ''");
      paramSQLiteDatabase.execSQL(localStringBuilder3.toString());
      onUpgrade(paramSQLiteDatabase, paramInt1 + 1, paramInt2);
      return;
    }
    if (paramInt1 == 4)
    {
      new StringBuilder().append("Upgrading database from version ").append(paramInt1).append(" to ").append(paramInt2).append(" => add message source column").toString();
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("ALTER TABLE ").append("messages").append(" ADD COLUMN ").append("message_source").append(" INTEGER DEFAULT 0");
      paramSQLiteDatabase.execSQL(localStringBuilder1.toString());
      onUpgrade(paramSQLiteDatabase, paramInt1 + 1, paramInt2);
      return;
    }
    if (paramInt1 == 5)
    {
      new StringBuilder().append("Upgrading database from version ").append(paramInt1).append(" to ").append(paramInt2).append(" => add groups and group_members tables").toString();
      paramSQLiteDatabase.execSQL("create table groups (_id integer primary key autoincrement, contact_value text not null unique, title text default ''); ");
      paramSQLiteDatabase.execSQL("create table group_members (_id integer primary key autoincrement, contact_value text not null, member_contact_value text not null, member_contact_type integer, member_display_name text not null,member_contact_uri text); ");
      paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_groups ON groups (contact_value)");
      paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_group_members ON group_members (contact_value)");
      onUpgrade(paramSQLiteDatabase, paramInt1 + 1, paramInt2);
      return;
    }
    if (paramInt1 == 6)
    {
      new StringBuilder().append("Upgrading database from version ").append(paramInt1).append(" to ").append(paramInt2).append(" => add contact proxy number column").toString();
      paramSQLiteDatabase.execSQL("create table proxy (_id integer primary key autoincrement, contact_value text not null unique, proxy_number text default '', update_date numeric not null); ");
      paramSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_proxy ON proxy (contact_value)");
      onUpgrade(paramSQLiteDatabase, paramInt1 + 1, paramInt2);
      return;
    }
    new StringBuilder().append("Upgrading mDatabase from version ").append(paramInt1).append(" to ").append(paramInt2).append(" => destroying all old data").toString();
    PreferenceManager.getDefaultSharedPreferences(this.b).edit().clear().commit();
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS messages");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversations");
    paramSQLiteDatabase.execSQL("DROP VIEW  IF EXISTS view_conversations");
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS index_conversation");
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS index_message");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS groups");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS group_members");
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS index_groups");
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS index_group_members");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS proxy");
    paramSQLiteDatabase.execSQL("DROP INDEX IF EXISTS index_proxy");
    onCreate(paramSQLiteDatabase);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.v.a
 * JD-Core Version:    0.6.2
 */