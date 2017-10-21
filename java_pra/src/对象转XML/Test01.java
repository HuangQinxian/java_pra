package 对象转XML;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;

public class Test01 {
	
	@Test
	public void testObjectToXml() throws JAXBException{
		Book book = new Book();
		book.setBookId(1);
		book.setBookName("java");
		objectToXml(book);
	}
	
	@Test
	public void testObjectWithCollectionToXml() throws JAXBException{
		Librarys librarys = new Librarys();
		librarys.setLibraryId(1);
		librarys.setLibraryName("图书馆");
		
		List<Book> list = new ArrayList<Book>();
		
		Book b1 = new Book();
		b1.setBookId(100);
		b1.setBookName("java1");
		
		Book b2 = new Book();
		b2.setBookId(101);
		b2.setBookName("java2");
		
		list.add(b1);
		list.add(b2);

		librarys.setBooks(list);
		
		objectToXml(librarys);
		
		
		
	}
	
	/**
	 * 对象转为XML的算法
	 * @param obj
	 * @throws JAXBException
	 */
	public void objectToXml(Object obj) throws JAXBException{
		JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
		Marshaller marshaller = jaxbContext.createMarshaller();
		StringWriter writer = new StringWriter();
		marshaller.marshal(obj,writer);
		System.out.println(writer);
	}
	
}
