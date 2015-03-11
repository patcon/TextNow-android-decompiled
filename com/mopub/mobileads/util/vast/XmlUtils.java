package com.mopub.mobileads.util.vast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class XmlUtils
{
  static String getAttributeValue(Node paramNode, String paramString)
  {
    if ((paramNode == null) || (paramString == null));
    Node localNode;
    do
    {
      return null;
      localNode = paramNode.getAttributes().getNamedItem(paramString);
    }
    while (localNode == null);
    return localNode.getNodeValue();
  }

  static Integer getAttributeValueAsInt(Node paramNode, String paramString)
  {
    if ((paramNode == null) || (paramString == null))
      return null;
    try
    {
      Integer localInteger = Integer.valueOf(Integer.parseInt(getAttributeValue(paramNode, paramString)));
      return localInteger;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return null;
  }

  static Node getFirstMatchingChildNode(Node paramNode, String paramString)
  {
    return getFirstMatchingChildNode(paramNode, paramString, null, null);
  }

  static Node getFirstMatchingChildNode(Node paramNode, String paramString1, String paramString2, List<String> paramList)
  {
    if ((paramNode == null) || (paramString1 == null));
    List localList;
    do
    {
      return null;
      localList = getMatchingChildNodes(paramNode, paramString1, paramString2, paramList);
    }
    while ((localList == null) || (localList.isEmpty()));
    return (Node)localList.get(0);
  }

  static List<Node> getMatchingChildNodes(Node paramNode, String paramString1, String paramString2, List<String> paramList)
  {
    if ((paramNode == null) || (paramString1 == null))
      return null;
    ArrayList localArrayList = new ArrayList();
    NodeList localNodeList = paramNode.getChildNodes();
    for (int i = 0; i < localNodeList.getLength(); i++)
    {
      Node localNode = localNodeList.item(i);
      if ((localNode.getNodeName().equals(paramString1)) && (nodeMatchesAttributeFilter(localNode, paramString2, paramList)))
        localArrayList.add(localNode);
    }
    return localArrayList;
  }

  static String getNodeValue(Node paramNode)
  {
    if ((paramNode != null) && (paramNode.getFirstChild() != null) && (paramNode.getFirstChild().getNodeValue() != null))
      return paramNode.getFirstChild().getNodeValue().trim();
    return null;
  }

  static List<String> getStringDataAsList(Document paramDocument, String paramString)
  {
    return getStringDataAsList(paramDocument, paramString, null, null);
  }

  static List<String> getStringDataAsList(Document paramDocument, String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramDocument == null)
      return localArrayList;
    NodeList localNodeList = paramDocument.getElementsByTagName(paramString1);
    if (localNodeList == null)
      return localArrayList;
    for (int i = 0; i < localNodeList.getLength(); i++)
    {
      Node localNode = localNodeList.item(i);
      if (localNode != null)
        if (nodeMatchesAttributeFilter(localNode, paramString2, Arrays.asList(new String[] { paramString3 })))
        {
          String str = getNodeValue(localNode);
          if (str != null)
            localArrayList.add(str);
        }
    }
    return localArrayList;
  }

  static boolean nodeMatchesAttributeFilter(Node paramNode, String paramString, List<String> paramList)
  {
    if ((paramString == null) || (paramList == null));
    Node localNode;
    do
    {
      return true;
      NamedNodeMap localNamedNodeMap = paramNode.getAttributes();
      if (localNamedNodeMap == null)
        break;
      localNode = localNamedNodeMap.getNamedItem(paramString);
    }
    while ((localNode != null) && (paramList.contains(localNode.getNodeValue())));
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.vast.XmlUtils
 * JD-Core Version:    0.6.2
 */