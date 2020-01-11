package com.XMLDemo;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class DOMStudent {
	public static void main(String args[]) throws Exception {
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		DocumentBuilder b = f.newDocumentBuilder();
		Document doc = b.newDocument();

		Element rootele = doc.createElement("students");
		Element studentele = doc.createElement("student");
		Element empidele = doc.createElement("Emp_id");
		Element nameele = doc.createElement("name");
		Element deptele = doc.createElement("Dept");

		Text t1 = doc.createTextNode("12345");
		Text t2 = doc.createTextNode("saurabh");
		Text t3 = doc.createTextNode("non");

		empidele.appendChild(t1);
		nameele.appendChild(t2);
		deptele.appendChild(t3);

		studentele.appendChild(empidele);
		studentele.appendChild(nameele);
		studentele.appendChild(deptele);

		rootele.appendChild(studentele);
		doc.appendChild(rootele);
		Transformer t = TransformerFactory.newInstance().newTransformer();
		t.transform(new DOMSource(doc),
				new StreamResult(new FileOutputStream("D:/Java/Edureka/New folder/StudentAssignment.xml")));
		System.out.println("XML file generated..");

	}
}
