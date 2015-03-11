package com.mopub.mobileads.util.vast;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

class VastXmlManager
{
  private static final String CLICK_THROUGH = "ClickThrough";
  private static final String CLICK_TRACKER = "ClickTracking";
  private static final String COMPANION = "Companion";
  private static final String COMPLETE = "complete";
  private static final String EVENT = "event";
  private static final String FIRST_QUARTILE = "firstQuartile";
  private static final String HEIGHT = "height";
  private static final String IMPRESSION_TRACKER = "Impression";
  private static final String MEDIA_FILE = "MediaFile";
  private static final String MIDPOINT = "midpoint";
  private static final String MP_IMPRESSION_TRACKER = "MP_TRACKING_URL";
  private static final String ROOT_TAG = "MPMoVideoXMLDocRoot";
  private static final String ROOT_TAG_CLOSE = "</MPMoVideoXMLDocRoot>";
  private static final String ROOT_TAG_OPEN = "<MPMoVideoXMLDocRoot>";
  private static final String START = "start";
  private static final String THIRD_QUARTILE = "thirdQuartile";
  private static final String VAST_AD_TAG = "VASTAdTagURI";
  private static final String VIDEO_TRACKER = "Tracking";
  private static final String WIDTH = "width";
  private Document mVastDoc;

  private List<String> getVideoTrackerByAttribute(String paramString)
  {
    return XmlUtils.getStringDataAsList(this.mVastDoc, "Tracking", "event", paramString);
  }

  String getClickThroughUrl()
  {
    List localList = XmlUtils.getStringDataAsList(this.mVastDoc, "ClickThrough");
    if (localList.size() > 0)
      return (String)localList.get(0);
    return null;
  }

  List<String> getClickTrackers()
  {
    return XmlUtils.getStringDataAsList(this.mVastDoc, "ClickTracking");
  }

  List<VastXmlManager.ImageCompanionAdXmlManager> getCompanionAdXmlManagers()
  {
    NodeList localNodeList = this.mVastDoc.getElementsByTagName("Companion");
    ArrayList localArrayList = new ArrayList(localNodeList.getLength());
    for (int i = 0; i < localNodeList.getLength(); i++)
      localArrayList.add(new VastXmlManager.ImageCompanionAdXmlManager(this, localNodeList.item(i)));
    return localArrayList;
  }

  List<String> getImpressionTrackers()
  {
    List localList = XmlUtils.getStringDataAsList(this.mVastDoc, "Impression");
    localList.addAll(XmlUtils.getStringDataAsList(this.mVastDoc, "MP_TRACKING_URL"));
    return localList;
  }

  String getMediaFileUrl()
  {
    List localList = XmlUtils.getStringDataAsList(this.mVastDoc, "MediaFile");
    if (localList.size() > 0)
      return (String)localList.get(0);
    return null;
  }

  List<VastXmlManager.MediaXmlManager> getMediaXmlManagers()
  {
    NodeList localNodeList = this.mVastDoc.getElementsByTagName("MediaFile");
    ArrayList localArrayList = new ArrayList(localNodeList.getLength());
    for (int i = 0; i < localNodeList.getLength(); i++)
      localArrayList.add(new VastXmlManager.MediaXmlManager(this, localNodeList.item(i)));
    return localArrayList;
  }

  String getVastAdTagURI()
  {
    List localList = XmlUtils.getStringDataAsList(this.mVastDoc, "VASTAdTagURI");
    if (localList.size() > 0)
      return (String)localList.get(0);
    return null;
  }

  List<String> getVideoCompleteTrackers()
  {
    return getVideoTrackerByAttribute("complete");
  }

  List<String> getVideoFirstQuartileTrackers()
  {
    return getVideoTrackerByAttribute("firstQuartile");
  }

  List<String> getVideoMidpointTrackers()
  {
    return getVideoTrackerByAttribute("midpoint");
  }

  List<String> getVideoStartTrackers()
  {
    return getVideoTrackerByAttribute("start");
  }

  List<String> getVideoThirdQuartileTrackers()
  {
    return getVideoTrackerByAttribute("thirdQuartile");
  }

  void parseVastXml(String paramString)
  {
    String str1 = paramString.replaceFirst("<\\?.*\\?>", "");
    String str2 = "<MPMoVideoXMLDocRoot>" + str1 + "</MPMoVideoXMLDocRoot>";
    DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
    localDocumentBuilderFactory.setCoalescing(true);
    this.mVastDoc = localDocumentBuilderFactory.newDocumentBuilder().parse(new InputSource(new StringReader(str2)));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.vast.VastXmlManager
 * JD-Core Version:    0.6.2
 */