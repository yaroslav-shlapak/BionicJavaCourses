package com.bionic.javase.week7;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMLDemo {

	public static void main(String[] args) throws Exception {
		TransformerFactory factory = TransformerFactory.newInstance();
		Source xsl = new StreamSource("stylesheet.xsl");
		Transformer transformer = factory.newTransformer(xsl);
		Source xml = new StreamSource("firstXML.xml");
		Result result = new StreamResult("out.html");
		transformer.transform(xml, result);

	}

}
