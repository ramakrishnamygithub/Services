package com.saxprocessing.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PrintHandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Start Document");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("End Documents");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String s=new String(ch,start,length);
		System.out.print(s);
	}

}
