package com.mkyong;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {

   boolean agency = false;
   boolean headline = false;
   boolean date = false;
   boolean city = false;

   @Override
   public void startElement(String uri, 
   String localName, String qName, Attributes attributes)
      throws SAXException {
      if (qName.equalsIgnoreCase("row")) {
         String rowNo = attributes.getValue("_id");
         System.out.println("row No : " + rowNo);
      } else if (qName.equalsIgnoreCase("agency")) {
         agency = true;
      } else if (qName.equalsIgnoreCase("headline")) {
         headline = true;
      } else if (qName.equalsIgnoreCase("publish_date")) {
         date = true;
      }
      else if (qName.equalsIgnoreCase("city")) {
         city = true;
      }
   }

   @Override
   public void endElement(String uri, 
   String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("row")) {
         System.out.println("End Element :" + qName);
      }
   }

   @Override
   public void characters(char ch[], 
      int start, int length) throws SAXException {
      if (agency) {
         System.out.println("agency: " 
            + new String(ch, start, length));
         agency = false;
      } else if (headline) {
         System.out.println("headline: " 
            + new String(ch, start, length));
         headline = false;
      } else if (date) {
         System.out.println("date: " 
            + new String(ch, start, length));
         date = false;
      } else if (city) {
         System.out.println("city: " 
            + new String(ch, start, length));
         city = false;
      }
   }
}
