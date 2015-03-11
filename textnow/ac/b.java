package textnow.ac;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.enflick.android.TextNow.api.responsemodel.Group;
import com.enflick.android.TextNow.api.responsemodel.Group.GroupMember;
import com.enflick.android.TextNow.persistence.contentproviders.d;
import com.enflick.android.TextNow.persistence.contentproviders.e;
import com.enflick.android.TextNow.persistence.contentproviders.f;
import com.enflick.android.TextNow.persistence.contentproviders.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import textnow.z.k;

public final class b
{
  private static final String[] a = { "_id", "contact_value" };
  private static final String[] b = { "_id", "member_contact_value" };
  private static Set<String> c = new HashSet();
  private static Set<String> d = new HashSet();

  private static ContentValues a(Group.GroupMember paramGroupMember, String paramString1, String paramString2, Uri paramUri)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("member_contact_value", paramGroupMember.contact_value);
    localContentValues.put("member_contact_type", paramGroupMember.contact_type);
    localContentValues.put("member_display_name", paramString2);
    localContentValues.put("contact_value", paramString1);
    if (paramUri != null)
      localContentValues.put("member_contact_uri", paramUri.toString());
    return localContentValues;
  }

  private static ContentValues a(Group paramGroup)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("contact_value", paramGroup.contact_value);
    localContentValues.put("title", paramGroup.title);
    return localContentValues;
  }

  // ERROR //
  public static Uri a(ContentResolver paramContentResolver, Group paramGroup)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_1
    //   4: ifnonnull +18 -> 22
    //   7: iconst_0
    //   8: istore_3
    //   9: iload_3
    //   10: ifne +50 -> 60
    //   13: aconst_null
    //   14: astore 25
    //   16: ldc 2
    //   18: monitorexit
    //   19: aload 25
    //   21: areturn
    //   22: aload_1
    //   23: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   26: invokestatic 77	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   29: ifeq +965 -> 994
    //   32: new 79	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   39: ldc 82
    //   41: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: aload_1
    //   45: invokevirtual 87	com/enflick/android/TextNow/api/responsemodel/Group:toString	()Ljava/lang/String;
    //   48: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: pop
    //   55: iconst_0
    //   56: istore_3
    //   57: goto -48 -> 9
    //   60: getstatic 32	textnow/ac/b:c	Ljava/util/Set;
    //   63: aload_1
    //   64: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   67: invokeinterface 94 2 0
    //   72: pop
    //   73: iconst_1
    //   74: anewarray 15	java/lang/String
    //   77: astore 5
    //   79: aload 5
    //   81: iconst_0
    //   82: aload_1
    //   83: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   86: aastore
    //   87: aload_0
    //   88: getstatic 99	com/enflick/android/TextNow/persistence/contentproviders/f:d	Landroid/net/Uri;
    //   91: getstatic 21	textnow/ac/b:a	[Ljava/lang/String;
    //   94: ldc 101
    //   96: aload 5
    //   98: aconst_null
    //   99: invokevirtual 107	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   102: astore 6
    //   104: new 109	java/util/ArrayList
    //   107: dup
    //   108: invokespecial 110	java/util/ArrayList:<init>	()V
    //   111: astore 7
    //   113: aload 6
    //   115: ifnull +13 -> 128
    //   118: aload 6
    //   120: invokeinterface 116 1 0
    //   125: ifne +119 -> 244
    //   128: aload_0
    //   129: getstatic 99	com/enflick/android/TextNow/persistence/contentproviders/f:d	Landroid/net/Uri;
    //   132: aload_1
    //   133: invokestatic 118	textnow/ac/b:a	(Lcom/enflick/android/TextNow/api/responsemodel/Group;)Landroid/content/ContentValues;
    //   136: invokevirtual 122	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   139: astore 8
    //   141: aload_1
    //   142: getfield 126	com/enflick/android/TextNow/api/responsemodel/Group:members	[Lcom/enflick/android/TextNow/api/responsemodel/Group$GroupMember;
    //   145: astore 9
    //   147: aload 9
    //   149: arraylength
    //   150: istore 10
    //   152: iconst_0
    //   153: istore 11
    //   155: iload 11
    //   157: iload 10
    //   159: if_icmpge +585 -> 744
    //   162: aload 9
    //   164: iload 11
    //   166: aaload
    //   167: astore 12
    //   169: aload_0
    //   170: aload 12
    //   172: getfield 43	com/enflick/android/TextNow/api/responsemodel/Group$GroupMember:contact_value	Ljava/lang/String;
    //   175: aload 12
    //   177: getfield 52	com/enflick/android/TextNow/api/responsemodel/Group$GroupMember:contact_type	Ljava/lang/String;
    //   180: invokestatic 132	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   183: invokevirtual 135	java/lang/Integer:intValue	()I
    //   186: invokestatic 140	textnow/v/k:a	(Landroid/content/ContentResolver;Ljava/lang/String;I)Landroid/net/Uri;
    //   189: astore 13
    //   191: aload 13
    //   193: ifnull +13 -> 206
    //   196: aload 7
    //   198: aload 13
    //   200: invokeinterface 143 2 0
    //   205: pop
    //   206: aload_0
    //   207: aload 12
    //   209: getfield 43	com/enflick/android/TextNow/api/responsemodel/Group$GroupMember:contact_value	Ljava/lang/String;
    //   212: invokestatic 146	textnow/v/k:b	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   215: astore 15
    //   217: aload_0
    //   218: getstatic 149	com/enflick/android/TextNow/persistence/contentproviders/e:d	Landroid/net/Uri;
    //   221: aload 12
    //   223: aload_1
    //   224: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   227: aload 15
    //   229: aload 13
    //   231: invokestatic 151	textnow/ac/b:a	(Lcom/enflick/android/TextNow/api/responsemodel/Group$GroupMember;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Landroid/content/ContentValues;
    //   234: invokevirtual 122	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   237: pop
    //   238: iinc 11 1
    //   241: goto -86 -> 155
    //   244: aload 6
    //   246: invokeinterface 155 1 0
    //   251: ifeq +737 -> 988
    //   254: aload 6
    //   256: aload 6
    //   258: ldc 17
    //   260: invokeinterface 159 2 0
    //   265: invokeinterface 163 2 0
    //   270: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   273: astore 31
    //   275: getstatic 99	com/enflick/android/TextNow/persistence/contentproviders/f:d	Landroid/net/Uri;
    //   278: aload 31
    //   280: invokevirtual 172	java/lang/Long:longValue	()J
    //   283: invokestatic 178	android/content/ContentUris:withAppendedId	(Landroid/net/Uri;J)Landroid/net/Uri;
    //   286: astore 32
    //   288: aload_0
    //   289: aload 32
    //   291: aload_1
    //   292: invokestatic 118	textnow/ac/b:a	(Lcom/enflick/android/TextNow/api/responsemodel/Group;)Landroid/content/ContentValues;
    //   295: ldc 101
    //   297: aload 5
    //   299: invokevirtual 182	android/content/ContentResolver:update	(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   302: pop
    //   303: aload_0
    //   304: aload_1
    //   305: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   308: invokestatic 185	textnow/ac/b:b	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/util/List;
    //   311: invokestatic 188	textnow/ac/b:a	(Ljava/util/List;)Ljava/util/Set;
    //   314: astore 34
    //   316: new 27	java/util/HashSet
    //   319: dup
    //   320: invokespecial 30	java/util/HashSet:<init>	()V
    //   323: astore 35
    //   325: aload_1
    //   326: getfield 126	com/enflick/android/TextNow/api/responsemodel/Group:members	[Lcom/enflick/android/TextNow/api/responsemodel/Group$GroupMember;
    //   329: astore 36
    //   331: aload 36
    //   333: arraylength
    //   334: istore 37
    //   336: iconst_0
    //   337: istore 38
    //   339: iload 38
    //   341: iload 37
    //   343: if_icmpge +324 -> 667
    //   346: aload 36
    //   348: iload 38
    //   350: aaload
    //   351: astore 39
    //   353: aload_0
    //   354: aload 39
    //   356: getfield 43	com/enflick/android/TextNow/api/responsemodel/Group$GroupMember:contact_value	Ljava/lang/String;
    //   359: aload 39
    //   361: getfield 52	com/enflick/android/TextNow/api/responsemodel/Group$GroupMember:contact_type	Ljava/lang/String;
    //   364: invokestatic 132	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   367: invokevirtual 135	java/lang/Integer:intValue	()I
    //   370: invokestatic 140	textnow/v/k:a	(Landroid/content/ContentResolver;Ljava/lang/String;I)Landroid/net/Uri;
    //   373: astore 40
    //   375: aload 40
    //   377: ifnull +13 -> 390
    //   380: aload 7
    //   382: aload 40
    //   384: invokeinterface 143 2 0
    //   389: pop
    //   390: iconst_2
    //   391: anewarray 15	java/lang/String
    //   394: astore 42
    //   396: aload 42
    //   398: iconst_0
    //   399: aload 39
    //   401: getfield 43	com/enflick/android/TextNow/api/responsemodel/Group$GroupMember:contact_value	Ljava/lang/String;
    //   404: aastore
    //   405: aload 42
    //   407: iconst_1
    //   408: aload_1
    //   409: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   412: aastore
    //   413: aload_0
    //   414: getstatic 149	com/enflick/android/TextNow/persistence/contentproviders/e:d	Landroid/net/Uri;
    //   417: getstatic 25	textnow/ac/b:b	[Ljava/lang/String;
    //   420: ldc 190
    //   422: aload 42
    //   424: aconst_null
    //   425: invokevirtual 107	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   428: astore 43
    //   430: aload_0
    //   431: aload 39
    //   433: getfield 43	com/enflick/android/TextNow/api/responsemodel/Group$GroupMember:contact_value	Ljava/lang/String;
    //   436: invokestatic 146	textnow/v/k:b	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    //   439: astore 44
    //   441: aload 43
    //   443: ifnull +13 -> 456
    //   446: aload 43
    //   448: invokeinterface 116 1 0
    //   453: ifne +55 -> 508
    //   456: aload_0
    //   457: getstatic 149	com/enflick/android/TextNow/persistence/contentproviders/e:d	Landroid/net/Uri;
    //   460: aload 39
    //   462: aload_1
    //   463: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   466: aload 44
    //   468: aload 40
    //   470: invokestatic 151	textnow/ac/b:a	(Lcom/enflick/android/TextNow/api/responsemodel/Group$GroupMember;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Landroid/content/ContentValues;
    //   473: invokevirtual 122	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   476: astore 45
    //   478: new 79	java/lang/StringBuilder
    //   481: dup
    //   482: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   485: ldc 192
    //   487: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   490: aload 45
    //   492: invokevirtual 62	android/net/Uri:toString	()Ljava/lang/String;
    //   495: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   501: pop
    //   502: iinc 38 1
    //   505: goto -166 -> 339
    //   508: aload 43
    //   510: invokeinterface 155 1 0
    //   515: ifeq +116 -> 631
    //   518: aload 43
    //   520: aload 43
    //   522: ldc 23
    //   524: invokeinterface 159 2 0
    //   529: invokeinterface 196 2 0
    //   534: astore 49
    //   536: aload 34
    //   538: aload 49
    //   540: invokeinterface 199 2 0
    //   545: ifne +36 -> 581
    //   548: aload 35
    //   550: aload 49
    //   552: invokeinterface 199 2 0
    //   557: ifne +24 -> 581
    //   560: aload_0
    //   561: getstatic 149	com/enflick/android/TextNow/persistence/contentproviders/e:d	Landroid/net/Uri;
    //   564: aload 39
    //   566: aload_1
    //   567: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   570: aload 44
    //   572: aload 40
    //   574: invokestatic 151	textnow/ac/b:a	(Lcom/enflick/android/TextNow/api/responsemodel/Group$GroupMember;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Landroid/content/ContentValues;
    //   577: invokevirtual 122	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   580: pop
    //   581: aload 34
    //   583: aload 49
    //   585: invokeinterface 202 2 0
    //   590: ifeq +13 -> 603
    //   593: aload 35
    //   595: aload 49
    //   597: invokeinterface 94 2 0
    //   602: pop
    //   603: aload 43
    //   605: invokeinterface 205 1 0
    //   610: goto -108 -> 502
    //   613: astore 30
    //   615: aload 6
    //   617: invokeinterface 205 1 0
    //   622: aload 30
    //   624: athrow
    //   625: astore_2
    //   626: ldc 2
    //   628: monitorexit
    //   629: aload_2
    //   630: athrow
    //   631: aload_0
    //   632: getstatic 149	com/enflick/android/TextNow/persistence/contentproviders/e:d	Landroid/net/Uri;
    //   635: aload 39
    //   637: aload_1
    //   638: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   641: aload 44
    //   643: aload 40
    //   645: invokestatic 151	textnow/ac/b:a	(Lcom/enflick/android/TextNow/api/responsemodel/Group$GroupMember;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)Landroid/content/ContentValues;
    //   648: invokevirtual 122	android/content/ContentResolver:insert	(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    //   651: pop
    //   652: goto -49 -> 603
    //   655: astore 47
    //   657: aload 43
    //   659: invokeinterface 205 1 0
    //   664: aload 47
    //   666: athrow
    //   667: aload 34
    //   669: invokeinterface 209 1 0
    //   674: astore 52
    //   676: aload 52
    //   678: invokeinterface 214 1 0
    //   683: ifeq +50 -> 733
    //   686: aload 52
    //   688: invokeinterface 218 1 0
    //   693: checkcast 15	java/lang/String
    //   696: astore 53
    //   698: iconst_2
    //   699: anewarray 15	java/lang/String
    //   702: astore 54
    //   704: aload 54
    //   706: iconst_0
    //   707: aload 53
    //   709: aastore
    //   710: aload 54
    //   712: iconst_1
    //   713: aload_1
    //   714: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   717: aastore
    //   718: aload_0
    //   719: getstatic 149	com/enflick/android/TextNow/persistence/contentproviders/e:d	Landroid/net/Uri;
    //   722: ldc 190
    //   724: aload 54
    //   726: invokevirtual 222	android/content/ContentResolver:delete	(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    //   729: pop
    //   730: goto -54 -> 676
    //   733: aload 32
    //   735: astore 8
    //   737: aload 6
    //   739: invokeinterface 205 1 0
    //   744: aload 6
    //   746: ifnull +20 -> 766
    //   749: aload 6
    //   751: invokeinterface 225 1 0
    //   756: ifne +10 -> 766
    //   759: aload 6
    //   761: invokeinterface 205 1 0
    //   766: aload_1
    //   767: getfield 70	com/enflick/android/TextNow/api/responsemodel/Group:title	Ljava/lang/String;
    //   770: astore 17
    //   772: aload 17
    //   774: invokestatic 77	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   777: ifeq +74 -> 851
    //   780: aload_0
    //   781: aload_1
    //   782: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   785: invokestatic 185	textnow/ac/b:b	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/util/List;
    //   788: astore 26
    //   790: new 109	java/util/ArrayList
    //   793: dup
    //   794: invokespecial 110	java/util/ArrayList:<init>	()V
    //   797: astore 27
    //   799: aload 26
    //   801: invokeinterface 226 1 0
    //   806: astore 28
    //   808: aload 28
    //   810: invokeinterface 214 1 0
    //   815: ifeq +27 -> 842
    //   818: aload 27
    //   820: aload 28
    //   822: invokeinterface 218 1 0
    //   827: checkcast 228	textnow/z/k
    //   830: invokevirtual 230	textnow/z/k:b	()Ljava/lang/String;
    //   833: invokeinterface 143 2 0
    //   838: pop
    //   839: goto -31 -> 808
    //   842: aload 27
    //   844: ldc 232
    //   846: invokestatic 237	textnow/v/b:a	(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;
    //   849: astore 17
    //   851: aload_0
    //   852: aload_1
    //   853: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   856: aload 17
    //   858: invokestatic 242	textnow/ac/a:a	(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)V
    //   861: aload_1
    //   862: getfield 126	com/enflick/android/TextNow/api/responsemodel/Group:members	[Lcom/enflick/android/TextNow/api/responsemodel/Group$GroupMember;
    //   865: arraylength
    //   866: aload 7
    //   868: invokeinterface 245 1 0
    //   873: isub
    //   874: istore 18
    //   876: iconst_0
    //   877: istore 19
    //   879: iload 19
    //   881: iload 18
    //   883: if_icmpge +22 -> 905
    //   886: aload 7
    //   888: ldc 247
    //   890: invokestatic 251	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   893: invokeinterface 143 2 0
    //   898: pop
    //   899: iinc 19 1
    //   902: goto -23 -> 879
    //   905: aload 7
    //   907: ldc 253
    //   909: invokestatic 237	textnow/v/b:a	(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;
    //   912: astore 21
    //   914: new 79	java/lang/StringBuilder
    //   917: dup
    //   918: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   921: ldc 255
    //   923: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   926: aload 21
    //   928: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   931: ldc_w 257
    //   934: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   937: aload_1
    //   938: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   941: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   944: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   947: pop
    //   948: aload_1
    //   949: getfield 66	com/enflick/android/TextNow/api/responsemodel/Group:contact_value	Ljava/lang/String;
    //   952: astore 23
    //   954: new 37	android/content/ContentValues
    //   957: dup
    //   958: invokespecial 38	android/content/ContentValues:<init>	()V
    //   961: astore 24
    //   963: aload 24
    //   965: ldc_w 259
    //   968: aload 21
    //   970: invokevirtual 47	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   973: aload_0
    //   974: aload 23
    //   976: aload 24
    //   978: invokestatic 262	textnow/ac/a:a	(Landroid/content/ContentResolver;Ljava/lang/String;Landroid/content/ContentValues;)V
    //   981: aload 8
    //   983: astore 25
    //   985: goto -969 -> 16
    //   988: aconst_null
    //   989: astore 8
    //   991: goto -254 -> 737
    //   994: iconst_1
    //   995: istore_3
    //   996: goto -987 -> 9
    //
    // Exception table:
    //   from	to	target	type
    //   244	336	613	finally
    //   346	375	613	finally
    //   380	390	613	finally
    //   390	441	613	finally
    //   446	456	613	finally
    //   456	502	613	finally
    //   603	610	613	finally
    //   657	667	613	finally
    //   667	676	613	finally
    //   676	730	613	finally
    //   22	55	625	finally
    //   60	113	625	finally
    //   118	128	625	finally
    //   128	152	625	finally
    //   162	191	625	finally
    //   196	206	625	finally
    //   206	238	625	finally
    //   615	625	625	finally
    //   737	744	625	finally
    //   749	766	625	finally
    //   766	808	625	finally
    //   808	839	625	finally
    //   842	851	625	finally
    //   851	876	625	finally
    //   886	899	625	finally
    //   905	981	625	finally
    //   508	581	655	finally
    //   581	603	655	finally
    //   631	652	655	finally
  }

  private static Set<String> a(List<k> paramList)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localHashSet.add(((k)localIterator.next()).a());
    return localHashSet;
  }

  // ERROR //
  public static textnow.z.j a(ContentResolver paramContentResolver, String paramString)
  {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray 15	java/lang/String
    //   4: dup
    //   5: iconst_0
    //   6: ldc 17
    //   8: aastore
    //   9: dup
    //   10: iconst_1
    //   11: ldc 19
    //   13: aastore
    //   14: dup
    //   15: iconst_2
    //   16: ldc 68
    //   18: aastore
    //   19: astore_2
    //   20: iconst_1
    //   21: anewarray 15	java/lang/String
    //   24: dup
    //   25: iconst_0
    //   26: aload_1
    //   27: aastore
    //   28: astore_3
    //   29: aload_0
    //   30: getstatic 99	com/enflick/android/TextNow/persistence/contentproviders/f:d	Landroid/net/Uri;
    //   33: aload_2
    //   34: ldc 101
    //   36: aload_3
    //   37: aconst_null
    //   38: invokevirtual 107	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   41: astore 4
    //   43: aconst_null
    //   44: astore 5
    //   46: aload 4
    //   48: ifnull +92 -> 140
    //   51: aload 4
    //   53: invokeinterface 155 1 0
    //   58: istore 9
    //   60: aconst_null
    //   61: astore 5
    //   63: iload 9
    //   65: ifeq +68 -> 133
    //   68: new 269	textnow/z/j
    //   71: dup
    //   72: invokespecial 270	textnow/z/j:<init>	()V
    //   75: astore 10
    //   77: aload 10
    //   79: aload 4
    //   81: aload 4
    //   83: ldc 19
    //   85: invokeinterface 159 2 0
    //   90: invokeinterface 196 2 0
    //   95: invokevirtual 273	textnow/z/j:b	(Ljava/lang/String;)V
    //   98: aload 10
    //   100: aload 4
    //   102: aload 4
    //   104: ldc 68
    //   106: invokeinterface 159 2 0
    //   111: invokeinterface 196 2 0
    //   116: invokevirtual 275	textnow/z/j:a	(Ljava/lang/String;)V
    //   119: aload 10
    //   121: aload_0
    //   122: aload_1
    //   123: invokestatic 185	textnow/ac/b:b	(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/util/List;
    //   126: invokevirtual 278	textnow/z/j:a	(Ljava/util/List;)V
    //   129: aload 10
    //   131: astore 5
    //   133: aload 4
    //   135: invokeinterface 205 1 0
    //   140: aload 5
    //   142: areturn
    //   143: astore 7
    //   145: new 79	java/lang/StringBuilder
    //   148: dup
    //   149: invokespecial 80	java/lang/StringBuilder:<init>	()V
    //   152: ldc_w 280
    //   155: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: aload 7
    //   160: invokevirtual 281	java/lang/Exception:toString	()Ljava/lang/String;
    //   163: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: pop
    //   170: aload 4
    //   172: invokeinterface 205 1 0
    //   177: aload 5
    //   179: areturn
    //   180: astore 6
    //   182: aload 4
    //   184: invokeinterface 205 1 0
    //   189: aload 6
    //   191: athrow
    //   192: astore 11
    //   194: aload 10
    //   196: astore 5
    //   198: aload 11
    //   200: astore 7
    //   202: goto -57 -> 145
    //
    // Exception table:
    //   from	to	target	type
    //   51	60	143	java/lang/Exception
    //   68	77	143	java/lang/Exception
    //   51	60	180	finally
    //   68	77	180	finally
    //   77	129	180	finally
    //   145	170	180	finally
    //   77	129	192	java/lang/Exception
  }

  public static void a(ContentResolver paramContentResolver, String paramString, ContentValues paramContentValues)
  {
    paramContentResolver.update(f.d, paramContentValues, "contact_value=?", new String[] { paramString });
  }

  public static void a(ContentResolver paramContentResolver, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("contact_value", paramString1);
    localContentValues.put("member_contact_value", paramString2);
    localContentValues.put("member_contact_type", paramString3);
    localContentValues.put("member_display_name", paramString4);
    paramContentResolver.insert(e.d, localContentValues);
  }

  public static void a(ContentResolver paramContentResolver, Group[] paramArrayOfGroup)
  {
    int i = paramArrayOfGroup.length;
    for (int j = 0; j < i; j++)
      a(paramContentResolver, paramArrayOfGroup[j]);
  }

  public static List<k> b(ContentResolver paramContentResolver, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString1 = { "member_contact_value", "member_contact_type", "member_display_name" };
    String[] arrayOfString2 = { paramString };
    Cursor localCursor = paramContentResolver.query(e.d, arrayOfString1, "contact_value=?", arrayOfString2, null);
    if (localCursor != null);
    try
    {
      if (localCursor.moveToNext())
        localArrayList.add(new k(localCursor.getString(localCursor.getColumnIndex("member_contact_value")), localCursor.getInt(localCursor.getColumnIndex("member_contact_type")), localCursor.getString(localCursor.getColumnIndex("member_display_name"))));
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
    }
    return localArrayList;
  }

  public static void c(ContentResolver paramContentResolver, String paramString)
  {
    c.remove(paramString);
    int i = paramContentResolver.delete(d.d, "contact_value = ?", new String[] { paramString });
    new StringBuilder().append(i).append(" was deleted from Conversations").toString();
    int j = paramContentResolver.delete(g.d, "contact_value = ?", new String[] { paramString });
    new StringBuilder().append(j).append(" was deleted from Messages").toString();
    int k = paramContentResolver.delete(f.d, "contact_value = ?", new String[] { paramString });
    new StringBuilder().append(k).append(" was deleted from Groups").toString();
    int m = paramContentResolver.delete(e.d, "contact_value = ?", new String[] { paramString });
    new StringBuilder().append(m).append(" was deleted from GroupMembers").toString();
  }

  public static boolean d(ContentResolver paramContentResolver, String paramString)
  {
    if (c.contains(paramString))
      return true;
    String[] arrayOfString = { paramString };
    Cursor localCursor = paramContentResolver.query(f.d, a, "contact_value=?", arrayOfString, null);
    if (localCursor != null);
    while (true)
    {
      try
      {
        boolean bool2 = localCursor.moveToNext();
        if (!bool2)
          break label110;
        bool3 = true;
        localCursor.close();
        bool1 = bool3;
        if (bool1)
        {
          c.add(paramString);
          return bool1;
        }
      }
      finally
      {
        localCursor.close();
      }
      d.add(paramString);
      return bool1;
      label110: boolean bool3 = false;
      continue;
      boolean bool1 = false;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.ac.b
 * JD-Core Version:    0.6.2
 */