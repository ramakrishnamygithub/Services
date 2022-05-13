package com.saxprocessing.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class GetCountHandler extends DefaultHandler {
    private int count;
	@Override
	public void startDocument() throws SAXException {
		count=0;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		if(qName.equalsIgnoreCase("food")) {
			count++;
		}
	}
	public void getCount() {
		System.out.println("No of Breakfast Menu Count is "+count);
	}

}
