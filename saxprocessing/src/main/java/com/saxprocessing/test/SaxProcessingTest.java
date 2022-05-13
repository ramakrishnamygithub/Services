package com.saxprocessing.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.saxprocessing.handler.GetCountHandler;
import com.saxprocessing.handler.PrintHandler;

public class SaxProcessingTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
      SAXParserFactory factory=SAXParserFactory.newNSInstance();
      SAXParser parser=factory.newSAXParser();
      //PrintHandler handler=new PrintHandler();
      //parser.parse(new File("F:\\spring\\Services\\saxprocessing\\src\\main\\resources\\breakfast.xml"),handler);
      
      
      GetCountHandler countHandler=new GetCountHandler();
      parser.parse(new File("F:\\spring\\Services\\saxprocessing\\src\\main\\resources\\breakfast.xml"),countHandler);
      countHandler.getCount();
      
	}

}
