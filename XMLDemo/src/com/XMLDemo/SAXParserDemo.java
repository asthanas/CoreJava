package com.XMLDemo;

import java.io.FileInputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserDemo extends DefaultHandler{
	public void startDocument() {
		System.out.println("Document begins here");
	}
	
	public void startElement(String studentid, String name, String std, String gender, String marks, String address) {
		System.out.println("<" +name+ ">");
	}
	
	public void characters(char ch[], int start, int len) {
		System.out.println(new String(ch, start, len));
	}
	
	public void endElement(String studentid, String name, String std, String gender, String marks, String address) {
		System.out.println("<" +name+ ">");
	}
	public static void main(String[] args) throws Exception {
		 SAXParser p=SAXParserFactory.newInstance().newSAXParser();
		 p.parse(new FileInputStream("D:/Java/Edureka/New folder/Student.xml"), new SAXParserDemo());
	}

}
