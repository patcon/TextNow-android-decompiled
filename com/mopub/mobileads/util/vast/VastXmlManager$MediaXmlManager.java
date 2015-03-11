package com.mopub.mobileads.util.vast;

import org.w3c.dom.Node;

class VastXmlManager$MediaXmlManager
{
  private static final String DELIVERY = "delivery";
  private static final String VIDEO_TYPE = "type";
  private final Node mMediaNode;

  VastXmlManager$MediaXmlManager(VastXmlManager paramVastXmlManager, Node paramNode)
  {
    if (paramNode == null)
      throw new IllegalArgumentException("Media node cannot be null");
    this.mMediaNode = paramNode;
  }

  String getDelivery()
  {
    return XmlUtils.getAttributeValue(this.mMediaNode, "delivery");
  }

  Integer getHeight()
  {
    return XmlUtils.getAttributeValueAsInt(this.mMediaNode, "height");
  }

  String getMediaUrl()
  {
    return XmlUtils.getNodeValue(this.mMediaNode);
  }

  String getType()
  {
    return XmlUtils.getAttributeValue(this.mMediaNode, "type");
  }

  Integer getWidth()
  {
    return XmlUtils.getAttributeValueAsInt(this.mMediaNode, "width");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.vast.VastXmlManager.MediaXmlManager
 * JD-Core Version:    0.6.2
 */