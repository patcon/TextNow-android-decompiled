package com.mopub.mobileads.util.vast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

class VastXmlManager$ImageCompanionAdXmlManager
{
  private static final String COMPANION_CLICK_THROUGH = "CompanionClickThrough";
  private static final String COMPANION_STATIC_RESOURCE = "StaticResource";
  private static final String CREATIVE_TYPE = "creativeType";
  private static final String CREATIVE_VIEW = "creativeView";
  private static final String TRACKING_EVENTS = "TrackingEvents";
  private final Node mCompanionNode;

  VastXmlManager$ImageCompanionAdXmlManager(VastXmlManager paramVastXmlManager, Node paramNode)
  {
    if (paramNode == null)
      throw new IllegalArgumentException("Companion node cannot be null");
    this.mCompanionNode = paramNode;
  }

  String getClickThroughUrl()
  {
    return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(this.mCompanionNode, "CompanionClickThrough"));
  }

  List<String> getClickTrackers()
  {
    ArrayList localArrayList = new ArrayList();
    Node localNode1 = XmlUtils.getFirstMatchingChildNode(this.mCompanionNode, "TrackingEvents");
    if (localNode1 == null)
      return localArrayList;
    Iterator localIterator = XmlUtils.getMatchingChildNodes(localNode1, "Tracking", "event", Arrays.asList(new String[] { "creativeView" })).iterator();
    while (localIterator.hasNext())
    {
      Node localNode2 = (Node)localIterator.next();
      if (localNode2.getFirstChild() != null)
        localArrayList.add(localNode2.getFirstChild().getNodeValue().trim());
    }
    return localArrayList;
  }

  Integer getHeight()
  {
    return XmlUtils.getAttributeValueAsInt(this.mCompanionNode, "height");
  }

  String getImageUrl()
  {
    return XmlUtils.getNodeValue(XmlUtils.getFirstMatchingChildNode(this.mCompanionNode, "StaticResource"));
  }

  String getType()
  {
    return XmlUtils.getAttributeValue(XmlUtils.getFirstMatchingChildNode(this.mCompanionNode, "StaticResource"), "creativeType");
  }

  Integer getWidth()
  {
    return XmlUtils.getAttributeValueAsInt(this.mCompanionNode, "width");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.vast.VastXmlManager.ImageCompanionAdXmlManager
 * JD-Core Version:    0.6.2
 */