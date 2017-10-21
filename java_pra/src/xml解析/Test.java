package xml解析;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test {
	
	/**
	 * DOM解析
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	@org.junit.Test
	public void testDomParse() throws ParserConfigurationException, SAXException, IOException{
//		1. 获取documentBuilderFactory
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		
//		2. 获取documentBuilder
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		
//		3. 加载要解析的文档
		Document document = documentBuilder.parse("src/xml解析/library.xml");
		
		
//		4. 开始解析
//		获取根节点
		Element elem = document.getDocumentElement();
		
		if(elem != null){
			NodeList books = elem.getElementsByTagName("books");
			
			for(int i = 0; i < books.getLength(); i++){
				Node node = books.item(i);
				
				if(node != null){
					NodeList bookList = node.getChildNodes();
					for(int j = 0; j<bookList.getLength(); j++){
						Node bookNode = bookList.item(j);
						if(bookNode.getNodeName().equals("book")){
							NodeList bookDetailNodes = bookNode.getChildNodes();
							for(int k = 0; k < bookDetailNodes.getLength(); k++){
								Node bookDetailNode = bookDetailNodes.item(k);
								if(!bookDetailNode.getNodeName().equals("#text"))
								System.out.println(bookDetailNode.getNodeName()+"  "+bookDetailNode.getTextContent());
							}
						}
					}
				}
			}
		}
	}
}
